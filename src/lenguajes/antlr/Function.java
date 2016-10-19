/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.antlr;

/**
 *
 * @author JuanCamilo
 */
public class Function {

    private String identifier;
    private int argsNumber;
    private int returnType;
    private PSGrammarParser.CommandContext commands;

    public Function(String identifier, int argsNumber, int returnType, PSGrammarParser.CommandContext command) {
        this.identifier = identifier;
        this.argsNumber = argsNumber;
        this.returnType = returnType;
        this.commands = command;
    }

    public Object call(PSGrammarBaseVisitor visitor) {
        return visitor.visitCommand(commands);
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getArgsNumber() {
        return argsNumber;
    }

    public int getReturnType() {
        return returnType;
    }

    public void setReturnType(int returnType) {
        this.returnType = returnType;
    }

}
