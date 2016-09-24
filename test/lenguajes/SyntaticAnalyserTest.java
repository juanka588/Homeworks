/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanCamilo
 */
public class SyntaticAnalyserTest {

    public SyntaticAnalyserTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test(expected = IllegalAccessError.class)
    public void testAnalyser() throws IOException, FileNotFoundException, LexicalException {
        SyntacticAnalyser sa = new SyntacticAnalyser("grammarTest.txt", "test1.txt");
        String cad = sa.printGrammar();
        assertEquals(cad + "2", cad);
    }
}
