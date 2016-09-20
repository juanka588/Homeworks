/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.util.List;
import java.util.Map;

/**
 *
 * @author JuanCamilo
 */
public class Rule {

    /**
     * map of tokenType token for apply a set of Action this map must be fill
     * using predictions sets
     *
     */
    private Map<String, Token> conditions;
    private List<Action> actions;
    private SyntacticAnalyser context;
    private String originalString;

    public Rule(String ruleRaw) {
        this.originalString = ruleRaw;
        parseRule(ruleRaw);
    }

    private void parseRule(String ruleRaw) {
        this.originalString = ruleRaw;
        String[] split = ruleRaw.split("\\S");
        String id = split[0];
        String temp;
        System.out.println("asignation simbol " + split[1]);
        for (int i = 2; i < split.length; i++) {
            temp = split[i];
            //check if is a non terminal
            if (temp.equals(temp.toUpperCase())) {
                actions.add(new Action(context, Action.CALL, temp));
            } else {
                actions.add(new Action(context, Action.MATCH, ""));
            }
        }
        GrammaticalRule gr = context.getGrammar().get(id);
        if (gr == null) {
            gr = new GrammaticalRule(id, context);
        }
        gr.addRule(this);
        context.getGrammar().put(id, gr);
    }

    public Map<String, Token> getConditions() {
        return conditions;
    }

    public void setConditions(Map<String, Token> conditions) {
        this.conditions = conditions;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public SyntacticAnalyser getContext() {
        return context;
    }

    public void setContext(SyntacticAnalyser context) {
        this.context = context;
    }

    public void executeActions(SyntacticAnalyser context, Token current) throws SynctacticException {
        for (Action action : actions) {
            action.execute(context, current);
        }

    }

    @Override
    public String toString() {
        return originalString;
    }

}
