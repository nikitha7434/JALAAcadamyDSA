-- All customers whose names begin with a letter from A to B.
use jalaassignment;

SELECT sname
FROM custmoer
WHERE sname LIKE 'A%' OR sname LIKE 'B%';

-- All orders except those with 0 or NULL value in amt field.

SELECT * 
FROM orders
WHERE amt is NOT NULL or amt !=0;

-- 18.Count the number of salespeople currently listing orders in the order table.

select count(distinct snum) as "listing order tables " from orders as o;

-- --20.Largest order taken by each salesperson with order value more than $3000.

select snum ,max(amt) from orders
where amt>3000
group by odate,snum
order by snum;

-- 19.Largest order taken by each salesperson, datewise

select snum ,odate, max(amt) from orders
group by odate ,snum
order by snum;
-- 21.Which day had the hightest total amount ordered.

select odate, amt ,snum, cnum from orders 
where amt = (select max(amt) from orders);

-- .Count all orders for Oct 3rd.

select count(odate) from orders
where odate ='1994-10-03';

-- 23.Count the number of different non NULL city values in customers table.
select count(distinct(city)) from custmoer 
where city  is NOT NULL ;
 
-- Select each customer’s smallest order.
select cnum ,min(amt) from orders;

- -- custmoer- First customer in alphabetical order whose name begins with G.
select * from custmoer
 -- select sname from custmoer
 where  sname LIKE 'G%';

-- 27.Assume that each salesperson has a 12% commission. Produce order no., salesperson no., 
-- and amount of salesperson’s commission for that order.

select onum,snum ,amt ,amt*0.12 as commision  from  orders ;

-- 29.Display the totals of orders for each day and place the results in descending order.;

select odate,count(onum) as no_of_orders from orders
GROUP BY Odate
order by count(odate) DESC;

-- 30.All combinations of salespeople and customers who shared a city. (ie same city).

select  * from people as p ,custmoer as o
where p.city = o.city;

-- Name of all customers matched with the salespeople serving them

 select snum, cnum, fname  from people as p ,custmoer as c
where p.snum =c.pnum;


-- 32.List each order number followed by the name of the customer who made the order.

select onum ,o.cnum from orders as o, custmoer as c
where o.cnum = c.cnum;

-- 33.Names of salesperson and customer for each order after the order number.

select onum ,p.fname from orders as o ,people as p, custmoer as c
 where o.cnum =c.cnum and o.snum =p.snum;

-- --34.Produce all customer serviced by salespeople with a commission above 12%.

select pnum ,cnum from custmoer as c ,people as p
where c.pnum =p.snum and p.comm >0.12;