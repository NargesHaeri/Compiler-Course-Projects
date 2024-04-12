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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UTLParser}.
 */
public interface UTLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UTLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(UTLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(UTLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(UTLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(UTLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(UTLParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(UTLParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(UTLParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(UTLParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(UTLParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(UTLParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#initDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaration(UTLParser.InitDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#initDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaration(UTLParser.InitDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#startDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStartDeclaration(UTLParser.StartDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#startDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStartDeclaration(UTLParser.StartDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(UTLParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(UTLParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(UTLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(UTLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(UTLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(UTLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(UTLParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(UTLParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(UTLParser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(UTLParser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#continueBreakStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueBreakStatement(UTLParser.ContinueBreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#continueBreakStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueBreakStatement(UTLParser.ContinueBreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(UTLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(UTLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(UTLParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(UTLParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(UTLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(UTLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(UTLParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(UTLParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(UTLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(UTLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UTLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UTLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(UTLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(UTLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#numericValue}.
	 * @param ctx the parse tree
	 */
	void enterNumericValue(UTLParser.NumericValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#numericValue}.
	 * @param ctx the parse tree
	 */
	void exitNumericValue(UTLParser.NumericValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(UTLParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(UTLParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(UTLParser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(UTLParser.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#allType}.
	 * @param ctx the parse tree
	 */
	void enterAllType(UTLParser.AllTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#allType}.
	 * @param ctx the parse tree
	 */
	void exitAllType(UTLParser.AllTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(UTLParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(UTLParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#specialVariable}.
	 * @param ctx the parse tree
	 */
	void enterSpecialVariable(UTLParser.SpecialVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#specialVariable}.
	 * @param ctx the parse tree
	 */
	void exitSpecialVariable(UTLParser.SpecialVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#specialMethod}.
	 * @param ctx the parse tree
	 */
	void enterSpecialMethod(UTLParser.SpecialMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#specialMethod}.
	 * @param ctx the parse tree
	 */
	void exitSpecialMethod(UTLParser.SpecialMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(UTLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(UTLParser.AssignContext ctx);
}