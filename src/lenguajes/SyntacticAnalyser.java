/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanCamilo
 */
public class SyntacticAnalyser {

    /**
     * String identifier of every grammatical rule
     */
    private Map<String, GrammaticalRule> grammar;
    private Token token;

    public SyntacticAnalyser() throws IOException, FileNotFoundException, LexicalException {
        LexicalAnalyser.init();
    }

    public Map<String, GrammaticalRule> getGrammar() {
        return grammar;
    }

    public void setGrammar(Map<String, GrammaticalRule> grammar) {
        this.grammar = grammar;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public boolean match(Token current) {
        boolean ret = false;
        if (token.getTypeString().equals(current.getTypeString())) {
            token = nextToken();
            if (token==null) {
                throw new IllegalStateException("error reading next token");
            }
            ret = true;
        }
        return ret;
    }

    private Token nextToken() {
        try {
            return LexicalAnalyser.getNextToken();
        } catch (IOException ex) {
            Logger.getLogger(SyntacticAnalyser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LexicalException ex) {
            Logger.getLogger(SyntacticAnalyser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
