// Generated from Neo4J.g by ANTLR 4.5.3
package lenguajes.project;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Neo4JParser}.
 */
public interface Neo4JListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(Neo4JParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(Neo4JParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#select_sentence}.
	 * @param ctx the parse tree
	 */
	void enterSelect_sentence(Neo4JParser.Select_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#select_sentence}.
	 * @param ctx the parse tree
	 */
	void exitSelect_sentence(Neo4JParser.Select_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#basic_query}.
	 * @param ctx the parse tree
	 */
	void enterBasic_query(Neo4JParser.Basic_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#basic_query}.
	 * @param ctx the parse tree
	 */
	void exitBasic_query(Neo4JParser.Basic_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#opt_where}.
	 * @param ctx the parse tree
	 */
	void enterOpt_where(Neo4JParser.Opt_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#opt_where}.
	 * @param ctx the parse tree
	 */
	void exitOpt_where(Neo4JParser.Opt_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(Neo4JParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(Neo4JParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code create_multiple}
	 * labeled alternative in {@link Neo4JParser#opt_create}.
	 * @param ctx the parse tree
	 */
	void enterCreate_multiple(Neo4JParser.Create_multipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code create_multiple}
	 * labeled alternative in {@link Neo4JParser#opt_create}.
	 * @param ctx the parse tree
	 */
	void exitCreate_multiple(Neo4JParser.Create_multipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code create_relation}
	 * labeled alternative in {@link Neo4JParser#opt_create}.
	 * @param ctx the parse tree
	 */
	void enterCreate_relation(Neo4JParser.Create_relationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code create_relation}
	 * labeled alternative in {@link Neo4JParser#opt_create}.
	 * @param ctx the parse tree
	 */
	void exitCreate_relation(Neo4JParser.Create_relationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#relation_def}.
	 * @param ctx the parse tree
	 */
	void enterRelation_def(Neo4JParser.Relation_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#relation_def}.
	 * @param ctx the parse tree
	 */
	void exitRelation_def(Neo4JParser.Relation_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simple_relation}
	 * labeled alternative in {@link Neo4JParser#relation_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_relation(Neo4JParser.Simple_relationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simple_relation}
	 * labeled alternative in {@link Neo4JParser#relation_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_relation(Neo4JParser.Simple_relationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directed_relation}
	 * labeled alternative in {@link Neo4JParser#relation_type}.
	 * @param ctx the parse tree
	 */
	void enterDirected_relation(Neo4JParser.Directed_relationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directed_relation}
	 * labeled alternative in {@link Neo4JParser#relation_type}.
	 * @param ctx the parse tree
	 */
	void exitDirected_relation(Neo4JParser.Directed_relationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complex_relation}
	 * labeled alternative in {@link Neo4JParser#relation_type}.
	 * @param ctx the parse tree
	 */
	void enterComplex_relation(Neo4JParser.Complex_relationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complex_relation}
	 * labeled alternative in {@link Neo4JParser#relation_type}.
	 * @param ctx the parse tree
	 */
	void exitComplex_relation(Neo4JParser.Complex_relationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#node_def}.
	 * @param ctx the parse tree
	 */
	void enterNode_def(Neo4JParser.Node_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#node_def}.
	 * @param ctx the parse tree
	 */
	void exitNode_def(Neo4JParser.Node_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(Neo4JParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(Neo4JParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#props_list}.
	 * @param ctx the parse tree
	 */
	void enterProps_list(Neo4JParser.Props_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#props_list}.
	 * @param ctx the parse tree
	 */
	void exitProps_list(Neo4JParser.Props_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code property}
	 * labeled alternative in {@link Neo4JParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProperty(Neo4JParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code property}
	 * labeled alternative in {@link Neo4JParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProperty(Neo4JParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code query_cond}
	 * labeled alternative in {@link Neo4JParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterQuery_cond(Neo4JParser.Query_condContext ctx);
	/**
	 * Exit a parse tree produced by the {@code query_cond}
	 * labeled alternative in {@link Neo4JParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitQuery_cond(Neo4JParser.Query_condContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_operation}
	 * labeled alternative in {@link Neo4JParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOr_operation(Neo4JParser.Or_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_operation}
	 * labeled alternative in {@link Neo4JParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOr_operation(Neo4JParser.Or_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_single}
	 * labeled alternative in {@link Neo4JParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_single(Neo4JParser.Exp_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_single}
	 * labeled alternative in {@link Neo4JParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_single(Neo4JParser.Exp_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xor_operation}
	 * labeled alternative in {@link Neo4JParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterXor_operation(Neo4JParser.Xor_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xor_operation}
	 * labeled alternative in {@link Neo4JParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitXor_operation(Neo4JParser.Xor_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_operation}
	 * labeled alternative in {@link Neo4JParser#b_term}.
	 * @param ctx the parse tree
	 */
	void enterAnd_operation(Neo4JParser.And_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_operation}
	 * labeled alternative in {@link Neo4JParser#b_term}.
	 * @param ctx the parse tree
	 */
	void exitAnd_operation(Neo4JParser.And_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code b_term_single}
	 * labeled alternative in {@link Neo4JParser#b_term}.
	 * @param ctx the parse tree
	 */
	void enterB_term_single(Neo4JParser.B_term_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code b_term_single}
	 * labeled alternative in {@link Neo4JParser#b_term}.
	 * @param ctx the parse tree
	 */
	void exitB_term_single(Neo4JParser.B_term_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equals_operation}
	 * labeled alternative in {@link Neo4JParser#eq_factor}.
	 * @param ctx the parse tree
	 */
	void enterEquals_operation(Neo4JParser.Equals_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equals_operation}
	 * labeled alternative in {@link Neo4JParser#eq_factor}.
	 * @param ctx the parse tree
	 */
	void exitEquals_operation(Neo4JParser.Equals_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq_factor_single}
	 * labeled alternative in {@link Neo4JParser#eq_factor}.
	 * @param ctx the parse tree
	 */
	void enterEq_factor_single(Neo4JParser.Eq_factor_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq_factor_single}
	 * labeled alternative in {@link Neo4JParser#eq_factor}.
	 * @param ctx the parse tree
	 */
	void exitEq_factor_single(Neo4JParser.Eq_factor_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#dif_opt}.
	 * @param ctx the parse tree
	 */
	void enterDif_opt(Neo4JParser.Dif_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#dif_opt}.
	 * @param ctx the parse tree
	 */
	void exitDif_opt(Neo4JParser.Dif_optContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel_operation}
	 * labeled alternative in {@link Neo4JParser#b_factor}.
	 * @param ctx the parse tree
	 */
	void enterRel_operation(Neo4JParser.Rel_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel_operation}
	 * labeled alternative in {@link Neo4JParser#b_factor}.
	 * @param ctx the parse tree
	 */
	void exitRel_operation(Neo4JParser.Rel_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code b_factor_single}
	 * labeled alternative in {@link Neo4JParser#b_factor}.
	 * @param ctx the parse tree
	 */
	void enterB_factor_single(Neo4JParser.B_factor_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code b_factor_single}
	 * labeled alternative in {@link Neo4JParser#b_factor}.
	 * @param ctx the parse tree
	 */
	void exitB_factor_single(Neo4JParser.B_factor_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#rel_opt}.
	 * @param ctx the parse tree
	 */
	void enterRel_opt(Neo4JParser.Rel_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#rel_opt}.
	 * @param ctx the parse tree
	 */
	void exitRel_opt(Neo4JParser.Rel_optContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_num_single}
	 * labeled alternative in {@link Neo4JParser#exp_num}.
	 * @param ctx the parse tree
	 */
	void enterExp_num_single(Neo4JParser.Exp_num_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_num_single}
	 * labeled alternative in {@link Neo4JParser#exp_num}.
	 * @param ctx the parse tree
	 */
	void exitExp_num_single(Neo4JParser.Exp_num_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum_operation}
	 * labeled alternative in {@link Neo4JParser#exp_num}.
	 * @param ctx the parse tree
	 */
	void enterSum_operation(Neo4JParser.Sum_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum_operation}
	 * labeled alternative in {@link Neo4JParser#exp_num}.
	 * @param ctx the parse tree
	 */
	void exitSum_operation(Neo4JParser.Sum_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#sum_opt}.
	 * @param ctx the parse tree
	 */
	void enterSum_opt(Neo4JParser.Sum_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#sum_opt}.
	 * @param ctx the parse tree
	 */
	void exitSum_opt(Neo4JParser.Sum_optContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mod_term_single}
	 * labeled alternative in {@link Neo4JParser#mod_term}.
	 * @param ctx the parse tree
	 */
	void enterMod_term_single(Neo4JParser.Mod_term_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mod_term_single}
	 * labeled alternative in {@link Neo4JParser#mod_term}.
	 * @param ctx the parse tree
	 */
	void exitMod_term_single(Neo4JParser.Mod_term_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul_mod_operation}
	 * labeled alternative in {@link Neo4JParser#mod_term}.
	 * @param ctx the parse tree
	 */
	void enterMul_mod_operation(Neo4JParser.Mul_mod_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul_mod_operation}
	 * labeled alternative in {@link Neo4JParser#mod_term}.
	 * @param ctx the parse tree
	 */
	void exitMul_mod_operation(Neo4JParser.Mul_mod_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#mul_opt}.
	 * @param ctx the parse tree
	 */
	void enterMul_opt(Neo4JParser.Mul_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#mul_opt}.
	 * @param ctx the parse tree
	 */
	void exitMul_opt(Neo4JParser.Mul_optContext ctx);
	/**
	 * Enter a parse tree produced by the {@code s_term_single}
	 * labeled alternative in {@link Neo4JParser#s_term}.
	 * @param ctx the parse tree
	 */
	void enterS_term_single(Neo4JParser.S_term_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code s_term_single}
	 * labeled alternative in {@link Neo4JParser#s_term}.
	 * @param ctx the parse tree
	 */
	void exitS_term_single(Neo4JParser.S_term_singleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pot_operation}
	 * labeled alternative in {@link Neo4JParser#s_term}.
	 * @param ctx the parse tree
	 */
	void enterPot_operation(Neo4JParser.Pot_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pot_operation}
	 * labeled alternative in {@link Neo4JParser#s_term}.
	 * @param ctx the parse tree
	 */
	void exitPot_operation(Neo4JParser.Pot_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negation_operation}
	 * labeled alternative in {@link Neo4JParser#not_factor}.
	 * @param ctx the parse tree
	 */
	void enterNegation_operation(Neo4JParser.Negation_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negation_operation}
	 * labeled alternative in {@link Neo4JParser#not_factor}.
	 * @param ctx the parse tree
	 */
	void exitNegation_operation(Neo4JParser.Negation_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not_factor_single}
	 * labeled alternative in {@link Neo4JParser#not_factor}.
	 * @param ctx the parse tree
	 */
	void enterNot_factor_single(Neo4JParser.Not_factor_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not_factor_single}
	 * labeled alternative in {@link Neo4JParser#not_factor}.
	 * @param ctx the parse tree
	 */
	void exitNot_factor_single(Neo4JParser.Not_factor_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Neo4JParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Neo4JParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#function_sentence}.
	 * @param ctx the parse tree
	 */
	void enterFunction_sentence(Neo4JParser.Function_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#function_sentence}.
	 * @param ctx the parse tree
	 */
	void exitFunction_sentence(Neo4JParser.Function_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#relationship_rels}.
	 * @param ctx the parse tree
	 */
	void enterRelationship_rels(Neo4JParser.Relationship_relsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#relationship_rels}.
	 * @param ctx the parse tree
	 */
	void exitRelationship_rels(Neo4JParser.Relationship_relsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#node_nodes}.
	 * @param ctx the parse tree
	 */
	void enterNode_nodes(Neo4JParser.Node_nodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#node_nodes}.
	 * @param ctx the parse tree
	 */
	void exitNode_nodes(Neo4JParser.Node_nodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#token_mod}.
	 * @param ctx the parse tree
	 */
	void enterToken_mod(Neo4JParser.Token_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#token_mod}.
	 * @param ctx the parse tree
	 */
	void exitToken_mod(Neo4JParser.Token_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#token_y}.
	 * @param ctx the parse tree
	 */
	void enterToken_y(Neo4JParser.Token_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#token_y}.
	 * @param ctx the parse tree
	 */
	void exitToken_y(Neo4JParser.Token_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#token_o}.
	 * @param ctx the parse tree
	 */
	void enterToken_o(Neo4JParser.Token_oContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#token_o}.
	 * @param ctx the parse tree
	 */
	void exitToken_o(Neo4JParser.Token_oContext ctx);
	/**
	 * Enter a parse tree produced by {@link Neo4JParser#token_neg}.
	 * @param ctx the parse tree
	 */
	void enterToken_neg(Neo4JParser.Token_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link Neo4JParser#token_neg}.
	 * @param ctx the parse tree
	 */
	void exitToken_neg(Neo4JParser.Token_negContext ctx);
}