// Generated from PSGrammar.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PSGrammarParser}.
 */
public interface PSGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(PSGrammarParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(PSGrammarParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#sp}.
	 * @param ctx the parse tree
	 */
	void enterSp(PSGrammarParser.SpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#sp}.
	 * @param ctx the parse tree
	 */
	void exitSp(PSGrammarParser.SpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#end_sp}.
	 * @param ctx the parse tree
	 */
	void enterEnd_sp(PSGrammarParser.End_spContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#end_sp}.
	 * @param ctx the parse tree
	 */
	void exitEnd_sp(PSGrammarParser.End_spContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(PSGrammarParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(PSGrammarParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PSGrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PSGrammarParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#command_opt}.
	 * @param ctx the parse tree
	 */
	void enterCommand_opt(PSGrammarParser.Command_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#command_opt}.
	 * @param ctx the parse tree
	 */
	void exitCommand_opt(PSGrammarParser.Command_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#opt_args}.
	 * @param ctx the parse tree
	 */
	void enterOpt_args(PSGrammarParser.Opt_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#opt_args}.
	 * @param ctx the parse tree
	 */
	void exitOpt_args(PSGrammarParser.Opt_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(PSGrammarParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(PSGrammarParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#array_pos}.
	 * @param ctx the parse tree
	 */
	void enterArray_pos(PSGrammarParser.Array_posContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#array_pos}.
	 * @param ctx the parse tree
	 */
	void exitArray_pos(PSGrammarParser.Array_posContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(PSGrammarParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(PSGrammarParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PSGrammarParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PSGrammarParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#b_term}.
	 * @param ctx the parse tree
	 */
	void enterB_term(PSGrammarParser.B_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#b_term}.
	 * @param ctx the parse tree
	 */
	void exitB_term(PSGrammarParser.B_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#not_factor}.
	 * @param ctx the parse tree
	 */
	void enterNot_factor(PSGrammarParser.Not_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#not_factor}.
	 * @param ctx the parse tree
	 */
	void exitNot_factor(PSGrammarParser.Not_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#b_factor}.
	 * @param ctx the parse tree
	 */
	void enterB_factor(PSGrammarParser.B_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#b_factor}.
	 * @param ctx the parse tree
	 */
	void exitB_factor(PSGrammarParser.B_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#rel_opt}.
	 * @param ctx the parse tree
	 */
	void enterRel_opt(PSGrammarParser.Rel_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#rel_opt}.
	 * @param ctx the parse tree
	 */
	void exitRel_opt(PSGrammarParser.Rel_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#exp_num}.
	 * @param ctx the parse tree
	 */
	void enterExp_num(PSGrammarParser.Exp_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#exp_num}.
	 * @param ctx the parse tree
	 */
	void exitExp_num(PSGrammarParser.Exp_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PSGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PSGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#sum_opt}.
	 * @param ctx the parse tree
	 */
	void enterSum_opt(PSGrammarParser.Sum_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#sum_opt}.
	 * @param ctx the parse tree
	 */
	void exitSum_opt(PSGrammarParser.Sum_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#mod_term}.
	 * @param ctx the parse tree
	 */
	void enterMod_term(PSGrammarParser.Mod_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#mod_term}.
	 * @param ctx the parse tree
	 */
	void exitMod_term(PSGrammarParser.Mod_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#mul_opt}.
	 * @param ctx the parse tree
	 */
	void enterMul_opt(PSGrammarParser.Mul_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#mul_opt}.
	 * @param ctx the parse tree
	 */
	void exitMul_opt(PSGrammarParser.Mul_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#signed_factor}.
	 * @param ctx the parse tree
	 */
	void enterSigned_factor(PSGrammarParser.Signed_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#signed_factor}.
	 * @param ctx the parse tree
	 */
	void exitSigned_factor(PSGrammarParser.Signed_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#s_term}.
	 * @param ctx the parse tree
	 */
	void enterS_term(PSGrammarParser.S_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#s_term}.
	 * @param ctx the parse tree
	 */
	void exitS_term(PSGrammarParser.S_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PSGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PSGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#opt_complement}.
	 * @param ctx the parse tree
	 */
	void enterOpt_complement(PSGrammarParser.Opt_complementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#opt_complement}.
	 * @param ctx the parse tree
	 */
	void exitOpt_complement(PSGrammarParser.Opt_complementContext ctx);
}