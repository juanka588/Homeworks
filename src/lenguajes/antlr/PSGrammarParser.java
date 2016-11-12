// Generated from PSGrammar.g4 by ANTLR 4.5.3
package lenguajes.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SUBPROCESO=9, 
		FINSUBPROCESO=10, FUNCION=11, FINFUNCION=12, PROCESO=13, ALGORITMO=14, 
		FINPROCESO=15, FINALGORITMO=16, SI=17, ENTONCES=18, FINSI=19, SINO=20, 
		PARA=21, HASTA=22, CON=23, PASO=24, FINPARA=25, HACER=26, MIENTRAS=27, 
		FINMIENTRAS=28, REPETIR=29, QUE=30, SEGUN=31, CASO=32, DE=33, OTRO=34, 
		MODO=35, ESPERAR=36, TECLA=37, SEGUNDOS=38, MILISEGUNDOS=39, BORRAR=40, 
		LIMPIAR=41, PANTALLA=42, DIMENSION=43, LEER=44, ESCRIBIR=45, DEFINIR=46, 
		COMO=47, FINSEGUN=48, VERDADERO=49, FALSO=50, ENTERO=51, REAL=52, NUMERO=53, 
		NUMERICO=54, TEXTO=55, CADENA=56, CARACTER=57, LOGICO=58, ID=59, TOKEN_ASIG=60, 
		TOKEN_IGUAL=61, TOKEN_DIF=62, TOKEN_MAYOR=63, TOKEN_MAYOR_IGUAL=64, TOKEN_MENOR=65, 
		TOKEN_MENOR_IGUAL=66, TOKEN_PAR_IZR=67, TOKEN_PAR_DER=68, TOKEN_COR_IZR=69, 
		TOKEN_COR_DER=70, TOKEN_COMA=71, TOKEN_PYC=72, TOKEN_MUL=73, TOKEN_DIV=74, 
		TOKEN_MAS=75, TOKEN_MENOS=76, TOKEN_POT=77, TOKEN_DOSP=78, TOKEN_CADENA=79, 
		TOKEN_REAL=80, TOKEN_ENTERO=81, WS=82, LINE_COMMENT=83;
	public static final int
		RULE_init = 0, RULE_sp = 1, RULE_end_sp = 2, RULE_p = 3, RULE_main_begin = 4, 
		RULE_main_end = 5, RULE_command = 6, RULE_if_sentence = 7, RULE_end_if = 8, 
		RULE_for_sentence = 9, RULE_while_sentence = 10, RULE_dowhile_sentence = 11, 
		RULE_switch_sentence = 12, RULE_case_sentence = 13, RULE_default_case = 14, 
		RULE_wait_sentence = 15, RULE_wait_type = 16, RULE_unity = 17, RULE_clear = 18, 
		RULE_dim = 19, RULE_def_dim = 20, RULE_def_dim_list = 21, RULE_read = 22, 
		RULE_write = 23, RULE_command_opt = 24, RULE_opt_args = 25, RULE_args = 26, 
		RULE_array_pos = 27, RULE_definition = 28, RULE_exp = 29, RULE_b_term = 30, 
		RULE_eq_factor = 31, RULE_dif_opt = 32, RULE_b_factor = 33, RULE_rel_opt = 34, 
		RULE_exp_num = 35, RULE_sum_opt = 36, RULE_mod_term = 37, RULE_mul_opt = 38, 
		RULE_s_term = 39, RULE_not_factor = 40, RULE_factor = 41, RULE_opt_complement = 42, 
		RULE_tipo = 43, RULE_token_mod = 44, RULE_token_y = 45, RULE_token_o = 46, 
		RULE_token_neg = 47;
	public static final String[] ruleNames = {
		"init", "sp", "end_sp", "p", "main_begin", "main_end", "command", "if_sentence", 
		"end_if", "for_sentence", "while_sentence", "dowhile_sentence", "switch_sentence", 
		"case_sentence", "default_case", "wait_sentence", "wait_type", "unity", 
		"clear", "dim", "def_dim", "def_dim_list", "read", "write", "command_opt", 
		"opt_args", "args", "array_pos", "definition", "exp", "b_term", "eq_factor", 
		"dif_opt", "b_factor", "rel_opt", "exp_num", "sum_opt", "mod_term", "mul_opt", 
		"s_term", "not_factor", "factor", "opt_complement", "tipo", "token_mod", 
		"token_y", "token_o", "token_neg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'mod'", "'&'", "'y'", "'|'", "'o'", "'~'", "'no'", null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'<-'", "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'('", 
		"')'", "'['", "']'", "','", "';'", "'*'", "'/'", "'+'", "'-'", "'^'", 
		"':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "SUBPROCESO", "FINSUBPROCESO", 
		"FUNCION", "FINFUNCION", "PROCESO", "ALGORITMO", "FINPROCESO", "FINALGORITMO", 
		"SI", "ENTONCES", "FINSI", "SINO", "PARA", "HASTA", "CON", "PASO", "FINPARA", 
		"HACER", "MIENTRAS", "FINMIENTRAS", "REPETIR", "QUE", "SEGUN", "CASO", 
		"DE", "OTRO", "MODO", "ESPERAR", "TECLA", "SEGUNDOS", "MILISEGUNDOS", 
		"BORRAR", "LIMPIAR", "PANTALLA", "DIMENSION", "LEER", "ESCRIBIR", "DEFINIR", 
		"COMO", "FINSEGUN", "VERDADERO", "FALSO", "ENTERO", "REAL", "NUMERO", 
		"NUMERICO", "TEXTO", "CADENA", "CARACTER", "LOGICO", "ID", "TOKEN_ASIG", 
		"TOKEN_IGUAL", "TOKEN_DIF", "TOKEN_MAYOR", "TOKEN_MAYOR_IGUAL", "TOKEN_MENOR", 
		"TOKEN_MENOR_IGUAL", "TOKEN_PAR_IZR", "TOKEN_PAR_DER", "TOKEN_COR_IZR", 
		"TOKEN_COR_DER", "TOKEN_COMA", "TOKEN_PYC", "TOKEN_MUL", "TOKEN_DIV", 
		"TOKEN_MAS", "TOKEN_MENOS", "TOKEN_POT", "TOKEN_DOSP", "TOKEN_CADENA", 
		"TOKEN_REAL", "TOKEN_ENTERO", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "PSGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PSGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public List<SpContext> sp() {
			return getRuleContexts(SpContext.class);
		}
		public SpContext sp(int i) {
			return getRuleContext(SpContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBPROCESO || _la==FUNCION) {
				{
				{
				setState(96);
				sp();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			p();
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

	public static class SpContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PSGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PSGrammarParser.ID, i);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public End_spContext end_sp() {
			return getRuleContext(End_spContext.class,0);
		}
		public TerminalNode SUBPROCESO() { return getToken(PSGrammarParser.SUBPROCESO, 0); }
		public TerminalNode FUNCION() { return getToken(PSGrammarParser.FUNCION, 0); }
		public TerminalNode TOKEN_ASIG() { return getToken(PSGrammarParser.TOKEN_ASIG, 0); }
		public TerminalNode TOKEN_PAR_IZR() { return getToken(PSGrammarParser.TOKEN_PAR_IZR, 0); }
		public TerminalNode TOKEN_PAR_DER() { return getToken(PSGrammarParser.TOKEN_PAR_DER, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PSGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PSGrammarParser.TOKEN_COMA, i);
		}
		public SpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterSp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitSp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitSp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpContext sp() throws RecognitionException {
		SpContext _localctx = new SpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==SUBPROCESO || _la==FUNCION) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(105);
				match(ID);
				setState(106);
				match(TOKEN_ASIG);
				}
				break;
			}
			setState(109);
			match(ID);
			setState(122);
			_la = _input.LA(1);
			if (_la==TOKEN_PAR_IZR) {
				{
				setState(110);
				match(TOKEN_PAR_IZR);
				setState(119);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(111);
					match(ID);
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TOKEN_COMA) {
						{
						{
						setState(112);
						match(TOKEN_COMA);
						setState(113);
						match(ID);
						}
						}
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(121);
				match(TOKEN_PAR_DER);
				}
			}

			setState(124);
			command();
			setState(125);
			end_sp();
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

	public static class End_spContext extends ParserRuleContext {
		public TerminalNode FINSUBPROCESO() { return getToken(PSGrammarParser.FINSUBPROCESO, 0); }
		public TerminalNode FINFUNCION() { return getToken(PSGrammarParser.FINFUNCION, 0); }
		public End_spContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_sp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterEnd_sp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitEnd_sp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitEnd_sp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_spContext end_sp() throws RecognitionException {
		End_spContext _localctx = new End_spContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_end_sp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==FINSUBPROCESO || _la==FINFUNCION) ) {
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

	public static class PContext extends ParserRuleContext {
		public Main_beginContext main_begin() {
			return getRuleContext(Main_beginContext.class,0);
		}
		public TerminalNode ID() { return getToken(PSGrammarParser.ID, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Main_endContext main_end() {
			return getRuleContext(Main_endContext.class,0);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			main_begin();
			setState(130);
			match(ID);
			setState(131);
			command();
			setState(132);
			main_end();
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

	public static class Main_beginContext extends ParserRuleContext {
		public TerminalNode PROCESO() { return getToken(PSGrammarParser.PROCESO, 0); }
		public TerminalNode ALGORITMO() { return getToken(PSGrammarParser.ALGORITMO, 0); }
		public Main_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterMain_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitMain_begin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitMain_begin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_beginContext main_begin() throws RecognitionException {
		Main_beginContext _localctx = new Main_beginContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==PROCESO || _la==ALGORITMO) ) {
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

	public static class Main_endContext extends ParserRuleContext {
		public TerminalNode FINPROCESO() { return getToken(PSGrammarParser.FINPROCESO, 0); }
		public TerminalNode FINALGORITMO() { return getToken(PSGrammarParser.FINALGORITMO, 0); }
		public Main_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterMain_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitMain_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitMain_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_endContext main_end() throws RecognitionException {
		Main_endContext _localctx = new Main_endContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==FINPROCESO || _la==FINALGORITMO) ) {
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Continue7Context extends CommandContext {
		public While_sentenceContext while_sentence() {
			return getRuleContext(While_sentenceContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Continue7Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue7(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue8Context extends CommandContext {
		public Dowhile_sentenceContext dowhile_sentence() {
			return getRuleContext(Dowhile_sentenceContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Continue8Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue9Context extends CommandContext {
		public Switch_sentenceContext switch_sentence() {
			return getRuleContext(Switch_sentenceContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Continue9Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue9(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue12Context extends CommandContext {
		public Continue12Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue12(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue12(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue12(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue3Context extends CommandContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(PSGrammarParser.TOKEN_PYC, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Continue3Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue4Context extends CommandContext {
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(PSGrammarParser.TOKEN_PYC, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Continue4Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueIDContext extends CommandContext {
		public TerminalNode ID() { return getToken(PSGrammarParser.ID, 0); }
		public TerminalNode TOKEN_PYC() { return getToken(PSGrammarParser.TOKEN_PYC, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Command_optContext command_opt() {
			return getRuleContext(Command_optContext.class,0);
		}
		public ContinueIDContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinueID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinueID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinueID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue5Context extends CommandContext {
		public If_sentenceContext if_sentence() {
			return getRuleContext(If_sentenceContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Continue5Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue6Context extends CommandContext {
		public For_sentenceContext for_sentence() {
			return getRuleContext(For_sentenceContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Continue6Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue1Context extends CommandContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(PSGrammarParser.TOKEN_PYC, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Continue1Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue10Context extends CommandContext {
		public Wait_sentenceContext wait_sentence() {
			return getRuleContext(Wait_sentenceContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(PSGrammarParser.TOKEN_PYC, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Continue10Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue10(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue2Context extends CommandContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(PSGrammarParser.TOKEN_PYC, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Continue2Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue11Context extends CommandContext {
		public ClearContext clear() {
			return getRuleContext(ClearContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(PSGrammarParser.TOKEN_PYC, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Continue11Context(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue11(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command);
		int _la;
		try {
			setState(184);
			switch (_input.LA(1)) {
			case DEFINIR:
				_localctx = new Continue1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				definition();
				setState(139);
				match(TOKEN_PYC);
				setState(140);
				command();
				}
				break;
			case ID:
				_localctx = new ContinueIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(ID);
				setState(144);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (TOKEN_ASIG - 60)) | (1L << (TOKEN_PAR_IZR - 60)) | (1L << (TOKEN_COR_IZR - 60)))) != 0)) {
					{
					setState(143);
					command_opt();
					}
				}

				setState(146);
				match(TOKEN_PYC);
				setState(147);
				command();
				}
				break;
			case LEER:
				_localctx = new Continue2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				read();
				setState(149);
				match(TOKEN_PYC);
				setState(150);
				command();
				}
				break;
			case ESCRIBIR:
				_localctx = new Continue3Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				write();
				setState(153);
				match(TOKEN_PYC);
				setState(154);
				command();
				}
				break;
			case DIMENSION:
				_localctx = new Continue4Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				dim();
				setState(157);
				match(TOKEN_PYC);
				setState(158);
				command();
				}
				break;
			case SI:
				_localctx = new Continue5Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				if_sentence();
				setState(161);
				command();
				}
				break;
			case PARA:
				_localctx = new Continue6Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				for_sentence();
				setState(164);
				command();
				}
				break;
			case MIENTRAS:
				_localctx = new Continue7Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(166);
				while_sentence();
				setState(167);
				command();
				}
				break;
			case REPETIR:
				_localctx = new Continue8Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				dowhile_sentence();
				setState(170);
				command();
				}
				break;
			case SEGUN:
				_localctx = new Continue9Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(172);
				switch_sentence();
				setState(173);
				command();
				}
				break;
			case ESPERAR:
				_localctx = new Continue10Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(175);
				wait_sentence();
				setState(176);
				match(TOKEN_PYC);
				setState(177);
				command();
				}
				break;
			case BORRAR:
			case LIMPIAR:
				_localctx = new Continue11Context(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				clear();
				setState(180);
				match(TOKEN_PYC);
				setState(181);
				command();
				}
				break;
			case FINSUBPROCESO:
			case FINFUNCION:
			case FINPROCESO:
			case FINALGORITMO:
			case FINSI:
			case SINO:
			case HASTA:
			case FINPARA:
			case FINMIENTRAS:
			case CASO:
			case DE:
			case FINSEGUN:
				_localctx = new Continue12Context(_localctx);
				enterOuterAlt(_localctx, 13);
				{
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

	public static class If_sentenceContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(PSGrammarParser.SI, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(PSGrammarParser.ENTONCES, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public End_ifContext end_if() {
			return getRuleContext(End_ifContext.class,0);
		}
		public If_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterIf_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitIf_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitIf_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sentenceContext if_sentence() throws RecognitionException {
		If_sentenceContext _localctx = new If_sentenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(SI);
			setState(187);
			exp(0);
			setState(188);
			match(ENTONCES);
			setState(189);
			command();
			setState(190);
			end_if();
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

	public static class End_ifContext extends ParserRuleContext {
		public TerminalNode FINSI() { return getToken(PSGrammarParser.FINSI, 0); }
		public TerminalNode SINO() { return getToken(PSGrammarParser.SINO, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public End_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterEnd_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitEnd_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitEnd_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_ifContext end_if() throws RecognitionException {
		End_ifContext _localctx = new End_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_end_if);
		try {
			setState(197);
			switch (_input.LA(1)) {
			case FINSI:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(FINSI);
				}
				break;
			case SINO:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(SINO);
				setState(194);
				command();
				setState(195);
				match(FINSI);
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

	public static class For_sentenceContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PSGrammarParser.PARA, 0); }
		public TerminalNode ID() { return getToken(PSGrammarParser.ID, 0); }
		public TerminalNode TOKEN_ASIG() { return getToken(PSGrammarParser.TOKEN_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(PSGrammarParser.HASTA, 0); }
		public List<Exp_numContext> exp_num() {
			return getRuleContexts(Exp_numContext.class);
		}
		public Exp_numContext exp_num(int i) {
			return getRuleContext(Exp_numContext.class,i);
		}
		public TerminalNode HACER() { return getToken(PSGrammarParser.HACER, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode FINPARA() { return getToken(PSGrammarParser.FINPARA, 0); }
		public TerminalNode CON() { return getToken(PSGrammarParser.CON, 0); }
		public TerminalNode PASO() { return getToken(PSGrammarParser.PASO, 0); }
		public For_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterFor_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitFor_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitFor_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_sentenceContext for_sentence() throws RecognitionException {
		For_sentenceContext _localctx = new For_sentenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(PARA);
			setState(200);
			match(ID);
			setState(201);
			match(TOKEN_ASIG);
			setState(202);
			exp(0);
			setState(203);
			match(HASTA);
			setState(204);
			exp_num(0);
			setState(208);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(205);
				match(CON);
				setState(206);
				match(PASO);
				setState(207);
				exp_num(0);
				}
			}

			setState(210);
			match(HACER);
			setState(211);
			command();
			setState(212);
			match(FINPARA);
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

	public static class While_sentenceContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PSGrammarParser.MIENTRAS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PSGrammarParser.HACER, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode FINMIENTRAS() { return getToken(PSGrammarParser.FINMIENTRAS, 0); }
		public While_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterWhile_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitWhile_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitWhile_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_sentenceContext while_sentence() throws RecognitionException {
		While_sentenceContext _localctx = new While_sentenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(MIENTRAS);
			setState(215);
			exp(0);
			setState(216);
			match(HACER);
			setState(217);
			command();
			setState(218);
			match(FINMIENTRAS);
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

	public static class Dowhile_sentenceContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(PSGrammarParser.REPETIR, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(PSGrammarParser.HASTA, 0); }
		public TerminalNode QUE() { return getToken(PSGrammarParser.QUE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Dowhile_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterDowhile_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitDowhile_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitDowhile_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dowhile_sentenceContext dowhile_sentence() throws RecognitionException {
		Dowhile_sentenceContext _localctx = new Dowhile_sentenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dowhile_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(REPETIR);
			setState(221);
			command();
			setState(222);
			match(HASTA);
			setState(223);
			match(QUE);
			setState(224);
			exp(0);
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

	public static class Switch_sentenceContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(PSGrammarParser.SEGUN, 0); }
		public Exp_numContext exp_num() {
			return getRuleContext(Exp_numContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PSGrammarParser.HACER, 0); }
		public Case_sentenceContext case_sentence() {
			return getRuleContext(Case_sentenceContext.class,0);
		}
		public Default_caseContext default_case() {
			return getRuleContext(Default_caseContext.class,0);
		}
		public TerminalNode FINSEGUN() { return getToken(PSGrammarParser.FINSEGUN, 0); }
		public Switch_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterSwitch_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitSwitch_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitSwitch_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_sentenceContext switch_sentence() throws RecognitionException {
		Switch_sentenceContext _localctx = new Switch_sentenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switch_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(SEGUN);
			setState(227);
			exp_num(0);
			setState(228);
			match(HACER);
			setState(229);
			case_sentence();
			setState(230);
			default_case();
			setState(231);
			match(FINSEGUN);
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

	public static class Case_sentenceContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PSGrammarParser.CASO, 0); }
		public Exp_numContext exp_num() {
			return getRuleContext(Exp_numContext.class,0);
		}
		public TerminalNode TOKEN_DOSP() { return getToken(PSGrammarParser.TOKEN_DOSP, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Case_sentenceContext case_sentence() {
			return getRuleContext(Case_sentenceContext.class,0);
		}
		public Case_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterCase_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitCase_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitCase_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_sentenceContext case_sentence() throws RecognitionException {
		Case_sentenceContext _localctx = new Case_sentenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_case_sentence);
		try {
			setState(240);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(CASO);
				setState(234);
				exp_num(0);
				setState(235);
				match(TOKEN_DOSP);
				setState(236);
				command();
				setState(237);
				case_sentence();
				}
				break;
			case DE:
			case FINSEGUN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Default_caseContext extends ParserRuleContext {
		public TerminalNode DE() { return getToken(PSGrammarParser.DE, 0); }
		public TerminalNode OTRO() { return getToken(PSGrammarParser.OTRO, 0); }
		public TerminalNode MODO() { return getToken(PSGrammarParser.MODO, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(PSGrammarParser.TOKEN_DOSP, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Default_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterDefault_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitDefault_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitDefault_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_caseContext default_case() throws RecognitionException {
		Default_caseContext _localctx = new Default_caseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_default_case);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case DE:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(DE);
				setState(243);
				match(OTRO);
				setState(244);
				match(MODO);
				setState(245);
				match(TOKEN_DOSP);
				setState(246);
				command();
				}
				break;
			case FINSEGUN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Wait_sentenceContext extends ParserRuleContext {
		public TerminalNode ESPERAR() { return getToken(PSGrammarParser.ESPERAR, 0); }
		public Wait_typeContext wait_type() {
			return getRuleContext(Wait_typeContext.class,0);
		}
		public Wait_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wait_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterWait_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitWait_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitWait_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wait_sentenceContext wait_sentence() throws RecognitionException {
		Wait_sentenceContext _localctx = new Wait_sentenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_wait_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ESPERAR);
			setState(251);
			wait_type();
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

	public static class Wait_typeContext extends ParserRuleContext {
		public TerminalNode TECLA() { return getToken(PSGrammarParser.TECLA, 0); }
		public Exp_numContext exp_num() {
			return getRuleContext(Exp_numContext.class,0);
		}
		public UnityContext unity() {
			return getRuleContext(UnityContext.class,0);
		}
		public Wait_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wait_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterWait_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitWait_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitWait_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wait_typeContext wait_type() throws RecognitionException {
		Wait_typeContext _localctx = new Wait_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_wait_type);
		try {
			setState(257);
			switch (_input.LA(1)) {
			case TECLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(TECLA);
				}
				break;
			case T__6:
			case T__7:
			case VERDADERO:
			case FALSO:
			case ID:
			case TOKEN_PAR_IZR:
			case TOKEN_CADENA:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				exp_num(0);
				setState(255);
				unity();
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

	public static class UnityContext extends ParserRuleContext {
		public TerminalNode SEGUNDOS() { return getToken(PSGrammarParser.SEGUNDOS, 0); }
		public TerminalNode MILISEGUNDOS() { return getToken(PSGrammarParser.MILISEGUNDOS, 0); }
		public UnityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterUnity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitUnity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitUnity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnityContext unity() throws RecognitionException {
		UnityContext _localctx = new UnityContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==SEGUNDOS || _la==MILISEGUNDOS) ) {
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

	public static class ClearContext extends ParserRuleContext {
		public TerminalNode BORRAR() { return getToken(PSGrammarParser.BORRAR, 0); }
		public TerminalNode PANTALLA() { return getToken(PSGrammarParser.PANTALLA, 0); }
		public TerminalNode LIMPIAR() { return getToken(PSGrammarParser.LIMPIAR, 0); }
		public ClearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterClear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitClear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitClear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearContext clear() throws RecognitionException {
		ClearContext _localctx = new ClearContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_clear);
		try {
			setState(265);
			switch (_input.LA(1)) {
			case BORRAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(BORRAR);
				setState(262);
				match(PANTALLA);
				}
				break;
			case LIMPIAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(LIMPIAR);
				setState(264);
				match(PANTALLA);
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

	public static class DimContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(PSGrammarParser.DIMENSION, 0); }
		public Def_dimContext def_dim() {
			return getRuleContext(Def_dimContext.class,0);
		}
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(DIMENSION);
			setState(268);
			def_dim();
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

	public static class Def_dimContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PSGrammarParser.ID, 0); }
		public Def_dim_listContext def_dim_list() {
			return getRuleContext(Def_dim_listContext.class,0);
		}
		public List<Array_posContext> array_pos() {
			return getRuleContexts(Array_posContext.class);
		}
		public Array_posContext array_pos(int i) {
			return getRuleContext(Array_posContext.class,i);
		}
		public Def_dimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterDef_dim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitDef_dim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitDef_dim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_dimContext def_dim() throws RecognitionException {
		Def_dimContext _localctx = new Def_dimContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_def_dim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(271);
				array_pos();
				}
				}
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_COR_IZR );
			setState(276);
			def_dim_list();
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

	public static class Def_dim_listContext extends ParserRuleContext {
		public TerminalNode TOKEN_COMA() { return getToken(PSGrammarParser.TOKEN_COMA, 0); }
		public Def_dimContext def_dim() {
			return getRuleContext(Def_dimContext.class,0);
		}
		public Def_dim_listContext def_dim_list() {
			return getRuleContext(Def_dim_listContext.class,0);
		}
		public Def_dim_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_dim_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterDef_dim_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitDef_dim_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitDef_dim_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_dim_listContext def_dim_list() throws RecognitionException {
		Def_dim_listContext _localctx = new Def_dim_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_def_dim_list);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(TOKEN_COMA);
				setState(279);
				def_dim();
				setState(280);
				def_dim_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(PSGrammarParser.LEER, 0); }
		public TerminalNode ID() { return getToken(PSGrammarParser.ID, 0); }
		public Array_posContext array_pos() {
			return getRuleContext(Array_posContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LEER);
			setState(286);
			match(ID);
			setState(287);
			array_pos();
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(PSGrammarParser.ESCRIBIR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PSGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PSGrammarParser.TOKEN_COMA, i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ESCRIBIR);
			setState(290);
			exp(0);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(291);
				match(TOKEN_COMA);
				setState(292);
				exp(0);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Command_optContext extends ParserRuleContext {
		public Command_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_opt; }
	 
		public Command_optContext() { }
		public void copyFrom(Command_optContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallContext extends Command_optContext {
		public Opt_argsContext opt_args() {
			return getRuleContext(Opt_argsContext.class,0);
		}
		public FunctionCallContext(Command_optContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllocContext extends Command_optContext {
		public TerminalNode TOKEN_ASIG() { return getToken(PSGrammarParser.TOKEN_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<Array_posContext> array_pos() {
			return getRuleContexts(Array_posContext.class);
		}
		public Array_posContext array_pos(int i) {
			return getRuleContext(Array_posContext.class,i);
		}
		public AllocContext(Command_optContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterAlloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitAlloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitAlloc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_optContext command_opt() throws RecognitionException {
		Command_optContext _localctx = new Command_optContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_command_opt);
		int _la;
		try {
			setState(307);
			switch (_input.LA(1)) {
			case TOKEN_ASIG:
			case TOKEN_COR_IZR:
				_localctx = new AllocContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COR_IZR) {
					{
					{
					setState(298);
					array_pos();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(TOKEN_ASIG);
				setState(305);
				exp(0);
				}
				break;
			case TOKEN_PAR_IZR:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				opt_args();
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

	public static class Opt_argsContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZR() { return getToken(PSGrammarParser.TOKEN_PAR_IZR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(PSGrammarParser.TOKEN_PAR_DER, 0); }
		public Opt_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterOpt_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitOpt_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitOpt_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_argsContext opt_args() throws RecognitionException {
		Opt_argsContext _localctx = new Opt_argsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opt_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(TOKEN_PAR_IZR);
			setState(310);
			args();
			setState(311);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PSGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PSGrammarParser.TOKEN_COMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_args);
		int _la;
		try {
			setState(322);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case VERDADERO:
			case FALSO:
			case ID:
			case TOKEN_PAR_IZR:
			case TOKEN_CADENA:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				exp(0);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(314);
					match(TOKEN_COMA);
					setState(315);
					exp(0);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TOKEN_PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Array_posContext extends ParserRuleContext {
		public TerminalNode TOKEN_COR_IZR() { return getToken(PSGrammarParser.TOKEN_COR_IZR, 0); }
		public List<Exp_numContext> exp_num() {
			return getRuleContexts(Exp_numContext.class);
		}
		public Exp_numContext exp_num(int i) {
			return getRuleContext(Exp_numContext.class,i);
		}
		public TerminalNode TOKEN_COR_DER() { return getToken(PSGrammarParser.TOKEN_COR_DER, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PSGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PSGrammarParser.TOKEN_COMA, i);
		}
		public Array_posContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_pos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterArray_pos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitArray_pos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitArray_pos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_posContext array_pos() throws RecognitionException {
		Array_posContext _localctx = new Array_posContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_pos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(TOKEN_COR_IZR);
			setState(325);
			exp_num(0);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(326);
				match(TOKEN_COMA);
				setState(327);
				exp_num(0);
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			match(TOKEN_COR_DER);
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
		public TerminalNode DEFINIR() { return getToken(PSGrammarParser.DEFINIR, 0); }
		public List<TerminalNode> ID() { return getTokens(PSGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PSGrammarParser.ID, i);
		}
		public TerminalNode COMO() { return getToken(PSGrammarParser.COMO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(PSGrammarParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(PSGrammarParser.TOKEN_COMA, i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(DEFINIR);
			setState(336);
			match(ID);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(337);
				match(TOKEN_COMA);
				setState(338);
				match(ID);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			match(COMO);
			setState(345);
			tipo();
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterOr_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitOr_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitOr_operation(this);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterExp_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitExp_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitExp_single(this);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Exp_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(348);
			b_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_operationContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(350);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(351);
					token_o();
					setState(352);
					b_term(0);
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterAnd_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitAnd_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitAnd_operation(this);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterB_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitB_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitB_term_single(this);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_b_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new B_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(360);
			eq_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_operationContext(new B_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_b_term);
					setState(362);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(363);
					token_y();
					setState(364);
					eq_factor();
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterEquals_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitEquals_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitEquals_operation(this);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterEq_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitEq_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitEq_factor_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_factorContext eq_factor() throws RecognitionException {
		Eq_factorContext _localctx = new Eq_factorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_eq_factor);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Equals_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				b_factor();
				setState(372);
				dif_opt();
				setState(373);
				b_factor();
				}
				break;
			case 2:
				_localctx = new Eq_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
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
		public TerminalNode TOKEN_IGUAL() { return getToken(PSGrammarParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_DIF() { return getToken(PSGrammarParser.TOKEN_DIF, 0); }
		public Dif_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dif_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterDif_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitDif_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitDif_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dif_optContext dif_opt() throws RecognitionException {
		Dif_optContext _localctx = new Dif_optContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dif_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterRel_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitRel_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitRel_operation(this);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterB_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitB_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitB_factor_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_factorContext b_factor() throws RecognitionException {
		B_factorContext _localctx = new B_factorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_b_factor);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new Rel_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				exp_num(0);
				setState(381);
				rel_opt();
				setState(382);
				exp_num(0);
				}
				break;
			case 2:
				_localctx = new B_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
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
		public TerminalNode TOKEN_MAYOR() { return getToken(PSGrammarParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_MAYOR_IGUAL() { return getToken(PSGrammarParser.TOKEN_MAYOR_IGUAL, 0); }
		public TerminalNode TOKEN_MENOR() { return getToken(PSGrammarParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MENOR_IGUAL() { return getToken(PSGrammarParser.TOKEN_MENOR_IGUAL, 0); }
		public Rel_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterRel_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitRel_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitRel_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_optContext rel_opt() throws RecognitionException {
		Rel_optContext _localctx = new Rel_optContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_rel_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (TOKEN_MAYOR - 63)) | (1L << (TOKEN_MAYOR_IGUAL - 63)) | (1L << (TOKEN_MENOR - 63)) | (1L << (TOKEN_MENOR_IGUAL - 63)))) != 0)) ) {
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterExp_num_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitExp_num_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitExp_num_single(this);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterSum_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitSum_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitSum_operation(this);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_exp_num, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Exp_num_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(390);
			mod_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sum_operationContext(new Exp_numContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp_num);
					setState(392);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(393);
					sum_opt();
					setState(394);
					mod_term(0);
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public TerminalNode TOKEN_MAS() { return getToken(PSGrammarParser.TOKEN_MAS, 0); }
		public TerminalNode TOKEN_MENOS() { return getToken(PSGrammarParser.TOKEN_MENOS, 0); }
		public Sum_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterSum_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitSum_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitSum_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sum_optContext sum_opt() throws RecognitionException {
		Sum_optContext _localctx = new Sum_optContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sum_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterMod_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitMod_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitMod_term_single(this);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterMul_mod_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitMul_mod_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitMul_mod_operation(this);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_mod_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Mod_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(404);
			s_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Mul_mod_operationContext(new Mod_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mod_term);
					setState(406);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(407);
					mul_opt();
					setState(408);
					s_term(0);
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public TerminalNode TOKEN_MUL() { return getToken(PSGrammarParser.TOKEN_MUL, 0); }
		public TerminalNode TOKEN_DIV() { return getToken(PSGrammarParser.TOKEN_DIV, 0); }
		public Token_modContext token_mod() {
			return getRuleContext(Token_modContext.class,0);
		}
		public Mul_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterMul_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitMul_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitMul_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_optContext mul_opt() throws RecognitionException {
		Mul_optContext _localctx = new Mul_optContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mul_opt);
		try {
			setState(418);
			switch (_input.LA(1)) {
			case TOKEN_MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(TOKEN_MUL);
				}
				break;
			case TOKEN_DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(TOKEN_DIV);
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterS_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitS_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitS_term_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pot_operationContext extends S_termContext {
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public TerminalNode TOKEN_POT() { return getToken(PSGrammarParser.TOKEN_POT, 0); }
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public Pot_operationContext(S_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterPot_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitPot_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitPot_operation(this);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_s_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new S_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(421);
			not_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Pot_operationContext(new S_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_s_term);
					setState(423);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(424);
					match(TOKEN_POT);
					setState(425);
					not_factor();
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterNot_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitNot_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitNot_factor_single(this);
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
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterNegation_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitNegation_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitNegation_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_factorContext not_factor() throws RecognitionException {
		Not_factorContext _localctx = new Not_factorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_not_factor);
		try {
			setState(435);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				_localctx = new Negation_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				token_neg();
				setState(432);
				not_factor();
				}
				break;
			case VERDADERO:
			case FALSO:
			case ID:
			case TOKEN_PAR_IZR:
			case TOKEN_CADENA:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
				_localctx = new Not_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
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
		public TerminalNode TOKEN_CADENA() { return getToken(PSGrammarParser.TOKEN_CADENA, 0); }
		public TerminalNode TOKEN_REAL() { return getToken(PSGrammarParser.TOKEN_REAL, 0); }
		public TerminalNode TOKEN_ENTERO() { return getToken(PSGrammarParser.TOKEN_ENTERO, 0); }
		public TerminalNode VERDADERO() { return getToken(PSGrammarParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(PSGrammarParser.FALSO, 0); }
		public TerminalNode TOKEN_PAR_IZR() { return getToken(PSGrammarParser.TOKEN_PAR_IZR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(PSGrammarParser.TOKEN_PAR_DER, 0); }
		public TerminalNode ID() { return getToken(PSGrammarParser.ID, 0); }
		public Opt_complementContext opt_complement() {
			return getRuleContext(Opt_complementContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_factor);
		try {
			setState(450);
			switch (_input.LA(1)) {
			case TOKEN_CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(TOKEN_CADENA);
				}
				break;
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(TOKEN_REAL);
				}
				break;
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				match(TOKEN_ENTERO);
				}
				break;
			case VERDADERO:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				match(VERDADERO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				match(FALSO);
				}
				break;
			case TOKEN_PAR_IZR:
				enterOuterAlt(_localctx, 6);
				{
				setState(442);
				match(TOKEN_PAR_IZR);
				setState(443);
				exp(0);
				setState(444);
				match(TOKEN_PAR_DER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(446);
				match(ID);
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(447);
					opt_complement();
					}
					break;
				}
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

	public static class Opt_complementContext extends ParserRuleContext {
		public Opt_complementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_complement; }
	 
		public Opt_complementContext() { }
		public void copyFrom(Opt_complementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContinueContext extends Opt_complementContext {
		public Opt_argsContext opt_args() {
			return getRuleContext(Opt_argsContext.class,0);
		}
		public ContinueContext(Opt_complementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array_callContext extends Opt_complementContext {
		public List<Array_posContext> array_pos() {
			return getRuleContexts(Array_posContext.class);
		}
		public Array_posContext array_pos(int i) {
			return getRuleContext(Array_posContext.class,i);
		}
		public Array_callContext(Opt_complementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterArray_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitArray_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitArray_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_complementContext opt_complement() throws RecognitionException {
		Opt_complementContext _localctx = new Opt_complementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_opt_complement);
		try {
			int _alt;
			setState(458);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZR:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				opt_args();
				}
				break;
			case TOKEN_COR_IZR:
				_localctx = new Array_callContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(454); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(453);
						array_pos();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(456); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(PSGrammarParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(PSGrammarParser.REAL, 0); }
		public TerminalNode NUMERO() { return getToken(PSGrammarParser.NUMERO, 0); }
		public TerminalNode NUMERICO() { return getToken(PSGrammarParser.NUMERICO, 0); }
		public TerminalNode TEXTO() { return getToken(PSGrammarParser.TEXTO, 0); }
		public TerminalNode CADENA() { return getToken(PSGrammarParser.CADENA, 0); }
		public TerminalNode CARACTER() { return getToken(PSGrammarParser.CARACTER, 0); }
		public TerminalNode LOGICO() { return getToken(PSGrammarParser.LOGICO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << REAL) | (1L << NUMERO) | (1L << NUMERICO) | (1L << TEXTO) | (1L << CADENA) | (1L << CARACTER) | (1L << LOGICO))) != 0)) ) {
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

	public static class Token_modContext extends ParserRuleContext {
		public Token_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterToken_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitToken_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitToken_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_modContext token_mod() throws RecognitionException {
		Token_modContext _localctx = new Token_modContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_token_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class Token_yContext extends ParserRuleContext {
		public Token_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterToken_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitToken_y(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitToken_y(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_yContext token_y() throws RecognitionException {
		Token_yContext _localctx = new Token_yContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_token_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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

	public static class Token_oContext extends ParserRuleContext {
		public Token_oContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterToken_o(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitToken_o(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitToken_o(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_oContext token_o() throws RecognitionException {
		Token_oContext _localctx = new Token_oContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_token_o);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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
		public Token_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterToken_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitToken_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSGrammarVisitor ) return ((PSGrammarVisitor<? extends T>)visitor).visitToken_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_negContext token_neg() throws RecognitionException {
		Token_negContext _localctx = new Token_negContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_token_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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
		case 29:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 30:
			return b_term_sempred((B_termContext)_localctx, predIndex);
		case 35:
			return exp_num_sempred((Exp_numContext)_localctx, predIndex);
		case 37:
			return mod_term_sempred((Mod_termContext)_localctx, predIndex);
		case 39:
			return s_term_sempred((S_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean b_term_sempred(B_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_num_sempred(Exp_numContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mod_term_sempred(Mod_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean s_term_sempred(S_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3U\u01d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\5\3n\n\3\3\3\3\3\3\3\3\3\3\3\7\3u\n\3\f\3\16\3x\13"+
		"\3\5\3z\n\3\3\3\5\3}\n\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0093\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bb"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c8\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d3\n\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f3\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fb\n\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\5\22\u0104\n\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u010c\n"+
		"\24\3\25\3\25\3\25\3\26\3\26\6\26\u0113\n\26\r\26\16\26\u0114\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u011e\n\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\7\31\u0128\n\31\f\31\16\31\u012b\13\31\3\32\7\32\u012e\n\32"+
		"\f\32\16\32\u0131\13\32\3\32\3\32\3\32\5\32\u0136\n\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\7\34\u013f\n\34\f\34\16\34\u0142\13\34\3\34\5\34"+
		"\u0145\n\34\3\35\3\35\3\35\3\35\7\35\u014b\n\35\f\35\16\35\u014e\13\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u0156\n\36\f\36\16\36\u0159\13\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0165\n\37\f\37"+
		"\16\37\u0168\13\37\3 \3 \3 \3 \3 \3 \3 \7 \u0171\n \f \16 \u0174\13 \3"+
		"!\3!\3!\3!\3!\5!\u017b\n!\3\"\3\"\3#\3#\3#\3#\3#\5#\u0184\n#\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3%\7%\u018f\n%\f%\16%\u0192\13%\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\7\'\u019d\n\'\f\'\16\'\u01a0\13\'\3(\3(\3(\5(\u01a5\n(\3"+
		")\3)\3)\3)\3)\3)\7)\u01ad\n)\f)\16)\u01b0\13)\3*\3*\3*\3*\5*\u01b6\n*"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01c3\n+\5+\u01c5\n+\3,\3,\6,\u01c9"+
		"\n,\r,\16,\u01ca\5,\u01cd\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61"+
		"\2\7<>HLP\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`\2\17\4\2\13\13\r\r\4\2\f\f\16\16\3\2\17\20\3"+
		"\2\21\22\3\2()\3\2?@\3\2AD\3\2MN\3\2\65<\3\2\3\4\3\2\5\6\3\2\7\b\3\2\t"+
		"\n\u01dc\2e\3\2\2\2\4j\3\2\2\2\6\u0081\3\2\2\2\b\u0083\3\2\2\2\n\u0088"+
		"\3\2\2\2\f\u008a\3\2\2\2\16\u00ba\3\2\2\2\20\u00bc\3\2\2\2\22\u00c7\3"+
		"\2\2\2\24\u00c9\3\2\2\2\26\u00d8\3\2\2\2\30\u00de\3\2\2\2\32\u00e4\3\2"+
		"\2\2\34\u00f2\3\2\2\2\36\u00fa\3\2\2\2 \u00fc\3\2\2\2\"\u0103\3\2\2\2"+
		"$\u0105\3\2\2\2&\u010b\3\2\2\2(\u010d\3\2\2\2*\u0110\3\2\2\2,\u011d\3"+
		"\2\2\2.\u011f\3\2\2\2\60\u0123\3\2\2\2\62\u0135\3\2\2\2\64\u0137\3\2\2"+
		"\2\66\u0144\3\2\2\28\u0146\3\2\2\2:\u0151\3\2\2\2<\u015d\3\2\2\2>\u0169"+
		"\3\2\2\2@\u017a\3\2\2\2B\u017c\3\2\2\2D\u0183\3\2\2\2F\u0185\3\2\2\2H"+
		"\u0187\3\2\2\2J\u0193\3\2\2\2L\u0195\3\2\2\2N\u01a4\3\2\2\2P\u01a6\3\2"+
		"\2\2R\u01b5\3\2\2\2T\u01c4\3\2\2\2V\u01cc\3\2\2\2X\u01ce\3\2\2\2Z\u01d0"+
		"\3\2\2\2\\\u01d2\3\2\2\2^\u01d4\3\2\2\2`\u01d6\3\2\2\2bd\5\4\3\2cb\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\5\b\5\2i\3\3"+
		"\2\2\2jm\t\2\2\2kl\7=\2\2ln\7>\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2o|\7="+
		"\2\2py\7E\2\2qv\7=\2\2rs\7I\2\2su\7=\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2yq\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\7F\2\2"+
		"|p\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\5\16\b\2\177\u0080\5\6\4\2\u0080\5"+
		"\3\2\2\2\u0081\u0082\t\3\2\2\u0082\7\3\2\2\2\u0083\u0084\5\n\6\2\u0084"+
		"\u0085\7=\2\2\u0085\u0086\5\16\b\2\u0086\u0087\5\f\7\2\u0087\t\3\2\2\2"+
		"\u0088\u0089\t\4\2\2\u0089\13\3\2\2\2\u008a\u008b\t\5\2\2\u008b\r\3\2"+
		"\2\2\u008c\u008d\5:\36\2\u008d\u008e\7J\2\2\u008e\u008f\5\16\b\2\u008f"+
		"\u00bb\3\2\2\2\u0090\u0092\7=\2\2\u0091\u0093\5\62\32\2\u0092\u0091\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7J\2\2\u0095"+
		"\u00bb\5\16\b\2\u0096\u0097\5.\30\2\u0097\u0098\7J\2\2\u0098\u0099\5\16"+
		"\b\2\u0099\u00bb\3\2\2\2\u009a\u009b\5\60\31\2\u009b\u009c\7J\2\2\u009c"+
		"\u009d\5\16\b\2\u009d\u00bb\3\2\2\2\u009e\u009f\5(\25\2\u009f\u00a0\7"+
		"J\2\2\u00a0\u00a1\5\16\b\2\u00a1\u00bb\3\2\2\2\u00a2\u00a3\5\20\t\2\u00a3"+
		"\u00a4\5\16\b\2\u00a4\u00bb\3\2\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7"+
		"\5\16\b\2\u00a7\u00bb\3\2\2\2\u00a8\u00a9\5\26\f\2\u00a9\u00aa\5\16\b"+
		"\2\u00aa\u00bb\3\2\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00ad\5\16\b\2\u00ad"+
		"\u00bb\3\2\2\2\u00ae\u00af\5\32\16\2\u00af\u00b0\5\16\b\2\u00b0\u00bb"+
		"\3\2\2\2\u00b1\u00b2\5 \21\2\u00b2\u00b3\7J\2\2\u00b3\u00b4\5\16\b\2\u00b4"+
		"\u00bb\3\2\2\2\u00b5\u00b6\5&\24\2\u00b6\u00b7\7J\2\2\u00b7\u00b8\5\16"+
		"\b\2\u00b8\u00bb\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u008c\3\2\2\2\u00ba"+
		"\u0090\3\2\2\2\u00ba\u0096\3\2\2\2\u00ba\u009a\3\2\2\2\u00ba\u009e\3\2"+
		"\2\2\u00ba\u00a2\3\2\2\2\u00ba\u00a5\3\2\2\2\u00ba\u00a8\3\2\2\2\u00ba"+
		"\u00ab\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b5\3\2"+
		"\2\2\u00ba\u00b9\3\2\2\2\u00bb\17\3\2\2\2\u00bc\u00bd\7\23\2\2\u00bd\u00be"+
		"\5<\37\2\u00be\u00bf\7\24\2\2\u00bf\u00c0\5\16\b\2\u00c0\u00c1\5\22\n"+
		"\2\u00c1\21\3\2\2\2\u00c2\u00c8\7\25\2\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5"+
		"\5\16\b\2\u00c5\u00c6\7\25\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c2\3\2\2\2"+
		"\u00c7\u00c3\3\2\2\2\u00c8\23\3\2\2\2\u00c9\u00ca\7\27\2\2\u00ca\u00cb"+
		"\7=\2\2\u00cb\u00cc\7>\2\2\u00cc\u00cd\5<\37\2\u00cd\u00ce\7\30\2\2\u00ce"+
		"\u00d2\5H%\2\u00cf\u00d0\7\31\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00d3\5H"+
		"%\2\u00d2\u00cf\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\7\34\2\2\u00d5\u00d6\5\16\b\2\u00d6\u00d7\7\33\2\2\u00d7\25\3\2"+
		"\2\2\u00d8\u00d9\7\35\2\2\u00d9\u00da\5<\37\2\u00da\u00db\7\34\2\2\u00db"+
		"\u00dc\5\16\b\2\u00dc\u00dd\7\36\2\2\u00dd\27\3\2\2\2\u00de\u00df\7\37"+
		"\2\2\u00df\u00e0\5\16\b\2\u00e0\u00e1\7\30\2\2\u00e1\u00e2\7 \2\2\u00e2"+
		"\u00e3\5<\37\2\u00e3\31\3\2\2\2\u00e4\u00e5\7!\2\2\u00e5\u00e6\5H%\2\u00e6"+
		"\u00e7\7\34\2\2\u00e7\u00e8\5\34\17\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea"+
		"\7\62\2\2\u00ea\33\3\2\2\2\u00eb\u00ec\7\"\2\2\u00ec\u00ed\5H%\2\u00ed"+
		"\u00ee\7P\2\2\u00ee\u00ef\5\16\b\2\u00ef\u00f0\5\34\17\2\u00f0\u00f3\3"+
		"\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\35\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\7$\2\2\u00f6\u00f7\7%\2\2\u00f7"+
		"\u00f8\7P\2\2\u00f8\u00fb\5\16\b\2\u00f9\u00fb\3\2\2\2\u00fa\u00f4\3\2"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fb\37\3\2\2\2\u00fc\u00fd\7&\2\2\u00fd\u00fe"+
		"\5\"\22\2\u00fe!\3\2\2\2\u00ff\u0104\7\'\2\2\u0100\u0101\5H%\2\u0101\u0102"+
		"\5$\23\2\u0102\u0104\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0104"+
		"#\3\2\2\2\u0105\u0106\t\6\2\2\u0106%\3\2\2\2\u0107\u0108\7*\2\2\u0108"+
		"\u010c\7,\2\2\u0109\u010a\7+\2\2\u010a\u010c\7,\2\2\u010b\u0107\3\2\2"+
		"\2\u010b\u0109\3\2\2\2\u010c\'\3\2\2\2\u010d\u010e\7-\2\2\u010e\u010f"+
		"\5*\26\2\u010f)\3\2\2\2\u0110\u0112\7=\2\2\u0111\u0113\58\35\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\5,\27\2\u0117+\3\2\2\2\u0118\u0119\7I\2\2\u0119"+
		"\u011a\5*\26\2\u011a\u011b\5,\27\2\u011b\u011e\3\2\2\2\u011c\u011e\3\2"+
		"\2\2\u011d\u0118\3\2\2\2\u011d\u011c\3\2\2\2\u011e-\3\2\2\2\u011f\u0120"+
		"\7.\2\2\u0120\u0121\7=\2\2\u0121\u0122\58\35\2\u0122/\3\2\2\2\u0123\u0124"+
		"\7/\2\2\u0124\u0129\5<\37\2\u0125\u0126\7I\2\2\u0126\u0128\5<\37\2\u0127"+
		"\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\61\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\58\35\2\u012d\u012c"+
		"\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7>\2\2\u0133\u0136\5<\37"+
		"\2\u0134\u0136\5\64\33\2\u0135\u012f\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\63\3\2\2\2\u0137\u0138\7E\2\2\u0138\u0139\5\66\34\2\u0139\u013a\7F\2"+
		"\2\u013a\65\3\2\2\2\u013b\u0140\5<\37\2\u013c\u013d\7I\2\2\u013d\u013f"+
		"\5<\37\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0145\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\3\2"+
		"\2\2\u0144\u013b\3\2\2\2\u0144\u0143\3\2\2\2\u0145\67\3\2\2\2\u0146\u0147"+
		"\7G\2\2\u0147\u014c\5H%\2\u0148\u0149\7I\2\2\u0149\u014b\5H%\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7H\2\2\u01509\3\2\2\2\u0151"+
		"\u0152\7\60\2\2\u0152\u0157\7=\2\2\u0153\u0154\7I\2\2\u0154\u0156\7=\2"+
		"\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\61\2\2"+
		"\u015b\u015c\5X-\2\u015c;\3\2\2\2\u015d\u015e\b\37\1\2\u015e\u015f\5>"+
		" \2\u015f\u0166\3\2\2\2\u0160\u0161\f\4\2\2\u0161\u0162\5^\60\2\u0162"+
		"\u0163\5> \2\u0163\u0165\3\2\2\2\u0164\u0160\3\2\2\2\u0165\u0168\3\2\2"+
		"\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167=\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0169\u016a\b \1\2\u016a\u016b\5@!\2\u016b\u0172\3\2\2\2\u016c"+
		"\u016d\f\4\2\2\u016d\u016e\5\\/\2\u016e\u016f\5@!\2\u016f\u0171\3\2\2"+
		"\2\u0170\u016c\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173?\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\5D#\2\u0176\u0177"+
		"\5B\"\2\u0177\u0178\5D#\2\u0178\u017b\3\2\2\2\u0179\u017b\5D#\2\u017a"+
		"\u0175\3\2\2\2\u017a\u0179\3\2\2\2\u017bA\3\2\2\2\u017c\u017d\t\7\2\2"+
		"\u017dC\3\2\2\2\u017e\u017f\5H%\2\u017f\u0180\5F$\2\u0180\u0181\5H%\2"+
		"\u0181\u0184\3\2\2\2\u0182\u0184\5H%\2\u0183\u017e\3\2\2\2\u0183\u0182"+
		"\3\2\2\2\u0184E\3\2\2\2\u0185\u0186\t\b\2\2\u0186G\3\2\2\2\u0187\u0188"+
		"\b%\1\2\u0188\u0189\5L\'\2\u0189\u0190\3\2\2\2\u018a\u018b\f\4\2\2\u018b"+
		"\u018c\5J&\2\u018c\u018d\5L\'\2\u018d\u018f\3\2\2\2\u018e\u018a\3\2\2"+
		"\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191I"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\t\t\2\2\u0194K\3\2\2\2\u0195"+
		"\u0196\b\'\1\2\u0196\u0197\5P)\2\u0197\u019e\3\2\2\2\u0198\u0199\f\4\2"+
		"\2\u0199\u019a\5N(\2\u019a\u019b\5P)\2\u019b\u019d\3\2\2\2\u019c\u0198"+
		"\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"M\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a5\7K\2\2\u01a2\u01a5\7L\2\2\u01a3"+
		"\u01a5\5Z.\2\u01a4\u01a1\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2"+
		"\2\u01a5O\3\2\2\2\u01a6\u01a7\b)\1\2\u01a7\u01a8\5R*\2\u01a8\u01ae\3\2"+
		"\2\2\u01a9\u01aa\f\4\2\2\u01aa\u01ab\7O\2\2\u01ab\u01ad\5R*\2\u01ac\u01a9"+
		"\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"Q\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\5`\61\2\u01b2\u01b3\5R*\2\u01b3"+
		"\u01b6\3\2\2\2\u01b4\u01b6\5T+\2\u01b5\u01b1\3\2\2\2\u01b5\u01b4\3\2\2"+
		"\2\u01b6S\3\2\2\2\u01b7\u01c5\7Q\2\2\u01b8\u01c5\7R\2\2\u01b9\u01c5\7"+
		"S\2\2\u01ba\u01c5\7\63\2\2\u01bb\u01c5\7\64\2\2\u01bc\u01bd\7E\2\2\u01bd"+
		"\u01be\5<\37\2\u01be\u01bf\7F\2\2\u01bf\u01c5\3\2\2\2\u01c0\u01c2\7=\2"+
		"\2\u01c1\u01c3\5V,\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5"+
		"\3\2\2\2\u01c4\u01b7\3\2\2\2\u01c4\u01b8\3\2\2\2\u01c4\u01b9\3\2\2\2\u01c4"+
		"\u01ba\3\2\2\2\u01c4\u01bb\3\2\2\2\u01c4\u01bc\3\2\2\2\u01c4\u01c0\3\2"+
		"\2\2\u01c5U\3\2\2\2\u01c6\u01cd\5\64\33\2\u01c7\u01c9\58\35\2\u01c8\u01c7"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cd\3\2\2\2\u01cc\u01c6\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cdW\3\2\2\2"+
		"\u01ce\u01cf\t\n\2\2\u01cfY\3\2\2\2\u01d0\u01d1\t\13\2\2\u01d1[\3\2\2"+
		"\2\u01d2\u01d3\t\f\2\2\u01d3]\3\2\2\2\u01d4\u01d5\t\r\2\2\u01d5_\3\2\2"+
		"\2\u01d6\u01d7\t\16\2\2\u01d7a\3\2\2\2%emvy|\u0092\u00ba\u00c7\u00d2\u00f2"+
		"\u00fa\u0103\u010b\u0114\u011d\u0129\u012f\u0135\u0140\u0144\u014c\u0157"+
		"\u0166\u0172\u017a\u0183\u0190\u019e\u01a4\u01ae\u01b5\u01c2\u01c4\u01ca"+
		"\u01cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}