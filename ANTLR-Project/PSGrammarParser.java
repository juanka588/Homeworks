// Generated from PSGrammar.g4 by ANTLR 4.5.3
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SUBPROCESO=7, FINSUBPROCESO=8, 
		FINFUNCION=9, PROCESO=10, ALGORITMO=11, FINPROCESO=12, FINALGORITMO=13, 
		SI=14, ENTONCES=15, FINSI=16, SINO=17, PARA=18, HASTA=19, CON=20, PASO=21, 
		FINPARA=22, HACER=23, MIENTRAS=24, FINMIENTRAS=25, REPETIR=26, QUE=27, 
		SEGUN=28, CASO=29, DE=30, OTRO=31, MODO=32, ESPERAR=33, TECLA=34, SEGUNDOS=35, 
		MILISEGUNDOS=36, BORRAR=37, LIMPIAR=38, PANTALLA=39, DIMENSION=40, LEER=41, 
		ESCRIBIR=42, DEFINIR=43, COMO=44, FINSEGUN=45, VERDADERO=46, FALSO=47, 
		ENTERO=48, REAL=49, NUMERO=50, NUMERICO=51, TEXTO=52, CADENA=53, CARACTER=54, 
		LOGICO=55, ID=56, TOKEN_ASIG=57, TOKEN_IGUAL=58, TOKEN_DIF=59, TOKEN_MAYOR=60, 
		TOKEN_MAYOR_IGUAL=61, TOKEN_MENOR=62, TOKEN_MENOR_IGUAL=63, TOKEN_PAR_IZR=64, 
		TOKEN_PAR_DER=65, TOKEN_COR_IZR=66, TOKEN_COR_DER=67, TOKEN_COMA=68, TOKEN_PYC=69, 
		TOKEN_MUL=70, TOKEN_DIV=71, TOKEN_MAS=72, TOKEN_MENOS=73, TOKEN_POT=74, 
		TOKEN_MOD=75, TOKEN_DOSP=76, TOKEN_CADENA=77, TOKEN_REAL=78, TOKEN_ENTERO=79, 
		WS=80, LINE_COMMENT=81;
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
		RULE_signed_factor = 39, RULE_s_term = 40, RULE_not_factor = 41, RULE_factor = 42, 
		RULE_opt_complement = 43, RULE_tipo = 44, RULE_token_y = 45, RULE_token_o = 46, 
		RULE_token_neg = 47;
	public static final String[] ruleNames = {
		"init", "sp", "end_sp", "p", "main_begin", "main_end", "command", "if_sentence", 
		"end_if", "for_sentence", "while_sentence", "dowhile_sentence", "switch_sentence", 
		"case_sentence", "default_case", "wait_sentence", "wait_type", "unity", 
		"clear", "dim", "def_dim", "def_dim_list", "read", "write", "command_opt", 
		"opt_args", "args", "array_pos", "definition", "exp", "b_term", "eq_factor", 
		"dif_opt", "b_factor", "rel_opt", "exp_num", "sum_opt", "mod_term", "mul_opt", 
		"signed_factor", "s_term", "not_factor", "factor", "opt_complement", "tipo", 
		"token_y", "token_o", "token_neg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&'", "'y'", "'|'", "'o'", "'~'", "'no'", null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'<-'", "'='", 
		"'<>'", "'>'", "'>='", "'<'", "'<='", "'('", "')'", "'['", "']'", "','", 
		"';'", "'*'", "'/'", "'+'", "'-'", "'^'", "'%'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "SUBPROCESO", "FINSUBPROCESO", 
		"FINFUNCION", "PROCESO", "ALGORITMO", "FINPROCESO", "FINALGORITMO", "SI", 
		"ENTONCES", "FINSI", "SINO", "PARA", "HASTA", "CON", "PASO", "FINPARA", 
		"HACER", "MIENTRAS", "FINMIENTRAS", "REPETIR", "QUE", "SEGUN", "CASO", 
		"DE", "OTRO", "MODO", "ESPERAR", "TECLA", "SEGUNDOS", "MILISEGUNDOS", 
		"BORRAR", "LIMPIAR", "PANTALLA", "DIMENSION", "LEER", "ESCRIBIR", "DEFINIR", 
		"COMO", "FINSEGUN", "VERDADERO", "FALSO", "ENTERO", "REAL", "NUMERO", 
		"NUMERICO", "TEXTO", "CADENA", "CARACTER", "LOGICO", "ID", "TOKEN_ASIG", 
		"TOKEN_IGUAL", "TOKEN_DIF", "TOKEN_MAYOR", "TOKEN_MAYOR_IGUAL", "TOKEN_MENOR", 
		"TOKEN_MENOR_IGUAL", "TOKEN_PAR_IZR", "TOKEN_PAR_DER", "TOKEN_COR_IZR", 
		"TOKEN_COR_DER", "TOKEN_COMA", "TOKEN_PYC", "TOKEN_MUL", "TOKEN_DIV", 
		"TOKEN_MAS", "TOKEN_MENOS", "TOKEN_POT", "TOKEN_MOD", "TOKEN_DOSP", "TOKEN_CADENA", 
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
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
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
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			sp();
			setState(97);
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
		public TerminalNode SUBPROCESO() { return getToken(PSGrammarParser.SUBPROCESO, 0); }
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
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
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
	}

	public final SpContext sp() throws RecognitionException {
		SpContext _localctx = new SpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sp);
		int _la;
		try {
			setState(124);
			switch (_input.LA(1)) {
			case SUBPROCESO:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(SUBPROCESO);
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(100);
					match(ID);
					setState(101);
					match(TOKEN_ASIG);
					}
					break;
				}
				setState(104);
				match(ID);
				setState(117);
				_la = _input.LA(1);
				if (_la==TOKEN_PAR_IZR) {
					{
					setState(105);
					match(TOKEN_PAR_IZR);
					setState(114);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(106);
						match(ID);
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==TOKEN_COMA) {
							{
							{
							setState(107);
							match(TOKEN_COMA);
							setState(108);
							match(ID);
							}
							}
							setState(113);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(116);
					match(TOKEN_PAR_DER);
					}
				}

				setState(119);
				command();
				setState(120);
				end_sp();
				setState(121);
				sp();
				}
				break;
			case PROCESO:
			case ALGORITMO:
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
	}

	public final End_spContext end_sp() throws RecognitionException {
		End_spContext _localctx = new End_spContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_end_sp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			main_begin();
			setState(129);
			match(ID);
			setState(130);
			command();
			setState(131);
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
	}

	public final Main_beginContext main_begin() throws RecognitionException {
		Main_beginContext _localctx = new Main_beginContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
	}

	public final Main_endContext main_end() throws RecognitionException {
		Main_endContext _localctx = new Main_endContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(PSGrammarParser.TOKEN_PYC, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode ID() { return getToken(PSGrammarParser.ID, 0); }
		public Command_optContext command_opt() {
			return getRuleContext(Command_optContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public If_sentenceContext if_sentence() {
			return getRuleContext(If_sentenceContext.class,0);
		}
		public For_sentenceContext for_sentence() {
			return getRuleContext(For_sentenceContext.class,0);
		}
		public While_sentenceContext while_sentence() {
			return getRuleContext(While_sentenceContext.class,0);
		}
		public Dowhile_sentenceContext dowhile_sentence() {
			return getRuleContext(Dowhile_sentenceContext.class,0);
		}
		public Switch_sentenceContext switch_sentence() {
			return getRuleContext(Switch_sentenceContext.class,0);
		}
		public Wait_sentenceContext wait_sentence() {
			return getRuleContext(Wait_sentenceContext.class,0);
		}
		public ClearContext clear() {
			return getRuleContext(ClearContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command);
		int _la;
		try {
			setState(183);
			switch (_input.LA(1)) {
			case DEFINIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				definition();
				setState(138);
				match(TOKEN_PYC);
				setState(139);
				command();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ID);
				setState(143);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (TOKEN_ASIG - 57)) | (1L << (TOKEN_PAR_IZR - 57)) | (1L << (TOKEN_COR_IZR - 57)))) != 0)) {
					{
					setState(142);
					command_opt();
					}
				}

				setState(145);
				match(TOKEN_PYC);
				setState(146);
				command();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				read();
				setState(148);
				match(TOKEN_PYC);
				setState(149);
				command();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				write();
				setState(152);
				match(TOKEN_PYC);
				setState(153);
				command();
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				dim();
				setState(156);
				match(TOKEN_PYC);
				setState(157);
				command();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				if_sentence();
				setState(160);
				command();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				for_sentence();
				setState(163);
				command();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				while_sentence();
				setState(166);
				command();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				dowhile_sentence();
				setState(169);
				command();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 10);
				{
				setState(171);
				switch_sentence();
				setState(172);
				command();
				}
				break;
			case ESPERAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(174);
				wait_sentence();
				setState(175);
				match(TOKEN_PYC);
				setState(176);
				command();
				}
				break;
			case BORRAR:
			case LIMPIAR:
				enterOuterAlt(_localctx, 12);
				{
				setState(178);
				clear();
				setState(179);
				match(TOKEN_PYC);
				setState(180);
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
	}

	public final If_sentenceContext if_sentence() throws RecognitionException {
		If_sentenceContext _localctx = new If_sentenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(SI);
			setState(186);
			exp(0);
			setState(187);
			match(ENTONCES);
			setState(188);
			command();
			setState(189);
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
	}

	public final End_ifContext end_if() throws RecognitionException {
		End_ifContext _localctx = new End_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_end_if);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case FINSI:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(FINSI);
				}
				break;
			case SINO:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(SINO);
				setState(193);
				command();
				setState(194);
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
	}

	public final For_sentenceContext for_sentence() throws RecognitionException {
		For_sentenceContext _localctx = new For_sentenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(PARA);
			setState(199);
			match(ID);
			setState(200);
			match(TOKEN_ASIG);
			setState(201);
			exp(0);
			setState(202);
			match(HASTA);
			setState(203);
			exp_num(0);
			setState(207);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(204);
				match(CON);
				setState(205);
				match(PASO);
				setState(206);
				exp_num(0);
				}
			}

			setState(209);
			match(HACER);
			setState(210);
			command();
			setState(211);
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
	}

	public final While_sentenceContext while_sentence() throws RecognitionException {
		While_sentenceContext _localctx = new While_sentenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(MIENTRAS);
			setState(214);
			exp(0);
			setState(215);
			match(HACER);
			setState(216);
			command();
			setState(217);
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
	}

	public final Dowhile_sentenceContext dowhile_sentence() throws RecognitionException {
		Dowhile_sentenceContext _localctx = new Dowhile_sentenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dowhile_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(REPETIR);
			setState(220);
			command();
			setState(221);
			match(HASTA);
			setState(222);
			match(QUE);
			setState(223);
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
	}

	public final Switch_sentenceContext switch_sentence() throws RecognitionException {
		Switch_sentenceContext _localctx = new Switch_sentenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switch_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(SEGUN);
			setState(226);
			exp_num(0);
			setState(227);
			match(HACER);
			setState(228);
			case_sentence();
			setState(229);
			default_case();
			setState(230);
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
	}

	public final Case_sentenceContext case_sentence() throws RecognitionException {
		Case_sentenceContext _localctx = new Case_sentenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_case_sentence);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(CASO);
				setState(233);
				exp_num(0);
				setState(234);
				match(TOKEN_DOSP);
				setState(235);
				command();
				setState(236);
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
	}

	public final Default_caseContext default_case() throws RecognitionException {
		Default_caseContext _localctx = new Default_caseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_default_case);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case DE:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(DE);
				setState(242);
				match(OTRO);
				setState(243);
				match(MODO);
				setState(244);
				match(TOKEN_DOSP);
				setState(245);
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
	}

	public final Wait_sentenceContext wait_sentence() throws RecognitionException {
		Wait_sentenceContext _localctx = new Wait_sentenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_wait_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ESPERAR);
			setState(250);
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
	}

	public final Wait_typeContext wait_type() throws RecognitionException {
		Wait_typeContext _localctx = new Wait_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_wait_type);
		try {
			setState(256);
			switch (_input.LA(1)) {
			case TECLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(TECLA);
				}
				break;
			case T__4:
			case T__5:
			case VERDADERO:
			case FALSO:
			case ID:
			case TOKEN_PAR_IZR:
			case TOKEN_MAS:
			case TOKEN_MENOS:
			case TOKEN_CADENA:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				exp_num(0);
				setState(254);
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
	}

	public final UnityContext unity() throws RecognitionException {
		UnityContext _localctx = new UnityContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
	}

	public final ClearContext clear() throws RecognitionException {
		ClearContext _localctx = new ClearContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_clear);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case BORRAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(BORRAR);
				setState(261);
				match(PANTALLA);
				}
				break;
			case LIMPIAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(LIMPIAR);
				setState(263);
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
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(DIMENSION);
			setState(267);
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
		public Array_posContext array_pos() {
			return getRuleContext(Array_posContext.class,0);
		}
		public Def_dim_listContext def_dim_list() {
			return getRuleContext(Def_dim_listContext.class,0);
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
	}

	public final Def_dimContext def_dim() throws RecognitionException {
		Def_dimContext _localctx = new Def_dimContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_def_dim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(ID);
			setState(270);
			array_pos();
			setState(271);
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
	}

	public final Def_dim_listContext def_dim_list() throws RecognitionException {
		Def_dim_listContext _localctx = new Def_dim_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_def_dim_list);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(TOKEN_COMA);
				setState(274);
				def_dim();
				setState(275);
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
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(LEER);
			setState(281);
			match(ID);
			setState(282);
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
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ESCRIBIR);
			setState(285);
			exp(0);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(286);
				match(TOKEN_COMA);
				setState(287);
				exp(0);
				}
				}
				setState(292);
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
	}
	public static class AllocContext extends Command_optContext {
		public TerminalNode TOKEN_ASIG() { return getToken(PSGrammarParser.TOKEN_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Array_posContext array_pos() {
			return getRuleContext(Array_posContext.class,0);
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
	}

	public final Command_optContext command_opt() throws RecognitionException {
		Command_optContext _localctx = new Command_optContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_command_opt);
		int _la;
		try {
			setState(299);
			switch (_input.LA(1)) {
			case TOKEN_ASIG:
			case TOKEN_COR_IZR:
				_localctx = new AllocContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				_la = _input.LA(1);
				if (_la==TOKEN_COR_IZR) {
					{
					setState(293);
					array_pos();
					}
				}

				setState(296);
				match(TOKEN_ASIG);
				setState(297);
				exp(0);
				}
				break;
			case TOKEN_PAR_IZR:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
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
	}

	public final Opt_argsContext opt_args() throws RecognitionException {
		Opt_argsContext _localctx = new Opt_argsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opt_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(TOKEN_PAR_IZR);
			setState(302);
			args();
			setState(303);
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
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_args);
		int _la;
		try {
			setState(314);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case VERDADERO:
			case FALSO:
			case ID:
			case TOKEN_PAR_IZR:
			case TOKEN_MAS:
			case TOKEN_MENOS:
			case TOKEN_CADENA:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				exp(0);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(306);
					match(TOKEN_COMA);
					setState(307);
					exp(0);
					}
					}
					setState(312);
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
	}

	public final Array_posContext array_pos() throws RecognitionException {
		Array_posContext _localctx = new Array_posContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_pos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(TOKEN_COR_IZR);
			setState(317);
			exp_num(0);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(318);
				match(TOKEN_COMA);
				setState(319);
				exp_num(0);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
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
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(DEFINIR);
			setState(328);
			match(ID);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(329);
				match(TOKEN_COMA);
				setState(330);
				match(ID);
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(COMO);
			setState(337);
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
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Token_oContext token_o() {
			return getRuleContext(Token_oContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitExp(this);
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
			setState(340);
			b_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(342);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(343);
					token_o();
					setState(344);
					b_term(0);
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public Eq_factorContext eq_factor() {
			return getRuleContext(Eq_factorContext.class,0);
		}
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Token_yContext token_y() {
			return getRuleContext(Token_yContext.class,0);
		}
		public B_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterB_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitB_term(this);
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
			setState(352);
			eq_factor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new B_termContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_b_term);
					setState(354);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(355);
					token_y();
					setState(356);
					eq_factor(0);
					}
					} 
				}
				setState(362);
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

	public static class Eq_factorContext extends ParserRuleContext {
		public B_factorContext b_factor() {
			return getRuleContext(B_factorContext.class,0);
		}
		public Eq_factorContext eq_factor() {
			return getRuleContext(Eq_factorContext.class,0);
		}
		public Dif_optContext dif_opt() {
			return getRuleContext(Dif_optContext.class,0);
		}
		public Eq_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterEq_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitEq_factor(this);
		}
	}

	public final Eq_factorContext eq_factor() throws RecognitionException {
		return eq_factor(0);
	}

	private Eq_factorContext eq_factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Eq_factorContext _localctx = new Eq_factorContext(_ctx, _parentState);
		Eq_factorContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_eq_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(364);
			b_factor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Eq_factorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eq_factor);
					setState(366);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(367);
					dif_opt();
					setState(368);
					b_factor(0);
					}
					} 
				}
				setState(374);
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
	}

	public final Dif_optContext dif_opt() throws RecognitionException {
		Dif_optContext _localctx = new Dif_optContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dif_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		public Exp_numContext exp_num() {
			return getRuleContext(Exp_numContext.class,0);
		}
		public B_factorContext b_factor() {
			return getRuleContext(B_factorContext.class,0);
		}
		public Rel_optContext rel_opt() {
			return getRuleContext(Rel_optContext.class,0);
		}
		public B_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterB_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitB_factor(this);
		}
	}

	public final B_factorContext b_factor() throws RecognitionException {
		return b_factor(0);
	}

	private B_factorContext b_factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		B_factorContext _localctx = new B_factorContext(_ctx, _parentState);
		B_factorContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_b_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(378);
			exp_num(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new B_factorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_b_factor);
					setState(380);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(381);
					rel_opt();
					setState(382);
					exp_num(0);
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	}

	public final Rel_optContext rel_opt() throws RecognitionException {
		Rel_optContext _localctx = new Rel_optContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_rel_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_MAYOR) | (1L << TOKEN_MAYOR_IGUAL) | (1L << TOKEN_MENOR) | (1L << TOKEN_MENOR_IGUAL))) != 0)) ) {
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
		public Mod_termContext mod_term() {
			return getRuleContext(Mod_termContext.class,0);
		}
		public Exp_numContext exp_num() {
			return getRuleContext(Exp_numContext.class,0);
		}
		public Sum_optContext sum_opt() {
			return getRuleContext(Sum_optContext.class,0);
		}
		public Exp_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterExp_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitExp_num(this);
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
			setState(392);
			mod_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp_numContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp_num);
					setState(394);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(395);
					sum_opt();
					setState(396);
					mod_term(0);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	}

	public final Sum_optContext sum_opt() throws RecognitionException {
		Sum_optContext _localctx = new Sum_optContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sum_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		public Signed_factorContext signed_factor() {
			return getRuleContext(Signed_factorContext.class,0);
		}
		public Mod_termContext mod_term() {
			return getRuleContext(Mod_termContext.class,0);
		}
		public Mul_optContext mul_opt() {
			return getRuleContext(Mul_optContext.class,0);
		}
		public Mod_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterMod_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitMod_term(this);
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
			setState(406);
			signed_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Mod_termContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mod_term);
					setState(408);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(409);
					mul_opt();
					setState(410);
					signed_factor();
					}
					} 
				}
				setState(416);
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

	public static class Mul_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_MUL() { return getToken(PSGrammarParser.TOKEN_MUL, 0); }
		public TerminalNode TOKEN_DIV() { return getToken(PSGrammarParser.TOKEN_DIV, 0); }
		public TerminalNode TOKEN_MOD() { return getToken(PSGrammarParser.TOKEN_MOD, 0); }
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
	}

	public final Mul_optContext mul_opt() throws RecognitionException {
		Mul_optContext _localctx = new Mul_optContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mul_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (TOKEN_MUL - 70)) | (1L << (TOKEN_DIV - 70)) | (1L << (TOKEN_MOD - 70)))) != 0)) ) {
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

	public static class Signed_factorContext extends ParserRuleContext {
		public Sum_optContext sum_opt() {
			return getRuleContext(Sum_optContext.class,0);
		}
		public Signed_factorContext signed_factor() {
			return getRuleContext(Signed_factorContext.class,0);
		}
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public Signed_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterSigned_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitSigned_factor(this);
		}
	}

	public final Signed_factorContext signed_factor() throws RecognitionException {
		Signed_factorContext _localctx = new Signed_factorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_signed_factor);
		try {
			setState(423);
			switch (_input.LA(1)) {
			case TOKEN_MAS:
			case TOKEN_MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				sum_opt();
				setState(420);
				signed_factor();
				}
				break;
			case T__4:
			case T__5:
			case VERDADERO:
			case FALSO:
			case ID:
			case TOKEN_PAR_IZR:
			case TOKEN_CADENA:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				s_term(0);
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
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public TerminalNode TOKEN_POT() { return getToken(PSGrammarParser.TOKEN_POT, 0); }
		public S_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterS_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitS_term(this);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_s_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(426);
			not_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new S_termContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_s_term);
					setState(428);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(429);
					match(TOKEN_POT);
					setState(430);
					not_factor();
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public Token_negContext token_neg() {
			return getRuleContext(Token_negContext.class,0);
		}
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Not_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterNot_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitNot_factor(this);
		}
	}

	public final Not_factorContext not_factor() throws RecognitionException {
		Not_factorContext _localctx = new Not_factorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_not_factor);
		try {
			setState(440);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				token_neg();
				setState(437);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
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
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_factor);
		try {
			setState(455);
			switch (_input.LA(1)) {
			case TOKEN_CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(TOKEN_CADENA);
				}
				break;
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(TOKEN_REAL);
				}
				break;
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				match(TOKEN_ENTERO);
				}
				break;
			case VERDADERO:
				enterOuterAlt(_localctx, 4);
				{
				setState(445);
				match(VERDADERO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 5);
				{
				setState(446);
				match(FALSO);
				}
				break;
			case TOKEN_PAR_IZR:
				enterOuterAlt(_localctx, 6);
				{
				setState(447);
				match(TOKEN_PAR_IZR);
				setState(448);
				exp(0);
				setState(449);
				match(TOKEN_PAR_DER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(451);
				match(ID);
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(452);
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
		public Opt_argsContext opt_args() {
			return getRuleContext(Opt_argsContext.class,0);
		}
		public Array_posContext array_pos() {
			return getRuleContext(Array_posContext.class,0);
		}
		public Opt_complementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_complement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterOpt_complement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitOpt_complement(this);
		}
	}

	public final Opt_complementContext opt_complement() throws RecognitionException {
		Opt_complementContext _localctx = new Opt_complementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_opt_complement);
		try {
			setState(459);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZR:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				opt_args();
				}
				break;
			case TOKEN_COR_IZR:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				array_pos();
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
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
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
	}

	public final Token_yContext token_y() throws RecognitionException {
		Token_yContext _localctx = new Token_yContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_token_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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
	}

	public final Token_oContext token_o() throws RecognitionException {
		Token_oContext _localctx = new Token_oContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_token_o);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
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
	}

	public final Token_negContext token_neg() throws RecognitionException {
		Token_negContext _localctx = new Token_negContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_token_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 30:
			return b_term_sempred((B_termContext)_localctx, predIndex);
		case 31:
			return eq_factor_sempred((Eq_factorContext)_localctx, predIndex);
		case 33:
			return b_factor_sempred((B_factorContext)_localctx, predIndex);
		case 35:
			return exp_num_sempred((Exp_numContext)_localctx, predIndex);
		case 37:
			return mod_term_sempred((Mod_termContext)_localctx, predIndex);
		case 40:
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
	private boolean eq_factor_sempred(Eq_factorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean b_factor_sempred(B_factorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_num_sempred(Exp_numContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mod_term_sempred(Mod_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean s_term_sempred(S_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u01d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\3\3\3\3\5\3"+
		"i\n\3\3\3\3\3\3\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\5\3u\n\3\3\3\5\3x\n"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\177\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0092\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ba\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c7\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d2\n\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f2\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00fa\n\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\5\22\u0103\n\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u010b\n\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u0119"+
		"\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0123\n\31\f\31\16"+
		"\31\u0126\13\31\3\32\5\32\u0129\n\32\3\32\3\32\3\32\5\32\u012e\n\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u0137\n\34\f\34\16\34\u013a\13"+
		"\34\3\34\5\34\u013d\n\34\3\35\3\35\3\35\3\35\7\35\u0143\n\35\f\35\16\35"+
		"\u0146\13\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u014e\n\36\f\36\16\36"+
		"\u0151\13\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u015d"+
		"\n\37\f\37\16\37\u0160\13\37\3 \3 \3 \3 \3 \3 \3 \7 \u0169\n \f \16 \u016c"+
		"\13 \3!\3!\3!\3!\3!\3!\3!\7!\u0175\n!\f!\16!\u0178\13!\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\7#\u0183\n#\f#\16#\u0186\13#\3$\3$\3%\3%\3%\3%\3%\3%\3%"+
		"\7%\u0191\n%\f%\16%\u0194\13%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u019f"+
		"\n\'\f\'\16\'\u01a2\13\'\3(\3(\3)\3)\3)\3)\5)\u01aa\n)\3*\3*\3*\3*\3*"+
		"\3*\7*\u01b2\n*\f*\16*\u01b5\13*\3+\3+\3+\3+\5+\u01bb\n+\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\5,\u01c8\n,\5,\u01ca\n,\3-\3-\5-\u01ce\n-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\61\2\t<>@DHLR\62\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\16\3\2\n\13"+
		"\3\2\f\r\3\2\16\17\3\2%&\3\2<=\3\2>A\3\2JK\4\2HIMM\3\2\629\3\2\3\4\3\2"+
		"\5\6\3\2\7\b\u01d8\2b\3\2\2\2\4~\3\2\2\2\6\u0080\3\2\2\2\b\u0082\3\2\2"+
		"\2\n\u0087\3\2\2\2\f\u0089\3\2\2\2\16\u00b9\3\2\2\2\20\u00bb\3\2\2\2\22"+
		"\u00c6\3\2\2\2\24\u00c8\3\2\2\2\26\u00d7\3\2\2\2\30\u00dd\3\2\2\2\32\u00e3"+
		"\3\2\2\2\34\u00f1\3\2\2\2\36\u00f9\3\2\2\2 \u00fb\3\2\2\2\"\u0102\3\2"+
		"\2\2$\u0104\3\2\2\2&\u010a\3\2\2\2(\u010c\3\2\2\2*\u010f\3\2\2\2,\u0118"+
		"\3\2\2\2.\u011a\3\2\2\2\60\u011e\3\2\2\2\62\u012d\3\2\2\2\64\u012f\3\2"+
		"\2\2\66\u013c\3\2\2\28\u013e\3\2\2\2:\u0149\3\2\2\2<\u0155\3\2\2\2>\u0161"+
		"\3\2\2\2@\u016d\3\2\2\2B\u0179\3\2\2\2D\u017b\3\2\2\2F\u0187\3\2\2\2H"+
		"\u0189\3\2\2\2J\u0195\3\2\2\2L\u0197\3\2\2\2N\u01a3\3\2\2\2P\u01a9\3\2"+
		"\2\2R\u01ab\3\2\2\2T\u01ba\3\2\2\2V\u01c9\3\2\2\2X\u01cd\3\2\2\2Z\u01cf"+
		"\3\2\2\2\\\u01d1\3\2\2\2^\u01d3\3\2\2\2`\u01d5\3\2\2\2bc\5\4\3\2cd\5\b"+
		"\5\2d\3\3\2\2\2eh\7\t\2\2fg\7:\2\2gi\7;\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2"+
		"\2\2jw\7:\2\2kt\7B\2\2lq\7:\2\2mn\7F\2\2np\7:\2\2om\3\2\2\2ps\3\2\2\2"+
		"qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tl\3\2\2\2tu\3\2\2\2uv\3\2\2\2"+
		"vx\7C\2\2wk\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\5\16\b\2z{\5\6\4\2{|\5\4\3\2"+
		"|\177\3\2\2\2}\177\3\2\2\2~e\3\2\2\2~}\3\2\2\2\177\5\3\2\2\2\u0080\u0081"+
		"\t\2\2\2\u0081\7\3\2\2\2\u0082\u0083\5\n\6\2\u0083\u0084\7:\2\2\u0084"+
		"\u0085\5\16\b\2\u0085\u0086\5\f\7\2\u0086\t\3\2\2\2\u0087\u0088\t\3\2"+
		"\2\u0088\13\3\2\2\2\u0089\u008a\t\4\2\2\u008a\r\3\2\2\2\u008b\u008c\5"+
		":\36\2\u008c\u008d\7G\2\2\u008d\u008e\5\16\b\2\u008e\u00ba\3\2\2\2\u008f"+
		"\u0091\7:\2\2\u0090\u0092\5\62\32\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7G\2\2\u0094\u00ba\5\16\b\2\u0095"+
		"\u0096\5.\30\2\u0096\u0097\7G\2\2\u0097\u0098\5\16\b\2\u0098\u00ba\3\2"+
		"\2\2\u0099\u009a\5\60\31\2\u009a\u009b\7G\2\2\u009b\u009c\5\16\b\2\u009c"+
		"\u00ba\3\2\2\2\u009d\u009e\5(\25\2\u009e\u009f\7G\2\2\u009f\u00a0\5\16"+
		"\b\2\u00a0\u00ba\3\2\2\2\u00a1\u00a2\5\20\t\2\u00a2\u00a3\5\16\b\2\u00a3"+
		"\u00ba\3\2\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\5\16\b\2\u00a6\u00ba"+
		"\3\2\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\5\16\b\2\u00a9\u00ba\3\2\2\2"+
		"\u00aa\u00ab\5\30\r\2\u00ab\u00ac\5\16\b\2\u00ac\u00ba\3\2\2\2\u00ad\u00ae"+
		"\5\32\16\2\u00ae\u00af\5\16\b\2\u00af\u00ba\3\2\2\2\u00b0\u00b1\5 \21"+
		"\2\u00b1\u00b2\7G\2\2\u00b2\u00b3\5\16\b\2\u00b3\u00ba\3\2\2\2\u00b4\u00b5"+
		"\5&\24\2\u00b5\u00b6\7G\2\2\u00b6\u00b7\5\16\b\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u008b\3\2\2\2\u00b9\u008f\3\2\2\2\u00b9\u0095\3\2"+
		"\2\2\u00b9\u0099\3\2\2\2\u00b9\u009d\3\2\2\2\u00b9\u00a1\3\2\2\2\u00b9"+
		"\u00a4\3\2\2\2\u00b9\u00a7\3\2\2\2\u00b9\u00aa\3\2\2\2\u00b9\u00ad\3\2"+
		"\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\17\3\2\2\2\u00bb\u00bc\7\20\2\2\u00bc\u00bd\5<\37\2\u00bd\u00be\7\21"+
		"\2\2\u00be\u00bf\5\16\b\2\u00bf\u00c0\5\22\n\2\u00c0\21\3\2\2\2\u00c1"+
		"\u00c7\7\22\2\2\u00c2\u00c3\7\23\2\2\u00c3\u00c4\5\16\b\2\u00c4\u00c5"+
		"\7\22\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c2\3\2\2\2"+
		"\u00c7\23\3\2\2\2\u00c8\u00c9\7\24\2\2\u00c9\u00ca\7:\2\2\u00ca\u00cb"+
		"\7;\2\2\u00cb\u00cc\5<\37\2\u00cc\u00cd\7\25\2\2\u00cd\u00d1\5H%\2\u00ce"+
		"\u00cf\7\26\2\2\u00cf\u00d0\7\27\2\2\u00d0\u00d2\5H%\2\u00d1\u00ce\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\31\2\2\u00d4"+
		"\u00d5\5\16\b\2\u00d5\u00d6\7\30\2\2\u00d6\25\3\2\2\2\u00d7\u00d8\7\32"+
		"\2\2\u00d8\u00d9\5<\37\2\u00d9\u00da\7\31\2\2\u00da\u00db\5\16\b\2\u00db"+
		"\u00dc\7\33\2\2\u00dc\27\3\2\2\2\u00dd\u00de\7\34\2\2\u00de\u00df\5\16"+
		"\b\2\u00df\u00e0\7\25\2\2\u00e0\u00e1\7\35\2\2\u00e1\u00e2\5<\37\2\u00e2"+
		"\31\3\2\2\2\u00e3\u00e4\7\36\2\2\u00e4\u00e5\5H%\2\u00e5\u00e6\7\31\2"+
		"\2\u00e6\u00e7\5\34\17\2\u00e7\u00e8\5\36\20\2\u00e8\u00e9\7/\2\2\u00e9"+
		"\33\3\2\2\2\u00ea\u00eb\7\37\2\2\u00eb\u00ec\5H%\2\u00ec\u00ed\7N\2\2"+
		"\u00ed\u00ee\5\16\b\2\u00ee\u00ef\5\34\17\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\35\3\2\2"+
		"\2\u00f3\u00f4\7 \2\2\u00f4\u00f5\7!\2\2\u00f5\u00f6\7\"\2\2\u00f6\u00f7"+
		"\7N\2\2\u00f7\u00fa\5\16\b\2\u00f8\u00fa\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\37\3\2\2\2\u00fb\u00fc\7#\2\2\u00fc\u00fd\5\"\22"+
		"\2\u00fd!\3\2\2\2\u00fe\u0103\7$\2\2\u00ff\u0100\5H%\2\u0100\u0101\5$"+
		"\23\2\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0103"+
		"#\3\2\2\2\u0104\u0105\t\5\2\2\u0105%\3\2\2\2\u0106\u0107\7\'\2\2\u0107"+
		"\u010b\7)\2\2\u0108\u0109\7(\2\2\u0109\u010b\7)\2\2\u010a\u0106\3\2\2"+
		"\2\u010a\u0108\3\2\2\2\u010b\'\3\2\2\2\u010c\u010d\7*\2\2\u010d\u010e"+
		"\5*\26\2\u010e)\3\2\2\2\u010f\u0110\7:\2\2\u0110\u0111\58\35\2\u0111\u0112"+
		"\5,\27\2\u0112+\3\2\2\2\u0113\u0114\7F\2\2\u0114\u0115\5*\26\2\u0115\u0116"+
		"\5,\27\2\u0116\u0119\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0113\3\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0119-\3\2\2\2\u011a\u011b\7+\2\2\u011b\u011c\7:\2\2\u011c"+
		"\u011d\58\35\2\u011d/\3\2\2\2\u011e\u011f\7,\2\2\u011f\u0124\5<\37\2\u0120"+
		"\u0121\7F\2\2\u0121\u0123\5<\37\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\61\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0127\u0129\58\35\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012b\7;\2\2\u012b\u012e\5<\37\2\u012c\u012e\5\64"+
		"\33\2\u012d\u0128\3\2\2\2\u012d\u012c\3\2\2\2\u012e\63\3\2\2\2\u012f\u0130"+
		"\7B\2\2\u0130\u0131\5\66\34\2\u0131\u0132\7C\2\2\u0132\65\3\2\2\2\u0133"+
		"\u0138\5<\37\2\u0134\u0135\7F\2\2\u0135\u0137\5<\37\2\u0136\u0134\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013d\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u0133\3\2"+
		"\2\2\u013c\u013b\3\2\2\2\u013d\67\3\2\2\2\u013e\u013f\7D\2\2\u013f\u0144"+
		"\5H%\2\u0140\u0141\7F\2\2\u0141\u0143\5H%\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7E\2\2\u01489\3\2\2\2\u0149\u014a"+
		"\7-\2\2\u014a\u014f\7:\2\2\u014b\u014c\7F\2\2\u014c\u014e\7:\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7.\2\2\u0153"+
		"\u0154\5Z.\2\u0154;\3\2\2\2\u0155\u0156\b\37\1\2\u0156\u0157\5> \2\u0157"+
		"\u015e\3\2\2\2\u0158\u0159\f\4\2\2\u0159\u015a\5^\60\2\u015a\u015b\5>"+
		" \2\u015b\u015d\3\2\2\2\u015c\u0158\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f=\3\2\2\2\u0160\u015e\3\2\2\2"+
		"\u0161\u0162\b \1\2\u0162\u0163\5@!\2\u0163\u016a\3\2\2\2\u0164\u0165"+
		"\f\4\2\2\u0165\u0166\5\\/\2\u0166\u0167\5@!\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0164\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b?\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\b!\1\2\u016e\u016f"+
		"\5D#\2\u016f\u0176\3\2\2\2\u0170\u0171\f\4\2\2\u0171\u0172\5B\"\2\u0172"+
		"\u0173\5D#\2\u0173\u0175\3\2\2\2\u0174\u0170\3\2\2\2\u0175\u0178\3\2\2"+
		"\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177A\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0179\u017a\t\6\2\2\u017aC\3\2\2\2\u017b\u017c\b#\1\2\u017c\u017d"+
		"\5H%\2\u017d\u0184\3\2\2\2\u017e\u017f\f\4\2\2\u017f\u0180\5F$\2\u0180"+
		"\u0181\5H%\2\u0181\u0183\3\2\2\2\u0182\u017e\3\2\2\2\u0183\u0186\3\2\2"+
		"\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185E\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0187\u0188\t\7\2\2\u0188G\3\2\2\2\u0189\u018a\b%\1\2\u018a\u018b"+
		"\5L\'\2\u018b\u0192\3\2\2\2\u018c\u018d\f\4\2\2\u018d\u018e\5J&\2\u018e"+
		"\u018f\5L\'\2\u018f\u0191\3\2\2\2\u0190\u018c\3\2\2\2\u0191\u0194\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193I\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0195\u0196\t\b\2\2\u0196K\3\2\2\2\u0197\u0198\b\'\1\2\u0198"+
		"\u0199\5P)\2\u0199\u01a0\3\2\2\2\u019a\u019b\f\4\2\2\u019b\u019c\5N(\2"+
		"\u019c\u019d\5P)\2\u019d\u019f\3\2\2\2\u019e\u019a\3\2\2\2\u019f\u01a2"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1M\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a4\t\t\2\2\u01a4O\3\2\2\2\u01a5\u01a6\5J&\2\u01a6"+
		"\u01a7\5P)\2\u01a7\u01aa\3\2\2\2\u01a8\u01aa\5R*\2\u01a9\u01a5\3\2\2\2"+
		"\u01a9\u01a8\3\2\2\2\u01aaQ\3\2\2\2\u01ab\u01ac\b*\1\2\u01ac\u01ad\5T"+
		"+\2\u01ad\u01b3\3\2\2\2\u01ae\u01af\f\4\2\2\u01af\u01b0\7L\2\2\u01b0\u01b2"+
		"\5T+\2\u01b1\u01ae\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4S\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\5`\61\2"+
		"\u01b7\u01b8\5T+\2\u01b8\u01bb\3\2\2\2\u01b9\u01bb\5V,\2\u01ba\u01b6\3"+
		"\2\2\2\u01ba\u01b9\3\2\2\2\u01bbU\3\2\2\2\u01bc\u01ca\7O\2\2\u01bd\u01ca"+
		"\7P\2\2\u01be\u01ca\7Q\2\2\u01bf\u01ca\7\60\2\2\u01c0\u01ca\7\61\2\2\u01c1"+
		"\u01c2\7B\2\2\u01c2\u01c3\5<\37\2\u01c3\u01c4\7C\2\2\u01c4\u01ca\3\2\2"+
		"\2\u01c5\u01c7\7:\2\2\u01c6\u01c8\5X-\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01bc\3\2\2\2\u01c9\u01bd\3\2\2\2\u01c9"+
		"\u01be\3\2\2\2\u01c9\u01bf\3\2\2\2\u01c9\u01c0\3\2\2\2\u01c9\u01c1\3\2"+
		"\2\2\u01c9\u01c5\3\2\2\2\u01caW\3\2\2\2\u01cb\u01ce\5\64\33\2\u01cc\u01ce"+
		"\58\35\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ceY\3\2\2\2\u01cf"+
		"\u01d0\t\n\2\2\u01d0[\3\2\2\2\u01d1\u01d2\t\13\2\2\u01d2]\3\2\2\2\u01d3"+
		"\u01d4\t\f\2\2\u01d4_\3\2\2\2\u01d5\u01d6\t\r\2\2\u01d6a\3\2\2\2#hqtw"+
		"~\u0091\u00b9\u00c6\u00d1\u00f1\u00f9\u0102\u010a\u0118\u0124\u0128\u012d"+
		"\u0138\u013c\u0144\u014f\u015e\u016a\u0176\u0184\u0192\u01a0\u01a9\u01b3"+
		"\u01ba\u01c7\u01c9\u01cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}