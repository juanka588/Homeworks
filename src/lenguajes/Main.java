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

    public static void main(String[] args) throws IOException, FileNotFoundException, LexicalException {
        SyntacticAnalyser sa = new SyntacticAnalyser("grammar.txt","test17.txt");
        sa.setToken(LexicalAnalyser.token);
        sa.getInitRule().execute();
        System.out.println("El analisis sintactico ha finalizado correctamente.");
    }
}
