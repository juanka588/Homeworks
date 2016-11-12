/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.antlr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
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

    private static final int EQUAL_OPT = 100, DIFF_OPT = 101, LE_OPT = 102,
            LT_OPT = 103, GE_OPT = 104, GT_OPT = 105, PLUS_OPT = 106,
            MINUS_OPT = 107, NO_COMPLEMENT = 108, ARGS_CALLED = 109, ARRAY_POS = 110,
            MOD_OPT = 111, MUL_OPT = 112, DIV_OPT = 113, NEGATION_OPT = 114;
    private static final double TOL_RATE = 1e-9;
    public List<Map<String, Variable>> simbolsTableList = new ArrayList<>();
    public Map<String, Function> functionMap = new HashMap<>();
    public int currentList = 0, currentSW = -1, currentID = -1;
    private static final Logger Log = Logger.getLogger(PSIntVisitor.class.getSimpleName());
    private Scanner scan = new Scanner(System.in);
    public List<Long> switchConditions = new ArrayList<>();
    public List<String> tempIDs = new ArrayList<>();
    
    
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
        if (ctx.NUMERICO() != null || ctx.NUMERO() != null || ctx.REAL() != null) {
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
        String key = ctx.ID(firstId).getText();
        checkUnique(key);
        List<TerminalNode> ids = ctx.ID();
        List<String> identifiers = new ArrayList<>();
        for (int i = firstId + 1; i < ids.size(); i++) {
            identifiers.add(ids.get(i).getText());
        }
        Function function = new Function(ctx.ID(firstId).getText(),
                identifiers, -1, ctx.command(), returnVariable);
        functionMap.put(ctx.ID(firstId).getText(), function);

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
            scan.nextLine();
        } else {
            T exp = visit(ctx.exp_num());
            checkType(exp, Long.class);
            long millis = (Long) exp;
            if (ctx.unity().SEGUNDOS() != null) {
                millis = millis * 1000;
            }
            try {
                Thread.sleep(millis);
            } catch (InterruptedException ex) {
                Log.log(Level.WARNING, ex.toString());
            }
        }
        return null;
    }

    @Override
    public T visitRead(PSGrammarParser.ReadContext ctx) {
        String key = ctx.ID().getText();
        Map<String, Variable> st = getCurrentSimbolsTable();
        checkDefinition(key);
        Variable var = st.get(key);
        var.setValue(scan.nextLine());
        return null;
    }

    @Override
    public T visitP(PSGrammarParser.PContext ctx) {
        Map<String, Variable> st = getCurrentSimbolsTable();
        checkUnique(ctx.ID().getText());
        st.put(ctx.ID().getText(), new Variable(Variable.TYPE_VOID, null));
        visit(ctx.command());
        return null;
    }

    @Override
    public T visitWrite(PSGrammarParser.WriteContext ctx) {
        for (PSGrammarParser.ExpContext exp : ctx.exp()) {
            System.out.print(String.valueOf(visit(exp)));
        }
        System.out.println("");
        return null;
    }

    @Override
    public T visitDefinition(PSGrammarParser.DefinitionContext ctx) {
        int type = (Integer) visitTipo(ctx.tipo());
        String key;
        Map<String, Variable> simbolsTable = getCurrentSimbolsTable();
        for (TerminalNode ID : ctx.ID()) {
            key = ID.getText();
            checkUnique(key);
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
            return (T) new Long(ctx.TOKEN_ENTERO().getText());
        }
        if (ctx.TOKEN_REAL() != null) {
            return (T) new Double(ctx.TOKEN_REAL().getText());
        }
        if (ctx.TOKEN_PAR_IZR() != null) {
            return visit(ctx.exp());
        }
        if (ctx.ID() != null) {
            currentID++;
            setCurrentTempID(ctx.ID().getText());
            ExpresionList list = new ExpresionList(new ArrayList(), 1);

            if (ctx.opt_complement() != null) {
                list = (ExpresionList) (visit(ctx.opt_complement()));
            } else {
                list.setFilled(false);
            }
            Map<String, Variable> st = getCurrentSimbolsTable();

            Function fun = functionMap.get(ctx.ID().getText());
            if (list.isFilled()) {
                return (T) fun.callWithParams(this, list);
            } else {
                if (fun != null) {
                    return (T) fun.call(this);
                }
                checkDefinition(ctx.ID().getText());
                return (T) st.get(ctx.ID().getText()).getValue();
            }

        }
        if (ctx.TOKEN_CADENA() != null) {
            return (T) ctx.TOKEN_CADENA().getText().replaceAll("\"", "").replaceAll("\'", "");
        }
        return null;
    }

    @Override
    public T visitIf_sentence(PSGrammarParser.If_sentenceContext ctx) {
        Boolean cond = (Boolean) visit(ctx.exp());
        if (cond) {
            visit(ctx.command());
        } else {
            visit(ctx.end_if());
        }
        return null;
    }

    @Override
    public T visitEnd_if(PSGrammarParser.End_ifContext ctx) {
        if (ctx.SINO() != null) {
            return visit(ctx.command());
        }
        return null;
    }

    @Override
    public T visitWhile_sentence(PSGrammarParser.While_sentenceContext ctx) {
        Boolean cond = (Boolean) visit(ctx.exp());
        while (cond) {
            visit(ctx.command());
            cond = (Boolean) visit(ctx.exp());
        }
        return null;
    }

    @Override
    public T visitDowhile_sentence(PSGrammarParser.Dowhile_sentenceContext ctx) {
        do {
            visit(ctx.command());
        } while ((Boolean) visit(ctx.exp()));
        return null;
    }

    @Override
    public T visitFor_sentence(PSGrammarParser.For_sentenceContext ctx) {
        String key = ctx.ID().getText();
        checkDefinition(key);
        Variable var = getCurrentSimbolsTable().get(key);
        if (var.getType() != Variable.TYPE_INTEGER) {
            if (var.getType() != Variable.TYPE_REAL) {
                //not allowed for iterator variable
                semanticException("el tipo de varible no se soporta como iteradora " + var.getTypeString());
            }
        }
        var.setValue(visit(ctx.exp()));

        T exp1 = (T) var.getValue(), exp2 = visit(ctx.exp_num(0));
        checkType(exp1, Double.class, Long.class);
        checkType(exp2, Double.class, Long.class);
        Double initVal = toDouble(exp1);
        Double finishVal = toDouble(exp2);
        Long step = 1L;
        if (ctx.CON() != null) {
            step = (Long) visit(ctx.exp_num(1));
        }
        for (double i = initVal; i <= finishVal; i = i + step) {
            var.setValue(i);
            visit(ctx.command());
        }
        return null;
    }

    @Override
    public T visitSwitch_sentence(PSGrammarParser.Switch_sentenceContext ctx) {
        currentSW++;
        T exp = visit(ctx.exp_num());
        checkType(exp, Long.class);
        setCurrentSwitchCondition((Long) exp);
        Boolean done = (Boolean) visit(ctx.case_sentence());
        if (!done) {
            visit(ctx.default_case());
        }
        currentSW--;
        return null;
    }

    @Override
    public T visitCase_sentence(PSGrammarParser.Case_sentenceContext ctx) {
        Long condition = getCurrentSwitchCondition();
        T exp = visit(ctx.exp_num());
        checkType(exp, Long.class);
        Long caseVal = (Long) exp;
        if (condition.equals(caseVal)) {
            visit(ctx.command());
            return (T) new Boolean(true);
        }
        visit(ctx.case_sentence());
        return (T) new Boolean(false);
    }

    @Override
    public T visitContinueID(PSGrammarParser.ContinueIDContext ctx) {
        currentID++;
        setCurrentTempID(ctx.ID().getText());
        return visitChildren(ctx);
    }

    @Override
    public T visitAlloc(PSGrammarParser.AllocContext ctx) {
        T value = visit(ctx.exp());
        String key = getCurrentTempID();
        ExpresionList arrayPosList = new ExpresionList(new ArrayList(), ExpresionList.TYPE_ARG);
        for (PSGrammarParser.Array_posContext array_po : ctx.array_pos()) {
            arrayPosList.add((ExpresionList) visit(array_po));
        }
        if (arrayPosList.isFilled()) {
            key += arrayPosList.toString();
        }
        Map<String, Variable> st = getCurrentSimbolsTable();
        if (st.containsKey(key)) {
            Variable var = st.get(key);
            var.setValue(value);
        } else {
            //not definition found
            semanticException("non def found");
        }
        currentID--;
        return null;
    }

    @Override
    public T visitOpt_args(PSGrammarParser.Opt_argsContext ctx) {
        return visit(ctx.args());
    }

    @Override
    public T visitFunctionCall(PSGrammarParser.FunctionCallContext ctx) {
        String key = getCurrentTempID();
        ExpresionList args = (ExpresionList) visit(ctx.opt_args());
        Function f = functionMap.get(key);
        if (f == null) {
            //not function defined
            semanticException("la funcion no existe " + f.getIdentifier());
        }
        currentID--;
        if (args.isFilled()) {
            return (T) f.callWithParams(this, args);
        } else {
            return (T) f.call(this);
        }
    }

    @Override
    public T visitArgs(PSGrammarParser.ArgsContext ctx) {
        ExpresionList list = new ExpresionList(new ArrayList(), ExpresionList.TYPE_ARG);
        for (PSGrammarParser.ExpContext exp : ctx.exp()) {
            T value = visit(exp);
            list.addValue(visit(exp));
        }
        return (T) list;
    }

    @Override
    public T visitArray_pos(PSGrammarParser.Array_posContext ctx) {
        ExpresionList list = new ExpresionList(new ArrayList(), ExpresionList.TYPE_ARRAY);
        for (PSGrammarParser.Exp_numContext exp : ctx.exp_num()) {
            T value = visit(exp);
            list.addValue((Object) value);
        }
        return (T) list;
    }

    @Override
    public T visitArray_call(PSGrammarParser.Array_callContext ctx) {
        ExpresionList list = new ExpresionList(new ArrayList(), ExpresionList.TYPE_ARRAY);
        for (PSGrammarParser.Array_posContext array_po : ctx.array_pos()) {
            list.addValue(visit(array_po));
        }
        return (T) list;
    }

    @Override
    public T visitOr_operation(PSGrammarParser.Or_operationContext ctx) {
        T org1 = visit(ctx.exp());
        checkType(org1, Boolean.class);
        T org2 = visit(ctx.b_term());
        checkType(org2, Boolean.class);
        Boolean exp1 = (Boolean) org1;
        Boolean exp2 = (Boolean) org2;
        return (T) (Boolean) (exp1 || exp2);
    }

    @Override
    public T visitAnd_operation(PSGrammarParser.And_operationContext ctx) {
        T org1 = visit(ctx.b_term());
        checkType(org1, Boolean.class);
        T org2 = visit(ctx.eq_factor());
        checkType(org2, Boolean.class);
        Boolean exp1 = (Boolean) org1;
        Boolean exp2 = (Boolean) org2;
        return (T) (Boolean) (exp1 && exp2);
    }

    @Override
    public T visitEquals_operation(PSGrammarParser.Equals_operationContext ctx) {
        T exp1 = visit(ctx.b_factor(0));
        T exp2 = visit(ctx.b_factor(1));
        Integer opt = (Integer) visit(ctx.dif_opt());
        switch (opt) {
            case EQUAL_OPT:
                return (T) (Boolean) exp1.equals(exp2);
            case DIFF_OPT:
                return (T) (Boolean) !exp1.equals(exp2);
        }
        return null;
    }

    @Override
    public T visitDif_opt(PSGrammarParser.Dif_optContext ctx) {
        if (ctx.TOKEN_IGUAL() != null) {
            return (T) (Integer) EQUAL_OPT;
        } else {
            return (T) (Integer) DIFF_OPT;
        }
    }

    @Override
    public T visitRel_opt(PSGrammarParser.Rel_optContext ctx) {
        if (ctx.TOKEN_MAYOR() != null) {
            return (T) (Integer) GT_OPT;
        }
        if (ctx.TOKEN_MAYOR_IGUAL() != null) {
            return (T) (Integer) GE_OPT;
        }
        if (ctx.TOKEN_MENOR() != null) {
            return (T) (Integer) LT_OPT;
        }
        if (ctx.TOKEN_MENOR_IGUAL() != null) {
            return (T) (Integer) LE_OPT;
        }
        return null;
    }

    @Override
    public T visitRel_operation(PSGrammarParser.Rel_operationContext ctx) {
        T orgVal = visit(ctx.exp_num(0));
        T orgVal2 = visit(ctx.exp_num(1));
      //  System.out.println("exp0: "+ctx.exp_num(0).getText()+" exp1: "+ctx.exp_num(1).getText());
        checkTypes(orgVal, orgVal2);
        Comparable exp1;
        Comparable exp2;
        if (orgVal instanceof String) {
            exp1 = (String) orgVal;
        } else {
            exp1 = toDouble(orgVal);
        }
        if (orgVal2 instanceof String) {
            exp2 = (String) orgVal2;
        } else {
            exp2 = toDouble(orgVal2);
        }
        Integer opt = (Integer) visit(ctx.rel_opt());
        switch (opt) {
            case LE_OPT:
                return (T) (Boolean) (exp1.compareTo(exp2) <= 0);
            case LT_OPT:
                return (T) (Boolean) (exp1.compareTo(exp2) < 0);
            case GE_OPT:
                return (T) (Boolean) (exp1.compareTo(exp2) >= 0);
            case GT_OPT:
                return (T) (Boolean) (exp1.compareTo(exp2) > 0);
        }
        return null;
    }

    @Override
    public T visitSum_operation(PSGrammarParser.Sum_operationContext ctx) {
        T orgVal = visit(ctx.exp_num());
        checkType(orgVal, Double.class, Long.class);
        T orgVal2 = visit(ctx.mod_term());
        checkType(orgVal2, Double.class, Long.class);
        Double exp1 = toDouble(orgVal);
        Double exp2 = toDouble(orgVal2);
        Double result;
        Integer opt = (Integer) visit(ctx.sum_opt());
        switch (opt) {
            case PLUS_OPT:
                result = exp1 + exp2;
                return (T) checkValueDiff(result, Math.floor(result));
            case MINUS_OPT:
                result = exp1 - exp2;
                return (T) checkValueDiff(result, Math.floor(result));
        }
        return null;
    }

    @Override
    public T visitMul_mod_operation(PSGrammarParser.Mul_mod_operationContext ctx) {
        T orgVal = visit(ctx.mod_term());
        checkType(orgVal, Double.class, Long.class);
        T orgVal2 = visit(ctx.s_term());
        checkType(orgVal2, Double.class, Long.class);
        Double exp1 = toDouble(orgVal);
        Double exp2 = toDouble(orgVal2);
        Double result;
        Integer opt = (Integer) visit(ctx.mul_opt());
        switch (opt) {
            case MUL_OPT:
                result = exp1 * exp2;
                return (T) checkValueDiff(result, Math.floor(result));
            case DIV_OPT:
                if (exp2 <= TOL_RATE) {
                    //is zero
                    semanticException("error de ejecucion division por 0");
                }
                result = exp1 / exp2;
                return (T) checkValueDiff(result, Math.floor(result));
            case MOD_OPT:
                Long expL1 = (Long) exp1.longValue();
                Long expL2 = (Long) exp2.longValue();
                return (T) (Long) (expL1 % expL2);
        }
        return null;
    }

    @Override
    public T visitPot_operation(PSGrammarParser.Pot_operationContext ctx) {
        T orgVal = visit(ctx.s_term());
        checkType(orgVal, Double.class, Long.class);
        T orgVal2 = visit(ctx.not_factor());
        checkType(orgVal2, Double.class, Long.class);
        Double exp1 = toDouble(orgVal);
        Double exp2 = toDouble(orgVal2);
        Double result = Math.pow(exp1, exp2);
        return (T) checkValueDiff(result, Math.floor(result));
    }

    @Override
    public T visitNegation_operation(PSGrammarParser.Negation_operationContext ctx) {
        T orgVal = visit(ctx.not_factor());
        checkType(orgVal, Boolean.class);
        Boolean val = (Boolean) orgVal;
        return (T) (Boolean) !val;
    }

    @Override
    public T visitToken_neg(PSGrammarParser.Token_negContext ctx) {
        return (T) (Integer) NEGATION_OPT;
    }

    @Override
    public T visitSum_opt(PSGrammarParser.Sum_optContext ctx) {
        if (ctx.TOKEN_MAS() != null) {
            return (T) (Integer) PLUS_OPT;
        }
        if (ctx.TOKEN_MENOS() != null) {
            return (T) (Integer) MINUS_OPT;
        }
        return null;
    }

    @Override
    public T visitMul_opt(PSGrammarParser.Mul_optContext ctx) {
        if (ctx.TOKEN_DIV() != null) {
            return (T) (Integer) DIV_OPT;
        }
        if (ctx.token_mod() != null) {
            return (T) (Integer) MOD_OPT;
        }
        if (ctx.TOKEN_MUL() != null) {
            return (T) (Integer) MUL_OPT;
        }
        return null;
    }

    public void semanticException(String description) {
        System.out.println(description);
        System.exit(1);
    }

    public Map<String, Variable> getCurrentSimbolsTable() {
        while (currentList >= simbolsTableList.size()) {
            simbolsTableList.add(new HashMap<>());
        }
        return simbolsTableList.get(currentList);
    }

    public Long getCurrentSwitchCondition() {
        while (currentSW >= switchConditions.size()) {
            simbolsTableList.add(null);
        }
        return switchConditions.get(currentSW);
    }

    public void checkDefinition(String id) {
        Map<String, Variable> st = getCurrentSimbolsTable();
        if (!st.containsKey(id)) {
            //variable not defined yet
            semanticException("la variable " + id + " no ha sido definida");
        }
    }

    @Override
    public T visitDef_dim(PSGrammarParser.Def_dimContext ctx) {
        String key = ctx.ID().getText();
        checkDefinition(key);
        ExpresionList eList = new ExpresionList(new ArrayList(), getCurrentSimbolsTable().get(key).getType());
        for (PSGrammarParser.Array_posContext array_po : ctx.array_pos()) {
            eList.add((ExpresionList) visit(array_po));
        }
      //  putSimbols(eList, getCurrentSimbolsTable());
        return visitChildren(ctx);
    }

    public void checkUnique(String key) {
        Map<String, Variable> st = getCurrentSimbolsTable();
        if (st.containsKey(key)) {
            //function name equal variable name
            semanticException("el nombre " + key + "ya ha hido definido");
        }
    }

    public void setCurrentSwitchCondition(Long condition) {
        while (currentSW > switchConditions.size()) {
            switchConditions.add(-1L);
        }
        switchConditions.set(currentSW, condition);
    }

    public void checkTypes(T exp1, T exp2) {
        if (exp1 instanceof String && !(exp2 instanceof String)) {
            //diferents types operation
            semanticException("operacion no soportada para estos tipos: String");
        }
        if (exp1 instanceof Long || exp1 instanceof Double) {
            if (!(exp2 instanceof Long || exp2 instanceof Double)) {
                semanticException("operacion no soportada para estos tipos Double");
            }
        }
    }

    public void checkType(T exp1, Class... expected) {
        boolean any = false;
        for (Class c1 : expected) {
            any = any || exp1.getClass().equals(c1);
        }
        if (!any) {
            semanticException("la expresion es: " + exp1.getClass() + " se esperaba " + Arrays.toString(expected));
        }
    }

    private void setCurrentTempID(String text) {
        while (currentID >= tempIDs.size()) {
            tempIDs.add("");
        }
        tempIDs.set(currentID, text);
    }

    private String getCurrentTempID() {
        return tempIDs.get(currentID);
    }

    private T checkValueDiff(Double result, double floor) {
        if ((result - floor) < TOL_RATE) {
            return (T) (Long) ((long) floor);
        }
        return (T) result;
    }

    private Double toDouble(T orgVal) {
        Long temp;
        if (orgVal.getClass().equals(Long.class)) {
            temp = (Long) orgVal;
            return new Double(temp.longValue());
        }
        return (Double) orgVal;
    }

    private void putSimbols(String id,Variable var,ExpresionList eList, Map<String, Variable> currentSimbolsTable) {
        List someLists = (eList.getExpMatrix());
        T value;
        for (int j = 0; j < someLists.size(); j++) {
            value = (T) someLists.get(j);
            checkType(value, Long.class);
            currentSimbolsTable.put(id+"[", new Variable(var.getType(), null));
        }

    }

}
