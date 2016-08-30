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

    public static final Map<String, Integer> SIMBOLS_MAP;

    static {
        SIMBOLS_MAP = new HashMap<>();
        SIMBOLS_MAP.put("id", Token.ID);
        SIMBOLS_MAP.put("proceso", Token.PROCESS);
        SIMBOLS_MAP.put("entero", Token.INTEGER);
        SIMBOLS_MAP.put("definir", Token.DEFINITION);
        SIMBOLS_MAP.put("real", Token.REAL);
        SIMBOLS_MAP.put("finproceso", Token.END_PROCESS);
    }
}
