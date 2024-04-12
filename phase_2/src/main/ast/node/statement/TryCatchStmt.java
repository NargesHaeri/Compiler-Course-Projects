package main.ast.node.statement;

import main.ast.node.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class TryCatchStmt extends Statement {

    private ArrayList<Statement> tryBody = new ArrayList<>();
    private ArrayList<Statement> catchBody = new ArrayList<>();

    public TryCatchStmt() {

    }

    public ArrayList<Statement> getTryBody() {
        return tryBody;
    }
    public void setTryBody(ArrayList<Statement> thenBody) {
        this.tryBody = thenBody;
    }

    public ArrayList<Statement> getCatchBody() {
        return catchBody;
    }
    public void setCatchBody(ArrayList<Statement> elseBody) {
        this.catchBody = elseBody;
    }

    public void addTryStatement(Statement statement) {
        this.tryBody.add(statement);
    }

    public void addCatchStatement(Statement statement) {
        this.catchBody.add(statement);
    }

    @Override
    public String toString() {
        return "TryCatchStmt";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
