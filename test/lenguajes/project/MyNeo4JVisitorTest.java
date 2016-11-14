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
        assertEquals("CREATE TABLE IF NOT EXISTS Person (person_id LONG NOT NULL AUTO_INCREMENT,name VARCHAR(255),age FLOAT(64), PRIMARY KEY (person_id));INSERT INTO Person VALUES (\"juan\",23);"
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
    @Test
    public void testCreate3() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("create (h:Person{name:12345})-[:EMPLOYEE]->(h:Person{name:123})");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("CREATE TABLE Person_Person (person_person_id LONG NOT NULL AUTO_INCREMENT,destinantion LONG, FOREIGN KEY (destinantion) REFERENCES Person(Person_id),label LONG, FOREIGN KEY (label) REFERENCES Person(label),origin LONG, FOREIGN KEY (origin) REFERENCES Person(Person_id), PRIMARY KEY (person_person_id));"
                + "SET @label := (select label.label_id from label where label.label_name=\"EMPLOYEE\" limit 1);"
                + "SET @origin :=(select Person.Person_id from Person where Person.name=12345 limit 1) ;"
                + "SET @destination :=(select Person.Person_id from Person where Person.name=12345 limit 1) ;"
                + "INSERT INTO Person_Person (Person_Person.origin,Person_Person.destination,Person_Person.label ) VALUES (@origin,@destination,@label);", translation);
    }
}
