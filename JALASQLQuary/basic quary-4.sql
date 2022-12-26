
-- Calculate the amount of the salesperson’s commission on each order with a rating above 100.
use jalaassignment;
SELECT fname, AMT*Comm, Rating
FROM Custmoer AS C, People AS S, orders AS O
WHERE c.rating > 100 AND 
        S.Snum = C.pnum AND 
        S.Snum = O.Snum AND 
        O.Cnum = C.Cnum;

-- 6.Find all pairs of customers having the same rating.

select * from custmoer as a ,custmoer as b
where a.rating = b.rating and a.cnum !=b.cnum;

-- 37.Find all pairs of customers having the same rating, each pair coming once only.

select  a.sname,b.sname ,a.rating  from custmoer as a ,custmoer as b
where a.rating = b.rating and a.cnum != b.cnum and a.cnum < b.cnum;

-- 40.Find all pairs of customers served by single salesperson.

select * from custmoer as c ,custmoer as b
where c.pnum =b.pnum and c.cnum != b.cnum

-- -41.Produce all pairs of salespeople which are living in the same city. 
-- Exclude combinations of salespeople with themselves as well as duplicates with the order reversed.

select a.fname,b.fname from people as a ,people as b
where a.city = b.city and a.snum>b.snum;

-- .Produce all pairs of orders by given customer, names that customers and eliminates duplicates.

select a.cnum,b.cnum, a.onum from custmoer as c ,orders as a ,orders b
where a.cnum = b.cnum and
a.onum > b.onum and 
a.cnum =c.cnum;

-- .Produce names and cities of all customers with the same rating as Hoffman.

select b.sname ,b.city from custmoer as b

where b.rating =(SELECT Rating FROM Custmoer WHERE sname = 'Hoffman')and b.sname !='Hoffman' 

-- .Extract all the orders of Motika.
select snum  from orders
where snum =(select snum from people where fname ='Motika'); 

-- -50.Find all customers whose cnum is 1000 above the snum of serres.
select * from custmoer 
where cnum > (select snum+100 from people where fname='serres');

-- -49.Extract commissions of all salespeople servicing customers in London.
SELECT comm from people 
where snum IN (select snum from custmoer where City ='Landon'); 

SELECT Snum, Cnum
FROM Orders
WHERE Cnum IN (SELECT Cnum FROM Custmoer WHERE City = 'London';

-- Find average commission of salespeople in london.
SELECT AVG(Comm)
FROM People
WHERE City = 'London';

-- 6.All orders that are greater than the average for Oct 4.
SELECT * from orders
where odate>'1994-10-04';

-- 45.All orders credited to the same salesperson who services Hoffman

select * from orders as a ,custmoer as c, people as p
where a.onum =a.snum and
a.onum =a.cnum and 
a.snum =(select snum from orders where snum = (select cnum from custmoer where sname ='Haffman'))  