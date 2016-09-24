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
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
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
    private static String line = null;
    private static List<Token> tokenList = new ArrayList<>();
    public static Token token;
    private static int i;
    private static BufferedReader in;

    public static void main(String[] args) {
        System.out.println("main");
        File f = new File("./ejemplos/");
        File[] files = f.listFiles((File dir, String name) -> name.endsWith(".in"));
        for (File file : files) {
            try {
                main2(new String[]{file.getAbsolutePath()});
                line = null;
                token = null;
                tokenList.removeAll(tokenList);
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
        in = new BufferedReader(new FileReader(fileName));
        fileName = getFileName(fileName);
        System.out.println("fixed name: " + fileName);

        //in = new BufferedReader(new InputStreamReader(System.in));
        row = 1;
        column = 1;
        line = in.readLine();
        i = 0;
        while (line != null) {
            i = getNextToken(in, i);
        }
        in.close();
        //writeResponse(tokenList, fileName);
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

    private static int readString(int idx, String text, List<Token> tokenList) throws LexicalException {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        char temp = text.charAt(idx);
        while (isValid(temp)) {
            sb.append(temp);
            count++;
            if ((idx + count) >= text.length()) {
                //case finish line
                break;
            }
            temp = text.charAt(idx + count);
        }
        String word = sb.toString().toLowerCase();
        Integer value = SpecialWords.RESERVED_WORDS.get(word);
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
     * @param idx
     * @param text
     * @param tokenList
     * @return an integer can only finich with an operator or space
     */
    private static int readNumber(int idx, String text, List<Token> tokenList) throws LexicalException {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        char temp = text.charAt(idx);
        while (isValidForReal(temp)) {
            sb.append(temp);
            count++;
            if ((idx + count) >= text.length()) {
                break;
            }
            temp = text.charAt(idx + count);
        }
        if (isString(temp)) {
            //ex: 2.0as
            throw new LexicalException(row, column, fileName, tokenList);
        }
        String number = sb.toString();
        int size = number.length();
        int idx2 = number.lastIndexOf(".");
        if (idx2 != -1) {
            if (idx2 == size - 1) {
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

    private static int readNextLT(int idx, String text, List<Token> tokenList) throws LexicalException {
        char nextChar;
        if (idx + 1 >= text.length()) {
            //usefull trick
            nextChar = 'a';
        } else {
            nextChar = text.charAt(idx + 1);
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
        } else if (isString(nextChar) || isNumber(nextChar) || isSpace(nextChar)) {
            tokenList.add(new Token("<", row, column, Token.LT));
            return 0;
        } else {
            throw new LexicalException(row, column, fileName, tokenList);
        }
    }

    private static int readNextGT(int idx, String text, List<Token> tokenList) throws LexicalException {
        char nextChar;
        if (idx + 1 >= text.length()) {
            //usefull trick
            nextChar = 'a';
        } else {
            nextChar = text.charAt(idx + 1);
        }
        if (nextChar == '=') {
            tokenList.add(new Token(">=", row, column, Token.GE));
            return 1;
        } else if (isString(nextChar) || isNumber(nextChar) || isSpace(nextChar)) {
            tokenList.add(new Token(">", row, column, Token.GT));
            return 0;
        } else {
            throw new LexicalException(row, column, fileName, tokenList);
        }
    }

    private static int readStringDef(int idx, String text, List<Token> tokenList) throws LexicalException {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        if (idx + 1 >= text.length()) {
            //ilegal ' or "
            throw new LexicalException(row, column, fileName, tokenList);
        }
        char temp = text.charAt(idx + count);
        while (temp != '\'' && temp != '\"') {
            sb.append(temp);
            count++;
            if ((idx + count) >= text.length()) {
                throw new LexicalException(row, column, fileName, tokenList);
            }
            temp = text.charAt(idx + count);
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

    private static int readComment(int idx, String text, List<Token> tokenList) {
        char nextChar;
        if (idx + 1 >= text.length()) {
            //usefull trick
            nextChar = 'a';
        } else {
            nextChar = text.charAt(idx + 1);
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

    public static int getNextToken(BufferedReader in, int idx) throws IOException, LexicalException {
        if (line == null) {
            line = in.readLine();
        }
        if (line != null) {
            if (idx >= line.length()) {
                row++;
                column = 1;
                line = null;
                return getNextToken(in, 0);
            }
            char c;
            column = idx + 1;
            c = line.charAt(idx);
            switch (c) {
                case ' ':
                case '\t':
                case '\n':
                    return idx + 1;
                case '<':
                    idx += readNextLT(idx, line, tokenList);
                    break;
                case '>':
                    idx += readNextGT(idx, line, tokenList);
                    break;
                case '\'':
                case '\"':
                    idx += readStringDef(idx, line, tokenList);
                    break;
                case '/':
                    idx += readComment(idx, line, tokenList);
                    break;
                default:
                    Integer tokenIden = SpecialWords.RESERVED_SIMBOLS.get(String.valueOf(c));
                    if (tokenIden != null) {
                        tokenList.add(new Token(String.valueOf(c), row, column, tokenIden));
                    } else if (isString(c)) {
                        idx += readString(idx, line, tokenList);
                    } else if (isNumber(c)) {
                        idx += readNumber(idx, line, tokenList);
                    } else {
                        throw new LexicalException(row, column, fileName, tokenList);
                    }
                    break;
            }
            if (tokenList.size() == 1) {
                token = tokenList.remove(0);
                System.out.println(token.toString());
            } else {
                return getNextToken(in, idx);
            }
        } else {
            //fin de archivo
            token = new Token("", row, column, Token.EOF);
            System.out.println(token.toString());
            in.close();
        }
        return idx + 1;

    }

    public static void init() throws FileNotFoundException, IOException, LexicalException {
        //in = new BufferedReader(new FileReader(fileName));
        in = new BufferedReader(new InputStreamReader(System.in));
        row = 1;
        column = 1;
        line = in.readLine();
        i = 0;
        i = getNextToken(in, i);
    }

    public static Token getNextToken() throws IOException, LexicalException {
        i = getNextToken(in, i);
        return token;
    }
}
