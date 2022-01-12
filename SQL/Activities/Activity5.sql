REM   Script: Activity5
REM   Activity5

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

