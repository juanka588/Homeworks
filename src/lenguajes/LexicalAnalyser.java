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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JuanCamilo
 */
public class LexicalAnalyser {

    private static final Pattern CHAR_PATTERN = Pattern.compile("[a-zA-Z]");
    private static final Pattern NUMBER_PATTERN = Pattern.compile("[0-9]");

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "7.in";
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String text;
        List<Token> tokenList = new ArrayList<>();
        int row = 0, column = 0;
        while ((text = in.readLine()) != null) {
            char c;
            for (int i = 0; i < text.length(); i++) {
                c = text.charAt(i);
                switch (c) {
                    case ' ':
                    case '\t':
                    case '\n':
                        break;
                    case '<':
                        i += readNextLT(i, text, tokenList);
                        break;
                    case '>':
                        i += readNextGT(i, text, tokenList);
                        break;
                    case '\'':
                    case '\"':
                        i += readStringDef(i, text, tokenList);
                        break;
                    case '/':
                        break;
                    default:
                        Integer tokenIden = SimbolsTable.SIMBOLS_MAP.get(String.valueOf(c));
                        if (tokenIden != null) {
                            tokenList.add(new Token(String.valueOf(c), row, column, Token.getTypeFromInt(tokenIden)));
                        } else if (isString(c)) {
                            i += readString(i, text, tokenList);
                        } else if (isNumber(c)) {
                            i += readNumber(i, text, tokenList);
                        } else {
                            throw new IllegalArgumentException("error caracter invalido");
                        }
                        break;
                }
                column++;
            }
            row++;
            column = 0;
            System.out.println(text);
        }
        writeResponse(tokenList, fileName);
    }

    private static boolean isString(char c) {
        return CHAR_PATTERN.matcher(String.valueOf(c)).matches();
    }

    private static boolean isNumber(char c) {
        return NUMBER_PATTERN.matcher(String.valueOf(c)).matches();
    }

    private static int readString(int i, String text, List<Token> tokenList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int readNumber(int i, String text, List<Token> tokenList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int readNextLT(int i, String text, List<Token> tokenList) {
        if (text.charAt(i+1) == "-"){
            tokenList.add(new Token("<-",row,column,19));
            return 1;
        }else if(text.charAt(i+1) == ">"){
            tokenList.add(new Token("<>",row,column,20));
            return 1;      
        }else if(text.charAt(i+1) == "="){
            tokenList.add(new Token("<=",row,column,23));
            return 1;
        }else if(isString(text.charAt(i+1)) || isNumber(text.charAt(i+1))){
            tokenList.add(new Token("<",row,column,21));
        }else{
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static int readNextGT(int i, String text, List<Token> tokenList) {
        if(text.charAt(i+1) == "="){
            tokenList.add(new Token(">=",row,column,22));
            return 1;
        }else if(isString(text.charAt(i+1)) || isNumber(text.charAt(i+1))){
            tokenList.add(new Token(">",row,column,24));
        }else{
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static int readStringDef(int i, String text, List<Token> tokenList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void writeResponse(List<Token> tokenList, String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File(fileName));
        for (Token token : tokenList) {
            pw.println(token.toString());
        }
    }
}
