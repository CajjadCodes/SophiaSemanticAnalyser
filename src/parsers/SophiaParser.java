// Generated from /media/quentine/DATA/Educational/University/Semester 5/Programming Languages and Compiler Design/CA/SophiaSemanticAnalyser/src/main/grammar/Sophia.g4 by ANTLR 4.8
package parsers;

    import main.ast.types.*;
    import main.ast.types.functionPointer.*;
    import main.ast.types.list.*;
    import main.ast.types.single.*;
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.declaration.classDec.*;
    import main.ast.nodes.declaration.classDec.classMembersDec.*;
    import main.ast.nodes.declaration.variableDec.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.statement.loop.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SophiaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, EXTENDS=2, CLASS=3, PRINT=4, FUNC=5, NEW=6, CONTINUE=7, BREAK=8, 
		RETURN=9, FOREACH=10, IN=11, FOR=12, IF=13, ELSE=14, BOOLEAN=15, STRING=16, 
		INT=17, VOID=18, NULL=19, LIST=20, TRUE=21, FALSE=22, THIS=23, ARROW=24, 
		GREATER_THAN=25, LESS_THAN=26, NOT_EQUAL=27, EQUAL=28, MULT=29, DIVIDE=30, 
		MOD=31, PLUS=32, MINUS=33, AND=34, OR=35, NOT=36, QUESTION_MARK=37, ASSIGN=38, 
		INCREMENT=39, DECREMENT=40, LPAR=41, RPAR=42, LBRACK=43, RBRACK=44, LBRACE=45, 
		RBRACE=46, SHARP=47, COMMA=48, DOT=49, COLON=50, SEMICOLLON=51, INT_VALUE=52, 
		IDENTIFIER=53, STRING_VALUE=54, COMMENT=55, WS=56;
	public static final int
		RULE_sophia = 0, RULE_program = 1, RULE_sophiaClass = 2, RULE_varDeclaration = 3, 
		RULE_method = 4, RULE_constructor = 5, RULE_methodArguments = 6, RULE_variableWithType = 7, 
		RULE_type = 8, RULE_classType = 9, RULE_listType = 10, RULE_listItemsTypes = 11, 
		RULE_listItemType = 12, RULE_functionPointerType = 13, RULE_typesWithComma = 14, 
		RULE_primitiveDataType = 15, RULE_methodBody = 16, RULE_statement = 17, 
		RULE_block = 18, RULE_assignmentStatement = 19, RULE_assignment = 20, 
		RULE_printStatement = 21, RULE_returnStatement = 22, RULE_methodCallStatement = 23, 
		RULE_methodCall = 24, RULE_methodCallArguments = 25, RULE_continueBreakStatement = 26, 
		RULE_forStatement = 27, RULE_foreachStatement = 28, RULE_ifStatement = 29, 
		RULE_expression = 30, RULE_orExpression = 31, RULE_andExpression = 32, 
		RULE_equalityExpression = 33, RULE_relationalExpression = 34, RULE_additiveExpression = 35, 
		RULE_multiplicativeExpression = 36, RULE_preUnaryExpression = 37, RULE_postUnaryExpression = 38, 
		RULE_accessExpression = 39, RULE_otherExpression = 40, RULE_newExpression = 41, 
		RULE_values = 42, RULE_boolValue = 43, RULE_listValue = 44, RULE_identifier = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "program", "sophiaClass", "varDeclaration", "method", "constructor", 
			"methodArguments", "variableWithType", "type", "classType", "listType", 
			"listItemsTypes", "listItemType", "functionPointerType", "typesWithComma", 
			"primitiveDataType", "methodBody", "statement", "block", "assignmentStatement", 
			"assignment", "printStatement", "returnStatement", "methodCallStatement", 
			"methodCall", "methodCallArguments", "continueBreakStatement", "forStatement", 
			"foreachStatement", "ifStatement", "expression", "orExpression", "andExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"preUnaryExpression", "postUnaryExpression", "accessExpression", "otherExpression", 
			"newExpression", "values", "boolValue", "listValue", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'extends'", "'class'", "'print'", "'func'", "'new'", 
			"'continue'", "'break'", "'return'", "'foreach'", "'in'", "'for'", "'if'", 
			"'else'", "'bool'", "'string'", "'int'", "'void'", "'null'", "'list'", 
			"'true'", "'false'", "'this'", "'->'", "'>'", "'<'", "'!='", "'=='", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'&&'", "'||'", "'!'", "'?'", "'='", 
			"'++'", "'--'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'#'", "','", 
			"'.'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "EXTENDS", "CLASS", "PRINT", "FUNC", "NEW", "CONTINUE", 
			"BREAK", "RETURN", "FOREACH", "IN", "FOR", "IF", "ELSE", "BOOLEAN", "STRING", 
			"INT", "VOID", "NULL", "LIST", "TRUE", "FALSE", "THIS", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "NOT_EQUAL", "EQUAL", "MULT", "DIVIDE", "MOD", "PLUS", "MINUS", 
			"AND", "OR", "NOT", "QUESTION_MARK", "ASSIGN", "INCREMENT", "DECREMENT", 
			"LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "SHARP", "COMMA", 
			"DOT", "COLON", "SEMICOLLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", 
			"COMMENT", "WS"
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
	public String getGrammarFileName() { return "Sophia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SophiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SophiaContext extends ParserRuleContext {
		public Program sophiaProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(SophiaParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public SophiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaContext sophia() throws RecognitionException {
		SophiaContext _localctx = new SophiaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sophia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((SophiaContext)_localctx).p = program();
			 ((SophiaContext)_localctx).sophiaProgram =  ((SophiaContext)_localctx).p.programRet;
			setState(94);
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

	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public SophiaClassContext c;
		public List<SophiaClassContext> sophiaClass() {
			return getRuleContexts(SophiaClassContext.class);
		}
		public SophiaClassContext sophiaClass(int i) {
			return getRuleContext(SophiaClassContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((ProgramContext)_localctx).programRet =  new Program();
			        _localctx.programRet.setLine(1);
			    
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(97);
				((ProgramContext)_localctx).c = sophiaClass();
				 _localctx.programRet.addClass(((ProgramContext)_localctx).c.sophiaClassRet); 
				}
				}
				setState(104);
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

	public static class SophiaClassContext extends ParserRuleContext {
		public ClassDeclaration sophiaClassRet;
		public FieldDeclaration newField;
		public Token clskw;
		public IdentifierContext classidn;
		public IdentifierContext parentidn;
		public VarDeclarationContext vd1;
		public MethodContext m1;
		public ConstructorContext cnstr;
		public VarDeclarationContext vd2;
		public MethodContext m2;
		public VarDeclarationContext vd3;
		public MethodContext m3;
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode CLASS() { return getToken(SophiaParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(SophiaParser.EXTENDS, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public SophiaClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophiaClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophiaClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophiaClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophiaClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaClassContext sophiaClass() throws RecognitionException {
		SophiaClassContext _localctx = new SophiaClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sophiaClass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((SophiaClassContext)_localctx).clskw = match(CLASS);
			setState(106);
			((SophiaClassContext)_localctx).classidn = identifier();

			        ((SophiaClassContext)_localctx).sophiaClassRet =  new ClassDeclaration(((SophiaClassContext)_localctx).classidn.identifierRet);
			        _localctx.sophiaClassRet.setLine(((SophiaClassContext)_localctx).clskw.getLine());
			    
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(108);
				match(EXTENDS);
				setState(109);
				((SophiaClassContext)_localctx).parentidn = identifier();
				 _localctx.sophiaClassRet.setParentClassName(((SophiaClassContext)_localctx).parentidn.identifierRet); 
				}
			}

			setState(114);
			match(LBRACE);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				{
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(121);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(115);
							((SophiaClassContext)_localctx).vd1 = varDeclaration();

							           ((SophiaClassContext)_localctx).newField =  new FieldDeclaration(((SophiaClassContext)_localctx).vd1.varDeclarationRet);
							            _localctx.newField.setLine(_localctx.newField.getVarDeclaration().getLine());
							            _localctx.sophiaClassRet.addField(_localctx.newField);
							         
							}
							break;
						case DEF:
							{
							setState(118);
							((SophiaClassContext)_localctx).m1 = method();
							 _localctx.sophiaClassRet.addMethod(((SophiaClassContext)_localctx).m1.methodDeclarationRet); 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(125);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(126);
				((SophiaClassContext)_localctx).cnstr = constructor();
				 _localctx.sophiaClassRet.setConstructor(((SophiaClassContext)_localctx).cnstr.constructorDeclarationRet); 
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEF || _la==IDENTIFIER) {
					{
					setState(134);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(128);
						((SophiaClassContext)_localctx).vd2 = varDeclaration();

						            ((SophiaClassContext)_localctx).newField =  new FieldDeclaration(((SophiaClassContext)_localctx).vd2.varDeclarationRet);
						            _localctx.newField.setLine(_localctx.newField.getVarDeclaration().getLine());
						            _localctx.sophiaClassRet.addField(_localctx.newField);
						            
						}
						break;
					case DEF:
						{
						setState(131);
						((SophiaClassContext)_localctx).m2 = method();
						 _localctx.sophiaClassRet.addMethod(((SophiaClassContext)_localctx).m2.methodDeclarationRet); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEF || _la==IDENTIFIER) {
					{
					setState(145);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(139);
						((SophiaClassContext)_localctx).vd3 = varDeclaration();

						         ((SophiaClassContext)_localctx).newField =  new FieldDeclaration(((SophiaClassContext)_localctx).vd3.varDeclarationRet);
						         _localctx.newField.setLine(_localctx.newField.getVarDeclaration().getLine());
						         _localctx.sophiaClassRet.addField(_localctx.newField);
						         
						}
						break;
					case DEF:
						{
						setState(142);
						((SophiaClassContext)_localctx).m3 = method();
						 _localctx.sophiaClassRet.addMethod(((SophiaClassContext)_localctx).m3.methodDeclarationRet); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(152);
			match(RBRACE);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration varDeclarationRet;
		public IdentifierContext idn;
		public TypeContext typ;
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((VarDeclarationContext)_localctx).idn = identifier();
			setState(155);
			match(COLON);
			setState(156);
			((VarDeclarationContext)_localctx).typ = type();
			setState(157);
			match(SEMICOLLON);

			        ((VarDeclarationContext)_localctx).varDeclarationRet =  new VarDeclaration(((VarDeclarationContext)_localctx).idn.identifierRet, ((VarDeclarationContext)_localctx).typ.typeRet);
			        _localctx.varDeclarationRet.setLine(((VarDeclarationContext)_localctx).idn.identifierRet.getLine());
			    
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

	public static class MethodContext extends ParserRuleContext {
		public MethodDeclaration methodDeclarationRet;
		public boolean isRetTypeVoid;
		public Token df;
		public TypeContext rettyp;
		public IdentifierContext idn;
		public MethodArgumentsContext ma;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SophiaParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodContext)_localctx).isRetTypeVoid =  false; 
			setState(161);
			((MethodContext)_localctx).df = match(DEF);
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(162);
				((MethodContext)_localctx).rettyp = type();
				}
				break;
			case VOID:
				{
				setState(163);
				match(VOID);
				 ((MethodContext)_localctx).isRetTypeVoid =  true; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(167);
			((MethodContext)_localctx).idn = identifier();

			        ((MethodContext)_localctx).methodDeclarationRet =  new MethodDeclaration(((MethodContext)_localctx).idn.identifierRet, _localctx.isRetTypeVoid? new NullType(): ((MethodContext)_localctx).rettyp.typeRet);
			        _localctx.methodDeclarationRet.setLine(((MethodContext)_localctx).df.getLine());
			     
			setState(169);
			match(LPAR);
			setState(170);
			((MethodContext)_localctx).ma = methodArguments();
			 _localctx.methodDeclarationRet.setArgs(((MethodContext)_localctx).ma.methodArgumentsRet); 
			setState(172);
			match(RPAR);
			setState(173);
			match(LBRACE);
			setState(174);
			methodBody(_localctx.methodDeclarationRet);
			setState(175);
			match(RBRACE);
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

	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorDeclaration constructorDeclarationRet;
		public Token df;
		public IdentifierContext idn;
		public MethodArgumentsContext ma;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((ConstructorContext)_localctx).df = match(DEF);
			setState(178);
			((ConstructorContext)_localctx).idn = identifier();

			        ((ConstructorContext)_localctx).constructorDeclarationRet =  new ConstructorDeclaration(((ConstructorContext)_localctx).idn.identifierRet);
			        _localctx.constructorDeclarationRet.setLine(((ConstructorContext)_localctx).df.getLine());
			    
			setState(180);
			match(LPAR);
			setState(181);
			((ConstructorContext)_localctx).ma = methodArguments();
			 _localctx.constructorDeclarationRet.setArgs(((ConstructorContext)_localctx).ma.methodArgumentsRet); 
			setState(183);
			match(RPAR);
			setState(184);
			match(LBRACE);
			setState(185);
			methodBody(_localctx.constructorDeclarationRet);
			setState(186);
			match(RBRACE);
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

	public static class MethodArgumentsContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> methodArgumentsRet;
		public VariableWithTypeContext fvwt;
		public VariableWithTypeContext ovwt;
		public List<VariableWithTypeContext> variableWithType() {
			return getRuleContexts(VariableWithTypeContext.class);
		}
		public VariableWithTypeContext variableWithType(int i) {
			return getRuleContext(VariableWithTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodArgumentsContext)_localctx).methodArgumentsRet =  new ArrayList<VarDeclaration>(); 
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(189);
				((MethodArgumentsContext)_localctx).fvwt = variableWithType();
				 _localctx.methodArgumentsRet.add(((MethodArgumentsContext)_localctx).fvwt.variableWithTypeRet); 
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(191);
					match(COMMA);
					setState(192);
					((MethodArgumentsContext)_localctx).ovwt = variableWithType();
					 _localctx.methodArgumentsRet.add(((MethodArgumentsContext)_localctx).ovwt.variableWithTypeRet); 
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class VariableWithTypeContext extends ParserRuleContext {
		public VarDeclaration variableWithTypeRet;
		public IdentifierContext idn;
		public TypeContext typ;
		public TerminalNode COLON() { return getToken(SophiaParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableWithTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableWithType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVariableWithType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVariableWithType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVariableWithType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableWithTypeContext variableWithType() throws RecognitionException {
		VariableWithTypeContext _localctx = new VariableWithTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableWithType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((VariableWithTypeContext)_localctx).idn = identifier();
			setState(203);
			match(COLON);
			setState(204);
			((VariableWithTypeContext)_localctx).typ = type();

			        ((VariableWithTypeContext)_localctx).variableWithTypeRet =  new VarDeclaration(((VariableWithTypeContext)_localctx).idn.identifierRet, ((VariableWithTypeContext)_localctx).typ.typeRet);
			        _localctx.variableWithTypeRet.setLine(((VariableWithTypeContext)_localctx).idn.identifierRet.getLine());
			    
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

	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public PrimitiveDataTypeContext pmdt;
		public ListTypeContext lt;
		public FunctionPointerTypeContext fpt;
		public ClassTypeContext ct;
		public PrimitiveDataTypeContext primitiveDataType() {
			return getRuleContext(PrimitiveDataTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public FunctionPointerTypeContext functionPointerType() {
			return getRuleContext(FunctionPointerTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				((TypeContext)_localctx).pmdt = primitiveDataType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).pmdt.primitiveDataTypeRet; 
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				((TypeContext)_localctx).lt = listType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).lt.listTypeRet; 
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				((TypeContext)_localctx).fpt = functionPointerType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).fpt.fptrTypeRet; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				((TypeContext)_localctx).ct = classType();
				 ((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).ct.classTypeRet; 
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

	public static class ClassTypeContext extends ParserRuleContext {
		public ClassType classTypeRet;
		public IdentifierContext idn;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			((ClassTypeContext)_localctx).idn = identifier();
			 ((ClassTypeContext)_localctx).classTypeRet =  new ClassType(((ClassTypeContext)_localctx).idn.identifierRet); 
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

	public static class ListTypeContext extends ParserRuleContext {
		public ListType listTypeRet;
		public Token num;
		public TypeContext singtyp;
		public ListItemsTypesContext lit;
		public TerminalNode LIST() { return getToken(SophiaParser.LIST, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SHARP() { return getToken(SophiaParser.SHARP, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemsTypesContext listItemsTypes() {
			return getRuleContext(ListItemsTypesContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(LIST);
			setState(225);
			match(LPAR);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				{
				{
				setState(226);
				((ListTypeContext)_localctx).num = match(INT_VALUE);
				setState(227);
				match(SHARP);
				setState(228);
				((ListTypeContext)_localctx).singtyp = type();
				 ((ListTypeContext)_localctx).listTypeRet =  new ListType((((ListTypeContext)_localctx).num!=null?Integer.valueOf(((ListTypeContext)_localctx).num.getText()):0), new ListNameType(((ListTypeContext)_localctx).singtyp.typeRet)); 
				}
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				{
				setState(231);
				((ListTypeContext)_localctx).lit = listItemsTypes();
				 ((ListTypeContext)_localctx).listTypeRet =  new ListType(((ListTypeContext)_localctx).lit.listItemsTypesRet); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(236);
			match(RPAR);
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

	public static class ListItemsTypesContext extends ParserRuleContext {
		public ArrayList<ListNameType> listItemsTypesRet;
		public ListItemTypeContext flt;
		public ListItemTypeContext olt;
		public List<ListItemTypeContext> listItemType() {
			return getRuleContexts(ListItemTypeContext.class);
		}
		public ListItemTypeContext listItemType(int i) {
			return getRuleContext(ListItemTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public ListItemsTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemsTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemsTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemsTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemsTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemsTypesContext listItemsTypes() throws RecognitionException {
		ListItemsTypesContext _localctx = new ListItemsTypesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listItemsTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ListItemsTypesContext)_localctx).listItemsTypesRet =  new ArrayList<ListNameType>(); 
			setState(239);
			((ListItemsTypesContext)_localctx).flt = listItemType();
			_localctx.listItemsTypesRet.add(((ListItemsTypesContext)_localctx).flt.listItemTypeRet);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(241);
				match(COMMA);
				setState(242);
				((ListItemsTypesContext)_localctx).olt = listItemType();
				_localctx.listItemsTypesRet.add(((ListItemsTypesContext)_localctx).olt.listItemTypeRet);
				}
				}
				setState(249);
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

	public static class ListItemTypeContext extends ParserRuleContext {
		public ListNameType listItemTypeRet;
		public VariableWithTypeContext vwt;
		public TypeContext typ;
		public VariableWithTypeContext variableWithType() {
			return getRuleContext(VariableWithTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListItemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListItemType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListItemType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListItemType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemTypeContext listItemType() throws RecognitionException {
		ListItemTypeContext _localctx = new ListItemTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listItemType);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				((ListItemTypeContext)_localctx).vwt = variableWithType();
				 ((ListItemTypeContext)_localctx).listItemTypeRet =  new ListNameType(((ListItemTypeContext)_localctx).vwt.variableWithTypeRet); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				((ListItemTypeContext)_localctx).typ = type();
				 ((ListItemTypeContext)_localctx).listItemTypeRet =  new ListNameType(((ListItemTypeContext)_localctx).typ.typeRet); 
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

	public static class FunctionPointerTypeContext extends ParserRuleContext {
		public FptrType fptrTypeRet;
		public TypesWithCommaContext twc;
		public TypeContext rettyp;
		public TerminalNode FUNC() { return getToken(SophiaParser.FUNC, 0); }
		public TerminalNode LESS_THAN() { return getToken(SophiaParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(SophiaParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SophiaParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(SophiaParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SophiaParser.VOID, i);
		}
		public TypesWithCommaContext typesWithComma() {
			return getRuleContext(TypesWithCommaContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionPointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunctionPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunctionPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunctionPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPointerTypeContext functionPointerType() throws RecognitionException {
		FunctionPointerTypeContext _localctx = new FunctionPointerTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionPointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionPointerTypeContext)_localctx).fptrTypeRet =  new FptrType(); 
			setState(259);
			match(FUNC);
			setState(260);
			match(LESS_THAN);
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(261);
				match(VOID);
				 _localctx.fptrTypeRet.setArgumentsTypes(new ArrayList<Type>()); 
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(263);
				((FunctionPointerTypeContext)_localctx).twc = typesWithComma();
				 _localctx.fptrTypeRet.setArgumentsTypes(((FunctionPointerTypeContext)_localctx).twc.typesWithCommaRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
			match(ARROW);
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(269);
				match(VOID);
				 _localctx.fptrTypeRet.setReturnType(new NullType()); 
				}
				break;
			case FUNC:
			case BOOLEAN:
			case STRING:
			case INT:
			case LIST:
			case IDENTIFIER:
				{
				setState(271);
				((FunctionPointerTypeContext)_localctx).rettyp = type();
				 _localctx.fptrTypeRet.setReturnType(((FunctionPointerTypeContext)_localctx).rettyp.typeRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(276);
			match(GREATER_THAN);
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

	public static class TypesWithCommaContext extends ParserRuleContext {
		public ArrayList<Type> typesWithCommaRet;
		public TypeContext ftyp;
		public TypeContext otyp;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public TypesWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesWithComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterTypesWithComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitTypesWithComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitTypesWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesWithCommaContext typesWithComma() throws RecognitionException {
		TypesWithCommaContext _localctx = new TypesWithCommaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typesWithComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TypesWithCommaContext)_localctx).typesWithCommaRet =  new ArrayList<Type>();
			setState(279);
			((TypesWithCommaContext)_localctx).ftyp = type();
			_localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).ftyp.typeRet); 
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				((TypesWithCommaContext)_localctx).otyp = type();
				_localctx.typesWithCommaRet.add(((TypesWithCommaContext)_localctx).otyp.typeRet); 
				}
				}
				setState(289);
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

	public static class PrimitiveDataTypeContext extends ParserRuleContext {
		public Type primitiveDataTypeRet;
		public TerminalNode INT() { return getToken(SophiaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SophiaParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SophiaParser.BOOLEAN, 0); }
		public PrimitiveDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveDataTypeContext primitiveDataType() throws RecognitionException {
		PrimitiveDataTypeContext _localctx = new PrimitiveDataTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitiveDataType);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(INT);
				 ((PrimitiveDataTypeContext)_localctx).primitiveDataTypeRet =  new IntType(); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(STRING);
				 ((PrimitiveDataTypeContext)_localctx).primitiveDataTypeRet =  new StringType(); 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(BOOLEAN);
				 ((PrimitiveDataTypeContext)_localctx).primitiveDataTypeRet =  new BoolType(); 
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

	public static class MethodBodyContext extends ParserRuleContext {
		public MethodDeclaration _method;
		public VarDeclarationContext vd;
		public StatementContext st;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState, MethodDeclaration _method) {
			super(parent, invokingState);
			this._method = _method;
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody(MethodDeclaration _method) throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState(), _method);
		enterRule(_localctx, 32, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(298);
					((MethodBodyContext)_localctx).vd = varDeclaration();
					 _localctx._method.addLocalVar(((MethodBodyContext)_localctx).vd.varDeclarationRet); 
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(306);
				((MethodBodyContext)_localctx).st = statement();
				 _localctx._method.addBodyStatement(((MethodBodyContext)_localctx).st.statementRet); 
				}
				}
				setState(313);
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

	public static class StatementContext extends ParserRuleContext {
		public Statement statementRet;
		public ForStatementContext forr;
		public ForeachStatementContext foreachh;
		public IfStatementContext iff;
		public AssignmentStatementContext assignn;
		public PrintStatementContext printt;
		public ContinueBreakStatementContext contbr;
		public MethodCallStatementContext metcall;
		public ReturnStatementContext rett;
		public BlockContext bl;
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public MethodCallStatementContext methodCallStatement() {
			return getRuleContext(MethodCallStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				((StatementContext)_localctx).forr = forStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).forr.forStatementRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				((StatementContext)_localctx).foreachh = foreachStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).foreachh.foreachStatementRet; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				((StatementContext)_localctx).iff = ifStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).iff.ifStatementRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				((StatementContext)_localctx).assignn = assignmentStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).assignn.assignmentStatementRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				((StatementContext)_localctx).printt = printStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).printt.printStatementRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(329);
				((StatementContext)_localctx).contbr = continueBreakStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).contbr.continueBreakStatementRet; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(332);
				((StatementContext)_localctx).metcall = methodCallStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).metcall.methodCallStatementRet; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(335);
				((StatementContext)_localctx).rett = returnStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).rett.returnStatementRet; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(338);
				((StatementContext)_localctx).bl = block();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).bl.blockRet; 
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

	public static class BlockContext extends ParserRuleContext {
		public BlockStmt blockRet;
		public Token lbrc;
		public StatementContext stm;
		public TerminalNode RBRACE() { return getToken(SophiaParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(SophiaParser.LBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			((BlockContext)_localctx).lbrc = match(LBRACE);
			 ((BlockContext)_localctx).blockRet =  new BlockStmt(); _localctx.blockRet.setLine(((BlockContext)_localctx).lbrc.getLine()); 
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NEW) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << FOREACH) | (1L << FOR) | (1L << IF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << LBRACE) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				{
				setState(345);
				((BlockContext)_localctx).stm = statement();
				 _localctx.blockRet.addStatement(((BlockContext)_localctx).stm.statementRet); 
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(RBRACE);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assignmentStatementRet;
		public AssignmentContext assignn;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			((AssignmentStatementContext)_localctx).assignn = assignment();
			 ((AssignmentStatementContext)_localctx).assignmentStatementRet =  ((AssignmentStatementContext)_localctx).assignn.assignmentRet; 
			setState(357);
			match(SEMICOLLON);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentStmt assignmentRet;
		public OrExpressionContext orr;
		public Token asgn;
		public ExpressionContext expr;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((AssignmentContext)_localctx).orr = orExpression();
			setState(360);
			((AssignmentContext)_localctx).asgn = match(ASSIGN);
			setState(361);
			((AssignmentContext)_localctx).expr = expression();

			        ((AssignmentContext)_localctx).assignmentRet =  new AssignmentStmt(((AssignmentContext)_localctx).orr.orExpressionRet, ((AssignmentContext)_localctx).expr.expressionRet);
			        _localctx.assignmentRet.setLine(((AssignmentContext)_localctx).asgn.getLine());
			    
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStmt printStatementRet;
		public Token pr;
		public ExpressionContext expr;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode PRINT() { return getToken(SophiaParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			((PrintStatementContext)_localctx).pr = match(PRINT);
			setState(365);
			match(LPAR);
			setState(366);
			((PrintStatementContext)_localctx).expr = expression();
			setState(367);
			match(RPAR);
			setState(368);
			match(SEMICOLLON);

			        ((PrintStatementContext)_localctx).printStatementRet =  new PrintStmt(((PrintStatementContext)_localctx).expr.expressionRet);
			        _localctx.printStatementRet.setLine(((PrintStatementContext)_localctx).pr.getLine());
			    
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStatementRet;
		public Token ret;
		public ExpressionContext expr;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode RETURN() { return getToken(SophiaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			((ReturnStatementContext)_localctx).ret = match(RETURN);

			         ((ReturnStatementContext)_localctx).returnStatementRet =  new ReturnStmt();
			         _localctx.returnStatementRet.setLine(((ReturnStatementContext)_localctx).ret.getLine());
			     
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(373);
				((ReturnStatementContext)_localctx).expr = expression();
				 _localctx.returnStatementRet.setReturnedExpr(((ReturnStatementContext)_localctx).expr.expressionRet); 
				}
			}

			setState(378);
			match(SEMICOLLON);
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

	public static class MethodCallStatementContext extends ParserRuleContext {
		public MethodCallStmt methodCallStatementRet;
		public MethodCallContext mc;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((MethodCallStatementContext)_localctx).mc = methodCall();
			setState(381);
			match(SEMICOLLON);

			        ((MethodCallStatementContext)_localctx).methodCallStatementRet =  new MethodCallStmt(((MethodCallStatementContext)_localctx).mc.methodCallRet);
			        _localctx.methodCallStatementRet.setLine(((MethodCallStatementContext)_localctx).mc.methodCallRet.getLine());
			    
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

	public static class MethodCallContext extends ParserRuleContext {
		public MethodCall methodCallRet;
		public Expression instanceExpr;
		public OtherExpressionContext initexpr;
		public Token lprinst;
		public MethodCallArgumentsContext mcainst;
		public IdentifierContext idn;
		public Token lbr;
		public ExpressionContext expr;
		public Token lprarg;
		public MethodCallArgumentsContext mca;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			((MethodCallContext)_localctx).initexpr = otherExpression();
			 ((MethodCallContext)_localctx).instanceExpr =  ((MethodCallContext)_localctx).initexpr.otherExpressionRet; 
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(400);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(386);
						((MethodCallContext)_localctx).lprinst = match(LPAR);
						setState(387);
						((MethodCallContext)_localctx).mcainst = methodCallArguments();
						setState(388);
						match(RPAR);

						            ((MethodCallContext)_localctx).instanceExpr =  new MethodCall(_localctx.instanceExpr, ((MethodCallContext)_localctx).mcainst.methodCallArgumentsRet);
						            _localctx.instanceExpr.setLine(((MethodCallContext)_localctx).lprinst.getLine());
						        
						}
						}
						break;
					case DOT:
						{
						{
						setState(391);
						match(DOT);
						setState(392);
						((MethodCallContext)_localctx).idn = identifier();

						            ((MethodCallContext)_localctx).instanceExpr =  new ObjectOrListMemberAccess(_localctx.instanceExpr, ((MethodCallContext)_localctx).idn.identifierRet);
						            _localctx.instanceExpr.setLine(((MethodCallContext)_localctx).idn.identifierRet.getLine());
						        
						}
						}
						break;
					case LBRACK:
						{
						{
						setState(395);
						((MethodCallContext)_localctx).lbr = match(LBRACK);
						setState(396);
						((MethodCallContext)_localctx).expr = expression();
						setState(397);
						match(RBRACK);

						            ((MethodCallContext)_localctx).instanceExpr =  new ListAccessByIndex(_localctx.instanceExpr, ((MethodCallContext)_localctx).expr.expressionRet);
						            _localctx.instanceExpr.setLine(((MethodCallContext)_localctx).lbr.getLine());
						        
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			{
			setState(405);
			((MethodCallContext)_localctx).lprarg = match(LPAR);
			setState(406);
			((MethodCallContext)_localctx).mca = methodCallArguments();
			setState(407);
			match(RPAR);
			}

			        ((MethodCallContext)_localctx).methodCallRet =  new MethodCall(_localctx.instanceExpr, ((MethodCallContext)_localctx).mca.methodCallArgumentsRet);
			        _localctx.methodCallRet.setLine(((MethodCallContext)_localctx).lprarg.getLine());
			    
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

	public static class MethodCallArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> methodCallArgumentsRet;
		public ExpressionContext fexpr;
		public ExpressionContext oexpr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SophiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SophiaParser.COMMA, i);
		}
		public MethodCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMethodCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMethodCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMethodCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallArgumentsContext methodCallArguments() throws RecognitionException {
		MethodCallArgumentsContext _localctx = new MethodCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodCallArgumentsContext)_localctx).methodCallArgumentsRet =  new ArrayList<Expression>(); 
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(412);
				((MethodCallArgumentsContext)_localctx).fexpr = expression();
				 _localctx.methodCallArgumentsRet.add(((MethodCallArgumentsContext)_localctx).fexpr.expressionRet); 
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(414);
					match(COMMA);
					setState(415);
					((MethodCallArgumentsContext)_localctx).oexpr = expression();
					 _localctx.methodCallArgumentsRet.add(((MethodCallArgumentsContext)_localctx).oexpr.expressionRet); 
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ContinueBreakStatementContext extends ParserRuleContext {
		public Statement continueBreakStatementRet;
		public Token br;
		public Token cont;
		public TerminalNode SEMICOLLON() { return getToken(SophiaParser.SEMICOLLON, 0); }
		public TerminalNode BREAK() { return getToken(SophiaParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SophiaParser.CONTINUE, 0); }
		public ContinueBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterContinueBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitContinueBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitContinueBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakStatementContext continueBreakStatement() throws RecognitionException {
		ContinueBreakStatementContext _localctx = new ContinueBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_continueBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(425);
				((ContinueBreakStatementContext)_localctx).br = match(BREAK);
				 ((ContinueBreakStatementContext)_localctx).continueBreakStatementRet =  new BreakStmt(); _localctx.continueBreakStatementRet.setLine(((ContinueBreakStatementContext)_localctx).br.getLine());
				}
				break;
			case CONTINUE:
				{
				setState(427);
				((ContinueBreakStatementContext)_localctx).cont = match(CONTINUE);
				((ContinueBreakStatementContext)_localctx).continueBreakStatementRet =  new ContinueStmt(); _localctx.continueBreakStatementRet.setLine(((ContinueBreakStatementContext)_localctx).cont.getLine());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(431);
			match(SEMICOLLON);
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

	public static class ForStatementContext extends ParserRuleContext {
		public ForStmt forStatementRet;
		public Token forr;
		public AssignmentContext initassgn;
		public ExpressionContext condexpr;
		public AssignmentContext updateassgn;
		public StatementContext bodystmt;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public List<TerminalNode> SEMICOLLON() { return getTokens(SophiaParser.SEMICOLLON); }
		public TerminalNode SEMICOLLON(int i) {
			return getToken(SophiaParser.SEMICOLLON, i);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode FOR() { return getToken(SophiaParser.FOR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			((ForStatementContext)_localctx).forr = match(FOR);

			        ((ForStatementContext)_localctx).forStatementRet =  new ForStmt();
			        _localctx.forStatementRet.setLine(((ForStatementContext)_localctx).forr.getLine());
			    
			setState(435);
			match(LPAR);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(436);
				((ForStatementContext)_localctx).initassgn = assignment();
				 _localctx.forStatementRet.setInitialize(((ForStatementContext)_localctx).initassgn.assignmentRet); 
				}
			}

			setState(441);
			match(SEMICOLLON);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(442);
				((ForStatementContext)_localctx).condexpr = expression();
				 _localctx.forStatementRet.setCondition(((ForStatementContext)_localctx).condexpr.expressionRet); 
				}
			}

			setState(447);
			match(SEMICOLLON);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << MINUS) | (1L << NOT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(448);
				((ForStatementContext)_localctx).updateassgn = assignment();
				 _localctx.forStatementRet.setUpdate(((ForStatementContext)_localctx).updateassgn.assignmentRet); 
				}
			}

			setState(453);
			match(RPAR);
			setState(454);
			((ForStatementContext)_localctx).bodystmt = statement();
			 _localctx.forStatementRet.setBody(((ForStatementContext)_localctx).bodystmt.statementRet); 
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public ForeachStmt foreachStatementRet;
		public Token forch;
		public IdentifierContext idn;
		public ExpressionContext listexpr;
		public StatementContext bodystmt;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode IN() { return getToken(SophiaParser.IN, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode FOREACH() { return getToken(SophiaParser.FOREACH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			((ForeachStatementContext)_localctx).forch = match(FOREACH);
			setState(458);
			match(LPAR);
			setState(459);
			((ForeachStatementContext)_localctx).idn = identifier();
			setState(460);
			match(IN);
			setState(461);
			((ForeachStatementContext)_localctx).listexpr = expression();

			        ((ForeachStatementContext)_localctx).foreachStatementRet =  new ForeachStmt(((ForeachStatementContext)_localctx).idn.identifierRet, ((ForeachStatementContext)_localctx).listexpr.expressionRet);
			        _localctx.foreachStatementRet.setLine(((ForeachStatementContext)_localctx).forch.getLine());
			    
			setState(463);
			match(RPAR);
			setState(464);
			((ForeachStatementContext)_localctx).bodystmt = statement();
			 _localctx.foreachStatementRet.setBody(((ForeachStatementContext)_localctx).bodystmt.statementRet); 
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt ifStatementRet;
		public Token iff;
		public ExpressionContext condexpr;
		public StatementContext thenstmt;
		public StatementContext elsestmt;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode IF() { return getToken(SophiaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SophiaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			((IfStatementContext)_localctx).iff = match(IF);
			setState(468);
			match(LPAR);
			setState(469);
			((IfStatementContext)_localctx).condexpr = expression();
			setState(470);
			match(RPAR);
			setState(471);
			((IfStatementContext)_localctx).thenstmt = statement();

			        ((IfStatementContext)_localctx).ifStatementRet =  new ConditionalStmt(((IfStatementContext)_localctx).condexpr.expressionRet, ((IfStatementContext)_localctx).thenstmt.statementRet);
			        _localctx.ifStatementRet.setLine(((IfStatementContext)_localctx).iff.getLine());
			    
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(473);
				match(ELSE);
				setState(474);
				((IfStatementContext)_localctx).elsestmt = statement();
				 _localctx.ifStatementRet.setElseBody(((IfStatementContext)_localctx).elsestmt.statementRet); 
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public OrExpressionContext ore;
		public Token as;
		public ExpressionContext asexpr;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			((ExpressionContext)_localctx).ore = orExpression();
			 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).ore.orExpressionRet; 
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(481);
				((ExpressionContext)_localctx).as = match(ASSIGN);
				setState(482);
				((ExpressionContext)_localctx).asexpr = expression();

				        ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(_localctx.expressionRet, ((ExpressionContext)_localctx).asexpr.expressionRet, BinaryOperator.assign);
				        _localctx.expressionRet.setLine(((ExpressionContext)_localctx).as.getLine());
				     
				}
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExpressionRet;
		public AndExpressionContext fae;
		public Token orr;
		public AndExpressionContext oae;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SophiaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SophiaParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			((OrExpressionContext)_localctx).fae = andExpression();
			 ((OrExpressionContext)_localctx).orExpressionRet =  ((OrExpressionContext)_localctx).fae.andExpressionRet; 
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(489);
				((OrExpressionContext)_localctx).orr = match(OR);
				setState(490);
				((OrExpressionContext)_localctx).oae = andExpression();

				        ((OrExpressionContext)_localctx).orExpressionRet =  new BinaryExpression(_localctx.orExpressionRet, ((OrExpressionContext)_localctx).oae.andExpressionRet, BinaryOperator.or);
				        _localctx.orExpressionRet.setLine(((OrExpressionContext)_localctx).orr.getLine());
				    
				}
				}
				setState(497);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExpressionRet;
		public EqualityExpressionContext fee;
		public Token andd;
		public EqualityExpressionContext oee;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SophiaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SophiaParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			((AndExpressionContext)_localctx).fee = equalityExpression();
			 ((AndExpressionContext)_localctx).andExpressionRet =  ((AndExpressionContext)_localctx).fee.equalityExpressionRet; 
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(500);
				((AndExpressionContext)_localctx).andd = match(AND);
				setState(501);
				((AndExpressionContext)_localctx).oee = equalityExpression();

				        ((AndExpressionContext)_localctx).andExpressionRet =  new BinaryExpression(_localctx.andExpressionRet, ((AndExpressionContext)_localctx).oee.equalityExpressionRet, BinaryOperator.and);
				        _localctx.andExpressionRet.setLine(((AndExpressionContext)_localctx).andd.getLine());
				    
				}
				}
				setState(508);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression equalityExpressionRet;
		public BinaryOperator binop;
		public int linenum;
		public RelationalExpressionContext fre;
		public Token eqq;
		public Token neqq;
		public RelationalExpressionContext ore;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SophiaParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SophiaParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(SophiaParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(SophiaParser.NOT_EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			((EqualityExpressionContext)_localctx).fre = relationalExpression();
			 ((EqualityExpressionContext)_localctx).equalityExpressionRet =  ((EqualityExpressionContext)_localctx).fre.relationalExpressionRet; 
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT_EQUAL || _la==EQUAL) {
				{
				{
				setState(515);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(511);
					((EqualityExpressionContext)_localctx).eqq = match(EQUAL);
					((EqualityExpressionContext)_localctx).binop =  BinaryOperator.eq; ((EqualityExpressionContext)_localctx).linenum =  ((EqualityExpressionContext)_localctx).eqq.getLine();
					}
					break;
				case NOT_EQUAL:
					{
					setState(513);
					((EqualityExpressionContext)_localctx).neqq = match(NOT_EQUAL);
					((EqualityExpressionContext)_localctx).binop =  BinaryOperator.neq; ((EqualityExpressionContext)_localctx).linenum =  ((EqualityExpressionContext)_localctx).neqq.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(517);
				((EqualityExpressionContext)_localctx).ore = relationalExpression();

				        ((EqualityExpressionContext)_localctx).equalityExpressionRet =  new BinaryExpression(_localctx.equalityExpressionRet, ((EqualityExpressionContext)_localctx).ore.relationalExpressionRet, _localctx.binop);
				        _localctx.equalityExpressionRet.setLine(_localctx.linenum);
				    
				}
				}
				setState(524);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression relationalExpressionRet;
		public BinaryOperator binop;
		public int linenum;
		public AdditiveExpressionContext fae;
		public Token gtt;
		public Token ltt;
		public AdditiveExpressionContext oae;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(SophiaParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(SophiaParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(SophiaParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(SophiaParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			((RelationalExpressionContext)_localctx).fae = additiveExpression();
			 ((RelationalExpressionContext)_localctx).relationalExpressionRet =  ((RelationalExpressionContext)_localctx).fae.additiveExpressionRet; 
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(531);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(527);
					((RelationalExpressionContext)_localctx).gtt = match(GREATER_THAN);
					((RelationalExpressionContext)_localctx).binop =  BinaryOperator.gt; ((RelationalExpressionContext)_localctx).linenum =  ((RelationalExpressionContext)_localctx).gtt.getLine();
					}
					break;
				case LESS_THAN:
					{
					setState(529);
					((RelationalExpressionContext)_localctx).ltt = match(LESS_THAN);
					((RelationalExpressionContext)_localctx).binop =  BinaryOperator.lt; ((RelationalExpressionContext)_localctx).linenum =  ((RelationalExpressionContext)_localctx).ltt.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(533);
				((RelationalExpressionContext)_localctx).oae = additiveExpression();

				        ((RelationalExpressionContext)_localctx).relationalExpressionRet =  new BinaryExpression(_localctx.relationalExpressionRet, ((RelationalExpressionContext)_localctx).oae.additiveExpressionRet, _localctx.binop);
				        _localctx.relationalExpressionRet.setLine(_localctx.linenum);
				    
				}
				}
				setState(540);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression additiveExpressionRet;
		public BinaryOperator binop;
		public int linenum;
		public MultiplicativeExpressionContext fme;
		public Token pp;
		public Token mm;
		public MultiplicativeExpressionContext ome;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SophiaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SophiaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SophiaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SophiaParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			((AdditiveExpressionContext)_localctx).fme = multiplicativeExpression();
			 ((AdditiveExpressionContext)_localctx).additiveExpressionRet =  ((AdditiveExpressionContext)_localctx).fme.multiplicativeExpressionRet; 
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(547);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(543);
					((AdditiveExpressionContext)_localctx).pp = match(PLUS);
					((AdditiveExpressionContext)_localctx).binop =  BinaryOperator.add; ((AdditiveExpressionContext)_localctx).linenum =  ((AdditiveExpressionContext)_localctx).pp.getLine();
					}
					break;
				case MINUS:
					{
					setState(545);
					((AdditiveExpressionContext)_localctx).mm = match(MINUS);
					((AdditiveExpressionContext)_localctx).binop =  BinaryOperator.sub; ((AdditiveExpressionContext)_localctx).linenum =  ((AdditiveExpressionContext)_localctx).mm.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(549);
				((AdditiveExpressionContext)_localctx).ome = multiplicativeExpression();

				        ((AdditiveExpressionContext)_localctx).additiveExpressionRet =  new BinaryExpression(_localctx.additiveExpressionRet, ((AdditiveExpressionContext)_localctx).ome.multiplicativeExpressionRet, _localctx.binop);
				        _localctx.additiveExpressionRet.setLine(_localctx.linenum);
				    
				}
				}
				setState(556);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression multiplicativeExpressionRet;
		public BinaryOperator binop;
		public int linenum;
		public PreUnaryExpressionContext fpue;
		public Token multt;
		public Token divv;
		public Token modd;
		public PreUnaryExpressionContext opue;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SophiaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SophiaParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SophiaParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SophiaParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SophiaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SophiaParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			((MultiplicativeExpressionContext)_localctx).fpue = preUnaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  ((MultiplicativeExpressionContext)_localctx).fpue.preUnaryExpressionRet; 
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(565);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(559);
					((MultiplicativeExpressionContext)_localctx).multt = match(MULT);
					((MultiplicativeExpressionContext)_localctx).binop =  BinaryOperator.mult; ((MultiplicativeExpressionContext)_localctx).linenum =  ((MultiplicativeExpressionContext)_localctx).multt.getLine();
					}
					break;
				case DIVIDE:
					{
					setState(561);
					((MultiplicativeExpressionContext)_localctx).divv = match(DIVIDE);
					((MultiplicativeExpressionContext)_localctx).binop =  BinaryOperator.div; ((MultiplicativeExpressionContext)_localctx).linenum =  ((MultiplicativeExpressionContext)_localctx).divv.getLine();
					}
					break;
				case MOD:
					{
					setState(563);
					((MultiplicativeExpressionContext)_localctx).modd = match(MOD);
					((MultiplicativeExpressionContext)_localctx).binop =  BinaryOperator.mod; ((MultiplicativeExpressionContext)_localctx).linenum =  ((MultiplicativeExpressionContext)_localctx).modd.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(567);
				((MultiplicativeExpressionContext)_localctx).opue = preUnaryExpression();

				        ((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  new BinaryExpression(_localctx.multiplicativeExpressionRet, ((MultiplicativeExpressionContext)_localctx).opue.preUnaryExpressionRet, _localctx.binop);
				        _localctx.multiplicativeExpressionRet.setLine(_localctx.linenum);
				    
				}
				}
				setState(574);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preUnaryExpressionRet;
		public UnaryOperator unop;
		public int linenum;
		public Token nt;
		public Token mn;
		public Token incc;
		public Token decc;
		public PreUnaryExpressionContext fpue;
		public PostUnaryExpressionContext opue;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SophiaParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(SophiaParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_preUnaryExpression);
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(583);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(575);
					((PreUnaryExpressionContext)_localctx).nt = match(NOT);
					 ((PreUnaryExpressionContext)_localctx).unop =  UnaryOperator.not; ((PreUnaryExpressionContext)_localctx).linenum =  ((PreUnaryExpressionContext)_localctx).nt.getLine(); 
					}
					break;
				case MINUS:
					{
					setState(577);
					((PreUnaryExpressionContext)_localctx).mn = match(MINUS);
					 ((PreUnaryExpressionContext)_localctx).unop =  UnaryOperator.minus; ((PreUnaryExpressionContext)_localctx).linenum =  ((PreUnaryExpressionContext)_localctx).mn.getLine(); 
					}
					break;
				case INCREMENT:
					{
					setState(579);
					((PreUnaryExpressionContext)_localctx).incc = match(INCREMENT);
					 ((PreUnaryExpressionContext)_localctx).unop =  UnaryOperator.preinc; ((PreUnaryExpressionContext)_localctx).linenum =  ((PreUnaryExpressionContext)_localctx).incc.getLine(); 
					}
					break;
				case DECREMENT:
					{
					setState(581);
					((PreUnaryExpressionContext)_localctx).decc = match(DECREMENT);
					 ((PreUnaryExpressionContext)_localctx).unop =  UnaryOperator.predec; ((PreUnaryExpressionContext)_localctx).linenum =  ((PreUnaryExpressionContext)_localctx).decc.getLine(); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(585);
				((PreUnaryExpressionContext)_localctx).fpue = preUnaryExpression();

				        ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).fpue.preUnaryExpressionRet, _localctx.unop);
				        _localctx.preUnaryExpressionRet.setLine(_localctx.linenum);
				    
				}
				}
				break;
			case NEW:
			case NULL:
			case TRUE:
			case FALSE:
			case THIS:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				((PreUnaryExpressionContext)_localctx).opue = postUnaryExpression();
				 ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  ((PreUnaryExpressionContext)_localctx).opue.postUnaryExpressionRet; 
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

	public static class PostUnaryExpressionContext extends ParserRuleContext {
		public Expression postUnaryExpressionRet;
		public UnaryOperator unop;
		public int linenum;
		public boolean hasPostOperators;
		public AccessExpressionContext ae;
		public Token incc;
		public Token decc;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(SophiaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SophiaParser.DECREMENT, 0); }
		public PostUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterPostUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitPostUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitPostUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryExpressionContext postUnaryExpression() throws RecognitionException {
		PostUnaryExpressionContext _localctx = new PostUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_postUnaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((PostUnaryExpressionContext)_localctx).hasPostOperators =  false;
			setState(594);
			((PostUnaryExpressionContext)_localctx).ae = accessExpression();
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				{
				setState(595);
				((PostUnaryExpressionContext)_localctx).incc = match(INCREMENT);
				 ((PostUnaryExpressionContext)_localctx).unop =  UnaryOperator.postinc; ((PostUnaryExpressionContext)_localctx).linenum =  ((PostUnaryExpressionContext)_localctx).incc.getLine(); ((PostUnaryExpressionContext)_localctx).hasPostOperators =  true; 
				}
				break;
			case DECREMENT:
				{
				setState(597);
				((PostUnaryExpressionContext)_localctx).decc = match(DECREMENT);
				 ((PostUnaryExpressionContext)_localctx).unop =  UnaryOperator.postdec; ((PostUnaryExpressionContext)_localctx).linenum =  ((PostUnaryExpressionContext)_localctx).decc.getLine(); ((PostUnaryExpressionContext)_localctx).hasPostOperators =  true; 
				}
				break;
			case GREATER_THAN:
			case LESS_THAN:
			case NOT_EQUAL:
			case EQUAL:
			case MULT:
			case DIVIDE:
			case MOD:
			case PLUS:
			case MINUS:
			case AND:
			case OR:
			case ASSIGN:
			case RPAR:
			case RBRACK:
			case COMMA:
			case SEMICOLLON:
				break;
			default:
				break;
			}

			        ((PostUnaryExpressionContext)_localctx).postUnaryExpressionRet =  _localctx.hasPostOperators? new UnaryExpression(((PostUnaryExpressionContext)_localctx).ae.accessExpressionRet, _localctx.unop) : ((PostUnaryExpressionContext)_localctx).ae.accessExpressionRet;
			        _localctx.postUnaryExpressionRet.setLine(_localctx.linenum);
			    
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExpressionRet;
		public OtherExpressionContext oe;
		public Token lpr;
		public MethodCallArgumentsContext mca;
		public IdentifierContext idn;
		public Token lbr;
		public ExpressionContext expr;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SophiaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SophiaParser.DOT, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SophiaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SophiaParser.RBRACK, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<MethodCallArgumentsContext> methodCallArguments() {
			return getRuleContexts(MethodCallArgumentsContext.class);
		}
		public MethodCallArgumentsContext methodCallArguments(int i) {
			return getRuleContext(MethodCallArgumentsContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SophiaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SophiaParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_accessExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			 ((AccessExpressionContext)_localctx).accessExpressionRet =  ((AccessExpressionContext)_localctx).oe.otherExpressionRet; 
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRACK) | (1L << DOT))) != 0)) {
				{
				setState(619);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
					{
					{
					setState(605);
					((AccessExpressionContext)_localctx).lpr = match(LPAR);
					setState(606);
					((AccessExpressionContext)_localctx).mca = methodCallArguments();
					setState(607);
					match(RPAR);

					        ((AccessExpressionContext)_localctx).accessExpressionRet =  new MethodCall(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).mca.methodCallArgumentsRet); //////////Not sure yet
					        _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).lpr.getLine());
					        
					}
					}
					break;
				case DOT:
					{
					{
					setState(610);
					match(DOT);
					setState(611);
					((AccessExpressionContext)_localctx).idn = identifier();

					        ((AccessExpressionContext)_localctx).accessExpressionRet =  new ObjectOrListMemberAccess(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).idn.identifierRet);
					        _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).idn.identifierRet.getLine());
					        
					}
					}
					break;
				case LBRACK:
					{
					{
					setState(614);
					((AccessExpressionContext)_localctx).lbr = match(LBRACK);
					setState(615);
					((AccessExpressionContext)_localctx).expr = expression();
					setState(616);
					match(RBRACK);

					        ((AccessExpressionContext)_localctx).accessExpressionRet =  new ListAccessByIndex(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).expr.expressionRet);
					        _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).lbr.getLine());
					        
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(623);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExpressionRet;
		public Token th;
		public NewExpressionContext ne;
		public ValuesContext va;
		public IdentifierContext idn;
		public ExpressionContext exp;
		public TerminalNode THIS() { return getToken(SophiaParser.THIS, 0); }
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_otherExpression);
		try {
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				((OtherExpressionContext)_localctx).th = match(THIS);
				 ((OtherExpressionContext)_localctx).otherExpressionRet =  new ThisClass(); _localctx.otherExpressionRet.setLine(((OtherExpressionContext)_localctx).th.getLine()); 
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				((OtherExpressionContext)_localctx).ne = newExpression();
				 ((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).ne.newExpressionRet; 
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case LBRACK:
			case INT_VALUE:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				((OtherExpressionContext)_localctx).va = values();
				 ((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).va.valuesRet; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(632);
				((OtherExpressionContext)_localctx).idn = identifier();
				 ((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).idn.identifierRet; 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(635);
				match(LPAR);
				{
				setState(636);
				((OtherExpressionContext)_localctx).exp = expression();
				}
				setState(637);
				match(RPAR);
				 ((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).exp.expressionRet; 
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

	public static class NewExpressionContext extends ParserRuleContext {
		public NewClassInstance newExpressionRet;
		public Token nw;
		public ClassTypeContext ct;
		public MethodCallArgumentsContext mca;
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode NEW() { return getToken(SophiaParser.NEW, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			((NewExpressionContext)_localctx).nw = match(NEW);
			setState(643);
			((NewExpressionContext)_localctx).ct = classType();
			setState(644);
			match(LPAR);
			setState(645);
			((NewExpressionContext)_localctx).mca = methodCallArguments();
			setState(646);
			match(RPAR);

			        ((NewExpressionContext)_localctx).newExpressionRet =  new NewClassInstance(((NewExpressionContext)_localctx).ct.classTypeRet, ((NewExpressionContext)_localctx).mca.methodCallArgumentsRet);
			        _localctx.newExpressionRet.setLine(((NewExpressionContext)_localctx).nw.getLine());
			    
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

	public static class ValuesContext extends ParserRuleContext {
		public Value valuesRet;
		public BoolValueContext bv;
		public Token sv;
		public Token iv;
		public Token nu;
		public ListValueContext lv;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(SophiaParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(SophiaParser.INT_VALUE, 0); }
		public TerminalNode NULL() { return getToken(SophiaParser.NULL, 0); }
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_values);
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				((ValuesContext)_localctx).bv = boolValue();
				 ((ValuesContext)_localctx).valuesRet =  ((ValuesContext)_localctx).bv.boolValueRet; 
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				((ValuesContext)_localctx).sv = match(STRING_VALUE);
				 ((ValuesContext)_localctx).valuesRet =  new StringValue((((ValuesContext)_localctx).sv!=null?((ValuesContext)_localctx).sv.getText():null)); _localctx.valuesRet.setLine(((ValuesContext)_localctx).sv.getLine()); 
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				((ValuesContext)_localctx).iv = match(INT_VALUE);
				 ((ValuesContext)_localctx).valuesRet =  new IntValue((((ValuesContext)_localctx).iv!=null?Integer.valueOf(((ValuesContext)_localctx).iv.getText()):0)); _localctx.valuesRet.setLine(((ValuesContext)_localctx).iv.getLine()); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				((ValuesContext)_localctx).nu = match(NULL);
				 ((ValuesContext)_localctx).valuesRet =  new NullValue(); _localctx.valuesRet.setLine(((ValuesContext)_localctx).nu.getLine()); 
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(658);
				((ValuesContext)_localctx).lv = listValue();
				 ((ValuesContext)_localctx).valuesRet =  ((ValuesContext)_localctx).lv.listValueRet; 
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

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue boolValueRet;
		public Token tr;
		public Token fa;
		public TerminalNode TRUE() { return getToken(SophiaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SophiaParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_boolValue);
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				((BoolValueContext)_localctx).tr = match(TRUE);
				 ((BoolValueContext)_localctx).boolValueRet =  new BoolValue(true); _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).tr.getLine()); 
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				((BoolValueContext)_localctx).fa = match(FALSE);
				 ((BoolValueContext)_localctx).boolValueRet =  new BoolValue(false); _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).fa.getLine()); 
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

	public static class ListValueContext extends ParserRuleContext {
		public ListValue listValueRet;
		public Token lbr;
		public MethodCallArgumentsContext mca;
		public TerminalNode RBRACK() { return getToken(SophiaParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(SophiaParser.LBRACK, 0); }
		public MethodCallArgumentsContext methodCallArguments() {
			return getRuleContext(MethodCallArgumentsContext.class,0);
		}
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitListValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitListValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_listValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			((ListValueContext)_localctx).lbr = match(LBRACK);
			setState(670);
			((ListValueContext)_localctx).mca = methodCallArguments();
			setState(671);
			match(RBRACK);

			        ((ListValueContext)_localctx).listValueRet =  new ListValue(((ListValueContext)_localctx).mca.methodCallArgumentsRet);
			        _localctx.listValueRet.setLine(((ListValueContext)_localctx).lbr.getLine());
			    
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public Token idn;
		public TerminalNode IDENTIFIER() { return getToken(SophiaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			((IdentifierContext)_localctx).idn = match(IDENTIFIER);

			        ((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).idn!=null?((IdentifierContext)_localctx).idn.getText():null));
			        _localctx.identifierRet.setLine(((IdentifierContext)_localctx).idn.getLine());
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u02a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3g\n\3\f\3\16"+
		"\3j\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4s\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0089"+
		"\n\4\f\4\16\4\u008c\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0094\n\4\f\4\16"+
		"\4\u0097\13\4\5\4\u0099\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00a8\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00c6\n\b\f\b\16\b\u00c9\13\b\5\b\u00cb\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00de\n\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ed\n\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u00f8\n\r\f\r\16\r\u00fb\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0103\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u010d\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0115\n\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0120\n\20\f\20\16\20\u0123"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012b\n\21\3\22\3\22\3\22\7"+
		"\22\u0130\n\22\f\22\16\22\u0133\13\22\3\22\3\22\3\22\7\22\u0138\n\22\f"+
		"\22\16\22\u013b\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0158\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u015f\n"+
		"\24\f\24\16\24\u0162\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u017b\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0193\n\32"+
		"\f\32\16\32\u0196\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\7\33\u01a5\n\33\f\33\16\33\u01a8\13\33\5\33\u01aa\n"+
		"\33\3\34\3\34\3\34\3\34\5\34\u01b0\n\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01ba\n\35\3\35\3\35\3\35\3\35\5\35\u01c0\n\35\3\35\3"+
		"\35\3\35\3\35\5\35\u01c6\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u01e0\n\37\3 \3 \3 \3 \3 \3 \5 \u01e8\n \3!\3!\3!\3!\3"+
		"!\3!\7!\u01f0\n!\f!\16!\u01f3\13!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01fb\n"+
		"\"\f\"\16\"\u01fe\13\"\3#\3#\3#\3#\3#\3#\5#\u0206\n#\3#\3#\3#\7#\u020b"+
		"\n#\f#\16#\u020e\13#\3$\3$\3$\3$\3$\3$\5$\u0216\n$\3$\3$\3$\7$\u021b\n"+
		"$\f$\16$\u021e\13$\3%\3%\3%\3%\3%\3%\5%\u0226\n%\3%\3%\3%\7%\u022b\n%"+
		"\f%\16%\u022e\13%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0238\n&\3&\3&\3&\7&\u023d"+
		"\n&\f&\16&\u0240\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u024a\n\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u0252\n\'\3(\3(\3(\3(\3(\3(\5(\u025a\n(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u026e\n)\f)\16)\u0271"+
		"\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0283\n*\3+\3"+
		"+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0298\n,\3-\3"+
		"-\3-\3-\5-\u029e\n-\3.\3.\3.\3.\3.\3/\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\2\2\u02c4"+
		"\2^\3\2\2\2\4b\3\2\2\2\6k\3\2\2\2\b\u009c\3\2\2\2\n\u00a2\3\2\2\2\f\u00b3"+
		"\3\2\2\2\16\u00be\3\2\2\2\20\u00cc\3\2\2\2\22\u00dd\3\2\2\2\24\u00df\3"+
		"\2\2\2\26\u00e2\3\2\2\2\30\u00f0\3\2\2\2\32\u0102\3\2\2\2\34\u0104\3\2"+
		"\2\2\36\u0118\3\2\2\2 \u012a\3\2\2\2\"\u0131\3\2\2\2$\u0157\3\2\2\2&\u0159"+
		"\3\2\2\2(\u0165\3\2\2\2*\u0169\3\2\2\2,\u016e\3\2\2\2.\u0175\3\2\2\2\60"+
		"\u017e\3\2\2\2\62\u0182\3\2\2\2\64\u019d\3\2\2\2\66\u01af\3\2\2\28\u01b3"+
		"\3\2\2\2:\u01cb\3\2\2\2<\u01d5\3\2\2\2>\u01e1\3\2\2\2@\u01e9\3\2\2\2B"+
		"\u01f4\3\2\2\2D\u01ff\3\2\2\2F\u020f\3\2\2\2H\u021f\3\2\2\2J\u022f\3\2"+
		"\2\2L\u0251\3\2\2\2N\u0253\3\2\2\2P\u025d\3\2\2\2R\u0282\3\2\2\2T\u0284"+
		"\3\2\2\2V\u0297\3\2\2\2X\u029d\3\2\2\2Z\u029f\3\2\2\2\\\u02a4\3\2\2\2"+
		"^_\5\4\3\2_`\b\2\1\2`a\7\2\2\3a\3\3\2\2\2bh\b\3\1\2cd\5\6\4\2de\b\3\1"+
		"\2eg\3\2\2\2fc\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\5\3\2\2\2jh\3\2"+
		"\2\2kl\7\5\2\2lm\5\\/\2mr\b\4\1\2no\7\4\2\2op\5\\/\2pq\b\4\1\2qs\3\2\2"+
		"\2rn\3\2\2\2rs\3\2\2\2st\3\2\2\2t\u0098\7/\2\2uv\5\b\5\2vw\b\4\1\2w|\3"+
		"\2\2\2xy\5\n\6\2yz\b\4\1\2z|\3\2\2\2{u\3\2\2\2{x\3\2\2\2|\177\3\2\2\2"+
		"}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\5\f\7\2\u0081"+
		"\u008a\b\4\1\2\u0082\u0083\5\b\5\2\u0083\u0084\b\4\1\2\u0084\u0089\3\2"+
		"\2\2\u0085\u0086\5\n\6\2\u0086\u0087\b\4\1\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0082\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u0099\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\5\b\5\2\u008e\u008f\b\4\1\2\u008f\u0094\3\2\2\2\u0090\u0091\5\n"+
		"\6\2\u0091\u0092\b\4\1\2\u0092\u0094\3\2\2\2\u0093\u008d\3\2\2\2\u0093"+
		"\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098}\3\2\2\2\u0098\u0095"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\60\2\2\u009b\7\3\2\2\2\u009c"+
		"\u009d\5\\/\2\u009d\u009e\7\64\2\2\u009e\u009f\5\22\n\2\u009f\u00a0\7"+
		"\65\2\2\u00a0\u00a1\b\5\1\2\u00a1\t\3\2\2\2\u00a2\u00a3\b\6\1\2\u00a3"+
		"\u00a7\7\3\2\2\u00a4\u00a8\5\22\n\2\u00a5\u00a6\7\24\2\2\u00a6\u00a8\b"+
		"\6\1\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\5\\/\2\u00aa\u00ab\b\6\1\2\u00ab\u00ac\7+\2\2\u00ac\u00ad\5\16"+
		"\b\2\u00ad\u00ae\b\6\1\2\u00ae\u00af\7,\2\2\u00af\u00b0\7/\2\2\u00b0\u00b1"+
		"\5\"\22\2\u00b1\u00b2\7\60\2\2\u00b2\13\3\2\2\2\u00b3\u00b4\7\3\2\2\u00b4"+
		"\u00b5\5\\/\2\u00b5\u00b6\b\7\1\2\u00b6\u00b7\7+\2\2\u00b7\u00b8\5\16"+
		"\b\2\u00b8\u00b9\b\7\1\2\u00b9\u00ba\7,\2\2\u00ba\u00bb\7/\2\2\u00bb\u00bc"+
		"\5\"\22\2\u00bc\u00bd\7\60\2\2\u00bd\r\3\2\2\2\u00be\u00ca\b\b\1\2\u00bf"+
		"\u00c0\5\20\t\2\u00c0\u00c7\b\b\1\2\u00c1\u00c2\7\62\2\2\u00c2\u00c3\5"+
		"\20\t\2\u00c3\u00c4\b\b\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00bf\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\17\3\2\2\2\u00cc\u00cd\5\\/\2\u00cd\u00ce\7\64\2\2\u00ce\u00cf\5\22\n"+
		"\2\u00cf\u00d0\b\t\1\2\u00d0\21\3\2\2\2\u00d1\u00d2\5 \21\2\u00d2\u00d3"+
		"\b\n\1\2\u00d3\u00de\3\2\2\2\u00d4\u00d5\5\26\f\2\u00d5\u00d6\b\n\1\2"+
		"\u00d6\u00de\3\2\2\2\u00d7\u00d8\5\34\17\2\u00d8\u00d9\b\n\1\2\u00d9\u00de"+
		"\3\2\2\2\u00da\u00db\5\24\13\2\u00db\u00dc\b\n\1\2\u00dc\u00de\3\2\2\2"+
		"\u00dd\u00d1\3\2\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00da"+
		"\3\2\2\2\u00de\23\3\2\2\2\u00df\u00e0\5\\/\2\u00e0\u00e1\b\13\1\2\u00e1"+
		"\25\3\2\2\2\u00e2\u00e3\7\26\2\2\u00e3\u00ec\7+\2\2\u00e4\u00e5\7\66\2"+
		"\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7\5\22\n\2\u00e7\u00e8\b\f\1\2\u00e8"+
		"\u00ed\3\2\2\2\u00e9\u00ea\5\30\r\2\u00ea\u00eb\b\f\1\2\u00eb\u00ed\3"+
		"\2\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\7,\2\2\u00ef\27\3\2\2\2\u00f0\u00f1\b\r\1\2\u00f1\u00f2\5\32\16"+
		"\2\u00f2\u00f9\b\r\1\2\u00f3\u00f4\7\62\2\2\u00f4\u00f5\5\32\16\2\u00f5"+
		"\u00f6\b\r\1\2\u00f6\u00f8\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\31\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fd\5\20\t\2\u00fd\u00fe\b\16\1\2\u00fe\u0103\3\2\2\2"+
		"\u00ff\u0100\5\22\n\2\u0100\u0101\b\16\1\2\u0101\u0103\3\2\2\2\u0102\u00fc"+
		"\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\33\3\2\2\2\u0104\u0105\b\17\1\2\u0105"+
		"\u0106\7\7\2\2\u0106\u010c\7\34\2\2\u0107\u0108\7\24\2\2\u0108\u010d\b"+
		"\17\1\2\u0109\u010a\5\36\20\2\u010a\u010b\b\17\1\2\u010b\u010d\3\2\2\2"+
		"\u010c\u0107\3\2\2\2\u010c\u0109\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0114"+
		"\7\32\2\2\u010f\u0110\7\24\2\2\u0110\u0115\b\17\1\2\u0111\u0112\5\22\n"+
		"\2\u0112\u0113\b\17\1\2\u0113\u0115\3\2\2\2\u0114\u010f\3\2\2\2\u0114"+
		"\u0111\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\33\2\2\u0117\35\3\2\2"+
		"\2\u0118\u0119\b\20\1\2\u0119\u011a\5\22\n\2\u011a\u0121\b\20\1\2\u011b"+
		"\u011c\7\62\2\2\u011c\u011d\5\22\n\2\u011d\u011e\b\20\1\2\u011e\u0120"+
		"\3\2\2\2\u011f\u011b\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\37\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\23\2"+
		"\2\u0125\u012b\b\21\1\2\u0126\u0127\7\22\2\2\u0127\u012b\b\21\1\2\u0128"+
		"\u0129\7\21\2\2\u0129\u012b\b\21\1\2\u012a\u0124\3\2\2\2\u012a\u0126\3"+
		"\2\2\2\u012a\u0128\3\2\2\2\u012b!\3\2\2\2\u012c\u012d\5\b\5\2\u012d\u012e"+
		"\b\22\1\2\u012e\u0130\3\2\2\2\u012f\u012c\3\2\2\2\u0130\u0133\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0139\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0135\5$\23\2\u0135\u0136\b\22\1\2\u0136\u0138\3\2\2\2"+
		"\u0137\u0134\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a#\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\58\35\2\u013d"+
		"\u013e\b\23\1\2\u013e\u0158\3\2\2\2\u013f\u0140\5:\36\2\u0140\u0141\b"+
		"\23\1\2\u0141\u0158\3\2\2\2\u0142\u0143\5<\37\2\u0143\u0144\b\23\1\2\u0144"+
		"\u0158\3\2\2\2\u0145\u0146\5(\25\2\u0146\u0147\b\23\1\2\u0147\u0158\3"+
		"\2\2\2\u0148\u0149\5,\27\2\u0149\u014a\b\23\1\2\u014a\u0158\3\2\2\2\u014b"+
		"\u014c\5\66\34\2\u014c\u014d\b\23\1\2\u014d\u0158\3\2\2\2\u014e\u014f"+
		"\5\60\31\2\u014f\u0150\b\23\1\2\u0150\u0158\3\2\2\2\u0151\u0152\5.\30"+
		"\2\u0152\u0153\b\23\1\2\u0153\u0158\3\2\2\2\u0154\u0155\5&\24\2\u0155"+
		"\u0156\b\23\1\2\u0156\u0158\3\2\2\2\u0157\u013c\3\2\2\2\u0157\u013f\3"+
		"\2\2\2\u0157\u0142\3\2\2\2\u0157\u0145\3\2\2\2\u0157\u0148\3\2\2\2\u0157"+
		"\u014b\3\2\2\2\u0157\u014e\3\2\2\2\u0157\u0151\3\2\2\2\u0157\u0154\3\2"+
		"\2\2\u0158%\3\2\2\2\u0159\u015a\7/\2\2\u015a\u0160\b\24\1\2\u015b\u015c"+
		"\5$\23\2\u015c\u015d\b\24\1\2\u015d\u015f\3\2\2\2\u015e\u015b\3\2\2\2"+
		"\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7\60\2\2\u0164\'\3\2\2\2\u0165"+
		"\u0166\5*\26\2\u0166\u0167\b\25\1\2\u0167\u0168\7\65\2\2\u0168)\3\2\2"+
		"\2\u0169\u016a\5@!\2\u016a\u016b\7(\2\2\u016b\u016c\5> \2\u016c\u016d"+
		"\b\26\1\2\u016d+\3\2\2\2\u016e\u016f\7\6\2\2\u016f\u0170\7+\2\2\u0170"+
		"\u0171\5> \2\u0171\u0172\7,\2\2\u0172\u0173\7\65\2\2\u0173\u0174\b\27"+
		"\1\2\u0174-\3\2\2\2\u0175\u0176\7\13\2\2\u0176\u017a\b\30\1\2\u0177\u0178"+
		"\5> \2\u0178\u0179\b\30\1\2\u0179\u017b\3\2\2\2\u017a\u0177\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7\65\2\2\u017d/\3\2\2\2"+
		"\u017e\u017f\5\62\32\2\u017f\u0180\7\65\2\2\u0180\u0181\b\31\1\2\u0181"+
		"\61\3\2\2\2\u0182\u0183\5R*\2\u0183\u0194\b\32\1\2\u0184\u0185\7+\2\2"+
		"\u0185\u0186\5\64\33\2\u0186\u0187\7,\2\2\u0187\u0188\b\32\1\2\u0188\u0193"+
		"\3\2\2\2\u0189\u018a\7\63\2\2\u018a\u018b\5\\/\2\u018b\u018c\b\32\1\2"+
		"\u018c\u0193\3\2\2\2\u018d\u018e\7-\2\2\u018e\u018f\5> \2\u018f\u0190"+
		"\7.\2\2\u0190\u0191\b\32\1\2\u0191\u0193\3\2\2\2\u0192\u0184\3\2\2\2\u0192"+
		"\u0189\3\2\2\2\u0192\u018d\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u0198\7+\2\2\u0198\u0199\5\64\33\2\u0199\u019a\7,\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u019c\b\32\1\2\u019c\63\3\2\2\2\u019d\u01a9\b\33\1\2\u019e"+
		"\u019f\5> \2\u019f\u01a6\b\33\1\2\u01a0\u01a1\7\62\2\2\u01a1\u01a2\5>"+
		" \2\u01a2\u01a3\b\33\1\2\u01a3\u01a5\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a9\u019e\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\65\3\2\2\2\u01ab\u01ac\7\n\2\2\u01ac\u01b0\b\34\1\2\u01ad\u01ae\7\t\2"+
		"\2\u01ae\u01b0\b\34\1\2\u01af\u01ab\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b2\7\65\2\2\u01b2\67\3\2\2\2\u01b3\u01b4\7\16"+
		"\2\2\u01b4\u01b5\b\35\1\2\u01b5\u01b9\7+\2\2\u01b6\u01b7\5*\26\2\u01b7"+
		"\u01b8\b\35\1\2\u01b8\u01ba\3\2\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01ba\3"+
		"\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bf\7\65\2\2\u01bc\u01bd\5> \2\u01bd"+
		"\u01be\b\35\1\2\u01be\u01c0\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01c0\3"+
		"\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5\7\65\2\2\u01c2\u01c3\5*\26\2\u01c3"+
		"\u01c4\b\35\1\2\u01c4\u01c6\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c5\u01c6\3"+
		"\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7,\2\2\u01c8\u01c9\5$\23\2\u01c9"+
		"\u01ca\b\35\1\2\u01ca9\3\2\2\2\u01cb\u01cc\7\f\2\2\u01cc\u01cd\7+\2\2"+
		"\u01cd\u01ce\5\\/\2\u01ce\u01cf\7\r\2\2\u01cf\u01d0\5> \2\u01d0\u01d1"+
		"\b\36\1\2\u01d1\u01d2\7,\2\2\u01d2\u01d3\5$\23\2\u01d3\u01d4\b\36\1\2"+
		"\u01d4;\3\2\2\2\u01d5\u01d6\7\17\2\2\u01d6\u01d7\7+\2\2\u01d7\u01d8\5"+
		"> \2\u01d8\u01d9\7,\2\2\u01d9\u01da\5$\23\2\u01da\u01df\b\37\1\2\u01db"+
		"\u01dc\7\20\2\2\u01dc\u01dd\5$\23\2\u01dd\u01de\b\37\1\2\u01de\u01e0\3"+
		"\2\2\2\u01df\u01db\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0=\3\2\2\2\u01e1\u01e2"+
		"\5@!\2\u01e2\u01e7\b \1\2\u01e3\u01e4\7(\2\2\u01e4\u01e5\5> \2\u01e5\u01e6"+
		"\b \1\2\u01e6\u01e8\3\2\2\2\u01e7\u01e3\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"?\3\2\2\2\u01e9\u01ea\5B\"\2\u01ea\u01f1\b!\1\2\u01eb\u01ec\7%\2\2\u01ec"+
		"\u01ed\5B\"\2\u01ed\u01ee\b!\1\2\u01ee\u01f0\3\2\2\2\u01ef\u01eb\3\2\2"+
		"\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2A"+
		"\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\5D#\2\u01f5\u01fc\b\"\1\2\u01f6"+
		"\u01f7\7$\2\2\u01f7\u01f8\5D#\2\u01f8\u01f9\b\"\1\2\u01f9\u01fb\3\2\2"+
		"\2\u01fa\u01f6\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd"+
		"\3\2\2\2\u01fdC\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\5F$\2\u0200\u020c"+
		"\b#\1\2\u0201\u0202\7\36\2\2\u0202\u0206\b#\1\2\u0203\u0204\7\35\2\2\u0204"+
		"\u0206\b#\1\2\u0205\u0201\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0208\5F$\2\u0208\u0209\b#\1\2\u0209\u020b\3\2\2\2\u020a\u0205"+
		"\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"E\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\5H%\2\u0210\u021c\b$\1\2\u0211"+
		"\u0212\7\33\2\2\u0212\u0216\b$\1\2\u0213\u0214\7\34\2\2\u0214\u0216\b"+
		"$\1\2\u0215\u0211\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0218\5H%\2\u0218\u0219\b$\1\2\u0219\u021b\3\2\2\2\u021a\u0215\3\2\2"+
		"\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021dG"+
		"\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\5J&\2\u0220\u022c\b%\1\2\u0221"+
		"\u0222\7\"\2\2\u0222\u0226\b%\1\2\u0223\u0224\7#\2\2\u0224\u0226\b%\1"+
		"\2\u0225\u0221\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228"+
		"\5J&\2\u0228\u0229\b%\1\2\u0229\u022b\3\2\2\2\u022a\u0225\3\2\2\2\u022b"+
		"\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022dI\3\2\2\2"+
		"\u022e\u022c\3\2\2\2\u022f\u0230\5L\'\2\u0230\u023e\b&\1\2\u0231\u0232"+
		"\7\37\2\2\u0232\u0238\b&\1\2\u0233\u0234\7 \2\2\u0234\u0238\b&\1\2\u0235"+
		"\u0236\7!\2\2\u0236\u0238\b&\1\2\u0237\u0231\3\2\2\2\u0237\u0233\3\2\2"+
		"\2\u0237\u0235\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\5L\'\2\u023a\u023b"+
		"\b&\1\2\u023b\u023d\3\2\2\2\u023c\u0237\3\2\2\2\u023d\u0240\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023fK\3\2\2\2\u0240\u023e\3\2\2\2"+
		"\u0241\u0242\7&\2\2\u0242\u024a\b\'\1\2\u0243\u0244\7#\2\2\u0244\u024a"+
		"\b\'\1\2\u0245\u0246\7)\2\2\u0246\u024a\b\'\1\2\u0247\u0248\7*\2\2\u0248"+
		"\u024a\b\'\1\2\u0249\u0241\3\2\2\2\u0249\u0243\3\2\2\2\u0249\u0245\3\2"+
		"\2\2\u0249\u0247\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\5L\'\2\u024c"+
		"\u024d\b\'\1\2\u024d\u0252\3\2\2\2\u024e\u024f\5N(\2\u024f\u0250\b\'\1"+
		"\2\u0250\u0252\3\2\2\2\u0251\u0249\3\2\2\2\u0251\u024e\3\2\2\2\u0252M"+
		"\3\2\2\2\u0253\u0254\b(\1\2\u0254\u0259\5P)\2\u0255\u0256\7)\2\2\u0256"+
		"\u025a\b(\1\2\u0257\u0258\7*\2\2\u0258\u025a\b(\1\2\u0259\u0255\3\2\2"+
		"\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c"+
		"\b(\1\2\u025cO\3\2\2\2\u025d\u025e\5R*\2\u025e\u026f\b)\1\2\u025f\u0260"+
		"\7+\2\2\u0260\u0261\5\64\33\2\u0261\u0262\7,\2\2\u0262\u0263\b)\1\2\u0263"+
		"\u026e\3\2\2\2\u0264\u0265\7\63\2\2\u0265\u0266\5\\/\2\u0266\u0267\b)"+
		"\1\2\u0267\u026e\3\2\2\2\u0268\u0269\7-\2\2\u0269\u026a\5> \2\u026a\u026b"+
		"\7.\2\2\u026b\u026c\b)\1\2\u026c\u026e\3\2\2\2\u026d\u025f\3\2\2\2\u026d"+
		"\u0264\3\2\2\2\u026d\u0268\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2"+
		"\2\2\u026f\u0270\3\2\2\2\u0270Q\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0273"+
		"\7\31\2\2\u0273\u0283\b*\1\2\u0274\u0275\5T+\2\u0275\u0276\b*\1\2\u0276"+
		"\u0283\3\2\2\2\u0277\u0278\5V,\2\u0278\u0279\b*\1\2\u0279\u0283\3\2\2"+
		"\2\u027a\u027b\5\\/\2\u027b\u027c\b*\1\2\u027c\u0283\3\2\2\2\u027d\u027e"+
		"\7+\2\2\u027e\u027f\5> \2\u027f\u0280\7,\2\2\u0280\u0281\b*\1\2\u0281"+
		"\u0283\3\2\2\2\u0282\u0272\3\2\2\2\u0282\u0274\3\2\2\2\u0282\u0277\3\2"+
		"\2\2\u0282\u027a\3\2\2\2\u0282\u027d\3\2\2\2\u0283S\3\2\2\2\u0284\u0285"+
		"\7\b\2\2\u0285\u0286\5\24\13\2\u0286\u0287\7+\2\2\u0287\u0288\5\64\33"+
		"\2\u0288\u0289\7,\2\2\u0289\u028a\b+\1\2\u028aU\3\2\2\2\u028b\u028c\5"+
		"X-\2\u028c\u028d\b,\1\2\u028d\u0298\3\2\2\2\u028e\u028f\78\2\2\u028f\u0298"+
		"\b,\1\2\u0290\u0291\7\66\2\2\u0291\u0298\b,\1\2\u0292\u0293\7\25\2\2\u0293"+
		"\u0298\b,\1\2\u0294\u0295\5Z.\2\u0295\u0296\b,\1\2\u0296\u0298\3\2\2\2"+
		"\u0297\u028b\3\2\2\2\u0297\u028e\3\2\2\2\u0297\u0290\3\2\2\2\u0297\u0292"+
		"\3\2\2\2\u0297\u0294\3\2\2\2\u0298W\3\2\2\2\u0299\u029a\7\27\2\2\u029a"+
		"\u029e\b-\1\2\u029b\u029c\7\30\2\2\u029c\u029e\b-\1\2\u029d\u0299\3\2"+
		"\2\2\u029d\u029b\3\2\2\2\u029eY\3\2\2\2\u029f\u02a0\7-\2\2\u02a0\u02a1"+
		"\5\64\33\2\u02a1\u02a2\7.\2\2\u02a2\u02a3\b.\1\2\u02a3[\3\2\2\2\u02a4"+
		"\u02a5\7\67\2\2\u02a5\u02a6\b/\1\2\u02a6]\3\2\2\2\67hr{}\u0088\u008a\u0093"+
		"\u0095\u0098\u00a7\u00c7\u00ca\u00dd\u00ec\u00f9\u0102\u010c\u0114\u0121"+
		"\u012a\u0131\u0139\u0157\u0160\u017a\u0192\u0194\u01a6\u01a9\u01af\u01b9"+
		"\u01bf\u01c5\u01df\u01e7\u01f1\u01fc\u0205\u020c\u0215\u021c\u0225\u022c"+
		"\u0237\u023e\u0249\u0251\u0259\u026d\u026f\u0282\u0297\u029d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}