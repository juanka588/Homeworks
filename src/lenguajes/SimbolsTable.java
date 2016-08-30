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
        RESERVED_WORDS.put("proceso", Token.PROCESS);
        RESERVED_WORDS.put("entero", Token.INTEGER);
        RESERVED_WORDS.put("definir", Token.DEFINITION);
        RESERVED_WORDS.put("real", Token.REAL);
        RESERVED_WORDS.put("finproceso", Token.END_PROCESS);
        RESERVED_WORDS.put("mod", Token.END_PROCESS);
        RESERVED_WORDS.put("no", Token.ID);
        RESERVED_WORDS.put("o", Token.END_PROCESS);
        RESERVED_WORDS.put("y", Token.END_PROCESS);
        RESERVED_WORDS.put("no", Token.ID);
    }

    static {
        SIMBOLS_MAP = new HashMap<>();
        SIMBOLS_MAP.put("~", Token.NEG);
        SIMBOLS_MAP.put("=", Token.PROCESS);
        SIMBOLS_MAP.put("<-", Token.INTEGER);
        SIMBOLS_MAP.put("<>", Token.DEFINITION);
        SIMBOLS_MAP.put("<", Token.REAL);
        SIMBOLS_MAP.put(">", Token.END_PROCESS);
        SIMBOLS_MAP.put("<=", Token.END_PROCESS);
        SIMBOLS_MAP.put(">=", Token.END_PROCESS);
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
