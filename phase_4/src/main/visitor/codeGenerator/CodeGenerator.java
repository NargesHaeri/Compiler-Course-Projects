package main.visitor.codeGenerator;

import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.expression.*;
import main.ast.node.expression.operators.BinaryOperator;
import main.ast.node.expression.operators.UnaryOperator;
import main.ast.node.expression.values.*;
import main.ast.node.statement.*;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.FloatType;
import main.ast.type.primitiveType.StringType;
import main.ast.type.primitiveType.NullType;
import main.ast.type.primitiveType.VoidType;
import main.compileError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.ItemNotFoundException;
import main.symbolTable.symbolTableItems.FunctionItem;
import main.symbolTable.symbolTableItems.MainItem;
import main.symbolTable.symbolTableItems.OnInitItem;
import main.symbolTable.symbolTableItems.OnStartItem;
import main.visitor.Visitor;
import main.visitor.typeAnalyzer.*;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class CodeGenerator extends Visitor<String> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    TypeChecker expressionTypeChecker = new TypeChecker(typeErrors);

    private String outputPath;
    private FileWriter currentFile;

    private ArrayList<VarDeclaration> globalVariables;
    private Declaration currentFunction;

    public CodeGenerator() {
        this.globalVariables = new ArrayList<>();

        this.prepareOutputFolder();
        this.createFile("generatedCode");
        this.numberOfTemps = 0;
        this.numberOfLabels = 0;
    }

    private int numberOfLabels;
    private int numberOfTemps;
    private String getFreshLabel() {
        return "Label_" + this.numberOfLabels++;
    }
    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) { }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) { }
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            this.currentFile = fileWriter;
        } catch (IOException e) {}
    }

    private VarDeclaration getGlobalVariable(Identifier identifier){
        for(VarDeclaration globalVar : this.globalVariables){
            if(globalVar.getIdentifier().getName().equals(identifier.getName())){
                return  globalVar;
            }
        }
        return null;
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write(command + "\n");
            else if(command.startsWith(".limit"))
                this.currentFile.write("    " + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("    " + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {}
    }

    private int slotOf(String identifier){
            int count = 1;
            if(currentFunction instanceof FunctionDeclaration){
                for(VarDeclaration argPair : ((FunctionDeclaration) currentFunction).getArgs()){
                    if(argPair.getIdentifier().getName().equals(identifier))
                        return count;
                    count++;
                }
                for(Statement stmt : ((FunctionDeclaration) currentFunction).getBody()) {
                    if(stmt instanceof VarDeclaration){
                        if(((VarDeclaration) stmt).getIdentifier().getName().equals(identifier))
                            return count;
                        count++;
                    }
                }
            }
            if(currentFunction instanceof MainDeclaration ){
                count=0;
                for(Statement stmt : ((MainDeclaration) currentFunction).getBody()) {
                    if(stmt instanceof VarDeclaration){
                        if(((VarDeclaration) stmt).getIdentifier().getName().equals(identifier))
                            return count;
                        count++;
                    }
                }
            }
            if(currentFunction instanceof OnInitDeclaration ){

                count =2;
                if( ((OnInitDeclaration) currentFunction).getTradeName().getName().equals(identifier)) {
                    return count-1;

                }

                for(Statement stmt : ((OnInitDeclaration) currentFunction).getBody()) {
                    if(stmt instanceof VarDeclaration){
                        if(((VarDeclaration) stmt).getIdentifier().getName().equals(identifier))
                            return count;
                        count++;
                    }
                }
            }
            if(currentFunction instanceof OnStartDeclaration ){
                count =2;
                if( ((OnStartDeclaration) currentFunction).getTradeName().getName().equals(identifier)) {
                    return count-1;

                }
                for(Statement stmt : ((OnStartDeclaration) currentFunction).getBody()) {
                    if(stmt instanceof VarDeclaration){
                        if(((VarDeclaration) stmt).getIdentifier().getName().equals(identifier))
                            return count;
                        count++;
                    }
                }
            }
            return 0;
        }



    private String makeTypeSignature(Type type) {
        if(type instanceof IntType)
            return "Ljava/lang/Integer;";
        else if(type instanceof BoolType)
            return "Ljava/lang/Boolean;";
        else if(type instanceof StringType)
            return "Ljava/lang/String;";
        else if(type instanceof FloatType)
            return "Ljava/lang/Float;";
        else
            return "V";
    }

    @Override
    public String visit(Program program) {
        addCommand(".class public UTL");
        addCommand(".super java/lang/Object");
        this.globalVariables.addAll(program.getVars());
        for(VarDeclaration varDeclaration : program.getVars()){
            addCommand(".field public "+varDeclaration.getIdentifier().getName()+" "+makeTypeSignature(varDeclaration.getType()));
        }
        addCommand(".method public <init>()V");
        addCommand("aload_0");
        addCommand("invokespecial java/lang/Object/<init>()V");
        addCommand("return");
        addCommand(".end method");

        for (FunctionDeclaration functionDeclaration : program.getFunctions())
            functionDeclaration.accept(this);
        for (OnInitDeclaration onInitDeclaration : program.getInits())
            onInitDeclaration.accept(this);
        for (OnStartDeclaration onStartDeclaration : program.getStarts())
            onStartDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }


    @Override
    public String visit(MainDeclaration mainDeclaration) {
        try {
            MainItem mainItem = (MainItem) SymbolTable.root.get(MainItem.START_KEY + "main");
            SymbolTable.push(mainItem.getMainSymbolTable());
        } catch (ItemNotFoundException e) {
            // pass
        }
        this.currentFunction=mainDeclaration;
        addCommand(".method public static Main([Ljava/lang/String;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        for (Statement stmt : mainDeclaration.getBody())
            stmt.accept(this);
        addCommand("return");
        addCommand(".end method");
        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(OnStartDeclaration onStartDeclaration) {
        try {
            OnStartItem onStartItem = (OnStartItem) SymbolTable.root.get(OnStartItem.START_KEY + onStartDeclaration.getTradeName().getName());
            SymbolTable.push(onStartItem.getOnStartSymbolTable());
        } catch (ItemNotFoundException e) {
            // pass
        }
        this.currentFunction=onStartDeclaration;
        String tradename = onStartDeclaration.getTradeName().getName();
        addCommand(".method public OnStart"+"(LTrade;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        for (Statement stmt : onStartDeclaration.getBody())
            stmt.accept(this);
        addCommand("return");
        addCommand(".end method");
        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(OnInitDeclaration onInitDeclaration) {
        try {
            OnInitItem onInitItem = (OnInitItem) SymbolTable.root.get(OnInitItem.START_KEY + onInitDeclaration.getTradeName().getName());
            SymbolTable.push(onInitItem.getOnInitSymbolTable());
        } catch (ItemNotFoundException e) {
            // pass
        }
        this.currentFunction=onInitDeclaration;
        String tradename = onInitDeclaration.getTradeName().getName();
        addCommand(".method public OnInit"+"(LTrade;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        for (Statement stmt : onInitDeclaration.getBody())
            stmt.accept(this);
        addCommand("return");
        addCommand(".end method");
        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration) {
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.get(FunctionItem.START_KEY + functionDeclaration.getName().getName());
            SymbolTable.push(functionItem.getFunctionSymbolTable());
        } catch (ItemNotFoundException e) {
            // pass
        }
        this.currentFunction=functionDeclaration;
        String signatures = "";
        for(VarDeclaration argPair : functionDeclaration.getArgs()) {
            signatures += makeTypeSignature(argPair.getType());
        }

        addCommand(".method public " + functionDeclaration.getName() + "(" + signatures + ")" + makeTypeSignature(functionDeclaration.getReturnType()));
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        for (Statement stmt : functionDeclaration.getBody()) {
            stmt.accept(this);

        }
//        if(functionDeclaration.getReturnType()!= new VoidType())
//            addCommand("return");
        addCommand(".end method\n ");
        this.numberOfTemps = 0;
        SymbolTable.pop();
        return null;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        UnaryOperator operator = unaryExpression.getUnaryOperator();
        String commands = "";
        if(operator == UnaryOperator.MINUS) {
            commands += unaryExpression.getOperand().accept(this) + "\n";
            commands += "ineg";
        }
        else if(operator == UnaryOperator.BIT_NOT) {
            commands += "iconst_m1";
            commands += unaryExpression.getOperand().accept(this) + "\n";
            commands += "ixor";
        }
        else if(operator == UnaryOperator.NOT) {
            String falseLabel = getFreshLabel();
            String afterLabel = getFreshLabel();
            commands += unaryExpression.getOperand().accept(this) + "\n";
            commands += "ifne " + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + afterLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += afterLabel + ":";
        }
        else if((operator == UnaryOperator.INC) || (operator == UnaryOperator.DEC)) {
            if(unaryExpression.getOperand() instanceof Identifier) {
                Identifier identifier = (Identifier)unaryExpression.getOperand();
                VarDeclaration globalVar = getGlobalVariable(identifier);
                int slot = slotOf(identifier.getName());
                if(globalVar == null)
                    commands += "aload " + slot + "\n";
                else
                    commands += "getstatic Global/" + identifier.getName() + " " + makeTypeSignature(globalVar.getType()) + "\n";
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
                commands += "dup\n";
                commands += "ldc 1\n";
                if (operator == UnaryOperator.INC)
                    commands += "iadd\n";
                else
                    commands += "isub\n";
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";

                if(globalVar == null) {
                    commands += "astore " + slot + "\n";
                }
                else {
                    commands += "putstatic Global/" + globalVar.getIdentifier().getName() + " " + makeTypeSignature(globalVar.getType()) + "\n";

                }
            }
            else if(unaryExpression.getOperand() instanceof ArrayIdentifier) {
                commands += ((ArrayIdentifier) unaryExpression.getOperand()).accept(this) + "\n";
                commands +=  ((ArrayIdentifier) unaryExpression.getOperand()).getIndex().accept(this) + "\n";
                commands += "dup2\n";
                commands += "invokevirtual Array/getElement(I)Ljava/lang/Object;\n";
                commands += "checkcast java/lang/Integer\n";
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
                commands += "dup_x2\n";
                commands += "ldc 1\n";
                if(operator == UnaryOperator.DEC)
                    commands += "isub\n";
                else
                    commands += "iadd\n";
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                commands += "invokevirtual Array/setElement(ILjava/lang/Object;)V\n";
            }
        }
        return commands;
    }

    @Override
    public String visit(ExpressionStmt expressionstmt) {
        expressionstmt.getExpression().accept(this);

        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) { 
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        String commands = "";
        System.out.println("bin");
        System.out.println(operator);
        if(!((operator == BinaryOperator.ASSIGN) || (operator == BinaryOperator.AND) || (operator == BinaryOperator.OR))) {
            commands += binaryExpression.getLeft().accept(this) + "\n";
            commands += binaryExpression.getRight().accept(this) + "\n";
        }
        if (operator == BinaryOperator.PLUS || operator == BinaryOperator.ADD_ASSIGN){
            commands += "iadd\n";
            System.out.println("here");
        }
        else if (operator == BinaryOperator.ADD_ASSIGN){
            commands += "iadd\n";
            System.out.println("here");
        }
        else if (operator == BinaryOperator.MINUS || operator == BinaryOperator.SUB_ASSIGN)
            commands += "isub\n";
        else if (operator == BinaryOperator.MULT || operator == BinaryOperator.MUL_ASSIGN)
            commands += "imul\n";
        else if (operator == BinaryOperator.DIV || operator == BinaryOperator.DIV_ASSIGN)
            commands += "idiv\n";
        else if (operator == BinaryOperator.MOD || operator == BinaryOperator.MOD_ASSIGN){
            commands += "idiv\n";
            commands += "irem\n";
        }
        else if((operator == BinaryOperator.GT) || (operator == BinaryOperator.LT)) {
            String nTrue = getFreshLabel();
            String nAfter = getFreshLabel();
            String command = (operator == BinaryOperator.LT) ? "if_icmplt " : "if_icmpgt ";
            commands += command + nTrue + "\n";
            commands += "ldc 0" + "\n";
            commands += "goto " + nAfter + "\n";
            commands += nTrue + ":\n";
            commands += "ldc 1\n";
            commands += nAfter + ":";
        }
        else if((operator == BinaryOperator.EQ)) {
            Type type =binaryExpression.getLeft().getType();
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
            String compareCommand = "";
            if((type instanceof IntType) || (type instanceof BoolType))
                compareCommand += "if_icmpne ";
            else
                compareCommand +="if_acmpne ";
            commands += compareCommand + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += exitLabel + ":";
        }
        else if((operator == BinaryOperator.NEQ)) {
            Type type =binaryExpression.getLeft().getType();
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
            String compareCommand = "";
            if((type instanceof IntType) || (type instanceof BoolType))
                compareCommand += "if_icmpeq ";
            else
                compareCommand +="if_acmpeq ";
            commands += compareCommand + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += exitLabel + ":";
        }
        else if(operator == BinaryOperator.OR) {
            String trueLabel = getFreshLabel();
            String endLabel = getFreshLabel();
            commands += binaryExpression.getLeft().accept(this) + "\n";
            commands += "ifne " + trueLabel + "\n";
            commands += binaryExpression.getRight().accept(this) + "\n";
            commands += "ifne " + trueLabel + "\n";
            commands += "ldc 0\n";
            commands += "goto " + endLabel + "\n";
            commands += trueLabel + ":\n";
            commands += "ldc 1\n";
            commands += endLabel + ":";
        }
        else if(operator == BinaryOperator.AND) {
            String nElseLabel = getFreshLabel();
            String nAfterLabel = getFreshLabel();
            commands += binaryExpression.getLeft().accept(this) + "\n";
            commands += "ifeq " + nElseLabel + "\n";
            commands += binaryExpression.getRight().accept(this) + "\n";
            commands += "ifeq " + nElseLabel + "\n";
            commands += "ldc 1\n";
            commands += "goto " + nAfterLabel + "\n";
            commands += nElseLabel + ":\n";
            commands += "ldc 0\n";
            commands += nAfterLabel + ":";
        }
        else if(operator == BinaryOperator.ASSIGN) {

            Type firstType = binaryExpression.getLeft().accept(expressionTypeChecker);
            if(binaryExpression.getRight() instanceof FunctionCall){
                if(((FunctionCall) binaryExpression.getRight()).getFunctionName().getName().equals("Order")){
                   addCommand("new Order");
                   addCommand("dup");
                }

            }
            String secondCommands = binaryExpression.getRight().accept(this);
            System.out.println(secondCommands);
            if(binaryExpression.getLeft() instanceof Identifier) {
                if(secondCommands!=null)
                commands += secondCommands;
                int varSlot = slotOf(((Identifier) binaryExpression.getLeft()).getName());

                VarDeclaration globalVar = getGlobalVariable((Identifier) binaryExpression.getLeft());

                if(globalVar == null && firstType instanceof FloatType)
                    commands += "fstore";
                else if(globalVar == null && firstType instanceof IntType)
                    commands += "istore";
                else if(globalVar == null)
                    commands += "astore";

                if(globalVar == null && varSlot <4)
                    commands += "_" + varSlot + "\n";
                else if(globalVar == null)
                    commands += " " + varSlot + "\n";
                else{
                    commands += "putstatic Global/" + globalVar.getIdentifier().getName() + " " + makeTypeSignature(globalVar.getType()) + "\n";

                }
            }
            else if (binaryExpression.getLeft() instanceof ArrayIdentifier) {
                commands += ((ArrayIdentifier) binaryExpression.getLeft()).accept(this) + "\n";
                commands += ((ArrayIdentifier) binaryExpression.getLeft()).getIndex().accept(this) + "\n";
                commands += secondCommands + "\n";
                commands += "dup_x2\n";
                if (firstType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                else if (firstType instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                commands += "invokevirtual Array/setElement(ILjava/lang/Object;)V\n";
            }

            }

        if(operator == BinaryOperator.ADD_ASSIGN || operator == BinaryOperator.MUL_ASSIGN || operator == BinaryOperator.DIV_ASSIGN
                || operator == BinaryOperator.SUB_ASSIGN || operator == BinaryOperator.MOD_ASSIGN) {

            Type firstType = binaryExpression.getLeft().accept(expressionTypeChecker);
            if(binaryExpression.getRight() instanceof FunctionCall){
                if(((FunctionCall) binaryExpression.getRight()).getFunctionName().getName().equals("Order")){
                    addCommand("new Order");
                    addCommand("dup");
                }

            }
            String secondCommands = binaryExpression.getRight().accept(this);
            System.out.println(secondCommands);
            if(binaryExpression.getLeft() instanceof Identifier) {
                if(secondCommands!=null)
                    commands += secondCommands;
                int varSlot = slotOf(((Identifier) binaryExpression.getLeft()).getName());

                VarDeclaration globalVar = getGlobalVariable((Identifier) binaryExpression.getLeft());

                if(globalVar == null && firstType instanceof FloatType)
                    commands += "fstore";
                else if(globalVar == null && firstType instanceof IntType)
                    commands += "istore";
                else if(globalVar == null)
                    commands += "astore";

                if(globalVar == null && varSlot <4)
                    commands += "_" + varSlot + "\n";
                else if(globalVar == null)
                    commands += " " + varSlot + "\n";
                else{
                    commands += "putstatic Global/" + globalVar.getIdentifier().getName() + " " + makeTypeSignature(globalVar.getType()) + "\n";

                }
            }
            else if (binaryExpression.getLeft() instanceof ArrayIdentifier) {
                commands += ((ArrayIdentifier) binaryExpression.getLeft()).accept(this) + "\n";
                commands += ((ArrayIdentifier) binaryExpression.getLeft()).getIndex().accept(this) + "\n";
                commands += secondCommands + "\n";
                commands += "dup_x2\n";
                if (firstType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                else if (firstType instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                commands += "invokevirtual Array/setElement(ILjava/lang/Object;)V\n";
            }

        }

        return commands;
    }

    @Override
    public String visit(VarDeclaration varDeclaration) {
        if(varDeclaration.getRValue() != null){

            BinaryExpression assignExpression = new BinaryExpression(varDeclaration.getIdentifier(), varDeclaration.getRValue(), BinaryOperator.ASSIGN);

            addCommand(this.visit(assignExpression));
        }
        return null;
    }

    @Override
    public String visit(AssignStmt assignmentStmt) {
        BinaryExpression assignExpression = new BinaryExpression(assignmentStmt.getLValue(), assignmentStmt.getRValue(), BinaryOperator.ASSIGN);
        addCommand(this.visit(assignExpression));
        return null;
    }


    @Override
    public String visit(IfElseStmt conditionalStmt) {
        String elseLabel = getFreshLabel();
        String exitLabel = getFreshLabel();
        addCommand(conditionalStmt.getCondition().accept(this));
        addCommand("ifeq " + elseLabel);
        for (Statement stmt : conditionalStmt.getThenBody())
            stmt.accept(this);
        addCommand("goto " + exitLabel);
        addCommand(elseLabel + ":");
        if(conditionalStmt.getElseBody() != null)
            for (Statement stmt : conditionalStmt.getElseBody())
                stmt.accept(this);
        addCommand(exitLabel + ":");
        return null;
    }

    @Override
    public String visit(WhileStmt whileStmt) {
        ArrayList<String> commands = new ArrayList<String>();

        String startL = getFreshLabel();
        String exitL = getFreshLabel();

        addCommand(startL + ":");
        if (whileStmt.getCondition() != null) {
            addCommand(whileStmt.getCondition().accept(this));
            addCommand("ifeq " + exitL);
        }
        if (whileStmt.getBody() != null) {
            for (Statement statement : whileStmt.getBody())
            statement.accept(this);
        }
        addCommand("goto " + startL);
        addCommand(exitL + ":");
        return null;
    }

    @Override
    public String visit(MethodCall methodCall) {
        System.out.println("b");
        int slot = slotOf(((Identifier) methodCall.getInstance()).getName());
        if (methodCall.getFunctionName().getName().equals("Connect")) {
            System.out.println("b");
            for(var arg : methodCall.getArgs()){
                String secondCommands=arg.accept(this);
                System.out.println(secondCommands);

                addCommand(arg.accept(this));
            }

            addCommand("ldc 1");
            addCommand("pop\n");
        }
        addCommand("aload " + Integer.toString(slot));

        ArrayList<String> argsTypeSign = new ArrayList<String>();
        if(methodCall.getArgs() == null){
            addCommand("invokevirtual Order/" + methodCall.getFunctionName().getName() + "(V)V");
            return null;
        }
        else {
            for (var arg : methodCall.getArgs()) {
                arg.accept(this);
                argsTypeSign.add(makeTypeSignature(arg.getType()));
            }
        }

        addCommand("invokespecial Order/" + methodCall.getFunctionName().getName() + "(" +
                String.join("",argsTypeSign) + ")V");

        return null;

    }
    @Override
    public String visit(Identifier id){
        String commands = "";
        Type ty=id.accept(expressionTypeChecker);
        if(ty instanceof FloatType)
            commands += "fload " + slotOf(id.getName()) + "\n";
        else
        commands += "load " + slotOf(id.getName()) + "\n";
        return commands;
    }

    @Override
    public String visit(VarAccess varAccess) {

        String variable = varAccess.getVariable().getName();
        int slot = slotOf(((Identifier) varAccess.getInstance()).getName());

        addCommand("aload " + slot);
        if (variable.equals("Bid")) {
            addCommand("invokevirtual LTrade/getBid()F");
        }
        else if (variable.equals("Digits")) {
            addCommand("invokevirtual LTrade/getDigits()I");
        }
        else if (variable.equals("Candles")) {
            addCommand("invokevirtual LTrade/getCandlesNum()I");
        }
        else if (variable.equals("Time")) {
            addCommand("invokevirtual LTrade/getCandlesNum()Ljava/lang/String;");
        }
        else if (variable.equals("Open")) {
            addCommand("invokevirtual LCandle/getOpenPrice()F");
        }
        else if (variable.equals("Close")) {
            addCommand("invokevirtual LCandle/getClosePrice()F");
        }
        else if (variable.equals("High")) {
            addCommand("invokevirtual LCandle/getHigh()F");
        }
        else if (variable.equals("Low")) {
            addCommand("invokevirtual LCandle/getLow()F");
        }
        else if (variable.equals("Volume")) {
            addCommand("invokevirtual LCandle/getVolume()D");
        }
        else if (variable.equals("Ask")) {
            addCommand("invokevirtual LTrade/getAsk()D");
        }
        else{
            addCommand("invokevirtual LYourClass/get" + variable + "()V");
        }

        return null;
    }


    @Override
    public String visit(FunctionCall funcCall) {

        String name = funcCall.getFunctionName().getName();

        if (name.equals("Print")) {
            addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
            for(var arg : funcCall.getArgs()) {
                addCommand(arg.accept(this));
                Type type =arg.getType();
                if (type instanceof IntType)
                    addCommand("invokevirtual java/io/PrintStream/println(Ljava/lang/Integer;)V");
                else if (type instanceof BoolType)
                    addCommand("invokevirtual java/io/PrintStream/println(Ljava/lang/Boolean;)V");
                else if (type instanceof StringType)
                    addCommand("invokevirtual java/io/PrintStream/println(V)V");
            }
        }

        else if (name.equals("Order")) {
            String commands="";
            for (var arg : funcCall.getArgs()) {
                String secondCommands = arg.accept(this);
                commands = secondCommands;
                if(commands!=null)
                addCommand(commands);
                Type ty=arg.accept(expressionTypeChecker);
                if(ty instanceof FloatType)
                    addCommand("f2i");
            }
            addCommand("invokespecial Order/<init>(Ljava/lang/String;III)V");
        }
        else if (name.equals("Observe")) {
            String commands="";
            for (var arg : funcCall.getArgs()) {
                String secondCommands = arg.accept(this);
                commands = secondCommands;
                if(commands!=null)
                    addCommand(commands);
            }
            addCommand("invokestatic LYourClass/Observe(Ljava/lang/String;)LTrade;");
        }
        else if (name.equals("Connect")) {
            String commands="";
            for (var arg : funcCall.getArgs()) {
                String secondCommands = arg.accept(this);
                commands = secondCommands;
                if(commands!=null)
                    addCommand(commands);
            }
            addCommand("invokestatic LYourClass/Connect(Ljava/lang/String;Ljava/lang/String;)V");
        }
        else if (name.equals("GetCandle")) {
            String commands="";
            for (var arg : funcCall.getArgs()) {
                String secondCommands = arg.accept(this);
                commands = secondCommands;
                if(commands!=null)
                    addCommand(commands);
            }
            addCommand("invokevirtual LYourClass/GetCandle(I)V");
        }
        else {
            ArrayList<String> argsTypeSign = new ArrayList<String>();
            String commands="";
            for (var arg : funcCall.getArgs()) {
                String secondCommands = arg.accept(this);
                    commands += secondCommands;
                if(commands!=null)
                addCommand(commands);
                argsTypeSign.add(makeTypeSignature(arg.getType()));
            }
            Type type = funcCall.accept(expressionTypeChecker);
            String retruntype = makeTypeSignature(type);
            addCommand("invokestatic " + name + "(" + String.join("", argsTypeSign) + ")"+retruntype);
        }


        return null;
    }


    @Override
    public String visit(ReturnStmt returnStmt) {
        //Type type = returnStmt.getReturnedExpr().getType();
        Type type = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        //System.out.println("moi"+type);
        if(type instanceof NullType) {
            addCommand("return");
        }
        else if(type instanceof IntType) {
            addCommand("ireturn");
        }
        else if(type instanceof FloatType) {
            addCommand("freturn");
        }
        else {
            addCommand( returnStmt.getReturnedExpr().accept(this) );
            if(type instanceof IntType)
                addCommand("invokestatic java/lang/Integer/valueOf(Ljava/lang/Integer;)Ljava/lang/Integer;");
            if(type instanceof BoolType)
                addCommand("invokestatic java/lang/Boolean/valueOf(Ljava/lang/Boolean;)Ljava/lang/Boolean;");
            addCommand("areturn");
        }

        return null;
    }

    @Override
    public String visit(NullValue nullValue) {
        String commands = "";
        commands += "aconst_null\n";
        return commands;
    }

    @Override
    public String visit(IntValue intValue) {
        String commands = "";
        commands += "ldc " + intValue.getConstant() + "\n";
        return commands;
    }

    @Override
    public String visit(FloatValue floatValue) {
        String commands = "";
        commands += "ldc " + floatValue.getConstant() + "\n";
        return commands;
    }

    @Override
    public String visit(TradeValue tradeValue) {
        String commands = "";
        commands += "ldc " + tradeValue.getConstant() + "\n";
        return commands;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String commands = "";
        if(boolValue.getConstant())
            commands += "ldc 1\n";
        else
            commands += "ldc 0\n";
        return commands;
    }

    @Override
    public String visit(StringValue stringValue) {
        String commands = "";
        commands += "ldc " + stringValue.getConstant() + " "+"\n";
        return commands;
    }

}