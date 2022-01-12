REM   Script: Activity3
REM   Activity3

ALTER TABLE saleman 
add column  
values( grade int default 100);

ALTER TABLE saleman 
add column  
values( grade int default 100);

ALTER TABLE saleman 
add grade int  
;

ALTER TABLE saleman 
add grade int  
;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

ALTER TABLE saleman 
add grade int ;

ALTER TABLE salesman 
add grade int  
;

update salesman set grade =100;

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

select *from salesman;

describe salesman


INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar(32), 
    salesman_city varchar(32), 
    commission int 
);

describe salesman 


select *from salesman 
 
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

ALTER TABLE salesman 
add grade int  
 
update salesman set grade =100 
;

CREATE TABLE salesman1 ( 
    salesman_id int, 
    salesman_name varchar(32), 
    salesman_city varchar(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

Create table sman(   
s_id int,   
s_name varchar(20),   
s_city varchar(20),   
commission int   
)  
;

INSERT ALL  
    INTO sman VALUES(5002, 'Nail Knite', 'Paris', 13)  
    INTO sman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO sman VALUES(5005, 'Pit Alex', 'London', 11)  
    INTO sman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
    INTO ssman VALUES(5007, 'Paul Adam', 'Rome', 13)  
SELECT 1 FROM DUAL;

INSERT ALL  
    INTO sman VALUES(5002, 'Nail Knite', 'Paris', 13)  
    INTO sman VALUES(5006, 'McLyon', 'Paris', 14)  
    INTO sman VALUES(5005, 'Pit Alex', 'London', 11)  
    INTO sman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
    INTO sman VALUES(5007, 'Paul Adam', 'Rome', 13)  
SELECT 1 FROM DUAL;

ALTER TABLE sman 
add grade int ;

update sman set grade =100 
;

select * from sman;

update sman 
set grade =200 where sman_city ='Rome';

describe sman


update sman 
set grade =200 where s_city ='Rome';

select * from sman;

update sman 
set grade =300 where s_name ='Nail Knite';

update sman 
set grade =200 where s_city ='Rome' 
 
describe sman 
select * from sman 
 
update sman 
set grade =300 where s_name ='Nail Knite' 
 
 
 
;

select * from sman;

update sman 
set s_name =Pierre where s_id =5006;

update sman 
set s_name = 'Pierre' where s_id =5006 
;

select * from sman;

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

select distinct from orders;

select distinct * from orders;

select distinct salesman_id from orders;

select order_no,order_date from orders order by order_date;

select order_no,purchase_amount from orders order by purchase_amount DESC;

select * from orders where purchase_amount <500;

select * from orders where purchase_amount between 1000,2000;

select * from orders where purchase_amount between 1000 and 2000;

select s_id,s_city from sman;

select * from sman where s_city = 'Paris';

select s_id,commission from sman where s_name ='Paul Adam';

