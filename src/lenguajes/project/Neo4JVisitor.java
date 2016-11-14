// Generated from Neo4J.g by ANTLR 4.5.3
package lenguajes.project;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Neo4JParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Neo4JVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(Neo4JParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(Neo4JParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code create_multiple}
	 * labeled alternative in {@link Neo4JParser#opt_create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_multiple(Neo4JParser.Create_multipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code create_relation}
	 * labeled alternative in {@link Neo4JParser#opt_create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_relation(Neo4JParser.Create_relationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#relation_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_def(Neo4JParser.Relation_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_relation}
	 * labeled alternative in {@link Neo4JParser#relation_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_relation(Neo4JParser.Simple_relationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directed_relation}
	 * labeled alternative in {@link Neo4JParser#relation_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirected_relation(Neo4JParser.Directed_relationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complex_relation}
	 * labeled alternative in {@link Neo4JParser#relation_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_relation(Neo4JParser.Complex_relationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#node_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_def(Neo4JParser.Node_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(Neo4JParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#props_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProps_list(Neo4JParser.Props_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code property}
	 * labeled alternative in {@link Neo4JParser#prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(Neo4JParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code query_cond}
	 * labeled alternative in {@link Neo4JParser#prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_cond(Neo4JParser.Query_condContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or_operation}
	 * labeled alternative in {@link Neo4JParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_operation(Neo4JParser.Or_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_single}
	 * labeled alternative in {@link Neo4JParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_single(Neo4JParser.Exp_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xor_operation}
	 * labeled alternative in {@link Neo4JParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_operation(Neo4JParser.Xor_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_operation}
	 * labeled alternative in {@link Neo4JParser#b_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_operation(Neo4JParser.And_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code b_term_single}
	 * labeled alternative in {@link Neo4JParser#b_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_term_single(Neo4JParser.B_term_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equals_operation}
	 * labeled alternative in {@link Neo4JParser#eq_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals_operation(Neo4JParser.Equals_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq_factor_single}
	 * labeled alternative in {@link Neo4JParser#eq_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_factor_single(Neo4JParser.Eq_factor_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#dif_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDif_opt(Neo4JParser.Dif_optContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rel_operation}
	 * labeled alternative in {@link Neo4JParser#b_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_operation(Neo4JParser.Rel_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code b_factor_single}
	 * labeled alternative in {@link Neo4JParser#b_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_factor_single(Neo4JParser.B_factor_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#rel_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_opt(Neo4JParser.Rel_optContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_num_single}
	 * labeled alternative in {@link Neo4JParser#exp_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_num_single(Neo4JParser.Exp_num_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum_operation}
	 * labeled alternative in {@link Neo4JParser#exp_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum_operation(Neo4JParser.Sum_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#sum_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum_opt(Neo4JParser.Sum_optContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mod_term_single}
	 * labeled alternative in {@link Neo4JParser#mod_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_term_single(Neo4JParser.Mod_term_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul_mod_operation}
	 * labeled alternative in {@link Neo4JParser#mod_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_mod_operation(Neo4JParser.Mul_mod_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#mul_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_opt(Neo4JParser.Mul_optContext ctx);
	/**
	 * Visit a parse tree produced by the {@code s_term_single}
	 * labeled alternative in {@link Neo4JParser#s_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_term_single(Neo4JParser.S_term_singleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pot_operation}
	 * labeled alternative in {@link Neo4JParser#s_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPot_operation(Neo4JParser.Pot_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negation_operation}
	 * labeled alternative in {@link Neo4JParser#not_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation_operation(Neo4JParser.Negation_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_factor_single}
	 * labeled alternative in {@link Neo4JParser#not_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_factor_single(Neo4JParser.Not_factor_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Neo4JParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#function_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_sentence(Neo4JParser.Function_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#relationship_rels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationship_rels(Neo4JParser.Relationship_relsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#node_nodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_nodes(Neo4JParser.Node_nodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#token_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_mod(Neo4JParser.Token_modContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#token_y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_y(Neo4JParser.Token_yContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#token_o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_o(Neo4JParser.Token_oContext ctx);
	/**
	 * Visit a parse tree produced by {@link Neo4JParser#token_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_neg(Neo4JParser.Token_negContext ctx);
}