/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TransCypherEncriptor {

    private static List<Coordinate> key = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*if (args.length != 2) {
         System.out.println("bad arguments number");
         System.out.println("usage message filler_char");
         return;
         }*/
        String message = "unapruebagrande";//args[0];
        String fillString = "X";//args[1];
        char[][] mat = encodeMessage(message, fillString);
        showMatrix(mat);
        System.out.println("encoding finish");
        String original = decodeMessage(mat, key, fillString);
        System.out.println("decoded message: " + original);

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

        return posMap;
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
    }

    private static char[][] encodeMessage(String message, String fillString) {
        int size = (int) Math.sqrt(message.length());
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
        char[][] mat = new char[size][size];
        int blockSize = size * size / 4;
        System.out.println("block size " + blockSize);
        key = new ArrayList<>();//getRandomKey(size);
        key.removeAll(key);
        key.add(new Coordinate(size - 1, 0));
        key.add(new Coordinate(size - 2, 0));
        key.add(new Coordinate(size - 1, 1));
        key.add(new Coordinate(size - 2, 1));
        Collections.sort(key);
        for (Coordinate c : key) {
            System.out.println(c);
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            fillMatrix(message.substring(i * blockSize, blockSize + i * blockSize), key, mat);
            rotateMatrix(mat);
        }
        return mat;
    }

    private static String decodeMessage(char[][] mat, List<Coordinate> key, String fillString) {
        List<String> message = new ArrayList<>();
        StringBuilder original = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            rotateByNinetyToRight(mat);
            message.add(0,clearMatrix(key, mat));
        }
        for (String m : message) {
            original.append(m);
        }
        return original.toString().replaceAll(fillString, "");
    }

}
