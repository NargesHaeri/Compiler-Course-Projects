grammar UTL;

@header{
    import main.ast.node.*;
    import main.ast.node.declaration.*;
    import main.ast.node.statement.*;
    import main.ast.node.expression.*;
    import main.ast.node.expression.operators.*;
    import main.ast.node.expression.values.*;
    import main.ast.type.primitiveType.*;
    import main.ast.type.complexType.*;
    import main.ast.type.*;
}
// Parser rules
// do not change first rule (program) name
program returns [Program pro] : {$pro = new Program(); $pro.setLine(0);}
    ( varDeclaration { $pro.addVar($varDeclaration.varDecRet); }
    | functionDeclaration { $pro.addFunction($functionDeclaration.funcDecRet); }
    | initDeclaration { $pro.addInit($initDeclaration.init); }
    | startDeclaration { $pro.addStart($startDeclaration.start); }
    )* mainDeclaration { $pro.setMain($mainDeclaration.main); }
    ;


statement returns [Statement statementRet] :
    ( varDeclaration { $statementRet = $varDeclaration.varDecRet; }
    | functionDeclaration { $statementRet = $functionDeclaration.funcDecRet; }
    | assignStatement { $statementRet = $assignStatement.assignStmtRet; }
    | continueBreakStatement { $statementRet = $continueBreakStatement.continueBreakStmtRet; }
    | returnStatement { $statementRet = $returnStatement.returnStmtRet; }
    | ifStatement { $statementRet = $ifStatement.ifStmtRet; }
    | whileStatement { $statementRet = $whileStatement.whileStmtRet; }
    | forStatement { $statementRet = $forStatement.forStmtRet; }
    | tryCatchStatement { $statementRet = $tryCatchStatement.tryCatchStmtRet; }
    | throwStatement { $statementRet = $throwStatement.throwStmtRet; }
    | expression SEMICOLON { $statementRet = new ExpressionStmt($expression.expressionRet); }
    );

varDeclaration returns [VarDeclaration varDecRet] :
    { $varDecRet = new VarDeclaration(); }
    allType { $varDecRet.setType($allType.allTypeRet); }
    (LBRACK INT_LITERAL RBRACK { $varDecRet.setLength($INT_LITERAL.int); })?
    iden = identifier (ASSIGN exp = expression
    { $varDecRet.setValue($exp.expressionRet);}
    )? SEMICOLON
    {
        $varDecRet.setIdentifier($iden.identifierRet);
        $varDecRet.setLine($iden.identifierRet.getLine());
    }
    ;

functionDeclaration returns [FunctionDeclaration funcDecRet] :
    { $funcDecRet = new FunctionDeclaration(); }
    primitiveType { $funcDecRet.setReturnType($primitiveType.primitiveTypeRet); }
    iden = identifier { $funcDecRet.setName($iden.identifierRet); $funcDecRet.setLine($iden.identifierRet.getLine()); }
    LPAREN
    (allType { VarDeclaration arg = new VarDeclaration(); }
    (LBRACK INT_LITERAL RBRACK { arg.setLength($INT_LITERAL.int); })?
    iden2 = identifier
    {
        arg.setType($allType.allTypeRet);
        arg.setIdentifier($iden2.identifierRet);
        arg.setLine($iden2.identifierRet.getLine());
        $funcDecRet.addArg(arg);
    }
    (COMMA allType { arg = new VarDeclaration(); }
    (LBRACK INT_LITERAL RBRACK { arg.setLength($INT_LITERAL.int); })?
    iden2 = identifier
    {
        arg.setType($allType.allTypeRet);
        arg.setIdentifier($iden2.identifierRet);
        $funcDecRet.addArg(arg);
    })*
    )?
    RPAREN (THROW EXCEPTION)?
    (LBRACE (statement { $funcDecRet.addStatement($statement.statementRet); })* RBRACE | statement { $funcDecRet.addStatement($statement.statementRet); })
    ;

mainDeclaration returns [MainDeclaration main]:
    {ArrayList<Statement> mainStmts = new ArrayList<>(); $main = new MainDeclaration();}
    VOID m = MAIN LPAREN RPAREN
    (LBRACE
    (s1 = statement
    {
        if ($s1.statementRet instanceof VarDeclaration)
        {
           if ($s1.statementRet.getType() instanceof TradeType)
           {
                VarDeclaration tradeDec = new VarDeclaration();
                tradeDec.setIdentifier($s1.statementRet.getIdentifier());
                tradeDec.setType($s1.statementRet.getType());
                $main.addTradeInstantiation(tradeDec);
           }
           mainStmts.add($s1.statementRet);
    }
    else
       mainStmts.add($s1.statementRet);
    })*

    RBRACE |
    (s2 = statement
    {
        if ($s2.statementRet instanceof VarDeclaration)
        {
           if ($s2.statementRet.getType() instanceof TradeType)
           {
                VarDeclaration tradeDec = new VarDeclaration();
                tradeDec.setIdentifier($s2.statementRet.getIdentifier());
                tradeDec.setType($s2.statementRet.getType());
                $main.addTradeInstantiation(tradeDec);
           }
           mainStmts.add($s2.statementRet);
    }
    else
       mainStmts.add($s2.statementRet);
    }))
    {
        $main.setBody(mainStmts);
        $main.setLine($m.getLine());
    }
    ;

initDeclaration returns [OnInitDeclaration init]:
    {ArrayList<Statement> onInitStmts = new ArrayList<>();}
    VOID m = ONINIT LPAREN TRADE t=identifier RPAREN (THROW EXCEPTION)?
    (LBRACE (s1 = statement {onInitStmts.add($s1.statementRet);})* RBRACE | (s2 = statement {onInitStmts.add($s2.statementRet);}))
    {
        $init = new OnInitDeclaration();
        $init.setBody(onInitStmts);
        $init.setTradeName($t.identifierRet);
        $init.setLine($m.getLine());
    }
    ;

startDeclaration returns [OnStartDeclaration start]:
    {ArrayList<Statement> onStartStmts = new ArrayList<>();}
    VOID m=ONSTART LPAREN TRADE t = identifier RPAREN (THROW EXCEPTION)?
    (LBRACE (s1 = statement {onStartStmts.add($s1.statementRet);})* RBRACE | (s2 = statement {onStartStmts.add($s2.statementRet);}))
    {
            $start = new OnStartDeclaration();
            $start.setBody(onStartStmts);
            $start.setTradeName($t.identifierRet);
            $start.setLine($m.getLine());
    }
    ;

assignStatement returns [AssignStmt assignStmtRet]:
    { Identifier identifierInstance; ArrayIdentifier arrayIdentifierInstance; boolean isArray = false; }
    lvalue = identifier
    ( LBRACK exp1 = expression RBRACK
    {
        isArray = true;
    }
    )?
    line = ASSIGN rvalue = expression SEMICOLON
    {
    if (isArray){
          arrayIdentifierInstance = new ArrayIdentifier($lvalue.identifierRet.getName(), $exp1.expressionRet);
          arrayIdentifierInstance.setLine($lvalue.identifierRet.getLine());
          $assignStmtRet = new AssignStmt(arrayIdentifierInstance , $rvalue.expressionRet);
    }
    else
    {
          identifierInstance = new Identifier($lvalue.identifierRet.getName());
          identifierInstance.setLine($lvalue.identifierRet.getLine());
          $assignStmtRet = new AssignStmt(identifierInstance , $rvalue.expressionRet);
    }
    }

    {
        $assignStmtRet.setLine($SEMICOLON.line);
    }
    ;


ifStatement returns [IfElseStmt ifStmtRet]:
    IF LPAREN (exp = expression
    {
        $ifStmtRet = new IfElseStmt($exp.expressionRet);
        $ifStmtRet.setLine($IF.getLine());
    })
    RPAREN
    (LBRACE (s1 = statement {$ifStmtRet.addThenStatement($s1.statementRet);})* RBRACE | s2 = statement {$ifStmtRet.addThenStatement($s2.statementRet);})
    (ELSE (LBRACE (s1 = statement {$ifStmtRet.addElseStatement($s1.statementRet);})* RBRACE | (s2 = statement {$ifStmtRet.addElseStatement($s2.statementRet);})))?
    ;



whileStatement returns [WhileStmt whileStmtRet]:
    WHILE LPAREN (exp = expression
    {
        $whileStmtRet = new WhileStmt($exp.expressionRet);
        $whileStmtRet.setLine($WHILE.getLine());
    }) RPAREN
    (LBRACE (s1 = statement {$whileStmtRet.addBody($s1.statementRet);})* RBRACE | (s2 = statement {$whileStmtRet.addBody($s2.statementRet);}))
    ;

forStatement returns [ForStmt forStmtRet]:
    FOR LPAREN  s1 = statement exp1 = expression
    {
        $forStmtRet = new ForStmt();
        $forStmtRet.addInit($s1.statementRet);
        $forStmtRet.setCondition($exp1.expressionRet);
        $forStmtRet.setLine($FOR.getLine());
    }
    SEMICOLON (exp2 = expression {$forStmtRet.setUpdate($exp2.expressionRet);})? RPAREN
   (LBRACE (s2 = statement {$forStmtRet.addBody($s2.statementRet);})* RBRACE | (s3 = statement {$forStmtRet.addBody($s3.statementRet);}))
    ;


tryCatchStatement returns[TryCatchStmt tryCatchStmtRet] :
    TRY {$tryCatchStmtRet = new TryCatchStmt(); $tryCatchStmtRet.setLine($TRY.getLine()); }
    (LBRACE  (s1 = statement {$tryCatchStmtRet.addTryStatement($s1.statementRet);})* RBRACE | (s2 = statement {$tryCatchStmtRet.addTryStatement($s2.statementRet);}))
    (CATCH EXCEPTION ID
    (LBRACE (s3 = statement{$tryCatchStmtRet.addCatchStatement($s3.statementRet);})* RBRACE | (s4 = statement {$tryCatchStmtRet.addCatchStatement($s4.statementRet);})))?
    ;

continueBreakStatement returns [ContinueBreakStmt continueBreakStmtRet]:
    (BREAK {$continueBreakStmtRet = new ContinueBreakStmt($BREAK.text);}
    | CONTINUE {$continueBreakStmtRet = new ContinueBreakStmt($CONTINUE.text);})
    SEMICOLON{$continueBreakStmtRet.setLine($SEMICOLON.line);};

returnStatement returns[ReturnStmt returnStmtRet]:
    RETURN exp = expression {$returnStmtRet = new ReturnStmt($exp.expressionRet);}
    SEMICOLON
    {$returnStmtRet.setLine($RETURN.getLine());}
    ;

throwStatement returns [ThrowStmt throwStmtRet]:
    THROW exp = expression {$throwStmtRet = new ThrowStmt($exp.expressionRet);}
    SEMICOLON
    {$throwStmtRet.setLine($THROW.getLine());}
    ;

functionCall returns [FunctionCall functionCallRet] :
    { Identifier functionName; }
    (
      specialFunc = specialFunction  {  functionName = new Identifier($specialFunc.text); functionName.setLine($specialFunc.start.getLine()); }
    | complexTypeRef = complexType  { functionName = new Identifier($complexTypeRef.text); functionName.setLine($complexTypeRef.start.getLine()); }
    | iden = identifier    { functionName = $iden.identifierRet; functionName.setLine($iden.identifierRet.getLine()); }
    )
    { $functionCallRet = new FunctionCall(functionName); }
    LPAREN { $functionCallRet.setLine($LPAREN.line); }
    (exp1 = expression       { $functionCallRet.addArg($exp1.expressionRet); }
    (COMMA exp2 = expression { $functionCallRet.addArg($exp2.expressionRet); })*)?
    RPAREN
    ;


methodCall returns [MethodCall methodCallRet] :
    { Identifier identifierIns; ArrayIdentifier arrayIdentifierIns; boolean isArray = false; }
    id = identifier
    ( LBRACK exp1 = expression RBRACK
    {
        isArray = true;
    }
    )?
    DOT sm = specialMethod
    {
      Identifier methodName = new Identifier($sm.text);
      methodName.setLine($sm.start.getLine());
      if (isArray){
            arrayIdentifierIns = new ArrayIdentifier($id.identifierRet.getName(), $exp1.expressionRet);
            arrayIdentifierIns.setLine($id.identifierRet.getLine());
            $methodCallRet = new MethodCall(arrayIdentifierIns, methodName);
      }
      else{
            identifierIns = new Identifier($id.identifierRet.getName());
            identifierIns.setLine($id.identifierRet.getLine());
            $methodCallRet = new MethodCall(identifierIns, methodName);
       }
      $methodCallRet.setLine($id.identifierRet.getLine());
    }
    LPAREN
    (exp2 = expression { $methodCallRet.addArg($exp2.expressionRet); }
    ( COMMA exp3 = expression { $methodCallRet.addArg($exp3.expressionRet); })*)?
    RPAREN
   ;

identifier returns[Identifier identifierRet]:
    iden = ID {$identifierRet = new Identifier($iden.text); $identifierRet.setLine($iden.getLine());}
    ;

expression returns [Expression expressionRet]:
    value { $expressionRet = $value.valueRet; }
    | e = expression DOT sv = specialVariable {Identifier varName = new Identifier($sv.text); varName.setLine($sv.start.getLine()); VarAccess varAccess = new VarAccess ($e.expressionRet, varName); varAccess.setLine($e.expressionRet.getLine()); $expressionRet = varAccess; }
    | e = expression opr=(INC | DEC) {$expressionRet = new UnaryExpression(); ((UnaryExpression) $expressionRet).setOperand($e.expressionRet); ((UnaryExpression) $expressionRet).setUnaryOperator($opr.text); $expressionRet.setLine($opr.line);}
    | opr=(NOT | MINUS | BIT_NOT | INC | DEC) e=expression {$expressionRet = new UnaryExpression();
    ((UnaryExpression) $expressionRet).setOperand($e.expressionRet);
    ((UnaryExpression) $expressionRet).setUnaryOperator($opr.text); $expressionRet.setLine($opr.line);}
    | left = expression {$expressionRet = new BinaryExpression(); ((BinaryExpression) $expressionRet).setLeft($left.expressionRet); } opr=(MULT | DIV | MOD) {((BinaryExpression) $expressionRet).setBinaryOperator ($opr.text); $expressionRet.setLine($opr.line);}
    right = expression {((BinaryExpression) $expressionRet).setRight ($right.expressionRet); $expressionRet.setLine($opr.line); }
    | left = expression {$expressionRet = new BinaryExpression(); ((BinaryExpression) $expressionRet).setLeft($left.expressionRet); } opr=(PLUS | MINUS) {((BinaryExpression) $expressionRet).setBinaryOperator($opr.text); } right = expression {((BinaryExpression) $expressionRet).setRight ($right.expressionRet); $expressionRet.setLine($opr.line); }
    | left = expression {$expressionRet = new BinaryExpression(); ((BinaryExpression) $expressionRet).setLeft($left.expressionRet); } opr=(L_SHIFT | R_SHIFT) {((BinaryExpression) $expressionRet).setBinaryOperator ($opr.text);} right = expression {((BinaryExpression) $expressionRet).setRight($right.expressionRet); $expressionRet.setLine($opr.line); }
    | left = expression {$expressionRet = new BinaryExpression(); ((BinaryExpression) $expressionRet).setLeft($left.expressionRet); } opr=(LT | GT) {((BinaryExpression) $expressionRet).setBinaryOperator ($opr.text); }
    right = expression {((BinaryExpression) $expressionRet).setRight($right.expressionRet); $expressionRet.setLine($opr.line);}
    | left = expression {$expressionRet = new BinaryExpression(); ((BinaryExpression) $expressionRet).setLeft($left.expressionRet);}
    opr=(EQ | NEQ) {((BinaryExpression) $expressionRet).setBinaryOperator($opr.text);}
    right = expression {((BinaryExpression) $expressionRet).setRight ($right.expressionRet); $expressionRet.setLine($opr.line); }
    | left = expression {$expressionRet = new BinaryExpression(); ((BinaryExpression) $expressionRet).setLeft($left.expressionRet);} opr=(BIT_AND | BIT_OR | BIT_XOR) {((BinaryExpression) $expressionRet).setBinaryOperator ($opr.text);}
    right = expression {((BinaryExpression) $expressionRet).setRight ($right.expressionRet); $expressionRet.setLine($opr.line);}
    | left = expression {$expressionRet = new BinaryExpression(); ((BinaryExpression) $expressionRet).setLeft($left.expressionRet); } AND {((BinaryExpression) $expressionRet).setBinaryOperator ($AND.text); }
    right = expression {((BinaryExpression) $expressionRet).setRight ($right.expressionRet); $expressionRet.setLine($AND.line);}
    | left = expression {$expressionRet = new BinaryExpression(); ((BinaryExpression) $expressionRet).setLeft ($left.expressionRet);} OR {((BinaryExpression) $expressionRet).setBinaryOperator ($OR.text);}
    right = expression {((BinaryExpression) $expressionRet).setRight($right.expressionRet); $expressionRet.setLine($OR.line); }
    | ID (LBRACK e = expression RBRACK) {$expressionRet = new ArrayIdentifier ($ID.text, $e.expressionRet); $expressionRet.setLine($ID.line);}
    | ID {$expressionRet = new Identifier ($ID.text); $expressionRet.setLine($ID.line);}
    | LPAREN e = expression RPAREN {$expressionRet = $e.expressionRet; $expressionRet.setLine($LPAREN.line); }
    | functionCall { $expressionRet = $functionCall.functionCallRet; }
    | methodCall { $expressionRet = $methodCall.methodCallRet; }
    ;


value returns[Value valueRet]:
    n1 = numericValue {$valueRet = $n1.numericValueRet;}
    | s = STRING_LITERAL {$valueRet = new StringValue($s.text); $valueRet.setLine($s.getLine());}
    | sell = SELL {$valueRet = new TradeValue($sell.text); $valueRet.setLine($sell.getLine());}
    | buy = BUY {$valueRet = new TradeValue($buy.text); $valueRet.setLine($buy.getLine());}
    ;

numericValue returns[Value numericValueRet]:
    i = INT_LITERAL {$numericValueRet = new IntValue($i.int); $numericValueRet.setLine($i.getLine());}
    | f = FLOAT_LITERAL {$numericValueRet = new FloatValue(Float.parseFloat($f.text)); $numericValueRet.setLine($f.getLine());}
    ;

primitiveType returns [Type primitiveTypeRet]:
    FLOAT {$primitiveTypeRet = new FloatType();}
    | DOUBLE {$primitiveTypeRet = new DoubleType();}
    | INT {$primitiveTypeRet = new IntType();}
    | BOOL {$primitiveTypeRet = new BoolType();}
    | STRING {$primitiveTypeRet = new StringType();}
    | VOID {$primitiveTypeRet = new VoidType();}
    ;

complexType returns [Type complexTypeRet]:
    ORDER {$complexTypeRet = new OrderType();}
    | TRADE {$complexTypeRet = new TradeType();}
    | CANDLE {$complexTypeRet = new CandleType();}
    | EXCEPTION {$complexTypeRet = new ExceptionType();}
    ;

allType returns [Type allTypeRet]:
    primitiveType {$allTypeRet = $primitiveType.primitiveTypeRet;}
    | complexType {$allTypeRet = $complexType.complexTypeRet;}
    ;

specialFunction: REFRESH_RATE | CONNECT | OBSERVE | GET_CANDLE | TERMINATE | PRINT;

specialVariable: ASK | BID | TIME | HIGH | LOW | DIGITS | VOLUME | TYPE | TEXT | OPEN | CLOSE;

specialMethod: OPEN | CLOSE;

assign:
    line=ASSIGN  | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN;

// Lexer rules
SPACES : [ \t\r\n]+ -> skip;
SEMICOLON : ';';
COMMA : ',';
COLON : ':';
DOT: '.';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';

AND : '&&';
OR: '||';
NOT: '!';

BIT_AND : '&';
BIT_OR : '|';
BIT_XOR : '^';
L_SHIFT : '<<';
R_SHIFT : '>>';
BIT_NOT : '~';

LT : '<';
GT : '>';
EQ : '==';
NEQ : '!=';

INC : '++';
DEC : '--';

ASSIGN : '=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';

TRY : 'try';
THROW : 'throw';
CATCH : 'catch';
IF : 'if';
ELSE : 'else';
FOR: 'for';
WHILE : 'while';
BREAK : 'break';
CONTINUE : 'continue';
RETURN : 'return';

MAIN : 'Main';
ONINIT : 'OnInit';
ONSTART : 'OnStart';

FLOAT : 'float';
DOUBLE : 'double';
STRING: 'string';
BOOL: 'bool';
VOID: 'void';
INT : 'int';

BUY : 'BUY';
SELL : 'SELL';
ASK : 'Ask';
BID : 'Bid';
TIME : 'Time';
HIGH : 'High';
LOW : 'Low';
DIGITS : 'Digits';
VOLUME : 'Volume';
TYPE: 'Type';
TEXT: 'Text';
OPEN : 'Open';
CLOSE : 'Close';

TRADE: 'Trade';
ORDER: 'Order';
CANDLE: 'Candle';
EXCEPTION: 'Exception';

REFRESH_RATE : 'RefreshRate';
GET_CANDLE : 'GetCandle';
TERMINATE : 'Terminate';
CONNECT : 'Connect';
OBSERVE : 'Observe';
PRINT : 'Print';

ID : [a-zA-Z_][a-zA-Z_0-9]*;

INT_LITERAL : [1-9][0-9]* | '0';
FLOAT_LITERAL : [0-9]* '.' [0-9]+;
STRING_LITERAL : '"' (~["])* '"';

COMMENT: (('//' ~('\r'|'\n')*) | ('/*' .*? '*/')) -> skip;
