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
