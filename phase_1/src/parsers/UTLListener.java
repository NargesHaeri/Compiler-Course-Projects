// Generated from G:/Uni/Uni5/Compiler/CA/New folder/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;
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
	 * Enter a parse tree produced by {@link UTLParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(UTLParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(UTLParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(UTLParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(UTLParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#multiStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultiStatement(UTLParser.MultiStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#multiStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultiStatement(UTLParser.MultiStatementContext ctx);
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
	 * Enter a parse tree produced by {@link UTLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(UTLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(UTLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#observeAssignment}.
	 * @param ctx the parse tree
	 */
	void enterObserveAssignment(UTLParser.ObserveAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#observeAssignment}.
	 * @param ctx the parse tree
	 */
	void exitObserveAssignment(UTLParser.ObserveAssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link UTLParser#varInit}.
	 * @param ctx the parse tree
	 */
	void enterVarInit(UTLParser.VarInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#varInit}.
	 * @param ctx the parse tree
	 */
	void exitVarInit(UTLParser.VarInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(UTLParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(UTLParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#arrDec}.
	 * @param ctx the parse tree
	 */
	void enterArrDec(UTLParser.ArrDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#arrDec}.
	 * @param ctx the parse tree
	 */
	void exitArrDec(UTLParser.ArrDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#arrInit}.
	 * @param ctx the parse tree
	 */
	void enterArrInit(UTLParser.ArrInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#arrInit}.
	 * @param ctx the parse tree
	 */
	void exitArrInit(UTLParser.ArrInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(UTLParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(UTLParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(UTLParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(UTLParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(UTLParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(UTLParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(UTLParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(UTLParser.ForUpdateContext ctx);
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
	 * Enter a parse tree produced by {@link UTLParser#inc_decStatement}.
	 * @param ctx the parse tree
	 */
	void enterInc_decStatement(UTLParser.Inc_decStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#inc_decStatement}.
	 * @param ctx the parse tree
	 */
	void exitInc_decStatement(UTLParser.Inc_decStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(UTLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(UTLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#get_candle}.
	 * @param ctx the parse tree
	 */
	void enterGet_candle(UTLParser.Get_candleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#get_candle}.
	 * @param ctx the parse tree
	 */
	void exitGet_candle(UTLParser.Get_candleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#observe}.
	 * @param ctx the parse tree
	 */
	void enterObserve(UTLParser.ObserveContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#observe}.
	 * @param ctx the parse tree
	 */
	void exitObserve(UTLParser.ObserveContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#terminate}.
	 * @param ctx the parse tree
	 */
	void enterTerminate(UTLParser.TerminateContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#terminate}.
	 * @param ctx the parse tree
	 */
	void exitTerminate(UTLParser.TerminateContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#connect}.
	 * @param ctx the parse tree
	 */
	void enterConnect(UTLParser.ConnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#connect}.
	 * @param ctx the parse tree
	 */
	void exitConnect(UTLParser.ConnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#refreshRate}.
	 * @param ctx the parse tree
	 */
	void enterRefreshRate(UTLParser.RefreshRateContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#refreshRate}.
	 * @param ctx the parse tree
	 */
	void exitRefreshRate(UTLParser.RefreshRateContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#schedule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule(UTLParser.ScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#schedule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule(UTLParser.ScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#scheduleExpr}.
	 * @param ctx the parse tree
	 */
	void enterScheduleExpr(UTLParser.ScheduleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#scheduleExpr}.
	 * @param ctx the parse tree
	 */
	void exitScheduleExpr(UTLParser.ScheduleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(UTLParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(UTLParser.ObjectContext ctx);
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
	 * Enter a parse tree produced by {@link UTLParser#onInit}.
	 * @param ctx the parse tree
	 */
	void enterOnInit(UTLParser.OnInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#onInit}.
	 * @param ctx the parse tree
	 */
	void exitOnInit(UTLParser.OnInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#onStart}.
	 * @param ctx the parse tree
	 */
	void enterOnStart(UTLParser.OnStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#onStart}.
	 * @param ctx the parse tree
	 */
	void exitOnStart(UTLParser.OnStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#functionArgsList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgsList(UTLParser.FunctionArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#functionArgsList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgsList(UTLParser.FunctionArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#negativeValue}.
	 * @param ctx the parse tree
	 */
	void enterNegativeValue(UTLParser.NegativeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#negativeValue}.
	 * @param ctx the parse tree
	 */
	void exitNegativeValue(UTLParser.NegativeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#arrIndexing}.
	 * @param ctx the parse tree
	 */
	void enterArrIndexing(UTLParser.ArrIndexingContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#arrIndexing}.
	 * @param ctx the parse tree
	 */
	void exitArrIndexing(UTLParser.ArrIndexingContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expr(UTLParser.Assignment_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expr(UTLParser.Assignment_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(UTLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(UTLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(UTLParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(UTLParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#orExpr_}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr_(UTLParser.OrExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#orExpr_}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr_(UTLParser.OrExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(UTLParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(UTLParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#andExpr_}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr_(UTLParser.AndExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#andExpr_}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr_(UTLParser.AndExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#bitwiseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseExpr(UTLParser.BitwiseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#bitwiseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseExpr(UTLParser.BitwiseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#bitwiseExpr_}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseExpr_(UTLParser.BitwiseExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#bitwiseExpr_}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseExpr_(UTLParser.BitwiseExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#eqNotEqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqNotEqExpr(UTLParser.EqNotEqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#eqNotEqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqNotEqExpr(UTLParser.EqNotEqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#eqNotEqExpr_}.
	 * @param ctx the parse tree
	 */
	void enterEqNotEqExpr_(UTLParser.EqNotEqExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#eqNotEqExpr_}.
	 * @param ctx the parse tree
	 */
	void exitEqNotEqExpr_(UTLParser.EqNotEqExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(UTLParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(UTLParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#relExpr_}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr_(UTLParser.RelExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#relExpr_}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr_(UTLParser.RelExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#bitwiseShiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseShiftExpr(UTLParser.BitwiseShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#bitwiseShiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseShiftExpr(UTLParser.BitwiseShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#bitwiseShiftExprExpr_}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseShiftExprExpr_(UTLParser.BitwiseShiftExprExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#bitwiseShiftExprExpr_}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseShiftExprExpr_(UTLParser.BitwiseShiftExprExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#addSubExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(UTLParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#addSubExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(UTLParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#addSubExpr_}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr_(UTLParser.AddSubExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#addSubExpr_}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr_(UTLParser.AddSubExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#multDivModExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivModExpr(UTLParser.MultDivModExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#multDivModExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivModExpr(UTLParser.MultDivModExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#multDivModExpr_}.
	 * @param ctx the parse tree
	 */
	void enterMultDivModExpr_(UTLParser.MultDivModExpr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#multDivModExpr_}.
	 * @param ctx the parse tree
	 */
	void exitMultDivModExpr_(UTLParser.MultDivModExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(UTLParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(UTLParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#suffixExpr}.
	 * @param ctx the parse tree
	 */
	void enterSuffixExpr(UTLParser.SuffixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#suffixExpr}.
	 * @param ctx the parse tree
	 */
	void exitSuffixExpr(UTLParser.SuffixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#arrayAccessExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpr(UTLParser.ArrayAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#arrayAccessExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpr(UTLParser.ArrayAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#attributeAccessExpr}.
	 * @param ctx the parse tree
	 */
	void enterAttributeAccessExpr(UTLParser.AttributeAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#attributeAccessExpr}.
	 * @param ctx the parse tree
	 */
	void exitAttributeAccessExpr(UTLParser.AttributeAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#commonOperand}.
	 * @param ctx the parse tree
	 */
	void enterCommonOperand(UTLParser.CommonOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#commonOperand}.
	 * @param ctx the parse tree
	 */
	void exitCommonOperand(UTLParser.CommonOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void enterDataTypes(UTLParser.DataTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void exitDataTypes(UTLParser.DataTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#data_val}.
	 * @param ctx the parse tree
	 */
	void enterData_val(UTLParser.Data_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#data_val}.
	 * @param ctx the parse tree
	 */
	void exitData_val(UTLParser.Data_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#candle_attributes}.
	 * @param ctx the parse tree
	 */
	void enterCandle_attributes(UTLParser.Candle_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#candle_attributes}.
	 * @param ctx the parse tree
	 */
	void exitCandle_attributes(UTLParser.Candle_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#trade_attributes}.
	 * @param ctx the parse tree
	 */
	void enterTrade_attributes(UTLParser.Trade_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#trade_attributes}.
	 * @param ctx the parse tree
	 */
	void exitTrade_attributes(UTLParser.Trade_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#order_methods}.
	 * @param ctx the parse tree
	 */
	void enterOrder_methods(UTLParser.Order_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#order_methods}.
	 * @param ctx the parse tree
	 */
	void exitOrder_methods(UTLParser.Order_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#currency_list}.
	 * @param ctx the parse tree
	 */
	void enterCurrency_list(UTLParser.Currency_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#currency_list}.
	 * @param ctx the parse tree
	 */
	void exitCurrency_list(UTLParser.Currency_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#assignment_operators}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operators(UTLParser.Assignment_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#assignment_operators}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operators(UTLParser.Assignment_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(UTLParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(UTLParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#catchStatement}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatement(UTLParser.CatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#catchStatement}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatement(UTLParser.CatchStatementContext ctx);
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
	 * Enter a parse tree produced by {@link UTLParser#exceptionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExceptionStatement(UTLParser.ExceptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exceptionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExceptionStatement(UTLParser.ExceptionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UTLParser#exception_attributes}.
	 * @param ctx the parse tree
	 */
	void enterException_attributes(UTLParser.Exception_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UTLParser#exception_attributes}.
	 * @param ctx the parse tree
	 */
	void exitException_attributes(UTLParser.Exception_attributesContext ctx);
}