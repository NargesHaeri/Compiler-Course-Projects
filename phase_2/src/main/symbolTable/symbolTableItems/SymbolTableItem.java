package main.symbolTable.symbolTableItems;

public abstract class SymbolTableItem {
	protected String name;

	public SymbolTableItem() {
	}

	public abstract String getKey();
	public String getName(){return this.name;};
}