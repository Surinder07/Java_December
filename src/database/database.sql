show databases;

drop database Example;

use Employee;

show tables;

-- Student table ?
create table STUDENT(
 STUDENT_ID INT PRIMARY KEY,
 STUDENT_NAME VARCHAR(50),
 STUDENT_ADDRESS VARCHAR(50),
 STUDENT_PHONE VARCHAR(15)
 );

 create table Customer(
 CUSTOMER_ID INT PRIMARY KEY,
 CUSTOMER_NAME VARCHAR(50),
 CUSTOMER_ADDRESS VARCHAR(50),
 CUSTOMER_PHONE VARCHAR(15),

 FOREIGN KEY(STUDENT_ID) REFERENCES STUDENT(STUDENT_ID)
 );



 insert into STUDENT(STUDENT_ID, STUDENT_NAME, STUDENT_ADDRESS, STUDENT_PHONE)
 values(4,'Surinder','Toronto', '234123443');

 -- 1,2,3,4,5

select * from STUDENT;



--------------------------------

select * from EMPLOYEE;

-- max salary from EMPLOYEE
select max(EMPLOYEE_SALARY)
from EMPLOYEE;

-- max salary from EMPLOYEE
select min(EMPLOYEE_SALARY)
from EMPLOYEE;

-- How many exmployees with salary greater 40K
select count(EMPLOYEE_SALARY) from EMPLOYEE
where
EMPLOYEE_SALARY> 70000;

-- How many exmployees with salary less than  40K
select count(EMPLOYEE_SALARY) from EMPLOYEE
where
EMPLOYEE_SALARY < 40000;

-- how many total employees are there?

select count(*) from EMPLOYEE;


select * from EMPLOYEE;
--  how much total salaries
select sum(EMPLOYEE_SALARY) from EMPLOYEE;

-- average salary
select avg(EMPLOYEE_SALARY) from EMPLOYEE;

-- LIKE
select * from EMPLOYEE
where EMPLOYEE_NAME LIKE 'S%';


-- what is join ?
/*
Inner Join     --  A        B -------common will be returned
Left  join     --  A        B   everything from table A and common between both tables
right join    ---  A.       B.  everything from table B common
full join    ---       returns all the records

*/
show tables;
select * from EMPLOYEE e;
select * from TITLES t;

-- INNER JOIN
select e.EMPLOYEE_ID, e.EMPLOYEE_NAME, t.EMPLOYEE_TITLE
from EMPLOYEE e
Inner Join TITLES t
ON
e.EMPLOYEE_ID = t.EMPLOYEE_ID;
-- LEFT JOIN

select e.EMPLOYEE_ID, e.EMPLOYEE_NAME, t.EMPLOYEE_TITLE
from EMPLOYEE e
LEFT Join TITLES t
ON
e.EMPLOYEE_ID = t.EMPLOYEE_ID;

-- RIGHT JOIN

select e.EMPLOYEE_ID, e.EMPLOYEE_NAME, t.EMPLOYEE_TITLE
from EMPLOYEE e
RIGHT Join TITLES t
ON
e.EMPLOYEE_ID = t.EMPLOYEE_ID;

-- FULL JOIN

select e.EMPLOYEE_ID, e.EMPLOYEE_NAME, t.EMPLOYEE_TITLE
from EMPLOYEE e
LEFT Join TITLES t
ON
e.EMPLOYEE_ID = t.EMPLOYEE_ID

UNION

select e.EMPLOYEE_ID, e.EMPLOYEE_NAME, t.EMPLOYEE_TITLE
from EMPLOYEE e
RIGHT Join TITLES t
ON
e.EMPLOYEE_ID = t.EMPLOYEE_ID;

-- create join between

show tables;
select * from DEPT_MANAGER;
-- list employee id , employee name, depte and employee salary



























