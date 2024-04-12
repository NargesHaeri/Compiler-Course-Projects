grammar UTL;

//Operators
IMPLICATION_OPERATOR
    : '=>'
    ;

Q_MARK
    : '?'
    ;

COLON
    : ':'
    ;

DOT
    : '.'
    ;

LOGICAL_OR
    : '||'
    ;

LOGICAL_AND
    : '&&'
    ;

BITWISE_OR
    : '|'
    ;

BITWISE_AND
    : '&'
    ;

BITWISE_XOR
    : '^'
    ;

BITWISE_RSH
    : '>>'
    ;

BITWISE_LSH
    : '<<'
    ;

EQ
    : '=='
    ;

NOT_EQ
    : '!='
    ;

GT
    : '>'
    ;

LT
    : '<'
    ;

GT_EQ
    : '>='
    ;

LT_EQ
    : '<='
    ;

PLUS
    : '+'
    ;

DOUBLE_PLUS
    : '++'
    ;

MINUS
    : '-'
    ;

DOUBLE_MINUS
    : '--'
    ;

STAR
    : '*'
    ;

DIV
    : '/'
    ;

MOD
    : '%'
    ;

COMPLIMENT
    : '~'
    ;

LOGICAL_NOT
    : '!'
    ;

ASSIGN
    : '='
    ;

PLUS_ASSIGN
    : '+='
    ;

MINUS_ASSIGN
    : '-='
    ;

STAR_ASSIGN
    : '*='
    ;

DIVIDE_ASSIGN
    : '/='
    ;

PERCENT_ASSIGN
    : '%='
    ;

DOUBLE_QUOTE
    : '""'
    ;

AT_SIGN
    : '@'
    ;

//Reserved names
INT
    : 'int'
    ;

STRING
    : 'string'
    ;

FLOAT
    : 'float'
    ;

DOUBLE
    : 'double'
    ;

BOOLEAN
    : 'bool'
    ;


CANDLE
    : 'Candle'
    ;

TRADE
    : 'Trade'
    ;

ORDER
    : 'Order'
    ;



KEYWORD_VOID
    : 'void'
    ;

KEYWORD_SCHEDULE
    : 'schedule'
    ;

KEYWORD_STATIC
    : 'static'
    ;

KEYWORD_SHARED
    : 'shared'
    ;

KEYWORD_MAIN
    : 'Main'
    ;

KEYWORD_PRINT
    : 'Print'
    ;

KEYWORD_FOR
    : 'for'
    ;

KEYWORD_WHILE
    : 'while'
    ;

KEYWORD_BREAK
    : 'break'
    ;

KEYWORD_CONTINUE
    : 'continue'
    ;

KEYWORD_ELSE
    : 'else'
    ;

KEYWORD_IF
    : 'if'
    ;

KEYWORD_RETURN
    : 'return'
    ;


KEYWORD_TRY
    : 'try'
    ;

KEYWORD_CATCH
    : 'catch'
    ;

KEYWORD_THROW
    : 'throw'
    ;

KEYWORD_ONINIT
    : 'OnInit'
    ;

KEYWORD_ONSTART
     : 'OnStart'
     ;

KEYWORD_DIGITS
     : 'Digits'
     ;

KEYWORD_BUY
    : 'BUY'
    ;

KEYWORD_SELL
    : 'SELL'
    ;

KEYWORD_BID
    : 'Bid'
    ;

KEYWORD_ASK
    : 'Ask'
    ;

KEYWORD_TYPE
    : 'Type'
    ;

KEYWORD_VOLUME
    : 'Volume'
    ;

KEYWORD_LOW
    : 'Low'
    ;

KEYWORD_HIGH
    : 'High'
    ;

KEYWORD_CLOSE
    : 'Close'
    ;

KEYWORD_OPEN
    : 'Open'
    ;

KEYWORD_TIME
    : 'Time'
    ;

KEYWORD_TEXT
    : 'Text'
    ;

KEYWORD_EXCEPTION
    : 'Exception'
    ;


KEYWORD_PRERDER
    : 'preorder'
    ;

KEYWORD_PARALLEL
    : 'parallel'
    ;

BUILT_IN_OBSERVE
    : 'Observe'
    ;

BUILT_IN_CONNECT
    : 'Connect'
    ;

BUILT_IN_TERMINATE
    : 'Terminate'
    ;

BUILT_IN_GETCANDLE
    : 'GetCandle'
    ;

BUILT_IN_REFRESH
    : 'RefreshRate'
    ;

CURRENCY_USDETH
    : '"USDETH"'
    ;

CURRENCY_USDBNB
    : '"USDBNB"'
    ;

CURRENCY_USDADA
    : '"USDADA"'
    ;

CURRENCY_USDXRP
    : '"USDXRP"'
    ;

CURRENCY_USDIRR
    : '"USDIRR"'
    ;

CURRENCY_USDEUR
    : '"USDEUR"'
    ;

CURRENCY_BTCETH
    : '"BTCETH"'
    ;

CURRENCY_BTCBNB
    : '"BTCBNB"'
    ;

CURRENCY_BTCADA
    : '"BTCADA"'
    ;

CURRENCY_BTCXRP
    : '"BTCXRP"'
    ;

CURRENCY_BTCIRR
    : '"BTCIRR"'
    ;

CURRENCY_BTCEUR
    : '"BTCEUR"'
    ;

CURRENCY_IRRETH
    : '"IRRETH"'
    ;


//Character names
L_BRACKET
    : '['
    ;

R_BRACKET
    : ']'
    ;

L_BRACE
    : '{'
    ;

R_BRACE
    : '}'
    ;

L_PAR
    : '('
    ;

R_PAR
    : ')'
    ;

COMMA
    : ','
    ;

SEMICOLON
    : ';'
    ;

//Data type values
INT_VAL
    : [0-9]+
    ;

FLOAT_VAL
    : [0-9]+ '.' [0-9]+
    ;

BOOLEAN_VAL
    : 'true'
    | 'false'
    ;

STRING_VAL
    : '"' ~('"')* '"'
    ;

DOUBLE_VAL
    : [0-9]+ '.' [0-9]+
    ;


//Name patterns
VAR_FUNC_NAME
    : [a-zA-Z] ('_' | [a-zA-Z0-9])*
    ;

WHITE_SPACE
    : [ \t\r\n] -> skip
    ;

COMMENT
    : ('//' ~[\r\n]*  | '/*' .*? '*/') -> skip
    ;


// Parser rules
program : multiStatement? main EOF;

main
    : KEYWORD_VOID KEYWORD_MAIN L_PAR R_PAR scope
    ;

scope
    : L_BRACE scope R_BRACE
    | L_BRACE R_BRACE
    | L_BRACE multiStatement R_BRACE
    ;

multiStatement
    : statement+
    ;

statement
    : {System.out.print("VarDec:");} varInit SEMICOLON
    | {System.out.print("VarDec:");} varDec SEMICOLON
    | {System.out.print("ArrayDec:");} arrDec SEMICOLON
    | {System.out.print("ArrayDec:");} arrInit SEMICOLON
    | {System.out.println("Built-in:print");} print SEMICOLON
    | {System.out.println("Control:break");} KEYWORD_BREAK SEMICOLON
    | {System.out.println("Control:continue");} KEYWORD_CONTINUE SEMICOLON
    | {System.out.println("FunctionCall");} (refreshRate|get_candle|terminate|observe|connect|functionCall) SEMICOLON
    | {System.out.println("ConcurrencyControl:Schedule");} schedule
    | object SEMICOLON
    | catchStatement
    | tryStatement
    | throwStatement SEMICOLON
    | returnStatement SEMICOLON
    | whileLoop | forLoop
    | ifStatement
    | assignment SEMICOLON
    | inc_decStatement SEMICOLON
    | functionDeclaration
    | VAR_FUNC_NAME DOT order_methods SEMICOLON
    ;

assignment
    : VAR_FUNC_NAME (DOT (candle_attributes | trade_attributes))? assignment_expr
    | arrIndexing (DOT candle_attributes)? assignment_expr
    ;

observeAssignment
        : TRADE VAR_FUNC_NAME assignment_operators observe SEMICOLON
        ;

returnStatement
    : KEYWORD_RETURN expr
    | KEYWORD_RETURN
    ;

//Variable related rules
varInit
    : (KEYWORD_SHARED | KEYWORD_STATIC)? dataTypes VAR_FUNC_NAME{System.out.println($VAR_FUNC_NAME.getText());}
        assignment_expr
    | KEYWORD_EXCEPTION VAR_FUNC_NAME {System.out.println($VAR_FUNC_NAME.getText());} ASSIGN exceptionStatement {System.out.println("Operator:=");}
    ;

varDec
    : (KEYWORD_SHARED | KEYWORD_STATIC)? dataTypes VAR_FUNC_NAME {System.out.println($VAR_FUNC_NAME.text);}
    ;

arrDec
    : (KEYWORD_SHARED | KEYWORD_STATIC)? dataTypes (L_BRACKET INT_VAL R_BRACKET)+ VAR_FUNC_NAME
   {System.out.println($VAR_FUNC_NAME.getText() + ":" +  $INT_VAL.getText());}
    ;

arrInit
    : (KEYWORD_SHARED | KEYWORD_STATIC)? dataTypes (L_BRACKET INT_VAL R_BRACKET)+ VAR_FUNC_NAME
    {System.out.println($VAR_FUNC_NAME.getText() + ":" + $INT_VAL.getText());}
        assignment_expr
    ;

//Loop
whileLoop
    : KEYWORD_WHILE {System.out.println("Loop:while");} L_PAR expr R_PAR (scope|statement)
    ;

forLoop
    :KEYWORD_FOR {System.out.println("Loop:for");} L_PAR dataTypes VAR_FUNC_NAME COLON VAR_FUNC_NAME R_PAR
        (scope|statement)
    | KEYWORD_FOR {System.out.println("Loop:for");} L_PAR forInit? SEMICOLON expr? SEMICOLON forUpdate? R_PAR (scope|statement)
    ;

forInit
    : {System.out.print("VarDec:");} varInit
    | assignment
    ;

forUpdate
    : expr
    ;

//if else
ifStatement
    : KEYWORD_IF {System.out.println("Conditional:if");} L_PAR expr R_PAR (scope|statement) (KEYWORD_ELSE {System.out.println("Conditional:else");} (scope|statement))?
    ;

//increment decrement
inc_decStatement
    : DOUBLE_PLUS unaryExpr {System.out.println("Operator:++");}
    | DOUBLE_MINUS unaryExpr {System.out.println("Operator:--");}
    | arrayAccessExpr DOUBLE_PLUS {System.out.println("Operator:++");}
    | arrayAccessExpr DOUBLE_MINUS {System.out.println("Operator:--");}
    ;

//Built_in Functins
print
    : KEYWORD_PRINT L_PAR (functionCall|data_val) R_PAR
    ;
get_candle
    : BUILT_IN_GETCANDLE L_PAR (INT_VAL|VAR_FUNC_NAME) R_PAR
    ;

observe
    : BUILT_IN_OBSERVE L_PAR currency_list R_PAR
    ;

terminate
    : BUILT_IN_TERMINATE L_PAR R_PAR
    ;

connect
    : BUILT_IN_CONNECT L_PAR STRING_VAL COMMA STRING_VAL R_PAR
    ;

refreshRate
    : BUILT_IN_REFRESH L_PAR R_PAR
    ;

schedule
    : AT_SIGN KEYWORD_SCHEDULE ((L_PAR scheduleExpr R_PAR)|scheduleExpr) ((KEYWORD_PARALLEL | KEYWORD_PRERDER)
      ((L_PAR scheduleExpr R_PAR)|scheduleExpr|VAR_FUNC_NAME))* SEMICOLON
    ;

scheduleExpr
    : VAR_FUNC_NAME (KEYWORD_PARALLEL | KEYWORD_PRERDER) VAR_FUNC_NAME
    ;

//Object
object
    : (ORDER) L_PAR (((data_val|functionCall) COMMA)* (data_val|functionCall))? R_PAR
    ;

//Function
functionDeclaration
    : onStart | onInit
    | (dataTypes | KEYWORD_VOID) {System.out.print("MethodDec:");} VAR_FUNC_NAME {System.out.println($VAR_FUNC_NAME.text);}
        L_PAR (functionArgsList)? R_PAR
        (KEYWORD_THROW KEYWORD_EXCEPTION)?
        L_BRACE multiStatement R_BRACE
    ;

functionCall
    : VAR_FUNC_NAME L_PAR (((functionCall|data_val) COMMA)* (functionCall|data_val))? R_PAR
    ;

//OnInit
onInit
    : KEYWORD_VOID KEYWORD_ONINIT
        L_PAR TRADE VAR_FUNC_NAME R_PAR
        (KEYWORD_THROW KEYWORD_EXCEPTION)?
        scope
    ;

//OnStart
onStart
    : KEYWORD_VOID KEYWORD_ONSTART
        L_PAR TRADE VAR_FUNC_NAME R_PAR
        (KEYWORD_THROW KEYWORD_EXCEPTION)?
        scope
    ;


functionArgsList
    : (KEYWORD_SHARED | KEYWORD_STATIC)? dataTypes VAR_FUNC_NAME
    | (KEYWORD_SHARED | KEYWORD_STATIC)? dataTypes VAR_FUNC_NAME COMMA functionArgsList
    ;


//Variable referencing
negativeValue
    : MINUS INT_VAL {System.out.println("Operator:-");}
    | MINUS FLOAT_VAL {System.out.println("Operator:-");}
    ;

arrIndexing
    : VAR_FUNC_NAME L_BRACKET expr R_BRACKET
    ;

assignment_expr
    : ASSIGN expr {System.out.println("Operator:=");}
    | PLUS_ASSIGN expr {System.out.println("Operator:+=");}
    | MINUS_ASSIGN expr {System.out.println("Operator:-=");}
    | STAR_ASSIGN expr {System.out.println("Operator:*=");}
    | DIVIDE_ASSIGN expr {System.out.println("Operator:/=");}
    | PERCENT_ASSIGN expr {System.out.println("Operator:%=");}
    ;

expr
    : orExpr
    ;

orExpr
    : andExpr orExpr_
    ;

orExpr_
    : LOGICAL_OR andExpr orExpr_ {System.out.println("Operator:||");}
    |
    ;

andExpr
    : bitwiseExpr andExpr_
    ;

andExpr_
    : LOGICAL_AND bitwiseExpr andExpr_ {System.out.println("Operator:&&");}
    |
    ;

bitwiseExpr
    : eqNotEqExpr eqNotEqExpr_
    ;

bitwiseExpr_
    : BITWISE_AND eqNotEqExpr bitwiseExpr_ {System.out.println("Operator:&");}
    | BITWISE_OR eqNotEqExpr bitwiseExpr_ {System.out.println("Operator:|");}
    | BITWISE_XOR eqNotEqExpr bitwiseExpr_ {System.out.println("Operator:^");}
    |
    ;

eqNotEqExpr
    : relExpr eqNotEqExpr_
    ;

eqNotEqExpr_
    : EQ relExpr eqNotEqExpr_ {System.out.println("Operator:==");}
    | NOT_EQ relExpr eqNotEqExpr_ {System.out.println("Operator:!=");}
    |
    ;

relExpr
    : bitwiseShiftExpr relExpr_
    ;

relExpr_
    : LT bitwiseShiftExpr relExpr_ {System.out.println("Operator:<");}
    | GT bitwiseShiftExpr relExpr_{System.out.println("Operator:>");}
    | LT_EQ bitwiseShiftExpr relExpr_{System.out.println("Operator:<=");}
    | GT_EQ bitwiseShiftExpr relExpr_{System.out.println("Operator:>=");}
    |
    ;
bitwiseShiftExpr
    : addSubExpr bitwiseShiftExprExpr_
    | addSubExpr
    ;

bitwiseShiftExprExpr_
    : BITWISE_RSH addSubExpr bitwiseShiftExprExpr_{System.out.println("Operator:>>");}
    | BITWISE_LSH addSubExpr bitwiseShiftExprExpr_ {System.out.println("Operator:<<");}
    |
    ;

addSubExpr
    : multDivModExpr addSubExpr_
    | multDivModExpr
    ;

addSubExpr_
    : PLUS multDivModExpr addSubExpr_ {System.out.println("Operator:+");}
    | MINUS multDivModExpr addSubExpr_ {System.out.println("Operator:-");}
    |
    ;

multDivModExpr
    : unaryExpr multDivModExpr_
    | unaryExpr
    ;

multDivModExpr_
    : STAR unaryExpr multDivModExpr_ {System.out.println("Operator:*");}
    | DIV unaryExpr multDivModExpr_ {System.out.println("Operator:/");}
    | MOD unaryExpr multDivModExpr_ {System.out.println("Operator:%");}
    |
    ;

unaryExpr
    : DOUBLE_PLUS unaryExpr {System.out.println("Operator:++");}
    | DOUBLE_MINUS unaryExpr {System.out.println("Operator:--");}
    | PLUS unaryExpr {System.out.println("Operator:+");}
    | MINUS unaryExpr {System.out.println("Operator:-");}
    | LOGICAL_NOT unaryExpr {System.out.println("Operator:!");}
    | COMPLIMENT unaryExpr {System.out.println("Operator:~");}
    | suffixExpr
    ;

suffixExpr
    : suffixExpr DOUBLE_PLUS {System.out.println("Operator:++");}
    | suffixExpr DOUBLE_MINUS {System.out.println("Operator:--");}

    | arrayAccessExpr
    ;

arrayAccessExpr
    : VAR_FUNC_NAME L_BRACKET expr R_BRACKET (DOT (candle_attributes | trade_attributes | exception_attributes | VAR_FUNC_NAME))?
    | attributeAccessExpr
    ;

attributeAccessExpr
    : commonOperand DOT (candle_attributes | trade_attributes | exception_attributes | VAR_FUNC_NAME)
    | commonOperand
    ;

commonOperand
    : L_PAR expr R_PAR
    | exceptionStatement
    | object
    | observe | get_candle | functionCall
    | VAR_FUNC_NAME (DOT (candle_attributes | trade_attributes | exception_attributes))?
    | data_val
    ;

dataTypes
    : INT
    | FLOAT
    | STRING
    | BOOLEAN
    | DOUBLE
    | CANDLE
    | TRADE
    | ORDER
    ;

data_val
    : INT_VAL
    | FLOAT_VAL
    | BOOLEAN_VAL
    | STRING_VAL
    | KEYWORD_SELL | KEYWORD_BUY
    | VAR_FUNC_NAME
    ;

candle_attributes
    : KEYWORD_TIME
    | KEYWORD_OPEN
    | KEYWORD_CLOSE
    | KEYWORD_HIGH
    | KEYWORD_LOW
    | KEYWORD_VOLUME
    ;

trade_attributes
    : KEYWORD_BID
    | KEYWORD_ASK
    ;

order_methods
    : KEYWORD_OPEN L_PAR R_PAR
    | KEYWORD_CLOSE L_PAR R_PAR
    ;

currency_list
    : CURRENCY_USDETH
    | CURRENCY_USDBNB
    | CURRENCY_USDADA
    | CURRENCY_USDXRP
    | CURRENCY_USDIRR
    | CURRENCY_USDEUR
    | CURRENCY_BTCETH
    | CURRENCY_BTCBNB
    | CURRENCY_BTCADA
    | CURRENCY_BTCXRP
    | CURRENCY_BTCIRR
    | CURRENCY_BTCEUR
    | CURRENCY_IRRETH
    | DOUBLE_QUOTE
    ;

assignment_operators
    : ASSIGN
    | PLUS_ASSIGN
    | MINUS_ASSIGN
    | STAR_ASSIGN
    | DIVIDE_ASSIGN
    | PERCENT_ASSIGN
    ;

tryStatement
    : KEYWORD_TRY scope
    ;

catchStatement
    : KEYWORD_CATCH KEYWORD_EXCEPTION VAR_FUNC_NAME scope
    ;

throwStatement
    : KEYWORD_THROW exceptionStatement
    | KEYWORD_THROW VAR_FUNC_NAME
    ;

exceptionStatement
    :  KEYWORD_EXCEPTION L_PAR INT_VAL COMMA STRING_VAL R_PAR {System.out.println("ErrorControl:"+$INT_VAL.getText());}
    ;

exception_attributes
    : KEYWORD_TYPE
    | KEYWORD_TEXT
    ;
