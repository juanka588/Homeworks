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
        RESERVED_WORDS.put("o", Token.RESERVED);
        RESERVED_WORDS.put("y", Token.RESERVED);
        RESERVED_WORDS.put("no", Token.RESERVED);
    }

    static {
        SIMBOLS_MAP = new HashMap<>();
        SIMBOLS_MAP.put("~", Token.NEG);
        SIMBOLS_MAP.put("=", Token.PROCESS);
        SIMBOLS_MAP.put("+", Token.END_PROCESS);
        SIMBOLS_MAP.put("-", Token.END_PROCESS);
        SIMBOLS_MAP.put("/", Token.END_PROCESS);
        SIMBOLS_MAP.put("*", Token.END_PROCESS);
        SIMBOLS_MAP.put("%", Token.END_PROCESS);
        SIMBOLS_MAP.put(";", Token.END_PROCESS);
        SIMBOLS_MAP.put(":", Token.END_PROCESS);
        SIMBOLS_MAP.put("(", Token.END_PROCESS);
        SIMBOLS_MAP.put(")", Token.END_PROCESS);
        SIMBOLS_MAP.put("[", Token.END_PROCESS);
        SIMBOLS_MAP.put("]", Token.END_PROCESS);
        SIMBOLS_MAP.put("|", Token.END_PROCESS);
        SIMBOLS_MAP.put("&", Token.END_PROCESS);
        SIMBOLS_MAP.put(",", Token.END_PROCESS);
        SIMBOLS_MAP.put("^", Token.END_PROCESS);
    }
}
