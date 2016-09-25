/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author JuanCamilo
 */
public class Rule {

    public static final String EPSILON = "epsilon";
    public static final String EOF = "$";
    /**
     * set of tokenType token for apply a set of Action
     *
     */
    private TreeSet<String> conditions;
    private List<Action> actions;
    private SyntacticAnalyser context;
    private String originalString;
    private SortedSet<String> firsts;
    private List<Term> terms;
    private String id;

    public Rule(String ruleRaw, SyntacticAnalyser context) {
        this.originalString = ruleRaw;
        this.context = context;
        this.terms = new ArrayList<>();
        this.actions = new ArrayList<>();
        this.conditions = new TreeSet<>();
        this.firsts = new TreeSet<>();
        parseRule(ruleRaw);
    }

    private void parseRule(String ruleRaw) {
        String[] split = ruleRaw.split("\\s+");
        id = split[0];
        String temp;
        //System.out.println("asignation simbol " + split[1]);
        for (int i = 2; i < split.length; i++) {
            temp = split[i];
            if (!EPSILON.equals(temp.toLowerCase())) {
                //check if is a non terminal
                if (temp.equals(temp.toUpperCase())) {
                    terms.add(new Term(Term.NO_TERMINAL, temp));
                    actions.add(new Action(context, Action.CALL, temp));
                } else {
                    terms.add(new Term(Term.TERMINAL, temp));
                    actions.add(new Action(context, Action.MATCH, temp));
                }
            } else {
                terms.add(new Term(Term.TERMINAL, EPSILON));
                if (split.length > 3) {
                    throw new IllegalAccessError("epsilon rule must be alone");
                }
            }
        }
        GrammaticalRule gr = context.getGrammar().get(id);
        if (gr == null) {
            gr = new GrammaticalRule(id, context);
            if (context.getInitRule() == null) {
                context.setInitRule(gr);
            }
        }
        gr.addRule(this);
        context.getGrammar().put(id, gr);
    }

    public TreeSet<String> getConditions() {
        return conditions;
    }

    public void setConditions(TreeSet<String> conditions) {
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

    public void executeActions(SyntacticAnalyser context) {
        boolean excution = true;
        for (Action action : actions) {
            excution = excution && action.execute(context);
            if (!excution) {
                System.out.println("actual rule: "+toString());
                System.out.println("action: "+action.toString());
                new SynctacticException(
                        Collections.singletonList(action.getExpectedTokenID()), 
                        context.getToken());
            }
        }
    }

    public List<Term> getTerms() {
        return terms;
    }

    public void setTerms(List<Term> terms) {
        this.terms = terms;
    }

    public SortedSet<String> calcFirst(List<Term> terms) {
        SortedSet<String> other;
        SortedSet<String> frst = new TreeSet<>();
        if (terms.isEmpty()) {
            //case final reach final of string
            frst.add(Rule.EPSILON);
            return frst;
        }
        if (terms.get(0).getType() == Term.TERMINAL) {
            frst.add(terms.get(0).getIdentifier());
        } else if (terms.get(0).getType() == Term.NO_TERMINAL) {
            GrammaticalRule gr = context.getGrammar().get(terms.get(0).getIdentifier());
            if (gr.getFirsts().isEmpty()) {
                gr.calcFirst();
            }
            other = new TreeSet<>(gr.getFirsts());
            if (other.contains(EPSILON)) {
                other.remove(EPSILON);
                if (other.isEmpty()) {
                    frst.add(EPSILON);
                } else {
                    List<Term> copy = new ArrayList<>(terms);
                    frst.addAll(other);
                    if (!copy.isEmpty()) {
                        copy.remove(0);
                        frst.addAll(calcFirst(copy));
                    }
                }
            } else {
                frst.addAll(other);
            }
        }
        return frst;
    }

    public SortedSet<String> calcFirst() {
        if (firsts.isEmpty()) {
            firsts = calcFirst(terms);
            return firsts;
        }
        return firsts;
    }

    public void calcConditions() {
        if (firsts.contains(EPSILON)) {
            SortedSet<String> clone = new TreeSet<>(firsts);
            clone.remove(EPSILON);
            conditions.addAll(clone);
            conditions.addAll(context.getGrammar().get(id).getSeconds());
        } else {
            conditions.addAll(firsts);
        }
    }

    @Override
    public String toString() {
        return originalString;
    }

    public List<Term> getTerms(String id) {
        List<Term> terms2 = new ArrayList<>();
        boolean add = false;
        for (Term term : terms) {
            if (add) {
                terms2.add(term);
            }
            add = add || term.getIdentifier().equals(id);
        }
        if (terms2.isEmpty()) {
            terms2.add(new Term(Term.TERMINAL, EPSILON));
        }
        return terms2;
    }

    public String getID() {
        return id;
    }

    public String getOriginalString() {
        return originalString;
    }

    public void setOriginalString(String originalString) {
        this.originalString = originalString;
    }

    public String printPrediction() {
        return Utils.printSet(id, "predictions", conditions);
    }

}
