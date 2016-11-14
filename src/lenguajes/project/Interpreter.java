/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.project;

import lenguajes.antlr.*;
import java.io.File;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author JuanCamilo
 */
public class Interpreter {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File("inputNeo4J.txt")));
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        System.out.printf("translation " + loader.visit(tree));
    }

}
