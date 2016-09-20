/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JuanCamilo
 */
public class GrammaticalRule {

    private String id;
    private List<Rule> rules;
    private Map<String, Token> predictionSet;
    private SyntacticAnalyser context;

    public GrammaticalRule(String id, SyntacticAnalyser context) {
        this.id = id;
        this.context = context;
        this.rules = new ArrayList<>();
        this.predictionSet = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public Map<String, Token> getPredictionSet() {
        return predictionSet;
    }

    public void setPredictionSet(Map<String, Token> predictionSet) {
        this.predictionSet = predictionSet;
    }

    public SyntacticAnalyser getContext() {
        return context;
    }

    public void setContext(SyntacticAnalyser context) {
        this.context = context;
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
    }

    public void execute(Token current) throws SynctacticException {
        Token get;
        for (Rule rule : rules) {
            get = rule.getConditions().get(current.getTypeString());
            if (get != null) {
                System.out.println("rule executed: " + rule.toString());
                rule.executeActions(context, current);
            }
        }
    }
}
