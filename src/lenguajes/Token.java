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

    public static final int ID = 0;
    public static final int RESERVED = 1;
    public static final int INTEGER = 2;
    /**
     * int represents string values
     */
    public static final int CADENA = 3;
    public static final int REAL = 4;

    public static final int EQUAL = 5;
    public static final int DIVOP = 6;
    public static final int GE = 7;
    public static final int LE = 8;
    public static final int GT = 9;
    public static final int LT = 10;
    public static final int DIF = 11;
    public static final int ASIGN = 12;
    public static final int POWER = 13;
    public static final int COMMA = 14;
    public static final int AND = 15;
    public static final int OR = 16;
    public static final int CORDER = 17;
    public static final int CORIZQ = 18;
    public static final int PARDER = 19;
    public static final int PARIZQ = 20;
    public static final int DOUBLE_POINTS = 21;
    public static final int PYC = 22;
    public static final int MODOP = 23;
    public static final int NEG = 24;
    public static final int PLUSOP = 25;
    public static final int MULOP = 26;
    public static final int LESSOP = 27;
    public static final int EOF = 28;
    public static final int TRUE = 29;
    public static final int FALSE = 30;

    private String lexema;
    private int row, column, type;
    private String typeString;

    public Token(String lexema, int row, int column, int type) {
        this.lexema = lexema;
        this.row = row;
        this.column = column;
        this.type = type;
        this.typeString = getTypeFromInt(type);
        if ("".equals(typeString)) {
            this.typeString = lexema;
        }
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

    public String getTypeString() {
        return typeString;
    }

    public void setTypeString(String typeString) {
        this.typeString = typeString;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(typeString);
        if (type == ID || type == INTEGER || type == CADENA || type == REAL) {
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
                return "id";
            case NEG:
                return "token_neg";
            case EQUAL:
                return "token_igual";
            case PLUSOP:
                return "token_mas";
            case LESSOP:
                return "token_menos";
            case MULOP:
                return "token_mul";
            case MODOP:
                return "token_mod";
            case PYC:
                return "token_pyc";
            case DOUBLE_POINTS:
                return "token_dosp";
            case PARIZQ:
                return "token_par_izq";
            case PARDER:
                return "token_par_der";
            case CORIZQ:
                return "token_cor_izq";
            case CORDER:
                return "token_cor_der";
            case OR:
                return "token_o";
            case AND:
                return "token_y";
            case COMMA:
                return "token_coma";
            case POWER:
                return "token_pot";
            case ASIGN:
                return "token_asig";
            case DIF:
                return "token_dif";
            case LT:
                return "token_menor";
            case GT:
                return "token_mayor";
            case LE:
                return "token_menor_igual";
            case GE:
                return "token_mayor_igual";
            case DIVOP:
                return "token_div";
            case REAL:
                return "token_real";
            case INTEGER:
                return "token_entero";
            case CADENA:
                return "token_cadena";
            case TRUE:
                return "verdadero";
            case FALSE:
                return "falso";
            default:
                return "";
        }
    }

}
