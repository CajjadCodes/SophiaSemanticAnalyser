package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.ListValue;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.expression.values.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.loop.BreakStmt;
import main.ast.nodes.statement.loop.ContinueStmt;
import main.ast.nodes.statement.loop.ForStmt;
import main.ast.nodes.statement.loop.ForeachStmt;

public class ASTTreePrinter extends Visitor<Void> {

    private static final String LINE = "Line:";
    private static final String COLON = ":";

    @Override
    public Void visit(Program program) {
        System.out.println(LINE +  program.getLine() + COLON + program.toString()) ;
        for(ClassDeclaration dec:program.getClasses())
        {
            dec.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        System.out.println(LINE + classDeclaration.getLine() + COLON + classDeclaration.toString()); // maybe print parent?
        classDeclaration.getClassName().accept(this);
        if(classDeclaration.getParentClassName() != null)
        {
            classDeclaration.getParentClassName().accept(this);
        }

        for(FieldDeclaration field: classDeclaration.getFields())
        {
            field.accept(this);
        }

        if(classDeclaration.getConstructor() != null)
        {
            classDeclaration.getConstructor().accept(this);
        }


        for(MethodDeclaration method: classDeclaration.getMethods())
        {
            method.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        System.out.println(LINE+ constructorDeclaration.getLine() + COLON + constructorDeclaration.toString());
        constructorDeclaration.getMethodName().accept(this);

        for(VarDeclaration dec: constructorDeclaration.getArgs()) //maybe should be deleted
        {
            dec.accept(this);
        }

        for(VarDeclaration dec: constructorDeclaration.getLocalVars())
        {
            dec.accept(this);
        }

        for(Statement stmt: constructorDeclaration.getBody())
        {
            stmt.accept(this);
        }

        //print return

        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        System.out.println(LINE + methodDeclaration.getLine() + COLON + methodDeclaration.toString());
        methodDeclaration.getMethodName().accept(this);


        for(VarDeclaration dec: methodDeclaration.getArgs()) //maybe should be deleted
        {
            dec.accept(this);
        }

        for(VarDeclaration dec: methodDeclaration.getLocalVars())
        {
            dec.accept(this);
        }

        for(Statement stmt: methodDeclaration.getBody())
        {
            stmt.accept(this);
        }

        //print return
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        System.out.println(LINE + fieldDeclaration.getLine() + COLON + fieldDeclaration.toString());
        fieldDeclaration.getVarDeclaration().accept(this);

        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        System.out.println((LINE+ varDeclaration.getLine() + COLON + varDeclaration.toString()));
        varDeclaration.getVarName().accept(this);
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        System.out.println(LINE+assignmentStmt.getLine()+COLON+assignmentStmt.toString());
        assignmentStmt.getlValue().accept(this);
        assignmentStmt.getrValue().accept(this);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        System.out.println(LINE+blockStmt.getLine()+COLON+blockStmt.toString());

        for(Statement stmt: blockStmt.getStatements())
        {
            stmt.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        System.out.println(LINE+conditionalStmt.getLine()+COLON+conditionalStmt.toString());
        //maybe should check for null
        conditionalStmt.getCondition().accept(this);
        if(conditionalStmt.getThenBody() != null)
        {
            conditionalStmt.getThenBody().accept(this);
        }
        if(conditionalStmt.getElseBody() != null)
        {
            conditionalStmt.getElseBody().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        System.out.println(LINE+ methodCallStmt.getLine()+COLON+methodCallStmt.toString());
        methodCallStmt.getMethodCall().accept(this);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        System.out.println(LINE+print.getLine()+COLON+print.toString());
        print.getArg().accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        System.out.println(LINE + returnStmt.getLine() + COLON+returnStmt.toString());
        returnStmt.getReturnedExpr().accept(this);
        return null;
    }

    @Override
    public Void visit(BreakStmt breakStmt) {
        System.out.println(LINE+breakStmt.getLine()+COLON+breakStmt.toString());
        return null;
    }

    @Override
    public Void visit(ContinueStmt continueStmt) {
        System.out.println(LINE+continueStmt.getLine()+COLON+ continueStmt.toString());
        return null;
    }

    @Override
    public Void visit(ForeachStmt foreachStmt) {
        System.out.println(LINE+foreachStmt.getLine()+COLON+foreachStmt.toString());
        foreachStmt.getVariable().accept(this);
        foreachStmt.getList().accept(this);
        foreachStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        System.out.println(LINE+forStmt.getLine()+COLON+forStmt.toString());
        forStmt.getInitialize().accept(this);
        forStmt.getCondition().accept(this);
        forStmt.getUpdate().accept(this);
        forStmt.getBody().accept(this);

        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        System.out.println(LINE+binaryExpression.getLine()+COLON+binaryExpression.toString());
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        System.out.println(LINE+unaryExpression.getLine()+COLON+unaryExpression.toString());
        unaryExpression.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(ObjectOrListMemberAccess objectOrListMemberAccess) {
        System.out.println(LINE+objectOrListMemberAccess.getLine()+COLON+objectOrListMemberAccess.toString());
        objectOrListMemberAccess.getInstance().accept(this);
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        System.out.println(LINE+identifier.getLine()+COLON+identifier.toString());
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        System.out.println(LINE+listAccessByIndex.getLine()+COLON+listAccessByIndex.toString());
        listAccessByIndex.getInstance().accept(this);
        listAccessByIndex.getIndex().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        System.out.println(LINE+methodCall.getLine()+COLON+methodCall.toString());
        methodCall.getInstance().accept(this);

        for(Expression expr: methodCall.getArgs())
        {
            expr.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        System.out.println(LINE+newClassInstance.getLine()+COLON+newClassInstance.toString());

        //maybe should be removed
        for(Expression arg:newClassInstance.getArgs())
        {
            arg.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ThisClass thisClass) {
        System.out.println(LINE+thisClass.getLine()+COLON+thisClass.toString());
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        System.out.println(LINE+listValue.getLine()+COLON+listValue.toString());
        for(Expression expr:listValue.getElements())
        {
            expr.accept(this);
        }
        return null;

    }

    @Override
    public Void visit(NullValue nullValue) {
        System.out.println(LINE+nullValue.getLine()+COLON+nullValue.toString());
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        System.out.println(LINE+intValue.getLine()+COLON+intValue.toString());
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        System.out.println(LINE+boolValue.getLine()+COLON+boolValue.toString());
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        System.out.println(LINE+stringValue.getLine()+COLON+stringValue.toString());
        return null;
    }

}
