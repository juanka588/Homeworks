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
            case 1:
                return "token_neg";
            case 2:
                return "token_igual";
            case 3:
                return "token_mas";
            case 4:
                return "token_menos";
            case 5:
                return "token_mul";
            case 6:
                return "token_mod";
            case 7:
                return "token_pyc";
            case 8:
                return "token_dosp";
            case 9:
                return "token_par_izq";
            case 10:
                return "token_par_der";
            case 11:
                return "token_cor_izq";
            case 12:
                return "token_cor_der";
            case 13:
                return "token_o";
            case 14:
                return "token_y";    
            case 15:
                return "token_coma";
            case 16:
                return "token_pot";
            case 17:
                return "token_o";
            case 18:
                return "token_y";
            case 19:
                return "token_asig";
            case 20:
                return "token_dif";
            case 21:
                return "token_menor";
            case 22:
                return "token_mayor";
            case 23:
                return "token_menor_igual";
            case 24:
                return "token_mayor_igual";
            case 25:
                return "token_div";
            default:
                return "";
                
        }
    }
}
