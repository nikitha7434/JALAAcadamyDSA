
use jalaassignment;
-- Dispaly snum sname,city ,and comm of all people

SELECT * FROM people;

-- dispaly all sum without duplicates from all orders;

SELECT distinct snum  From orders;

-- display name and commissions of all people in landon
SELECT fname, Comm
FROM people
WHERE City = 'London';

-- all custmore s with rating of 100;
  select * from custmoer
  Where Rating=100;
  
  -- produce orderno,amount and date from all rows in order table.
  SELECT onum,amt,ODATE from orders;
  
  -- all custmoer in san Jose. who have rating more than 200 
  select * from custmoer 
where City ='San Jose' and Rating >200;

-- all orders for more than $1000;

SELECT * From orders 
 WHERE amt >1000;

-- all custmoer who are were either located in  in san Jose. had  rating more than 200 
select * from custmoer 
  where City ='San Jose' or  Rating >200;

-- name and citiers of all people in landon with commission  abone 0.10
SELECT fname, city
FROM people
WHERE City = 'London' && comm >0.10;

-- All customers excluding those with rating <= 100 unless they are located in Rome
select * from custmoer 
where rating <=100 and city='Rome';

-- All salespeople either in Barcelona or in london.
SELECT fname, City
FROM people
WHERE City IN ('Barcelona','london');

-- .All salespeople with commission between 0.10 and 0.12. (Boundary values should be excluded)

SELECT * FROM people 
WHERE comm BETWEEN 0.10 AND 0.12;

-- All customers with NULL values in city column.
SELECT * FROM custmoer
WHERE City IS NULL;

-- All orders taken on Oct 3Rd   and Oct 4th  1994.

SELECT * FROM orders 
WHERE  ODate IN('1994-10-03','1994-10-04');

-- All customers serviced by peel or Motika.

SELECT * FROM custmoer as c ,orders as o
WHERE  o.cnum =c.cnum 
AND o.snum IN(select sNum from people where fname in('peel' ,'Motika'));

 