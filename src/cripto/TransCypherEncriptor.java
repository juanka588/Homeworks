/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

public class TransCypherEncriptor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("bad arguments number");
            System.out.println("usage message filler char");
            return;
        }
        String message = args[0];
        String fillString = args[1];
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
        char[][] mat = new char[size][size];
        int[][] key = getRandomKey(size);
        int blockSize = size * size / 4;
        for (int i = 0; i < 4; i++) {
            fillMatrix(message.substring(i * blockSize, blockSize + i * blockSize), key, mat);
            rotateMatrix(mat);
        }

    }

    /**
     *
     * @param size numbers of rows in a square matrix
     * @return the couple order row, column of the used position for the key
     */
    private static int[][] getRandomKey(int size) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param mat matrix to be rotated 90 degrees to the right
     */
    private static void rotateMatrix(char[][] mat) {
        rotateByNinetyToRight(mat);
    }

    public static void rotateByNinetyToRight(char[][] m) {
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

    private static void fillMatrix(String block, int[][] key, char[][] mat) {
        if (block.length() != key.length) {
            throw new IllegalStateException("bad block or key differents sizes \nblock "
                    + block + " s: " + block.length() + " key size: " + key.length);
        }
        for (int i = 0; i < key.length; i++) {
            mat[key[i][0]][key[i][1]] = block.charAt(i);
        }
    }

}

