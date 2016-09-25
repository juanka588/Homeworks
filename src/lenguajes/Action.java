/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

/**
 *
 * @author JuanCamilo
 */
public class Action {

    public static final int MATCH = 0;
    public static final int CALL = 1;

    private SyntacticAnalyser context;
    private int type;
    private String functionID;
    private String expectedTokenID;

    public Action(SyntacticAnalyser context, int type, String arg) {
        this.context = context;
        this.type = type;
        if (type == MATCH) {
            this.expectedTokenID = arg;
        } else {
            this.functionID = arg;
        }
    }

    public boolean execute(SyntacticAnalyser context) {
        switch (type) {
            case CALL:
                GrammaticalRule gr = context.getGrammar().get(functionID);
                if (gr == null) {
                    throw new IllegalAccessError("not exiting rule for " + functionID);
                }
                gr.execute();
                return true;
            case MATCH:
                return context.match(expectedTokenID);
        }
        return false;
    }

    @Override
    public String toString() {
        if (type == CALL) {
            return "function to CALL: " + functionID;
        }
        return "MATCH expecting " + expectedTokenID;
    }

    public String getExpectedTokenID() {
        return expectedTokenID;
    }
    

}
