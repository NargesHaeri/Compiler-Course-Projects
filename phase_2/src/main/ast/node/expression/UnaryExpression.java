package main.ast.node.expression;

import main.ast.node.expression.operators.UnaryOperator;
import main.visitor.IVisitor;
import main.visitor.Visitor;

//Line -> operator
public class UnaryExpression extends Expression {

    private UnaryOperator unaryOperator;
    private Expression operand;

//    public UnaryExpression(UnaryOperator unaryOperator, Expression operand) {
//        this.unaryOperator = unaryOperator;
//        this.operand = operand;
//    }

        public UnaryExpression() {
    }

    public Expression getOperand() {
        return operand;
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }

    public UnaryOperator getUnaryOperator() {
        return unaryOperator;
    }

    public void setUnaryOperator(String name/*UnaryOperator unaryOperator*/) {
        switch(name) {
            case "~":
                this.unaryOperator = UnaryOperator.BIT_NOT;
                break;
            case "-":
                this.unaryOperator = UnaryOperator.MINUS;
                break;
            case "!":
                this.unaryOperator = UnaryOperator.NOT;
                break;
            case "++":
                this.unaryOperator = UnaryOperator.INC;
                break;
            case "--":
                this.unaryOperator = UnaryOperator.DEC;
                break;
            default:
                this.unaryOperator = UnaryOperator.DEC;
                break;
        }
    }

    @Override
    public String toString() {
        return "UnaryExpression " + unaryOperator.name();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
