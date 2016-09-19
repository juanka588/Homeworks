/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanCamilo
 */
public class FullBitSetTest {

    public FullBitSetTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of split method, of class FullBitSet.
     */
    @Test
    public void testSplit_List() {
        System.out.println("split");
        FullBitSet k0 = Utils.bitsToBitSet("01100011");
        int cutPoint = 4;
        FullBitSet left = Utils.bitsToBitSet("0110");
        FullBitSet right = Utils.bitsToBitSet("0011");
        List<FullBitSet> result = k0.split(cutPoint);
        assertEquals(left, result.get(0));
        assertEquals(right, result.get(1));
    }

    /**
     * Test of split6 method, of class FullBitSet.
     */
    @Test
    public void testSplit6() {
        System.out.println("6 split");
        FullBitSet k0 = Utils.bitsToBitSet("011000 010001 011110 111010 100001 100110 010100 100111");
        List<Integer> cutpoints = new ArrayList<>();
        cutpoints.add(6);
        cutpoints.add(12);
        cutpoints.add(18);
        cutpoints.add(24);
        cutpoints.add(30);
        cutpoints.add(36);
        cutpoints.add(42);
        FullBitSet bs1 = Utils.bitsToBitSet("011000");
        FullBitSet bs2 = Utils.bitsToBitSet("010001");
        FullBitSet bs3 = Utils.bitsToBitSet("011110");
        FullBitSet bs4 = Utils.bitsToBitSet("111010");
        FullBitSet bs5 = Utils.bitsToBitSet("100001");
        FullBitSet bs6 = Utils.bitsToBitSet("100110");
        FullBitSet bs7 = Utils.bitsToBitSet("010100");
        FullBitSet bs8 = Utils.bitsToBitSet("100111");
        List<FullBitSet> result = k0.split(cutpoints);
        assertEquals(bs1, result.get(0));
        assertEquals(bs2, result.get(1));
        assertEquals(bs3, result.get(2));
        assertEquals(bs4, result.get(3));
        assertEquals(bs5, result.get(4));
        assertEquals(bs6, result.get(5));
        assertEquals(bs7, result.get(6));
        assertEquals(bs8, result.get(7));
    }

    /**
     * Test of leftShift method, of class Utils.
     */
    @Test
    public void testLeftShift() {
        System.out.println("leftShift");
        FullBitSet k0 = Utils.bitsToBitSet("1010101011001100111100011110");
        int shift = 1;
        FullBitSet expResult = Utils.bitsToBitSet("0101010110011001111000111101");
        FullBitSet result = k0.leftShift(shift);
        assertEquals(expResult.toString(), result.toString());
        shift = 3;
        expResult = Utils.bitsToBitSet("0101011001100111100011110101");
        result = k0.leftShift(shift);
        assertEquals(expResult, result);
    }

    /**
     * Test of leftShift method, of class Utils.
     */
    @Test
    public void testRightShift() {
        System.out.println("rightShift");
        FullBitSet k0 = Utils.bitsToBitSet("01100011");
        int shift = 1;
        FullBitSet expResult = Utils.bitsToBitSet("10110001");
        FullBitSet result = k0.rightShift(shift);
        assertEquals(expResult.toString(), result.toString());
        shift = 2;
        expResult = Utils.bitsToBitSet("11011000");
        result = k0.rightShift(shift);
        assertEquals(expResult, result);
    }

    /**
     * Test of fussion method, of class Utils.
     */
    @Test
    public void testFussion() {
        System.out.println("fussion");
        FullBitSet left = Utils.bitsToBitSet("01101");
        FullBitSet right = Utils.bitsToBitSet("00110");
        FullBitSet expResult = Utils.bitsToBitSet("0110100110");
        FullBitSet result = left.fussion(right);
        assertEquals(expResult.toString(), result.toString());
        left = Utils.bitsToBitSet("1110000110011001010101011111");
        right = Utils.bitsToBitSet("1010101011001100111100011110");
        expResult
                = Utils.bitsToBitSet("1110000110011001010101011111 1010101011001100111100011110");
        result = left.fussion(right);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of bitSetToString method, of class Utils.
     */
    @Test
    public void testBitSetToString() {
        System.out.println("bitSetToString");
        String expected = "0001100011";
        BitSet result = Utils.bitsToBitSet(expected);
        assertEquals(expected, result.toString());
        expected = "101100011011";
        result = Utils.bitsToBitSet(expected);
        assertEquals(expected, result.toString());
        expected = "011000";
        result = Utils.bitsToBitSet(expected);
        assertEquals(expected, result.toString());
    }

}
