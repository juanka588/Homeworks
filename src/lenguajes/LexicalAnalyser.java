/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanCamilo
 */
public class LexicalAnalyser {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new FileReader("7.in"));
        String text = null;
        List<Token> tokenList=new ArrayList<>();
        while ((text = in.readLine()) != null) {
            char c;
            for (int i = 0; i < text.length(); i++) {
                c = text.charAt(i);
                switch (c) {
                    case ' ':
                    case '\t':
                    case '\n':
                        break;
                    default:
                        if (SimbolsTable.SIMBOLS_MAP.containsKey(String.valueOf(c))) {
                          tokenList.add(new Token());
                        }
                }
            }
            System.out.println(text);
        }
    }
}
