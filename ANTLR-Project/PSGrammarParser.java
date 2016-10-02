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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, MAIN_BEGIN=6, MAIN_END=7, TIPO=8, 
		ID=9, TOKEN_ASIG=10, TOKEN_IGUAL=11, TOKEN_DIF=12, TOKEN_MAYOR=13, TOKEN_MAYOR_IGUAL=14, 
		TOKEN_MENOR=15, TOKEN_MENOR_IGUAL=16, TOKEN_PAR_IZR=17, TOKEN_PAR_DER=18, 
		TOKEN_COR_IZR=19, TOKEN_COR_DER=20, TOKEN_COMA=21, TOKEN_PYC=22, TOKEN_MUL=23, 
		TOKEN_DIV=24, TOKEN_MAS=25, TOKEN_MENOS=26, TOKEN_POT=27, TOKEN_MOD=28, 
		TOKEN_Y=29, TOKEN_O=30, TOKEN_DOSP=31, TOKEN_NEG=32, TOKEN_CADENA=33, 
		TOKEN_REAL=34, TOKEN_ENTERO=35, VERDADERO=36, FALSO=37, WS=38;
	public static final int
		RULE_init = 0, RULE_sp = 1, RULE_end_sp = 2, RULE_p = 3, RULE_command = 4, 
		RULE_command_opt = 5, RULE_opt_args = 6, RULE_args = 7, RULE_array_pos = 8, 
		RULE_definition = 9, RULE_exp = 10, RULE_b_term = 11, RULE_not_factor = 12, 
		RULE_b_factor = 13, RULE_rel_opt = 14, RULE_exp_num = 15, RULE_term = 16, 
		RULE_sum_opt = 17, RULE_mod_term = 18, RULE_mul_opt = 19, RULE_signed_factor = 20, 
		RULE_s_term = 21, RULE_factor = 22, RULE_opt_complement = 23;
	public static final String[] ruleNames = {
		"init", "sp", "end_sp", "p", "command", "command_opt", "opt_args", "args", 
		"array_pos", "definition", "exp", "b_term", "not_factor", "b_factor", 
		"rel_opt", "exp_num", "term", "sum_opt", "mod_term", "mul_opt", "signed_factor", 
		"s_term", "factor", "opt_complement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'subproceso'", "'finsubproceso'", "'finfuncion'", "'definir'", 
		"'como'", null, null, null, null, "'<-'", "'='", "'<>'", "'>'", "'>='", 
		"'<'", "'<='", "'('", "')'", "'['", "']'", "','", "';'", "'*'", "'/'", 
		"'+'", "'-'", "'^'", "'%'", null, null, "':'", null, null, null, null, 
		"'verdadero'", "'falso'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "MAIN_BEGIN", "MAIN_END", "TIPO", 
		"ID", "TOKEN_ASIG", "TOKEN_IGUAL", "TOKEN_DIF", "TOKEN_MAYOR", "TOKEN_MAYOR_IGUAL", 
		"TOKEN_MENOR", "TOKEN_MENOR_IGUAL", "TOKEN_PAR_IZR", "TOKEN_PAR_DER", 
		"TOKEN_COR_IZR", "TOKEN_COR_DER", "TOKEN_COMA", "TOKEN_PYC", "TOKEN_MUL", 
		"TOKEN_DIV", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_POT", "TOKEN_MOD", "TOKEN_Y", 
		"TOKEN_O", "TOKEN_DOSP", "TOKEN_NEG", "TOKEN_CADENA", "TOKEN_REAL", "TOKEN_ENTERO", 
		"VERDADERO", "FALSO", "WS"
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
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(48);
				sp();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(57);
				match(ID);
				setState(58);
				match(TOKEN_ASIG);
				}
				break;
			}
			setState(61);
			match(ID);
			setState(74);
			_la = _input.LA(1);
			if (_la==TOKEN_PAR_IZR) {
				{
				setState(62);
				match(TOKEN_PAR_IZR);
				setState(71);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(63);
					match(ID);
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TOKEN_COMA) {
						{
						{
						setState(64);
						match(TOKEN_COMA);
						setState(65);
						match(ID);
						}
						}
						setState(70);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(73);
				match(TOKEN_PAR_DER);
				}
			}

			setState(76);
			command();
			setState(77);
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
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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
		public TerminalNode MAIN_BEGIN() { return getToken(PSGrammarParser.MAIN_BEGIN, 0); }
		public TerminalNode ID() { return getToken(PSGrammarParser.ID, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode MAIN_END() { return getToken(PSGrammarParser.MAIN_END, 0); }
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
			setState(81);
			match(MAIN_BEGIN);
			setState(82);
			match(ID);
			setState(83);
			command();
			setState(84);
			match(MAIN_END);
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
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode ID() { return getToken(PSGrammarParser.ID, 0); }
		public Command_optContext command_opt() {
			return getRuleContext(Command_optContext.class,0);
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
		enterRule(_localctx, 8, RULE_command);
		int _la;
		try {
			int _alt;
			setState(105);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				definition();
				setState(87);
				match(TOKEN_PYC);
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88);
						command();
						}
						} 
					}
					setState(93);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(ID);
				setState(96);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_ASIG) | (1L << TOKEN_PAR_IZR) | (1L << TOKEN_COR_IZR))) != 0)) {
					{
					setState(95);
					command_opt();
					}
				}

				setState(98);
				match(TOKEN_PYC);
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(99);
						command();
						}
						} 
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Command_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_ASIG() { return getToken(PSGrammarParser.TOKEN_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Array_posContext array_pos() {
			return getRuleContext(Array_posContext.class,0);
		}
		public Opt_argsContext opt_args() {
			return getRuleContext(Opt_argsContext.class,0);
		}
		public Command_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterCommand_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitCommand_opt(this);
		}
	}

	public final Command_optContext command_opt() throws RecognitionException {
		Command_optContext _localctx = new Command_optContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command_opt);
		int _la;
		try {
			setState(113);
			switch (_input.LA(1)) {
			case TOKEN_ASIG:
			case TOKEN_COR_IZR:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				_la = _input.LA(1);
				if (_la==TOKEN_COR_IZR) {
					{
					setState(107);
					array_pos();
					}
				}

				setState(110);
				match(TOKEN_ASIG);
				setState(111);
				exp();
				}
				break;
			case TOKEN_PAR_IZR:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
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
		public TerminalNode TOKEN_PAR_DER() { return getToken(PSGrammarParser.TOKEN_PAR_DER, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_opt_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(TOKEN_PAR_IZR);
			setState(117);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << TOKEN_PAR_IZR) | (1L << TOKEN_MAS) | (1L << TOKEN_MENOS) | (1L << TOKEN_NEG) | (1L << TOKEN_CADENA) | (1L << TOKEN_REAL) | (1L << TOKEN_ENTERO) | (1L << VERDADERO) | (1L << FALSO))) != 0)) {
				{
				setState(116);
				args();
				}
			}

			setState(119);
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
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			exp();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(122);
				match(TOKEN_COMA);
				setState(123);
				exp();
				}
				}
				setState(128);
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
		enterRule(_localctx, 16, RULE_array_pos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(TOKEN_COR_IZR);
			setState(130);
			exp_num();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(131);
				match(TOKEN_COMA);
				setState(132);
				exp_num();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
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
		public List<TerminalNode> ID() { return getTokens(PSGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PSGrammarParser.ID, i);
		}
		public TerminalNode TIPO() { return getToken(PSGrammarParser.TIPO, 0); }
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
		enterRule(_localctx, 18, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__3);
			setState(141);
			match(ID);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(142);
				match(TOKEN_COMA);
				setState(143);
				match(ID);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(T__4);
			setState(150);
			match(TIPO);
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
		public List<B_termContext> b_term() {
			return getRuleContexts(B_termContext.class);
		}
		public B_termContext b_term(int i) {
			return getRuleContext(B_termContext.class,i);
		}
		public List<TerminalNode> TOKEN_O() { return getTokens(PSGrammarParser.TOKEN_O); }
		public TerminalNode TOKEN_O(int i) {
			return getToken(PSGrammarParser.TOKEN_O, i);
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
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			b_term();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_O) {
				{
				{
				setState(153);
				match(TOKEN_O);
				setState(154);
				b_term();
				}
				}
				setState(159);
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

	public static class B_termContext extends ParserRuleContext {
		public List<Not_factorContext> not_factor() {
			return getRuleContexts(Not_factorContext.class);
		}
		public Not_factorContext not_factor(int i) {
			return getRuleContext(Not_factorContext.class,i);
		}
		public List<TerminalNode> TOKEN_Y() { return getTokens(PSGrammarParser.TOKEN_Y); }
		public TerminalNode TOKEN_Y(int i) {
			return getToken(PSGrammarParser.TOKEN_Y, i);
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
		B_termContext _localctx = new B_termContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_b_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			not_factor();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_Y) {
				{
				{
				setState(161);
				match(TOKEN_Y);
				setState(162);
				not_factor();
				}
				}
				setState(167);
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

	public static class Not_factorContext extends ParserRuleContext {
		public TerminalNode TOKEN_NEG() { return getToken(PSGrammarParser.TOKEN_NEG, 0); }
		public B_factorContext b_factor() {
			return getRuleContext(B_factorContext.class,0);
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
		enterRule(_localctx, 24, RULE_not_factor);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case TOKEN_NEG:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(TOKEN_NEG);
				setState(169);
				b_factor();
				}
				break;
			case ID:
			case TOKEN_PAR_IZR:
			case TOKEN_MAS:
			case TOKEN_MENOS:
			case TOKEN_CADENA:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				b_factor();
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

	public static class B_factorContext extends ParserRuleContext {
		public List<Exp_numContext> exp_num() {
			return getRuleContexts(Exp_numContext.class);
		}
		public Exp_numContext exp_num(int i) {
			return getRuleContext(Exp_numContext.class,i);
		}
		public List<Rel_optContext> rel_opt() {
			return getRuleContexts(Rel_optContext.class);
		}
		public Rel_optContext rel_opt(int i) {
			return getRuleContext(Rel_optContext.class,i);
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
		B_factorContext _localctx = new B_factorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_b_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			exp_num();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_IGUAL) | (1L << TOKEN_DIF) | (1L << TOKEN_MAYOR) | (1L << TOKEN_MAYOR_IGUAL) | (1L << TOKEN_MENOR) | (1L << TOKEN_MENOR_IGUAL))) != 0)) {
				{
				{
				setState(174);
				rel_opt();
				setState(175);
				exp_num();
				}
				}
				setState(181);
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

	public static class Rel_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_IGUAL() { return getToken(PSGrammarParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_DIF() { return getToken(PSGrammarParser.TOKEN_DIF, 0); }
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
		enterRule(_localctx, 28, RULE_rel_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_IGUAL) | (1L << TOKEN_DIF) | (1L << TOKEN_MAYOR) | (1L << TOKEN_MAYOR_IGUAL) | (1L << TOKEN_MENOR) | (1L << TOKEN_MENOR_IGUAL))) != 0)) ) {
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> TOKEN_MOD() { return getTokens(PSGrammarParser.TOKEN_MOD); }
		public TerminalNode TOKEN_MOD(int i) {
			return getToken(PSGrammarParser.TOKEN_MOD, i);
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
		Exp_numContext _localctx = new Exp_numContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			term();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_MOD) {
				{
				{
				setState(185);
				match(TOKEN_MOD);
				setState(186);
				term();
				}
				}
				setState(191);
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

	public static class TermContext extends ParserRuleContext {
		public List<Mod_termContext> mod_term() {
			return getRuleContexts(Mod_termContext.class);
		}
		public Mod_termContext mod_term(int i) {
			return getRuleContext(Mod_termContext.class,i);
		}
		public List<Sum_optContext> sum_opt() {
			return getRuleContexts(Sum_optContext.class);
		}
		public Sum_optContext sum_opt(int i) {
			return getRuleContext(Sum_optContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSGrammarListener ) ((PSGrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			mod_term();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_MAS || _la==TOKEN_MENOS) {
				{
				{
				setState(193);
				sum_opt();
				setState(194);
				mod_term();
				}
				}
				setState(200);
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
		enterRule(_localctx, 34, RULE_sum_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		public List<Signed_factorContext> signed_factor() {
			return getRuleContexts(Signed_factorContext.class);
		}
		public Signed_factorContext signed_factor(int i) {
			return getRuleContext(Signed_factorContext.class,i);
		}
		public List<Mul_optContext> mul_opt() {
			return getRuleContexts(Mul_optContext.class);
		}
		public Mul_optContext mul_opt(int i) {
			return getRuleContext(Mul_optContext.class,i);
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
		Mod_termContext _localctx = new Mod_termContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mod_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			signed_factor();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_MUL || _la==TOKEN_DIV) {
				{
				{
				setState(204);
				mul_opt();
				setState(205);
				signed_factor();
				}
				}
				setState(211);
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

	public static class Mul_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_MUL() { return getToken(PSGrammarParser.TOKEN_MUL, 0); }
		public TerminalNode TOKEN_DIV() { return getToken(PSGrammarParser.TOKEN_DIV, 0); }
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
		enterRule(_localctx, 38, RULE_mul_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_MUL || _la==TOKEN_DIV) ) {
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
		enterRule(_localctx, 40, RULE_signed_factor);
		try {
			setState(218);
			switch (_input.LA(1)) {
			case TOKEN_MAS:
			case TOKEN_MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				sum_opt();
				setState(215);
				s_term();
				}
				break;
			case ID:
			case TOKEN_PAR_IZR:
			case TOKEN_CADENA:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				s_term();
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
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TOKEN_POT() { return getTokens(PSGrammarParser.TOKEN_POT); }
		public TerminalNode TOKEN_POT(int i) {
			return getToken(PSGrammarParser.TOKEN_POT, i);
		}
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
		S_termContext _localctx = new S_termContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_s_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			factor();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_POT) {
				{
				{
				setState(221);
				match(TOKEN_POT);
				setState(222);
				factor();
				}
				}
				setState(227);
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
		enterRule(_localctx, 44, RULE_factor);
		int _la;
		try {
			setState(241);
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
			case VERDADERO:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(VERDADERO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(FALSO);
				}
				break;
			case TOKEN_PAR_IZR:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(TOKEN_PAR_IZR);
				setState(234);
				exp();
				setState(235);
				match(TOKEN_PAR_DER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				match(ID);
				setState(239);
				_la = _input.LA(1);
				if (_la==TOKEN_PAR_IZR || _la==TOKEN_COR_IZR) {
					{
					setState(238);
					opt_complement();
					}
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
		enterRule(_localctx, 46, RULE_opt_complement);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case TOKEN_PAR_IZR:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				opt_args();
				}
				break;
			case TOKEN_COR_IZR:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\5\3>\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\5\3J\n\3\3\3\5\3M\n\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\6"+
		"\3\6\5\6c\n\6\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\5\6l\n\6\3\7\5\7o\n\7\3"+
		"\7\3\7\3\7\5\7t\n\7\3\b\3\b\5\bx\n\b\3\b\3\b\3\t\3\t\3\t\7\t\177\n\t\f"+
		"\t\16\t\u0082\13\t\3\n\3\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\7\13\u0093\n\13\f\13\16\13\u0096\13\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\r\3\r\3\r\7"+
		"\r\u00a6\n\r\f\r\16\r\u00a9\13\r\3\16\3\16\3\16\5\16\u00ae\n\16\3\17\3"+
		"\17\3\17\3\17\7\17\u00b4\n\17\f\17\16\17\u00b7\13\17\3\20\3\20\3\21\3"+
		"\21\3\21\7\21\u00be\n\21\f\21\16\21\u00c1\13\21\3\22\3\22\3\22\3\22\7"+
		"\22\u00c7\n\22\f\22\16\22\u00ca\13\22\3\23\3\23\3\24\3\24\3\24\3\24\7"+
		"\24\u00d2\n\24\f\24\16\24\u00d5\13\24\3\25\3\25\3\26\3\26\3\26\3\26\5"+
		"\26\u00dd\n\26\3\27\3\27\3\27\7\27\u00e2\n\27\f\27\16\27\u00e5\13\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f2\n\30"+
		"\5\30\u00f4\n\30\3\31\3\31\5\31\u00f8\n\31\3\31\2\2\32\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\4\5\3\2\r\22\3\2\33\34\3"+
		"\2\31\32\u0101\2\65\3\2\2\2\4:\3\2\2\2\6Q\3\2\2\2\bS\3\2\2\2\nk\3\2\2"+
		"\2\fs\3\2\2\2\16u\3\2\2\2\20{\3\2\2\2\22\u0083\3\2\2\2\24\u008e\3\2\2"+
		"\2\26\u009a\3\2\2\2\30\u00a2\3\2\2\2\32\u00ad\3\2\2\2\34\u00af\3\2\2\2"+
		"\36\u00b8\3\2\2\2 \u00ba\3\2\2\2\"\u00c2\3\2\2\2$\u00cb\3\2\2\2&\u00cd"+
		"\3\2\2\2(\u00d6\3\2\2\2*\u00dc\3\2\2\2,\u00de\3\2\2\2.\u00f3\3\2\2\2\60"+
		"\u00f7\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\5\b\5\29\3\3\2\2\2:=\7\3\2"+
		"\2;<\7\13\2\2<>\7\f\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?L\7\13\2\2@I\7\23"+
		"\2\2AF\7\13\2\2BC\7\27\2\2CE\7\13\2\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG"+
		"\3\2\2\2GJ\3\2\2\2HF\3\2\2\2IA\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\7\24\2\2"+
		"L@\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\5\n\6\2OP\5\6\4\2P\5\3\2\2\2QR\t\2\2"+
		"\2R\7\3\2\2\2ST\7\b\2\2TU\7\13\2\2UV\5\n\6\2VW\7\t\2\2W\t\3\2\2\2XY\5"+
		"\24\13\2Y]\7\30\2\2Z\\\5\n\6\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2"+
		"\2^l\3\2\2\2_]\3\2\2\2`b\7\13\2\2ac\5\f\7\2ba\3\2\2\2bc\3\2\2\2cd\3\2"+
		"\2\2dh\7\30\2\2eg\5\n\6\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2kX\3\2\2\2k`\3\2\2\2l\13\3\2\2\2mo\5\22\n\2nm\3\2\2\2"+
		"no\3\2\2\2op\3\2\2\2pq\7\f\2\2qt\5\26\f\2rt\5\16\b\2sn\3\2\2\2sr\3\2\2"+
		"\2t\r\3\2\2\2uw\7\23\2\2vx\5\20\t\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7"+
		"\24\2\2z\17\3\2\2\2{\u0080\5\26\f\2|}\7\27\2\2}\177\5\26\f\2~|\3\2\2\2"+
		"\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\21\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0084\7\25\2\2\u0084\u0089\5 \21\2\u0085\u0086"+
		"\7\27\2\2\u0086\u0088\5 \21\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008d\7\26\2\2\u008d\23\3\2\2\2\u008e\u008f\7\6\2\2\u008f"+
		"\u0094\7\13\2\2\u0090\u0091\7\27\2\2\u0091\u0093\7\13\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\7\2\2\u0098\u0099\7\n"+
		"\2\2\u0099\25\3\2\2\2\u009a\u009f\5\30\r\2\u009b\u009c\7 \2\2\u009c\u009e"+
		"\5\30\r\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a7"+
		"\5\32\16\2\u00a3\u00a4\7\37\2\2\u00a4\u00a6\5\32\16\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\31\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ae\5\34\17"+
		"\2\u00ac\u00ae\5\34\17\2\u00ad\u00aa\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\33\3\2\2\2\u00af\u00b5\5 \21\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\5 \21"+
		"\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\35\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\t\3\2\2\u00b9\37\3\2\2\2\u00ba\u00bf\5\"\22\2\u00bb\u00bc\7\36"+
		"\2\2\u00bc\u00be\5\"\22\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c2\u00c8\5&\24\2\u00c3\u00c4\5$\23\2\u00c4\u00c5\5&\24\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9#\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\t\4\2\2"+
		"\u00cc%\3\2\2\2\u00cd\u00d3\5*\26\2\u00ce\u00cf\5(\25\2\u00cf\u00d0\5"+
		"*\26\2\u00d0\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\'\3\2\2\2\u00d5\u00d3\3\2\2\2"+
		"\u00d6\u00d7\t\5\2\2\u00d7)\3\2\2\2\u00d8\u00d9\5$\23\2\u00d9\u00da\5"+
		",\27\2\u00da\u00dd\3\2\2\2\u00db\u00dd\5,\27\2\u00dc\u00d8\3\2\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd+\3\2\2\2\u00de\u00e3\5.\30\2\u00df\u00e0\7\35\2\2"+
		"\u00e0\u00e2\5.\30\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4-\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00f4\7#\2\2\u00e7\u00f4\7$\2\2\u00e8\u00f4\7%\2\2\u00e9\u00f4\7&\2\2"+
		"\u00ea\u00f4\7\'\2\2\u00eb\u00ec\7\23\2\2\u00ec\u00ed\5\26\f\2\u00ed\u00ee"+
		"\7\24\2\2\u00ee\u00f4\3\2\2\2\u00ef\u00f1\7\13\2\2\u00f0\u00f2\5\60\31"+
		"\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e6"+
		"\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3"+
		"\u00ea\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4/\3\2\2\2"+
		"\u00f5\u00f8\5\16\b\2\u00f6\u00f8\5\22\n\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\61\3\2\2\2\35\65=FIL]bhknsw\u0080\u0089\u0094\u009f\u00a7"+
		"\u00ad\u00b5\u00bf\u00c8\u00d3\u00dc\u00e3\u00f1\u00f3\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}