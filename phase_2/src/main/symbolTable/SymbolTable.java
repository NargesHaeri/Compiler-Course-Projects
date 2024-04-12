package main.symbolTable;

import main.symbolTable.itemException.*;
import main.symbolTable.symbolTableItems.FunctionItem;
import main.symbolTable.symbolTableItems.SymbolTableItem;
import main.symbolTable.symbolTableItems.VariableItem;

import java.util.HashMap;
import java.util.HashSet;

public class SymbolTable {

    // Static members region
    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<SymbolTable>();

    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }

    public static void pop() {
        top = stack.pop();
    }

    public SymbolTable pre;
    public String name;
    private HashMap<String, SymbolTableItem> items;
    private HashSet<String> reservedWords;


    public SymbolTable() {
        this(null, "");
    }

    public SymbolTable(SymbolTable pre, String name) {
        this.pre = pre;
        this.items = new HashMap<>();
        this.name = name;
    }


    public void ReservedWords() {
        this.reservedWords = new HashSet<String>();
        this.reservedWords.add("try");
        this.reservedWords.add("throw");
        this.reservedWords.add("catch");
        this.reservedWords.add("if");
        this.reservedWords.add("else");
        this.reservedWords.add("for");
        this.reservedWords.add("while");
        this.reservedWords.add("break");
        this.reservedWords.add("continue");
        this.reservedWords.add("return");
        this.reservedWords.add("Main");
        this.reservedWords.add("OnInit");
        this.reservedWords.add("OnStart");
        this.reservedWords.add("float");
        this.reservedWords.add("double");
        this.reservedWords.add("string");
        this.reservedWords.add("bool");
        this.reservedWords.add("void");
        this.reservedWords.add("int");
        this.reservedWords.add("BUY");
        this.reservedWords.add("SELL");
        this.reservedWords.add("Ask");
        this.reservedWords.add("Bid");
        this.reservedWords.add("Time");
        this.reservedWords.add("High");
        this.reservedWords.add("Low");
        this.reservedWords.add("Digits");
        this.reservedWords.add("Volume");
        this.reservedWords.add("Type");
        this.reservedWords.add("Text");
        this.reservedWords.add("Open");
        this.reservedWords.add("Close");
        this.reservedWords.add("Trade");
        this.reservedWords.add("Order");
        this.reservedWords.add("Candle");
        this.reservedWords.add("Exception");
        this.reservedWords.add("RefreshRate");
        this.reservedWords.add("GetCandle");
        this.reservedWords.add("Terminate");
        this.reservedWords.add("Connect");
        this.reservedWords.add("Observe");
        this.reservedWords.add("Print");
    }

    public void addReserved(String word) {
        reservedWords.add(word);
    }

    public void checkReserved(String word) throws ItemAlreadyExistsException {
        if (reservedWords.contains(word)) {
            throw new ItemAlreadyExistsException();
        }
    }



    public void put(SymbolTableItem item) throws ItemAlreadyExistsException {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExistsException();
        items.put(item.getKey(), item);
    }

    public void check(SymbolTableItem item) throws ItemAlreadyExistsException {
//        System.out.println("SSSSS:-------------------=-----------"  );
//        if (items.isEmpty()) {
//            System.out.println("The map is empty");
//        } else {
//            for (String key : items.keySet()) {
//                SymbolTableItem value = items.get(key);
//                System.out.println(key + " -> " + value);
//            }
//        }
//        System.out.println("EEEEEE:-------------------=-----------"  );
//
//        System.out.println("HHHH:" + item.getKey()+"-:-"+item.getName() );
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExistsException();

		items.put(item.getKey(), item);
    }

    public void funcVarChack(VariableItem item1, FunctionItem item2) throws ItemAlreadyExistsException {
        if (item1.getName().equals(item2.getName())){
            throw new ItemAlreadyExistsException();
        }
    }

    public SymbolTableItem get(String key) throws ItemNotFoundException {
        SymbolTableItem item = items.get(key);
        if (item == null && pre != null)
            return pre.get(key);
        else if (item == null)
            throw new ItemNotFoundException();
        else
            return item;
    }
}