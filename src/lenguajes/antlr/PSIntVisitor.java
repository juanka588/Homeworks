/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.antlr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author JuanCamilo
 */
public class PSIntVisitor<T> extends PSGrammarBaseVisitor<T> {

    private List<Map<String, Variable>> simbolsTableList = new ArrayList<>();
    private Map<String, Function> functionMap = new HashMap<>();
    private int currentList = 0;
    private static final Logger Log = Logger.getLogger(PSIntVisitor.class.getSimpleName());
    private Scanner scan = new Scanner(System.in);

    @Override
    public T visitTipo(PSGrammarParser.TipoContext ctx) {
        if (ctx.CADENA() != null || ctx.TEXTO() != null) {
            return (T) (Integer) Variable.TYPE_STRING;
        }
        if (ctx.CARACTER() != null) {
            return (T) (Integer) Variable.TYPE_CHAR;
        }
        if (ctx.ENTERO() != null) {
            return (T) (Integer) Variable.TYPE_INTEGER;
        }
        if (ctx.LOGICO() != null) {
            return (T) (Integer) Variable.TYPE_BOOLEAN;
        }
        if (ctx.NUMERICO() != null || ctx.NUMERO() != null) {
            return (T) (Integer) Variable.TYPE_REAL;
        }
        return (T) (Integer) (-1);
    }

    @Override
    public T visitSp(PSGrammarParser.SpContext ctx) {
        String returnVariable = null;
        int firstId = 0;
        if (ctx.TOKEN_ASIG() != null) {
            //hay asignacion y retorno
            returnVariable = ctx.ID(0).getText();
            firstId = 1;
        }
        Map<String, Variable> simbolsTable = getCurrentSimbolsTable();
        String key = ctx.ID(firstId).getText();
        if (simbolsTable.containsKey(key)) {
            //function name equal variable name
            semanticException();
        }
        Function function = new Function(ctx.ID(firstId).getText(), ctx.ID().size() - 1 - firstId, -1, ctx.command());
        functionMap.put(ctx.ID(firstId).getText(), function);
        currentList++;
        Map<String, Variable> st = getCurrentSimbolsTable();
        if (returnVariable != null) {
            if (!st.containsKey(returnVariable)) {
                //se dijo q se retornaba b y nunca tomo valor
                semanticException();
            }
            function.setReturnType(st.get(returnVariable).getType());
            //flush simbols table
            st = new HashMap<>();
            currentList--;
            return (T) st.get(returnVariable).getValue();
        }
        function.setReturnType(Variable.TYPE_VOID);
        //flush simbols table
        st = new HashMap<>();
        currentList--;
        return null;
    }

    @Override
    public T visitClear(PSGrammarParser.ClearContext ctx) {
        System.out.flush();
        return null;
    }

    @Override
    public T visitWait_type(PSGrammarParser.Wait_typeContext ctx) {
        if (ctx.TECLA() != null) {
            //TODO: fix error
            scan.nextLine();
        } else {
            try {
                long millis = (Long) visit(ctx.exp_num());
                if (ctx.unity().SEGUNDOS() != null) {
                    millis = millis * 1000;
                }
                Thread.sleep(millis);
            } catch (Exception e) {
                //not a number exp
                semanticException();
            }
        }
        return null;
    }

    @Override
    public T visitP(PSGrammarParser.PContext ctx) {
        Map<String, Variable> st = getCurrentSimbolsTable();
        if (st.containsKey(ctx.ID().getText())) {
            //process name already defined
            semanticException();
        }
        st.put(ctx.ID().getText(), new Variable(Variable.TYPE_VOID, null));
        visit(ctx.command());
        return null;
    }

    @Override
    public T visitWrite(PSGrammarParser.WriteContext ctx) {
        for (PSGrammarParser.ExpContext exp : ctx.exp()) {
            System.out.println(visit(exp) + "");
        }
        return null;
    }

    @Override
    public T visitDefinition(PSGrammarParser.DefinitionContext ctx) {
        int type = (Integer) visitTipo(ctx.tipo());
        String key;
        Map<String, Variable> simbolsTable = getCurrentSimbolsTable();
        for (TerminalNode ID : ctx.ID()) {
            key = ID.getText();
            if (simbolsTable.containsKey(key)) {
                semanticException();
            }
            simbolsTable.put(key, new Variable(type, null));
            Log.log(Level.INFO, key);
        }
        return null;
    }

    @Override
    public T visitFactor(PSGrammarParser.FactorContext ctx) {
        if (ctx.FALSO() != null || ctx.VERDADERO() != null) {
            return (T) new Boolean(ctx.VERDADERO() != null);
        }
        if (ctx.TOKEN_ENTERO() != null) {
            return (T) new Integer(ctx.TOKEN_ENTERO().getText());
        }
        if (ctx.TOKEN_REAL() != null) {
            return (T) new Double(ctx.TOKEN_REAL().getText());
        }
        if (ctx.TOKEN_PAR_IZR() != null) {
            return visit(ctx.exp());
        }
        if (ctx.ID() != null) {
            //TODO: fix problem functions and array
            Integer complement = (Integer) (visitOpt_complement(ctx.opt_complement()));
            Map<String, Variable> st = getCurrentSimbolsTable();
            if (!st.containsKey(ctx.ID().getText())) {
                //no se ha definido un valor aun
                semanticException();
            }
            return (T) st.get(ctx.ID().getText()).getValue();
        }
        return null;
    }

    private void semanticException() {
        System.out.println("error semantico de re definicion");
        System.exit(1);
    }

    private Map<String, Variable> getCurrentSimbolsTable() {
        while (currentList >= simbolsTableList.size()) {
            simbolsTableList.add(new HashMap<>());
        }
        return simbolsTableList.get(currentList);
    }

}
