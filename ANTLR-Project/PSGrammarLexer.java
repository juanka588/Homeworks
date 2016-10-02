// Generated from PSGrammar.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSGrammarLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "MAIN_BEGIN", "MAIN_END", "TIPO", 
		"ID", "TOKEN_ASIG", "TOKEN_IGUAL", "TOKEN_DIF", "TOKEN_MAYOR", "TOKEN_MAYOR_IGUAL", 
		"TOKEN_MENOR", "TOKEN_MENOR_IGUAL", "TOKEN_PAR_IZR", "TOKEN_PAR_DER", 
		"TOKEN_COR_IZR", "TOKEN_COR_DER", "TOKEN_COMA", "TOKEN_PYC", "TOKEN_MUL", 
		"TOKEN_DIV", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_POT", "TOKEN_MOD", "TOKEN_Y", 
		"TOKEN_O", "TOKEN_DOSP", "TOKEN_NEG", "TOKEN_CADENA", "TOKEN_REAL", "TOKEN_ENTERO", 
		"VERDADERO", "FALSO", "WS"
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


	public PSGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PSGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u014a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0091\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a9\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00dc\n\t"+
		"\3\n\6\n\u00df\n\n\r\n\16\n\u00e0\3\n\7\n\u00e4\n\n\f\n\16\n\u00e7\13"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\5!\u011c\n!\3\"\3\"\7\"\u0120\n\"\f"+
		"\"\16\"\u0123\13\"\3\"\3\"\3#\6#\u0128\n#\r#\16#\u0129\3#\3#\6#\u012e"+
		"\n#\r#\16#\u012f\3$\6$\u0133\n$\r$\16$\u0134\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\n"+
		"\4\2C\\c|\6\2\62;C\\aac|\4\2(({{\4\2qq~~\4\2$$))\3\2\62;\3\2\60\60\5\2"+
		"\13\f\17\17\"\"\u0159\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5"+
		"Z\3\2\2\2\7h\3\2\2\2\ts\3\2\2\2\13{\3\2\2\2\r\u0090\3\2\2\2\17\u00a8\3"+
		"\2\2\2\21\u00db\3\2\2\2\23\u00de\3\2\2\2\25\u00e8\3\2\2\2\27\u00eb\3\2"+
		"\2\2\31\u00ed\3\2\2\2\33\u00f0\3\2\2\2\35\u00f2\3\2\2\2\37\u00f5\3\2\2"+
		"\2!\u00f7\3\2\2\2#\u00fa\3\2\2\2%\u00fc\3\2\2\2\'\u00fe\3\2\2\2)\u0100"+
		"\3\2\2\2+\u0102\3\2\2\2-\u0104\3\2\2\2/\u0106\3\2\2\2\61\u0108\3\2\2\2"+
		"\63\u010a\3\2\2\2\65\u010c\3\2\2\2\67\u010e\3\2\2\29\u0110\3\2\2\2;\u0112"+
		"\3\2\2\2=\u0114\3\2\2\2?\u0116\3\2\2\2A\u011b\3\2\2\2C\u011d\3\2\2\2E"+
		"\u0127\3\2\2\2G\u0132\3\2\2\2I\u0136\3\2\2\2K\u0140\3\2\2\2M\u0146\3\2"+
		"\2\2OP\7u\2\2PQ\7w\2\2QR\7d\2\2RS\7r\2\2ST\7t\2\2TU\7q\2\2UV\7e\2\2VW"+
		"\7g\2\2WX\7u\2\2XY\7q\2\2Y\4\3\2\2\2Z[\7h\2\2[\\\7k\2\2\\]\7p\2\2]^\7"+
		"u\2\2^_\7w\2\2_`\7d\2\2`a\7r\2\2ab\7t\2\2bc\7q\2\2cd\7e\2\2de\7g\2\2e"+
		"f\7u\2\2fg\7q\2\2g\6\3\2\2\2hi\7h\2\2ij\7k\2\2jk\7p\2\2kl\7h\2\2lm\7w"+
		"\2\2mn\7p\2\2no\7e\2\2op\7k\2\2pq\7q\2\2qr\7p\2\2r\b\3\2\2\2st\7f\2\2"+
		"tu\7g\2\2uv\7h\2\2vw\7k\2\2wx\7p\2\2xy\7k\2\2yz\7t\2\2z\n\3\2\2\2{|\7"+
		"e\2\2|}\7q\2\2}~\7o\2\2~\177\7q\2\2\177\f\3\2\2\2\u0080\u0081\7r\2\2\u0081"+
		"\u0082\7t\2\2\u0082\u0083\7q\2\2\u0083\u0084\7e\2\2\u0084\u0085\7g\2\2"+
		"\u0085\u0086\7u\2\2\u0086\u0091\7q\2\2\u0087\u0088\7c\2\2\u0088\u0089"+
		"\7n\2\2\u0089\u008a\7i\2\2\u008a\u008b\7q\2\2\u008b\u008c\7t\2\2\u008c"+
		"\u008d\7k\2\2\u008d\u008e\7v\2\2\u008e\u008f\7o\2\2\u008f\u0091\7q\2\2"+
		"\u0090\u0080\3\2\2\2\u0090\u0087\3\2\2\2\u0091\16\3\2\2\2\u0092\u0093"+
		"\7h\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096\7r\2\2\u0096"+
		"\u0097\7t\2\2\u0097\u0098\7q\2\2\u0098\u0099\7e\2\2\u0099\u009a\7g\2\2"+
		"\u009a\u009b\7u\2\2\u009b\u00a9\7q\2\2\u009c\u009d\7h\2\2\u009d\u009e"+
		"\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7n\2\2\u00a1"+
		"\u00a2\7i\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7k\2\2"+
		"\u00a5\u00a6\7v\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a9\7q\2\2\u00a8\u0092"+
		"\3\2\2\2\u00a8\u009c\3\2\2\2\u00a9\20\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7t\2\2"+
		"\u00af\u00dc\7q\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7c\2\2\u00b3\u00dc\7n\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7w\2\2\u00b6"+
		"\u00b7\7o\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7t\2\2\u00b9\u00dc\7q\2\2"+
		"\u00ba\u00bb\7p\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7e\2\2\u00c1"+
		"\u00dc\7q\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7z\2\2"+
		"\u00c5\u00c6\7v\2\2\u00c6\u00dc\7q\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7p\2\2\u00cc"+
		"\u00dc\7c\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7t\2\2"+
		"\u00d0\u00d1\7c\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4\u00dc\7t\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7q\2\2\u00d7"+
		"\u00d8\7i\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7e\2\2\u00da\u00dc\7q\2\2"+
		"\u00db\u00aa\3\2\2\2\u00db\u00b0\3\2\2\2\u00db\u00b4\3\2\2\2\u00db\u00ba"+
		"\3\2\2\2\u00db\u00c2\3\2\2\2\u00db\u00c7\3\2\2\2\u00db\u00cd\3\2\2\2\u00db"+
		"\u00d5\3\2\2\2\u00dc\22\3\2\2\2\u00dd\u00df\t\2\2\2\u00de\u00dd\3\2\2"+
		"\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e5"+
		"\3\2\2\2\u00e2\u00e4\t\3\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\24\3\2\2\2\u00e7\u00e5\3\2\2"+
		"\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7/\2\2\u00ea\26\3\2\2\2\u00eb\u00ec"+
		"\7?\2\2\u00ec\30\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\u00ef\7@\2\2\u00ef\32"+
		"\3\2\2\2\u00f0\u00f1\7@\2\2\u00f1\34\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3"+
		"\u00f4\7?\2\2\u00f4\36\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6 \3\2\2\2\u00f7"+
		"\u00f8\7>\2\2\u00f8\u00f9\7?\2\2\u00f9\"\3\2\2\2\u00fa\u00fb\7*\2\2\u00fb"+
		"$\3\2\2\2\u00fc\u00fd\7+\2\2\u00fd&\3\2\2\2\u00fe\u00ff\7]\2\2\u00ff("+
		"\3\2\2\2\u0100\u0101\7_\2\2\u0101*\3\2\2\2\u0102\u0103\7.\2\2\u0103,\3"+
		"\2\2\2\u0104\u0105\7=\2\2\u0105.\3\2\2\2\u0106\u0107\7,\2\2\u0107\60\3"+
		"\2\2\2\u0108\u0109\7\61\2\2\u0109\62\3\2\2\2\u010a\u010b\7-\2\2\u010b"+
		"\64\3\2\2\2\u010c\u010d\7/\2\2\u010d\66\3\2\2\2\u010e\u010f\7`\2\2\u010f"+
		"8\3\2\2\2\u0110\u0111\7\'\2\2\u0111:\3\2\2\2\u0112\u0113\t\4\2\2\u0113"+
		"<\3\2\2\2\u0114\u0115\t\5\2\2\u0115>\3\2\2\2\u0116\u0117\7<\2\2\u0117"+
		"@\3\2\2\2\u0118\u011c\7\u0080\2\2\u0119\u011a\7p\2\2\u011a\u011c\7q\2"+
		"\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011cB\3\2\2\2\u011d\u0121"+
		"\t\6\2\2\u011e\u0120\13\2\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0124\u0125\t\6\2\2\u0125D\3\2\2\2\u0126\u0128\t\7\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012d\t\b\2\2\u012c\u012e\t\7\2\2\u012d"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130F\3\2\2\2\u0131\u0133\t\7\2\2\u0132\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135H\3\2\2\2\u0136"+
		"\u0137\7x\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t\2\2\u0139\u013a\7f\2\2"+
		"\u013a\u013b\7c\2\2\u013b\u013c\7f\2\2\u013c\u013d\7g\2\2\u013d\u013e"+
		"\7t\2\2\u013e\u013f\7q\2\2\u013fJ\3\2\2\2\u0140\u0141\7h\2\2\u0141\u0142"+
		"\7c\2\2\u0142\u0143\7n\2\2\u0143\u0144\7u\2\2\u0144\u0145\7q\2\2\u0145"+
		"L\3\2\2\2\u0146\u0147\t\t\2\2\u0147\u0148\3\2\2\2\u0148\u0149\b\'\2\2"+
		"\u0149N\3\2\2\2\r\2\u0090\u00a8\u00db\u00e0\u00e5\u011b\u0121\u0129\u012f"+
		"\u0134\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}