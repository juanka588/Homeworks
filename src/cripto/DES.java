/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanCamilo
 */
public class DES {

    private static final int ENCODE = 0;
    private static final int DECODE = 1;

    public static void main(String[] args) {
        String message = "HOLAHOLA";
        String key = "OCHOBITS";
        if (key.length() != 8) {
            System.out.println("bad key");
            return;
        }
        try {
            String cypher = encription(message, key);
            System.out.println("cypher: " + cypher);
            System.out.println("cypher hex: " + Utils.stringToHex(cypher));
            String decode = decode(cypher, key);
            System.out.println("decoded : " + decode);
            System.out.println("decoded hex: " + Utils.stringToHex(decode));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(DES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String process(String cad, String rawKey, int mode) throws UnsupportedEncodingException {
        List<String> blocks = Utils.splitString(cad, 8);
        List<BitSet> keys = generateKeys(rawKey);
        String mPermuted;
        BitSet m;
        StringBuilder sb = new StringBuilder();
        for (String block : blocks) {
            while (block.length() < 8) {
                block += (char) 0;
            }
            mPermuted = Utils.stringToHex(block);
            mPermuted = Utils.hexToBytes(mPermuted);
            m = Utils.bitsToBitSet(mPermuted);
            sb.append(processBlock(m, keys, mode));
        }
        return sb.toString();
    }

    private static String encription(String message, String rawKey) throws UnsupportedEncodingException {
        return process(message, rawKey, ENCODE);
    }

    private static List<BitSet> generateKeys(String rawKey) {
        String hexKey = Utils.stringToHex(rawKey);
        BitSet k = Utils.bitsToBitSet(Utils.hexToBytes(hexKey));
        return generateKeys(k);
    }

    private static List<BitSet> generateKeys(BitSet k) {
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

    private static BitSet applyfunction(BitSet pRight, BitSet key, BitSet pLeft) {
        BitSet reponse;
        BitSet expan = Permutations.Expansion(pRight);
        expan.xor(key);
        List<BitSet> split6 = Utils.split6(expan);
        List<BitSet> sboxes = new ArrayList<>(split6.size());
        BitSet sb, temp;
        for (int i = 0; i < split6.size(); i++) {
            temp = split6.get(i);
            switch (i) {
                case 0:
                    sb = Permutations.S1(temp);
                    break;
                case 1:
                    sb = Permutations.S2(temp);
                    break;
                case 2:
                    sb = Permutations.S3(temp);
                    break;
                case 3:
                    sb = Permutations.S4(temp);
                    break;
                case 4:
                    sb = Permutations.S5(temp);
                    break;
                case 5:
                    sb = Permutations.S6(temp);
                    break;
                case 6:
                    sb = Permutations.S7(temp);
                    break;
                case 7:
                    sb = Permutations.S8(temp);
                    break;
                default:
                    throw new IllegalAccessError("bad generation of split");
            }
            sboxes.add(sb);
        }
        reponse = Utils.fussion(sboxes);
        reponse = Permutations.PermutationP(reponse);
        reponse.xor(pLeft);
        return reponse;
    }

    private static String decode(String cypher, String rawKey) throws UnsupportedEncodingException {
        return process(cypher, rawKey, DECODE);
    }

    private static String processBlock(BitSet m, List<BitSet> keys, int mode) throws UnsupportedEncodingException {
        BitSet ip = Permutations.initialPermutation(m);
        BitSet left = null, pLeft, right = null, pRight;
        List<BitSet> splitHalf = Utils.splitHalf(ip);
        pLeft = splitHalf.get(0);
        pRight = splitHalf.get(1);
        BitSet key = null;
        for (int i = 0; i < keys.size(); i++) {
            if (ENCODE == mode) {
                key = keys.get(i);
            } else if (DECODE == mode) {
                key = keys.get(keys.size() - 1 - i);
            }
            left = pRight;
            right = applyfunction(pRight, key, pLeft);
            pLeft = left;
            pRight = right;
        }
        BitSet fussion = Utils.fussion(right, left);
        fussion = Permutations.initialPermutationINV(fussion);
        return Utils.getStringValueOf(fussion);
    }

}
