// Generated from PSGrammar.g4 by ANTLR 4.5.3
package lenguajes.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PSGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PSGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(PSGrammarParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#sp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSp(PSGrammarParser.SpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#end_sp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_sp(PSGrammarParser.End_spContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(PSGrammarParser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#main_begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_begin(PSGrammarParser.Main_beginContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#main_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_end(PSGrammarParser.Main_endContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue1}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue1(PSGrammarParser.Continue1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code continueID}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueID(PSGrammarParser.ContinueIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue2}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue2(PSGrammarParser.Continue2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code continue3}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue3(PSGrammarParser.Continue3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code continue4}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue4(PSGrammarParser.Continue4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code continue5}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue5(PSGrammarParser.Continue5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code continue6}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue6(PSGrammarParser.Continue6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code continue7}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue7(PSGrammarParser.Continue7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code continue8}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue8(PSGrammarParser.Continue8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code continue9}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue9(PSGrammarParser.Continue9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code continue10}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue10(PSGrammarParser.Continue10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code continue11}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue11(PSGrammarParser.Continue11Context ctx);
	/**
	 * Visit a parse tree produced by the {@code continue12}
	 * labeled alternative in {@link PSGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue12(PSGrammarParser.Continue12Context ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#if_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_sentence(PSGrammarParser.If_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#end_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_if(PSGrammarParser.End_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#for_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_sentence(PSGrammarParser.For_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#while_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_sentence(PSGrammarParser.While_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#dowhile_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile_sentence(PSGrammarParser.Dowhile_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#switch_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_sentence(PSGrammarParser.Switch_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#case_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_sentence(PSGrammarParser.Case_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#default_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_case(PSGrammarParser.Default_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#wait_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_sentence(PSGrammarParser.Wait_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#wait_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_type(PSGrammarParser.Wait_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#unity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnity(PSGrammarParser.UnityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#clear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClear(PSGrammarParser.ClearContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim(PSGrammarParser.DimContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#def_dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_dim(PSGrammarParser.Def_dimContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#def_dim_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_dim_list(PSGrammarParser.Def_dim_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(PSGrammarParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(PSGrammarParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alloc}
	 * labeled alternative in {@link PSGrammarParser#command_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlloc(PSGrammarParser.AllocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link PSGrammarParser#command_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PSGrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#opt_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_args(PSGrammarParser.Opt_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(PSGrammarParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#array_pos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_pos(PSGrammarParser.Array_posContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PSGrammarParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or_operation}
	 * labeled alternative in {@link PSGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_operation(PSGrammarParser.Or_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_single}
	 * labeled alternative in {@link PSGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_single(PSGrammarParser.Exp_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_operation}
	 * labeled alternative in {@link PSGrammarParser#b_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_operation(PSGrammarParser.And_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code b_term_single}
	 * labeled alternative in {@link PSGrammarParser#b_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_term_single(PSGrammarParser.B_term_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equals_operation}
	 * labeled alternative in {@link PSGrammarParser#eq_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals_operation(PSGrammarParser.Equals_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq_factor_single}
	 * labeled alternative in {@link PSGrammarParser#eq_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_factor_single(PSGrammarParser.Eq_factor_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#dif_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDif_opt(PSGrammarParser.Dif_optContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rel_operation}
	 * labeled alternative in {@link PSGrammarParser#b_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_operation(PSGrammarParser.Rel_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code b_factor_single}
	 * labeled alternative in {@link PSGrammarParser#b_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_factor_single(PSGrammarParser.B_factor_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#rel_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_opt(PSGrammarParser.Rel_optContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_num_single}
	 * labeled alternative in {@link PSGrammarParser#exp_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_num_single(PSGrammarParser.Exp_num_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum_operation}
	 * labeled alternative in {@link PSGrammarParser#exp_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum_operation(PSGrammarParser.Sum_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#sum_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum_opt(PSGrammarParser.Sum_optContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mod_term_single}
	 * labeled alternative in {@link PSGrammarParser#mod_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_term_single(PSGrammarParser.Mod_term_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul_mod_operation}
	 * labeled alternative in {@link PSGrammarParser#mod_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_mod_operation(PSGrammarParser.Mul_mod_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#mul_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_opt(PSGrammarParser.Mul_optContext ctx);
	/**
	 * Visit a parse tree produced by the {@code s_term_single}
	 * labeled alternative in {@link PSGrammarParser#s_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_term_single(PSGrammarParser.S_term_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pot_operation}
	 * labeled alternative in {@link PSGrammarParser#s_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPot_operation(PSGrammarParser.Pot_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negation_operation}
	 * labeled alternative in {@link PSGrammarParser#not_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation_operation(PSGrammarParser.Negation_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_factor_single}
	 * labeled alternative in {@link PSGrammarParser#not_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_factor_single(PSGrammarParser.Not_factor_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PSGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link PSGrammarParser#opt_complement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(PSGrammarParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_call}
	 * labeled alternative in {@link PSGrammarParser#opt_complement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_call(PSGrammarParser.Array_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(PSGrammarParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#token_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_mod(PSGrammarParser.Token_modContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#token_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_y(PSGrammarParser.Token_yContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#token_o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_o(PSGrammarParser.Token_oContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSGrammarParser#token_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_neg(PSGrammarParser.Token_negContext ctx);
}