/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import java.io.UnsupportedEncodingException;
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
public class DESTest {

    public DESTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class DES.
     */
    @Test
    public void testMain() throws UnsupportedEncodingException {
        System.out.println("main");
        String m = "0123456789ABCDEF";
        String k = "133457799BBCDFF1";
        String mbits = Utils.hexToBytes(m);
        assertEquals(
                "0000000100100011010001010110011110001001101010111100110111101111", mbits);
        FullBitSet message = Utils.bitsToBitSet(mbits);
        List<FullBitSet> keys = DES.generateKeys(Utils.bitsToBitSet(Utils.hexToBytes(k)));
        FullBitSet cypher = DES.processBlock(message, keys, DES.ENCODE);
        System.out.println(cypher.toString());
        System.out.println(Utils.bitsToHex(
                cypher.toString(), 4));
        String decode = DES.decode(Utils.bitsToHex(
                cypher.toString(), 4), Utils.hexToString(k));
        System.out.println("decode: "+decode);

    }

}
