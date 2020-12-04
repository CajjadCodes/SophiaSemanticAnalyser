package main;

import main.ast.nodes.Program;
import main.symbolTable.SymbolTable;
import main.visitor.ASTTreePrinter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parsers.SophiaLexer;
import parsers.SophiaParser;

public class SophiaCompiler {
    public void compile(CharStream textStream) {
        SophiaLexer sophiaLexer = new SophiaLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(sophiaLexer);
        SophiaParser sophiaParser = new SophiaParser(tokenStream);
        Program program = sophiaParser.sophia().sophiaProgram;

        //Todo
//        SymbolTable st = new SymbolTable();
        ASTTreePrinter printer = new ASTTreePrinter();
        printer.visit(program);
    }

}
