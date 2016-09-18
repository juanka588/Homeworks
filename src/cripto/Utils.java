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

    public static BitSet bytesToBitSet(String bits) {
        String copy = bits.replaceAll("\\s", "");
        BitSet bs = new BitSet(copy.length());
        for (int i = 0; i < copy.length(); i++) {
            bs.set(i, copy.charAt(i) == '1');
        }
        return bs;
    }

    public static List<BitSet> splitHalf(BitSet k0) {
        return split(k0, Collections.singletonList(k0.length() / 2));
    }

    /**
     *
     * @param k0
     * @param cutPoint number of bits of first half
     * @return
     */
    public static List<BitSet> split(BitSet k0, int cutPoint) {
        return split(k0, Collections.singletonList(cutPoint));
    }

    public static List<BitSet> split(BitSet k0, List<Integer> cutPoints) {
        List<BitSet> parts = new ArrayList<>();
        int temp = 0;
        for (Integer cp : cutPoints) {
            if (cp < 0 || cp >= k0.length()) {
                throw new IllegalArgumentException("bad cut point");
            }
            parts.add(k0.get(temp, cp));
            temp = cp;
        }
        //add last part
        parts.add(k0.get(temp, k0.length()));
        return parts;
    }

    public static BitSet leftShift(BitSet k0, int shift) {
        BitSet bs = new BitSet(k0.length());
        int i;
        for (i = 0; i < k0.length() - shift; i++) {
            bs.set(i, k0.get(i + shift));
        }
        for (i = k0.length() - shift; i < k0.length(); i++) {
            bs.set(i, k0.get(i - (k0.length() - shift)));
        }
        return bs;
    }

    public static BitSet rightShift(BitSet k0, int shift) {
        BitSet bs = new BitSet(k0.length());
        int i;
        for (i = 0; i < k0.length() - shift; i++) {
            bs.set(i + shift, k0.get(i));
        }
        for (i = k0.length() - shift; i < k0.length(); i++) {
            bs.set(i - (k0.length() - shift), k0.get(i));
        }
        return bs;
    }

    public static BitSet fussion(BitSet left, BitSet right) {
        List<BitSet> parts = new ArrayList<>(2);
        parts.add(left);
        parts.add(right);
        return fussion(parts);
    }

    public static BitSet fussion(List<BitSet> elements) {
        BitSet bs = new BitSet();
        int temp = 0;
        for (BitSet element : elements) {
            for (int i = 0; i < element.length(); i++) {
                bs.set(i + temp, element.get(i));
            }
            temp = element.length();
        }
        return bs;
    }

    public static String bitSetToString(BitSet bs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bs.length(); i++) {
            if (bs.get(i)) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }

}
