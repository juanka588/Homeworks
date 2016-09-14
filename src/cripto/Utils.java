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
        BitSet bs = new BitSet(k0.length());
        bs.or(k0.get(shift, k0.length() + 1 - shift));
        System.out.println(Utils.bitSetToString(bs));
        for (int i = 0; i < shift; i++) {
            bs.set(k0.length() - shift + i, k0.get(i));
            System.out.println("entro");
        }
        System.out.println(Utils.bitSetToString(bs));
        return bs;
    }

    public static BitSet fussion(BitSet left, BitSet right) {
        BitSet bs = new BitSet(left.length() + right.length());
        for (int i = 0; i < left.length(); i++) {
            bs.set(i, left.get(i));
        }
        for (int i = 0; i < right.length(); i++) {
            bs.set(i + left.length() + 1, right.get(i));
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
