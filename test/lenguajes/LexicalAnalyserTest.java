/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static lenguajes.LexicalAnalyser.main2;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanCamilo
 */
public class LexicalAnalyserTest {

    public LexicalAnalyserTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class LexicalAnalyser.
     */
    @org.junit.Test
    public void testMain() throws Exception {
        File f = new File("./ejemplos/");
        File[] files = f.listFiles((File dir, String name) -> name.endsWith(".in"));
        for (File file : files) {
            try {
                main2(new String[]{file.getAbsolutePath()});
            } catch (IOException ex) {
                Logger.getLogger(LexicalAnalyser.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LexicalException ex) {
                Logger.getLogger(LexicalAnalyser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
