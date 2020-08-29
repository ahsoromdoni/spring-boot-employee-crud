# spring-boot-employee-crud

### Requirements
```
-Java version 1.8.0
```

### Setup DB
Creat your database with schema "MMI"

Insert bulk for position data default with query below:
```
INSERT INTO t1_position(id, code, name, is_delete) values (1, "PRG", "Programmer", 0);
INSERT INTO t1_position(id, code, name, is_delete) values (2, "BPR", "BPR", 0);
INSERT INTO t1_position(id, code, name, is_delete) values (3, "TEST", "Tester", 0);
INSERT INTO t1_position(id, code, name, is_delete) values (4, "HELP", "Help Desk", 0);
INSERT INTO t1_position(id, code, name, is_delete) values (5, "STF", "Staff", 0);
```

### How to run
```
-git clone https://github.com/ahsoromdoni/spring-boot-employee-crud.git
-Open your terminal in current path
-cd spring-boot-employee-crud
```
After you are in the project folder then type this command below, this command for create .jar file. Jar file that created will be in folder tager with name-ish employee-mmi-0.0.1-SNAPSHOT.jar. 
```
-mvn package
```
And finaly to execute this .jar file you can type with:
```
-java -jar <name-of-jar-file>
```



# Get Simple FronEnd For This API
[https://github.com/ahsoromdoni/angular-js-employee-crud.git](https://github.com/ahsoromdoni/angular-js-employee-crud.git)