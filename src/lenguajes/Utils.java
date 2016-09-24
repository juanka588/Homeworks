/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.util.SortedSet;

/**
 *
 * @author JuanCamilo
 */
public class Utils {

    public static String printSet(String id, String name, SortedSet<String> set) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("(");
        sb.append(id);
        sb.append(")={");
        for (String s : set) {
            sb.append(s);
            sb.append(" , ");
        }
        sb.append("}");
        return sb.toString();
    }
}
