/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

/**
 *
 * @author JuanCamilo
 */
public class Token {

    public static final int ID = 0,
            INTEGER = 2,
            CADENA = 3,
            REAL = 4,
            RESERVED = 1,
            NEG = 5;

    private String lexema;
    private int row, column;
    private String type;

    public Token(String lexema, int row, int column, String type) {
        this.lexema = lexema;
        this.row = row;
        this.column = column;
        this.type = type;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(type);
        if (!lexema.equals(type)) {
            sb.append(",");
            sb.append(lexema);
        }
        sb.append(",");
        sb.append(row);
        sb.append(",");
        sb.append(column);
        sb.append(">");
        return sb.toString();
    }

    public static String getTypeFromInt(int type) {
        switch (type) {
            case ID:
                return "token_id";
            default:
                return "";
        }
    }
}
