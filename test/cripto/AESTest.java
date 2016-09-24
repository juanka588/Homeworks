/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanCamilo
 */
public class AESTest {

    public AESTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void multiplyTest() {
        String[] r = new String[]{"04", "d6", "00", "da"};
        String[] multiply = AES.multiply(r, AES.MIX_COLUMN_MATRIX_INV);
        assertArrayEquals(new String[]{"e3", "19", "f7", "05"}, multiply);
    }
}
