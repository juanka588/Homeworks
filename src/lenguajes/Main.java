/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 *
 * @author JuanCamilo
 */
public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, LexicalException {
        File f = new File("./ejemplos/");
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".in");
            }
        });
        for (File file : files) {
            System.out.println("file: " + file.getName());
            SyntacticAnalyser sa = new SyntacticAnalyser("grammar.txt", file.getName(), false);
            sa.setToken(LexicalAnalyser.token);
            sa.getInitRule().execute();
            if (LexicalAnalyser.token.getType() == Token.EOF) {
                System.out.println("El analisis sintactico ha finalizado exitosamente.");
            } else {
                System.out.println("El analisis sintactico no se ejecuto correctamente.");
            }
        }

    }
}
