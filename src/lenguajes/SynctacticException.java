/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author JuanCamilo
 */
class SynctacticException {

    private Collection<String> expected;
    private Token found;

    public SynctacticException(Collection<String> expecteds, Token token) {
        this.expected = expecteds;
        this.found = token;
        System.out.println(toString());
        System.exit(1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(found.getRow());
        sb.append(":");
        sb.append(found.getColumn());
        sb.append("> Error sintactico: se encontro: ");
        sb.append(found.getTypeString());
        sb.append("; se esperaba: ");
        for (String exp : expected) {
            sb.append("\"");
            sb.append(exp);
            sb.append("\",");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append(".");
        return sb.toString();

    }

}
