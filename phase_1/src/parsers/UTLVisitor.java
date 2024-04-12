// Generated from G:/Uni/Uni5/Compiler/CA/New folder/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UTLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UTLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UTLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(UTLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(UTLParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(UTLParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#multiStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiStatement(UTLParser.MultiStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(UTLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(UTLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#observeAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObserveAssignment(UTLParser.ObserveAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(UTLParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#varInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInit(UTLParser.VarInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(UTLParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#arrDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrDec(UTLParser.ArrDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#arrInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrInit(UTLParser.ArrInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(UTLParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(UTLParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(UTLParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(UTLParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(UTLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#inc_decStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_decStatement(UTLParser.Inc_decStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(UTLParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#get_candle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_candle(UTLParser.Get_candleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#observe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObserve(UTLParser.ObserveContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#terminate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminate(UTLParser.TerminateContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#connect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnect(UTLParser.ConnectContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#refreshRate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshRate(UTLParser.RefreshRateContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#schedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchedule(UTLParser.ScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#scheduleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheduleExpr(UTLParser.ScheduleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(UTLParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(UTLParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(UTLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#onInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnInit(UTLParser.OnInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#onStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnStart(UTLParser.OnStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#functionArgsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgsList(UTLParser.FunctionArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#negativeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeValue(UTLParser.NegativeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#arrIndexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrIndexing(UTLParser.ArrIndexingContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#assignment_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expr(UTLParser.Assignment_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(UTLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(UTLParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#orExpr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr_(UTLParser.OrExpr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(UTLParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#andExpr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr_(UTLParser.AndExpr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#bitwiseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseExpr(UTLParser.BitwiseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#bitwiseExpr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseExpr_(UTLParser.BitwiseExpr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#eqNotEqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqNotEqExpr(UTLParser.EqNotEqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#eqNotEqExpr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqNotEqExpr_(UTLParser.EqNotEqExpr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(UTLParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#relExpr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr_(UTLParser.RelExpr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#bitwiseShiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseShiftExpr(UTLParser.BitwiseShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#bitwiseShiftExprExpr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseShiftExprExpr_(UTLParser.BitwiseShiftExprExpr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#addSubExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(UTLParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#addSubExpr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr_(UTLParser.AddSubExpr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#multDivModExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivModExpr(UTLParser.MultDivModExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#multDivModExpr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivModExpr_(UTLParser.MultDivModExpr_Context ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(UTLParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#suffixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffixExpr(UTLParser.SuffixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#arrayAccessExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpr(UTLParser.ArrayAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#attributeAccessExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeAccessExpr(UTLParser.AttributeAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#commonOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonOperand(UTLParser.CommonOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#dataTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypes(UTLParser.DataTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#data_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_val(UTLParser.Data_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#candle_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCandle_attributes(UTLParser.Candle_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#trade_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrade_attributes(UTLParser.Trade_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#order_methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_methods(UTLParser.Order_methodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#currency_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrency_list(UTLParser.Currency_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#assignment_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operators(UTLParser.Assignment_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(UTLParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#catchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStatement(UTLParser.CatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(UTLParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exceptionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionStatement(UTLParser.ExceptionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UTLParser#exception_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_attributes(UTLParser.Exception_attributesContext ctx);
}