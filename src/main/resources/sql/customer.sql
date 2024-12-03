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

insert into custInfo values(1001,'radorexx','Himanshu Shrivastava',26,'Male','Sipri Bazar, Jhansi(U.P.)',284003,'+917839909765','himansjhs@gmail.com');
