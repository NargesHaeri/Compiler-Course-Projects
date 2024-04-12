package main.symbolTable.symbolTableItems;

import main.ast.node.declaration.MainDeclaration;
import main.ast.node.declaration.OnInitDeclaration;
import main.symbolTable.SymbolTable;

public class MainItem extends SymbolTableItem {

    protected SymbolTable mainSymbolTable;
    protected MainDeclaration mainDeclaration;
    public static final String START_KEY = "Main_";

    public MainItem(MainDeclaration mainDeclaration)
    {
//        this.name = mainDeclaration.getMainTrade().getName();
        this.mainDeclaration = mainDeclaration;
    }
    
    public void setMainSymbolTable(SymbolTable mainSymbolTable)
    {
        this.mainSymbolTable = mainSymbolTable;
    }

    public SymbolTable getMainSymbolTable()
    {
        return mainSymbolTable;
    }

//    public void setName(String name)
//    {
//        this.name = name;
//        this.mainDeclaration.getTradeName().setName(name);
//    }

    public void setActorDeclaration(MainDeclaration mainDeclaration)
    {
        this.mainDeclaration = mainDeclaration;
    }

    public MainDeclaration getActorDeclaration()
    {
        return mainDeclaration;
    }

    @Override
    public String getKey()
    {
        return MainItem.START_KEY + this.name;
    }
}
