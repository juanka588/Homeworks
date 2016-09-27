/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JuanCamilo
 */
public class SyntacticAnalyser {

    /**
     * String identifier of every grammatical rule
     */
    private Map<String, GrammaticalRule> grammar;
    private Token token;
    private GrammaticalRule initRule;
    private boolean debug;

    public SyntacticAnalyser(String grammarFile, String fileName, boolean debug) throws IOException, FileNotFoundException, LexicalException {
        this.grammar = new HashMap<>();
        LexicalAnalyser.init(fileName);
        this.token = LexicalAnalyser.token;
        this.debug = debug;
        initRule = null;
        loadGrammar(grammarFile);
    }

    public SyntacticAnalyser() throws IOException, FileNotFoundException, LexicalException {
        this("grammar.txt", "", false);
    }

    public Map<String, GrammaticalRule> getGrammar() {
        return grammar;
    }

    public void setGrammar(Map<String, GrammaticalRule> grammar) {
        this.grammar = grammar;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public boolean match(String expected) {
        boolean ret = false;
        if (token.getTypeString().equals(expected)) {
            token = nextToken();
            if (token == null) {
                throw new IllegalStateException("error reading next token");
            }
            ret = true;
        }
        return ret;
    }

    public Token nextToken() {
        try {
            return LexicalAnalyser.getNextToken();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return null;
    }

    public GrammaticalRule getInitRule() {
        return initRule;
    }

    public void setInitRule(GrammaticalRule initRule) {
        this.initRule = initRule;
    }

    private void loadGrammar(String fileName) throws IOException {
        List<Rule> rules = new ArrayList<>();
        List<String> lines = new ArrayList<>();
        lines.add("S -> SP_LIST P");
        lines.add("SP_LIST -> epsilon");
        lines.add("SP_LIST -> SP SP_LIST");
        lines.add("SP -> subproceso id COMPLEMENT OPT_SP C END_SUBPRO");
        lines.add("END_SUBPRO -> finsubproceso");
        lines.add("END_SUBPRO -> finfuncion");
        lines.add("COMPLEMENT -> token_asig id");
        lines.add("COMPLEMENT -> epsilon");
        lines.add("OPT_SP -> epsilon");
        lines.add("OPT_SP -> token_par_izq OPT_PARAM token_par_der");
        lines.add("OPT_PARAM -> id ID_LIST");
        lines.add("OPT_PARAM -> epsilon");
        lines.add("OPT_ARGS -> token_par_izq ARGS token_par_der");
        lines.add("ARGS -> epsilon");
        lines.add("ARGS -> E E_LIST");
        lines.add("P -> MAIN_BEGIN id C MAIN_END");
        lines.add("MAIN_BEGIN -> proceso");
        lines.add("MAIN_BEGIN -> algoritmo");
        lines.add("MAIN_END -> finproceso");
        lines.add("MAIN_END -> finalgoritmo");
        lines.add("C -> D token_pyc C");
        lines.add("C -> epsilon");
        lines.add("C -> id C_OPT token_pyc C");
        lines.add("C -> READ token_pyc C");
        lines.add("C -> WRITE token_pyc C");
        lines.add("C -> DIM token_pyc C");
        lines.add("C -> IF C");
        lines.add("C -> FOR C");
        lines.add("C -> WHILE C");
        lines.add("C -> DOWHILE C");
        lines.add("C -> SWITCH C");
        lines.add("C -> WAIT token_pyc C");
        lines.add("C -> CLEAR token_pyc C");
        lines.add("C_OPT -> ARRAY_POS token_asig E");
        lines.add("C_OPT -> OPT_ARGS");
        lines.add("C_OPT -> epsilon");
        lines.add("IF -> si E entonces C END_IF");
        lines.add("END_IF -> finsi");
        lines.add("END_IF -> sino C finsi");
        lines.add("FOR -> para id token_asig E hasta EXP_NUM OPT_FOR hacer C finpara");
        lines.add("OPT_FOR -> con paso EXP_NUM");
        lines.add("OPT_FOR -> epsilon");
        lines.add("WHILE -> mientras E hacer C finmientras");
        lines.add("DOWHILE -> repetir C hasta que E");
        lines.add("SWITCH -> segun EXP_NUM hacer OPT_CASE OPT_DEFAULT finsegun");
        lines.add("OPT_CASE -> caso EXP_NUM token_dosp C OPT_CASE");
        lines.add("OPT_CASE -> epsilon");
        lines.add("OPT_DEFAULT -> epsilon");
        lines.add("OPT_DEFAULT -> de otro modo token_dosp C");
        lines.add("WAIT -> esperar WAIT_TYPE");
        lines.add("WAIT_TYPE -> tecla");
        lines.add("WAIT_TYPE -> EXP_NUM UNITY");
        lines.add("UNITY -> segundos");
        lines.add("UNITY -> milisegundos");
        lines.add("CLEAR -> borrar SCREEN");
        lines.add("CLEAR -> limpiar SCREEN");
        lines.add("SCREEN -> pantalla");
        lines.add("DIM -> dimension DEF_DIM");
        lines.add("DEF_DIM -> id ARRAY_PARAMS DEF_DIM_LIST");
        lines.add("ARRAY_PARAMS -> token_cor_izq EXP_NUM EXP_NUM_LIST token_cor_der");
        lines.add("DEF_DIM_LIST -> epsilon");
        lines.add("DEF_DIM_LIST -> token_coma DEF_DIM DEF_DIM_LIST");
        lines.add("EXP_NUM_LIST -> epsilon");
        lines.add("EXP_NUM_LIST -> token_coma EXP_NUM EXP_NUM_LIST");
        lines.add("READ -> leer id ARRAY_POS");
        lines.add("ARRAY_POS -> ARRAY_PARAMS");
        lines.add("ARRAY_POS -> epsilon");
        lines.add("WRITE -> escribir E E_LIST");
        lines.add("E_LIST -> token_coma E E_LIST");
        lines.add("E_LIST -> epsilon");
        lines.add("D -> definir id ID_LIST como TIPO");
        lines.add("ID_LIST -> token_coma id ID_LIST");
        lines.add("ID_LIST -> epsilon");
        lines.add("TIPO -> entero");
        lines.add("TIPO -> real");
        lines.add("TIPO -> numero");
        lines.add("TIPO -> numerico");
        lines.add("TIPO -> texto");
        lines.add("TIPO -> cadena");
        lines.add("TIPO -> caracter");
        lines.add("TIPO -> logico");
        lines.add("E -> B_TERM OPT_OR");
        lines.add("OPT_OR -> epsilon");
        lines.add("OPT_OR -> token_o B_TERM OPT_OR");
        lines.add("B_TERM -> NOT_FACTOR OPT_AND");
        lines.add("OPT_AND -> epsilon");
        lines.add("OPT_AND -> token_y NOT_FACTOR OPT_AND");
        lines.add("NOT_FACTOR -> token_neg B_FACTOR");
        lines.add("NOT_FACTOR -> B_FACTOR");
        lines.add("B_FACTOR -> EXP_NUM EXP_NUM_COM");
        lines.add("EXP_NUM_COM -> epsilon");
        lines.add("EXP_NUM_COM -> REL_OPT EXP_NUM EXP_NUM_COM");
        lines.add("REL_OPT -> token_igual");
        lines.add("REL_OPT -> token_dif");
        lines.add("REL_OPT -> token_mayor");
        lines.add("REL_OPT -> token_mayor_igual");
        lines.add("REL_OPT -> token_menor");
        lines.add("REL_OPT -> token_menor_igual");
        lines.add("EXP_NUM -> TERM OPT_MOD");
        lines.add("OPT_MOD -> token_mod TERM OPT_MOD");
        lines.add("OPT_MOD -> epsilon");
        lines.add("TERM -> MOD_TERM OPT_SUM");
        lines.add("OPT_SUM -> epsilon");
        lines.add("OPT_SUM -> SUM_OPT MOD_TERM OPT_SUM");
        lines.add("MOD_TERM -> SIGNED_FACTOR OPT_MUL");
        lines.add("SIGNED_FACTOR -> SUM_OPT S_TERM");
        lines.add("MOD_TERM -> S_TERM OPT_MUL");
        lines.add("OPT_MUL -> epsilon");
        lines.add("OPT_MUL -> MUL_OPT S_TERM OPT_MUL");
        lines.add("MUL_OPT -> token_mul");
        lines.add("MUL_OPT -> token_div");
        lines.add("S_TERM -> M_TERM OPT_POT");
        lines.add("OPT_POT -> token_pot M_TERM OPT_POT");
        lines.add("OPT_POT -> epsilon");
        lines.add("M_TERM -> FACTOR");
        lines.add("SUM_OPT -> token_mas");
        lines.add("SUM_OPT -> token_menos");
        lines.add("FACTOR -> token_cadena");
        lines.add("FACTOR -> token_real");
        lines.add("FACTOR -> token_entero");
        lines.add("FACTOR -> id OPT_FUNCTION");
        lines.add("FACTOR -> verdadero");
        lines.add("FACTOR -> falso");
        lines.add("OPT_FUNCTION -> OPT_ARGS");
        lines.add("OPT_FUNCTION -> epsilon");
        lines.add("OPT_FUNCTION -> ARRAY_PARAMS");
        lines.add("FACTOR -> token_par_izq E token_par_der");
        for (String line : lines) {
            Rule r = new Rule(line, this);
        }
        /*
         BufferedReader in = new BufferedReader(new BufferedReader(new FileReader(fileName)));
         String line = in.readLine();
         System.out.println("lines.add(\"" + line + "\");");
         while (line != null) {
         Rule r = new Rule(line, this);
         System.out.println("lines.add(\"" + line + "\");");
         line = in.readLine();
         }*/
        checkLL1();
        for (Map.Entry<String, GrammaticalRule> entry : getGrammar().entrySet()) {
            entry.getValue().calcFirst();
            rules.addAll(entry.getValue().getRules());
        }
        getInitRule().getSeconds().add(Rule.EOF);
        for (Map.Entry<String, GrammaticalRule> entry : getGrammar().entrySet()) {
            entry.getValue().calcSeconds(rules);
        }
        for (Map.Entry<String, GrammaticalRule> entry : getGrammar().entrySet()) {
            entry.getValue().calcPrediction();
        }
        if (debug) {
            System.out.println(printGrammar());
        }
        for (Map.Entry<String, GrammaticalRule> entry : getGrammar().entrySet()) {
            entry.getValue().checkConditions();
        }
        //in.close();
    }

    private void checkLL1() {
        Map<String, GrammaticalRule> clone = new HashMap<>(getGrammar());
        for (Map.Entry<String, GrammaticalRule> entry : clone.entrySet()) {
            entry.getValue().checkLeftRecusion();
            entry.getValue().checkCommonFactors(0);
        }
    }

    public String printGrammar() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, GrammaticalRule> entry : getGrammar().entrySet()) {
            sb.append(entry.getValue().fullPrint());
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

}
