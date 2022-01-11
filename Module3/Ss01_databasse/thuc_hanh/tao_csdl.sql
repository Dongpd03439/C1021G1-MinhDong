drop database if exists id;
CREATE DATABASE id;
use id ; 
CREATE TABLE idcode(
id int primary key,
lastnumber int, 
Firtnumber int
);
insert into idcode value (1, 3 , 5 );
SELECT * FROM id.idcode;