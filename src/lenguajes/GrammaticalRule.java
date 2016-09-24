/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import static lenguajes.Utils.printSet;

/**
 *
 * @author JuanCamilo
 */
public class GrammaticalRule {

    private String id;
    private List<Rule> rules;
    private SortedSet<String> firsts;
    private SortedSet<String> seconds;
    private SyntacticAnalyser context;
    private boolean calculated;

    public GrammaticalRule(String id, SyntacticAnalyser context) {
        this.id = id;
        this.context = context;
        this.rules = new ArrayList<>();
        this.firsts = new TreeSet<>();
        this.seconds = new TreeSet<>();
        calculated = false;
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

    public SyntacticAnalyser getContext() {
        return context;
    }

    public void setContext(SyntacticAnalyser context) {
        this.context = context;
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
    }

    public void execute() {
        String key = context.getToken().getTypeString();
        for (Rule rule : rules) {
            if (rule.getConditions().contains(key)) {
                System.out.println("rule executed: " + rule.toString());
                rule.executeActions(context);
                return;
            }
        }
        new SynctacticException(firsts, context.getToken());
    }

    public SortedSet<String> getFirsts() {
        return firsts;
    }

    public void setFirsts(SortedSet<String> firsts) {
        this.firsts = firsts;
    }

    public SortedSet<String> getSeconds() {
        return seconds;
    }

    public void setSeconds(SortedSet<String> seconds) {
        this.seconds = seconds;
    }

    public void calcFirst() {
        if (firsts.isEmpty()) {
            for (Rule rule : rules) {
                firsts.addAll(rule.calcFirst());
            }
        }
    }

    public void calcSeconds(List<Rule> allRules) {
        if (allRules.isEmpty()) {
            return;
        }
        List<Rule> possibles = getSeconds(allRules);
        if (seconds.size() == 1 && seconds.contains(Rule.EOF)) {
            getSecondsSet(possibles, allRules);
            return;
        }
        if (seconds.isEmpty()) {
            getSecondsSet(possibles, allRules);
        }
        calculated = true;
    }

    public void calcPrediction() {
        for (Rule rule : rules) {
            rule.calcConditions();
        }
    }

    private List<Rule> getSeconds(List<Rule> rules) {
        List<Rule> possible = new ArrayList<>();
        for (Rule rule : rules) {
            if (contains(rule.getTerms(), id)) {
                possible.add(rule);
            }
        }
        return possible;
    }

    private void getSecondsSet(List<Rule> possibles, List<Rule> allRules) {
        List<Term> terms;
        SortedSet<String> firsts2, seconds2;
        for (Rule possible : possibles) {
            terms = possible.getTerms(id);
            firsts2 = possible.calcFirst(terms);
            if (firsts2.contains(Rule.EPSILON)) {
                firsts2.remove(Rule.EPSILON);
                seconds.addAll(firsts2);
                GrammaticalRule ruleToDerivate = context.getGrammar().get(possible.getID());
                if (!ruleToDerivate.calculated) {
                    List<Rule> copy = new ArrayList<>(allRules);
                    copy.remove(possible);
                    ruleToDerivate.calcSeconds(copy);
                }
                seconds2 = new TreeSet<>(ruleToDerivate.getSeconds());
                seconds.addAll(seconds2);
            } else {
                seconds.addAll(firsts2);
            }
        }
    }

    private boolean contains(List<Term> terms, String id) {
        for (Term term : terms) {
            if (term.getIdentifier().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ID: " + id + " sub rules " + rules.size();
    }

    public void checkConditions() {
        TreeSet<String> allCond = new TreeSet<>();
        for (Rule rule : rules) {
            for (String cond : rule.getConditions()) {
                if (allCond.contains(cond)) {
                    System.out.println("there are repeated conditions");
                    System.out.println("rule: " + rule.toString());
                    System.out.println("condition: " + cond);
                    System.exit(1);
                } else {
                    allCond.add(cond);
                }
            }
        }
    }

    public void checkLeftRecusion() {
        List<Rule> recussion = new ArrayList<>();
        for (Rule rule : rules) {
            if (rule.getTerms().get(0).getIdentifier().equals(rule.getID())) {
                System.out.println("left recussion detected " + rule.toString());
                recussion.add(rule);
            }
        }
        fixRecurssion(recussion);
    }

    public void checkCommonFactors(int iter) {
        List<Rule> commonRules = new ArrayList<>();
        String termID, otherID;
        for (int i = 0; i < rules.size(); i++) {
            termID = rules.get(i).getTerms().get(0).getIdentifier();
            if (!Rule.EPSILON.equals(termID)) {
                for (int j = i + 1; j < rules.size(); j++) {
                    otherID = rules.get(j).getTerms().get(0).getIdentifier();
                    if (termID.equals(otherID)) {
                        System.out.println("common factors detected");
                        commonRules.add(rules.get(i));
                        commonRules.add(rules.get(j));
                    }
                }
            }
        }
        fixCommonFactors(commonRules, iter);
    }

    private void fixRecurssion(List<Rule> recussion) {
        if (recussion.isEmpty()) {
            return;
        }
        String nId = this.id + "_FIX";
        String raw;
        String[] split;
        for (Rule recRule : recussion) {
            this.rules.remove(recRule);
            raw = recRule.toString();
            split = raw.split("->");
            raw = split[0].replaceAll(recRule.getID(), nId);
            raw = raw + " -> " + split[1].replaceFirst(recRule.getID(), "");
            raw = raw + " " + nId;
            new Rule(raw, context);
        }
        for (Rule rule : rules) {
            rule.getTerms().add(new Term(Term.NO_TERMINAL, nId));
            //case epsilon
            if (rule.getActions().isEmpty()) {
                rule.setOriginalString(rule.getID() + " -> " + nId);
            } else {
                rule.setOriginalString(rule.toString() + " " + nId);
            }

        }
        new Rule(nId + " -> " + Rule.EPSILON, context);
    }

    private void fixCommonFactors(List<Rule> commonRules, int i) {
        if (commonRules.isEmpty()) {
            return;
        }
        String nId = this.id + "_" + i;
        String raw;
        String commonFactor = null;
        for (Rule recRule : commonRules) {
            this.rules.remove(recRule);
            commonFactor = recRule.getTerms().get(0).getIdentifier();
            raw = recRule.toString();
            raw = raw.replaceAll(commonFactor, "");
            raw = raw.replaceAll(recRule.getID(), nId);
            new Rule(raw, context);
        }
        new Rule(id + " -> " + commonFactor + " " + nId, context);
        checkCommonFactors(i + 1);
    }

    public String printFirst() {
        return printSet(id, "firsts", firsts);
    }

    public String printSeconds() {
        return printSet(id, "next", seconds);
    }

    public String fullPrint() {
        StringBuilder sb = new StringBuilder();
        sb.append("------");
        sb.append(id);
        sb.append("------");
        sb.append("\n");
        sb.append(printFirst());
        sb.append("\n");
        sb.append(printSeconds());
        sb.append("\n");
        for (Rule rule : rules) {
            sb.append(rule.toString());
            sb.append("\t\t\t\t\t\t\t\t\t");
            sb.append(rule.printPrediction());
            sb.append("\n");
        }
        return sb.toString();
    }

}
