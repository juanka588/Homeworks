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
        assertEquals("CREATE TABLE IF NOT EXISTS Person (person_id LONG NOT NULL AUTO_INCREMENT,age FLOAT(64),name VARCHAR(255), PRIMARY KEY (person_id));INSERT INTO Person (age,name) VALUES (23,\"juan\");"
                , translation);
    }

    @Test
    public void testCreate11() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("create (h:Person)");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        assertEquals("CREATE TABLE IF NOT EXISTS Person (person_id LONG NOT NULL AUTO_INCREMENT, PRIMARY KEY (person_id));"
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
        
        assertEquals("CREATE TABLE IF NOT EXISTS Person_Person (person_person_id LONG NOT NULL AUTO_INCREMENT,destination LONG, FOREIGN KEY (destination) REFERENCES Person(person_id),label LONG, FOREIGN KEY (label) REFERENCES Label(label_id),origin LONG, FOREIGN KEY (origin) REFERENCES Person(person_id), PRIMARY KEY (person_person_id));"
                + "CREATE TABLE IF NOT EXISTS Label (label_id LONG AUTOINCREMENT, label_name VARCHAR(255) UNIQUE, PRIMARY KEY (label_id));"
                + "SET @label := (select Label.label_id from Label where Label.label_name=\"EMPLOYEE\" limit 1);"
                + "SET @origin :=(select Person.person_id from Person where Person.name=12345 limit 1) ;"
                + "SET @destination :=(select Person.person_id from Person where Person.name=123 limit 1) ;"
                + "INSERT INTO Person_Person (Person_Person.origin,Person_Person.destination,Person_Person.label ) VALUES (@origin,@destination,@label);", translation);
    }
    
    @Test
    public void testCreate31() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("create (h:Person{name:12345})-[:OWN]->(m:Pet{age:12})");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("CREATE TABLE IF NOT EXISTS Person_Person (person_person_id LONG NOT NULL AUTO_INCREMENT,destination LONG, FOREIGN KEY (destination) REFERENCES Person(person_id),label LONG, FOREIGN KEY (label) REFERENCES Label(label_id),origin LONG, FOREIGN KEY (origin) REFERENCES Person(person_id), PRIMARY KEY (person_person_id));CREATE TABLE IF NOT EXISTS Label (label_id LONG AUTOINCREMENT, label_name VARCHAR(255) UNIQUE, PRIMARY KEY (label_id));"
                + "SET @label := (select Label.label_id from Label where Label.label_name=\"EMPLOYEE\" limit 1);"
                + "SET @origin :=(select Person.person_id from Person where Person.name=12345 limit 1) ;"
                + "SET @destination :=(select Person.person_id from Person where Person.name=12345 limit 1) ;"
                + "INSERT INTO Person_Person (Person_Person.origin,Person_Person.destination,Person_Person.label ) VALUES (@origin,@destination,@label);", translation);
    }
}
