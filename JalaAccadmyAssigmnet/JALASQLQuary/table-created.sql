

 CREATE DATABASE JALAAssignment;

-- show all databases
-- Show databases;

use jalaassignment;

-- use the command show the all tables in database


-- show tables;
CREATE TABLE People(
sNum numeric(5)  PRIMARY KEY,
fname CHAR(50),
sname CHAR(50) ,
city CHAR(20),
comm DECIMAL(8,3));

-- DESCRIBE people;

-- insert value into table

 INSERT INTO people VALUES (1001,"nikitha","mashetti","GOdhavarikhani",0.123) ;
 INSERT INTO people VALUES (1002,"kala","mashetti","GOdhavarikhani",0.123);
	INSERT INTO people VALUES (1003,"jhon","vella","vizag",2.12);
    INSERT INTO people VALUES (1004,"APJKalam","kalam","Delhi",9.2);
    INSERT INTO people VALUES (1005,"vasu","narayana","Hyderabad",24.12);
    INSERT INTO people VALUES (1006,"sai","reddy","chanai",0.12);
    INSERT INTO people VALUES (1007,"sai ram","korikanti","Bengulueru",0.72);
INSERT INTO people
VALUES
    (1001,'Peel','pK','London',0.12),
    (1002,'Serres','doe','San Jose',0.13),
    (1004,'Motika','del','London',0.11),
    (1007,'Rafkin','gaise','Barcelona',0.15),
    (1003,'Axelrod','flode','New york',0.1);


CREATE TABLE custmoer(
cnum numeric(5) PRIMARY KEY ,
sName CHAR(50) ,
city CHAR(20),
rating numeric(3),
snum  numeric(5)); 

 -- INSERT INTO custmoer VALUES(2001,'nikith','godhavarikahni',3 ,1001);
 INSERT INTO custmoer VALUES(2003,'sai','chani',2 ,1006);
 INSERT INTO custmoer VALUES(2002,'APJKalam','Dehli',300 ,1004);
 INSERT INTO custmoer VALUES(2004,'kala','godhavarikahni',100 ,1002);
-- insert multiple value is another way
INSERT INTO custmoer
 VALUES 
   (2005,'Hoffman','London',100,1001),
   (2006,'Giovanne','Rome',200,1003),
    (2007,'Liu','San Jose',300,1002),
  (2008,'Grass','Brelin',100,1002),
   (2009,'Clemens','London',300,1007),
     (2010,'Pereira','Rome',100,1004);	


-- Drop table orders;

-- Crate table orders

 CREATE TABLE orders(
 onum INT  NOT NULL ,
   amt FLOAT  NOT NULL,
 ODATE DATE NOT NULL,
 Cnum numeric(5)  ,
   snum INT ,
constraint pk_Orders_onum PRIMARY KEY(onum),
constraint FK_Orders_cnum FOREIGN KEY(Cnum) references custmoer(cnum),
constraint FK_order_snum FOREIGN KEY(snum) references people(sNum));
 
--  

INSERT INTO orders VALUES (3012,18069,'2022-03-12',2001,1002);
INSERT INTO orders VALUES (3002,196.69,'2021-02-28',2002,1003); 
INSERT INTO orders VALUES (3003,1800.00,'2022-03-12',2004,1005); 
INSERT INTO orders VALUES (3004,5146.69,'2002-01-29',2003,1001); 
INSERT INTO orders VALUES (3005,181.69,'2012-03-24',2002,1002); 
INSERT INTO orders VALUES (3006,302.69,'2002-04-10',2003,1004); 
INSERT INTO orders VALUES (3007,1802.09,'2003-02-05',2001,1001); 

INSERT INTO Orders
VALUES
    (3008,18.69,'1994-10-03',2004,1007),
    (3009,767.19,'1994-10-03',2001,1001),
    (3010,1900.10,'1994-10-03',2007,1004),
    (3011,5160.45,'1994-10-03',2003,1002),
    (3022,1098.16,'1994-10-04',2004,1007),
    (3019,1713.23,'1994-10-04',2002,1003),
    (3017,75.75,'1994-10-05',2004,1002),
    (3018,4723.00,'1994-10-05',2006,1001),
    (3020,1309.95,'1994-10-06',2004,1002),
    (3021,9891.88,'1994-10-06',2006,1001);


