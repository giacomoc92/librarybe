# Hastega technical test: library backend
This repositoyr is for hosting source code for the backend side of the technical test.

# DB rules
## Naming convention
No mix languages: tables name, column namem indexes name and all related db stuff will be named in english. <br/>
A table name is a singular word, all in lower case, if is composed word we use _ (es. candidate_skill). <br/>
Use an column called id (default type SERIAL) as PK in each table, also the for the join table. <br/>
Don't use composed primary key.  <br/>
PK name is tableName_pkey . <br/>
FK naming is tableName_joinColumnName_fkey . <br/>
At the moment we are not concerned about DB performance, so no other index is created except the default ones.

# Code rules
Application is written in Java, using Springboot and JPA framework. <br/>
Use Lombok to reduce boilerplate code.

# Naming convention code
All classes, interfaces and enums are expected to use Pascal case.<br/>
Variables are to be written in lowerCamelCase, and static variables are in snake case<br/>
Constants name in capital letter, if necessary using _ (es PATH, DEFAULT_PRICE). <br/>
Methods name are in camel case, starting with lowercase letter (es. calculatePrice()). <br/>

## Constructor
Where is needed, write a noArgConstructor and avery other useful constructors.

## Braces and spaces
if(condizione) {
}
Use braces for single line code block. <br/>
Attributes are written with one empty space from each line.
(es. <br/>
private int var1; <br/>
private boolean var2;) <br/>
