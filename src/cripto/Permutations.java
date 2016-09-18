/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.util.BitSet;

/**
 *
 * @author JuanCamilo
 */
public class Permutations {

    public static final int[] PC_1 = new int[]{
        57, 49, 41, 33, 25, 17, 9, 01,
        58, 50, 42, 34, 26, 18, 10, 02,
        59, 51, 43, 35, 27, 19, 11, 03,
        60, 52, 44, 36, 63, 55, 47, 39,
        31, 23, 15, 07, 62, 54, 46, 38,
        30, 22, 14, 06, 61, 53, 45, 37,
        29, 21, 13, 05, 28, 20, 12, 04
    };

    public static final int[] PC_2 = new int[]{
        14, 17, 11, 24, 01, 05, 03, 28,
        15, 06, 21, 10, 23, 19, 12, 04,
        26, 8, 16, 07, 27, 20, 13, 02,
        41, 52, 31, 37, 47, 55, 30, 40,
        51, 45, 33, 48, 44, 49, 39, 56,
        34, 53, 46, 42, 50, 36, 29, 32
    };

    public static final int[] IP = new int[]{
        58, 50, 42, 34, 26, 18, 10, 02,
        60, 52, 44, 36, 28, 20, 12, 04,
        62, 54, 46, 38, 30, 22, 14, 06,
        64, 56, 48, 40, 32, 24, 16, 8,
        57, 49, 41, 33, 25, 17, 9, 01,
        59, 51, 43, 35, 27, 19, 11, 03,
        61, 53, 45, 37, 29, 21, 13, 05,
        63, 55, 47, 39, 31, 23, 15, 07
    };

    public static final int[] IP_INV = new int[]{
        40, 8, 48, 16, 56, 24, 64, 32,
        39, 07, 47, 15, 55, 23, 63, 31,
        38, 06, 46, 14, 54, 22, 62, 30,
        37, 05, 45, 13, 53, 21, 61, 29,
        36, 04, 44, 12, 52, 20, 60, 28,
        35, 03, 43, 11, 51, 19, 59, 27,
        34, 02, 42, 10, 50, 18, 58, 26,
        33, 01, 41, 9, 49, 17, 57, 25
    };
    public static final int[] E = new int[]{
        32, 01, 02, 03, 04, 05, 04, 05,
        06, 07, 8, 9, 9, 10, 11, 12,
        12, 13, 12, 13, 14, 15, 16, 17,
        16, 17, 18, 19, 20, 21, 20, 21,
        22, 23, 24, 25, 24, 25, 26, 27,
        28, 29, 28, 29, 30, 31, 32, 01
    };
    public static final int[] P = new int[]{
        16, 07, 20, 21, 29, 12, 28, 17,
        01, 15, 23, 26, 05, 18, 31, 10,
        02, 8, 24, 14, 32, 27, 03, 9,
        19, 13, 30, 06, 22, 11, 04, 25
    };

    public static BitSet PermutationP(BitSet k) {
        return permutation(k, P);
    }

    public static BitSet Expansion(BitSet k) {
        return permutation(k, E);
    }

    public static BitSet PC1(BitSet k) {
        return permutation(k, PC_1);
    }

    public static BitSet PC2(BitSet k) {
        return permutation(k, PC_2);
    }

    private static BitSet permutation(BitSet k, int[] idxs) {
        BitSet bs = new BitSet(idxs.length);
        for (int i = 0; i < idxs.length; i++) {
            bs.set(i, k.get(idxs[i] - 1));
        }
        return bs;
    }
}
