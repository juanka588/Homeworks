/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

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
        int inf, sup, size = hexKey.length();
        for (int i = 0; i < size / groupSize; i++) {
            inf = i * groupSize;
            sup = i * groupSize + groupSize;
            if (sup > size) {
                sup = size - 1;
            }
            sub = hexKey.substring(inf, sup);
            sb.append(Integer.toBinaryString(Integer.parseInt(sub, 16)));
        }
        return sb.toString();
    }

    public static BitSet bytesToBitSet(String bits) {
        BitSet bs = new BitSet(bits.length());
        for (int i = 0; i < bits.length(); i++) {
            bs.set(i, bits.charAt(i) == '1');
        }
        return bs;
    }

    public static List<BitSet> split(BitSet k0, int cutPoint) {
        List<BitSet> parts = new ArrayList<>(2);
        parts.add(k0.get(0, cutPoint));
        parts.add(k0.get(cutPoint + 1, k0.length()));
        return parts;
    }

    public static BitSet leftShift(BitSet k0, int shift) {
        BitSet bs = null;

        return bs;
    }

    public static BitSet fussion(BitSet left, BitSet right) {
        BitSet bs = new BitSet(left.length() + right.length());
        for (int i = 0; i < left.length(); i++) {
            bs.set(i, left.get(i));
        }
        for (int i = left.length(); i < bs.length(); i++) {
            bs.set(i, right.get(i - left.length()));
        }
        return bs;
    }

}
