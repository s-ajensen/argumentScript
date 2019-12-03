// Generated from ArgumentScript.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArgumentScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TERM=3, DEFHEADER=4, DEFFOOTER=5, ARGHEADER=6, ARGFOOTER=7, 
		ASRTHEADER=8, ASRTFOOTER=9, NEWLINE=10, OPERATOR=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "TERM", "DEFHEADER", "DEFFOOTER", "ARGHEADER", "ARGFOOTER", 
		"ASRTHEADER", "ASRTFOOTER", "NEWLINE", "OPERATOR", "WS", "POUND", "UNDERSCORE", 
		"D", "E", "F", "A", "R", "G", "S", "T", "N", "DQUOTE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", null, "'#DEF'", "'#END_DEF'", "'#ARG'", "'#END_ARG'", 
		"'#ASRT'", "'#END_ASRT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "TERM", "DEFHEADER", "DEFFOOTER", "ARGHEADER", "ARGFOOTER", 
		"ASRTHEADER", "ASRTFOOTER", "NEWLINE", "OPERATOR", "WS"
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


	public ArgumentScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArgumentScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\6\4:\n\4\r\4\16\4;\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13m\n\13\3\13\3\13\5\13q\n\13\3\f\3\f\3"+
		"\f\5\fv\n\f\3\r\6\ry\n\r\r\r\16\rz\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\3\2\5\5"+
		"\2\"\"C\\c|\5\2((~~\u0080\u0080\4\2\13\13\"\"\2\u008e\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\63"+
		"\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t?\3\2\2\2\13D\3\2\2\2\rM\3\2\2\2\17"+
		"R\3\2\2\2\21[\3\2\2\2\23a\3\2\2\2\25p\3\2\2\2\27u\3\2\2\2\31x\3\2\2\2"+
		"\33~\3\2\2\2\35\u0080\3\2\2\2\37\u0082\3\2\2\2!\u0084\3\2\2\2#\u0086\3"+
		"\2\2\2%\u0088\3\2\2\2\'\u008a\3\2\2\2)\u008c\3\2\2\2+\u008e\3\2\2\2-\u0090"+
		"\3\2\2\2/\u0092\3\2\2\2\61\u0094\3\2\2\2\63\64\7*\2\2\64\4\3\2\2\2\65"+
		"\66\7+\2\2\66\6\3\2\2\2\679\7$\2\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<=\3\2\2\2=>\7$\2\2>\b\3\2\2\2?@\7%\2\2@A\7F\2\2AB\7G\2"+
		"\2BC\7H\2\2C\n\3\2\2\2DE\7%\2\2EF\7G\2\2FG\7P\2\2GH\7F\2\2HI\7a\2\2IJ"+
		"\7F\2\2JK\7G\2\2KL\7H\2\2L\f\3\2\2\2MN\7%\2\2NO\7C\2\2OP\7T\2\2PQ\7I\2"+
		"\2Q\16\3\2\2\2RS\7%\2\2ST\7G\2\2TU\7P\2\2UV\7F\2\2VW\7a\2\2WX\7C\2\2X"+
		"Y\7T\2\2YZ\7I\2\2Z\20\3\2\2\2[\\\7%\2\2\\]\7C\2\2]^\7U\2\2^_\7T\2\2_`"+
		"\7V\2\2`\22\3\2\2\2ab\7%\2\2bc\7G\2\2cd\7P\2\2de\7F\2\2ef\7a\2\2fg\7C"+
		"\2\2gh\7U\2\2hi\7T\2\2ij\7V\2\2j\24\3\2\2\2km\7\17\2\2lk\3\2\2\2lm\3\2"+
		"\2\2mn\3\2\2\2nq\7\f\2\2oq\7\17\2\2pl\3\2\2\2po\3\2\2\2q\26\3\2\2\2rv"+
		"\t\3\2\2st\7/\2\2tv\7@\2\2ur\3\2\2\2us\3\2\2\2v\30\3\2\2\2wy\t\4\2\2x"+
		"w\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\r\2\2}\32\3\2\2"+
		"\2~\177\7%\2\2\177\34\3\2\2\2\u0080\u0081\7a\2\2\u0081\36\3\2\2\2\u0082"+
		"\u0083\7F\2\2\u0083 \3\2\2\2\u0084\u0085\7G\2\2\u0085\"\3\2\2\2\u0086"+
		"\u0087\7H\2\2\u0087$\3\2\2\2\u0088\u0089\7C\2\2\u0089&\3\2\2\2\u008a\u008b"+
		"\7T\2\2\u008b(\3\2\2\2\u008c\u008d\7I\2\2\u008d*\3\2\2\2\u008e\u008f\7"+
		"U\2\2\u008f,\3\2\2\2\u0090\u0091\7V\2\2\u0091.\3\2\2\2\u0092\u0093\7P"+
		"\2\2\u0093\60\3\2\2\2\u0094\u0095\7$\2\2\u0095\62\3\2\2\2\b\2;lpuz\3\3"+
		"\r\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}