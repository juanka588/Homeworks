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
public class SpecialWords {

    public static final Map<String, Integer> RESERVED_WORDS;
    public static final Map<String, Integer> RESERVED_SIMBOLS;

    static {
        RESERVED_WORDS = new HashMap<>();
        RESERVED_WORDS.put("proceso", Token.RESERVED);
        RESERVED_WORDS.put("finproceso", Token.RESERVED);

        RESERVED_WORDS.put("funcion", Token.RESERVED);
        RESERVED_WORDS.put("finfuncion", Token.RESERVED);

        RESERVED_WORDS.put("subproceso", Token.RESERVED);
        RESERVED_WORDS.put("finsubproceso", Token.RESERVED);

        RESERVED_WORDS.put("algoritmo", Token.RESERVED);
        RESERVED_WORDS.put("finalgoritmo", Token.RESERVED);

        RESERVED_WORDS.put("si", Token.RESERVED);
        RESERVED_WORDS.put("entonces", Token.RESERVED);
        RESERVED_WORDS.put("sino", Token.RESERVED);
        RESERVED_WORDS.put("finsi", Token.RESERVED);

        RESERVED_WORDS.put("segun", Token.RESERVED);
        RESERVED_WORDS.put("caso", Token.RESERVED);
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
        RESERVED_WORDS.put("dimension", Token.RESERVED);

        RESERVED_WORDS.put("escribir", Token.RESERVED);
        RESERVED_WORDS.put("leer", Token.RESERVED);

        RESERVED_WORDS.put("verdadero", Token.TRUE);
        RESERVED_WORDS.put("falso", Token.FALSE);
        RESERVED_WORDS.put("v", Token.TRUE);
        RESERVED_WORDS.put("f", Token.FALSE);

        //operadores
        RESERVED_WORDS.put("mod", Token.MODOP);
        RESERVED_WORDS.put("no", Token.NEG);
        RESERVED_WORDS.put("o", Token.OR);
        RESERVED_WORDS.put("y", Token.AND);

    }

    static {
        RESERVED_SIMBOLS = new HashMap<>();
        RESERVED_SIMBOLS.put("~", Token.NEG);
        RESERVED_SIMBOLS.put("=", Token.EQUAL);
        RESERVED_SIMBOLS.put("+", Token.PLUSOP);
        RESERVED_SIMBOLS.put("-", Token.LESSOP);
        RESERVED_SIMBOLS.put("*", Token.MULOP);
        RESERVED_SIMBOLS.put("%", Token.MODOP);
        RESERVED_SIMBOLS.put(";", Token.PYC);
        RESERVED_SIMBOLS.put(":", Token.DOUBLE_POINTS);
        RESERVED_SIMBOLS.put("(", Token.PARIZQ);
        RESERVED_SIMBOLS.put(")", Token.PARDER);
        RESERVED_SIMBOLS.put("[", Token.CORIZQ);
        RESERVED_SIMBOLS.put("]", Token.CORDER);
        RESERVED_SIMBOLS.put("|", Token.OR);
        RESERVED_SIMBOLS.put("&", Token.AND);
        RESERVED_SIMBOLS.put(",", Token.COMMA);
        RESERVED_SIMBOLS.put("^", Token.POWER);
    }

}
