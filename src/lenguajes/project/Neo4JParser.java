// Generated from Neo4J.g by ANTLR 4.5.3
package lenguajes.project;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Neo4JParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MATCH=5, CREATE=6, RETURN=7, AVG=8, SUM=9, 
		DISTINCT=10, MAX=11, MIN=12, WITH=13, OPTIONAL=14, OR=15, NOT=16, EXISTS=17, 
		HAS=18, STARTS=19, ENDS=20, TRUE=21, FALSE=22, CONTAINS=23, WHERE=24, 
		IN=25, COUNT=26, RELS=27, RELATIONSHIP=28, NODE=29, NODES=30, PROPS=31, 
		INDEX=32, ON=33, SET=34, DETACH=35, DELETE=36, REMOVE=37, ORDER=38, BY=39, 
		DESC=40, ASC=41, LENGHT=42, LIMIT=43, SKIP_TOKEN=44, RAND=45, DROP=46, 
		ID=47, LABEL=48, TOKEN_IGUAL=49, TOKEN_REGEX=50, TOKEN_AGREGAR=51, TOKEN_DIF=52, 
		TOKEN_MAYOR=53, TOKEN_MAYOR_IGUAL=54, TOKEN_MENOR=55, TOKEN_MENOR_IGUAL=56, 
		TOKEN_PAR_IZR=57, TOKEN_PAR_DER=58, TOKEN_COR_IZR=59, TOKEN_COR_DER=60, 
		TOKEN_LLAVE_IZR=61, TOKEN_LLAVE_DER=62, TOKEN_COMA=63, TOKEN_PYC=64, TOKEN_FIN_LINEA=65, 
		TOKEN_MUL=66, TOKEN_DIV=67, TOKEN_MAS=68, TOKEN_MENOS=69, TOKEN_RELATION=70, 
		TOKEN_DIRECTED_RELATION=71, TOKEN_POT=72, TOKEN_PUNTO=73, TOKEN_XOR=74, 
		TOKEN_DOSP=75, TOKEN_CADENA=76, TOKEN_REAL=77, TOKEN_ENTERO=78, WS=79, 
		LINE_COMMENT=80;
	public static final int
		RULE_init = 0, RULE_create = 1, RULE_opt_create = 2, RULE_relation_def = 3, 
		RULE_relation_type = 4, RULE_node_def = 5, RULE_definition = 6, RULE_props_list = 7, 
		RULE_prop = 8, RULE_exp = 9, RULE_b_term = 10, RULE_eq_factor = 11, RULE_dif_opt = 12, 
		RULE_b_factor = 13, RULE_rel_opt = 14, RULE_exp_num = 15, RULE_sum_opt = 16, 
		RULE_mod_term = 17, RULE_mul_opt = 18, RULE_s_term = 19, RULE_not_factor = 20, 
		RULE_factor = 21, RULE_function_sentence = 22, RULE_relationship_rels = 23, 
		RULE_node_nodes = 24, RULE_token_mod = 25, RULE_token_y = 26, RULE_token_o = 27, 
		RULE_token_neg = 28;
	public static final String[] ruleNames = {
		"init", "create", "opt_create", "relation_def", "relation_type", "node_def", 
		"definition", "props_list", "prop", "exp", "b_term", "eq_factor", "dif_opt", 
		"b_factor", "rel_opt", "exp_num", "sum_opt", "mod_term", "mul_opt", "s_term", 
		"not_factor", "factor", "function_sentence", "relationship_rels", "node_nodes", 
		"token_mod", "token_y", "token_o", "token_neg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'&'", "'|'", "'~'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'='", "'~='", "'+='", "'!='", "'>'", "'>='", "'<'", "'<='", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", "'\n'", "'*'", 
		"'/'", "'+'", "'-'", "'--'", "'-->'", "'^'", "'.'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "MATCH", "CREATE", "RETURN", "AVG", "SUM", 
		"DISTINCT", "MAX", "MIN", "WITH", "OPTIONAL", "OR", "NOT", "EXISTS", "HAS", 
		"STARTS", "ENDS", "TRUE", "FALSE", "CONTAINS", "WHERE", "IN", "COUNT", 
		"RELS", "RELATIONSHIP", "NODE", "NODES", "PROPS", "INDEX", "ON", "SET", 
		"DETACH", "DELETE", "REMOVE", "ORDER", "BY", "DESC", "ASC", "LENGHT", 
		"LIMIT", "SKIP_TOKEN", "RAND", "DROP", "ID", "LABEL", "TOKEN_IGUAL", "TOKEN_REGEX", 
		"TOKEN_AGREGAR", "TOKEN_DIF", "TOKEN_MAYOR", "TOKEN_MAYOR_IGUAL", "TOKEN_MENOR", 
		"TOKEN_MENOR_IGUAL", "TOKEN_PAR_IZR", "TOKEN_PAR_DER", "TOKEN_COR_IZR", 
		"TOKEN_COR_DER", "TOKEN_LLAVE_IZR", "TOKEN_LLAVE_DER", "TOKEN_COMA", "TOKEN_PYC", 
		"TOKEN_FIN_LINEA", "TOKEN_MUL", "TOKEN_DIV", "TOKEN_MAS", "TOKEN_MENOS", 
		"TOKEN_RELATION", "TOKEN_DIRECTED_RELATION", "TOKEN_POT", "TOKEN_PUNTO", 
		"TOKEN_XOR", "TOKEN_DOSP", "TOKEN_CADENA", "TOKEN_REAL", "TOKEN_ENTERO", 
		"WS", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Neo4J.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Neo4JParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			create();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Neo4JParser.CREATE, 0); }
		public Opt_createContext opt_create() {
			return getRuleContext(Opt_createContext.class,0);
		}
		public TerminalNode TOKEN_FIN_LINEA() { return getToken(Neo4JParser.TOKEN_FIN_LINEA, 0); }
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CREATE);
			setState(61);
			opt_create();
			setState(62);
			match(TOKEN_FIN_LINEA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Opt_createContext extends ParserRuleContext {
		public Opt_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_create; }
	 
		public Opt_createContext() { }
		public void copyFrom(Opt_createContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Create_multipleContext extends Opt_createContext {
		public List<Node_defContext> node_def() {
			return getRuleContexts(Node_defContext.class);
		}
		public Node_defContext node_def(int i) {
			return getRuleContext(Node_defContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Create_multipleContext(Opt_createContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterCreate_multiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitCreate_multiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitCreate_multiple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Create_relationContext extends Opt_createContext {
		public List<Relation_defContext> relation_def() {
			return getRuleContexts(Relation_defContext.class);
		}
		public Relation_defContext relation_def(int i) {
			return getRuleContext(Relation_defContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Create_relationContext(Opt_createContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterCreate_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitCreate_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitCreate_relation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_createContext opt_create() throws RecognitionException {
		Opt_createContext _localctx = new Opt_createContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opt_create);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Create_multipleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				node_def();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(65);
					match(TOKEN_COMA);
					setState(66);
					node_def();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new Create_relationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				relation_def();
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(73);
					match(TOKEN_COMA);
					setState(74);
					relation_def();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relation_defContext extends ParserRuleContext {
		public List<Node_defContext> node_def() {
			return getRuleContexts(Node_defContext.class);
		}
		public Node_defContext node_def(int i) {
			return getRuleContext(Node_defContext.class,i);
		}
		public Relation_typeContext relation_type() {
			return getRuleContext(Relation_typeContext.class,0);
		}
		public Relation_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRelation_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRelation_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRelation_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_defContext relation_def() throws RecognitionException {
		Relation_defContext _localctx = new Relation_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relation_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			node_def();
			setState(83);
			relation_type();
			setState(84);
			node_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relation_typeContext extends ParserRuleContext {
		public Relation_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_type; }
	 
		public Relation_typeContext() { }
		public void copyFrom(Relation_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Simple_relationContext extends Relation_typeContext {
		public TerminalNode TOKEN_RELATION() { return getToken(Neo4JParser.TOKEN_RELATION, 0); }
		public Simple_relationContext(Relation_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterSimple_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitSimple_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitSimple_relation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Directed_relationContext extends Relation_typeContext {
		public TerminalNode TOKEN_DIRECTED_RELATION() { return getToken(Neo4JParser.TOKEN_DIRECTED_RELATION, 0); }
		public Directed_relationContext(Relation_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterDirected_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitDirected_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitDirected_relation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Complex_relationContext extends Relation_typeContext {
		public List<TerminalNode> TOKEN_MENOS() { return getTokens(Neo4JParser.TOKEN_MENOS); }
		public TerminalNode TOKEN_MENOS(int i) {
			return getToken(Neo4JParser.TOKEN_MENOS, i);
		}
		public TerminalNode TOKEN_COR_IZR() { return getToken(Neo4JParser.TOKEN_COR_IZR, 0); }
		public TerminalNode TOKEN_COR_DER() { return getToken(Neo4JParser.TOKEN_COR_DER, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode LABEL() { return getToken(Neo4JParser.LABEL, 0); }
		public List<TerminalNode> TOKEN_MAYOR() { return getTokens(Neo4JParser.TOKEN_MAYOR); }
		public TerminalNode TOKEN_MAYOR(int i) {
			return getToken(Neo4JParser.TOKEN_MAYOR, i);
		}
		public Complex_relationContext(Relation_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterComplex_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitComplex_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitComplex_relation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_typeContext relation_type() throws RecognitionException {
		Relation_typeContext _localctx = new Relation_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relation_type);
		int _la;
		try {
			setState(101);
			switch (_input.LA(1)) {
			case TOKEN_RELATION:
				_localctx = new Simple_relationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(TOKEN_RELATION);
				}
				break;
			case TOKEN_DIRECTED_RELATION:
				_localctx = new Directed_relationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(TOKEN_DIRECTED_RELATION);
				}
				break;
			case TOKEN_MENOS:
				_localctx = new Complex_relationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(TOKEN_MENOS);
				setState(89);
				match(TOKEN_COR_IZR);
				setState(92);
				_la = _input.LA(1);
				if (_la==TOKEN_DOSP) {
					{
					setState(90);
					match(TOKEN_DOSP);
					setState(91);
					match(LABEL);
					}
				}

				setState(94);
				match(TOKEN_COR_DER);
				setState(95);
				match(TOKEN_MENOS);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					match(TOKEN_MAYOR);
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TOKEN_MAYOR );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_defContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZR() { return getToken(Neo4JParser.TOKEN_PAR_IZR, 0); }
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(Neo4JParser.TOKEN_PAR_DER, 0); }
		public Node_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNode_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNode_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNode_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_defContext node_def() throws RecognitionException {
		Node_defContext _localctx = new Node_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_node_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(TOKEN_PAR_IZR);
			setState(104);
			definition();
			setState(105);
			match(TOKEN_PAR_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Neo4JParser.ID, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode LABEL() { return getToken(Neo4JParser.LABEL, 0); }
		public List<Props_listContext> props_list() {
			return getRuleContexts(Props_listContext.class);
		}
		public Props_listContext props_list(int i) {
			return getRuleContext(Props_listContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(108);
			match(TOKEN_DOSP);
			setState(109);
			match(LABEL);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				props_list();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_LLAVE_IZR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Props_listContext extends ParserRuleContext {
		public TerminalNode TOKEN_LLAVE_IZR() { return getToken(Neo4JParser.TOKEN_LLAVE_IZR, 0); }
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public TerminalNode TOKEN_LLAVE_DER() { return getToken(Neo4JParser.TOKEN_LLAVE_DER, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Props_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterProps_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitProps_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitProps_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Props_listContext props_list() throws RecognitionException {
		Props_listContext _localctx = new Props_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_props_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(TOKEN_LLAVE_IZR);
			setState(116);
			prop();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(117);
				match(TOKEN_COMA);
				setState(118);
				prop();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(TOKEN_LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropContext extends ParserRuleContext {
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
	 
		public PropContext() { }
		public void copyFrom(PropContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyContext extends PropContext {
		public TerminalNode ID() { return getToken(Neo4JParser.ID, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PropertyContext(PropContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Query_condContext extends PropContext {
		public TerminalNode ID() { return getToken(Neo4JParser.ID, 0); }
		public Rel_optContext rel_opt() {
			return getRuleContext(Rel_optContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Query_condContext(PropContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterQuery_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitQuery_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitQuery_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prop);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(ID);
				setState(127);
				match(TOKEN_DOSP);
				setState(128);
				exp(0);
				}
				break;
			case 2:
				_localctx = new Query_condContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(ID);
				setState(130);
				rel_opt();
				setState(131);
				exp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Or_operationContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Token_oContext token_o() {
			return getRuleContext(Token_oContext.class,0);
		}
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Or_operationContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterOr_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitOr_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitOr_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exp_singleContext extends ExpContext {
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Exp_singleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterExp_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitExp_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitExp_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xor_operationContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TOKEN_XOR() { return getToken(Neo4JParser.TOKEN_XOR, 0); }
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Xor_operationContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterXor_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitXor_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitXor_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Exp_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(136);
			b_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Or_operationContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(139);
						token_o();
						setState(140);
						b_term(0);
						}
						break;
					case 2:
						{
						_localctx = new Xor_operationContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(142);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(143);
						match(TOKEN_XOR);
						setState(144);
						b_term(0);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class B_termContext extends ParserRuleContext {
		public B_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_term; }
	 
		public B_termContext() { }
		public void copyFrom(B_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class And_operationContext extends B_termContext {
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Token_yContext token_y() {
			return getRuleContext(Token_yContext.class,0);
		}
		public Eq_factorContext eq_factor() {
			return getRuleContext(Eq_factorContext.class,0);
		}
		public And_operationContext(B_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterAnd_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitAnd_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitAnd_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class B_term_singleContext extends B_termContext {
		public Eq_factorContext eq_factor() {
			return getRuleContext(Eq_factorContext.class,0);
		}
		public B_term_singleContext(B_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterB_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitB_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitB_term_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_termContext b_term() throws RecognitionException {
		return b_term(0);
	}

	private B_termContext b_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		B_termContext _localctx = new B_termContext(_ctx, _parentState);
		B_termContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_b_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new B_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(151);
			eq_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_operationContext(new B_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_b_term);
					setState(153);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(154);
					token_y();
					setState(155);
					eq_factor();
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Eq_factorContext extends ParserRuleContext {
		public Eq_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_factor; }
	 
		public Eq_factorContext() { }
		public void copyFrom(Eq_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Equals_operationContext extends Eq_factorContext {
		public List<B_factorContext> b_factor() {
			return getRuleContexts(B_factorContext.class);
		}
		public B_factorContext b_factor(int i) {
			return getRuleContext(B_factorContext.class,i);
		}
		public Dif_optContext dif_opt() {
			return getRuleContext(Dif_optContext.class,0);
		}
		public Equals_operationContext(Eq_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterEquals_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitEquals_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitEquals_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_factor_singleContext extends Eq_factorContext {
		public B_factorContext b_factor() {
			return getRuleContext(B_factorContext.class,0);
		}
		public Eq_factor_singleContext(Eq_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterEq_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitEq_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitEq_factor_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_factorContext eq_factor() throws RecognitionException {
		Eq_factorContext _localctx = new Eq_factorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eq_factor);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Equals_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				b_factor();
				setState(163);
				dif_opt();
				setState(164);
				b_factor();
				}
				break;
			case 2:
				_localctx = new Eq_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				b_factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dif_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_IGUAL() { return getToken(Neo4JParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_DIF() { return getToken(Neo4JParser.TOKEN_DIF, 0); }
		public Dif_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dif_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterDif_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitDif_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitDif_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dif_optContext dif_opt() throws RecognitionException {
		Dif_optContext _localctx = new Dif_optContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dif_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_IGUAL || _la==TOKEN_DIF) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class B_factorContext extends ParserRuleContext {
		public B_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_factor; }
	 
		public B_factorContext() { }
		public void copyFrom(B_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rel_operationContext extends B_factorContext {
		public List<Exp_numContext> exp_num() {
			return getRuleContexts(Exp_numContext.class);
		}
		public Exp_numContext exp_num(int i) {
			return getRuleContext(Exp_numContext.class,i);
		}
		public Rel_optContext rel_opt() {
			return getRuleContext(Rel_optContext.class,0);
		}
		public Rel_operationContext(B_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRel_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRel_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRel_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class B_factor_singleContext extends B_factorContext {
		public Exp_numContext exp_num() {
			return getRuleContext(Exp_numContext.class,0);
		}
		public B_factor_singleContext(B_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterB_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitB_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitB_factor_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_factorContext b_factor() throws RecognitionException {
		B_factorContext _localctx = new B_factorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_b_factor);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Rel_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				exp_num(0);
				setState(172);
				rel_opt();
				setState(173);
				exp_num(0);
				}
				break;
			case 2:
				_localctx = new B_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				exp_num(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_MAYOR() { return getToken(Neo4JParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_MAYOR_IGUAL() { return getToken(Neo4JParser.TOKEN_MAYOR_IGUAL, 0); }
		public TerminalNode TOKEN_MENOR() { return getToken(Neo4JParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MENOR_IGUAL() { return getToken(Neo4JParser.TOKEN_MENOR_IGUAL, 0); }
		public TerminalNode TOKEN_IGUAL() { return getToken(Neo4JParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_REGEX() { return getToken(Neo4JParser.TOKEN_REGEX, 0); }
		public Rel_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRel_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRel_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRel_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_optContext rel_opt() throws RecognitionException {
		Rel_optContext _localctx = new Rel_optContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rel_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_IGUAL) | (1L << TOKEN_REGEX) | (1L << TOKEN_MAYOR) | (1L << TOKEN_MAYOR_IGUAL) | (1L << TOKEN_MENOR) | (1L << TOKEN_MENOR_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_numContext extends ParserRuleContext {
		public Exp_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_num; }
	 
		public Exp_numContext() { }
		public void copyFrom(Exp_numContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Exp_num_singleContext extends Exp_numContext {
		public Mod_termContext mod_term() {
			return getRuleContext(Mod_termContext.class,0);
		}
		public Exp_num_singleContext(Exp_numContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterExp_num_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitExp_num_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitExp_num_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sum_operationContext extends Exp_numContext {
		public Exp_numContext exp_num() {
			return getRuleContext(Exp_numContext.class,0);
		}
		public Sum_optContext sum_opt() {
			return getRuleContext(Sum_optContext.class,0);
		}
		public Mod_termContext mod_term() {
			return getRuleContext(Mod_termContext.class,0);
		}
		public Sum_operationContext(Exp_numContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterSum_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitSum_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitSum_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_numContext exp_num() throws RecognitionException {
		return exp_num(0);
	}

	private Exp_numContext exp_num(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp_numContext _localctx = new Exp_numContext(_ctx, _parentState);
		Exp_numContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exp_num, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Exp_num_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(181);
			mod_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sum_operationContext(new Exp_numContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp_num);
					setState(183);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(184);
					sum_opt();
					setState(185);
					mod_term(0);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Sum_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_MAS() { return getToken(Neo4JParser.TOKEN_MAS, 0); }
		public TerminalNode TOKEN_MENOS() { return getToken(Neo4JParser.TOKEN_MENOS, 0); }
		public Sum_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterSum_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitSum_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitSum_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sum_optContext sum_opt() throws RecognitionException {
		Sum_optContext _localctx = new Sum_optContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sum_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_MAS || _la==TOKEN_MENOS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mod_termContext extends ParserRuleContext {
		public Mod_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_term; }
	 
		public Mod_termContext() { }
		public void copyFrom(Mod_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Mod_term_singleContext extends Mod_termContext {
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public Mod_term_singleContext(Mod_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterMod_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitMod_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitMod_term_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mul_mod_operationContext extends Mod_termContext {
		public Mod_termContext mod_term() {
			return getRuleContext(Mod_termContext.class,0);
		}
		public Mul_optContext mul_opt() {
			return getRuleContext(Mul_optContext.class,0);
		}
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public Mul_mod_operationContext(Mod_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterMul_mod_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitMul_mod_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitMul_mod_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_termContext mod_term() throws RecognitionException {
		return mod_term(0);
	}

	private Mod_termContext mod_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Mod_termContext _localctx = new Mod_termContext(_ctx, _parentState);
		Mod_termContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_mod_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Mod_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(195);
			s_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Mul_mod_operationContext(new Mod_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mod_term);
					setState(197);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(198);
					mul_opt();
					setState(199);
					s_term(0);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Mul_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_MUL() { return getToken(Neo4JParser.TOKEN_MUL, 0); }
		public TerminalNode TOKEN_DIV() { return getToken(Neo4JParser.TOKEN_DIV, 0); }
		public Token_modContext token_mod() {
			return getRuleContext(Token_modContext.class,0);
		}
		public Mul_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterMul_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitMul_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitMul_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_optContext mul_opt() throws RecognitionException {
		Mul_optContext _localctx = new Mul_optContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mul_opt);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case TOKEN_MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(TOKEN_MUL);
				}
				break;
			case TOKEN_DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(TOKEN_DIV);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				token_mod();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class S_termContext extends ParserRuleContext {
		public S_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_term; }
	 
		public S_termContext() { }
		public void copyFrom(S_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class S_term_singleContext extends S_termContext {
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public S_term_singleContext(S_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterS_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitS_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitS_term_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pot_operationContext extends S_termContext {
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public TerminalNode TOKEN_POT() { return getToken(Neo4JParser.TOKEN_POT, 0); }
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public Pot_operationContext(S_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterPot_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitPot_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitPot_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_termContext s_term() throws RecognitionException {
		return s_term(0);
	}

	private S_termContext s_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		S_termContext _localctx = new S_termContext(_ctx, _parentState);
		S_termContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_s_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new S_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(212);
			not_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Pot_operationContext(new S_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_s_term);
					setState(214);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(215);
					match(TOKEN_POT);
					setState(216);
					not_factor();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Not_factorContext extends ParserRuleContext {
		public Not_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_factor; }
	 
		public Not_factorContext() { }
		public void copyFrom(Not_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Not_factor_singleContext extends Not_factorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Not_factor_singleContext(Not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNot_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNot_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNot_factor_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Negation_operationContext extends Not_factorContext {
		public Token_negContext token_neg() {
			return getRuleContext(Token_negContext.class,0);
		}
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public Negation_operationContext(Not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNegation_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNegation_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNegation_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_factorContext not_factor() throws RecognitionException {
		Not_factorContext _localctx = new Not_factorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_not_factor);
		try {
			setState(226);
			switch (_input.LA(1)) {
			case T__3:
			case NOT:
				_localctx = new Negation_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				token_neg();
				setState(223);
				not_factor();
				}
				break;
			case AVG:
			case SUM:
			case DISTINCT:
			case MAX:
			case MIN:
			case TRUE:
			case FALSE:
			case COUNT:
			case ID:
			case TOKEN_PAR_IZR:
			case TOKEN_CADENA:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
				_localctx = new Not_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode TOKEN_CADENA() { return getToken(Neo4JParser.TOKEN_CADENA, 0); }
		public TerminalNode TOKEN_REAL() { return getToken(Neo4JParser.TOKEN_REAL, 0); }
		public TerminalNode TOKEN_ENTERO() { return getToken(Neo4JParser.TOKEN_ENTERO, 0); }
		public TerminalNode TRUE() { return getToken(Neo4JParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Neo4JParser.FALSE, 0); }
		public TerminalNode TOKEN_PAR_IZR() { return getToken(Neo4JParser.TOKEN_PAR_IZR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(Neo4JParser.TOKEN_PAR_DER, 0); }
		public List<TerminalNode> ID() { return getTokens(Neo4JParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Neo4JParser.ID, i);
		}
		public TerminalNode TOKEN_PUNTO() { return getToken(Neo4JParser.TOKEN_PUNTO, 0); }
		public Function_sentenceContext function_sentence() {
			return getRuleContext(Function_sentenceContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case TOKEN_CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(TOKEN_CADENA);
				}
				break;
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(TOKEN_REAL);
				}
				break;
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(TOKEN_ENTERO);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(FALSE);
				}
				break;
			case TOKEN_PAR_IZR:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(TOKEN_PAR_IZR);
				setState(234);
				exp(0);
				setState(235);
				match(TOKEN_PAR_DER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				match(ID);
				setState(238);
				match(TOKEN_PUNTO);
				setState(239);
				match(ID);
				}
				break;
			case AVG:
			case SUM:
			case DISTINCT:
			case MAX:
			case MIN:
			case COUNT:
				enterOuterAlt(_localctx, 8);
				{
				setState(240);
				function_sentence();
				setState(241);
				match(TOKEN_PAR_IZR);
				setState(242);
				exp(0);
				setState(243);
				match(TOKEN_PAR_DER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_sentenceContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(Neo4JParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(Neo4JParser.COUNT, 0); }
		public TerminalNode SUM() { return getToken(Neo4JParser.SUM, 0); }
		public TerminalNode MAX() { return getToken(Neo4JParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(Neo4JParser.MIN, 0); }
		public TerminalNode DISTINCT() { return getToken(Neo4JParser.DISTINCT, 0); }
		public Function_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterFunction_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitFunction_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitFunction_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_sentenceContext function_sentence() throws RecognitionException {
		Function_sentenceContext _localctx = new Function_sentenceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << SUM) | (1L << DISTINCT) | (1L << MAX) | (1L << MIN) | (1L << COUNT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relationship_relsContext extends ParserRuleContext {
		public TerminalNode RELATIONSHIP() { return getToken(Neo4JParser.RELATIONSHIP, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode RELS() { return getToken(Neo4JParser.RELS, 0); }
		public Relationship_relsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship_rels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRelationship_rels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRelationship_rels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRelationship_rels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relationship_relsContext relationship_rels() throws RecognitionException {
		Relationship_relsContext _localctx = new Relationship_relsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relationship_rels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(RELATIONSHIP);
			setState(250);
			match(TOKEN_DOSP);
			setState(251);
			match(RELS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_nodesContext extends ParserRuleContext {
		public TerminalNode NODE() { return getToken(Neo4JParser.NODE, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode NODES() { return getToken(Neo4JParser.NODES, 0); }
		public Node_nodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_nodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNode_nodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNode_nodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNode_nodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_nodesContext node_nodes() throws RecognitionException {
		Node_nodesContext _localctx = new Node_nodesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_node_nodes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(NODE);
			setState(254);
			match(TOKEN_DOSP);
			setState(255);
			match(NODES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Token_modContext extends ParserRuleContext {
		public Token_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_modContext token_mod() throws RecognitionException {
		Token_modContext _localctx = new Token_modContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_token_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Token_yContext extends ParserRuleContext {
		public Token_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_y(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_y(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_yContext token_y() throws RecognitionException {
		Token_yContext _localctx = new Token_yContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_token_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Token_oContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(Neo4JParser.OR, 0); }
		public Token_oContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_o(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_o(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_o(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_oContext token_o() throws RecognitionException {
		Token_oContext _localctx = new Token_oContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_token_o);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Token_negContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(Neo4JParser.NOT, 0); }
		public Token_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_negContext token_neg() throws RecognitionException {
		Token_negContext _localctx = new Token_negContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_token_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 10:
			return b_term_sempred((B_termContext)_localctx, predIndex);
		case 15:
			return exp_num_sempred((Exp_numContext)_localctx, predIndex);
		case 17:
			return mod_term_sempred((Mod_termContext)_localctx, predIndex);
		case 19:
			return s_term_sempred((S_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean b_term_sempred(B_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_num_sempred(Exp_numContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mod_term_sempred(Mod_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean s_term_sempred(S_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3R\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4"+
		"Q\13\4\5\4S\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3"+
		"\6\3\6\6\6d\n\6\r\6\16\6e\5\6h\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\6\b"+
		"r\n\b\r\b\16\bs\3\t\3\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u0088\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0094\n\13\f\13\16\13\u0097\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u00a0\n\f\f\f\16\f\u00a3\13\f\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00aa\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b3\n\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00be\n\21\f\21\16\21\u00c1\13"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00cc\n\23\f\23"+
		"\16\23\u00cf\13\23\3\24\3\24\3\24\5\24\u00d4\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u00dc\n\25\f\25\16\25\u00df\13\25\3\26\3\26\3\26\3\26"+
		"\5\26\u00e5\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f8\n\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\2\7\24\26 $(\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:\2\b\4\2\63\63\66\66\4\2\63\64\67:\3\2FG\4\2\n\16\34\34\4\2\5"+
		"\5\21\21\4\2\6\6\22\22\u010a\2<\3\2\2\2\4>\3\2\2\2\6R\3\2\2\2\bT\3\2\2"+
		"\2\ng\3\2\2\2\fi\3\2\2\2\16m\3\2\2\2\20u\3\2\2\2\22\u0087\3\2\2\2\24\u0089"+
		"\3\2\2\2\26\u0098\3\2\2\2\30\u00a9\3\2\2\2\32\u00ab\3\2\2\2\34\u00b2\3"+
		"\2\2\2\36\u00b4\3\2\2\2 \u00b6\3\2\2\2\"\u00c2\3\2\2\2$\u00c4\3\2\2\2"+
		"&\u00d3\3\2\2\2(\u00d5\3\2\2\2*\u00e4\3\2\2\2,\u00f7\3\2\2\2.\u00f9\3"+
		"\2\2\2\60\u00fb\3\2\2\2\62\u00ff\3\2\2\2\64\u0103\3\2\2\2\66\u0105\3\2"+
		"\2\28\u0107\3\2\2\2:\u0109\3\2\2\2<=\5\4\3\2=\3\3\2\2\2>?\7\b\2\2?@\5"+
		"\6\4\2@A\7C\2\2A\5\3\2\2\2BG\5\f\7\2CD\7A\2\2DF\5\f\7\2EC\3\2\2\2FI\3"+
		"\2\2\2GE\3\2\2\2GH\3\2\2\2HS\3\2\2\2IG\3\2\2\2JO\5\b\5\2KL\7A\2\2LN\5"+
		"\b\5\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RB\3"+
		"\2\2\2RJ\3\2\2\2S\7\3\2\2\2TU\5\f\7\2UV\5\n\6\2VW\5\f\7\2W\t\3\2\2\2X"+
		"h\7H\2\2Yh\7I\2\2Z[\7G\2\2[^\7=\2\2\\]\7M\2\2]_\7\62\2\2^\\\3\2\2\2^_"+
		"\3\2\2\2_`\3\2\2\2`a\7>\2\2ac\7G\2\2bd\7\67\2\2cb\3\2\2\2de\3\2\2\2ec"+
		"\3\2\2\2ef\3\2\2\2fh\3\2\2\2gX\3\2\2\2gY\3\2\2\2gZ\3\2\2\2h\13\3\2\2\2"+
		"ij\7;\2\2jk\5\16\b\2kl\7<\2\2l\r\3\2\2\2mn\7\61\2\2no\7M\2\2oq\7\62\2"+
		"\2pr\5\20\t\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2uv\7"+
		"?\2\2v{\5\22\n\2wx\7A\2\2xz\5\22\n\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7@\2\2\177\21\3\2\2\2\u0080\u0081\7\61"+
		"\2\2\u0081\u0082\7M\2\2\u0082\u0088\5\24\13\2\u0083\u0084\7\61\2\2\u0084"+
		"\u0085\5\36\20\2\u0085\u0086\5\24\13\2\u0086\u0088\3\2\2\2\u0087\u0080"+
		"\3\2\2\2\u0087\u0083\3\2\2\2\u0088\23\3\2\2\2\u0089\u008a\b\13\1\2\u008a"+
		"\u008b\5\26\f\2\u008b\u0095\3\2\2\2\u008c\u008d\f\5\2\2\u008d\u008e\5"+
		"8\35\2\u008e\u008f\5\26\f\2\u008f\u0094\3\2\2\2\u0090\u0091\f\4\2\2\u0091"+
		"\u0092\7L\2\2\u0092\u0094\5\26\f\2\u0093\u008c\3\2\2\2\u0093\u0090\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\25\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\b\f\1\2\u0099\u009a\5\30\r"+
		"\2\u009a\u00a1\3\2\2\2\u009b\u009c\f\4\2\2\u009c\u009d\5\66\34\2\u009d"+
		"\u009e\5\30\r\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\27\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\5\32\16\2\u00a6\u00a7"+
		"\5\34\17\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\5\34\17\2\u00a9\u00a4\3\2\2"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac\33\3"+
		"\2\2\2\u00ad\u00ae\5 \21\2\u00ae\u00af\5\36\20\2\u00af\u00b0\5 \21\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00b3\5 \21\2\u00b2\u00ad\3\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\35\3\2\2\2\u00b4\u00b5\t\3\2\2\u00b5\37\3\2\2\2\u00b6\u00b7"+
		"\b\21\1\2\u00b7\u00b8\5$\23\2\u00b8\u00bf\3\2\2\2\u00b9\u00ba\f\4\2\2"+
		"\u00ba\u00bb\5\"\22\2\u00bb\u00bc\5$\23\2\u00bc\u00be\3\2\2\2\u00bd\u00b9"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"!\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\t\4\2\2\u00c3#\3\2\2\2\u00c4"+
		"\u00c5\b\23\1\2\u00c5\u00c6\5(\25\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8\f"+
		"\4\2\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\5(\25\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c7\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce%\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d4\7D\2\2\u00d1\u00d4"+
		"\7E\2\2\u00d2\u00d4\5\64\33\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\b\25\1\2\u00d6\u00d7"+
		"\5*\26\2\u00d7\u00dd\3\2\2\2\u00d8\u00d9\f\4\2\2\u00d9\u00da\7J\2\2\u00da"+
		"\u00dc\5*\26\2\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de)\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1"+
		"\5:\36\2\u00e1\u00e2\5*\26\2\u00e2\u00e5\3\2\2\2\u00e3\u00e5\5,\27\2\u00e4"+
		"\u00e0\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5+\3\2\2\2\u00e6\u00f8\7N\2\2\u00e7"+
		"\u00f8\7O\2\2\u00e8\u00f8\7P\2\2\u00e9\u00f8\7\27\2\2\u00ea\u00f8\7\30"+
		"\2\2\u00eb\u00ec\7;\2\2\u00ec\u00ed\5\24\13\2\u00ed\u00ee\7<\2\2\u00ee"+
		"\u00f8\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7K\2\2\u00f1\u00f8\7\61"+
		"\2\2\u00f2\u00f3\5.\30\2\u00f3\u00f4\7;\2\2\u00f4\u00f5\5\24\13\2\u00f5"+
		"\u00f6\7<\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00e6\3\2\2\2\u00f7\u00e7\3\2"+
		"\2\2\u00f7\u00e8\3\2\2\2\u00f7\u00e9\3\2\2\2\u00f7\u00ea\3\2\2\2\u00f7"+
		"\u00eb\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8-\3\2\2\2"+
		"\u00f9\u00fa\t\5\2\2\u00fa/\3\2\2\2\u00fb\u00fc\7\36\2\2\u00fc\u00fd\7"+
		"M\2\2\u00fd\u00fe\7\35\2\2\u00fe\61\3\2\2\2\u00ff\u0100\7\37\2\2\u0100"+
		"\u0101\7M\2\2\u0101\u0102\7 \2\2\u0102\63\3\2\2\2\u0103\u0104\7\3\2\2"+
		"\u0104\65\3\2\2\2\u0105\u0106\7\4\2\2\u0106\67\3\2\2\2\u0107\u0108\t\6"+
		"\2\2\u01089\3\2\2\2\u0109\u010a\t\7\2\2\u010a;\3\2\2\2\26GOR^egs{\u0087"+
		"\u0093\u0095\u00a1\u00a9\u00b2\u00bf\u00cd\u00d3\u00dd\u00e4\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}