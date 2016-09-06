/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JuanCamilo
 */
public class SimbolsTable {

    public static final Map<String, Integer> RESERVED_WORDS;
    public static final Map<String, Integer> SIMBOLS_MAP;

    static {
        RESERVED_WORDS = new HashMap<>();
        RESERVED_WORDS.put("proceso", Token.RESERVED);
        RESERVED_WORDS.put("entero", Token.RESERVED);
        RESERVED_WORDS.put("definir", Token.RESERVED);
        RESERVED_WORDS.put("real", Token.RESERVED);
        RESERVED_WORDS.put("finproceso", Token.RESERVED);
        //operadores
        RESERVED_WORDS.put("mod", Token.RESERVED);
        RESERVED_WORDS.put("no", Token.RESERVED);       
    }

    static {
        SIMBOLS_MAP = new HashMap<>();
        SIMBOLS_MAP.put("~", 1);
        SIMBOLS_MAP.put("=", 2);
        SIMBOLS_MAP.put("+", 3);
        SIMBOLS_MAP.put("-", 4);
        SIMBOLS_MAP.put("*", 5);
        SIMBOLS_MAP.put("%", 6);
        SIMBOLS_MAP.put(";", 7);
        SIMBOLS_MAP.put(":", 8);
        SIMBOLS_MAP.put("(", 9);
        SIMBOLS_MAP.put(")", 10);
        SIMBOLS_MAP.put("[", 11);
        SIMBOLS_MAP.put("]", 12);
        SIMBOLS_MAP.put("|", 13);
        SIMBOLS_MAP.put("&", 14);
        SIMBOLS_MAP.put(",", 15);
        SIMBOLS_MAP.put("^", 16);
        SIMBOLS_MAP.put("o", 17);
        SIMBOLS_MAP.put("y", 18);
    }    
    
}
