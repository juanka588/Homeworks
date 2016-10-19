// Generated from PSGrammar.g4 by ANTLR 4.5.3
package lenguajes.antlr;
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
	 * Enter a parse tree produced by {@link PSGrammarParser#main_begin}.
	 * @param ctx the parse tree
	 */
	void enterMain_begin(PSGrammarParser.Main_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#main_begin}.
	 * @param ctx the parse tree
	 */
	void exitMain_begin(PSGrammarParser.Main_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#main_end}.
	 * @param ctx the parse tree
	 */
	void enterMain_end(PSGrammarParser.Main_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#main_end}.
	 * @param ctx the parse tree
	 */
	void exitMain_end(PSGrammarParser.Main_endContext ctx);
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
	 * Enter a parse tree produced by {@link PSGrammarParser#if_sentence}.
	 * @param ctx the parse tree
	 */
	void enterIf_sentence(PSGrammarParser.If_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#if_sentence}.
	 * @param ctx the parse tree
	 */
	void exitIf_sentence(PSGrammarParser.If_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#end_if}.
	 * @param ctx the parse tree
	 */
	void enterEnd_if(PSGrammarParser.End_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#end_if}.
	 * @param ctx the parse tree
	 */
	void exitEnd_if(PSGrammarParser.End_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#for_sentence}.
	 * @param ctx the parse tree
	 */
	void enterFor_sentence(PSGrammarParser.For_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#for_sentence}.
	 * @param ctx the parse tree
	 */
	void exitFor_sentence(PSGrammarParser.For_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#while_sentence}.
	 * @param ctx the parse tree
	 */
	void enterWhile_sentence(PSGrammarParser.While_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#while_sentence}.
	 * @param ctx the parse tree
	 */
	void exitWhile_sentence(PSGrammarParser.While_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#dowhile_sentence}.
	 * @param ctx the parse tree
	 */
	void enterDowhile_sentence(PSGrammarParser.Dowhile_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#dowhile_sentence}.
	 * @param ctx the parse tree
	 */
	void exitDowhile_sentence(PSGrammarParser.Dowhile_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#switch_sentence}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_sentence(PSGrammarParser.Switch_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#switch_sentence}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_sentence(PSGrammarParser.Switch_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#case_sentence}.
	 * @param ctx the parse tree
	 */
	void enterCase_sentence(PSGrammarParser.Case_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#case_sentence}.
	 * @param ctx the parse tree
	 */
	void exitCase_sentence(PSGrammarParser.Case_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#default_case}.
	 * @param ctx the parse tree
	 */
	void enterDefault_case(PSGrammarParser.Default_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#default_case}.
	 * @param ctx the parse tree
	 */
	void exitDefault_case(PSGrammarParser.Default_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#wait_sentence}.
	 * @param ctx the parse tree
	 */
	void enterWait_sentence(PSGrammarParser.Wait_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#wait_sentence}.
	 * @param ctx the parse tree
	 */
	void exitWait_sentence(PSGrammarParser.Wait_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#wait_type}.
	 * @param ctx the parse tree
	 */
	void enterWait_type(PSGrammarParser.Wait_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#wait_type}.
	 * @param ctx the parse tree
	 */
	void exitWait_type(PSGrammarParser.Wait_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#unity}.
	 * @param ctx the parse tree
	 */
	void enterUnity(PSGrammarParser.UnityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#unity}.
	 * @param ctx the parse tree
	 */
	void exitUnity(PSGrammarParser.UnityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#clear}.
	 * @param ctx the parse tree
	 */
	void enterClear(PSGrammarParser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#clear}.
	 * @param ctx the parse tree
	 */
	void exitClear(PSGrammarParser.ClearContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterDim(PSGrammarParser.DimContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitDim(PSGrammarParser.DimContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#def_dim}.
	 * @param ctx the parse tree
	 */
	void enterDef_dim(PSGrammarParser.Def_dimContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#def_dim}.
	 * @param ctx the parse tree
	 */
	void exitDef_dim(PSGrammarParser.Def_dimContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#def_dim_list}.
	 * @param ctx the parse tree
	 */
	void enterDef_dim_list(PSGrammarParser.Def_dim_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#def_dim_list}.
	 * @param ctx the parse tree
	 */
	void exitDef_dim_list(PSGrammarParser.Def_dim_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(PSGrammarParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(PSGrammarParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(PSGrammarParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(PSGrammarParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alloc}
	 * labeled alternative in {@link PSGrammarParser#command_opt}.
	 * @param ctx the parse tree
	 */
	void enterAlloc(PSGrammarParser.AllocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alloc}
	 * labeled alternative in {@link PSGrammarParser#command_opt}.
	 * @param ctx the parse tree
	 */
	void exitAlloc(PSGrammarParser.AllocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PSGrammarParser#command_opt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PSGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PSGrammarParser#command_opt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PSGrammarParser.FunctionCallContext ctx);
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
	 * Enter a parse tree produced by the {@code or_operation}
	 * labeled alternative in {@link PSGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOr_operation(PSGrammarParser.Or_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_operation}
	 * labeled alternative in {@link PSGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOr_operation(PSGrammarParser.Or_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_single}
	 * labeled alternative in {@link PSGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_single(PSGrammarParser.Exp_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_single}
	 * labeled alternative in {@link PSGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_single(PSGrammarParser.Exp_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_operation}
	 * labeled alternative in {@link PSGrammarParser#b_term}.
	 * @param ctx the parse tree
	 */
	void enterAnd_operation(PSGrammarParser.And_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_operation}
	 * labeled alternative in {@link PSGrammarParser#b_term}.
	 * @param ctx the parse tree
	 */
	void exitAnd_operation(PSGrammarParser.And_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code b_term_single}
	 * labeled alternative in {@link PSGrammarParser#b_term}.
	 * @param ctx the parse tree
	 */
	void enterB_term_single(PSGrammarParser.B_term_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code b_term_single}
	 * labeled alternative in {@link PSGrammarParser#b_term}.
	 * @param ctx the parse tree
	 */
	void exitB_term_single(PSGrammarParser.B_term_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equals_operation}
	 * labeled alternative in {@link PSGrammarParser#eq_factor}.
	 * @param ctx the parse tree
	 */
	void enterEquals_operation(PSGrammarParser.Equals_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equals_operation}
	 * labeled alternative in {@link PSGrammarParser#eq_factor}.
	 * @param ctx the parse tree
	 */
	void exitEquals_operation(PSGrammarParser.Equals_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq_factor_single}
	 * labeled alternative in {@link PSGrammarParser#eq_factor}.
	 * @param ctx the parse tree
	 */
	void enterEq_factor_single(PSGrammarParser.Eq_factor_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq_factor_single}
	 * labeled alternative in {@link PSGrammarParser#eq_factor}.
	 * @param ctx the parse tree
	 */
	void exitEq_factor_single(PSGrammarParser.Eq_factor_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#dif_opt}.
	 * @param ctx the parse tree
	 */
	void enterDif_opt(PSGrammarParser.Dif_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#dif_opt}.
	 * @param ctx the parse tree
	 */
	void exitDif_opt(PSGrammarParser.Dif_optContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel_operation}
	 * labeled alternative in {@link PSGrammarParser#b_factor}.
	 * @param ctx the parse tree
	 */
	void enterRel_operation(PSGrammarParser.Rel_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel_operation}
	 * labeled alternative in {@link PSGrammarParser#b_factor}.
	 * @param ctx the parse tree
	 */
	void exitRel_operation(PSGrammarParser.Rel_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code b_factor_single}
	 * labeled alternative in {@link PSGrammarParser#b_factor}.
	 * @param ctx the parse tree
	 */
	void enterB_factor_single(PSGrammarParser.B_factor_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code b_factor_single}
	 * labeled alternative in {@link PSGrammarParser#b_factor}.
	 * @param ctx the parse tree
	 */
	void exitB_factor_single(PSGrammarParser.B_factor_singleContext ctx);
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
	 * Enter a parse tree produced by the {@code exp_num_single}
	 * labeled alternative in {@link PSGrammarParser#exp_num}.
	 * @param ctx the parse tree
	 */
	void enterExp_num_single(PSGrammarParser.Exp_num_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_num_single}
	 * labeled alternative in {@link PSGrammarParser#exp_num}.
	 * @param ctx the parse tree
	 */
	void exitExp_num_single(PSGrammarParser.Exp_num_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum_operation}
	 * labeled alternative in {@link PSGrammarParser#exp_num}.
	 * @param ctx the parse tree
	 */
	void enterSum_operation(PSGrammarParser.Sum_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum_operation}
	 * labeled alternative in {@link PSGrammarParser#exp_num}.
	 * @param ctx the parse tree
	 */
	void exitSum_operation(PSGrammarParser.Sum_operationContext ctx);
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
	 * Enter a parse tree produced by the {@code mod_term_single}
	 * labeled alternative in {@link PSGrammarParser#mod_term}.
	 * @param ctx the parse tree
	 */
	void enterMod_term_single(PSGrammarParser.Mod_term_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mod_term_single}
	 * labeled alternative in {@link PSGrammarParser#mod_term}.
	 * @param ctx the parse tree
	 */
	void exitMod_term_single(PSGrammarParser.Mod_term_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul_mod_operation}
	 * labeled alternative in {@link PSGrammarParser#mod_term}.
	 * @param ctx the parse tree
	 */
	void enterMul_mod_operation(PSGrammarParser.Mul_mod_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul_mod_operation}
	 * labeled alternative in {@link PSGrammarParser#mod_term}.
	 * @param ctx the parse tree
	 */
	void exitMul_mod_operation(PSGrammarParser.Mul_mod_operationContext ctx);
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
	 * Enter a parse tree produced by the {@code s_term_single}
	 * labeled alternative in {@link PSGrammarParser#s_term}.
	 * @param ctx the parse tree
	 */
	void enterS_term_single(PSGrammarParser.S_term_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code s_term_single}
	 * labeled alternative in {@link PSGrammarParser#s_term}.
	 * @param ctx the parse tree
	 */
	void exitS_term_single(PSGrammarParser.S_term_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pot_operation}
	 * labeled alternative in {@link PSGrammarParser#s_term}.
	 * @param ctx the parse tree
	 */
	void enterPot_operation(PSGrammarParser.Pot_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pot_operation}
	 * labeled alternative in {@link PSGrammarParser#s_term}.
	 * @param ctx the parse tree
	 */
	void exitPot_operation(PSGrammarParser.Pot_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negation_operation}
	 * labeled alternative in {@link PSGrammarParser#not_factor}.
	 * @param ctx the parse tree
	 */
	void enterNegation_operation(PSGrammarParser.Negation_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negation_operation}
	 * labeled alternative in {@link PSGrammarParser#not_factor}.
	 * @param ctx the parse tree
	 */
	void exitNegation_operation(PSGrammarParser.Negation_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not_factor_single}
	 * labeled alternative in {@link PSGrammarParser#not_factor}.
	 * @param ctx the parse tree
	 */
	void enterNot_factor_single(PSGrammarParser.Not_factor_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not_factor_single}
	 * labeled alternative in {@link PSGrammarParser#not_factor}.
	 * @param ctx the parse tree
	 */
	void exitNot_factor_single(PSGrammarParser.Not_factor_singleContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(PSGrammarParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(PSGrammarParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#token_y}.
	 * @param ctx the parse tree
	 */
	void enterToken_y(PSGrammarParser.Token_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#token_y}.
	 * @param ctx the parse tree
	 */
	void exitToken_y(PSGrammarParser.Token_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#token_o}.
	 * @param ctx the parse tree
	 */
	void enterToken_o(PSGrammarParser.Token_oContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#token_o}.
	 * @param ctx the parse tree
	 */
	void exitToken_o(PSGrammarParser.Token_oContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSGrammarParser#token_neg}.
	 * @param ctx the parse tree
	 */
	void enterToken_neg(PSGrammarParser.Token_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSGrammarParser#token_neg}.
	 * @param ctx the parse tree
	 */
	void exitToken_neg(PSGrammarParser.Token_negContext ctx);
}