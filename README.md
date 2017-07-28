# Crypto and Compilators projects and homeworks

## Crypto
* AES algorithm
* DES algorithm
* RSA algorithm
* Matrix Rotation Based algorithm
## Neo4j to SQL Project
the life it is too short to write MySQL/SQL sentences
* ### Create Tables

Change this:
```SQL
CREATE (p:Person{age:12,name:"juan"});
```
Into this:
```SQL
CREATE TABLE IF NOT EXISTS Person (
  person_id INT(11) AUTO_INCREMENT,
  age INT(11),
  name VARCHAR(255), 
  PRIMARY KEY (person_id)
);
INSERT INTO Person (age,name) VALUES (23,"juan"); 
```
Change this:
```SQL
CREATE (h:Person{name:"juan",age:23}),(d:Deparment{name:"Sales",chief:"mike"});
```
Into this:
```SQL
CREATE TABLE IF NOT EXISTS Deparment (
  deparment_id INT(11) AUTO_INCREMENT,
  chief VARCHAR(255),
  name VARCHAR(255), 
  PRIMARY KEY (deparment_id)
);
CREATE TABLE IF NOT EXISTS Person (
  person_id INT(11) AUTO_INCREMENT,
  age INT(11),
  name VARCHAR(255), 
  PRIMARY KEY (person_id)
);
INSERT INTO Person (age,name) VALUES (23,"juan");
INSERT INTO Deparment (chief,name) VALUES ("mike","Sales");
```
Change this:
```SQL
CREATE (h:Person{name:"carlos"})-[:EMPLOYEE]->(h:Person{name:"juan"});
```
Into this:
```SQL
CREATE TABLE IF NOT EXISTS Person_Person (
  person_person_id INT(11) AUTO_INCREMENT,
  destination INT(11) NOT NULL REFERENCES Person(person_id),
  label INT(11) NOT NULL REFERENCES Label(label_id),
  origin INT(11) NOT NULL REFERENCES Person(person_id), 
  PRIMARY KEY (person_person_id)
);
CREATE TABLE IF NOT EXISTS Label (
  label_id INT(11) AUTO_INCREMENT,
  label_name VARCHAR(255) UNIQUE, 
  PRIMARY KEY (label_id,label_name)
);
INSERT INTO Label (label_name) VALUES ("EMPLOYEE");
SET @label := (select Label.label_id from Label where Label.label_name="EMPLOYEE" limit 1);
SET @origin :=(select Person.person_id from Person where Person.name="carlos" limit 1);
SET @destination :=(select Person.person_id from Person where Person.name="juan" limit 1);
INSERT INTO Person_Person (Person_Person.origin,Person_Person.destination,Person_Person.label) 
VALUES (@origin,@destination,@label);
```
