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
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.items.LocalVariableSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;

public class FirstPassNameAnalyzer extends Visitor<Void> {

    private static final String ERROR_MESSAGE = "ErrorItemMessage: ";
    private static final String CLASS_REDEFINITION = "Redefinition of class ";
    private static final String METHOD_REDEFINITION = "Redefinition of method ";
    private static final String FIELD_REDEFINITION = "Redefinition of field ";
    private static final String LOCAL_VARIABLE_REDEFINITION = "Redefinition of local variable ";

    private static final String LINE = "Line:";
    private static final String COLON = ":";

    private  SymbolTable st;
    public FirstPassNameAnalyzer(SymbolTable st)
    {
        this.st = st;
    }


    @Override
    public Void visit(Program program) {

        for(ClassDeclaration dec:program.getClasses())
        {
            SymbolTable.push(SymbolTable.root);
            dec.accept(this);
        }
        return null;
    }

    private Void putClassSymbolTableItem(ClassSymbolTableItem classItem)
    {
        try
        {
            SymbolTable.top.put(classItem);
        }
        catch (ItemAlreadyExistsException e)
        {
            System.out.println(LINE+classItem.getClassDeclaration().getLine()+COLON+
                    CLASS_REDEFINITION+classItem.getName());
            classItem.setName("&" + classItem.getName());
            putClassSymbolTableItem(classItem);

        }
        return null;
    }


    @Override
    public Void visit(ClassDeclaration classDeclaration) {

        //SymbolTable st = new SymbolTable(SymbolTable.top);
        ClassSymbolTableItem classItem = new ClassSymbolTableItem(classDeclaration);
        SymbolTable currentClassSymbolTable = new SymbolTable(SymbolTable.top);
        classItem.setClassSymbolTable(currentClassSymbolTable);

        putClassSymbolTableItem(classItem);

        for(FieldDeclaration field: classDeclaration.getFields())
        {
            SymbolTable.push(classItem.getClassSymbolTable());
            field.accept(this);
        }

        SymbolTable.push(classItem.getClassSymbolTable());
        classDeclaration.getConstructor().accept(this);


        for(MethodDeclaration method: classDeclaration.getMethods())
        {   SymbolTable.push(classItem.getClassSymbolTable());
            method.accept(this);
        }

        //check field and method conflict

        SymbolTable.pop();
        return null;
    }

    private void putMethodSymbolTableItem(MethodSymbolTableItem currentMethodSymbolTableItem)
    {
        try
        {
            SymbolTable.top.put(currentMethodSymbolTableItem);
        }
        catch (ItemAlreadyExistsException e) {
            System.out.println(LINE+ currentMethodSymbolTableItem.getMethodDeclaration().getLine()+COLON+
                      METHOD_REDEFINITION + currentMethodSymbolTableItem.getName());
            currentMethodSymbolTableItem.setName("&" + currentMethodSymbolTableItem.getName());
            putMethodSymbolTableItem(currentMethodSymbolTableItem);
        }
    }


    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {

        MethodSymbolTableItem currentMethodSymbolTableItem = new MethodSymbolTableItem(methodDeclaration);
        SymbolTable currentMethodSymbolTable = new SymbolTable(SymbolTable.top);
        currentMethodSymbolTableItem.setMethodSymbolTable(currentMethodSymbolTable);

        for(VarDeclaration dec: methodDeclaration.getLocalVars())
        {
            SymbolTable.push(currentMethodSymbolTableItem.getMethodSymbolTable());
            dec.accept(this);
        }

        SymbolTable.pop();
        return null;
    }

    private  Void putFieldSymbolTableItem(FieldSymbolTableItem fst, int linenum)
    {
        try
        {
            SymbolTable.top.put(fst);
        }
        catch (ItemAlreadyExistsException e)
        {
            System.out.println(LINE+linenum+COLON+FIELD_REDEFINITION+fst.getName());
            fst.setName("&"+ fst.getName());
            putFieldSymbolTableItem(fst, linenum);
        }
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        SymbolTable.pop();
        FieldSymbolTableItem fst = new FieldSymbolTableItem(fieldDeclaration);

        putFieldSymbolTableItem(fst, fieldDeclaration.getVarDeclaration().getLine());
        return null;
    }

    private Void putLocalVariableSymbolTableItem(LocalVariableSymbolTableItem lst, int linenum)
    {
        try
        {
            SymbolTable.top.put(lst);
        }
        catch (ItemAlreadyExistsException e)
        {
            System.out.println(LINE+linenum+COLON+LOCAL_VARIABLE_REDEFINITION+lst.getName());
            lst.setName("&"+lst.getName());
            putLocalVariableSymbolTableItem(lst, linenum);
        }
        return null;
    }


    @Override
    public Void visit(VarDeclaration varDeclaration) {
        SymbolTable.pop();
        LocalVariableSymbolTableItem lst = new LocalVariableSymbolTableItem(varDeclaration);

        putLocalVariableSymbolTableItem(lst, varDeclaration.getLine());
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(BreakStmt breakStmt) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ContinueStmt continueStmt) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ForeachStmt foreachStmt) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ObjectOrListMemberAccess objectOrListMemberAccess) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ThisClass thisClass) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(NullValue nullValue) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        SymbolTable.pop();
        return null;
    }

}