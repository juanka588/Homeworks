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

    public static final int[][] S1 = new int[][]{
        {14, 04, 13, 01, 02, 15, 11, 8, 03, 10, 06, 12, 05, 9, 00, 07},
        {0, 15, 07, 04, 14, 02, 13, 01, 10, 06, 12, 11, 9, 05, 03, 8},
        {04, 01, 14, 8, 13, 06, 02, 11, 15, 12, 9, 07, 03, 10, 05, 00},
        {15, 12, 8, 02, 04, 9, 01, 07, 005, 11, 03, 14, 10, 00, 06, 13}
    };
    public static final int[][] S2 = new int[][]{
        {15, 01, 8, 14, 06, 11, 03, 04, 9, 07, 02, 13, 12, 00, 05, 10},
        {03, 13, 04, 07, 15, 02, 8, 14, 12, 00, 01, 10, 06, 9, 11, 05},
        {00, 14, 07, 11, 10, 04, 13, 01, 05, 8, 12, 06, 9, 03, 02, 15},
        {13, 8, 10, 01, 03, 15, 04, 02, 11, 06, 07, 12, 00, 05, 14, 9}
    };
    public static final int[][] S3 = new int[][]{
        {10, 00, 9, 14, 06, 03, 15, 05, 01, 13, 12, 07, 11, 04, 02, 8},
        {13, 07, 00, 9, 03, 04, 06, 10, 02, 8, 05, 14, 12, 11, 15, 01},
        {13, 06, 04, 9, 8, 15, 03, 00, 11, 01, 02, 12, 05, 10, 14, 07},
        {01, 10, 13, 00, 06, 9, 8, 07, 04, 15, 14, 03, 11, 05, 02, 12}
    };
    public static final int[][] S4 = new int[][]{
        {07, 13, 14, 03, 00, 06, 9, 10, 01, 02, 8, 05, 11, 12, 04, 15},
        {13, 8, 11, 05, 06, 15, 00, 03, 04, 07, 02, 12, 01, 10, 14, 9},
        {10, 06, 9, 00, 12, 11, 07, 13, 15, 01, 03, 14, 05, 02, 8, 04},
        {03, 15, 00, 06, 10, 01, 13, 8, 9, 04, 05, 11, 12, 07, 02, 14}
    };
    public static final int[][] S5 = new int[][]{
        {02, 12, 04, 01, 07, 10, 11, 06, 8, 05, 03, 15, 13, 00, 14, 9},
        {14, 11, 02, 12, 04, 07, 13, 01, 05, 00, 15, 10, 03, 9, 8, 06},
        {04, 02, 01, 11, 10, 13, 07, 8, 15, 9, 12, 05, 06, 03, 00, 14},
        {11, 8, 12, 07, 01, 14, 02, 13, 06, 15, 00, 9, 1, 04, 05, 03}
    };
    public static final int[][] S6 = new int[][]{
        {12, 01, 10, 15, 9, 02, 06, 8, 00, 13, 03, 04, 14, 07, 05, 11},
        {10, 15, 04, 02, 07, 12, 9, 05, 06, 01, 13, 14, 00, 11, 03, 8},
        {9, 14, 15, 05, 02, 8, 12, 03, 07, 00, 04, 10, 01, 13, 11, 06},
        {04, 03, 02, 12, 9, 05, 15, 10, 11, 14, 01, 07, 06, 00, 8, 13}
    };
    public static final int[][] S7 = new int[][]{
        {04, 11, 02, 14, 15, 00, 8, 13, 03, 12, 9, 07, 05, 10, 06, 01},
        {13, 00, 11, 07, 04, 9, 01, 10, 14, 03, 05, 12, 02, 15, 8, 06},
        {01, 04, 11, 13, 12, 03, 07, 14, 10, 15, 06, 8, 00, 05, 9, 02},
        {06, 11, 13, 8, 01, 04, 10, 07, 9, 05, 00, 15, 14, 02, 03, 12}
    };
    public static final int[][] S8 = new int[][]{
        {13, 02, 8, 04, 06, 15, 11, 01, 10, 9, 03, 14, 05, 00, 12, 07},
        {01, 15, 13, 8, 10, 03, 07, 04, 12, 05, 06, 11, 00, 14, 9, 02},
        {07, 11, 04, 01, 9, 12, 14, 02, 00, 06, 10, 13, 15, 03, 05, 8},
        {02, 01, 14, 07, 04, 10, 8, 13, 15, 12, 9, 00, 03, 05, 06, 11}
    };

    public static FullBitSet PermutationP(FullBitSet k) {
        return permutation(k, P);
    }

    public static FullBitSet Expansion(FullBitSet k) {
        return permutation(k, E);
    }

    public static FullBitSet PC1(FullBitSet k) {
        return permutation(k, PC_1);
    }

    public static FullBitSet PC2(FullBitSet k) {
        return permutation(k, PC_2);
    }

    public static FullBitSet initialPermutation(FullBitSet k) {
        return permutation(k, IP);
    }

    public static FullBitSet initialPermutationINV(FullBitSet k) {
        return permutation(k, IP_INV);
    }

    private static FullBitSet permutation(FullBitSet k, int[] idxs) {
        FullBitSet bs = new FullBitSet(idxs.length);
        for (int i = 0; i < idxs.length; i++) {
            bs.set(i, k.get(idxs[i] - 1));
        }
        return bs;
    }

    public static FullBitSet S1(FullBitSet temp) {
        return applySBox(temp, S1);
    }

    public static FullBitSet S2(FullBitSet temp) {
        return applySBox(temp, S2);
    }

    public static FullBitSet S3(FullBitSet temp) {
        return applySBox(temp, S3);
    }

    public static FullBitSet S4(FullBitSet temp) {
        return applySBox(temp, S4);
    }

    public static FullBitSet S5(FullBitSet temp) {
        return applySBox(temp, S5);
    }

    public static FullBitSet S6(FullBitSet temp) {
        return applySBox(temp, S6);
    }

    public static FullBitSet S7(FullBitSet temp) {
        return applySBox(temp, S7);
    }

    public static FullBitSet S8(FullBitSet temp) {
        return applySBox(temp, S8);
    }

    private static FullBitSet applySBox(FullBitSet temp, int[][] SBox) {
        FullBitSet result;
        String bits = temp.toString();
        String r = bits.charAt(0) + "" + bits.charAt(bits.length() - 1);
        String c = bits.substring(1, bits.length() - 1);
        int row, col;
        row = Integer.parseInt(r, 2);
        col = Integer.parseInt(c, 2);
        String resultBits = Integer.toBinaryString(SBox[row][col]);
        result = Utils.bitsToBitSet(resultBits);
        return result;
    }
}
