/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author JuanCamilo
 */
public class Utils {

    public static String stringToHex(String arg) {
        return stringToHex(arg, "ISO-8859-1");
    }

    public static String stringToHex(String arg, String charSet) {
        return String.format("%x", new BigInteger(1, arg.getBytes(Charset.forName(charSet))));
    }

    public static String hexToBytes(String hexKey) {
        return hexToBytes(hexKey, 1);
    }

    public static String hexToBytes(String hexKey, int groupSize) {
        StringBuilder sb = new StringBuilder();
        String sub;
        String num;
        int inf, sup, size = hexKey.length();
        for (int i = 0; i < size / groupSize; i++) {
            inf = i * groupSize;
            sup = i * groupSize + groupSize;
            if (sup > size) {
                sup = size - 1;
            }
            sub = hexKey.substring(inf, sup);
            num = toBinaryString(Integer.parseInt(sub, 16), 4);
            sb.append(num);
        }
        return sb.toString();
    }

    public static String bitsToHex(String bits, int groupSize) {
        StringBuilder sb = new StringBuilder();
        String sub;
        int inf, sup, size = bits.length();
        for (int i = 0; i < size / groupSize; i++) {
            sup = size - (i * groupSize);
            inf = size - (i * groupSize + groupSize);
            if (sup > size) {
                sup = size - 1;
            }
            sub = bits.substring(inf, sup);
            sb.append(Integer.toHexString(Integer.parseInt(sub, 2)));
        }
        return sb.reverse().toString();
    }

    public static String hexToString(String hexString) throws UnsupportedEncodingException {
        return hexToString(hexString, "ISO-8859-1");
    }

    public static String hexToString(String hexString, String encoding) throws UnsupportedEncodingException {
        byte[] bytes = DatatypeConverter.parseHexBinary(hexString);
        return new String(bytes, encoding);
    }

    public static FullBitSet bitsToBitSet(String bits) {
        String copy = bits.replaceAll("\\s", "");
        FullBitSet bs = new FullBitSet(copy.length());
        for (int i = 0; i < copy.length(); i++) {
            bs.set(i, copy.charAt(i) == '1');
        }
        return bs;
    }

    /**
     *
     * @param bs
     * @return String representation of binary string
     * @throws UnsupportedEncodingException
     */
    public static String getStringValueOf(FullBitSet bs) throws UnsupportedEncodingException {
        return hexToString(bitsToHex(bs.toString(), 4));
    }

    public static List<String> splitString(String message, int blockSize) {
        List<String> blocks = new ArrayList<>();
        int inf, sup = 0;
        for (int j = 0; j < message.length() / blockSize; j++) {
            inf = j * blockSize;
            sup = j * blockSize + blockSize;
            if (sup > message.length()) {
                sup = message.length();
            }
            blocks.add(message.substring(inf, sup));
        }
        if (message.length() % blockSize != 0) {
            blocks.add(message.substring(sup, message.length()));
        }
        return blocks;
    }

    public static String hexXOR(String hex1, String hex2) {
        FullBitSet bs1 = bitsToBitSet(hexToBytes(hex1));
        FullBitSet bs2 = bitsToBitSet(hexToBytes(hex2));
        bs1.xor(bs2);
        return bitsToHex(bs1.toString(), 4);
    }

    public static String toBinaryString(int parseInt, int i) {
        String ret = Integer.toBinaryString(parseInt);
        while (ret.length() < i) {
            ret = "0" + ret;
        }
        return ret;
    }

    public static <T> T[][] transpose(T[][] mat) {
        T[][] transpose = (T[][]) Array.newInstance(mat[0][0].getClass(), mat.length, mat[0].length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                transpose[j][i] = mat[i][j];
            }
        }
        return transpose;
    }

    public static <T> T[][] leftShiftRows(T[][] mat) {
        T[][] shifted = (T[][]) Array.newInstance(mat[0][0].getClass(), mat.length, mat[0].length);
        for (int i = 0; i < mat.length; i++) {
            shifted[i] = leftShiftRow(mat[i], i);
        }
        return shifted;
    }

    public static <T> T[][] rightShiftRows(T[][] mat) {
        T[][] shifted = (T[][]) Array.newInstance(mat[0][0].getClass(), mat.length, mat[0].length);
        for (int i = 0; i < mat.length; i++) {
            shifted[i] = rightShiftRow(mat[i], i);
        }
        return shifted;
    }

    /**
     * *
     *
     * @param elements list of list of regular size by every list in a list
     * @return a list of transposed elements
     */
    public static <T> List<List<T>> transpose(List<List<T>> elements) {
        List<List<T>> tranposed = new ArrayList<>();
        if (elements.isEmpty()) {
            return tranposed;
        }
        for (int i = 0; i < elements.get(0).size(); i++) {
            tranposed.add(new ArrayList<>());
        }
        for (int j = 0; j < elements.size(); j++) {
            for (int i = 0; i < elements.get(0).size(); i++) {
                tranposed.get(i).add(elements.get(j).get(i));
            }
        }
        return tranposed;
    }

    public static <T> T[] leftShiftRow(T[] mat, int shift) {
        T[] shifted = (T[]) Array.newInstance(mat[0].getClass(), mat.length);
        for (int j = 0; j < mat.length - shift; j++) {
            shifted[j] = mat[j + shift];
        }
        for (int j = mat.length - shift; j < mat.length; j++) {
            shifted[j] = mat[j - (mat.length - shift)];
        }
        return shifted;
    }

    public static <T> T[] rightShiftRow(T[] mat, int shift) {
        T[] shifted = (T[]) Array.newInstance(mat[0].getClass(), mat.length);
        for (int j = 0; j < mat.length - shift; j++) {
            shifted[j + shift] = mat[j];
        }
        for (int j = mat.length - shift; j < mat.length; j++) {
            shifted[j - (mat.length - shift)] = mat[j];
        }
        return shifted;
    }

}
