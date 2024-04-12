// Generated from D:/PLC projects/comp2/comp-phase2/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;

    import main.ast.node.*;
    import main.ast.node.declaration.*;
    import main.ast.node.statement.*;
    import main.ast.node.expression.*;
    import main.ast.node.expression.operators.*;
    import main.ast.node.expression.values.*;
    import main.ast.type.primitiveType.*;
    import main.ast.type.complexType.*;
    import main.ast.type.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class UTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACES=1, SEMICOLON=2, COMMA=3, COLON=4, DOT=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, LBRACK=10, RBRACK=11, PLUS=12, MINUS=13, MULT=14, DIV=15, MOD=16, 
		AND=17, OR=18, NOT=19, BIT_AND=20, BIT_OR=21, BIT_XOR=22, L_SHIFT=23, 
		R_SHIFT=24, BIT_NOT=25, LT=26, GT=27, EQ=28, NEQ=29, INC=30, DEC=31, ASSIGN=32, 
		ADD_ASSIGN=33, SUB_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, MOD_ASSIGN=37, 
		TRY=38, THROW=39, CATCH=40, IF=41, ELSE=42, FOR=43, WHILE=44, BREAK=45, 
		CONTINUE=46, RETURN=47, MAIN=48, ONINIT=49, ONSTART=50, FLOAT=51, DOUBLE=52, 
		STRING=53, BOOL=54, VOID=55, INT=56, BUY=57, SELL=58, ASK=59, BID=60, 
		TIME=61, HIGH=62, LOW=63, DIGITS=64, VOLUME=65, TYPE=66, TEXT=67, OPEN=68, 
		CLOSE=69, TRADE=70, ORDER=71, CANDLE=72, EXCEPTION=73, REFRESH_RATE=74, 
		GET_CANDLE=75, TERMINATE=76, CONNECT=77, OBSERVE=78, PRINT=79, ID=80, 
		INT_LITERAL=81, FLOAT_LITERAL=82, STRING_LITERAL=83, COMMENT=84;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_varDeclaration = 2, RULE_functionDeclaration = 3, 
		RULE_mainDeclaration = 4, RULE_initDeclaration = 5, RULE_startDeclaration = 6, 
		RULE_assignStatement = 7, RULE_ifStatement = 8, RULE_whileStatement = 9, 
		RULE_forStatement = 10, RULE_tryCatchStatement = 11, RULE_continueBreakStatement = 12, 
		RULE_returnStatement = 13, RULE_throwStatement = 14, RULE_functionCall = 15, 
		RULE_methodCall = 16, RULE_identifier = 17, RULE_expression = 18, RULE_value = 19, 
		RULE_numericValue = 20, RULE_primitiveType = 21, RULE_complexType = 22, 
		RULE_allType = 23, RULE_specialFunction = 24, RULE_specialVariable = 25, 
		RULE_specialMethod = 26, RULE_assign = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varDeclaration", "functionDeclaration", "mainDeclaration", 
			"initDeclaration", "startDeclaration", "assignStatement", "ifStatement", 
			"whileStatement", "forStatement", "tryCatchStatement", "continueBreakStatement", 
			"returnStatement", "throwStatement", "functionCall", "methodCall", "identifier", 
			"expression", "value", "numericValue", "primitiveType", "complexType", 
			"allType", "specialFunction", "specialVariable", "specialMethod", "assign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "','", "':'", "'.'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'&'", 
			"'|'", "'^'", "'<<'", "'>>'", "'~'", "'<'", "'>'", "'=='", "'!='", "'++'", 
			"'--'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'try'", "'throw'", 
			"'catch'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", 
			"'return'", "'Main'", "'OnInit'", "'OnStart'", "'float'", "'double'", 
			"'string'", "'bool'", "'void'", "'int'", "'BUY'", "'SELL'", "'Ask'", 
			"'Bid'", "'Time'", "'High'", "'Low'", "'Digits'", "'Volume'", "'Type'", 
			"'Text'", "'Open'", "'Close'", "'Trade'", "'Order'", "'Candle'", "'Exception'", 
			"'RefreshRate'", "'GetCandle'", "'Terminate'", "'Connect'", "'Observe'", 
			"'Print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACES", "SEMICOLON", "COMMA", "COLON", "DOT", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "AND", "OR", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "L_SHIFT", 
			"R_SHIFT", "BIT_NOT", "LT", "GT", "EQ", "NEQ", "INC", "DEC", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"TRY", "THROW", "CATCH", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", 
			"RETURN", "MAIN", "ONINIT", "ONSTART", "FLOAT", "DOUBLE", "STRING", "BOOL", 
			"VOID", "INT", "BUY", "SELL", "ASK", "BID", "TIME", "HIGH", "LOW", "DIGITS", 
			"VOLUME", "TYPE", "TEXT", "OPEN", "CLOSE", "TRADE", "ORDER", "CANDLE", 
			"EXCEPTION", "REFRESH_RATE", "GET_CANDLE", "TERMINATE", "CONNECT", "OBSERVE", 
			"PRINT", "ID", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "COMMENT"
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
	public String getGrammarFileName() { return "UTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program pro;
		public VarDeclarationContext varDeclaration;
		public FunctionDeclarationContext functionDeclaration;
		public InitDeclarationContext initDeclaration;
		public StartDeclarationContext startDeclaration;
		public MainDeclarationContext mainDeclaration;
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<InitDeclarationContext> initDeclaration() {
			return getRuleContexts(InitDeclarationContext.class);
		}
		public InitDeclarationContext initDeclaration(int i) {
			return getRuleContext(InitDeclarationContext.class,i);
		}
		public List<StartDeclarationContext> startDeclaration() {
			return getRuleContexts(StartDeclarationContext.class);
		}
		public StartDeclarationContext startDeclaration(int i) {
			return getRuleContext(StartDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).pro =  new Program(); _localctx.pro.setLine(0);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(57);
						((ProgramContext)_localctx).varDeclaration = varDeclaration();
						 _localctx.pro.addVar(((ProgramContext)_localctx).varDeclaration.varDecRet); 
						}
						break;
					case 2:
						{
						setState(60);
						((ProgramContext)_localctx).functionDeclaration = functionDeclaration();
						 _localctx.pro.addFunction(((ProgramContext)_localctx).functionDeclaration.funcDecRet); 
						}
						break;
					case 3:
						{
						setState(63);
						((ProgramContext)_localctx).initDeclaration = initDeclaration();
						 _localctx.pro.addInit(((ProgramContext)_localctx).initDeclaration.init); 
						}
						break;
					case 4:
						{
						setState(66);
						((ProgramContext)_localctx).startDeclaration = startDeclaration();
						 _localctx.pro.addStart(((ProgramContext)_localctx).startDeclaration.start); 
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(74);
			((ProgramContext)_localctx).mainDeclaration = mainDeclaration();
			 _localctx.pro.setMain(((ProgramContext)_localctx).mainDeclaration.main); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement statementRet;
		public VarDeclarationContext varDeclaration;
		public FunctionDeclarationContext functionDeclaration;
		public AssignStatementContext assignStatement;
		public ContinueBreakStatementContext continueBreakStatement;
		public ReturnStatementContext returnStatement;
		public IfStatementContext ifStatement;
		public WhileStatementContext whileStatement;
		public ForStatementContext forStatement;
		public TryCatchStatementContext tryCatchStatement;
		public ThrowStatementContext throwStatement;
		public ExpressionContext expression;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(77);
				((StatementContext)_localctx).varDeclaration = varDeclaration();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).varDeclaration.varDecRet; 
				}
				break;
			case 2:
				{
				setState(80);
				((StatementContext)_localctx).functionDeclaration = functionDeclaration();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).functionDeclaration.funcDecRet; 
				}
				break;
			case 3:
				{
				setState(83);
				((StatementContext)_localctx).assignStatement = assignStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).assignStatement.assignStmtRet; 
				}
				break;
			case 4:
				{
				setState(86);
				((StatementContext)_localctx).continueBreakStatement = continueBreakStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).continueBreakStatement.continueBreakStmtRet; 
				}
				break;
			case 5:
				{
				setState(89);
				((StatementContext)_localctx).returnStatement = returnStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).returnStatement.returnStmtRet; 
				}
				break;
			case 6:
				{
				setState(92);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).ifStatement.ifStmtRet; 
				}
				break;
			case 7:
				{
				setState(95);
				((StatementContext)_localctx).whileStatement = whileStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).whileStatement.whileStmtRet; 
				}
				break;
			case 8:
				{
				setState(98);
				((StatementContext)_localctx).forStatement = forStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).forStatement.forStmtRet; 
				}
				break;
			case 9:
				{
				setState(101);
				((StatementContext)_localctx).tryCatchStatement = tryCatchStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).tryCatchStatement.tryCatchStmtRet; 
				}
				break;
			case 10:
				{
				setState(104);
				((StatementContext)_localctx).throwStatement = throwStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).throwStatement.throwStmtRet; 
				}
				break;
			case 11:
				{
				setState(107);
				((StatementContext)_localctx).expression = expression(0);
				setState(108);
				match(SEMICOLON);
				 ((StatementContext)_localctx).statementRet =  new ExpressionStmt(((StatementContext)_localctx).expression.expressionRet); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration varDecRet;
		public AllTypeContext allType;
		public Token INT_LITERAL;
		public IdentifierContext iden;
		public ExpressionContext exp;
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((VarDeclarationContext)_localctx).varDecRet =  new VarDeclaration(); 
			setState(114);
			((VarDeclarationContext)_localctx).allType = allType();
			 _localctx.varDecRet.setType(((VarDeclarationContext)_localctx).allType.allTypeRet); 
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(116);
				match(LBRACK);
				setState(117);
				((VarDeclarationContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(118);
				match(RBRACK);
				 _localctx.varDecRet.setLength((((VarDeclarationContext)_localctx).INT_LITERAL!=null?Integer.valueOf(((VarDeclarationContext)_localctx).INT_LITERAL.getText()):0)); 
				}
			}

			setState(122);
			((VarDeclarationContext)_localctx).iden = identifier();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(123);
				match(ASSIGN);
				setState(124);
				((VarDeclarationContext)_localctx).exp = expression(0);
				 _localctx.varDecRet.setValue(((VarDeclarationContext)_localctx).exp.expressionRet);
				}
			}

			setState(129);
			match(SEMICOLON);

			        _localctx.varDecRet.setIdentifier(((VarDeclarationContext)_localctx).iden.identifierRet);
			        _localctx.varDecRet.setLine(((VarDeclarationContext)_localctx).iden.identifierRet.getLine());
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration funcDecRet;
		public PrimitiveTypeContext primitiveType;
		public IdentifierContext iden;
		public AllTypeContext allType;
		public Token INT_LITERAL;
		public IdentifierContext iden2;
		public StatementContext statement;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<AllTypeContext> allType() {
			return getRuleContexts(AllTypeContext.class);
		}
		public AllTypeContext allType(int i) {
			return getRuleContext(AllTypeContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(UTLParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(UTLParser.LBRACK, i);
		}
		public List<TerminalNode> INT_LITERAL() { return getTokens(UTLParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(UTLParser.INT_LITERAL, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(UTLParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(UTLParser.RBRACK, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionDeclarationContext)_localctx).funcDecRet =  new FunctionDeclaration(); 
			setState(133);
			((FunctionDeclarationContext)_localctx).primitiveType = primitiveType();
			 _localctx.funcDecRet.setReturnType(((FunctionDeclarationContext)_localctx).primitiveType.primitiveTypeRet); 
			setState(135);
			((FunctionDeclarationContext)_localctx).iden = identifier();
			 _localctx.funcDecRet.setName(((FunctionDeclarationContext)_localctx).iden.identifierRet); _localctx.funcDecRet.setLine(((FunctionDeclarationContext)_localctx).iden.identifierRet.getLine()); 
			setState(137);
			match(LPAREN);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 7864383L) != 0)) {
				{
				setState(138);
				((FunctionDeclarationContext)_localctx).allType = allType();
				 VarDeclaration arg = new VarDeclaration(); 
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(140);
					match(LBRACK);
					setState(141);
					((FunctionDeclarationContext)_localctx).INT_LITERAL = match(INT_LITERAL);
					setState(142);
					match(RBRACK);
					 arg.setLength((((FunctionDeclarationContext)_localctx).INT_LITERAL!=null?Integer.valueOf(((FunctionDeclarationContext)_localctx).INT_LITERAL.getText()):0)); 
					}
				}

				setState(146);
				((FunctionDeclarationContext)_localctx).iden2 = identifier();

				        arg.setType(((FunctionDeclarationContext)_localctx).allType.allTypeRet);
				        arg.setIdentifier(((FunctionDeclarationContext)_localctx).iden2.identifierRet);
				        arg.setLine(((FunctionDeclarationContext)_localctx).iden2.identifierRet.getLine());
				        _localctx.funcDecRet.addArg(arg);
				    
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(148);
					match(COMMA);
					setState(149);
					((FunctionDeclarationContext)_localctx).allType = allType();
					 arg = new VarDeclaration(); 
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACK) {
						{
						setState(151);
						match(LBRACK);
						setState(152);
						((FunctionDeclarationContext)_localctx).INT_LITERAL = match(INT_LITERAL);
						setState(153);
						match(RBRACK);
						 arg.setLength((((FunctionDeclarationContext)_localctx).INT_LITERAL!=null?Integer.valueOf(((FunctionDeclarationContext)_localctx).INT_LITERAL.getText()):0)); 
						}
					}

					setState(157);
					((FunctionDeclarationContext)_localctx).iden2 = identifier();

					        arg.setType(((FunctionDeclarationContext)_localctx).allType.allTypeRet);
					        arg.setIdentifier(((FunctionDeclarationContext)_localctx).iden2.identifierRet);
					        _localctx.funcDecRet.addArg(arg);
					    
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(167);
			match(RPAREN);
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(168);
				match(THROW);
				setState(169);
				match(EXCEPTION);
				}
				break;
			}
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(172);
				match(LBRACE);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(173);
					((FunctionDeclarationContext)_localctx).statement = statement();
					 _localctx.funcDecRet.addStatement(((FunctionDeclarationContext)_localctx).statement.statementRet); 
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(182);
				((FunctionDeclarationContext)_localctx).statement = statement();
				 _localctx.funcDecRet.addStatement(((FunctionDeclarationContext)_localctx).statement.statementRet); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainDeclarationContext extends ParserRuleContext {
		public MainDeclaration main;
		public Token m;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode MAIN() { return getToken(UTLParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Statement> mainStmts = new ArrayList<>(); ((MainDeclarationContext)_localctx).main =  new MainDeclaration();
			setState(188);
			match(VOID);
			setState(189);
			((MainDeclarationContext)_localctx).m = match(MAIN);
			setState(190);
			match(LPAREN);
			setState(191);
			match(RPAREN);
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(192);
				match(LBRACE);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(193);
					((MainDeclarationContext)_localctx).s1 = statement();

					        if (((MainDeclarationContext)_localctx).s1.statementRet instanceof VarDeclaration)
					        {
					           if (((MainDeclarationContext)_localctx).s1.statementRet.getType() instanceof TradeType)
					           {
					                VarDeclaration tradeDec = new VarDeclaration();
					                tradeDec.setIdentifier(((MainDeclarationContext)_localctx).s1.statementRet.getIdentifier());
					                tradeDec.setType(((MainDeclarationContext)_localctx).s1.statementRet.getType());
					                _localctx.main.addTradeInstantiation(tradeDec);
					           }
					           mainStmts.add(((MainDeclarationContext)_localctx).s1.statementRet);
					    }
					    else
					       mainStmts.add(((MainDeclarationContext)_localctx).s1.statementRet);
					    
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				{
				setState(202);
				((MainDeclarationContext)_localctx).s2 = statement();

				        if (((MainDeclarationContext)_localctx).s2.statementRet instanceof VarDeclaration)
				        {
				           if (((MainDeclarationContext)_localctx).s2.statementRet.getType() instanceof TradeType)
				           {
				                VarDeclaration tradeDec = new VarDeclaration();
				                tradeDec.setIdentifier(((MainDeclarationContext)_localctx).s2.statementRet.getIdentifier());
				                tradeDec.setType(((MainDeclarationContext)_localctx).s2.statementRet.getType());
				                _localctx.main.addTradeInstantiation(tradeDec);
				           }
				           mainStmts.add(((MainDeclarationContext)_localctx).s2.statementRet);
				    }
				    else
				       mainStmts.add(((MainDeclarationContext)_localctx).s2.statementRet);
				    
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        _localctx.main.setBody(mainStmts);
			        _localctx.main.setLine(((MainDeclarationContext)_localctx).m.getLine());
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclarationContext extends ParserRuleContext {
		public OnInitDeclaration init;
		public Token m;
		public IdentifierContext t;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode ONINIT() { return getToken(UTLParser.ONINIT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InitDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterInitDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitInitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitInitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclarationContext initDeclaration() throws RecognitionException {
		InitDeclarationContext _localctx = new InitDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Statement> onInitStmts = new ArrayList<>();
			setState(210);
			match(VOID);
			setState(211);
			((InitDeclarationContext)_localctx).m = match(ONINIT);
			setState(212);
			match(LPAREN);
			setState(213);
			match(TRADE);
			setState(214);
			((InitDeclarationContext)_localctx).t = identifier();
			setState(215);
			match(RPAREN);
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(216);
				match(THROW);
				setState(217);
				match(EXCEPTION);
				}
				break;
			}
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(220);
				match(LBRACE);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(221);
					((InitDeclarationContext)_localctx).s1 = statement();
					onInitStmts.add(((InitDeclarationContext)_localctx).s1.statementRet);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				{
				setState(230);
				((InitDeclarationContext)_localctx).s2 = statement();
				onInitStmts.add(((InitDeclarationContext)_localctx).s2.statementRet);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        ((InitDeclarationContext)_localctx).init =  new OnInitDeclaration();
			        _localctx.init.setBody(onInitStmts);
			        _localctx.init.setTradeName(((InitDeclarationContext)_localctx).t.identifierRet);
			        _localctx.init.setLine(((InitDeclarationContext)_localctx).m.getLine());
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartDeclarationContext extends ParserRuleContext {
		public OnStartDeclaration start;
		public Token m;
		public IdentifierContext t;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode ONSTART() { return getToken(UTLParser.ONSTART, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStartDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStartDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStartDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartDeclarationContext startDeclaration() throws RecognitionException {
		StartDeclarationContext _localctx = new StartDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_startDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Statement> onStartStmts = new ArrayList<>();
			setState(238);
			match(VOID);
			setState(239);
			((StartDeclarationContext)_localctx).m = match(ONSTART);
			setState(240);
			match(LPAREN);
			setState(241);
			match(TRADE);
			setState(242);
			((StartDeclarationContext)_localctx).t = identifier();
			setState(243);
			match(RPAREN);
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(244);
				match(THROW);
				setState(245);
				match(EXCEPTION);
				}
				break;
			}
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(248);
				match(LBRACE);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(249);
					((StartDeclarationContext)_localctx).s1 = statement();
					onStartStmts.add(((StartDeclarationContext)_localctx).s1.statementRet);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				{
				setState(258);
				((StartDeclarationContext)_localctx).s2 = statement();
				onStartStmts.add(((StartDeclarationContext)_localctx).s2.statementRet);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			            ((StartDeclarationContext)_localctx).start =  new OnStartDeclaration();
			            _localctx.start.setBody(onStartStmts);
			            _localctx.start.setTradeName(((StartDeclarationContext)_localctx).t.identifierRet);
			            _localctx.start.setLine(((StartDeclarationContext)_localctx).m.getLine());
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends ParserRuleContext {
		public AssignStmt assignStmtRet;
		public IdentifierContext lvalue;
		public ExpressionContext exp1;
		public Token line;
		public ExpressionContext rvalue;
		public Token SEMICOLON;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Identifier identifierInstance; ArrayIdentifier arrayIdentifierInstance; boolean isArray = false; 
			setState(266);
			((AssignStatementContext)_localctx).lvalue = identifier();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(267);
				match(LBRACK);
				setState(268);
				((AssignStatementContext)_localctx).exp1 = expression(0);
				setState(269);
				match(RBRACK);

				        isArray = true;
				    
				}
			}

			setState(274);
			((AssignStatementContext)_localctx).line = match(ASSIGN);
			setState(275);
			((AssignStatementContext)_localctx).rvalue = expression(0);
			setState(276);
			((AssignStatementContext)_localctx).SEMICOLON = match(SEMICOLON);

			    if (isArray){
			          arrayIdentifierInstance = new ArrayIdentifier(((AssignStatementContext)_localctx).lvalue.identifierRet.getName(), ((AssignStatementContext)_localctx).exp1.expressionRet);
			          arrayIdentifierInstance.setLine(((AssignStatementContext)_localctx).lvalue.identifierRet.getLine());
			          ((AssignStatementContext)_localctx).assignStmtRet =  new AssignStmt(arrayIdentifierInstance , ((AssignStatementContext)_localctx).rvalue.expressionRet);
			    }
			    else
			    {
			          identifierInstance = new Identifier(((AssignStatementContext)_localctx).lvalue.identifierRet.getName());
			          identifierInstance.setLine(((AssignStatementContext)_localctx).lvalue.identifierRet.getLine());
			          ((AssignStatementContext)_localctx).assignStmtRet =  new AssignStmt(identifierInstance , ((AssignStatementContext)_localctx).rvalue.expressionRet);
			    }
			    

			        _localctx.assignStmtRet.setLine((((AssignStatementContext)_localctx).SEMICOLON!=null?((AssignStatementContext)_localctx).SEMICOLON.getLine():0));
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfElseStmt ifStmtRet;
		public Token IF;
		public ExpressionContext exp;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode IF() { return getToken(UTLParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(UTLParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(281);
			match(LPAREN);
			{
			setState(282);
			((IfStatementContext)_localctx).exp = expression(0);

			        ((IfStatementContext)_localctx).ifStmtRet =  new IfElseStmt(((IfStatementContext)_localctx).exp.expressionRet);
			        _localctx.ifStmtRet.setLine(((IfStatementContext)_localctx).IF.getLine());
			    
			}
			setState(285);
			match(RPAREN);
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(286);
				match(LBRACE);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(287);
					((IfStatementContext)_localctx).s1 = statement();
					_localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).s1.statementRet);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(296);
				((IfStatementContext)_localctx).s2 = statement();
				_localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).s2.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(301);
				match(ELSE);
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(302);
					match(LBRACE);
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
						{
						{
						setState(303);
						((IfStatementContext)_localctx).s1 = statement();
						_localctx.ifStmtRet.addElseStatement(((IfStatementContext)_localctx).s1.statementRet);
						}
						}
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(311);
					match(RBRACE);
					}
					break;
				case LPAREN:
				case MINUS:
				case NOT:
				case BIT_NOT:
				case INC:
				case DEC:
				case TRY:
				case THROW:
				case IF:
				case FOR:
				case WHILE:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
				case VOID:
				case INT:
				case BUY:
				case SELL:
				case TRADE:
				case ORDER:
				case CANDLE:
				case EXCEPTION:
				case REFRESH_RATE:
				case GET_CANDLE:
				case TERMINATE:
				case CONNECT:
				case OBSERVE:
				case PRINT:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case STRING_LITERAL:
					{
					{
					setState(312);
					((IfStatementContext)_localctx).s2 = statement();
					_localctx.ifStmtRet.addElseStatement(((IfStatementContext)_localctx).s2.statementRet);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStmt whileStmtRet;
		public Token WHILE;
		public ExpressionContext exp;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode WHILE() { return getToken(UTLParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			((WhileStatementContext)_localctx).WHILE = match(WHILE);
			setState(320);
			match(LPAREN);
			{
			setState(321);
			((WhileStatementContext)_localctx).exp = expression(0);

			        ((WhileStatementContext)_localctx).whileStmtRet =  new WhileStmt(((WhileStatementContext)_localctx).exp.expressionRet);
			        _localctx.whileStmtRet.setLine(((WhileStatementContext)_localctx).WHILE.getLine());
			    
			}
			setState(324);
			match(RPAREN);
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(325);
				match(LBRACE);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(326);
					((WhileStatementContext)_localctx).s1 = statement();
					_localctx.whileStmtRet.addBody(((WhileStatementContext)_localctx).s1.statementRet);
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				{
				setState(335);
				((WhileStatementContext)_localctx).s2 = statement();
				_localctx.whileStmtRet.addBody(((WhileStatementContext)_localctx).s2.statementRet);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForStmt forStmtRet;
		public Token FOR;
		public StatementContext s1;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public StatementContext s2;
		public StatementContext s3;
		public TerminalNode FOR() { return getToken(UTLParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			((ForStatementContext)_localctx).FOR = match(FOR);
			setState(341);
			match(LPAREN);
			setState(342);
			((ForStatementContext)_localctx).s1 = statement();
			setState(343);
			((ForStatementContext)_localctx).exp1 = expression(0);

			        ((ForStatementContext)_localctx).forStmtRet =  new ForStmt();
			        _localctx.forStmtRet.addInit(((ForStatementContext)_localctx).s1.statementRet);
			        _localctx.forStmtRet.setCondition(((ForStatementContext)_localctx).exp1.expressionRet);
			        _localctx.forStmtRet.setLine(((ForStatementContext)_localctx).FOR.getLine());
			    
			setState(345);
			match(SEMICOLON);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(346);
				((ForStatementContext)_localctx).exp2 = expression(0);
				_localctx.forStmtRet.setUpdate(((ForStatementContext)_localctx).exp2.expressionRet);
				}
			}

			setState(351);
			match(RPAREN);
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(352);
				match(LBRACE);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(353);
					((ForStatementContext)_localctx).s2 = statement();
					_localctx.forStmtRet.addBody(((ForStatementContext)_localctx).s2.statementRet);
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				{
				setState(362);
				((ForStatementContext)_localctx).s3 = statement();
				_localctx.forStmtRet.addBody(((ForStatementContext)_localctx).s3.statementRet);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchStatementContext extends ParserRuleContext {
		public TryCatchStmt tryCatchStmtRet;
		public Token TRY;
		public StatementContext s1;
		public StatementContext s2;
		public StatementContext s3;
		public StatementContext s4;
		public TerminalNode TRY() { return getToken(UTLParser.TRY, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
		public TerminalNode CATCH() { return getToken(UTLParser.CATCH, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			((TryCatchStatementContext)_localctx).TRY = match(TRY);
			((TryCatchStatementContext)_localctx).tryCatchStmtRet =  new TryCatchStmt(); _localctx.tryCatchStmtRet.setLine(((TryCatchStatementContext)_localctx).TRY.getLine()); 
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(369);
				match(LBRACE);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(370);
					((TryCatchStatementContext)_localctx).s1 = statement();
					_localctx.tryCatchStmtRet.addTryStatement(((TryCatchStatementContext)_localctx).s1.statementRet);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				{
				setState(379);
				((TryCatchStatementContext)_localctx).s2 = statement();
				_localctx.tryCatchStmtRet.addTryStatement(((TryCatchStatementContext)_localctx).s2.statementRet);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(384);
				match(CATCH);
				setState(385);
				match(EXCEPTION);
				setState(386);
				match(ID);
				setState(400);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(387);
					match(LBRACE);
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
						{
						{
						setState(388);
						((TryCatchStatementContext)_localctx).s3 = statement();
						_localctx.tryCatchStmtRet.addCatchStatement(((TryCatchStatementContext)_localctx).s3.statementRet);
						}
						}
						setState(395);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(396);
					match(RBRACE);
					}
					break;
				case LPAREN:
				case MINUS:
				case NOT:
				case BIT_NOT:
				case INC:
				case DEC:
				case TRY:
				case THROW:
				case IF:
				case FOR:
				case WHILE:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
				case VOID:
				case INT:
				case BUY:
				case SELL:
				case TRADE:
				case ORDER:
				case CANDLE:
				case EXCEPTION:
				case REFRESH_RATE:
				case GET_CANDLE:
				case TERMINATE:
				case CONNECT:
				case OBSERVE:
				case PRINT:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case STRING_LITERAL:
					{
					{
					setState(397);
					((TryCatchStatementContext)_localctx).s4 = statement();
					_localctx.tryCatchStmtRet.addCatchStatement(((TryCatchStatementContext)_localctx).s4.statementRet);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueBreakStatementContext extends ParserRuleContext {
		public ContinueBreakStmt continueBreakStmtRet;
		public Token BREAK;
		public Token CONTINUE;
		public Token SEMICOLON;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(UTLParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(UTLParser.CONTINUE, 0); }
		public ContinueBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterContinueBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitContinueBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitContinueBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakStatementContext continueBreakStatement() throws RecognitionException {
		ContinueBreakStatementContext _localctx = new ContinueBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_continueBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(404);
				((ContinueBreakStatementContext)_localctx).BREAK = match(BREAK);
				((ContinueBreakStatementContext)_localctx).continueBreakStmtRet =  new ContinueBreakStmt((((ContinueBreakStatementContext)_localctx).BREAK!=null?((ContinueBreakStatementContext)_localctx).BREAK.getText():null));
				}
				break;
			case CONTINUE:
				{
				setState(406);
				((ContinueBreakStatementContext)_localctx).CONTINUE = match(CONTINUE);
				((ContinueBreakStatementContext)_localctx).continueBreakStmtRet =  new ContinueBreakStmt((((ContinueBreakStatementContext)_localctx).CONTINUE!=null?((ContinueBreakStatementContext)_localctx).CONTINUE.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(410);
			((ContinueBreakStatementContext)_localctx).SEMICOLON = match(SEMICOLON);
			_localctx.continueBreakStmtRet.setLine((((ContinueBreakStatementContext)_localctx).SEMICOLON!=null?((ContinueBreakStatementContext)_localctx).SEMICOLON.getLine():0));
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStmtRet;
		public Token RETURN;
		public ExpressionContext exp;
		public TerminalNode RETURN() { return getToken(UTLParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			setState(414);
			((ReturnStatementContext)_localctx).exp = expression(0);
			((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStmt(((ReturnStatementContext)_localctx).exp.expressionRet);
			setState(416);
			match(SEMICOLON);
			_localctx.returnStmtRet.setLine(((ReturnStatementContext)_localctx).RETURN.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStmt throwStmtRet;
		public Token THROW;
		public ExpressionContext exp;
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			((ThrowStatementContext)_localctx).THROW = match(THROW);
			setState(420);
			((ThrowStatementContext)_localctx).exp = expression(0);
			((ThrowStatementContext)_localctx).throwStmtRet =  new ThrowStmt(((ThrowStatementContext)_localctx).exp.expressionRet);
			setState(422);
			match(SEMICOLON);
			_localctx.throwStmtRet.setLine(((ThrowStatementContext)_localctx).THROW.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCall functionCallRet;
		public SpecialFunctionContext specialFunc;
		public ComplexTypeContext complexTypeRef;
		public IdentifierContext iden;
		public Token LPAREN;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public SpecialFunctionContext specialFunction() {
			return getRuleContext(SpecialFunctionContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Identifier functionName; 
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
				{
				setState(426);
				((FunctionCallContext)_localctx).specialFunc = specialFunction();
				  functionName = new Identifier((((FunctionCallContext)_localctx).specialFunc!=null?_input.getText(((FunctionCallContext)_localctx).specialFunc.start,((FunctionCallContext)_localctx).specialFunc.stop):null)); functionName.setLine((((FunctionCallContext)_localctx).specialFunc!=null?(((FunctionCallContext)_localctx).specialFunc.start):null).getLine()); 
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				{
				setState(429);
				((FunctionCallContext)_localctx).complexTypeRef = complexType();
				 functionName = new Identifier((((FunctionCallContext)_localctx).complexTypeRef!=null?_input.getText(((FunctionCallContext)_localctx).complexTypeRef.start,((FunctionCallContext)_localctx).complexTypeRef.stop):null)); functionName.setLine((((FunctionCallContext)_localctx).complexTypeRef!=null?(((FunctionCallContext)_localctx).complexTypeRef.start):null).getLine()); 
				}
				break;
			case ID:
				{
				setState(432);
				((FunctionCallContext)_localctx).iden = identifier();
				 functionName = ((FunctionCallContext)_localctx).iden.identifierRet; functionName.setLine(((FunctionCallContext)_localctx).iden.identifierRet.getLine()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((FunctionCallContext)_localctx).functionCallRet =  new FunctionCall(functionName); 
			setState(438);
			((FunctionCallContext)_localctx).LPAREN = match(LPAREN);
			 _localctx.functionCallRet.setLine((((FunctionCallContext)_localctx).LPAREN!=null?((FunctionCallContext)_localctx).LPAREN.getLine():0)); 
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(440);
				((FunctionCallContext)_localctx).exp1 = expression(0);
				 _localctx.functionCallRet.addArg(((FunctionCallContext)_localctx).exp1.expressionRet); 
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(442);
					match(COMMA);
					setState(443);
					((FunctionCallContext)_localctx).exp2 = expression(0);
					 _localctx.functionCallRet.addArg(((FunctionCallContext)_localctx).exp2.expressionRet); 
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(453);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public MethodCall methodCallRet;
		public IdentifierContext id;
		public ExpressionContext exp1;
		public SpecialMethodContext sm;
		public ExpressionContext exp2;
		public ExpressionContext exp3;
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SpecialMethodContext specialMethod() {
			return getRuleContext(SpecialMethodContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Identifier identifierIns; ArrayIdentifier arrayIdentifierIns; boolean isArray = false; 
			setState(456);
			((MethodCallContext)_localctx).id = identifier();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(457);
				match(LBRACK);
				setState(458);
				((MethodCallContext)_localctx).exp1 = expression(0);
				setState(459);
				match(RBRACK);

				        isArray = true;
				    
				}
			}

			setState(464);
			match(DOT);
			setState(465);
			((MethodCallContext)_localctx).sm = specialMethod();

			      Identifier methodName = new Identifier((((MethodCallContext)_localctx).sm!=null?_input.getText(((MethodCallContext)_localctx).sm.start,((MethodCallContext)_localctx).sm.stop):null));
			      methodName.setLine((((MethodCallContext)_localctx).sm!=null?(((MethodCallContext)_localctx).sm.start):null).getLine());
			      if (isArray){
			            arrayIdentifierIns = new ArrayIdentifier(((MethodCallContext)_localctx).id.identifierRet.getName(), ((MethodCallContext)_localctx).exp1.expressionRet);
			            arrayIdentifierIns.setLine(((MethodCallContext)_localctx).id.identifierRet.getLine());
			            ((MethodCallContext)_localctx).methodCallRet =  new MethodCall(arrayIdentifierIns, methodName);
			      }
			      else{
			            identifierIns = new Identifier(((MethodCallContext)_localctx).id.identifierRet.getName());
			            identifierIns.setLine(((MethodCallContext)_localctx).id.identifierRet.getLine());
			            ((MethodCallContext)_localctx).methodCallRet =  new MethodCall(identifierIns, methodName);
			       }
			      _localctx.methodCallRet.setLine(((MethodCallContext)_localctx).id.identifierRet.getLine());
			    
			setState(467);
			match(LPAREN);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(468);
				((MethodCallContext)_localctx).exp2 = expression(0);
				 _localctx.methodCallRet.addArg(((MethodCallContext)_localctx).exp2.expressionRet); 
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(470);
					match(COMMA);
					setState(471);
					((MethodCallContext)_localctx).exp3 = expression(0);
					 _localctx.methodCallRet.addArg(((MethodCallContext)_localctx).exp3.expressionRet); 
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(481);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public Token iden;
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			((IdentifierContext)_localctx).iden = match(ID);
			((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).iden!=null?((IdentifierContext)_localctx).iden.getText():null)); _localctx.identifierRet.setLine(((IdentifierContext)_localctx).iden.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public ExpressionContext e;
		public ExpressionContext left;
		public ValueContext value;
		public Token opr;
		public Token ID;
		public Token LPAREN;
		public FunctionCallContext functionCall;
		public MethodCallContext methodCall;
		public ExpressionContext right;
		public Token AND;
		public Token OR;
		public SpecialVariableContext sv;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(UTLParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(UTLParser.MINUS, 0); }
		public TerminalNode BIT_NOT() { return getToken(UTLParser.BIT_NOT, 0); }
		public TerminalNode INC() { return getToken(UTLParser.INC, 0); }
		public TerminalNode DEC() { return getToken(UTLParser.DEC, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode MULT() { return getToken(UTLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(UTLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(UTLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(UTLParser.PLUS, 0); }
		public TerminalNode L_SHIFT() { return getToken(UTLParser.L_SHIFT, 0); }
		public TerminalNode R_SHIFT() { return getToken(UTLParser.R_SHIFT, 0); }
		public TerminalNode LT() { return getToken(UTLParser.LT, 0); }
		public TerminalNode GT() { return getToken(UTLParser.GT, 0); }
		public TerminalNode EQ() { return getToken(UTLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(UTLParser.NEQ, 0); }
		public TerminalNode BIT_AND() { return getToken(UTLParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(UTLParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(UTLParser.BIT_XOR, 0); }
		public TerminalNode AND() { return getToken(UTLParser.AND, 0); }
		public TerminalNode OR() { return getToken(UTLParser.OR, 0); }
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public SpecialVariableContext specialVariable() {
			return getRuleContext(SpecialVariableContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(487);
				((ExpressionContext)_localctx).value = value();
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).value.valueRet; 
				}
				break;
			case 2:
				{
				setState(490);
				((ExpressionContext)_localctx).opr = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3255312384L) != 0)) ) {
					((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(491);
				((ExpressionContext)_localctx).e = expression(14);
				((ExpressionContext)_localctx).expressionRet =  new UnaryExpression();
				    ((UnaryExpression) _localctx.expressionRet).setOperand(((ExpressionContext)_localctx).e.expressionRet);
				    ((UnaryExpression) _localctx.expressionRet).setUnaryOperator((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null)); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getLine():0));
				}
				break;
			case 3:
				{
				setState(494);
				((ExpressionContext)_localctx).ID = match(ID);
				{
				setState(495);
				match(LBRACK);
				setState(496);
				((ExpressionContext)_localctx).e = expression(0);
				setState(497);
				match(RBRACK);
				}
				((ExpressionContext)_localctx).expressionRet =  new ArrayIdentifier ((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e.expressionRet); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getLine():0));
				}
				break;
			case 4:
				{
				setState(501);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).expressionRet =  new Identifier ((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getLine():0));
				}
				break;
			case 5:
				{
				setState(503);
				((ExpressionContext)_localctx).LPAREN = match(LPAREN);
				setState(504);
				((ExpressionContext)_localctx).e = expression(0);
				setState(505);
				match(RPAREN);
				((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).e.expressionRet; _localctx.expressionRet.setLine((((ExpressionContext)_localctx).LPAREN!=null?((ExpressionContext)_localctx).LPAREN.getLine():0)); 
				}
				break;
			case 6:
				{
				setState(508);
				((ExpressionContext)_localctx).functionCall = functionCall();
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).functionCall.functionCallRet; 
				}
				break;
			case 7:
				{
				setState(511);
				((ExpressionContext)_localctx).methodCall = methodCall();
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).methodCall.methodCallRet; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(580);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(516);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(); ((BinaryExpression) _localctx.expressionRet).setLeft(((ExpressionContext)_localctx).left.expressionRet); 
						setState(518);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((BinaryExpression) _localctx.expressionRet).setBinaryOperator ((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null)); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getLine():0));
						setState(520);
						((ExpressionContext)_localctx).right = expression(14);
						((BinaryExpression) _localctx.expressionRet).setRight (((ExpressionContext)_localctx).right.expressionRet); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getLine():0)); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(523);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(); ((BinaryExpression) _localctx.expressionRet).setLeft(((ExpressionContext)_localctx).left.expressionRet); 
						setState(525);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((BinaryExpression) _localctx.expressionRet).setBinaryOperator((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null)); 
						setState(527);
						((ExpressionContext)_localctx).right = expression(13);
						((BinaryExpression) _localctx.expressionRet).setRight (((ExpressionContext)_localctx).right.expressionRet); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getLine():0)); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(530);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(); ((BinaryExpression) _localctx.expressionRet).setLeft(((ExpressionContext)_localctx).left.expressionRet); 
						setState(532);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==L_SHIFT || _la==R_SHIFT) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((BinaryExpression) _localctx.expressionRet).setBinaryOperator ((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null));
						setState(534);
						((ExpressionContext)_localctx).right = expression(12);
						((BinaryExpression) _localctx.expressionRet).setRight(((ExpressionContext)_localctx).right.expressionRet); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getLine():0)); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(537);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(); ((BinaryExpression) _localctx.expressionRet).setLeft(((ExpressionContext)_localctx).left.expressionRet); 
						setState(539);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LT || _la==GT) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((BinaryExpression) _localctx.expressionRet).setBinaryOperator ((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null)); 
						setState(541);
						((ExpressionContext)_localctx).right = expression(11);
						((BinaryExpression) _localctx.expressionRet).setRight(((ExpressionContext)_localctx).right.expressionRet); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getLine():0));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(544);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(); ((BinaryExpression) _localctx.expressionRet).setLeft(((ExpressionContext)_localctx).left.expressionRet);
						setState(546);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((BinaryExpression) _localctx.expressionRet).setBinaryOperator((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null));
						setState(548);
						((ExpressionContext)_localctx).right = expression(10);
						((BinaryExpression) _localctx.expressionRet).setRight (((ExpressionContext)_localctx).right.expressionRet); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getLine():0)); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(551);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(); ((BinaryExpression) _localctx.expressionRet).setLeft(((ExpressionContext)_localctx).left.expressionRet);
						setState(553);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((BinaryExpression) _localctx.expressionRet).setBinaryOperator ((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null));
						setState(555);
						((ExpressionContext)_localctx).right = expression(9);
						((BinaryExpression) _localctx.expressionRet).setRight (((ExpressionContext)_localctx).right.expressionRet); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getLine():0));
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(558);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(); ((BinaryExpression) _localctx.expressionRet).setLeft(((ExpressionContext)_localctx).left.expressionRet); 
						setState(560);
						((ExpressionContext)_localctx).AND = match(AND);
						((BinaryExpression) _localctx.expressionRet).setBinaryOperator ((((ExpressionContext)_localctx).AND!=null?((ExpressionContext)_localctx).AND.getText():null)); 
						setState(562);
						((ExpressionContext)_localctx).right = expression(8);
						((BinaryExpression) _localctx.expressionRet).setRight (((ExpressionContext)_localctx).right.expressionRet); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).AND!=null?((ExpressionContext)_localctx).AND.getLine():0));
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(565);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(); ((BinaryExpression) _localctx.expressionRet).setLeft (((ExpressionContext)_localctx).left.expressionRet);
						setState(567);
						((ExpressionContext)_localctx).OR = match(OR);
						((BinaryExpression) _localctx.expressionRet).setBinaryOperator ((((ExpressionContext)_localctx).OR!=null?((ExpressionContext)_localctx).OR.getText():null));
						setState(569);
						((ExpressionContext)_localctx).right = expression(7);
						((BinaryExpression) _localctx.expressionRet).setRight(((ExpressionContext)_localctx).right.expressionRet); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).OR!=null?((ExpressionContext)_localctx).OR.getLine():0)); 
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(572);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(573);
						match(DOT);
						setState(574);
						((ExpressionContext)_localctx).sv = specialVariable();
						Identifier varName = new Identifier((((ExpressionContext)_localctx).sv!=null?_input.getText(((ExpressionContext)_localctx).sv.start,((ExpressionContext)_localctx).sv.stop):null)); varName.setLine((((ExpressionContext)_localctx).sv!=null?(((ExpressionContext)_localctx).sv.start):null).getLine()); VarAccess varAccess = new VarAccess (((ExpressionContext)_localctx).e.expressionRet, varName); varAccess.setLine(((ExpressionContext)_localctx).e.expressionRet.getLine()); ((ExpressionContext)_localctx).expressionRet =  varAccess; 
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(577);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(578);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						((ExpressionContext)_localctx).expressionRet =  new UnaryExpression(); ((UnaryExpression) _localctx.expressionRet).setOperand(((ExpressionContext)_localctx).e.expressionRet); ((UnaryExpression) _localctx.expressionRet).setUnaryOperator((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null)); _localctx.expressionRet.setLine((((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getLine():0));
						}
						break;
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public NumericValueContext n1;
		public Token s;
		public Token sell;
		public Token buy;
		public NumericValueContext numericValue() {
			return getRuleContext(NumericValueContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(UTLParser.STRING_LITERAL, 0); }
		public TerminalNode SELL() { return getToken(UTLParser.SELL, 0); }
		public TerminalNode BUY() { return getToken(UTLParser.BUY, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				((ValueContext)_localctx).n1 = numericValue();
				((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).n1.numericValueRet;
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				((ValueContext)_localctx).s = match(STRING_LITERAL);
				((ValueContext)_localctx).valueRet =  new StringValue((((ValueContext)_localctx).s!=null?((ValueContext)_localctx).s.getText():null)); _localctx.valueRet.setLine(((ValueContext)_localctx).s.getLine());
				}
				break;
			case SELL:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				((ValueContext)_localctx).sell = match(SELL);
				((ValueContext)_localctx).valueRet =  new TradeValue((((ValueContext)_localctx).sell!=null?((ValueContext)_localctx).sell.getText():null)); _localctx.valueRet.setLine(((ValueContext)_localctx).sell.getLine());
				}
				break;
			case BUY:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				((ValueContext)_localctx).buy = match(BUY);
				((ValueContext)_localctx).valueRet =  new TradeValue((((ValueContext)_localctx).buy!=null?((ValueContext)_localctx).buy.getText():null)); _localctx.valueRet.setLine(((ValueContext)_localctx).buy.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumericValueContext extends ParserRuleContext {
		public Value numericValueRet;
		public Token i;
		public Token f;
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(UTLParser.FLOAT_LITERAL, 0); }
		public NumericValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterNumericValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitNumericValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitNumericValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericValueContext numericValue() throws RecognitionException {
		NumericValueContext _localctx = new NumericValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numericValue);
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				((NumericValueContext)_localctx).i = match(INT_LITERAL);
				((NumericValueContext)_localctx).numericValueRet =  new IntValue((((NumericValueContext)_localctx).i!=null?Integer.valueOf(((NumericValueContext)_localctx).i.getText()):0)); _localctx.numericValueRet.setLine(((NumericValueContext)_localctx).i.getLine());
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				((NumericValueContext)_localctx).f = match(FLOAT_LITERAL);
				((NumericValueContext)_localctx).numericValueRet =  new FloatValue(Float.parseFloat((((NumericValueContext)_localctx).f!=null?((NumericValueContext)_localctx).f.getText():null))); _localctx.numericValueRet.setLine(((NumericValueContext)_localctx).f.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type primitiveTypeRet;
		public TerminalNode FLOAT() { return getToken(UTLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(UTLParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(UTLParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(UTLParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(UTLParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primitiveType);
		try {
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(FLOAT);
				((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new FloatType();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(DOUBLE);
				((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new DoubleType();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(606);
				match(INT);
				((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new IntType();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(608);
				match(BOOL);
				((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new BoolType();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(610);
				match(STRING);
				((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new StringType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 6);
				{
				setState(612);
				match(VOID);
				((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new VoidType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexTypeContext extends ParserRuleContext {
		public Type complexTypeRet;
		public TerminalNode ORDER() { return getToken(UTLParser.ORDER, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode CANDLE() { return getToken(UTLParser.CANDLE, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitComplexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitComplexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_complexType);
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				match(ORDER);
				((ComplexTypeContext)_localctx).complexTypeRet =  new OrderType();
				}
				break;
			case TRADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				match(TRADE);
				((ComplexTypeContext)_localctx).complexTypeRet =  new TradeType();
				}
				break;
			case CANDLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				match(CANDLE);
				((ComplexTypeContext)_localctx).complexTypeRet =  new CandleType();
				}
				break;
			case EXCEPTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
				match(EXCEPTION);
				((ComplexTypeContext)_localctx).complexTypeRet =  new ExceptionType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AllTypeContext extends ParserRuleContext {
		public Type allTypeRet;
		public PrimitiveTypeContext primitiveType;
		public ComplexTypeContext complexType;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public AllTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAllType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAllType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAllType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllTypeContext allType() throws RecognitionException {
		AllTypeContext _localctx = new AllTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_allType);
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				((AllTypeContext)_localctx).primitiveType = primitiveType();
				((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).primitiveType.primitiveTypeRet;
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				((AllTypeContext)_localctx).complexType = complexType();
				((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).complexType.complexTypeRet;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialFunctionContext extends ParserRuleContext {
		public TerminalNode REFRESH_RATE() { return getToken(UTLParser.REFRESH_RATE, 0); }
		public TerminalNode CONNECT() { return getToken(UTLParser.CONNECT, 0); }
		public TerminalNode OBSERVE() { return getToken(UTLParser.OBSERVE, 0); }
		public TerminalNode GET_CANDLE() { return getToken(UTLParser.GET_CANDLE, 0); }
		public TerminalNode TERMINATE() { return getToken(UTLParser.TERMINATE, 0); }
		public TerminalNode PRINT() { return getToken(UTLParser.PRINT, 0); }
		public SpecialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterSpecialFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitSpecialFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_specialFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialVariableContext extends ParserRuleContext {
		public TerminalNode ASK() { return getToken(UTLParser.ASK, 0); }
		public TerminalNode BID() { return getToken(UTLParser.BID, 0); }
		public TerminalNode TIME() { return getToken(UTLParser.TIME, 0); }
		public TerminalNode HIGH() { return getToken(UTLParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(UTLParser.LOW, 0); }
		public TerminalNode DIGITS() { return getToken(UTLParser.DIGITS, 0); }
		public TerminalNode VOLUME() { return getToken(UTLParser.VOLUME, 0); }
		public TerminalNode TYPE() { return getToken(UTLParser.TYPE, 0); }
		public TerminalNode TEXT() { return getToken(UTLParser.TEXT, 0); }
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public SpecialVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterSpecialVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitSpecialVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitSpecialVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialVariableContext specialVariable() throws RecognitionException {
		SpecialVariableContext _localctx = new SpecialVariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_specialVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 2047L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialMethodContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public SpecialMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterSpecialMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitSpecialMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitSpecialMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialMethodContext specialMethod() throws RecognitionException {
		SpecialMethodContext _localctx = new SpecialMethodContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_specialMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !(_la==OPEN || _la==CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public Token line;
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(UTLParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(UTLParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(UTLParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(UTLParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(UTLParser.MOD_ASSIGN, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assign);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				((AssignContext)_localctx).line = match(ASSIGN);
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				match(ADD_ASSIGN);
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				match(SUB_ASSIGN);
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(643);
				match(MUL_ASSIGN);
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(644);
				match(DIV_ASSIGN);
				}
				break;
			case MOD_ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(645);
				match(MOD_ASSIGN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001T\u0289\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001p\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002y\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0080\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0091\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u009c\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00a1\b\u0003\n\u0003\f\u0003\u00a4\t\u0003\u0003"+
		"\u0003\u00a6\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ab"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00b1"+
		"\b\u0003\n\u0003\f\u0003\u00b4\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00ba\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u00c5\b\u0004\n\u0004\f\u0004\u00c8\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ce\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00db\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00e1\b\u0005\n"+
		"\u0005\f\u0005\u00e4\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00ea\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00f7\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00fd\b\u0006\n\u0006\f\u0006\u0100\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0106\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0111\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u0123\b\b\n\b\f\b\u0126\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u012c\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0133\b\b\n"+
		"\b\f\b\u0136\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u013c\b\b\u0003"+
		"\b\u013e\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u014a\b\t\n\t\f\t\u014d\t\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u0153\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u015e\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0165\b\n\n\n\f\n\u0168\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u016e\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0176\b\u000b\n\u000b"+
		"\f\u000b\u0179\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u017f\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0188\b\u000b\n\u000b"+
		"\f\u000b\u018b\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0191\b\u000b\u0003\u000b\u0193\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0199\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u01b4\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u01bf\b\u000f\n\u000f\f\u000f\u01c2\t\u000f\u0003\u000f\u01c4\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01cf\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u01db\b\u0010\n\u0010"+
		"\f\u0010\u01de\t\u0010\u0003\u0010\u01e0\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0203\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0245\b\u0012\n\u0012\f\u0012\u0248\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0253\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0259\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0267"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0271\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0279"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0287\b\u001b\u0001\u001b\u0000\u0001$\u001c\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.0246\u0000\u000b\u0004\u0000\r\r\u0013\u0013\u0019\u0019"+
		"\u001e\u001f\u0001\u0000\u000e\u0010\u0001\u0000\f\r\u0001\u0000\u0017"+
		"\u0018\u0001\u0000\u001a\u001b\u0001\u0000\u001c\u001d\u0001\u0000\u0014"+
		"\u0016\u0001\u0000\u001e\u001f\u0001\u0000JO\u0001\u0000;E\u0001\u0000"+
		"DE\u02c5\u00008\u0001\u0000\u0000\u0000\u0002o\u0001\u0000\u0000\u0000"+
		"\u0004q\u0001\u0000\u0000\u0000\u0006\u0084\u0001\u0000\u0000\u0000\b"+
		"\u00bb\u0001\u0000\u0000\u0000\n\u00d1\u0001\u0000\u0000\u0000\f\u00ed"+
		"\u0001\u0000\u0000\u0000\u000e\u0109\u0001\u0000\u0000\u0000\u0010\u0118"+
		"\u0001\u0000\u0000\u0000\u0012\u013f\u0001\u0000\u0000\u0000\u0014\u0154"+
		"\u0001\u0000\u0000\u0000\u0016\u016f\u0001\u0000\u0000\u0000\u0018\u0198"+
		"\u0001\u0000\u0000\u0000\u001a\u019d\u0001\u0000\u0000\u0000\u001c\u01a3"+
		"\u0001\u0000\u0000\u0000\u001e\u01a9\u0001\u0000\u0000\u0000 \u01c7\u0001"+
		"\u0000\u0000\u0000\"\u01e3\u0001\u0000\u0000\u0000$\u0202\u0001\u0000"+
		"\u0000\u0000&\u0252\u0001\u0000\u0000\u0000(\u0258\u0001\u0000\u0000\u0000"+
		"*\u0266\u0001\u0000\u0000\u0000,\u0270\u0001\u0000\u0000\u0000.\u0278"+
		"\u0001\u0000\u0000\u00000\u027a\u0001\u0000\u0000\u00002\u027c\u0001\u0000"+
		"\u0000\u00004\u027e\u0001\u0000\u0000\u00006\u0286\u0001\u0000\u0000\u0000"+
		"8G\u0006\u0000\uffff\uffff\u00009:\u0003\u0004\u0002\u0000:;\u0006\u0000"+
		"\uffff\uffff\u0000;F\u0001\u0000\u0000\u0000<=\u0003\u0006\u0003\u0000"+
		"=>\u0006\u0000\uffff\uffff\u0000>F\u0001\u0000\u0000\u0000?@\u0003\n\u0005"+
		"\u0000@A\u0006\u0000\uffff\uffff\u0000AF\u0001\u0000\u0000\u0000BC\u0003"+
		"\f\u0006\u0000CD\u0006\u0000\uffff\uffff\u0000DF\u0001\u0000\u0000\u0000"+
		"E9\u0001\u0000\u0000\u0000E<\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000"+
		"\u0000EB\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JK\u0003\b\u0004\u0000KL\u0006\u0000\uffff\uffff\u0000"+
		"L\u0001\u0001\u0000\u0000\u0000MN\u0003\u0004\u0002\u0000NO\u0006\u0001"+
		"\uffff\uffff\u0000Op\u0001\u0000\u0000\u0000PQ\u0003\u0006\u0003\u0000"+
		"QR\u0006\u0001\uffff\uffff\u0000Rp\u0001\u0000\u0000\u0000ST\u0003\u000e"+
		"\u0007\u0000TU\u0006\u0001\uffff\uffff\u0000Up\u0001\u0000\u0000\u0000"+
		"VW\u0003\u0018\f\u0000WX\u0006\u0001\uffff\uffff\u0000Xp\u0001\u0000\u0000"+
		"\u0000YZ\u0003\u001a\r\u0000Z[\u0006\u0001\uffff\uffff\u0000[p\u0001\u0000"+
		"\u0000\u0000\\]\u0003\u0010\b\u0000]^\u0006\u0001\uffff\uffff\u0000^p"+
		"\u0001\u0000\u0000\u0000_`\u0003\u0012\t\u0000`a\u0006\u0001\uffff\uffff"+
		"\u0000ap\u0001\u0000\u0000\u0000bc\u0003\u0014\n\u0000cd\u0006\u0001\uffff"+
		"\uffff\u0000dp\u0001\u0000\u0000\u0000ef\u0003\u0016\u000b\u0000fg\u0006"+
		"\u0001\uffff\uffff\u0000gp\u0001\u0000\u0000\u0000hi\u0003\u001c\u000e"+
		"\u0000ij\u0006\u0001\uffff\uffff\u0000jp\u0001\u0000\u0000\u0000kl\u0003"+
		"$\u0012\u0000lm\u0005\u0002\u0000\u0000mn\u0006\u0001\uffff\uffff\u0000"+
		"np\u0001\u0000\u0000\u0000oM\u0001\u0000\u0000\u0000oP\u0001\u0000\u0000"+
		"\u0000oS\u0001\u0000\u0000\u0000oV\u0001\u0000\u0000\u0000oY\u0001\u0000"+
		"\u0000\u0000o\\\u0001\u0000\u0000\u0000o_\u0001\u0000\u0000\u0000ob\u0001"+
		"\u0000\u0000\u0000oe\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000\u0000"+
		"ok\u0001\u0000\u0000\u0000p\u0003\u0001\u0000\u0000\u0000qr\u0006\u0002"+
		"\uffff\uffff\u0000rs\u0003.\u0017\u0000sx\u0006\u0002\uffff\uffff\u0000"+
		"tu\u0005\n\u0000\u0000uv\u0005Q\u0000\u0000vw\u0005\u000b\u0000\u0000"+
		"wy\u0006\u0002\uffff\uffff\u0000xt\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z\u007f\u0003\"\u0011\u0000{|\u0005"+
		" \u0000\u0000|}\u0003$\u0012\u0000}~\u0006\u0002\uffff\uffff\u0000~\u0080"+
		"\u0001\u0000\u0000\u0000\u007f{\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\u0002\u0000\u0000\u0082\u0083\u0006\u0002\uffff\uffff\u0000\u0083\u0005"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0006\u0003\uffff\uffff\u0000\u0085"+
		"\u0086\u0003*\u0015\u0000\u0086\u0087\u0006\u0003\uffff\uffff\u0000\u0087"+
		"\u0088\u0003\"\u0011\u0000\u0088\u0089\u0006\u0003\uffff\uffff\u0000\u0089"+
		"\u00a5\u0005\u0006\u0000\u0000\u008a\u008b\u0003.\u0017\u0000\u008b\u0090"+
		"\u0006\u0003\uffff\uffff\u0000\u008c\u008d\u0005\n\u0000\u0000\u008d\u008e"+
		"\u0005Q\u0000\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f\u0091\u0006"+
		"\u0003\uffff\uffff\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0003\"\u0011\u0000\u0093\u00a2\u0006\u0003\uffff\uffff\u0000\u0094\u0095"+
		"\u0005\u0003\u0000\u0000\u0095\u0096\u0003.\u0017\u0000\u0096\u009b\u0006"+
		"\u0003\uffff\uffff\u0000\u0097\u0098\u0005\n\u0000\u0000\u0098\u0099\u0005"+
		"Q\u0000\u0000\u0099\u009a\u0005\u000b\u0000\u0000\u009a\u009c\u0006\u0003"+
		"\uffff\uffff\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0003"+
		"\"\u0011\u0000\u009e\u009f\u0006\u0003\uffff\uffff\u0000\u009f\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a0\u0094\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a5\u008a\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00aa\u0005"+
		"\u0007\u0000\u0000\u00a8\u00a9\u0005\'\u0000\u0000\u00a9\u00ab\u0005I"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u00b9\u0001\u0000\u0000\u0000\u00ac\u00b2\u0005\b\u0000"+
		"\u0000\u00ad\u00ae\u0003\u0002\u0001\u0000\u00ae\u00af\u0006\u0003\uffff"+
		"\uffff\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00ba\u0005\t\u0000"+
		"\u0000\u00b6\u00b7\u0003\u0002\u0001\u0000\u00b7\u00b8\u0006\u0003\uffff"+
		"\uffff\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00ba\u0007\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0006\u0004\uffff\uffff\u0000\u00bc\u00bd\u0005"+
		"7\u0000\u0000\u00bd\u00be\u00050\u0000\u0000\u00be\u00bf\u0005\u0006\u0000"+
		"\u0000\u00bf\u00cd\u0005\u0007\u0000\u0000\u00c0\u00c6\u0005\b\u0000\u0000"+
		"\u00c1\u00c2\u0003\u0002\u0001\u0000\u00c2\u00c3\u0006\u0004\uffff\uffff"+
		"\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ce\u0005\t\u0000\u0000"+
		"\u00ca\u00cb\u0003\u0002\u0001\u0000\u00cb\u00cc\u0006\u0004\uffff\uffff"+
		"\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0006\u0004\uffff\uffff\u0000\u00d0\t\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0006\u0005\uffff\uffff\u0000\u00d2\u00d3\u00057\u0000"+
		"\u0000\u00d3\u00d4\u00051\u0000\u0000\u00d4\u00d5\u0005\u0006\u0000\u0000"+
		"\u00d5\u00d6\u0005F\u0000\u0000\u00d6\u00d7\u0003\"\u0011\u0000\u00d7"+
		"\u00da\u0005\u0007\u0000\u0000\u00d8\u00d9\u0005\'\u0000\u0000\u00d9\u00db"+
		"\u0005I\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00e9\u0001\u0000\u0000\u0000\u00dc\u00e2\u0005"+
		"\b\u0000\u0000\u00dd\u00de\u0003\u0002\u0001\u0000\u00de\u00df\u0006\u0005"+
		"\uffff\uffff\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00ea\u0005"+
		"\t\u0000\u0000\u00e6\u00e7\u0003\u0002\u0001\u0000\u00e7\u00e8\u0006\u0005"+
		"\uffff\uffff\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0006\u0005\uffff\uffff\u0000\u00ec\u000b"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0006\u0006\uffff\uffff\u0000\u00ee"+
		"\u00ef\u00057\u0000\u0000\u00ef\u00f0\u00052\u0000\u0000\u00f0\u00f1\u0005"+
		"\u0006\u0000\u0000\u00f1\u00f2\u0005F\u0000\u0000\u00f2\u00f3\u0003\""+
		"\u0011\u0000\u00f3\u00f6\u0005\u0007\u0000\u0000\u00f4\u00f5\u0005\'\u0000"+
		"\u0000\u00f5\u00f7\u0005I\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u0105\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fe\u0005\b\u0000\u0000\u00f9\u00fa\u0003\u0002\u0001\u0000\u00fa"+
		"\u00fb\u0006\u0006\uffff\uffff\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0101\u0106\u0005\t\u0000\u0000\u0102\u0103\u0003\u0002\u0001\u0000\u0103"+
		"\u0104\u0006\u0006\uffff\uffff\u0000\u0104\u0106\u0001\u0000\u0000\u0000"+
		"\u0105\u00f8\u0001\u0000\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0006\u0006\uffff\uffff"+
		"\u0000\u0108\r\u0001\u0000\u0000\u0000\u0109\u010a\u0006\u0007\uffff\uffff"+
		"\u0000\u010a\u0110\u0003\"\u0011\u0000\u010b\u010c\u0005\n\u0000\u0000"+
		"\u010c\u010d\u0003$\u0012\u0000\u010d\u010e\u0005\u000b\u0000\u0000\u010e"+
		"\u010f\u0006\u0007\uffff\uffff\u0000\u010f\u0111\u0001\u0000\u0000\u0000"+
		"\u0110\u010b\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0005 \u0000\u0000\u0113"+
		"\u0114\u0003$\u0012\u0000\u0114\u0115\u0005\u0002\u0000\u0000\u0115\u0116"+
		"\u0006\u0007\uffff\uffff\u0000\u0116\u0117\u0006\u0007\uffff\uffff\u0000"+
		"\u0117\u000f\u0001\u0000\u0000\u0000\u0118\u0119\u0005)\u0000\u0000\u0119"+
		"\u011a\u0005\u0006\u0000\u0000\u011a\u011b\u0003$\u0012\u0000\u011b\u011c"+
		"\u0006\b\uffff\uffff\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u012b"+
		"\u0005\u0007\u0000\u0000\u011e\u0124\u0005\b\u0000\u0000\u011f\u0120\u0003"+
		"\u0002\u0001\u0000\u0120\u0121\u0006\b\uffff\uffff\u0000\u0121\u0123\u0001"+
		"\u0000\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0123\u0126\u0001"+
		"\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001"+
		"\u0000\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0124\u0001"+
		"\u0000\u0000\u0000\u0127\u012c\u0005\t\u0000\u0000\u0128\u0129\u0003\u0002"+
		"\u0001\u0000\u0129\u012a\u0006\b\uffff\uffff\u0000\u012a\u012c\u0001\u0000"+
		"\u0000\u0000\u012b\u011e\u0001\u0000\u0000\u0000\u012b\u0128\u0001\u0000"+
		"\u0000\u0000\u012c\u013d\u0001\u0000\u0000\u0000\u012d\u013b\u0005*\u0000"+
		"\u0000\u012e\u0134\u0005\b\u0000\u0000\u012f\u0130\u0003\u0002\u0001\u0000"+
		"\u0130\u0131\u0006\b\uffff\uffff\u0000\u0131\u0133\u0001\u0000\u0000\u0000"+
		"\u0132\u012f\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000"+
		"\u0137\u013c\u0005\t\u0000\u0000\u0138\u0139\u0003\u0002\u0001\u0000\u0139"+
		"\u013a\u0006\b\uffff\uffff\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b"+
		"\u012e\u0001\u0000\u0000\u0000\u013b\u0138\u0001\u0000\u0000\u0000\u013c"+
		"\u013e\u0001\u0000\u0000\u0000\u013d\u012d\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u0011\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0005,\u0000\u0000\u0140\u0141\u0005\u0006\u0000\u0000\u0141\u0142"+
		"\u0003$\u0012\u0000\u0142\u0143\u0006\t\uffff\uffff\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0152\u0005\u0007\u0000\u0000\u0145\u014b"+
		"\u0005\b\u0000\u0000\u0146\u0147\u0003\u0002\u0001\u0000\u0147\u0148\u0006"+
		"\t\uffff\uffff\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u0146\u0001"+
		"\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014e\u0001"+
		"\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u0153\u0005"+
		"\t\u0000\u0000\u014f\u0150\u0003\u0002\u0001\u0000\u0150\u0151\u0006\t"+
		"\uffff\uffff\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u0145\u0001"+
		"\u0000\u0000\u0000\u0152\u014f\u0001\u0000\u0000\u0000\u0153\u0013\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0005+\u0000\u0000\u0155\u0156\u0005\u0006"+
		"\u0000\u0000\u0156\u0157\u0003\u0002\u0001\u0000\u0157\u0158\u0003$\u0012"+
		"\u0000\u0158\u0159\u0006\n\uffff\uffff\u0000\u0159\u015d\u0005\u0002\u0000"+
		"\u0000\u015a\u015b\u0003$\u0012\u0000\u015b\u015c\u0006\n\uffff\uffff"+
		"\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f\u016d\u0005\u0007\u0000\u0000\u0160\u0166\u0005\b\u0000\u0000"+
		"\u0161\u0162\u0003\u0002\u0001\u0000\u0162\u0163\u0006\n\uffff\uffff\u0000"+
		"\u0163\u0165\u0001\u0000\u0000\u0000\u0164\u0161\u0001\u0000\u0000\u0000"+
		"\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016e\u0005\t\u0000\u0000\u016a"+
		"\u016b\u0003\u0002\u0001\u0000\u016b\u016c\u0006\n\uffff\uffff\u0000\u016c"+
		"\u016e\u0001\u0000\u0000\u0000\u016d\u0160\u0001\u0000\u0000\u0000\u016d"+
		"\u016a\u0001\u0000\u0000\u0000\u016e\u0015\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0005&\u0000\u0000\u0170\u017e\u0006\u000b\uffff\uffff\u0000\u0171"+
		"\u0177\u0005\b\u0000\u0000\u0172\u0173\u0003\u0002\u0001\u0000\u0173\u0174"+
		"\u0006\u000b\uffff\uffff\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175"+
		"\u0172\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000\u0000\u0177"+
		"\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178"+
		"\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a"+
		"\u017f\u0005\t\u0000\u0000\u017b\u017c\u0003\u0002\u0001\u0000\u017c\u017d"+
		"\u0006\u000b\uffff\uffff\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e"+
		"\u0171\u0001\u0000\u0000\u0000\u017e\u017b\u0001\u0000\u0000\u0000\u017f"+
		"\u0192\u0001\u0000\u0000\u0000\u0180\u0181\u0005(\u0000\u0000\u0181\u0182"+
		"\u0005I\u0000\u0000\u0182\u0190\u0005P\u0000\u0000\u0183\u0189\u0005\b"+
		"\u0000\u0000\u0184\u0185\u0003\u0002\u0001\u0000\u0185\u0186\u0006\u000b"+
		"\uffff\uffff\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0184\u0001"+
		"\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0001"+
		"\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u0191\u0005"+
		"\t\u0000\u0000\u018d\u018e\u0003\u0002\u0001\u0000\u018e\u018f\u0006\u000b"+
		"\uffff\uffff\u0000\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u0183\u0001"+
		"\u0000\u0000\u0000\u0190\u018d\u0001\u0000\u0000\u0000\u0191\u0193\u0001"+
		"\u0000\u0000\u0000\u0192\u0180\u0001\u0000\u0000\u0000\u0192\u0193\u0001"+
		"\u0000\u0000\u0000\u0193\u0017\u0001\u0000\u0000\u0000\u0194\u0195\u0005"+
		"-\u0000\u0000\u0195\u0199\u0006\f\uffff\uffff\u0000\u0196\u0197\u0005"+
		".\u0000\u0000\u0197\u0199\u0006\f\uffff\uffff\u0000\u0198\u0194\u0001"+
		"\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019a\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0005\u0002\u0000\u0000\u019b\u019c\u0006"+
		"\f\uffff\uffff\u0000\u019c\u0019\u0001\u0000\u0000\u0000\u019d\u019e\u0005"+
		"/\u0000\u0000\u019e\u019f\u0003$\u0012\u0000\u019f\u01a0\u0006\r\uffff"+
		"\uffff\u0000\u01a0\u01a1\u0005\u0002\u0000\u0000\u01a1\u01a2\u0006\r\uffff"+
		"\uffff\u0000\u01a2\u001b\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\'\u0000"+
		"\u0000\u01a4\u01a5\u0003$\u0012\u0000\u01a5\u01a6\u0006\u000e\uffff\uffff"+
		"\u0000\u01a6\u01a7\u0005\u0002\u0000\u0000\u01a7\u01a8\u0006\u000e\uffff"+
		"\uffff\u0000\u01a8\u001d\u0001\u0000\u0000\u0000\u01a9\u01b3\u0006\u000f"+
		"\uffff\uffff\u0000\u01aa\u01ab\u00030\u0018\u0000\u01ab\u01ac\u0006\u000f"+
		"\uffff\uffff\u0000\u01ac\u01b4\u0001\u0000\u0000\u0000\u01ad\u01ae\u0003"+
		",\u0016\u0000\u01ae\u01af\u0006\u000f\uffff\uffff\u0000\u01af\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u0003\"\u0011\u0000\u01b1\u01b2\u0006\u000f"+
		"\uffff\uffff\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01aa\u0001"+
		"\u0000\u0000\u0000\u01b3\u01ad\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0006"+
		"\u000f\uffff\uffff\u0000\u01b6\u01b7\u0005\u0006\u0000\u0000\u01b7\u01c3"+
		"\u0006\u000f\uffff\uffff\u0000\u01b8\u01b9\u0003$\u0012\u0000\u01b9\u01c0"+
		"\u0006\u000f\uffff\uffff\u0000\u01ba\u01bb\u0005\u0003\u0000\u0000\u01bb"+
		"\u01bc\u0003$\u0012\u0000\u01bc\u01bd\u0006\u000f\uffff\uffff\u0000\u01bd"+
		"\u01bf\u0001\u0000\u0000\u0000\u01be\u01ba\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c3\u01b8\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0005\u0007\u0000\u0000\u01c6\u001f\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0006\u0010\uffff\uffff\u0000\u01c8\u01ce\u0003\"\u0011\u0000\u01c9"+
		"\u01ca\u0005\n\u0000\u0000\u01ca\u01cb\u0003$\u0012\u0000\u01cb\u01cc"+
		"\u0005\u000b\u0000\u0000\u01cc\u01cd\u0006\u0010\uffff\uffff\u0000\u01cd"+
		"\u01cf\u0001\u0000\u0000\u0000\u01ce\u01c9\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0005\u0005\u0000\u0000\u01d1\u01d2\u00034\u001a\u0000\u01d2\u01d3"+
		"\u0006\u0010\uffff\uffff\u0000\u01d3\u01df\u0005\u0006\u0000\u0000\u01d4"+
		"\u01d5\u0003$\u0012\u0000\u01d5\u01dc\u0006\u0010\uffff\uffff\u0000\u01d6"+
		"\u01d7\u0005\u0003\u0000\u0000\u01d7\u01d8\u0003$\u0012\u0000\u01d8\u01d9"+
		"\u0006\u0010\uffff\uffff\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da"+
		"\u01d6\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc"+
		"\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd"+
		"\u01e0\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df"+
		"\u01d4\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005\u0007\u0000\u0000\u01e2"+
		"!\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005P\u0000\u0000\u01e4\u01e5\u0006"+
		"\u0011\uffff\uffff\u0000\u01e5#\u0001\u0000\u0000\u0000\u01e6\u01e7\u0006"+
		"\u0012\uffff\uffff\u0000\u01e7\u01e8\u0003&\u0013\u0000\u01e8\u01e9\u0006"+
		"\u0012\uffff\uffff\u0000\u01e9\u0203\u0001\u0000\u0000\u0000\u01ea\u01eb"+
		"\u0007\u0000\u0000\u0000\u01eb\u01ec\u0003$\u0012\u000e\u01ec\u01ed\u0006"+
		"\u0012\uffff\uffff\u0000\u01ed\u0203\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0005P\u0000\u0000\u01ef\u01f0\u0005\n\u0000\u0000\u01f0\u01f1\u0003"+
		"$\u0012\u0000\u01f1\u01f2\u0005\u000b\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0006\u0012\uffff\uffff\u0000\u01f4\u0203\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f6\u0005P\u0000\u0000\u01f6\u0203\u0006\u0012"+
		"\uffff\uffff\u0000\u01f7\u01f8\u0005\u0006\u0000\u0000\u01f8\u01f9\u0003"+
		"$\u0012\u0000\u01f9\u01fa\u0005\u0007\u0000\u0000\u01fa\u01fb\u0006\u0012"+
		"\uffff\uffff\u0000\u01fb\u0203\u0001\u0000\u0000\u0000\u01fc\u01fd\u0003"+
		"\u001e\u000f\u0000\u01fd\u01fe\u0006\u0012\uffff\uffff\u0000\u01fe\u0203"+
		"\u0001\u0000\u0000\u0000\u01ff\u0200\u0003 \u0010\u0000\u0200\u0201\u0006"+
		"\u0012\uffff\uffff\u0000\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u01e6"+
		"\u0001\u0000\u0000\u0000\u0202\u01ea\u0001\u0000\u0000\u0000\u0202\u01ee"+
		"\u0001\u0000\u0000\u0000\u0202\u01f5\u0001\u0000\u0000\u0000\u0202\u01f7"+
		"\u0001\u0000\u0000\u0000\u0202\u01fc\u0001\u0000\u0000\u0000\u0202\u01ff"+
		"\u0001\u0000\u0000\u0000\u0203\u0246\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\n\r\u0000\u0000\u0205\u0206\u0006\u0012\uffff\uffff\u0000\u0206\u0207"+
		"\u0007\u0001\u0000\u0000\u0207\u0208\u0006\u0012\uffff\uffff\u0000\u0208"+
		"\u0209\u0003$\u0012\u000e\u0209\u020a\u0006\u0012\uffff\uffff\u0000\u020a"+
		"\u0245\u0001\u0000\u0000\u0000\u020b\u020c\n\f\u0000\u0000\u020c\u020d"+
		"\u0006\u0012\uffff\uffff\u0000\u020d\u020e\u0007\u0002\u0000\u0000\u020e"+
		"\u020f\u0006\u0012\uffff\uffff\u0000\u020f\u0210\u0003$\u0012\r\u0210"+
		"\u0211\u0006\u0012\uffff\uffff\u0000\u0211\u0245\u0001\u0000\u0000\u0000"+
		"\u0212\u0213\n\u000b\u0000\u0000\u0213\u0214\u0006\u0012\uffff\uffff\u0000"+
		"\u0214\u0215\u0007\u0003\u0000\u0000\u0215\u0216\u0006\u0012\uffff\uffff"+
		"\u0000\u0216\u0217\u0003$\u0012\f\u0217\u0218\u0006\u0012\uffff\uffff"+
		"\u0000\u0218\u0245\u0001\u0000\u0000\u0000\u0219\u021a\n\n\u0000\u0000"+
		"\u021a\u021b\u0006\u0012\uffff\uffff\u0000\u021b\u021c\u0007\u0004\u0000"+
		"\u0000\u021c\u021d\u0006\u0012\uffff\uffff\u0000\u021d\u021e\u0003$\u0012"+
		"\u000b\u021e\u021f\u0006\u0012\uffff\uffff\u0000\u021f\u0245\u0001\u0000"+
		"\u0000\u0000\u0220\u0221\n\t\u0000\u0000\u0221\u0222\u0006\u0012\uffff"+
		"\uffff\u0000\u0222\u0223\u0007\u0005\u0000\u0000\u0223\u0224\u0006\u0012"+
		"\uffff\uffff\u0000\u0224\u0225\u0003$\u0012\n\u0225\u0226\u0006\u0012"+
		"\uffff\uffff\u0000\u0226\u0245\u0001\u0000\u0000\u0000\u0227\u0228\n\b"+
		"\u0000\u0000\u0228\u0229\u0006\u0012\uffff\uffff\u0000\u0229\u022a\u0007"+
		"\u0006\u0000\u0000\u022a\u022b\u0006\u0012\uffff\uffff\u0000\u022b\u022c"+
		"\u0003$\u0012\t\u022c\u022d\u0006\u0012\uffff\uffff\u0000\u022d\u0245"+
		"\u0001\u0000\u0000\u0000\u022e\u022f\n\u0007\u0000\u0000\u022f\u0230\u0006"+
		"\u0012\uffff\uffff\u0000\u0230\u0231\u0005\u0011\u0000\u0000\u0231\u0232"+
		"\u0006\u0012\uffff\uffff\u0000\u0232\u0233\u0003$\u0012\b\u0233\u0234"+
		"\u0006\u0012\uffff\uffff\u0000\u0234\u0245\u0001\u0000\u0000\u0000\u0235"+
		"\u0236\n\u0006\u0000\u0000\u0236\u0237\u0006\u0012\uffff\uffff\u0000\u0237"+
		"\u0238\u0005\u0012\u0000\u0000\u0238\u0239\u0006\u0012\uffff\uffff\u0000"+
		"\u0239\u023a\u0003$\u0012\u0007\u023a\u023b\u0006\u0012\uffff\uffff\u0000"+
		"\u023b\u0245\u0001\u0000\u0000\u0000\u023c\u023d\n\u0010\u0000\u0000\u023d"+
		"\u023e\u0005\u0005\u0000\u0000\u023e\u023f\u00032\u0019\u0000\u023f\u0240"+
		"\u0006\u0012\uffff\uffff\u0000\u0240\u0245\u0001\u0000\u0000\u0000\u0241"+
		"\u0242\n\u000f\u0000\u0000\u0242\u0243\u0007\u0007\u0000\u0000\u0243\u0245"+
		"\u0006\u0012\uffff\uffff\u0000\u0244\u0204\u0001\u0000\u0000\u0000\u0244"+
		"\u020b\u0001\u0000\u0000\u0000\u0244\u0212\u0001\u0000\u0000\u0000\u0244"+
		"\u0219\u0001\u0000\u0000\u0000\u0244\u0220\u0001\u0000\u0000\u0000\u0244"+
		"\u0227\u0001\u0000\u0000\u0000\u0244\u022e\u0001\u0000\u0000\u0000\u0244"+
		"\u0235\u0001\u0000\u0000\u0000\u0244\u023c\u0001\u0000\u0000\u0000\u0244"+
		"\u0241\u0001\u0000\u0000\u0000\u0245\u0248\u0001\u0000\u0000\u0000\u0246"+
		"\u0244\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247"+
		"%\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0003(\u0014\u0000\u024a\u024b\u0006\u0013\uffff\uffff\u0000\u024b\u0253"+
		"\u0001\u0000\u0000\u0000\u024c\u024d\u0005S\u0000\u0000\u024d\u0253\u0006"+
		"\u0013\uffff\uffff\u0000\u024e\u024f\u0005:\u0000\u0000\u024f\u0253\u0006"+
		"\u0013\uffff\uffff\u0000\u0250\u0251\u00059\u0000\u0000\u0251\u0253\u0006"+
		"\u0013\uffff\uffff\u0000\u0252\u0249\u0001\u0000\u0000\u0000\u0252\u024c"+
		"\u0001\u0000\u0000\u0000\u0252\u024e\u0001\u0000\u0000\u0000\u0252\u0250"+
		"\u0001\u0000\u0000\u0000\u0253\'\u0001\u0000\u0000\u0000\u0254\u0255\u0005"+
		"Q\u0000\u0000\u0255\u0259\u0006\u0014\uffff\uffff\u0000\u0256\u0257\u0005"+
		"R\u0000\u0000\u0257\u0259\u0006\u0014\uffff\uffff\u0000\u0258\u0254\u0001"+
		"\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0259)\u0001\u0000"+
		"\u0000\u0000\u025a\u025b\u00053\u0000\u0000\u025b\u0267\u0006\u0015\uffff"+
		"\uffff\u0000\u025c\u025d\u00054\u0000\u0000\u025d\u0267\u0006\u0015\uffff"+
		"\uffff\u0000\u025e\u025f\u00058\u0000\u0000\u025f\u0267\u0006\u0015\uffff"+
		"\uffff\u0000\u0260\u0261\u00056\u0000\u0000\u0261\u0267\u0006\u0015\uffff"+
		"\uffff\u0000\u0262\u0263\u00055\u0000\u0000\u0263\u0267\u0006\u0015\uffff"+
		"\uffff\u0000\u0264\u0265\u00057\u0000\u0000\u0265\u0267\u0006\u0015\uffff"+
		"\uffff\u0000\u0266\u025a\u0001\u0000\u0000\u0000\u0266\u025c\u0001\u0000"+
		"\u0000\u0000\u0266\u025e\u0001\u0000\u0000\u0000\u0266\u0260\u0001\u0000"+
		"\u0000\u0000\u0266\u0262\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000"+
		"\u0000\u0000\u0267+\u0001\u0000\u0000\u0000\u0268\u0269\u0005G\u0000\u0000"+
		"\u0269\u0271\u0006\u0016\uffff\uffff\u0000\u026a\u026b\u0005F\u0000\u0000"+
		"\u026b\u0271\u0006\u0016\uffff\uffff\u0000\u026c\u026d\u0005H\u0000\u0000"+
		"\u026d\u0271\u0006\u0016\uffff\uffff\u0000\u026e\u026f\u0005I\u0000\u0000"+
		"\u026f\u0271\u0006\u0016\uffff\uffff\u0000\u0270\u0268\u0001\u0000\u0000"+
		"\u0000\u0270\u026a\u0001\u0000\u0000\u0000\u0270\u026c\u0001\u0000\u0000"+
		"\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0271-\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\u0003*\u0015\u0000\u0273\u0274\u0006\u0017\uffff\uffff\u0000"+
		"\u0274\u0279\u0001\u0000\u0000\u0000\u0275\u0276\u0003,\u0016\u0000\u0276"+
		"\u0277\u0006\u0017\uffff\uffff\u0000\u0277\u0279\u0001\u0000\u0000\u0000"+
		"\u0278\u0272\u0001\u0000\u0000\u0000\u0278\u0275\u0001\u0000\u0000\u0000"+
		"\u0279/\u0001\u0000\u0000\u0000\u027a\u027b\u0007\b\u0000\u0000\u027b"+
		"1\u0001\u0000\u0000\u0000\u027c\u027d\u0007\t\u0000\u0000\u027d3\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0007\n\u0000\u0000\u027f5\u0001\u0000"+
		"\u0000\u0000\u0280\u0287\u0005 \u0000\u0000\u0281\u0287\u0005!\u0000\u0000"+
		"\u0282\u0287\u0005\"\u0000\u0000\u0283\u0287\u0005#\u0000\u0000\u0284"+
		"\u0287\u0005$\u0000\u0000\u0285\u0287\u0005%\u0000\u0000\u0286\u0280\u0001"+
		"\u0000\u0000\u0000\u0286\u0281\u0001\u0000\u0000\u0000\u0286\u0282\u0001"+
		"\u0000\u0000\u0000\u0286\u0283\u0001\u0000\u0000\u0000\u0286\u0284\u0001"+
		"\u0000\u0000\u0000\u0286\u0285\u0001\u0000\u0000\u0000\u02877\u0001\u0000"+
		"\u0000\u00004EGox\u007f\u0090\u009b\u00a2\u00a5\u00aa\u00b2\u00b9\u00c6"+
		"\u00cd\u00da\u00e2\u00e9\u00f6\u00fe\u0105\u0110\u0124\u012b\u0134\u013b"+
		"\u013d\u014b\u0152\u015d\u0166\u016d\u0177\u017e\u0189\u0190\u0192\u0198"+
		"\u01b3\u01c0\u01c3\u01ce\u01dc\u01df\u0202\u0244\u0246\u0252\u0258\u0266"+
		"\u0270\u0278\u0286";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}