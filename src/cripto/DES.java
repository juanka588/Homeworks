/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 *
 * @author JuanCamilo
 */
public class DES {

    public static void main(String[] args) {
        String message = "HOLAHOLA";
        String key = "OCHOBITS";
        if (key.length() != 8) {
            System.out.println("bad key");
            return;
        }
        encription(message, key);
    }

    private static void encription(String message, String rawKey) {
        List<String> blocks = splitString(message, 8);
        List<BitSet> keys = generateKeys(rawKey);

    }

    private static List<String> splitString(String message, int blockSize) {
        List<String> blocks = new ArrayList<>();
        int inf, sup;
        for (int j = 0; j < message.length(); j++) {
            inf = j * blockSize;
            sup = j * blockSize + blockSize;
            if (sup > message.length()) {
                sup = message.length() - 1;
            }
            blocks.add(message.substring(inf, sup));
        }
        return blocks;
    }

    private static List<BitSet> generateKeys(String rawKey) {
        String hexKey = Utils.stringToHex(rawKey);
        BitSet k = Utils.bytesToBitSet(Utils.hexToBytes(hexKey));
        BitSet k0 = Permutations.PC1(k);
        List<BitSet> keys = new ArrayList<>();
        List<BitSet> parts = Utils.split(k0, 28);
        BitSet c0 = parts.get(0);
        BitSet d0 = parts.get(1);
        BitSet ki;
        for (int i = 1; i <= 16; i++) {
            switch (i) {
                case 1:
                case 2:
                case 9:
                case 16:
                    c0 = Utils.leftShift(c0, 1);
                    d0 = Utils.leftShift(d0, 1);
                    break;
                default:
                    c0 = Utils.leftShift(c0, 2);
                    d0 = Utils.leftShift(d0, 2);
                    break;
            }
            ki = Utils.fussion(c0, d0);
            keys.add(Permutations.PC2(ki));
        }
        return keys;
    }

}
