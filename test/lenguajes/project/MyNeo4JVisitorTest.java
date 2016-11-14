/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import lenguajes.antlr.PSGrammarLexer;
import lenguajes.antlr.PSGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanCamilo
 */
public class MyNeo4JVisitorTest {

    public MyNeo4JVisitorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testCreate1() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("create (h:Person{name:\"juan\",age:23})");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        assertEquals("CREATE TABLE IF NOT EXISTS Person (person_id LONG NOT NULL AUTO_INCREMENT,name VARCHAR(255)(),age FLOAT(64)(), PRIMARY KEY (person_id));INSERT INTO Person VALUES (\"juan\",23);"
                , translation);
    }

    @Test
    public void testCreate2() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("create (h:Person{name:\"juan\",age:23})"
                + ",(d:Deparment{name:\"Sales\",chief:\"mike\"})");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        assertEquals("CREATE TABLE Person (name varchar());", translation);
    }
}
