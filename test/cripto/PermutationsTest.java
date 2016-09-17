/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.util.BitSet;
import javafx.scene.input.KeyCode;
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

    private BitSet k;

    public PermutationsTest() {
        k = new BitSet();
        String bits = Utils.hexToBytes("133457799BBCDFF1");
        k = Utils.bytesToBitSet(bits);
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
        assertEquals("0001001100110100010101110111100110011011101111001101111111110001"
                , Utils.bitSetToString(k));
        BitSet expResult
                = Utils.bytesToBitSet("11110000110011001010101011110101010101100110011110001111");
        BitSet result = Permutations.PC1(k);
        assertEquals(expResult, result);

    }

    /**
     * Test of PC2 method, of class Permutations.
     */
    @Test
    public void testPC2() {
        System.out.println("PC2");
        BitSet expResult
                = Utils.bytesToBitSet("0001101000011010000110100010101100111100001111000100110101011111");
        BitSet result = Permutations.PC2(k);
        assertEquals(Utils.bitSetToString(expResult), Utils.bitSetToString(result));
    }

}
