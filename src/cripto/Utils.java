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
