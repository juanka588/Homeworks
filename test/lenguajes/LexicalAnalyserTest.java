/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.io.File;
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
        System.out.println("main");
        File f=new File(".");
        File[] files = f.listFiles();
        for (File file : files) {
            LexicalAnalyser.main(file.getName());
        }
    }
    
}
