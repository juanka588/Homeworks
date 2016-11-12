/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.antlr;

import java.util.List;
import java.util.Map;

/**
 *
 * @author JuanCamilo
 */
public class Function {

    private String identifier;
    private List<String> argsID;
    private int returnType;
    private PSGrammarParser.CommandContext commands;
    private String returnVar;

    public Function(String identifier, List<String> argsID,
            int returnType, PSGrammarParser.CommandContext command,
            String returnVar) {
        this.identifier = identifier;
        this.argsID = argsID;
        this.returnType = returnType;
        this.commands = command;
        this.returnVar = returnVar;
    }

    public Object call(PSIntVisitor visitor) {
        visitor.currentList++;
        Map<String, Variable> st = visitor.getCurrentSimbolsTable();
        visitor.visit(commands);
        if (returnVar != null) {
            if (!st.containsKey(returnVar)) {
                //se dijo q se retornaba b y nunca tomo valor
                visitor.semanticException("nunca retorno");
            }
            this.setReturnType(st.get(returnVar).getType());
            //flush simbols table
            visitor.getCurrentSimbolsTable().clear();
            visitor.currentList--;
            return st.get(returnVar).getValue();
        }
        this.setReturnType(Variable.TYPE_VOID);
        //flush simbols table
        visitor.getCurrentSimbolsTable().clear();
        visitor.currentList--;
        return null;
    }

    public Object callWithParams(PSIntVisitor visitor, ExpresionList args) {
        visitor.currentList++;
        Map<String, Variable> st = visitor.getCurrentSimbolsTable();
        if (argsID.size() != ((List) args.getExpMatrix().get(0)).size()) {
            System.out.println("error semantico numero incorrecto de parametros al llamra la funcion" + identifier);
            System.exit(1);
        }
        for (int i = 0; i < argsID.size(); i++) {
            st.put(argsID.get(i), new Variable(i, args.get(i)));
        }
        visitor.visit(commands);
        if (returnVar != null) {
            if (!st.containsKey(returnVar)) {
                //se dijo q se retornaba b y nunca tomo valor
                visitor.semanticException("nunca retorno");
            }
            this.setReturnType(st.get(returnVar).getType());
            //flush simbols table
            visitor.getCurrentSimbolsTable().clear();
            visitor.currentList--;
            return st.get(returnVar).getValue();
        }
        this.setReturnType(Variable.TYPE_VOID);
        //flush simbols table
        visitor.getCurrentSimbolsTable().clear();
        visitor.currentList--;
        return null;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getReturnType() {
        return returnType;
    }

    public void setReturnType(int returnType) {
        this.returnType = returnType;
    }

    @Override
    public String toString() {
        return identifier;
    }

}
