create database quanly_sinhvien;
use quanly_sinhvien;

create table class(
id int primary key auto_increment,
name varchar(100)
);

insert into class values (1, "Dong");

create table teacher(
id int not null primary key auto_increment,
name varchar(100),
age int,
conutry varchar(200)
);

insert into teacher values(2, "Chi", 27, "Da Nang");

select *from class;
select * from teacher;
 