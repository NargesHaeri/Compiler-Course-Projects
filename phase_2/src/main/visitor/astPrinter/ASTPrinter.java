package main.visitor.astPrinter;

import main.ast.node.Program;
import main.ast.node.declaration.FunctionDeclaration;
import main.ast.node.declaration.OnInitDeclaration;
import main.ast.node.declaration.OnStartDeclaration;
import main.ast.node.declaration.VarDeclaration;
import main.ast.node.statement.Statement;
import main.visitor.Visitor;
import main.ast.node.declaration.MainDeclaration;
import main.ast.node.expression.*;
import main.ast.node.expression.values.*;
import main.ast.node.statement.*;

public class ASTPrinter extends Visitor<Void> {
    public void messagePrinter(int line, String message){
        System.out.println("Line:" + line + ":" + message);
    }

    @Override
    public Void visit(Program program) {
        messagePrinter(program.getLine(), program.toString());
        for (VarDeclaration varDeclaration : program.getVars())
            varDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration : program.getFunctions())
            functionDeclaration.accept(this);
        for (OnInitDeclaration onInitDeclaration : program.getInits())
            onInitDeclaration.accept(this);
        for (OnStartDeclaration onStartDeclaration : program.getStarts())
            onStartDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        messagePrinter(mainDeclaration.getLine(), mainDeclaration.toString());

        for (Statement statement: mainDeclaration.getBody())
            statement.accept(this);
        for (VarDeclaration varDec: mainDeclaration.getMainTrades())
            varDec.accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {
        messagePrinter(funcDeclaration.getLine(), funcDeclaration.toString());
        funcDeclaration.getName().accept(this);
        for (VarDeclaration varDec: funcDeclaration.getArgs())
            varDec.accept(this);
        for (Statement statement : funcDeclaration.getBody())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(OnInitDeclaration onInitDeclaration) {
        messagePrinter(onInitDeclaration.getLine(), onInitDeclaration.toString());
        onInitDeclaration.getTradeName().accept(this);
        for (Statement statement : onInitDeclaration.getBody())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(OnStartDeclaration onStartDeclaration) {
        messagePrinter(onStartDeclaration.getLine(), onStartDeclaration.toString());
        onStartDeclaration.getTradeName().accept(this);
        for (Statement statement : onStartDeclaration.getBody())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        messagePrinter(varDeclaration.getLine(), varDeclaration.toString());
        if(varDeclaration.getValue() != null)
            varDeclaration.getValue().accept(this);
        return null;
    }

    @Override
    public Void visit(IntValue value) {
        messagePrinter(value.getLine(), value.toString());
        return null;
    }

    @Override
    public Void visit(FloatValue value) {
        messagePrinter(value.getLine(), value.toString());
        return null;
    }

    @Override
    public Void visit(BoolValue value) {
        messagePrinter(value.getLine(), value.toString());
        return null;
    }

    @Override
    public Void visit(StringValue value) {
        messagePrinter(value.getLine(), value.toString());
        return null;
    }


    @Override
    public Void visit(TradeValue value) {
        messagePrinter(value.getLine(), value.toString());
        return null;
    }

    @Override
    public Void visit(ArrayIdentifier arrayIdentifier) {
        messagePrinter(arrayIdentifier.getLine(), arrayIdentifier.toString());
        arrayIdentifier.getIndex().accept(this);
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        messagePrinter(binaryExpression.getLine(), binaryExpression.toString());
        binaryExpression.getLeft().accept(this);
        binaryExpression.getRight().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        messagePrinter(unaryExpression.getLine(), unaryExpression.toString());
        unaryExpression.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        messagePrinter(functionCall.getLine(), functionCall.toString());

        functionCall.getFunctionName().accept(this);
        for (Expression arg : functionCall.getArgs())
            arg.accept(this);
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        messagePrinter(identifier.getLine(), identifier.toString());
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        messagePrinter(methodCall.getLine(), methodCall.toString());
        methodCall.getInstance().accept(this);
        methodCall.getFunctionName().accept(this);

        for (Expression arg : methodCall.getArgs())
            arg.accept(this);
        return null;
    }

    @Override
    public Void visit(VarAccess varAccess) {
        messagePrinter(varAccess.getLine(), varAccess.toString());
        varAccess.getInstance().accept(this);
        varAccess.getVariable().accept(this);
        return null;
    }

    @Override
    public Void visit(AssignStmt assignStmt) {
        messagePrinter(assignStmt.getLine(), assignStmt.toString());
        assignStmt.getLValue().accept(this);
        assignStmt.getRValue().accept(this);
        return null;
    }

    @Override
    public Void visit(ContinueBreakStmt continueBreakStmt) {
        messagePrinter(continueBreakStmt.getLine(), continueBreakStmt.toString());

        return null;
    }

    @Override
    public Void visit(ExpressionStmt expressionStmt) {
        expressionStmt.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        messagePrinter(forStmt.getLine(), forStmt.toString());
        for (Statement stmt : forStmt.getInit())
            stmt.accept(this);
        forStmt.getCondition().accept(this);
        forStmt.getUpdate().accept(this);
        for (Statement statement : forStmt.getBody())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(IfElseStmt ifElseStmt) {
        messagePrinter(ifElseStmt.getLine(), ifElseStmt.toString());
        ifElseStmt.getCondition().accept(this);
        for (Statement statement : ifElseStmt.getThenBody())
            statement.accept(this);
        for (Statement stmt : ifElseStmt.getElseBody())
            stmt.accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        messagePrinter(returnStmt.getLine(), returnStmt.toString());
        if (returnStmt.getReturnedExpr() != null)
            returnStmt.getReturnedExpr().accept(this);
        return null;
    }

    @Override
    public Void visit(ThrowStmt throwStmt) {
        messagePrinter(throwStmt.getLine(), throwStmt.toString());
        if (throwStmt.getReturnedExpr() != null)
            throwStmt.getReturnedExpr().accept(this);
        return null;
    }

    @Override
    public Void visit(TryCatchStmt tryCatchStmt) {
        messagePrinter(tryCatchStmt.getLine(), tryCatchStmt.toString());
        for (Statement statement : tryCatchStmt.getTryBody())
            statement.accept(this);
        for (Statement stmt : tryCatchStmt.getCatchBody())
            stmt.accept(this);
        return null;
    }

    @Override
    public Void visit(WhileStmt whileStmt) {
        messagePrinter(whileStmt.getLine(), whileStmt.toString());
        whileStmt.getCondition().accept(this);
        for (Statement statement : whileStmt.getBody())
            statement.accept(this);
        return null;
    }


}

