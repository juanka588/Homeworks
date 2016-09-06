/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TransCypherEncriptor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fillString;
        char[][] mat;
        List<Coordinate> key;
        if (args.length < 3) {
            System.out.println("bad number of arguments");
            System.out.println("usage -en message fillString");
            System.out.println("usage -de matMessageFile keyFile fillerString");
            return;
        }
        if ("-en".equals(args[0])) {
            String message = args[1];
            fillString = args[2];
            if (message.contains(fillString)) {
                System.out.println("the message can not contain the fill string");
                return;
            }
            mat = encodeMessage(message, fillString);
            System.out.println("encoding finish");
        } else if ("-de".equals(args[0])) {
            BufferedReader in = new BufferedReader(new FileReader(args[1]));
            String line;
            String[] cols;
            List<String[]> rows = new ArrayList<>();
            while ((line = in.readLine()) != null) {
                cols = line.split("\\s");
                rows.add(cols);
            }
            mat = transform(rows);
            in = new BufferedReader(new FileReader(args[2]));
            fillString = args[3];
            key = new ArrayList<>();
            while ((line = in.readLine()) != null) {
                cols = line.split("\\s");
                key.add(new Coordinate(Integer.parseInt(cols[0]),
                        Integer.parseInt(cols[1])));
            }
            Collections.sort(key);
            String original = decodeMessage(mat, key, fillString);
            System.out.println("decoded message: " + original);
        } else {
            System.out.println("usage -en message fillString");
            System.out.println("usage -de matMessageFile keyFile fillerString");
        }
    }

    /**
     *
     * @param size numbers of rows in a square matrix
     * @return the couple order row, column of the used position for the key
     */
    private static List<Coordinate> getRandomKey(int size) {
        Map<Integer, List<Coordinate>> posibilities = fillPosibilities(size * size / 4, size);
        List<Coordinate> key = new ArrayList<>();
        for (Entry e : posibilities.entrySet()) {
            key.add(getRandomElement((List<Coordinate>) e.getValue()));
        }
        Collections.sort(key);
        return key;
    }

    /**
     *
     * @param mat matrix to be rotated 90 degrees to the right
     */
    private static void rotateMatrix(char[][] mat) {
        rotateByNinetyToLeft(mat);
    }
    
    public static void rotateByNinetyToLeft(char[][] m) {
        int e = m.length - 1;
        int c = e / 2;
        int b = e % 2;
        for (int r = c; r >= 0; r--) {
            for (int d = c - r; d < c + r + b; d++) {
                char t = m[c - r][d];
                m[c - r][d] = m[d][e - c + r];
                m[d][e - c + r] = m[e - c + r][e - d];
                m[e - c + r][e - d] = m[e - d][c - r];
                m[e - d][c - r] = t;
            }
        }
    }
    
    public static void rotateByNinetyToRight(char[][] m) {
        int n = m.length;
        int x1, y1, x2, y2, x3, y3, x4, y4;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                x1 = i;
                y1 = j;
                x2 = j;
                y2 = n - i - 1;
                x3 = n - i - 1;
                y3 = n - j - 1;
                x4 = y3;
                y4 = i;
                temp = m[x1][y1];
                m[x1][y1] = m[x4][y4];
                m[x4][y4] = m[x3][y3];
                m[x3][y3] = m[x2][y2];
                m[x2][y2] = temp;
            }
        }
    }
    
    private static void fillMatrix(String block, List<Coordinate> key, char[][] mat) {
        if (block.length() != key.size()) {
            throw new IllegalStateException("bad block or key differents sizes \nblock "
                    + block + " s: " + block.length() + " key size: " + key.size());
        }
        for (int i = 0; i < key.size(); i++) {
            mat[key.get(i).getX()][key.get(i).getY()] = block.charAt(i);
        }
    }
    
    private static String clearMatrix(List<Coordinate> key, char[][] mat) {
        StringBuilder fragment = new StringBuilder();
        for (int i = 0; i < key.size(); i++) {
            fragment.append(mat[key.get(i).getX()][key.get(i).getY()]);
        }
        return fragment.toString();
    }
    
    private static Map<Integer, List<Coordinate>> fillPosibilities(int blockSize, int n) {
        Map<Integer, List<Coordinate>> posMap = new HashMap<>();
        for (int i = 0; i < blockSize; i++) {
            posMap.put(i, new ArrayList<>());
        }
        char[][] mat = initMat(n);
        generatePossibleKeys(posMap, n);
        return posMap;
    }
    
    private static void generatePossibleKeys(Map<Integer, List<Coordinate>> posMap, int n) {
        int t = 0;
        List<Coordinate> tempList;
        for (int k = 0; k < n / 2; k++) {
            for (int i = 0; i < n - (2 * k) - 1; i++) {
                tempList = posMap.get(t);
                tempList.add(new Coordinate(k, i + k));//mat[k][i + k] = (char) t;
                tempList.add(new Coordinate(i + k, n - k - 1));// mat[i + k][n - k - 1] = (char) t;
                tempList.add(new Coordinate(n - k - 1, n - (i + k) - 1));// mat[n - k - 1][n - (i + k) - 1] = (char) t;
                tempList.add(new Coordinate(n - (i + k) - 1, k));//mat[n - (i + k) - 1][k] = (char) t;
                posMap.put(t, tempList);
                t++;
            }
        }
    }
    
    private static Coordinate getRandomElement(List<Coordinate> list) {
        int pos = (int) (Math.random() * list.size());
        return list.get(pos);
    }
    
    private static void showMatrix(char[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    private static char[][] encodeMessage(String message, String fillString) {
        int size = (int) Math.ceil(Math.sqrt(message.length()));
        System.out.println("size " + size);
        if (size % 2 != 0) {
            size += 1;
            System.out.println("fixed size  " + size);
        }
        while (message.length() < size * size) {
            //fill the message
            message += fillString;
            
        }
        System.out.println("new message " + message);
        char[][] mat = initMat(size);
        
        int blockSize = size * size / 4;
        System.out.println("block size " + blockSize);
        List<Coordinate> key = getRandomKey(size);
        System.out.println("key");
        for (Coordinate c : key) {
            System.out.println(c);
        }
        System.out.println("");
        System.out.println("pseudo key");
        fillMatrix(message.substring(0 * blockSize, blockSize + 0 * blockSize), key, mat);
        showMatrix(mat);
        System.out.println("fill and rotate");
        rotateMatrix(mat);
        showMatrix(mat);
        for (int i = 1; i < 4; i++) {
            fillMatrix(message.substring(i * blockSize, blockSize + i * blockSize), key, mat);
            rotateMatrix(mat);
            System.out.println("fill and rotate");
            showMatrix(mat);
        }
        return mat;
    }
    
    private static String decodeMessage(char[][] mat, List<Coordinate> key, String fillString) {
        List<String> message = new ArrayList<>();
        StringBuilder original = new StringBuilder();
        String clearMatrix;
        for (int i = 0; i < 4; i++) {
            rotateByNinetyToRight(mat);
            System.out.println("get and rotate");
            clearMatrix = clearMatrix(key, mat);
            message.add(0, clearMatrix);
            System.out.println("obtained value: " + clearMatrix);
        }
        for (String m : message) {
            original.append(m);
        }
        return original.toString().replaceAll(fillString, "");
    }
    
    private static char[][] initMat(int size) {
        char[][] mat = new char[size][size];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = '-';
            }
        }
        return mat;
    }
    
    private static char[][] transform(List<String[]> rows) {
        char[][] mat = new char[rows.size()][rows.size()];
        int i = 0;
        for (String[] row : rows) {
            for (int j = 0; j < row.length; j++) {
                mat[i][j] = row[j].charAt(0);
            }
            i++;
        }
        return mat;
    }
    
}
