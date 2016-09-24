/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private GrammaticalRule initRule;

    public SyntacticAnalyser(String grammarFile,String fileName) throws IOException, FileNotFoundException, LexicalException {
        this.grammar = new HashMap<>();
        LexicalAnalyser.init(fileName);
        this.token = LexicalAnalyser.token;
        initRule = null;
        loadGrammar(grammarFile);
    }

    public SyntacticAnalyser() throws IOException, FileNotFoundException, LexicalException {
        this("grammar.txt","");
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

    public boolean match(String expected) {
        boolean ret = false;
        if (token.getTypeString().equals(expected)) {
            token = nextToken();
            if (token == null) {
                throw new IllegalStateException("error reading next token");
            }
            ret = true;
        }
        return ret;
    }

    public Token nextToken() {
        try {
            return LexicalAnalyser.getNextToken();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return null;
    }

    public GrammaticalRule getInitRule() {
        return initRule;
    }

    public void setInitRule(GrammaticalRule initRule) {
        this.initRule = initRule;
    }

    private void loadGrammar(String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new BufferedReader(new FileReader(fileName)));
        String line = in.readLine();
        List<Rule> rules = new ArrayList<>();
        while (line != null) {
            Rule r = new Rule(line, this);
            line = in.readLine();
        }
        checkLL1();
        for (Map.Entry<String, GrammaticalRule> entry : getGrammar().entrySet()) {
            entry.getValue().calcFirst();
            rules.addAll(entry.getValue().getRules());
        }
        getInitRule().getSeconds().add(Rule.EOF);
        for (Map.Entry<String, GrammaticalRule> entry : getGrammar().entrySet()) {
            entry.getValue().calcSeconds(rules);
        }
        for (Map.Entry<String, GrammaticalRule> entry : getGrammar().entrySet()) {
            entry.getValue().calcPrediction();
        }
        System.out.println(printGrammar());
        for (Map.Entry<String, GrammaticalRule> entry : getGrammar().entrySet()) {
            entry.getValue().checkConditions();
        }
        in.close();
    }

    private void checkLL1() {
        Map<String, GrammaticalRule> clone = new HashMap<>(getGrammar());
        for (Map.Entry<String, GrammaticalRule> entry : clone.entrySet()) {
            entry.getValue().checkLeftRecusion();
            entry.getValue().checkCommonFactors(0);
        }
    }

    public String printGrammar() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, GrammaticalRule> entry : getGrammar().entrySet()) {
            sb.append(entry.getValue().fullPrint());
            sb.append("\n");
        }
        return sb.toString();
    }

}
