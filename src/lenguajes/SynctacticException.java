/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.util.Collection;

/**
 *
 * @author JuanCamilo
 */
public class SynctacticException {

    private Collection<String> expected;
    private Token found;

    public SynctacticException(Collection<String> expecteds, Token token) {
        this.expected = expecteds;
        this.found = token;
        System.out.println(toString());
        //System.exit(0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(found.getRow());
        sb.append(":");
        sb.append(found.getColumn());
        sb.append("> Error sintactico: ");
        if (expected.contains("proceso")) {
            sb.append("falta proceso");
            return sb.toString();
        }
        sb.append("se encontro: \"");
        if (found.getType() == Token.RESERVED) {
            sb.append(found.getTypeString());
        } else {
            sb.append(found.getLexema());
        }
        sb.append("\"; se esperaba: ");

        for (String exp : expected) {
            String sub = exp;
            switch (exp) {
                case "id":
                    sub = "identificador";
                    break;
                case "token_cadena":
                    sub = "valor_cadena";
                    break;
                case "token_entero":
                    sub = "valor_entero";
                    break;
                case "token_real":
                    sub = "valor_real";
                    break;
                default:
                    sub = SpecialWords.RESERVED_SIMBOLS_INV.get(sub);
                    if (sub == null) {
                        sub = exp;
                    }
                    break;
            }
            sb.append("\"");
            sb.append(sub);
            sb.append("\", ");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.deleteCharAt(sb.lastIndexOf(" "));
        sb.append(".");
        return sb.toString();

    }
}
