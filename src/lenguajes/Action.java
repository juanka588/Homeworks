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

    public Action(SyntacticAnalyser context, int type, String functionID) {
        this.context = context;
        this.type = type;
        this.functionID = functionID;
    }

    
    public void execute(SyntacticAnalyser context, Token current) throws SynctacticException {
        switch (type) {
            case CALL:
                GrammaticalRule gr=context.getGrammar().get(functionID);
                if (gr==null) {
                    throw new IllegalAccessError("not exiting rule for "+functionID);
                }
                gr.execute(current);
                break;
            case MATCH:
                boolean done=context.match(current);
                if (!done) {
                    throw new SynctacticException();
                }
                break;
        }
    }

}
