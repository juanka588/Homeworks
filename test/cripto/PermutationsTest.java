/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 454
 */
public class PermutationsTest {

    private FullBitSet k;

    public PermutationsTest() {
        k = new FullBitSet(0);
        String bits = Utils.hexToBytes("133457799BBCDFF1");
        k = Utils.bitsToBitSet(bits);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of PC1 method, of class Permutations.
     */
    @Test
    public void testPC1() {
        System.out.println("PC1");
        assertEquals("0001001100110100010101110111100110011011101111001101111111110001", k.toString());
        FullBitSet expResult
                = Utils.bitsToBitSet("11110000110011001010101011110101010101100110011110001111");
        FullBitSet result = Permutations.PC1(k);
        assertEquals(expResult, result);

    }

    /**
     * Test of PC2 method, of class Permutations.
     */
    @Test
    public void testPC2() {
        System.out.println("PC2");
        FullBitSet base
                = Utils.bitsToBitSet("1110000110011001010101011111 1010101011001100111100011110");
        FullBitSet expResult
                = Utils.bitsToBitSet("000110 110000 001011 101111 111111 000111 000001 110010");
        FullBitSet result = Permutations.PC2(base);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of IP method, of class Permutations.
     */
    @Test
    public void testIP() {
        System.out.println("IP");
        FullBitSet base
                = Utils.bitsToBitSet("0000000100100011010001010110011110001001101010111100110111101111");
        FullBitSet expResult
                = Utils.bitsToBitSet("1100110000000000110011001111111111110000101010101111000010101010");
        FullBitSet result = Permutations.initialPermutation(base);
        assertEquals(base, Permutations.initialPermutationINV(result));
        assertEquals(expResult, result);
    }

    /**
     * Test of Expand method, of class Permutations.
     */
    @Test
    public void testExpand() {
        System.out.println("expand");
        FullBitSet base
                = Utils.bitsToBitSet("11110000101010101111000010101010");
        FullBitSet expResult
                = Utils.bitsToBitSet("011110 100001 010101 010101 011110 100001 010101 010101");
        FullBitSet result = Permutations.Expansion(base);
        assertEquals(expResult, result);
    }
    @Test
    public void testConstants() {
        System.out.println("Constants");
        assertTrue(diffRow(Permutations.P));
        assertTrue(diffRow(Permutations.PC_1));
        assertTrue(diffRow(Permutations.PC_2));
        assertTrue(diffRow(Permutations.IP));
        assertTrue(diffRow(Permutations.IP_INV));
        int[][][] test = new int[][][]{Permutations.S1, Permutations.S2, Permutations.S3, Permutations.S4,
            Permutations.S5, Permutations.S6, Permutations.S7, Permutations.S8};
        for (int[][] mat : test) {
            for (int[] arr : mat) {
                assertTrue(diffRow(arr));
            }
        }

    }

    private boolean diffRow(int[] array) {
        boolean ret = true;
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < array.length; i++) {

            ret = ret && map.add(i);
        }
        return ret;
    }

}
