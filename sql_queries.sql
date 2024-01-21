 --Jan 21 
sql queries

--create a database
create database spring_boot_app;

--to use database
use spring_boot_app;

--create a table
create table student(id int primary key auto_increment,sname varchar(20),scourse varchar(25),sfee int(10));

--to retrieve all the data from table
select * from student;



