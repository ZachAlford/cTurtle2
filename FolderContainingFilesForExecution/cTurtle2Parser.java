// Generated from cTurtle2.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cTurtle2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, SHAPE=28, COLOR=29, DIGIT=30, VARIABLE=31, 
		WS=32;
	public static final int
		RULE_file = 0, RULE_moreStatements = 1, RULE_statement = 2, RULE_assignStatement = 3, 
		RULE_copyStatement = 4, RULE_descriptor = 5, RULE_colorProperty = 6, RULE_speed = 7, 
		RULE_color = 8, RULE_rectangleSize = 9, RULE_object = 10, RULE_coordinate = 11, 
		RULE_negativeX = 12, RULE_negativeY = 13, RULE_polygon = 14, RULE_number = 15, 
		RULE_commandStatement = 16, RULE_drawStatement = 17, RULE_deleteStatement = 18;
	public static final String[] ruleNames = {
		"file", "moreStatements", "statement", "assignStatement", "copyStatement", 
		"descriptor", "colorProperty", "speed", "color", "rectangleSize", "object", 
		"coordinate", "negativeX", "negativeY", "polygon", "number", "commandStatement", 
		"drawStatement", "deleteStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'->'", "'fill-color'", "'='", "','", "'line-color'", "'line-width'", 
		"'starting-position'", "'drawing-speed'", "'radius'", "'side-length'", 
		"'instantaneous'", "'rgb('", "')'", "'x'", "'X'", "'*'", "'line'", "'to'", 
		"'through'", "'['", "']'", "'('", "'-'", "'-gon'", "'draw'", "'delete'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "SHAPE", "COLOR", "DIGIT", "VARIABLE", "WS"
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
	public String getGrammarFileName() { return "cTurtle2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cTurtle2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MoreStatementsContext moreStatements() {
			return getRuleContext(MoreStatementsContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			statement();
			setState(39);
			moreStatements();
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

	public static class MoreStatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MoreStatementsContext moreStatements() {
			return getRuleContext(MoreStatementsContext.class,0);
		}
		public MoreStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterMoreStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitMoreStatements(this);
		}
	}

	public final MoreStatementsContext moreStatements() throws RecognitionException {
		MoreStatementsContext _localctx = new MoreStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moreStatements);
		try {
			setState(45);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				statement();
				setState(42);
				moreStatements();
				}
				break;
			case EOF:
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommandStatementWrapperContext extends StatementContext {
		public CommandStatementContext commandStatement() {
			return getRuleContext(CommandStatementContext.class,0);
		}
		public CommandStatementWrapperContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterCommandStatementWrapper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitCommandStatementWrapper(this);
		}
	}
	public static class AssignStatementWrapperContext extends StatementContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public AssignStatementWrapperContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterAssignStatementWrapper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitAssignStatementWrapper(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(53);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new AssignStatementWrapperContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				assignStatement();
				setState(48);
				match(T__0);
				}
				break;
			case T__25:
			case T__26:
				_localctx = new CommandStatementWrapperContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				commandStatement();
				setState(51);
				match(T__0);
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

	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(cTurtle2Parser.VARIABLE, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public CopyStatementContext copyStatement() {
			return getRuleContext(CopyStatementContext.class,0);
		}
		public List<DescriptorContext> descriptor() {
			return getRuleContexts(DescriptorContext.class);
		}
		public DescriptorContext descriptor(int i) {
			return getRuleContext(DescriptorContext.class,i);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(VARIABLE);
			setState(56);
			match(T__1);
			setState(65);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__17:
			case SHAPE:
			case DIGIT:
				{
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(57);
						descriptor();
						}
						} 
					}
					setState(62);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(63);
				object();
				}
				break;
			case VARIABLE:
				{
				setState(64);
				copyStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CopyStatementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(cTurtle2Parser.VARIABLE, 0); }
		public CopyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterCopyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitCopyStatement(this);
		}
	}

	public final CopyStatementContext copyStatement() throws RecognitionException {
		CopyStatementContext _localctx = new CopyStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_copyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(VARIABLE);
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

	public static class DescriptorContext extends ParserRuleContext {
		public DescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptor; }
	 
		public DescriptorContext() { }
		public void copyFrom(DescriptorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CircleRadiusContext extends DescriptorContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CircleRadiusContext(DescriptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterCircleRadius(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitCircleRadius(this);
		}
	}
	public static class LineWidthContext extends DescriptorContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(cTurtle2Parser.VARIABLE, 0); }
		public LineWidthContext(DescriptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterLineWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitLineWidth(this);
		}
	}
	public static class PolygonSideLengthContext extends DescriptorContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PolygonSideLengthContext(DescriptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterPolygonSideLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitPolygonSideLength(this);
		}
	}
	public static class DrawingSpeedContext extends DescriptorContext {
		public SpeedContext speed() {
			return getRuleContext(SpeedContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(cTurtle2Parser.VARIABLE, 0); }
		public DrawingSpeedContext(DescriptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterDrawingSpeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitDrawingSpeed(this);
		}
	}
	public static class FillColorContext extends DescriptorContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(cTurtle2Parser.VARIABLE, 0); }
		public ColorPropertyContext colorProperty() {
			return getRuleContext(ColorPropertyContext.class,0);
		}
		public FillColorContext(DescriptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterFillColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitFillColor(this);
		}
	}
	public static class RectSizeContext extends DescriptorContext {
		public RectangleSizeContext rectangleSize() {
			return getRuleContext(RectangleSizeContext.class,0);
		}
		public RectSizeContext(DescriptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterRectSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitRectSize(this);
		}
	}
	public static class StartingPositionContext extends DescriptorContext {
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(cTurtle2Parser.VARIABLE, 0); }
		public StartingPositionContext(DescriptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterStartingPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitStartingPosition(this);
		}
	}
	public static class LineColorContext extends DescriptorContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(cTurtle2Parser.VARIABLE, 0); }
		public ColorPropertyContext colorProperty() {
			return getRuleContext(ColorPropertyContext.class,0);
		}
		public LineColorContext(DescriptorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterLineColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitLineColor(this);
		}
	}

	public final DescriptorContext descriptor() throws RecognitionException {
		DescriptorContext _localctx = new DescriptorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_descriptor);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new FillColorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__2);
				setState(70);
				match(T__3);
				setState(75);
				switch (_input.LA(1)) {
				case T__12:
				case COLOR:
					{
					setState(71);
					color();
					}
					break;
				case VARIABLE:
					{
					setState(72);
					match(VARIABLE);
					setState(73);
					match(T__0);
					setState(74);
					colorProperty();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new LineColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__5);
				setState(80);
				match(T__3);
				setState(85);
				switch (_input.LA(1)) {
				case T__12:
				case COLOR:
					{
					setState(81);
					color();
					}
					break;
				case VARIABLE:
					{
					setState(82);
					match(VARIABLE);
					setState(83);
					match(T__0);
					setState(84);
					colorProperty();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87);
				match(T__4);
				}
				break;
			case T__6:
				_localctx = new LineWidthContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(T__6);
				setState(90);
				match(T__3);
				setState(95);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(91);
					number();
					}
					break;
				case VARIABLE:
					{
					setState(92);
					match(VARIABLE);
					setState(93);
					match(T__0);
					setState(94);
					match(T__6);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97);
				match(T__4);
				}
				break;
			case T__7:
				_localctx = new StartingPositionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(T__7);
				setState(99);
				match(T__3);
				setState(104);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(100);
					coordinate();
					}
					break;
				case VARIABLE:
					{
					setState(101);
					match(VARIABLE);
					setState(102);
					match(T__0);
					setState(103);
					match(T__7);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106);
				match(T__4);
				}
				break;
			case T__8:
				_localctx = new DrawingSpeedContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				match(T__8);
				setState(108);
				match(T__3);
				setState(113);
				switch (_input.LA(1)) {
				case T__11:
				case DIGIT:
					{
					setState(109);
					speed();
					}
					break;
				case VARIABLE:
					{
					setState(110);
					match(VARIABLE);
					setState(111);
					match(T__0);
					setState(112);
					match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115);
				match(T__4);
				}
				break;
			case DIGIT:
				_localctx = new RectSizeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				rectangleSize();
				setState(117);
				match(T__4);
				}
				break;
			case T__9:
				_localctx = new CircleRadiusContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				match(T__9);
				setState(120);
				match(T__3);
				setState(121);
				number();
				setState(122);
				match(T__4);
				}
				break;
			case T__10:
				_localctx = new PolygonSideLengthContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				match(T__10);
				setState(125);
				match(T__3);
				setState(126);
				number();
				setState(127);
				match(T__4);
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

	public static class ColorPropertyContext extends ParserRuleContext {
		public ColorPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorProperty; }
	 
		public ColorPropertyContext() { }
		public void copyFrom(ColorPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColorPropertyLineColorContext extends ColorPropertyContext {
		public ColorPropertyLineColorContext(ColorPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterColorPropertyLineColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitColorPropertyLineColor(this);
		}
	}
	public static class ColorPropertyFillColorContext extends ColorPropertyContext {
		public ColorPropertyFillColorContext(ColorPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterColorPropertyFillColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitColorPropertyFillColor(this);
		}
	}

	public final ColorPropertyContext colorProperty() throws RecognitionException {
		ColorPropertyContext _localctx = new ColorPropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_colorProperty);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new ColorPropertyFillColorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__2);
				}
				break;
			case T__5:
				_localctx = new ColorPropertyLineColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__5);
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

	public static class SpeedContext extends ParserRuleContext {
		public SpeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed; }
	 
		public SpeedContext() { }
		public void copyFrom(SpeedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpeedInstantaneousContext extends SpeedContext {
		public SpeedInstantaneousContext(SpeedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterSpeedInstantaneous(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitSpeedInstantaneous(this);
		}
	}
	public static class SpeedDigitContext extends SpeedContext {
		public TerminalNode DIGIT() { return getToken(cTurtle2Parser.DIGIT, 0); }
		public SpeedDigitContext(SpeedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterSpeedDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitSpeedDigit(this);
		}
	}

	public final SpeedContext speed() throws RecognitionException {
		SpeedContext _localctx = new SpeedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_speed);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new SpeedInstantaneousContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__11);
				}
				break;
			case DIGIT:
				_localctx = new SpeedDigitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(DIGIT);
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

	public static class ColorContext extends ParserRuleContext {
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
	 
		public ColorContext() { }
		public void copyFrom(ColorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColorRGBContext extends ColorContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ColorRGBContext(ColorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterColorRGB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitColorRGB(this);
		}
	}
	public static class ColorStringContext extends ColorContext {
		public TerminalNode COLOR() { return getToken(cTurtle2Parser.COLOR, 0); }
		public ColorStringContext(ColorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterColorString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitColorString(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_color);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new ColorRGBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__12);
				setState(140);
				number();
				setState(141);
				match(T__4);
				setState(142);
				number();
				setState(143);
				match(T__4);
				setState(144);
				number();
				setState(145);
				match(T__13);
				}
				break;
			case COLOR:
				_localctx = new ColorStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(COLOR);
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

	public static class RectangleSizeContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public RectangleSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rectangleSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterRectangleSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitRectangleSize(this);
		}
	}

	public final RectangleSizeContext rectangleSize() throws RecognitionException {
		RectangleSizeContext _localctx = new RectangleSizeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rectangleSize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			number();
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(152);
			number();
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

	public static class ObjectContext extends ParserRuleContext {
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	 
		public ObjectContext() { }
		public void copyFrom(ObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjectShapeContext extends ObjectContext {
		public TerminalNode SHAPE() { return getToken(cTurtle2Parser.SHAPE, 0); }
		public ObjectShapeContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterObjectShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitObjectShape(this);
		}
	}
	public static class ObjectPolygonContext extends ObjectContext {
		public PolygonContext polygon() {
			return getRuleContext(PolygonContext.class,0);
		}
		public ObjectPolygonContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterObjectPolygon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitObjectPolygon(this);
		}
	}
	public static class ObjectCoordinateContext extends ObjectContext {
		public List<CoordinateContext> coordinate() {
			return getRuleContexts(CoordinateContext.class);
		}
		public CoordinateContext coordinate(int i) {
			return getRuleContext(CoordinateContext.class,i);
		}
		public ObjectCoordinateContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterObjectCoordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitObjectCoordinate(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_object);
		try {
			int _alt;
			setState(174);
			switch (_input.LA(1)) {
			case T__17:
				_localctx = new ObjectCoordinateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__17);
				setState(170);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(155);
					match(T__18);
					setState(156);
					coordinate();
					}
					break;
				case T__19:
					{
					setState(157);
					match(T__19);
					{
					setState(158);
					match(T__20);
					setState(164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(159);
							coordinate();
							setState(160);
							match(T__4);
							}
							} 
						}
						setState(166);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					setState(167);
					coordinate();
					setState(168);
					match(T__21);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SHAPE:
				_localctx = new ObjectShapeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(SHAPE);
				}
				break;
			case DIGIT:
				_localctx = new ObjectPolygonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				polygon();
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

	public static class CoordinateContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public NegativeXContext negativeX() {
			return getRuleContext(NegativeXContext.class,0);
		}
		public NegativeYContext negativeY() {
			return getRuleContext(NegativeYContext.class,0);
		}
		public CoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterCoordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitCoordinate(this);
		}
	}

	public final CoordinateContext coordinate() throws RecognitionException {
		CoordinateContext _localctx = new CoordinateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_coordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__22);
			setState(178);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(177);
				negativeX();
				}
			}

			setState(180);
			number();
			setState(181);
			match(T__4);
			setState(183);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(182);
				negativeY();
				}
			}

			setState(185);
			number();
			setState(186);
			match(T__13);
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

	public static class NegativeXContext extends ParserRuleContext {
		public NegativeXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativeX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterNegativeX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitNegativeX(this);
		}
	}

	public final NegativeXContext negativeX() throws RecognitionException {
		NegativeXContext _localctx = new NegativeXContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_negativeX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__23);
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

	public static class NegativeYContext extends ParserRuleContext {
		public NegativeYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negativeY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterNegativeY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitNegativeY(this);
		}
	}

	public final NegativeYContext negativeY() throws RecognitionException {
		NegativeYContext _localctx = new NegativeYContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_negativeY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__23);
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

	public static class PolygonContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PolygonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polygon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterPolygon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitPolygon(this);
		}
	}

	public final PolygonContext polygon() throws RecognitionException {
		PolygonContext _localctx = new PolygonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_polygon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			number();
			setState(193);
			match(T__24);
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(cTurtle2Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(cTurtle2Parser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				match(DIGIT);
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class CommandStatementContext extends ParserRuleContext {
		public DrawStatementContext drawStatement() {
			return getRuleContext(DrawStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public CommandStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterCommandStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitCommandStatement(this);
		}
	}

	public final CommandStatementContext commandStatement() throws RecognitionException {
		CommandStatementContext _localctx = new CommandStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_commandStatement);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				drawStatement();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				deleteStatement();
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

	public static class DrawStatementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(cTurtle2Parser.VARIABLE, 0); }
		public DrawStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterDrawStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitDrawStatement(this);
		}
	}

	public final DrawStatementContext drawStatement() throws RecognitionException {
		DrawStatementContext _localctx = new DrawStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_drawStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__25);
			setState(205);
			match(VARIABLE);
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

	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(cTurtle2Parser.VARIABLE, 0); }
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cTurtle2Listener ) ((cTurtle2Listener)listener).exitDeleteStatement(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__26);
			setState(208);
			match(VARIABLE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00d5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\5\3\5\5"+
		"\5D\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7X\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7k\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7t\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0084\n\7\3\b\3"+
		"\b\5\b\u0088\n\b\3\t\3\t\5\t\u008c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0097\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00a5\n\f\f\f\16\f\u00a8\13\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\f\3\f\5"+
		"\f\u00b1\n\f\3\r\3\r\5\r\u00b5\n\r\3\r\3\r\3\r\5\r\u00ba\n\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\6\21\u00c7\n\21\r\21\16\21"+
		"\u00c8\3\22\3\22\5\22\u00cd\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\2"+
		"\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\3\2\21\23\u00dc"+
		"\2(\3\2\2\2\4/\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\nE\3\2\2\2\f\u0083\3\2"+
		"\2\2\16\u0087\3\2\2\2\20\u008b\3\2\2\2\22\u0096\3\2\2\2\24\u0098\3\2\2"+
		"\2\26\u00b0\3\2\2\2\30\u00b2\3\2\2\2\32\u00be\3\2\2\2\34\u00c0\3\2\2\2"+
		"\36\u00c2\3\2\2\2 \u00c6\3\2\2\2\"\u00cc\3\2\2\2$\u00ce\3\2\2\2&\u00d1"+
		"\3\2\2\2()\5\6\4\2)*\5\4\3\2*\3\3\2\2\2+,\5\6\4\2,-\5\4\3\2-\60\3\2\2"+
		"\2.\60\3\2\2\2/+\3\2\2\2/.\3\2\2\2\60\5\3\2\2\2\61\62\5\b\5\2\62\63\7"+
		"\3\2\2\638\3\2\2\2\64\65\5\"\22\2\65\66\7\3\2\2\668\3\2\2\2\67\61\3\2"+
		"\2\2\67\64\3\2\2\28\7\3\2\2\29:\7!\2\2:C\7\4\2\2;=\5\f\7\2<;\3\2\2\2="+
		"@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AD\5\26\f\2BD\5\n\6\2"+
		"C>\3\2\2\2CB\3\2\2\2D\t\3\2\2\2EF\7!\2\2F\13\3\2\2\2GH\7\5\2\2HM\7\6\2"+
		"\2IN\5\22\n\2JK\7!\2\2KL\7\3\2\2LN\5\16\b\2MI\3\2\2\2MJ\3\2\2\2NO\3\2"+
		"\2\2OP\7\7\2\2P\u0084\3\2\2\2QR\7\b\2\2RW\7\6\2\2SX\5\22\n\2TU\7!\2\2"+
		"UV\7\3\2\2VX\5\16\b\2WS\3\2\2\2WT\3\2\2\2XY\3\2\2\2YZ\7\7\2\2Z\u0084\3"+
		"\2\2\2[\\\7\t\2\2\\a\7\6\2\2]b\5 \21\2^_\7!\2\2_`\7\3\2\2`b\7\t\2\2a]"+
		"\3\2\2\2a^\3\2\2\2bc\3\2\2\2c\u0084\7\7\2\2de\7\n\2\2ej\7\6\2\2fk\5\30"+
		"\r\2gh\7!\2\2hi\7\3\2\2ik\7\n\2\2jf\3\2\2\2jg\3\2\2\2kl\3\2\2\2l\u0084"+
		"\7\7\2\2mn\7\13\2\2ns\7\6\2\2ot\5\20\t\2pq\7!\2\2qr\7\3\2\2rt\7\13\2\2"+
		"so\3\2\2\2sp\3\2\2\2tu\3\2\2\2u\u0084\7\7\2\2vw\5\24\13\2wx\7\7\2\2x\u0084"+
		"\3\2\2\2yz\7\f\2\2z{\7\6\2\2{|\5 \21\2|}\7\7\2\2}\u0084\3\2\2\2~\177\7"+
		"\r\2\2\177\u0080\7\6\2\2\u0080\u0081\5 \21\2\u0081\u0082\7\7\2\2\u0082"+
		"\u0084\3\2\2\2\u0083G\3\2\2\2\u0083Q\3\2\2\2\u0083[\3\2\2\2\u0083d\3\2"+
		"\2\2\u0083m\3\2\2\2\u0083v\3\2\2\2\u0083y\3\2\2\2\u0083~\3\2\2\2\u0084"+
		"\r\3\2\2\2\u0085\u0088\7\5\2\2\u0086\u0088\7\b\2\2\u0087\u0085\3\2\2\2"+
		"\u0087\u0086\3\2\2\2\u0088\17\3\2\2\2\u0089\u008c\7\16\2\2\u008a\u008c"+
		"\7 \2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\21\3\2\2\2\u008d"+
		"\u008e\7\17\2\2\u008e\u008f\5 \21\2\u008f\u0090\7\7\2\2\u0090\u0091\5"+
		" \21\2\u0091\u0092\7\7\2\2\u0092\u0093\5 \21\2\u0093\u0094\7\20\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0097\7\37\2\2\u0096\u008d\3\2\2\2\u0096\u0095\3"+
		"\2\2\2\u0097\23\3\2\2\2\u0098\u0099\5 \21\2\u0099\u009a\t\2\2\2\u009a"+
		"\u009b\5 \21\2\u009b\25\3\2\2\2\u009c\u00ac\7\24\2\2\u009d\u009e\7\25"+
		"\2\2\u009e\u00ad\5\30\r\2\u009f\u00a0\7\26\2\2\u00a0\u00a6\7\27\2\2\u00a1"+
		"\u00a2\5\30\r\2\u00a2\u00a3\7\7\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3"+
		"\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00ab\7"+
		"\30\2\2\u00ab\u00ad\3\2\2\2\u00ac\u009d\3\2\2\2\u00ac\u009f\3\2\2\2\u00ad"+
		"\u00b1\3\2\2\2\u00ae\u00b1\7\36\2\2\u00af\u00b1\5\36\20\2\u00b0\u009c"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\27\3\2\2\2\u00b2"+
		"\u00b4\7\31\2\2\u00b3\u00b5\5\32\16\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b9\7\7\2\2\u00b8"+
		"\u00ba\5\34\17\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb\u00bc\5 \21\2\u00bc\u00bd\7\20\2\2\u00bd\31\3\2\2\2\u00be"+
		"\u00bf\7\32\2\2\u00bf\33\3\2\2\2\u00c0\u00c1\7\32\2\2\u00c1\35\3\2\2\2"+
		"\u00c2\u00c3\5 \21\2\u00c3\u00c4\7\33\2\2\u00c4\37\3\2\2\2\u00c5\u00c7"+
		"\7 \2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9!\3\2\2\2\u00ca\u00cd\5$\23\2\u00cb\u00cd\5&\24\2"+
		"\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd#\3\2\2\2\u00ce\u00cf\7"+
		"\34\2\2\u00cf\u00d0\7!\2\2\u00d0%\3\2\2\2\u00d1\u00d2\7\35\2\2\u00d2\u00d3"+
		"\7!\2\2\u00d3\'\3\2\2\2\26/\67>CMWajs\u0083\u0087\u008b\u0096\u00a6\u00ac"+
		"\u00b0\u00b4\u00b9\u00c8\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}