package main.ast.node.expression;

import main.visitor.IVisitor;
import main.visitor.Visitor;

public class Identifier extends Expression {
    protected String name;

    public Identifier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {return "Identifier " +  name;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
