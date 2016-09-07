/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author JuanCamilo
 */
public class LexicalAnalyser {

    private static final Pattern CHAR_PATTERN = Pattern.compile("[a-zA-Z]");
    private static final Pattern NUMBER_PATTERN = Pattern.compile("[0-9]");
    public static final String OUT_DIR = "./out/";
    private static int row, column;
    private static String fileName = "lexer.out";

    public static void main(String[] args) {
        System.out.println("main");
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

    public static void main2(String[] args) throws FileNotFoundException, IOException, LexicalException {
        fileName = args[0];
        System.out.println("file: " + fileName);
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        fileName = getFileName(fileName);
        System.out.println("fixed name: " + fileName);

        // in = new BufferedReader(new InputStreamReader(System.in));
        String text;
        List<Token> tokenList = new ArrayList<>();
        row = 1;
        column = 1;
        while ((text = in.readLine()) != null) {
            char c;
            for (int i = 0; i < text.length(); i++) {
                column = i + 1;
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
                        i += readComment(i, text, tokenList);
                        break;
                    default:
                        Integer tokenIden = SimbolsTable.SIMBOLS_MAP.get(String.valueOf(c));
                        if (tokenIden != null) {
                            tokenList.add(new Token(String.valueOf(c), row, column, tokenIden));
                        } else if (isString(c)) {
                            i += readString(i, text, tokenList);
                        } else if (isNumber(c)) {
                            i += readNumber(i, text, tokenList);
                        } else {
                            throw new LexicalException(row, column, fileName, tokenList);
                        }
                        break;
                }
            }
            row++;
            column = 1;
            System.out.println(Arrays.toString(tokenList.toArray()));
        }
        writeResponse(tokenList, fileName);
    }

    private static boolean isString(char c) {
        return CHAR_PATTERN.matcher(String.valueOf(c)).matches();
    }

    private static boolean isNumber(char c) {
        return NUMBER_PATTERN.matcher(String.valueOf(c)).matches();
    }

    private static boolean isSpace(char c) {
        switch (c) {
            case ' ':
            case '\t':
            case '\n':
                return true;
            default:
                return false;
        }
    }

    private static int readString(int i, String text, List<Token> tokenList) throws LexicalException {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        char temp = text.charAt(i);
        while (isValid(temp)) {
            sb.append(temp);
            count++;
            if ((i + count) >= text.length()) {
                //case finish line
                break;
            }
            temp = text.charAt(i + count);
        }
        String word = sb.toString().toLowerCase();
        Integer value = SimbolsTable.RESERVED_WORDS.get(word);
        if (value != null) {
            //case reserved word
            tokenList.add(new Token(word, row, column, value));
        } else {
            //case identifier
            tokenList.add(new Token(word, row, column, Token.ID));
        }
        return count - 1;
    }

    /**
     *
     * @param i
     * @param text
     * @param tokenList
     * @return an integer can only finich with an operator or space
     */
    private static int readNumber(int i, String text, List<Token> tokenList) throws LexicalException {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        char temp = text.charAt(i);
        while (isValidForReal(temp)) {
            sb.append(temp);
            count++;
            if ((i + count) >= text.length()) {
                break;
            }
            temp = text.charAt(i + count);
        }
        if (isString(temp)) {
            //ex: 2.0as
            throw new LexicalException(row, column, fileName, tokenList);
        }
        String number = sb.toString();
        int size = number.length();
        int idx = number.lastIndexOf(".");
        if (idx != -1) {
            if (idx == size - 1) {
                // ex: 20.
                throw new LexicalException(row, column, fileName, tokenList);
            }
            if (size - number.replaceAll("\\.", "").length() == 1) {
                tokenList.add(new Token(number, row, column, Token.REAL));
            } else {
                //ex: 2.5.6
                throw new LexicalException(row, column, fileName, tokenList);
            }
        } else {
            tokenList.add(new Token(number, row, column, Token.INTEGER));
        }
        return count - 1;
    }

    private static int readNextLT(int i, String text, List<Token> tokenList) throws LexicalException {
        char nextChar;
        if (i + 1 >= text.length()) {
            //usefull trick
            nextChar = 'a';
        } else {
            nextChar = text.charAt(i + 1);
        }
        if (nextChar == '-') {
            tokenList.add(new Token("<-", row, column, Token.ASIGN));
            return 1;
        } else if (nextChar == '>') {
            tokenList.add(new Token("<>", row, column, Token.DIF));
            return 1;
        } else if (nextChar == '=') {
            tokenList.add(new Token("<=", row, column, Token.LE));
            return 1;
        } else if (isString(nextChar) || isNumber(nextChar)||isSpace(nextChar)) {
            tokenList.add(new Token("<", row, column, Token.LT));
            return 0;
        } else {
            throw new LexicalException(row, column, fileName, tokenList);
        }
    }

    private static int readNextGT(int i, String text, List<Token> tokenList) throws LexicalException {
        char nextChar;
        if (i + 1 >= text.length()) {
            //usefull trick
            nextChar = 'a';
        } else {
            nextChar = text.charAt(i + 1);
        }
        if (nextChar == '=') {
            tokenList.add(new Token(">=", row, column, Token.GE));
            return 1;
        } else if (isString(nextChar) || isNumber(nextChar)||isSpace(nextChar)) {
            tokenList.add(new Token(">", row, column, Token.GT));
            return 0;
        } else {
            throw new LexicalException(row, column, fileName, tokenList);
        }
    }

    private static int readStringDef(int i, String text, List<Token> tokenList) throws LexicalException {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        if (i + 1 >= text.length()) {
            //ilegal ' or "
            throw new LexicalException(row, column, fileName, tokenList);
        }
        char temp = text.charAt(i + count);
        while (temp != '\'' && temp != '\"') {
            sb.append(temp);
            count++;
            if ((i + count) >= text.length()) {
                throw new LexicalException(row, column, fileName, tokenList);
            }
            temp = text.charAt(i + count);
        }
        tokenList.add(new Token(sb.toString(), row, column, Token.CADENA));
        return count;
    }

    public static void writeResponse(List<Token> tokenList, String fileName) throws FileNotFoundException {
        writeResponse(tokenList, fileName, "");
    }

    public static void writeResponse(List<Token> tokenList, String fileName, String error) throws FileNotFoundException {
        String outName = fileName;
        outName += ".out";
        outName = OUT_DIR + outName;
        System.out.println("output name: " + outName);
        File file = new File(outName);
        PrintWriter pw = new PrintWriter(file);
        for (Token token : tokenList) {
            pw.println(token.toString());
        }
        if (!"".equals(error)) {
            pw.println(error);
        }
        pw.close();
    }

    private static boolean isValid(char temp) {
        return isString(temp) || isNumber(temp) || temp == '_';
    }

    private static boolean isValidForReal(char temp) {
        return isNumber(temp) || temp == '.';
    }

    private static int readComment(int i, String text, List<Token> tokenList) {
        char nextChar;
        if (i + 1 >= text.length()) {
            //usefull trick
            nextChar = 'a';
        } else {
            nextChar = text.charAt(i + 1);
        }
        if (nextChar == '/') {
            //it a comment
            return text.length();
        }
        tokenList.add(new Token("/", row, column, Token.DIVOP));
        return 0;

    }

    private static String getFileName(String fileName) {
        StringBuilder sb = new StringBuilder();
        boolean extension = false;
        char a;
        for (int i = fileName.length() - 1; i >= 0; i--) {
            a = fileName.charAt(i);
            if (extension) {
                if (a == '\\' || a == '/') {
                    break;
                }
                sb.append(a);
            }
            extension = extension || a == '.';
        }
        return sb.reverse().toString();
    }
}
