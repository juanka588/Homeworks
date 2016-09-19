/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
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
            num = Integer.toBinaryString(Integer.parseInt(sub, 16));
            if (num.length() == 3) {
                num = "0" + num;
            }
            if (num.length() == 2) {
                num = "00" + num;
            }
            if (num.length() == 1) {
                num = "000" + num;
            }
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

    public static BitSet bitsToBitSet(String bits) {
        String copy = bits.replaceAll("\\s", "");
        BitSet bs = new BitSet(copy.length());
        for (int i = 0; i < copy.length(); i++) {
            bs.set(i, copy.charAt(i) == '1');
        }
        return bs;
    }

    public static List<BitSet> splitHalf(BitSet k0, int realSize) {
        return split(k0, Collections.singletonList(k0.length() / 2), realSize);
    }

    public static List<BitSet> split(BitSet k0, int cutPoint, int realSize) {
        return split(k0, Collections.singletonList(cutPoint), realSize);
    }

    public static List<BitSet> split6(BitSet k0, int realSize) {
        List<Integer> cutpoints = new ArrayList<>();
        cutpoints.add(6);
        cutpoints.add(12);
        cutpoints.add(18);
        cutpoints.add(24);
        cutpoints.add(30);
        cutpoints.add(36);
        cutpoints.add(42);
        return split(k0, cutpoints, realSize);
    }

    /**
     * 
     * @param k0
     * @param cutPoints
     * @param realSize size of orginal bitset k0
     * @return 
     */
    public static List<BitSet> split(BitSet k0, List<Integer> cutPoints, int realSize) {
        List<BitSet> parts = new ArrayList<>();
        int temp = 0;
        for (Integer cp : cutPoints) {
            if (cp < 0 || cp >= realSize) {
                throw new IllegalArgumentException("bad cut point");
            }
            parts.add(k0.get(temp, cp));
            temp = cp;
        }
        //add last part
        parts.add(k0.get(temp, realSize));
        return parts;
    }

    /**
     * 
     * @param k0
     * @param shift
     * @param realSize size of orginial bitset
     * @return 
     */
    public static BitSet leftShift(BitSet k0, int shift, int realSize) {
        BitSet bs = new BitSet(k0.length());
        int i;
        for (i = 0; i < realSize - shift; i++) {
            bs.set(i, k0.get(i + shift));
        }
        for (i = realSize - shift; i < realSize; i++) {
            bs.set(i, k0.get(i - (realSize - shift)));
        }
        return bs;
    }

    public static BitSet rightShift(BitSet k0, int shift, int realSize) {
        BitSet bs = new BitSet(k0.length());
        int i;
        for (i = 0; i < realSize - shift; i++) {
            bs.set(i + shift, k0.get(i));
        }
        for (i = realSize - shift; i < realSize; i++) {
            bs.set(i - (realSize - shift), k0.get(i));
        }
        return bs;
    }

    public static BitSet fussion(BitSet left, BitSet right, int realSize) {
        List<BitSet> parts = new ArrayList<>(2);
        parts.add(left);
        parts.add(right);
        return fussion(parts, realSize);
    }

    /**
     * 
     * @param elements
     * @param realSize size of each element
     * @return 
     */
    public static BitSet fussion(List<BitSet> elements, int realSize) {
        BitSet bs = new BitSet();
        int temp = 0;
        for (BitSet element : elements) {
            for (int i = 0; i < realSize; i++) {
                bs.set(i + temp, element.get(i));
            }
            temp = element.length();
        }
        return bs;
    }

    public static String bitSetToString(BitSet bs) {
        return bitSetToString(bs, bs.length());
    }

    public static String bitSetToString(BitSet bs, int max) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            if (bs.get(i)) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }

    /**
     *
     * @param bs
     * @return String representation of binary string
     * @throws UnsupportedEncodingException
     */
    public static String getStringValueOf(BitSet bs) throws UnsupportedEncodingException {
        return hexToString(bitsToHex(bitSetToString(bs), 4));
    }

    public static List<String> splitString(String message, int blockSize) {
        List<String> blocks = new ArrayList<>();
        int inf, sup;
        for (int j = 0; j < message.length() / blockSize; j++) {
            inf = j * blockSize;
            sup = j * blockSize + blockSize;
            if (sup > message.length()) {
                sup = message.length();
            }
            blocks.add(message.substring(inf, sup));
        }
        return blocks;
    }

}
