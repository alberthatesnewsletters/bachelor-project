// Generated from /Users/kateryna/Documents/3_year_SoftTech/Thesis/last thesis/thesis-repo/simple_grammar/CSV.g by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSVParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, WORD=15, WORD_EXTRA=16, 
		LINE_BREAK=17;
	public static final int
		RULE_csvFile = 0, RULE_hdr = 1, RULE_row = 2, RULE_field = 3, RULE_quotedField = 4, 
		RULE_nameField = 5, RULE_coauthor = 6, RULE_name = 7, RULE_localId = 8, 
		RULE_affiliation = 9, RULE_affiliationSegment = 10, RULE_abbreviation = 11, 
		RULE_restFields = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"csvFile", "hdr", "row", "field", "quotedField", "nameField", "coauthor", 
			"name", "localId", "affiliation", "affiliationSegment", "abbreviation", 
			"restFields"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\"'", "';'", "' '", "', '", "'['", "']'", "'('", "')'", 
			"' ; '", "' ;'", "'; '", "',  '", "',, '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WORD", "WORD_EXTRA", "LINE_BREAK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "CSV.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSVParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CsvFileContext extends ParserRuleContext {
		public HdrContext hdr() {
			return getRuleContext(HdrContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CSVParser.EOF, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public CsvFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csvFile; }
	}

	public final CsvFileContext csvFile() throws RecognitionException {
		CsvFileContext _localctx = new CsvFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_csvFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			hdr();
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				row();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==WORD );
			setState(32);
			match(EOF);
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

	public static class HdrContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode LINE_BREAK() { return getToken(CSVParser.LINE_BREAK, 0); }
		public HdrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdr; }
	}

	public final HdrContext hdr() throws RecognitionException {
		HdrContext _localctx = new HdrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hdr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			field();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(35);
				match(T__0);
				setState(36);
				field();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(LINE_BREAK);
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

	public static class RowContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public NameFieldContext nameField() {
			return getRuleContext(NameFieldContext.class,0);
		}
		public RestFieldsContext restFields() {
			return getRuleContext(RestFieldsContext.class,0);
		}
		public TerminalNode LINE_BREAK() { return getToken(CSVParser.LINE_BREAK, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			field();
			setState(45);
			match(T__0);
			setState(46);
			nameField();
			setState(47);
			match(T__0);
			setState(48);
			restFields();
			setState(49);
			match(LINE_BREAK);
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

	public static class FieldContext extends ParserRuleContext {
		public QuotedFieldContext quotedField() {
			return getRuleContext(QuotedFieldContext.class,0);
		}
		public TerminalNode WORD() { return getToken(CSVParser.WORD, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				quotedField();
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(WORD);
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

	public static class QuotedFieldContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(CSVParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(CSVParser.WORD, i);
		}
		public List<TerminalNode> WORD_EXTRA() { return getTokens(CSVParser.WORD_EXTRA); }
		public TerminalNode WORD_EXTRA(int i) {
			return getToken(CSVParser.WORD_EXTRA, i);
		}
		public QuotedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedField; }
	}

	public final QuotedFieldContext quotedField() throws RecognitionException {
		QuotedFieldContext _localctx = new QuotedFieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quotedField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__1);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << WORD) | (1L << WORD_EXTRA))) != 0)) {
				{
				{
				setState(56);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << WORD) | (1L << WORD_EXTRA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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

	public static class NameFieldContext extends ParserRuleContext {
		public List<CoauthorContext> coauthor() {
			return getRuleContexts(CoauthorContext.class);
		}
		public CoauthorContext coauthor(int i) {
			return getRuleContext(CoauthorContext.class,i);
		}
		public NameFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameField; }
	}

	public final NameFieldContext nameField() throws RecognitionException {
		NameFieldContext _localctx = new NameFieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nameField);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__1);
				setState(65);
				coauthor();
				setState(66);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__1);
				setState(69);
				coauthor();
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					match(T__2);
					setState(71);
					coauthor();
					}
					}
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(76);
				match(T__1);
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

	public static class CoauthorContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<LocalIdContext> localId() {
			return getRuleContexts(LocalIdContext.class);
		}
		public LocalIdContext localId(int i) {
			return getRuleContext(LocalIdContext.class,i);
		}
		public List<AffiliationContext> affiliation() {
			return getRuleContexts(AffiliationContext.class);
		}
		public AffiliationContext affiliation(int i) {
			return getRuleContext(AffiliationContext.class,i);
		}
		public CoauthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coauthor; }
	}

	public final CoauthorContext coauthor() throws RecognitionException {
		CoauthorContext _localctx = new CoauthorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_coauthor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			name();
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					match(T__3);
					setState(82);
					localId();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(88);
				match(T__3);
				setState(89);
				affiliation();
				}
				}
				setState(94);
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

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(CSVParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(CSVParser.WORD, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(WORD);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					match(T__3);
					setState(97);
					match(WORD);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(103);
				match(T__4);
				setState(104);
				match(WORD);
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(105);
						match(T__3);
						setState(106);
						match(WORD);
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				}
				setState(116);
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

	public static class LocalIdContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CSVParser.WORD, 0); }
		public LocalIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localId; }
	}

	public final LocalIdContext localId() throws RecognitionException {
		LocalIdContext _localctx = new LocalIdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_localId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__5);
			setState(118);
			match(WORD);
			setState(119);
			match(T__6);
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

	public static class AffiliationContext extends ParserRuleContext {
		public List<AffiliationSegmentContext> affiliationSegment() {
			return getRuleContexts(AffiliationSegmentContext.class);
		}
		public AffiliationSegmentContext affiliationSegment(int i) {
			return getRuleContext(AffiliationSegmentContext.class,i);
		}
		public List<LocalIdContext> localId() {
			return getRuleContexts(LocalIdContext.class);
		}
		public LocalIdContext localId(int i) {
			return getRuleContext(LocalIdContext.class,i);
		}
		public AffiliationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affiliation; }
	}

	public final AffiliationContext affiliation() throws RecognitionException {
		AffiliationContext _localctx = new AffiliationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_affiliation);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__7);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(122);
					match(T__3);
					}
				}

				setState(125);
				affiliationSegment();
				{
				setState(126);
				match(T__3);
				setState(127);
				localId();
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(129);
					match(T__4);
					setState(130);
					affiliationSegment();
					{
					setState(131);
					match(T__3);
					setState(132);
					localId();
					}
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(139);
					match(T__3);
					}
				}

				setState(142);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__7);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(145);
					match(T__3);
					}
				}

				setState(148);
				affiliationSegment();
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(149);
					match(T__3);
					setState(150);
					localId();
					}
					break;
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
					{
					{
					setState(153);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(154);
					affiliationSegment();
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(155);
						match(T__3);
						setState(156);
						localId();
						}
						break;
					}
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(164);
					match(T__3);
					}
				}

				setState(167);
				match(T__8);
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

	public static class AffiliationSegmentContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(CSVParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(CSVParser.WORD, i);
		}
		public AbbreviationContext abbreviation() {
			return getRuleContext(AbbreviationContext.class,0);
		}
		public AffiliationSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affiliationSegment; }
	}

	public final AffiliationSegmentContext affiliationSegment() throws RecognitionException {
		AffiliationSegmentContext _localctx = new AffiliationSegmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_affiliationSegment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(WORD);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__13))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WORD) {
						{
						setState(173);
						match(WORD);
						}
					}

					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(181);
				match(T__3);
				setState(182);
				abbreviation();
				}
				break;
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

	public static class AbbreviationContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CSVParser.WORD, 0); }
		public AbbreviationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbreviation; }
	}

	public final AbbreviationContext abbreviation() throws RecognitionException {
		AbbreviationContext _localctx = new AbbreviationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_abbreviation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__7);
			setState(186);
			match(WORD);
			setState(187);
			match(T__8);
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

	public static class RestFieldsContext extends ParserRuleContext {
		public List<TerminalNode> LINE_BREAK() { return getTokens(CSVParser.LINE_BREAK); }
		public TerminalNode LINE_BREAK(int i) {
			return getToken(CSVParser.LINE_BREAK, i);
		}
		public RestFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restFields; }
	}

	public final RestFieldsContext restFields() throws RecognitionException {
		RestFieldsContext _localctx = new RestFieldsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_restFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << WORD) | (1L << WORD_EXTRA))) != 0)) {
				{
				{
				setState(189);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==LINE_BREAK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(194);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u00c6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\2\3\2\3"+
		"\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\5\58\n\5\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\6\7K\n\7\r\7\16\7L\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\7"+
		"\bV\n\b\f\b\16\bY\13\b\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\3\t\3\t\3\t\7\t"+
		"e\n\t\f\t\16\th\13\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\7\ts\n\t"+
		"\f\t\16\tv\13\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13~\n\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c\13\13\3"+
		"\13\5\13\u008f\n\13\3\13\3\13\3\13\3\13\5\13\u0095\n\13\3\13\3\13\3\13"+
		"\5\13\u009a\n\13\3\13\3\13\3\13\3\13\5\13\u00a0\n\13\7\13\u00a2\n\13\f"+
		"\13\16\13\u00a5\13\13\3\13\5\13\u00a8\n\13\3\13\3\13\5\13\u00ac\n\13\3"+
		"\f\3\f\3\f\5\f\u00b1\n\f\7\f\u00b3\n\f\f\f\16\f\u00b6\13\f\3\f\3\f\5\f"+
		"\u00ba\n\f\3\r\3\r\3\r\3\r\3\16\7\16\u00c1\n\16\f\16\16\16\u00c4\13\16"+
		"\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\6\4\2\3\3\21\22\4\2\5"+
		"\5\f\16\5\2\3\3\6\7\17\20\3\2\23\23\2\u00d0\2\34\3\2\2\2\4$\3\2\2\2\6"+
		".\3\2\2\2\b\67\3\2\2\2\n9\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2\20a\3\2\2\2\22"+
		"w\3\2\2\2\24\u00ab\3\2\2\2\26\u00ad\3\2\2\2\30\u00bb\3\2\2\2\32\u00c2"+
		"\3\2\2\2\34\36\5\4\3\2\35\37\5\6\4\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2"+
		"\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$)\5\b\5\2%&\7\3\2\2&("+
		"\5\b\5\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2"+
		",-\7\23\2\2-\5\3\2\2\2./\5\b\5\2/\60\7\3\2\2\60\61\5\f\7\2\61\62\7\3\2"+
		"\2\62\63\5\32\16\2\63\64\7\23\2\2\64\7\3\2\2\2\658\5\n\6\2\668\7\21\2"+
		"\2\67\65\3\2\2\2\67\66\3\2\2\28\t\3\2\2\29=\7\4\2\2:<\t\2\2\2;:\3\2\2"+
		"\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\4\2\2A\13\3\2"+
		"\2\2BC\7\4\2\2CD\5\16\b\2DE\7\4\2\2EQ\3\2\2\2FG\7\4\2\2GJ\5\16\b\2HI\7"+
		"\5\2\2IK\5\16\b\2JH\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO"+
		"\7\4\2\2OQ\3\2\2\2PB\3\2\2\2PF\3\2\2\2Q\r\3\2\2\2RW\5\20\t\2ST\7\6\2\2"+
		"TV\5\22\n\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X^\3\2\2\2YW\3\2\2"+
		"\2Z[\7\6\2\2[]\5\24\13\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\17"+
		"\3\2\2\2`^\3\2\2\2af\7\21\2\2bc\7\6\2\2ce\7\21\2\2db\3\2\2\2eh\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2gt\3\2\2\2hf\3\2\2\2ij\7\7\2\2jo\7\21\2\2kl\7\6\2"+
		"\2ln\7\21\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2"+
		"\2\2ri\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vt\3\2\2\2wx\7"+
		"\b\2\2xy\7\21\2\2yz\7\t\2\2z\23\3\2\2\2{}\7\n\2\2|~\7\6\2\2}|\3\2\2\2"+
		"}~\3\2\2\2~\177\3\2\2\2\177\u0080\5\26\f\2\u0080\u0081\7\6\2\2\u0081\u0082"+
		"\5\22\n\2\u0082\u008a\3\2\2\2\u0083\u0084\7\7\2\2\u0084\u0085\5\26\f\2"+
		"\u0085\u0086\7\6\2\2\u0086\u0087\5\22\n\2\u0087\u0089\3\2\2\2\u0088\u0083"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\7\6\2\2\u008e\u008d\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\13\2\2\u0091"+
		"\u00ac\3\2\2\2\u0092\u0094\7\n\2\2\u0093\u0095\7\6\2\2\u0094\u0093\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\5\26\f\2\u0097"+
		"\u0098\7\6\2\2\u0098\u009a\5\22\n\2\u0099\u0097\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u00a3\3\2\2\2\u009b\u009c\t\3\2\2\u009c\u009f\5\26\f\2\u009d"+
		"\u009e\7\6\2\2\u009e\u00a0\5\22\n\2\u009f\u009d\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009b\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a8\7\6\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ac\3\2\2\2\u00ab{\3\2\2\2"+
		"\u00ab\u0092\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00b4\7\21\2\2\u00ae\u00b0"+
		"\t\4\2\2\u00af\u00b1\7\21\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b9\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00b8\7\6\2\2\u00b8\u00ba\5\30\r\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3"+
		"\2\2\2\u00ba\27\3\2\2\2\u00bb\u00bc\7\n\2\2\u00bc\u00bd\7\21\2\2\u00bd"+
		"\u00be\7\13\2\2\u00be\31\3\2\2\2\u00bf\u00c1\n\5\2\2\u00c0\u00bf\3\2\2"+
		"\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\33"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\32 )\67=LPW^fot}\u008a\u008e\u0094\u0099"+
		"\u009f\u00a3\u00a7\u00ab\u00b0\u00b4\u00b9\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}