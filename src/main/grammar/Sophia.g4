grammar Sophia;

@header{
    import main.ast.types.*;
    import main.ast.types.functionPointer.*;
    import main.ast.types.list.*;
    import main.ast.types.single.*;
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.declaration.classDec.*;
    import main.ast.nodes.declaration.classDec.classMembersDec.*;
    import main.ast.nodes.declaration.variableDec.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import main.ast.nodes.statement.loop.*;
}

sophia returns[Program sophiaProgram]:
    p=program
    { $sophiaProgram = $p.programRet;}
    EOF
    ;

program returns[Program programRet]:
    {
        $programRet = new Program();
        $programRet.setLine(1);
    }
    (
        c=sophiaClass
        { $programRet.addClass($c.sophiaClassRet); }
    )*
    ;

sophiaClass returns[ClassDeclaration sophiaClassRet]
    locals[FieldDeclaration newField]:
    clskw=CLASS classidn=identifier
    {
        $sophiaClassRet = new ClassDeclaration($classidn.identifierRet);
        $sophiaClassRet.setLine($clskw.getLine());
    }
    (EXTENDS parentidn=identifier { $sophiaClassRet.setParentClassName($parentidn.identifierRet); } )?
    LBRACE (((vd1=varDeclaration {
           newFild= new FieldDeclaration($vd1.varDeclarationRet);
            newField.setLine($newField.getVarDeclaration().getLine());
            $sophiaClassRet.addField($newField);
         }
         | m1=method { $sophiaClassRet.addMethod($m1.methodDeclarationRet); }
         )* cnstr=constructor { $sophiaClassRet.setConstructor($cnstr.constructorDeclarationRet); }
         (vd2=varDeclaration {
            newFild= new FieldDeclaration($vd2.varDeclarationRet);
            newField.setLine($newField.getVarDeclaration().getLine());
            $sophiaClassRet.addField($newField);
            }
         | m2=method { $sophiaClassRet.addMethod($m2.methodDeclarationRet); })*)|
     ((vd3=varDeclaration {
         newFild= new FieldDeclaration($vd3.varDeclarationRet);
         newField.setLine($newField.getVarDeclaration().getLine());
         $sophiaClassRet.addField($newField);
         }
      | m3=method { $sophiaClassRet.addMethod($m3.methodDeclarationRet); } )*)) RBRACE;

varDeclaration returns[VarDeclaration varDeclarationRet]:
    idn=identifier COLON typ=type SEMICOLLON
    {
        $varDeclarationRet = new VarDeclaration($idn.identifierRet, $typ.typeRet);
        $varDeclarationRet.setLine($idn.identifierRet.getLine());
    }
    ;

method returns[MethodDeclaration methodDeclarationRet]:
    DEF (type | VOID) identifier LPAR methodArguments RPAR LBRACE methodBody RBRACE;

constructor: DEF identifier LPAR methodArguments RPAR LBRACE methodBody RBRACE;

methodArguments: (variableWithType (COMMA variableWithType)*)?;

variableWithType returns[ListNameType variableWithTypeRet]:
    idn=identifier COLON typ=type
    { $variableWithTypeRet = new ListNameType($idn.identifierRet, $typ.typeRet); }
    ;

type returns[Type typeRet]:
    pmdt=primitiveDataType { $typeRet = $pmdt.primitiveDataTypeRet; }
    | lt=listType { $typeRet = $lt.listTypeRet; }
    | fpt=functionPointerType { $typeRet = $fpt.fptrTypeRet; }
    | ct=classType { $typeRet = $ct.classTypeRet; }
    ;

classType returns[ClassType classTypeRet]:
    idn=identifier { $classTypeRet = new ClassType($idn.identifierRet); }
    ;

listType returns[ListType listTypeRet]:
    LIST LPAR
    ((num=INT_VALUE SHARP singtyp=type { $listTypeRet = new ListType($num.int, new ListNameType($singtyp.typeRet)); })
    | (lit=listItemsTypes { $listTypeRet = new ListType($lit.listItemsTypesRet); } ))
    RPAR
    ;

listItemsTypes returns[ArrayList<ListNameType> listItemsTypesRet]:
    { $listItemsTypesRet = new ArrayList<ListNameType>(); }
    flt=listItemType {$listItemsTypesRet.add($flt.listItemTypeRet);}
    (COMMA olt=listItemType {$listItemsTypesRet.add($olt.listItemTypeRet);} )*
    ;

listItemType returns[ListNameType listItemTypeRet]:
    vwt=variableWithType { $listItemTypeRet = $vwt.variableWithTypeRet; }
    | typ=type { $listItemTypeRet = new ListNameType($typ.typeRet); }
    ;

functionPointerType returns[FptrType fptrTypeRet]:
    { $fptrTypeRet = new FptrType(); }
    FUNC LESS_THAN
    (VOID { $fptrTypeRet.setArgumentsTypes(new ArrayList<Type>()); }
        | twc=typesWithComma { $fptrTypeRet.setArgumentsTypes($twc.typesWithCommaRet); } )
    ARROW
    ( VOID { $fptrTypeRet.setReturnType(new NullType()); }
        | rettyp=type { $fptrTypeRet.setReturnType($rettyp.typeRet);} ) GREATER_THAN
    ;

typesWithComma returns[ArrayList<Type> typesWithCommaRet]:
    {$typesWithCommaRet = new ArrayList<Type>;}
    ftyp=type {$typesWithCommaRet.add($ftyp.typeRet); }
    (COMMA otyp=type {$typesWithCommaRet.add($otyp.typeRet); })*
    ;

primitiveDataType returns[Type primitiveDataTypeRet]:
    INT { $primitiveDataTypeRet = new IntType(); }
    | STRING { $primitiveDataTypeRet = new StringType(); }
    | BOOLEAN { $primitiveDataTypeRet = new BoolType(); }
    ;

methodBody: (varDeclaration)* (statement)*;

statement: forStatement | foreachStatement | ifStatement | assignmentStatement | printStatement | continueBreakStatement | methodCallStatement | returnStatement | block;

block: LBRACE (statement)* RBRACE;

assignmentStatement: assignment SEMICOLLON;

assignment: orExpression ASSIGN expression;

printStatement: PRINT LPAR expression RPAR SEMICOLLON;

returnStatement: RETURN expression? SEMICOLLON;

methodCallStatement: methodCall SEMICOLLON;

methodCall: otherExpression ((LPAR methodCallArguments RPAR) | (DOT identifier) | (LBRACK expression RBRACK))* (LPAR methodCallArguments RPAR);

methodCallArguments: (expression (COMMA expression)*)?;

continueBreakStatement: (BREAK | CONTINUE) SEMICOLLON;

forStatement: FOR LPAR (assignment)? SEMICOLLON (expression)? SEMICOLLON (assignment)? RPAR statement;

foreachStatement: FOREACH LPAR identifier IN expression RPAR statement;

ifStatement: IF LPAR expression RPAR statement (ELSE statement)?;

expression: orExpression (ASSIGN expression)?;

orExpression: andExpression (OR andExpression)*;

andExpression: equalityExpression (AND equalityExpression)*;

equalityExpression: relationalExpression ((EQUAL | NOT_EQUAL) relationalExpression)*;

relationalExpression: additiveExpression ((GREATER_THAN | LESS_THAN) additiveExpression)*;

additiveExpression: multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*;

multiplicativeExpression: preUnaryExpression ((MULT | DIVIDE | MOD) preUnaryExpression)*;

preUnaryExpression: ((NOT | MINUS | INCREMENT | DECREMENT) preUnaryExpression) | postUnaryExpression;

postUnaryExpression: accessExpression (INCREMENT | DECREMENT)?;

accessExpression: otherExpression ((LPAR methodCallArguments RPAR) | (DOT identifier) | (LBRACK expression RBRACK))*;

otherExpression: THIS | newExpression | values | identifier | LPAR (expression) RPAR;

newExpression: NEW classType LPAR methodCallArguments RPAR;

values: boolValue | STRING_VALUE | INT_VALUE | NULL | listValue;

boolValue: TRUE | FALSE;

listValue: LBRACK methodCallArguments RBRACK;

identifier returns[Identifier identifierRet]:
    idn=IDENTIFIER
    { $identifierRet = new Identifier($idn.text); $identifierRet.setLine($idn.getLine()); }
    ;


DEF: 'def';
EXTENDS: 'extends';
CLASS: 'class';

PRINT: 'print';
FUNC: 'func';

NEW: 'new';

CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';

FOREACH: 'foreach';
IN: 'in';
FOR: 'for';
IF: 'if';
ELSE: 'else';

BOOLEAN: 'bool';
STRING: 'string';
INT: 'int';
VOID: 'void';
NULL: 'null';
LIST: 'list';

TRUE: 'true';
FALSE: 'false';

THIS: 'this';

ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';
NOT_EQUAL: '!=';
EQUAL: '==';

MULT: '*';
DIVIDE: '/';
MOD: '%';
PLUS: '+';
MINUS: '-';
AND: '&&';
OR: '||';
NOT: '!';
QUESTION_MARK: '?';

ASSIGN: '=';

INCREMENT: '++';
DECREMENT: '--';

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

SHARP: '#';
COMMA: ',';
DOT: '.';
COLON: ':';
SEMICOLLON: ';';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
STRING_VALUE: '"'~["]*'"';
COMMENT: ('//' ~( '\r' | '\n')*) -> skip;
WS: ([ \t\n\r]) -> skip;