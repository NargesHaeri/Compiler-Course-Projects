package main.visitor.nameAnalyzer;

import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.statement.Statement;
import main.compileError.CompileError;
import main.compileError.name.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.symbolTableItems.OnInitItem;
import main.symbolTable.symbolTableItems.*;
import main.symbolTable.itemException.*;
import main.visitor.Visitor;

import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {

    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);

        for (VarDeclaration varDeclaration : program.getVars()){

            try {
                SymbolTable.top.put(new VariableItem(varDeclaration.getIdentifier().getName(), varDeclaration.getType()));
            }
            catch (ItemAlreadyExistsException e) {
                GlobalVariableRedefinition exception = new GlobalVariableRedefinition(varDeclaration.getLine(), varDeclaration.getIdentifier().getName());
                nameErrors.add(exception);
            }

        }

        for (FunctionDeclaration functionDeclaration : program.getFunctions()){

            functionDeclaration.accept(this);
        }
        for (OnInitDeclaration onInitDeclaration : program.getInits())
            onInitDeclaration.accept(this);
        for (OnStartDeclaration onStartDeclaration : program.getStarts())
            onStartDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(OnInitDeclaration onInitDeclaration) {
        OnInitItem onInitItem = new OnInitItem(onInitDeclaration);
        SymbolTable onInitSymbolTable = new SymbolTable(SymbolTable.top, onInitDeclaration.getTradeName().getName());
        onInitItem.setOnInitSymbolTable(onInitSymbolTable);

        try {
            SymbolTable.top.put(onInitItem);
        } catch (ItemAlreadyExistsException e) {
            nameErrors.add(new PrimitiveFunctionRedefinition(onInitDeclaration.getLine(), "onInit"));
        }

        SymbolTable.push(onInitSymbolTable);

        VarDeclaration initTradeVar = new VarDeclaration();
        initTradeVar.setIdentifier(onInitDeclaration.getTradeName());
        initTradeVar.accept(this);

        for (var stmt : onInitDeclaration.getBody()) {
            stmt.accept(this);
        }


        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(OnStartDeclaration onStartDeclaration) {
        var onStartItem = new OnStartItem(onStartDeclaration);
        var onStartSymbolTable = new SymbolTable(SymbolTable.top, onStartDeclaration.getTradeName().getName());
        onStartItem.setOnStartSymbolTable(onStartSymbolTable);

        try {
            SymbolTable.top.put(onStartItem);
        } catch (ItemAlreadyExistsException e) {
            nameErrors.add(new PrimitiveFunctionRedefinition(onStartDeclaration.getLine(), "onStart"));
        }

        SymbolTable.push(onStartSymbolTable);

        VarDeclaration initTradeVar = new VarDeclaration();
        initTradeVar.setIdentifier(onStartDeclaration.getTradeName());
        initTradeVar.accept(this);

        for (var stmt : onStartDeclaration.getBody()) {
            stmt.accept(this);
        }

        SymbolTable.pop();
        return null;

    }


    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        var mainItem = new MainItem(mainDeclaration);
        var mainSymbolTable = new SymbolTable(SymbolTable.top,"Main");
        mainItem. setMainSymbolTable(mainSymbolTable);

        SymbolTable.push(mainSymbolTable);

        for (var stmt : mainDeclaration.getBody()) {
            stmt.accept(this);
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        var functionItem = new FunctionItem(functionDeclaration);
        var functionSymbolTable = new SymbolTable(SymbolTable.top, functionDeclaration.getName().getName());
        functionItem.setHandlerSymbolTable(functionSymbolTable);

        try {
            SymbolTable.top.put(functionItem);
        } catch (ItemAlreadyExistsException e) {
            nameErrors.add(new MethodRedefinition(functionDeclaration.getLine(), functionDeclaration.getName().getName()));
        }

        for (var stmt : functionDeclaration.getBody()) {
            if (stmt instanceof VarDeclaration)
            {
                SymbolTable currentTable = SymbolTable.top;
                var varItem = new VariableItem(stmt.getIdentifier().getName(), stmt.getType());
                try {
                    SymbolTable.top.funcVarChack(varItem,functionItem);
                }
                catch (ItemAlreadyExistsException e) {
                    FunctionVariableConflict exception = new FunctionVariableConflict(stmt.getLine(), stmt.getIdentifier().getName());
                    nameErrors.add(exception);
                }
            }
        }
        SymbolTable.push(functionSymbolTable);

        for (VarDeclaration varDeclaration : functionDeclaration.getArgs()) {
            varDeclaration.accept(this);
        }

        for (var stmt : functionDeclaration.getBody()) {
                stmt.accept(this);
        }

        SymbolTable.pop();
        return null;

    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {

        var variableItem = new VariableItem(varDeclaration.getIdentifier().getName(), varDeclaration.getType());

        SymbolTable currentTable = SymbolTable.top;
        currentTable.ReservedWords();

        try {
            currentTable.checkReserved(variableItem.getName());

        } catch (ItemAlreadyExistsException e) {
            varDeclaration.getIdentifier().setName(varDeclaration.getIdentifier().getName()+varDeclaration.getIdentifier().getName());
            nameErrors.add(new IrregularDefenition(varDeclaration.getLine(), varDeclaration.getIdentifier().getName()));
        }
        try {
            currentTable.check(variableItem);
        } catch (ItemAlreadyExistsException e) {
            nameErrors.add(new VariableRedefinition(varDeclaration.getLine(), varDeclaration.getIdentifier().getName()));
        }

        return null;
    }
}

