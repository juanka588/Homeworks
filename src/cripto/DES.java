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
        String hexKey = Utils.stringToHex(rawKey);
        BitSet k = Utils.bytesToBitSet(Utils.hexToBytes(hexKey));
        BitSet k0 = Permutations.PC1(k);
        List<BitSet> parts = Utils.split(k0, 27);
        BitSet c0 = parts.get(0);
        BitSet d0 = parts.get(1);
   
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

}
