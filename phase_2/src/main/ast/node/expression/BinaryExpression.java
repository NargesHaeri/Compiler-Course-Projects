package main.ast.node.expression;

import main.visitor.IVisitor;
import main.visitor.Visitor;
import main.ast.node.expression.operators.BinaryOperator;

//Line -> operator
public class BinaryExpression extends Expression {

    private Expression left;
    private Expression right;
    private BinaryOperator binaryOperator;

//    public BinaryExpression(Expression left, Expression right, BinaryOperator binaryOperator) {
//        this.left = left;
//        this.right = right;
//        this.binaryOperator = binaryOperator;
//    }

    public BinaryExpression() {
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public BinaryOperator getBinaryOperator() {
        return binaryOperator;
    }

    public void setBinaryOperator(String name) {

        switch(name) {
            case "+":
                this.binaryOperator = BinaryOperator.PLUS;
                break;
            case "-":
                this.binaryOperator = BinaryOperator.MINUS;
                break;
            case "*":
                this.binaryOperator = BinaryOperator.MULT;
                break;
            case "/":
                this.binaryOperator = BinaryOperator.DIV;
                break;
            case "%":
                this.binaryOperator = BinaryOperator.MOD;
                break;
            case "&&":
                this.binaryOperator = BinaryOperator.AND;
                break;
            case "||":
                this.binaryOperator = BinaryOperator.OR;
                break;
            case "&":
                this.binaryOperator = BinaryOperator.BIT_AND;
                break;
            case "|":
                this.binaryOperator = BinaryOperator.BIT_OR;
                break;
            case "^":
                this.binaryOperator = BinaryOperator.BIT_XOR;
                break;
            case "<<":
                this.binaryOperator = BinaryOperator.L_SHIFT;
                break;
            case ">>":
                this.binaryOperator = BinaryOperator.R_SHIFT;
                break;
            case "<":
                this.binaryOperator = BinaryOperator.LT;
                break;
            case ">":
                this.binaryOperator = BinaryOperator.GT;
                break;
            case "==":
                this.binaryOperator = BinaryOperator.EQ;
                break;
            case "!=":
                this.binaryOperator = BinaryOperator.NEQ;
                break;
            case "=":
                this.binaryOperator = BinaryOperator.ASSIGN;
                break;
            case "+=":
                this.binaryOperator = BinaryOperator.ADD_ASSIGN;
                break;
            case "-=":
                this.binaryOperator = BinaryOperator.SUB_ASSIGN;
                break;
            case "*=":
                this.binaryOperator = BinaryOperator.MUL_ASSIGN;
                break;
            case "/=":
                this.binaryOperator = BinaryOperator.DIV_ASSIGN;
                break;
            case "%=":
                this.binaryOperator = BinaryOperator.MOD_ASSIGN;
                break;
            default:
                this.binaryOperator = BinaryOperator.MOD_ASSIGN;
                break;
            }

//        this.binaryOperator = binaryOperator;
    }
    @Override
    public String toString() {
        return "BinaryExpression " + binaryOperator.name();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

