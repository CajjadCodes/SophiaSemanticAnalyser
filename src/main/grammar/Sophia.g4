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
           $newField= new FieldDeclaration($vd1.varDeclarationRet);
            $newField.setLine($newField.getVarDeclaration().getLine());
            $sophiaClassRet.addField($newField);
         }
         | m1=method { $sophiaClassRet.addMethod($m1.methodDeclarationRet); }
         )* cnstr=constructor { $sophiaClassRet.setConstructor($cnstr.constructorDeclarationRet); }
         (vd2=varDeclaration {
            $newField= new FieldDeclaration($vd2.varDeclarationRet);
            $newField.setLine($newField.getVarDeclaration().getLine());
            $sophiaClassRet.addField($newField);
            }
         | m2=method { $sophiaClassRet.addMethod($m2.methodDeclarationRet); })*)|
     ((vd3=varDeclaration {
         $newField= new FieldDeclaration($vd3.varDeclarationRet);
         $newField.setLine($newField.getVarDeclaration().getLine());
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

method returns[MethodDeclaration methodDeclarationRet]
    locals[boolean isRetTypeVoid]:
    { $isRetTypeVoid = false; }
    df=DEF (rettyp=type| VOID { $isRetTypeVoid = true; }) idn=identifier
     {
        $methodDeclarationRet = new MethodDeclaration($idn.identifierRet, $isRetTypeVoid? new NullType(): $rettyp.typeRet);
        $methodDeclarationRet.setLine($df.getLine());
     }
     LPAR ma=methodArguments { $methodDeclarationRet.setArgs($ma.methodArgumentsRet); }
     RPAR LBRACE methodBody[$methodDeclarationRet] RBRACE
     ;

constructor returns[ConstructorDeclaration constructorDeclarationRet]:
    df=DEF idn=identifier
    {
        $constructorDeclarationRet = new ConstructorDeclaration($idn.identifierRet);
        $constructorDeclarationRet.setLine($df.getLine());
    }
    LPAR ma=methodArguments { $constructorDeclarationRet.setArgs($ma.methodArgumentsRet); }
    RPAR LBRACE methodBody[$constructorDeclarationRet] RBRACE;

methodArguments returns[ArrayList<VarDeclaration> methodArgumentsRet]:
    { $methodArgumentsRet = new ArrayList<VarDeclaration>(); }
    (fvwt=variableWithType { $methodArgumentsRet.add($fvwt.variableWithTypeRet); }
    (COMMA ovwt=variableWithType { $methodArgumentsRet.add($ovwt.variableWithTypeRet); } )*)?
    ;

variableWithType returns[VarDeclaration variableWithTypeRet]:
    idn=identifier COLON typ=type
    {
        $variableWithTypeRet = new VarDeclaration($idn.identifierRet, $typ.typeRet);
        $variableWithTypeRet.setLine($idn.identifierRet.getLine());
    }
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
    vwt=variableWithType { $listItemTypeRet = new ListNameType($vwt.variableWithTypeRet); }
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
    {$typesWithCommaRet = new ArrayList<Type>();}
    ftyp=type {$typesWithCommaRet.add($ftyp.typeRet); }
    (COMMA otyp=type {$typesWithCommaRet.add($otyp.typeRet); })*
    ;

primitiveDataType returns[Type primitiveDataTypeRet]:
    INT { $primitiveDataTypeRet = new IntType(); }
    | STRING { $primitiveDataTypeRet = new StringType(); }
    | BOOLEAN { $primitiveDataTypeRet = new BoolType(); }
    ;

methodBody[MethodDeclaration _method]:
    (vd=varDeclaration { $_method.addLocalVar($vd.varDeclarationRet); } )*
    (st=statement { $_method.addBodyStatement($st.statementRet); } )*;

statement returns[Statement statementRet]:
    forr=forStatement { $statementRet = $forr.forStatementRet; }
    | foreachh=foreachStatement { $statementRet = $foreachh.foreachStatementRet; }
    | iff=ifStatement { $statementRet = $iff.ifStatementRet; }
    | assignn=assignmentStatement { $statementRet = $assignn.assignmentStatementRet; }
    | printt=printStatement { $statementRet = $printt.printStatementRet; }
    | contbr=continueBreakStatement { $statementRet = $contbr.continueBreakStatementRet; }
    | metcall=methodCallStatement { $statementRet = $metcall.methodCallStatementRet; }
    | rett=returnStatement { $statementRet = $rett.returnStatementRet; }
    | bl=block { $statementRet = $bl.blockRet; } ;

block returns[BlockStmt blockRet]:
    lbrc=LBRACE
    { $blockRet = new BlockStmt(); $blockRet.setLine($lbrc.getLine()); }
    (stm=statement { $blockRet.addStatement($stm.statementRet); } )*
    RBRACE
    ;

assignmentStatement returns[AssignmentStmt assignmentStatementRet]:
    assignn=assignment { $assignmentStatementRet = $assignn.assignmentRet; }
    SEMICOLLON;

assignment returns[AssignmentStmt assignmentRet]:
    orr=orExpression asgn=ASSIGN expr=expression
    {
        $assignmentRet = new AssignmentStmt($orr.orExpressionRet, $expr.expressionRet);
        $assignmentRet.setLine($asgn.getLine());
    }
    ;

printStatement returns[PrintStmt printStatementRet]:
    pr=PRINT LPAR expr=expression RPAR SEMICOLLON
    {
        $printStatementRet = new PrintStmt($expr.expressionRet);
        $printStatementRet.setLine($pr.getLine());
    }
    ;

returnStatement returns[ReturnStmt returnStatementRet]:
    {
        $returnStatementRet = new ReturnStmt();
        $returnStatementRet.setLine($ret.getLine());
    }
    ret=RETURN (expr=expression { $returnStatementRet.setReturnedExpr($expr.expressionRet); } )? SEMICOLLON
    ;

methodCallStatement returns[MethodCallStmt methodCallStatementRet]:
    mc=methodCall SEMICOLLON
    {
        $methodCallStatementRet = new MethodCallStmt($mc.methodCallRet);
        $methodCallStatementRet.setLine($mc.methodCallRet.getLine());
    }
    ;

methodCall returns[MethodCall methodCallRet] //////// Not sure yet. must debug
    locals[Expression instanceExpr]:
    initexpr=otherExpression { $instanceExpr = $initexpr.otherExpressionRet; }
    ((lprinst=LPAR mcainst=methodCallArguments RPAR {
            $instanceExpr = new MethodCall($instanceExpr, $mcainst.methodCallArgumentsRet);
            $instanceExpr.setLine($lprinst.getLine());
        } )
    | (DOT idn=identifier {
            $instanceExpr = new ObjectOrListMemberAccess($instanceExpr, $idn.identifierRet);
            $instanceExpr.setLine($idn.identifierRet.getLine());
        })
    | (lbr=LBRACK expr=expression RBRACK {
            $instanceExpr = new ListAccessByIndex($instanceExpr, $expr.expressionRet);
            $instanceExpr.setLine($lbr.getLine());
        } )
    )*
    (lprarg=LPAR mca=methodCallArguments RPAR)
    {
        $methodCallRet = new MethodCall($instanceExpr, $mca.methodCallArgumentsRet);
        $methodCallRet.setLine($lprarg.getLine());
    }
    ;

methodCallArguments returns[ArrayList<Expression> methodCallArgumentsRet]:
    { $methodCallArgumentsRet = new ArrayList<Expression>(); }
    (fexpr=expression { $methodCallArgumentsRet.add($fexpr.expressionRet); }
    (COMMA oexpr=expression { $methodCallArgumentsRet.add($oexpr.expressionRet); } )*)?;

continueBreakStatement returns[Statement continueBreakStatementRet]:
    (br=BREAK { $continueBreakStatementRet = new BreakStmt(); $continueBreakStatementRet.setLine($br.getLine());}
    | cont=CONTINUE {$continueBreakStatementRet = new ContinueStmt(); $continueBreakStatementRet.setLine($cont.getLine());}
    ) SEMICOLLON
    ;

forStatement returns[ForStmt forStatementRet]:
    forr=FOR
    {
        $forStatementRet = new ForStmt();
        $forStatementRet.setLine($forr.getLine());
    }
    LPAR (initassgn=assignment { $forStatementRet.setInitialize($initassgn.assignmentRet); } )?
    SEMICOLLON (condexpr=expression { $forStatementRet.setCondition($condexpr.expressionRet); } )?
    SEMICOLLON (updateassgn=assignment { $forStatementRet.setUpdate($updateassgn.assignmentRet); } )?
    RPAR bodystmt=statement { $forStatementRet.setBody($bodystmt.statementRet); }
    ;

foreachStatement returns[ForeachStmt foreachStatementRet]:
    forch=FOREACH LPAR idn=identifier IN listexpr=expression
    {
        $foreachStatementRet = new ForeachStmt($idn.identifierRet, $listexpr.expressionRet);
        $foreachStatementRet.setLine($forch.getLine());
    }
    RPAR bodystmt=statement { $foreachStatementRet.setBody($bodystmt.statementRet); }
    ;

ifStatement returns[ConditionalStmt ifStatementRet]:
    iff=IF LPAR condexpr=expression RPAR thenstmt=statement
    {
        $ifStatementRet = new ConditionalStmt($condexpr.expressionRet, $thenstmt.statementRet);
        $ifStatementRet.setLine($iff.getLine());
    }
    (ELSE elsestmt=statement { $ifStatementRet.setElseBody($elsestmt.statementRet); } )?
    ;

expression returns[Expression expressionRet]:
    ore=orExpression { $expressionRet = $ore.orExpressionRet; }
    (as=ASSIGN asexpr=expression
     {
        $expressionRet = new BinaryExpression($expressionRet, $asexpr.expressionRet, BinaryOperator.assign);
        $expressionRet.setLine($as.getLine());
     } )?
     ;

orExpression returns[Expression orExpressionRet]:
    fae=andExpression { $orExpressionRet = $fae.andExpressionRet; }
    (orr=OR oae=andExpression
    {
        $orExpressionRet = new BinaryExpression($orExpressionRet, $oae.andExpressionRet, BinaryOperator.or);
        $orExpressionRet.setLine($orr.getLine());
    }
    )*
    ;

andExpression returns[Expression andExpressionRet]:
    fee=equalityExpression { $andExpressionRet = $fee.equalityExpressionRet; }
    (andd=AND oee=equalityExpression
    {
        $andExpressionRet = new BinaryExpression($andExpressionRet, $oee.equalityExpressionRet, BinaryOperator.and);
        $andExpressionRet.setLine($andd.getLine());
    }
    )*
    ;

equalityExpression returns[Expression equalityExpressionRet]
    locals[BinaryOperator binop, int linenum]:
    fre=relationalExpression { $equalityExpressionRet = $fre.relationalExpressionRet; }
    ((eqq=EQUAL {$binop = BinaryOperator.eq; $linenum = $eqq.getLine();}
        | neqq=NOT_EQUAL {$binop = BinaryOperator.neq; $linenum = $neqq.getLine();} )
    ore=relationalExpression
    {
        $equalityExpressionRet = new BinaryExpression($equalityExpressionRet, $ore.relationalExpressionRet, $binop);
        $equalityExpressionRet.setLine($linenum);
    }
    )*
    ;

relationalExpression returns[Expression relationalExpressionRet]
    locals[BinaryOperator binop, int linenum]:
    fae=additiveExpression { $relationalExpressionRet = $fae.additiveExpressionRet; }
    ((gtt=GREATER_THAN {$binop = BinaryOperator.gt; $linenum = $gtt.getLine();}
        | ltt=LESS_THAN {$binop = BinaryOperator.lt; $linenum = $ltt.getLine();} )
    oae=additiveExpression
    {
        $relationalExpressionRet = new BinaryExpression($relationalExpressionRet, $oae.additiveExpressionRet, $binop);
        $relationalExpressionRet.setLine($linenum);
    }
    )*
    ;

additiveExpression returns[Expression additiveExpressionRet]
    locals[BinaryOperator binop, int linenum]:
    fme=multiplicativeExpression { $additiveExpressionRet = $fme.multiplicativeExpressionRet; }
    ((pp=PLUS {$binop = BinaryOperator.add; $linenum = $pp.getLine();}
        | mm=MINUS {$binop = BinaryOperator.sub; $linenum = $mm.getLine();} )
    ome=multiplicativeExpression
    {
        $additiveExpressionRet = new BinaryExpression($additiveExpressionRet, $ome.multiplicativeExpressionRet, $binop);
        $additiveExpressionRet.setLine($linenum);
    }
    )*
    ;

multiplicativeExpression returns[Expression multiplicativeExpressionRet]
    locals[BinaryOperator binop, int linenum]:
    fpue=preUnaryExpression { $multiplicativeExpressionRet = $fpue.preUnaryExpressionRet; }
    ((multt=MULT {$binop = BinaryOperator.mult; $linenum = $multt.getLine();}
        | divv=DIVIDE {$binop = BinaryOperator.div; $linenum = $divv.getLine();}
        | modd=MOD {$binop = BinaryOperator.mod; $linenum = $modd.getLine();} )
    opue=preUnaryExpression
    {
        $multiplicativeExpressionRet = new BinaryExpression($multiplicativeExpressionRet, $opue.preUnaryExpressionRet, $binop);
        $multiplicativeExpressionRet.setLine($linenum);
    }
    )*
    ;

preUnaryExpression returns[Expression preUnaryExpressionRet]
    locals[UnaryOperator unop, int linenum]:
    ((nt=NOT { $unop = UnaryOperator.not; $linenum = $nt.getLine(); }
        | mn=MINUS { $unop = UnaryOperator.minus; $linenum = $mn.getLine(); }
        | incc=INCREMENT { $unop = UnaryOperator.preinc; $linenum = $incc.getLine(); }
        | decc=DECREMENT { $unop = UnaryOperator.predec; $linenum = $decc.getLine(); } )
    fpue=preUnaryExpression
    {
        $preUnaryExpressionRet = new UnaryExpression($fpue.preUnaryExpressionRet, $unop);
        $preUnaryExpressionRet.setLine($linenum);
    }
    )
    | opue=postUnaryExpression { $preUnaryExpressionRet = $opue.postUnaryExpressionRet; }
    ;

postUnaryExpression returns[Expression postUnaryExpressionRet]
    locals[UnaryOperator unop, int linenum, boolean hasPostOperators]:
    { $hasPostOperators = false;}
    ae=accessExpression
    (incc=INCREMENT { $unop = UnaryOperator.postinc; $linenum = $incc.getLine(); $hasPostOperators = true; }
        | decc=DECREMENT { $unop = UnaryOperator.postdec; $linenum = $decc.getLine(); $hasPostOperators = true; } )?
    {
        $postUnaryExpressionRet = $hasPostOperators? new UnaryExpression($ae.accessExpressionRet, $unop) : $ae.accessExpressionRet;
        $postUnaryExpressionRet.setLine($linenum);
    }
    ;

accessExpression returns[Expression accessExpressionRet]:
    oe=otherExpression { $accessExpressionRet = $oe.otherExpressionRet; }
    ((lpr=LPAR mca=methodCallArguments RPAR {
        $accessExpressionRet = new MethodCall($accessExpressionRet, $mca.methodCallArgumentsRet); //////////Not sure yet
        $accessExpressionRet.setLine($lpr.getLine());
        } )
    | (DOT idn=identifier {
        $accessExpressionRet = new ObjectOrListMemberAccess($accessExpressionRet, $idn.identifierRet);
        $accessExpressionRet.setLine($idn.identifierRet.getLine());
        } )
    | (lbr=LBRACK expr=expression RBRACK {
        $accessExpressionRet = new ListAccessByIndex($accessExpressionRet, $expr.expressionRet);
        $accessExpressionRet.setLine($lbr.getLine());
        } )
    )*
    ;

otherExpression returns[Expression otherExpressionRet]:
    th=THIS { $otherExpressionRet = new ThisClass(); $otherExpressionRet.setLine($th.getLine()); }
    | ne=newExpression { $otherExpressionRet = $ne.newExpressionRet; }
    | va=values { $otherExpressionRet = $va.valuesRet; }
    | idn=identifier { $otherExpressionRet = $idn.identifierRet; }
    | LPAR (exp=expression) RPAR { $otherExpressionRet = $exp.expressionRet; }
    ;

newExpression returns[NewClassInstance newExpressionRet]:
    nw=NEW ct=classType LPAR mca=methodCallArguments RPAR
    {
        $newExpressionRet = new NewClassInstance($ct.classTypeRet, $mca.methodCallArgumentsRet);
        $newExpressionRet.setLine($nw.getLine());
    }
    ;

values returns[Value valuesRet]:
    bv=boolValue { $valuesRet = $bv.boolValueRet; }
    | sv=STRING_VALUE { $valuesRet = new StringValue($sv.text); $valuesRet.setLine($sv.getLine()); }
    | iv=INT_VALUE { $valuesRet = new IntValue($iv.int); $valuesRet.setLine($iv.getLine()); }
    | nu=NULL { $valuesRet = new NullValue(); $valuesRet.setLine($nu.getLine()); }
    | lv=listValue { $valuesRet = $lv.listValueRet; }
    ;

boolValue returns[BoolValue boolValueRet]:
    tr=TRUE { $boolValueRet = new BoolValue(true); $boolValueRet.setLine($tr.getLine()); }
    | fa=FALSE { $boolValueRet = new BoolValue(false); $boolValueRet.setLine($fa.getLine()); }
    ;

listValue returns[ListValue listValueRet]:
    lbr=LBRACK mca=methodCallArguments RBRACK
    {
        $listValueRet = new ListValue($mca.methodCallArgumentsRet);
        $listValueRet.setLine($lbr.getLine());
    }
    ;

identifier returns[Identifier identifierRet]:
    idn=IDENTIFIER
    {
        $identifierRet = new Identifier($idn.text);
        $identifierRet.setLine($idn.getLine());
    }
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