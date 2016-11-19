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
    public void testCreate2() throws FileNotFoundException, IOException {
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
    public void testCreate3() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("create (h:Person{name:\"juan\",age:23})"
                + ",(d:Deparment{name:\"Sales\",chief:\"mike\"})");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        assertEquals("CREATE TABLE IF NOT EXISTS Deparment (deparment_id LONG NOT NULL AUTO_INCREMENT,chief VARCHAR(255),name VARCHAR(255), PRIMARY KEY (deparment_id));"
                + "CREATE TABLE IF NOT EXISTS Person (person_id LONG NOT NULL AUTO_INCREMENT,age FLOAT(64),name VARCHAR(255), PRIMARY KEY (person_id));"
                + "INSERT INTO Person (age,name) VALUES (23,\"juan\");"
                + "INSERT INTO Deparment (chief,name) VALUES (\"mike\",\"Sales\");", translation);
    }
    
    @Test
    public void testCreate4() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("create (h:Person{name:12345})-[:EMPLOYEE]->(h:Person{name:123})");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("CREATE TABLE IF NOT EXISTS Person_Person (person_person_id LONG NOT NULL AUTO_INCREMENT,destination LONG, FOREIGN KEY (destination) REFERENCES Person(person_id),label LONG, FOREIGN KEY (label) REFERENCES Label(label_id),origin LONG, FOREIGN KEY (origin) REFERENCES Person(person_id), PRIMARY KEY (person_person_id));"
                + "CREATE TABLE IF NOT EXISTS Label (label_id LONG AUTOINCREMENT, label_name VARCHAR(255) UNIQUE, PRIMARY KEY (label_id,label_name));"
                + "INSERT INTO Label (label_name) VALUES (\"EMPLOYEE\");"
                + "SET @label := (select Label.label_id from Label where Label.label_name=\"EMPLOYEE\" limit 1);"
                + "SET @origin :=(select Person.person_id from Person where Person.name=12345 limit 1) ;"
                + "SET @destination :=(select Person.person_id from Person where Person.name=123 limit 1) ;"
                + "INSERT INTO Person_Person (Person_Person.origin,Person_Person.destination,Person_Person.label ) VALUES (@origin,@destination,@label);", translation);
    }
    
    @Test
    public void testCreate5() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("create (h:Person{name:12345})-[:OWN]->(m:Pet{age:12})");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("CREATE TABLE IF NOT EXISTS Person_Person (person_person_id LONG NOT NULL AUTO_INCREMENT,destination LONG, FOREIGN KEY (destination) REFERENCES Person(person_id),label LONG, FOREIGN KEY (label) REFERENCES Label(label_id),origin LONG, FOREIGN KEY (origin) REFERENCES Person(person_id), PRIMARY KEY (person_person_id));"
                + "CREATE TABLE IF NOT EXISTS Label (label_id LONG AUTOINCREMENT, label_name VARCHAR(255) UNIQUE, PRIMARY KEY (label_id,label_name));"
                + "INSERT INTO Label (label_name) VALUES (\"OWN\");"
                + "SET @label := (select Label.label_id from Label where Label.label_name=\"EMPLOYEE\" limit 1);"
                + "SET @origin :=(select Person.person_id from Person where Person.name=12345 limit 1) ;"
                + "SET @destination :=(select Person.person_id from Person where Person.name=12345 limit 1) ;"
                + "INSERT INTO Person_Person (Person_Person.origin,Person_Person.destination,Person_Person.label ) VALUES (@origin,@destination,@label);", translation);
    }
    
    @Test
    public void testDelete1() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("MATCH (p:Person { name: 'Alfred' })" 
                + "DELETE");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("DELETE FROM Person AS p WHERE p.name='Alfred'", translation);
    }
    
    @Test
    public void testDelete2() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("MATCH (a { name: 'Andres' })" 
                + "REMOVE a.age" 
                + "RETURN a");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("DELETE FROM Person AS p WHERE p.name='Alfred'", translation);
    }
    
    @Test
    public void testSelect1() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("MATCH (p:Person)" 
                + "RETURN p.name");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("SELECT p.name FROM Person AS p", translation);
    }
    
    @Test
    public void testSelect2() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("MATCH (p:Person)" 
                + "RETURN p");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("SELECT p.* FROM Person AS p", translation);        
    }
    
    @Test
    public void testSelect3() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("MATCH (p:Person)" 
                + "WHERE p.name = \"Alejandro\"" 
                + "RETURN p.name");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("SELECT p.name FROM Person AS p WHERE p.name=\"Alejandro\"", translation);        
    }
    
    @Test
    public void testSelectjoin() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("match (p:Person{lastName=\"mango\", name<5*3})-[:KNOWS]->(x:Pet{id=15})   "
                + "return p,x.age");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("SET @label := (select Label.label_id from Label where Label.label_name=\"KNOWS\" limit 1);"
                + "SELECT p.*,x.age FROM Person AS p INNER JOIN Person_Pet ON p.person_id = Person_Pet.origin  INNER JOIN Person_Pet AS x ON x.pet_id = Person_Pet.destination WHERE p.lastName=\"mango\" AND p.name<5*3 AND x.id=15 AND Person_Pet.label=@label", translation);        
    }
    
    @Test
    public void testWorkshop1() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("match (p:Person) where p.born>=1965 return p");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("SELECT p.* FROM Person AS p WHERE p.born>=1965", translation);        
    }
    
    @Test
    public void testWorkshop2() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("match (p:Person)-[:ACTED_IN]-( m: Movie{title:\"The Matrix\"}) return p");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("SET @label := (select Label.label_id from Label where Label.label_name=\"ACTED_IN\" limit 1);"
                + "SELECT p.* FROM Person AS p INNER JOIN Movie_Person ON p.person_id = Movie_Person.origin  "
                + "INNER JOIN Movie_Person AS m ON m.movie_id = Movie_Person.destination WHERE Movie_Person.label=@label", translation);        
    }
    
    @Test
    public void testWorkshop3() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("match (p:Person)-[:ACTED_IN]-( m:Movie{title:\"The Matrix\"}),match (p2:Person)-[:DIRECTED]-( m:Movie{title:\"The Matrix\"}) return p,p2,m");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("SET @label := (select Label.label_id from Label where Label.label_name=\"ACTED_IN\" limit 1);"
                + "SELECT p.* FROM Person AS p INNER JOIN Movie_Person ON p.person_id = Movie_Person.origin  "
                + "INNER JOIN Movie_Person AS m ON m.movie_id = Movie_Person.destination WHERE Movie_Person.label=@label SET @label := (select Label.label_id from Label where Label.label_name=\"DIRECTED\" limit 1);"
                + "SELECT p2.*,m.* FROM Person AS p2, Movie as m "
                + "INNER JOIN Movie_Person ON p2.person_id = Movie_Person.origin  "
                + "INNER JOIN Movie_Person AS m ON m.movie_id = Movie_Person.destination WHERE Movie_Person.label=@label", translation);        
    }
    
    @Test
    public void testWorkshop4() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("match (m:Movie{title:\"The Matrix\"}) set m.relased=\"1999\" return m");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("SET @label := (select Label.label_id from Label where Label.label_name=\"ACTED_IN\" limit 1);"
                + "SELECT p.* FROM Person AS p INNER JOIN Movie_Person ON p.person_id = Movie_Person.origin  "
                + "INNER JOIN Movie_Person AS m ON m.movie_id = Movie_Person.destination WHERE Movie_Person.label=@label SET @label := (select Label.label_id from Label where Label.label_name=\"DIRECTED\" limit 1);"
                + "SELECT p2.*,m.* FROM Person AS p2, Movie as m "
                + "INNER JOIN Movie_Person ON p2.person_id = Movie_Person.origin  "
                + "INNER JOIN Movie_Person AS m ON m.movie_id = Movie_Person.destination WHERE Movie_Person.label=@label", translation);        
    }
    
    @Test
    public void testWorkshop5() throws FileNotFoundException, IOException {
        ANTLRInputStream input = new ANTLRInputStream("match (p:Person)-[:ACTED_IN]->(m:Movie) return m.title, p.name;");
        Neo4JLexer lexer = new Neo4JLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Neo4JParser parser = new Neo4JParser(tokens);
        ParseTree tree = parser.init();
        MyNeo4JVisitor<Object> loader = new MyNeo4JVisitor<>();
        String translation = (String) loader.visit(tree);
        
        assertEquals("SET @label := (select Label.label_id from Label where Label.label_name=\"ACTED_IN\" limit 1);"
                + "SELECT m.title,p.name; FROM Person AS p "
                + "INNER JOIN Movie_Person ON p.person_id = Movie_Person.origin  "
                + "INNER JOIN Movie AS m ON m.movie_id = Movie_Person.destination WHERE Movie_Person.label=@label", translation);        
    }
}
