/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.io.UnsupportedEncodingException;
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
     * Test of bytesToBitSet method, of class Utils.
     */
    @Test
    public void testBytesToBitSet() {
        System.out.println("bytesToBitSet");
        String bits = "1010";
        BitSet expResult = new BitSet(bits.length());
        expResult.set(0);
        expResult.set(2);
        BitSet result = Utils.bytesToBitSet(bits);
        assertEquals(expResult, result);
    }

    /**
     * Test of split method, of class Utils.
     */
    @Test
    public void testSplit() {
        System.out.println("split");
        BitSet k0 = Utils.bytesToBitSet("01100011");
        int cutPoint = 3;
        BitSet left = Utils.bytesToBitSet("0110");
        BitSet right = Utils.bytesToBitSet("0011");
        List<BitSet> result = Utils.split(k0, cutPoint);
        assertEquals(left, result.get(0));
        assertEquals(right, result.get(1));

    }

    /**
     * Test of leftShift method, of class Utils.
     */
    @Test
    public void testLeftShift() {
        System.out.println("leftShift");
        BitSet k0 = Utils.bytesToBitSet("01100011");
        int shift = 1;
        BitSet expResult = Utils.bytesToBitSet("11000110");
        BitSet result = Utils.leftShift(k0, shift);
        assertEquals(Utils.bitSetToString(expResult), Utils.bitSetToString(result));
        shift = 2;
        expResult = Utils.bytesToBitSet("10001101");
        result = Utils.leftShift(k0, shift);
        assertEquals(expResult, result);
    }

    /**
     * Test of fussion method, of class Utils.
     */
    @Test
    public void testFussion() {
        System.out.println("fussion");
        BitSet left = Utils.bytesToBitSet("0110");
        BitSet right = Utils.bytesToBitSet("0011");
        BitSet expResult = Utils.bytesToBitSet("01100011");
        BitSet result = Utils.fussion(left, right);
        assertEquals(expResult, result);
    }

    /**
     * Test of bitSetToString method, of class Utils.
     */
    @Test
    public void testBitSetToString() {
        System.out.println("bitSetToString");
        String bits = "011000110";
        BitSet expResult = Utils.bytesToBitSet(bits);
        assertEquals(bits, Utils.bitSetToString(expResult));
    }

}
