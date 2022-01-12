REM   Script: Activity10
REM   Activity10

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

Insert ALL 
INTO customers VALUES(3002, 'Nick Rimando', 'New York', 100, 5001), 
INTO customers VALUES(3007, 'Brad Davis', 'New York', 200, 5001), 
INTO customers VALUES(3005, 'Graham Zusi', 'California', 200, 5002), 
INTO customers VALUES(3008, 'Julian Green', 'London', 300, 5002), 
INTO customers VALUES(3004, 'Fabian Johnson', 'Paris', 300, 5006), 
INTO customers VALUES(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
INTO customers VALUES(3003, 'Jozy Altidor', 'Moscow', 200, 5007),  
INTO customers VALUES(3001, 'Brad Guzan', 'London', 300, 5005);

Select 1 from DUAL;

Insert ALL 
INTO customers VALUES(3002, 'Nick Rimando', 'New York', 100, 5001) 
INTO customers VALUES(3007, 'Brad Davis', 'New York', 200, 5001) 
INTO customers VALUES(3005, 'Graham Zusi', 'California', 200, 5002) 
INTO customers VALUES(3008, 'Julian Green', 'London', 300, 5002) 
INTO customers VALUES(3004, 'Fabian Johnson', 'Paris', 300, 5006) 
INTO customers VALUES(3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
INTO customers VALUES(3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
INTO customers VALUES(3001, 'Brad Guzan', 'London', 300, 5005) 
Select 1 from DUAL;

select *from sman;

CREATE TABLE salesman (  
    salesman_id int,  
    salesman_name varchar(32),  
    salesman_city varchar(32),  
    commission int  
);

INSERT ALL  
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)  
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)  
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

 INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

select salesman_name,customer_name from sman s,customers c where s.salesman_id = c.salesman_id;

select salesman_name,customer_name from salesman s,customers c where s.salesman_id = c.salesman_id;

select salesman_name,customer_name from salesman s,customers c where s.salesman_id = c.salesman_id;

select customer_name from salesman s,customers c where c.grade <300 order by c.customer_id;

select customer_name from salesman s,customers c where c.grade <300 order by c.customer_id asc;

select customer_name from salesman s,customers c where c.grade <300 and s.salesman_id = c.salesman_id order by c.customer_id asc 
;

select customer_name,salesman_city,salesman_name from salesman s,customers c where s.commission >12 and s.salesman_id = c.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

SELECT a.customer_name AS "Customer Name", a.salesman_name, b.name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

SELECT a.customer_name AS "Customer Name", a.salesman_name, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

SELECT a.customer_name AS "Customer Name", a.customer_name, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

select customer_name from salesman s,customers c where c.grade <300 and s.salesman_id = c.salesman_id order by c.customer_id asc 
select customer_name,salesman_city,salesman_name from salesman s,customers c where s.commission >12 and s.salesman_id = c.salesman_id;

select customer_name,salesman_city,salesman_name from salesman s,customers c where s.commission >12 and s.salesman_id = c.salesman_id;

select * from salesman s,customers c,orders o where s.salesman_id = c.salesman_id and c.salesman_id =o.salesman_id;

Select order_no from orders where ( select * from customers where customer_id='3007');

Select * from orders where salesman_id= ( select distinct salesman_id from customers where customer_id='3007');

Select * from orders where salesman_id= ( select distinct salesman_id from orders where customer_id='3007');

select * from orders where salesman_id = (select salesman_id from customers where city = 'New York');

select * from orders where salesman_id IN (select salesman_id from customers where city = 'New York');

select count(*) from customers group by grade having grade >(select avg(grade) from customers where city = 'New York') ;

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders where salesman_id IN (Select salesman_id from salesman where commission=( SELECT MAX(commission) FROM salesman));

