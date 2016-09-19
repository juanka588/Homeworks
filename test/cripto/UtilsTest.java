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
public class UtilsTest {

    public UtilsTest() {
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
     * Test of stringToHex method, of class Utils.
     */
    @Test
    public void testStringToHex_String() {
        System.out.println("stringToHex");
        String arg = "HOLAHOLA";
        String expResult = "484f4c41484f4c41";
        String result = Utils.stringToHex(arg);
        assertEquals(expResult, result);
    }

    /**
     * Test of stringToHex method, of class Utils.
     */
    @Test
    public void testHexToString() throws UnsupportedEncodingException {
        System.out.println("stringToHex");
        String arg = "484f4c41484f4c41";
        String expResult = "HOLAHOLA";
        String result = Utils.hexToString(arg);
        assertEquals(expResult, result);
    }

    /**
     * Test of hexToBytes method, of class Utils.
     */
    @Test
    public void testHexToBytes_String() {
        System.out.println("hexToBytes");
        String hexKey = "484f4c41484f4c41";
        String expResult = "0100100001001111010011000100000101001000010011110100110001000001";
        String result = Utils.hexToBytes(hexKey);
        assertEquals(expResult, result);

    }

    /**
     * Test of bitsToHex method, of class Utils.
     */
    @Test
    public void testBitsToHex() {
        System.out.println("bitsToHex");
        String bits = "0100100001001111010011000100000101001000010011110100110001000001";
        int groupSize = 4;
        String expResult = "484f4c41484f4c41";
        String result = Utils.bitsToHex(bits, groupSize);
        assertEquals(expResult, result);
    }

    /**
     * Test of bitsToBitSet method, of class Utils.
     */
    @Test
    public void testBytesToBitSet() {
        System.out.println("bytesToBitSet");
        String bits = "1010";
        BitSet expResult = new BitSet(bits.length());
        expResult.set(0);
        expResult.set(2);
        BitSet result = Utils.bitsToBitSet(bits);
        assertEquals(expResult, result);
    }

    /**
     * Test of split method, of class Utils.
     */
    @Test
    public void testSplit() {
        System.out.println("split");
        BitSet k0 = Utils.bitsToBitSet("01100011");
        int cutPoint = 4;
        BitSet left = Utils.bitsToBitSet("0110");
        BitSet right = Utils.bitsToBitSet("0011");
        List<BitSet> result = Utils.split(k0, cutPoint, 8);
        assertEquals(left, result.get(0));
        assertEquals(right, result.get(1));

    }

    /**
     * Test of split method, of class Utils.
     */
    @Test
    public void testSplit6() {
        System.out.println("6 split");
        BitSet k0 = Utils.bitsToBitSet("011000 010001 011110 111010 100001 100110 010100 100111");
        List<Integer> cutpoints = new ArrayList<>();
        cutpoints.add(6);
        cutpoints.add(12);
        cutpoints.add(18);
        cutpoints.add(24);
        cutpoints.add(30);
        cutpoints.add(36);
        cutpoints.add(42);
        BitSet bs1 = Utils.bitsToBitSet("011000");
        BitSet bs2 = Utils.bitsToBitSet("010001");
        BitSet bs3 = Utils.bitsToBitSet("011110");
        BitSet bs4 = Utils.bitsToBitSet("111010");
        BitSet bs5 = Utils.bitsToBitSet("100001");
        BitSet bs6 = Utils.bitsToBitSet("100110");
        BitSet bs7 = Utils.bitsToBitSet("010100");
        BitSet bs8 = Utils.bitsToBitSet("100111");
        List<BitSet> result = Utils.split(k0, cutpoints, 48);
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
        BitSet k0 = Utils.bitsToBitSet("1010101011001100111100011110");
        int shift = 1;
        BitSet expResult = Utils.bitsToBitSet("0101010110011001111000111101");
        BitSet result = Utils.leftShift(k0, shift, 28);
        assertEquals(Utils.bitSetToString(expResult), Utils.bitSetToString(result));
        shift = 3;
        expResult = Utils.bitsToBitSet("0101011001100111100011110101");
        result = Utils.leftShift(k0, shift, 28);
        assertEquals(expResult, result);
    }

    /**
     * Test of leftShift method, of class Utils.
     */
    @Test
    public void testRightShift() {
        System.out.println("rightShift");
        BitSet k0 = Utils.bitsToBitSet("01100011");
        int shift = 1;
        BitSet expResult = Utils.bitsToBitSet("10110001");
        BitSet result = Utils.rightShift(k0, shift, 8);
        assertEquals(Utils.bitSetToString(expResult), Utils.bitSetToString(result));
        shift = 2;
        expResult = Utils.bitsToBitSet("11011000");
        result = Utils.rightShift(k0, shift, 8);
        assertEquals(expResult, result);
    }

    /**
     * Test of fussion method, of class Utils.
     */
    @Test
    public void testFussion() {
        System.out.println("fussion");
        BitSet left = Utils.bitsToBitSet("01101");
        BitSet right = Utils.bitsToBitSet("00110");
        BitSet expResult = Utils.bitsToBitSet("0110100110");
        BitSet result = Utils.fussion(left, right, 5);
        assertEquals(Utils.bitSetToString(expResult), Utils.bitSetToString(result));
        left = Utils.bitsToBitSet("1110000110011001010101011111");
        right = Utils.bitsToBitSet("1010101011001100111100011110");
        expResult
                = Utils.bitsToBitSet("1110000110011001010101011111 1010101011001100111100011110");
        result = Utils.fussion(left, right, 56);
        assertEquals(Utils.bitSetToString(expResult), Utils.bitSetToString(result));
    }

    /**
     * Test of bitSetToString method, of class Utils.
     */
    @Test
    public void testBitSetToString() {
        System.out.println("bitSetToString");
        String expected = "0001100011";
        BitSet result = Utils.bitsToBitSet(expected);
        assertEquals(expected, Utils.bitSetToString(result));
        expected = "101100011011";
        result = Utils.bitsToBitSet(expected);
        assertEquals(expected, Utils.bitSetToString(result));
        expected = "011000";
        result = Utils.bitsToBitSet(expected);
        assertEquals(expected, Utils.bitSetToString(result, 6));
    }

}
