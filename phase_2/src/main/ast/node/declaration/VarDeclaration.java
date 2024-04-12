package main.ast.node.declaration;

import main.ast.node.expression.*;
import main.ast.node.expression.Identifier;
import main.ast.type.Type;
import main.visitor.IVisitor;


public class VarDeclaration extends Declaration {
    private Type type;
    private Identifier identifier;
    private int length = 0; // > 0 means array

    private Expression value;

    public VarDeclaration() {
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Type getType() {
        return type;
    }

    public Expression getValue() {return value; }

    public void setType(Type type) {
        this.type = type;
    }

    public void setValue(Expression val) { this.value = val;}

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isArray() {
        return this.length > 0;
    }

    @Override
    public String toString() {
        return "VarDeclaration " + identifier.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
