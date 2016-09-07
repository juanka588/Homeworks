/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanCamilo
 */
class LexicalException extends Exception {

    private int row, column;
    private String fileName;

    public LexicalException(int row, int column, String fileName, List<Token> tokenList) {
        this.row = row;
        this.column = column;
        this.fileName = fileName;
        try {
            LexicalAnalyser.writeResponse(tokenList, fileName, toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LexicalException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return ">>> Error lexico (linea: " + row + ", posicion: " + column + ")";
    }

}
