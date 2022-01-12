REM   Script: Activity8
REM   Activity8

select * from orders 
;

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

select sum(purchase_amount) from orders;

select avg(purchase_amount) from orders;

select max(purchase_amount) from orders;

select min(purchase_amount) from orders;

select COUNT(distinct salesman_id) AS "Total count" from orders;

select * from orders 
;

select PURCHASE_AMOUNT,CUSTOMER_ID from orders group by PURCHASE_AMOUNT;

select * from orders 
select PURCHASE_AMOUNT,CUSTOMER_ID from orders group by CUSTOMER_ID;

select * from orders 
select PURCHASE_AMOUNT,CUSTOMER_ID from orders Group by CUSTOMER_ID;

select max(PURCHASE_AMOUNT),CUSTOMER_ID from orders Group by CUSTOMER_ID;

select * from orders;

select max(PURCHASE_AMOUNT),SALESMAN_ID from orders Group by SALESMAN_ID;

select max(PURCHASE_AMOUNT),SALESMAN_ID from orders where order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') Group by SALESMAN_ID,order_date;

select CUSTOMER_ID,order_date,max(PURCHASE_AMOUNT) as 'max_amt' from orders Group by CUSTOMER_ID,order_date having max(PURCHASE_AMOUNT) IN (2030, 3450, 5760, 6000);

select CUSTOMER_ID,order_date,max(PURCHASE_AMOUNT) as 'max_amt' from orders Group by CUSTOMER_ID,order_date having max(PURCHASE_AMOUNT) IN (2030, 3450, 5760, 6000);

select * from orders 
select max(PURCHASE_AMOUNT),CUSTOMER_ID from orders Group by CUSTOMER_ID 
 
select max(PURCHASE_AMOUNT),SALESMAN_ID from orders where order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') Group by SALESMAN_ID,order_date 
 
select CUSTOMER_ID,order_date,max(PURCHASE_AMOUNT) as 'max_amt' from orders  
 Group by CUSTOMER_ID,order_date  
 Having max(PURCHASE_AMOUNT) IN (2030, 3450, 5760, 6000);

select CUSTOMER_ID,order_date,max(PURCHASE_AMOUNT) as 'max_amt' from orders  
 Group by CUSTOMER_ID,order_date  
 Having max(PURCHASE_AMOUNT) IN (2030, 3450, 5760, 6000);

select CUSTOMER_ID,order_date,max(PURCHASE_AMOUNT) as "max_amt" from orders  
 Group by CUSTOMER_ID,order_date  
 Having max(PURCHASE_AMOUNT) IN (2030, 3450, 5760, 6000);

