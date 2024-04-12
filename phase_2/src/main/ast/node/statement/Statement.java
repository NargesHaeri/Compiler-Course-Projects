package main.ast.node.statement;

import main.ast.node.Node;
import main.ast.node.expression.Identifier;
import main.ast.type.Type;

public abstract class Statement extends Node {
    private Type type;
    private Identifier identifier;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Type getType() {
        return type;
    }
}
