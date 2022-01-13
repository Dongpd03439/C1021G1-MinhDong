create database sinh_vien;
use sinh_vien;

create table Class (
ClassID int not null auto_increment primary key,
ClassName varchar(60) not null,
StartDate datetime not null,
Status bit
);

INSERT INTO Class
values ( 1, 'A1', '2008_12_20', 1);
Insert into Class
values ( 2, 'A2', '2008_12_20', 1);
insert into Class
values (3, 'B3', current_date, 0);

create table Student(
StudentId int not null AUTO_INCREMENT PRIMARY key,
StudentName varchar(30) not null,
Address varchar(50),
Phone varchar(20),
Status bit,
Classid int not null,
Foreign key (ClassId) references Class (ClassId)
);

insert into Student ( StudentName, Address, Phone, Status, ClassId)
values('Hung', 'Ha Noi', '0912113113', 1, 1);
insert into Student (StudentName, Address, Phone, Status, ClassId)
values('Hoa', 'Hai Phong', 1, 1);
insert into Student (StudentName, Address, Phone, Status, ClassId)
values  ('Manh', 'HCM', '0123123123', 0, 2);

create table subject (
SubId int not null AUTO_INCREMENT primary key,
SubName varchar(30) not null,
Credit tinyint not null default 1 check ( Credit >=1),
Status bit default 1
);

insert into subject
values (1, 'CF' , 5, 1), 
( 2, 'C', 6, 1), 
(3, 'HDJ', 5 , 1),
 ( 4, 'RDBMS' , 10 , 1) ;

Create table Mark (
MarkId int not  null AUTO_INCREMENT PRIMARY KEY,
SubID int not null, 
StudentId int not null,
Mark  float default 0 CHECK ( Mark BETWEEN 0 and 100 ), 
ExamTimes tinyint default 1, 
 UNIQUE (SubId, StudentId),
Foreign key (SubId) References Subject(StudentId),
Foreign key (StudentId) References Student ( StudentId)
);

insert into Mark (SubId, StudentId, Mark, ExamTimes)
values (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
	