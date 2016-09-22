/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author JuanCamilo
 */
public class AES {

    private static final int BLOCK_SIZE = 4;
    private static final int KEY_BLOCK_SIZE = 4;
    private static final int ROUNDS = KEY_BLOCK_SIZE + 6;

    private static final String[][] MIX_COLUMN_MATRIX = new String[][]{{"02", "03", "01", "01"},
    {"01", "02", "03", "01"},
    {"01", "01", "02", "03"},
    {"03", "01", "01", "02"},};
    private static final String[][] MIX_COLUMN_MATRIX_INV = new String[][]{{"02", "03", "01", "01"},
    {"0e", "0b", "0d", "09"},
    {"09", "0e", "0b", "0d"},
    {"0b", "0d", "09", "0e"},};
    private static final String[] Rcon = new String[]{
        "01", "02", "04", "08", "10",
        "20", "40", "80", "1B", "36",};

    public static void main(String[] args) throws UnsupportedEncodingException {
        String message = "AES es muy facil";
        String key = "5781146089937595";
        String cypher = encode(message, key);
        System.out.println("cypher: " + cypher);
        String getback = decode(cypher, key);
        System.out.println("decoded: " + getback);
    }

    private static String encode(String message, String key) throws UnsupportedEncodingException {
        String mHex = Utils.stringToHex(message);
        System.out.println(mHex);
        String kHex = "2b7e151628aed2a6abf7158809cf4f3c";//Utils.stringToHex(key);
        System.out.println(kHex);
        List<String> kSplit = Utils.splitString(kHex, 8);
        String[][] matKey = toMatrix(kSplit);
        matKey = Utils.transpose(matKey);
        System.out.println("key");
        printMat(matKey);
        List<String[][]> keys = generateKeys(matKey);
        List<String> blocks = Utils.splitString(mHex, 2 * BLOCK_SIZE * BLOCK_SIZE);
        String[][] pResult = null;
        for (String block : blocks) {
            List<String> mSplit = Utils.splitString(block, 8);
            String[][] state = toMatrix(mSplit);
            System.out.println("state");
            printMat(state);
            state = Utils.transpose(state);
            System.out.println("state'");
            printMat(state);
            pResult = process(state, keys);
        }
        return Utils.hexToString(toString(Utils.transpose(pResult)));
    }

    private static String decode(String cypher, String key) throws UnsupportedEncodingException {
        String mHex = Utils.stringToHex(cypher);
        System.out.println(mHex);
        String kHex = Utils.stringToHex(key);;
        System.out.println(kHex);
        List<String> kSplit = Utils.splitString(kHex, 8);
        String[][] matKey = toMatrix(kSplit);
        matKey = Utils.transpose(matKey);
        System.out.println("key");
        printMat(matKey);
        List<String[][]> keys = generateKeys(matKey);
        List<String> blocks = Utils.splitString(mHex, 2 * BLOCK_SIZE * BLOCK_SIZE);
        String[][] pResult = null;
        for (String block : blocks) {
            List<String> mSplit = Utils.splitString(block, 8);
            String[][] state = toMatrix(mSplit);
            System.out.println("state");
            printMat(state);
            state = Utils.transpose(state);
            System.out.println("state'");
            printMat(state);
            pResult = decodeProcess(state, keys);
        }
        return Utils.hexToString(toString(Utils.transpose(pResult)));
    }

    private static String[][] addRoundKey(String[][] message, String[][] key) {
        String[][] result = new String[BLOCK_SIZE][BLOCK_SIZE];
        for (int i = 0; i < message.length; i++) {
            result[i] = rowXOR(message[i], key[i]);
        }
        return result;
    }

    private static String[][] mixColumns(String[][] state) {
        String[][] result = Utils.transpose(state);
        for (int i = 0; i < result.length; i++) {
            result[i] = multiply(result[i], MIX_COLUMN_MATRIX);
        }
        return Utils.transpose(result);
    }

    private static String[][] mixColumnsINV(String[][] state) {
        String[][] result = Utils.transpose(state);
        for (String[] column : result) {
            column = multiply(column, MIX_COLUMN_MATRIX_INV);
        }
        return Utils.transpose(result);
    }

    private static String[] multiply(String[] column, String[][] mat) {
        String[] result = new String[column.length];
        String mult;
        String sum = "00";
        int k = 0;
        for (String[] row : mat) {
            for (int i = 0; i < column.length; i++) {
                mult = multiplyHEX(column[i], row[i]);
                sum = Utils.hexXOR(sum, mult);
            }
            result[k] = sum;
            sum = "00";
            k++;
        }
        return result;
    }

    private static String[][] toMatrix(List<String> mSplit) {
        String[] split = new String[mSplit.get(0).length() / 2];
        Utils.splitString(mSplit.get(0), 2).toArray(split);
        String[][] mat = new String[mSplit.size()][split.length];
        mat[0] = split;
        for (int i = 1; i < mSplit.size(); i++) {
            split = new String[mSplit.get(0).length() / 2];
            Utils.splitString(mSplit.get(i), 2).toArray(split);
            mat[i] = split;
        }
        return mat;
    }

    private static void printMat(String[][] state) {
        for (int i = 0; i < state.length; i++) {
            System.out.println(Arrays.toString(state[i]));
        }
    }

    private static String[] rowXOR(String[] message, String[] key) {
        String result[] = new String[message.length];
        for (int i = 0; i < message.length; i++) {
            result[i] = Utils.hexXOR(message[i], key[i]);
        }
        return result;
    }

    private static String[][] subBytesTrans(String[][] mat) {
        String[][] response = new String[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            response[i] = subBytesTrans(mat[i]);
        }
        return response;
    }

    private static String[] subBytesTrans(String[] row) {
        String[] response = new String[row.length];
        for (int i = 0; i < row.length; i++) {
            response[i] = Permutations.applySB(row[i]);
        }
        return response;
    }

    private static String[][] subBytesTransINV(String[][] mat) {
        String[][] response = new String[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                response[i][j] = Permutations.applySBInv(mat[i][j]);
            }
        }
        return response;
    }

    private static List<String[][]> generateKeys(String[][] matKey) {
        List<String[][]> keys = new ArrayList<>();
        keys.add(matKey);
        String[][] temp = Utils.transpose(matKey);
        String[][] newKey;
        String[] current, prevLess4, rotWord, subWord;
        for (int i = 0; i < 10; i++) {
            newKey = new String[temp.length][temp.length];
            for (int j = 0; j < 4; j++) {
                current = temp[temp.length - 1 - j];
                prevLess4 = temp[temp.length + j - 4];
                if (j > 0) {
                    current = newKey[j - 1];
                } else {
                    rotWord = Utils.leftShiftRow(current, 1);
                    subWord = subBytesTrans(rotWord);
                    current = subWord;
                    current[0] = Utils.hexXOR(subWord[0], Rcon[i]);
                }
                newKey[j] = rowXOR(current, prevLess4);
            }
            keys.add(Utils.transpose(newKey));
            temp = newKey;
        }
        return keys;
    }

    private static String toString(String[][] mat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sb.append(mat[i][j]);
            }
        }
        return sb.toString();
    }

    private static String[][] process(String[][] state, List<String[][]> keys) {
        String[][] result = addRoundKey(state, keys.get(0));
        for (int i = 1; i < ROUNDS; i++) {
            result = subBytesTrans(result);
            result = Utils.leftShiftRows(result);
            result = mixColumns(result);
            result = addRoundKey(result, keys.get(i));
        }
        result = subBytesTrans(result);
        result = Utils.leftShiftRows(result);
        result = addRoundKey(result, keys.get(keys.size() - 1));
        return result;
    }

    private static String[][] decodeProcess(String[][] state, List<String[][]> keys) {
        String[][] result = addRoundKey(state, keys.get(ROUNDS));
        result = subBytesTransINV(result);
        result = Utils.rightShiftRows(result);
        for (int i = ROUNDS - 1; i >= 1; i--) {
            result = addRoundKey(result, keys.get(i));
            result = mixColumnsINV(result);
            result = subBytesTransINV(result);
            result = Utils.rightShiftRows(result);
        }
        result = addRoundKey(result, keys.get(0));
        return result;
    }

    private static String multiplyHEX(String hex1, String hex2) {
        String tHex1 = Permutations.applyGaloisL(hex1);
        String tHex2 = Permutations.applyGaloisL(hex2);
        int val1, val2;
        val1 = Integer.parseInt(tHex1, 16);
        val2 = Integer.parseInt(tHex2, 16);
        int sum = (val1 + val2) % 255;
        String result = Integer.toHexString(sum);
        if (result.length() == 1) {
            result = "0" + result;
        }
        return Permutations.applyGaloisE(result);
    }
}
