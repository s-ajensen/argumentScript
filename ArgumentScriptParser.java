// Generated from ArgumentScript.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArgumentScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TERM=3, DEFHEADER=4, DEFFOOTER=5, ARGHEADER=6, ARGFOOTER=7, 
		ASRTHEADER=8, ASRTFOOTER=9, NEWLINE=10, OPERATOR=11, WS=12;
	public static final int
		RULE_file = 0, RULE_definition = 1, RULE_argument = 2, RULE_assertion = 3, 
		RULE_proposition = 4;
	public static final String[] ruleNames = {
		"file", "definition", "argument", "assertion", "proposition"
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

	@Override
	public String getGrammarFileName() { return "ArgumentScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArgumentScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ArgumentScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArgumentScriptParser.NEWLINE, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgumentScriptListener ) ((ArgumentScriptListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgumentScriptListener ) ((ArgumentScriptListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			definition();
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(11);
				match(NEWLINE);
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			argument();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(18);
				match(NEWLINE);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			assertion();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(25);
				match(NEWLINE);
				}
				}
				setState(30);
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode DEFHEADER() { return getToken(ArgumentScriptParser.DEFHEADER, 0); }
		public TerminalNode DEFFOOTER() { return getToken(ArgumentScriptParser.DEFFOOTER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ArgumentScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArgumentScriptParser.NEWLINE, i);
		}
		public List<TerminalNode> TERM() { return getTokens(ArgumentScriptParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(ArgumentScriptParser.TERM, i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgumentScriptListener ) ((ArgumentScriptListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgumentScriptListener ) ((ArgumentScriptListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(DEFHEADER);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				match(NEWLINE);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TERM) {
				{
				{
				setState(37);
				match(TERM);
				setState(38);
				match(NEWLINE);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(DEFFOOTER);
			setState(46); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(45);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(48); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode ARGHEADER() { return getToken(ArgumentScriptParser.ARGHEADER, 0); }
		public TerminalNode ARGFOOTER() { return getToken(ArgumentScriptParser.ARGFOOTER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ArgumentScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArgumentScriptParser.NEWLINE, i);
		}
		public List<PropositionContext> proposition() {
			return getRuleContexts(PropositionContext.class);
		}
		public PropositionContext proposition(int i) {
			return getRuleContext(PropositionContext.class,i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(ArgumentScriptParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(ArgumentScriptParser.OPERATOR, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgumentScriptListener ) ((ArgumentScriptListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgumentScriptListener ) ((ArgumentScriptListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ARGHEADER);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				match(NEWLINE);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TERM) | (1L << OPERATOR))) != 0)) {
				{
				{
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR) {
					{
					setState(56);
					match(OPERATOR);
					}
				}

				setState(59);
				proposition(0);
				setState(60);
				match(NEWLINE);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(ARGFOOTER);
			setState(69); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(68);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode ASRTHEADER() { return getToken(ArgumentScriptParser.ASRTHEADER, 0); }
		public TerminalNode ASRTFOOTER() { return getToken(ArgumentScriptParser.ASRTFOOTER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ArgumentScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArgumentScriptParser.NEWLINE, i);
		}
		public List<TerminalNode> TERM() { return getTokens(ArgumentScriptParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(ArgumentScriptParser.TERM, i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(ArgumentScriptParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(ArgumentScriptParser.OPERATOR, i);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgumentScriptListener ) ((ArgumentScriptListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgumentScriptListener ) ((ArgumentScriptListener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assertion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ASRTHEADER);
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				match(NEWLINE);
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TERM || _la==OPERATOR) {
				{
				{
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR) {
					{
					setState(79);
					match(OPERATOR);
					}
				}

				setState(82);
				match(TERM);
				setState(83);
				match(NEWLINE);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(ASRTFOOTER);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(NEWLINE);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class PropositionContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(ArgumentScriptParser.TERM, 0); }
		public List<PropositionContext> proposition() {
			return getRuleContexts(PropositionContext.class);
		}
		public PropositionContext proposition(int i) {
			return getRuleContext(PropositionContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(ArgumentScriptParser.OPERATOR, 0); }
		public PropositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArgumentScriptListener ) ((ArgumentScriptListener)listener).enterProposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArgumentScriptListener ) ((ArgumentScriptListener)listener).exitProposition(this);
		}
	}

	public final PropositionContext proposition() throws RecognitionException {
		return proposition(0);
	}

	private PropositionContext proposition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropositionContext _localctx = new PropositionContext(_ctx, _parentState);
		PropositionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_proposition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM:
				{
				setState(97);
				match(TERM);
				}
				break;
			case T__0:
				{
				setState(98);
				match(T__0);
				setState(99);
				proposition(0);
				setState(100);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PropositionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_proposition);
					setState(104);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(105);
					match(OPERATOR);
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(106);
						proposition(0);
						}
						break;
					}
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return proposition_sempred((PropositionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean proposition_sempred(PropositionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3\2"+
		"\7\2\26\n\2\f\2\16\2\31\13\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\3\3"+
		"\6\3$\n\3\r\3\16\3%\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\6\3\61\n\3"+
		"\r\3\16\3\62\3\4\3\4\6\4\67\n\4\r\4\16\48\3\4\5\4<\n\4\3\4\3\4\3\4\7\4"+
		"A\n\4\f\4\16\4D\13\4\3\4\3\4\6\4H\n\4\r\4\16\4I\3\5\3\5\6\5N\n\5\r\5\16"+
		"\5O\3\5\5\5S\n\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\7\5^\n\5\f\5"+
		"\16\5a\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\6\3\6\3\6\5\6n\n\6\7\6"+
		"p\n\6\f\6\16\6s\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2\2\u0080\2\f\3\2\2\2\4!"+
		"\3\2\2\2\6\64\3\2\2\2\bK\3\2\2\2\nh\3\2\2\2\f\20\5\4\3\2\r\17\7\f\2\2"+
		"\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2"+
		"\22\20\3\2\2\2\23\27\5\6\4\2\24\26\7\f\2\2\25\24\3\2\2\2\26\31\3\2\2\2"+
		"\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\36\5\b\5\2"+
		"\33\35\7\f\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37"+
		"\3\3\2\2\2 \36\3\2\2\2!#\7\6\2\2\"$\7\f\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2"+
		"\2\2%&\3\2\2\2&+\3\2\2\2\'(\7\5\2\2(*\7\f\2\2)\'\3\2\2\2*-\3\2\2\2+)\3"+
		"\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2.\60\7\7\2\2/\61\7\f\2\2\60/\3\2\2"+
		"\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\5\3\2\2\2\64\66\7\b\2"+
		"\2\65\67\7\f\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29B\3\2"+
		"\2\2:<\7\r\2\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\n\6\2>?\7\f\2\2?A\3\2"+
		"\2\2@;\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EG\7\t"+
		"\2\2FH\7\f\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KM\7"+
		"\n\2\2LN\7\f\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PX\3\2\2\2QS\7"+
		"\r\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\5\2\2UW\7\f\2\2VR\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[_\7\13\2\2\\^\7\f\2\2]"+
		"\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\t\3\2\2\2a_\3\2\2\2bc\b\6\1"+
		"\2ci\7\5\2\2de\7\3\2\2ef\5\n\6\2fg\7\4\2\2gi\3\2\2\2hb\3\2\2\2hd\3\2\2"+
		"\2iq\3\2\2\2jk\f\4\2\2km\7\r\2\2ln\5\n\6\2ml\3\2\2\2mn\3\2\2\2np\3\2\2"+
		"\2oj\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\13\3\2\2\2sq\3\2\2\2\23\20"+
		"\27\36%+\628;BIORX_hmq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}