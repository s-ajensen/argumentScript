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
		null, "'('", "')'", null, "'#DEF\n'", "'#END_DEF\n'", "'#ARG\n'", "'#END_ARG\n'", 
		"'#ASRT\n'", "'#END_ASRT'"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\6\4:\n\4\r\4\16\4;\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13r\n\13\3\13\3\13\5"+
		"\13v\n\13\3\f\3\f\3\f\5\f{\n\f\3\r\6\r~\n\r\r\r\16\r\177\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\2!\2#\2%\2\'\2)\2"+
		"+\2-\2/\2\61\2\3\2\5\5\2\"\"C\\c|\5\2((~~\u0080\u0080\4\2\13\13\"\"\2"+
		"\u0093\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t?\3\2\2\2"+
		"\13E\3\2\2\2\rO\3\2\2\2\17U\3\2\2\2\21_\3\2\2\2\23f\3\2\2\2\25u\3\2\2"+
		"\2\27z\3\2\2\2\31}\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37\u0087"+
		"\3\2\2\2!\u0089\3\2\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2"+
		")\u0091\3\2\2\2+\u0093\3\2\2\2-\u0095\3\2\2\2/\u0097\3\2\2\2\61\u0099"+
		"\3\2\2\2\63\64\7*\2\2\64\4\3\2\2\2\65\66\7+\2\2\66\6\3\2\2\2\679\7$\2"+
		"\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7$\2"+
		"\2>\b\3\2\2\2?@\7%\2\2@A\7F\2\2AB\7G\2\2BC\7H\2\2CD\7\f\2\2D\n\3\2\2\2"+
		"EF\7%\2\2FG\7G\2\2GH\7P\2\2HI\7F\2\2IJ\7a\2\2JK\7F\2\2KL\7G\2\2LM\7H\2"+
		"\2MN\7\f\2\2N\f\3\2\2\2OP\7%\2\2PQ\7C\2\2QR\7T\2\2RS\7I\2\2ST\7\f\2\2"+
		"T\16\3\2\2\2UV\7%\2\2VW\7G\2\2WX\7P\2\2XY\7F\2\2YZ\7a\2\2Z[\7C\2\2[\\"+
		"\7T\2\2\\]\7I\2\2]^\7\f\2\2^\20\3\2\2\2_`\7%\2\2`a\7C\2\2ab\7U\2\2bc\7"+
		"T\2\2cd\7V\2\2de\7\f\2\2e\22\3\2\2\2fg\7%\2\2gh\7G\2\2hi\7P\2\2ij\7F\2"+
		"\2jk\7a\2\2kl\7C\2\2lm\7U\2\2mn\7T\2\2no\7V\2\2o\24\3\2\2\2pr\7\17\2\2"+
		"qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2sv\7\f\2\2tv\7\17\2\2uq\3\2\2\2ut\3\2\2"+
		"\2v\26\3\2\2\2w{\t\3\2\2xy\7/\2\2y{\7@\2\2zw\3\2\2\2zx\3\2\2\2{\30\3\2"+
		"\2\2|~\t\4\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\b\r\2\2\u0082\32\3\2\2\2\u0083\u0084\7%\2\2"+
		"\u0084\34\3\2\2\2\u0085\u0086\7a\2\2\u0086\36\3\2\2\2\u0087\u0088\7F\2"+
		"\2\u0088 \3\2\2\2\u0089\u008a\7G\2\2\u008a\"\3\2\2\2\u008b\u008c\7H\2"+
		"\2\u008c$\3\2\2\2\u008d\u008e\7C\2\2\u008e&\3\2\2\2\u008f\u0090\7T\2\2"+
		"\u0090(\3\2\2\2\u0091\u0092\7I\2\2\u0092*\3\2\2\2\u0093\u0094\7U\2\2\u0094"+
		",\3\2\2\2\u0095\u0096\7V\2\2\u0096.\3\2\2\2\u0097\u0098\7P\2\2\u0098\60"+
		"\3\2\2\2\u0099\u009a\7$\2\2\u009a\62\3\2\2\2\b\2;quz\177\3\3\r\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}