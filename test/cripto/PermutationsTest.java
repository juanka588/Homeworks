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
        k = Utils.bytesToBitSet("0110100001101111011011000110000101101000011011110110110001100001");
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
        BitSet expResult
                = Utils.bytesToBitSet("0001101000011010000110100010101100111100001111000100110101011111");
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
