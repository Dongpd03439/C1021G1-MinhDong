create database quanlydiemthi;
use quanlydiemthi;

create table hocsinh(

mahs varchar(20) primary key,
tenhs varchar(50),
ngaysinh datetime,
class varchar(20),
gender varchar(20)
);

create table monhoc(
mahs varchar(20) primary key,
tenmh varchar(50)
);

create table bangdiem(
mahs varchar(20),
mamh varchar(20),
diemthi int,
ngayKT datetime,
primary key( mahs, mamh),
foreign key (mahs) references hocsinh(mahs),
foreign key (mamh) references monhoc(mamh)
);

create table giaovien(
maGv varchar(20) primary key,
tenGv varchar(20),
phone varchar(10)
);

alter table monhoc add maGv varchar(20);
alter table monhoc add constraint Fk_maGv foreign key (maGv) references giaovien(maGV);