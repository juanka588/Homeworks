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
        RESERVED_WORDS.put("finproceso", Token.RESERVED);

        RESERVED_WORDS.put("subproceso", Token.RESERVED);
        RESERVED_WORDS.put("finsubproceso", Token.RESERVED);

        RESERVED_WORDS.put("algoritmo", Token.RESERVED);
        RESERVED_WORDS.put("finalgoritmo", Token.RESERVED);

        RESERVED_WORDS.put("si", Token.RESERVED);
        RESERVED_WORDS.put("entonces", Token.RESERVED);
        RESERVED_WORDS.put("sino", Token.RESERVED);
        RESERVED_WORDS.put("finsi", Token.RESERVED);

        RESERVED_WORDS.put("segun", Token.RESERVED);
        RESERVED_WORDS.put("de", Token.RESERVED);
        RESERVED_WORDS.put("otro", Token.RESERVED);
        RESERVED_WORDS.put("modo", Token.RESERVED);
        RESERVED_WORDS.put("finsegun", Token.RESERVED);

        RESERVED_WORDS.put("mientras", Token.RESERVED);
        RESERVED_WORDS.put("hacer", Token.RESERVED);
        RESERVED_WORDS.put("finmientras", Token.RESERVED);

        RESERVED_WORDS.put("para", Token.RESERVED);
        RESERVED_WORDS.put("hasta", Token.RESERVED);
        RESERVED_WORDS.put("con", Token.RESERVED);
        RESERVED_WORDS.put("paso", Token.RESERVED);
        RESERVED_WORDS.put("finpara", Token.RESERVED);

        RESERVED_WORDS.put("repetir", Token.RESERVED);
        RESERVED_WORDS.put("que", Token.RESERVED);

        RESERVED_WORDS.put("limpiar", Token.RESERVED);
        RESERVED_WORDS.put("borrar", Token.RESERVED);
        RESERVED_WORDS.put("pantalla", Token.RESERVED);

        RESERVED_WORDS.put("esperar", Token.RESERVED);
        RESERVED_WORDS.put("tecla", Token.RESERVED);

        RESERVED_WORDS.put("segundos", Token.RESERVED);
        RESERVED_WORDS.put("milisegundos", Token.RESERVED);

        RESERVED_WORDS.put("definir", Token.RESERVED);
        RESERVED_WORDS.put("como", Token.RESERVED);
        RESERVED_WORDS.put("numero", Token.RESERVED);
        RESERVED_WORDS.put("numerico", Token.RESERVED);
        RESERVED_WORDS.put("caracter", Token.RESERVED);
        RESERVED_WORDS.put("texto", Token.RESERVED);
        RESERVED_WORDS.put("cadena", Token.RESERVED);
        RESERVED_WORDS.put("logico", Token.RESERVED);
        RESERVED_WORDS.put("real", Token.RESERVED);
        RESERVED_WORDS.put("entero", Token.RESERVED);

        RESERVED_WORDS.put("escribir", Token.RESERVED);
        RESERVED_WORDS.put("leer", Token.RESERVED);

        RESERVED_WORDS.put("verdadero", Token.RESERVED);
        RESERVED_WORDS.put("falso", Token.RESERVED);

        //operadores
        RESERVED_WORDS.put("mod", Token.MODOP);
        RESERVED_WORDS.put("no", Token.NEG);

    }

    static {
        SIMBOLS_MAP = new HashMap<>();
        SIMBOLS_MAP.put("~", Token.NEG);
        SIMBOLS_MAP.put("=", Token.EQUAL);
        SIMBOLS_MAP.put("+", Token.PLUSOP);
        SIMBOLS_MAP.put("-", Token.LESSOP);
        SIMBOLS_MAP.put("*", Token.MULOP);
        SIMBOLS_MAP.put("%", Token.MODOP);
        SIMBOLS_MAP.put(";", Token.PYC);
        SIMBOLS_MAP.put(":", Token.DOUBLE_POINTS);
        SIMBOLS_MAP.put("(", Token.PARIZQ);
        SIMBOLS_MAP.put(")", Token.PARDER);
        SIMBOLS_MAP.put("[", Token.CORIZQ);
        SIMBOLS_MAP.put("]", Token.CORDER);
        SIMBOLS_MAP.put("|", Token.OR);
        SIMBOLS_MAP.put("&", Token.AND);
        SIMBOLS_MAP.put(",", Token.COMMA);
        SIMBOLS_MAP.put("^", Token.POWER);
        SIMBOLS_MAP.put("o", Token.OR);
        SIMBOLS_MAP.put("y", Token.AND);
    }

}
