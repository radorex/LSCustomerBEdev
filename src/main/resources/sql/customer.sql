create database customer;

use customer;

create table custInfo(
	custid int NOT NULL,
    username varchar(100) NOT NULL UNIQUE,
    name varchar(100) NOT NULL,
    age int NOT NULL,
    gender varchar(20) NOT NULL,
    address varchar(255) NOT NULL,
	pincode int NOT NULL,
	phonenum varchar(20) NOT NULL UNIQUE,
    email varchar(100) NOT NULL UNIQUE,
	PRIMARY KEY (custid)
);

insert into custInfo values(1001,'RajS','Raj S',20,'Male','Delhi',100001,'+919999999999','rajs@abc.com');
