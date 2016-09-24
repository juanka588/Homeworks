/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author JuanCamilo
 */
public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, LexicalException, SynctacticException {
        SyntacticAnalyser sa = new SyntacticAnalyser();
        sa.setToken(sa.nextToken());
        sa.getInitRule().execute();
    }
}
