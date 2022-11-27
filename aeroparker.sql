/*For Aeroparker Technical Interview*/
create database aeroparker;
use aeroparker;

create table customers(
	ID int NOT NULL AUTO_INCREMENT primary key,
    REGISTERED TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    EMAIL_ADDRESS varchar(255) NOT NULL UNIQUE,
    TITLE varchar(5) NOT NULL,
    FIRST_NAME varchar(50) NOT NULL,
    LAST_NAME varchar(50) NOT NULL,
    ADDRESS_LINE_1 varchar(255) NOT NULL,
    ADDRESS_LINE_2 varchar(255),
    CITY varchar(255),
    POSTCODE varchar(10) NOT NULL,
    PHONE_NUMBER varchar(20)
);

insert into customers
values(0, "2022-06-18T10:34:09", "ben@mail.com", "Mr", "Ben", "Shafto", "1 Main Street",
"Fleet", "Hampshire", "GU514NG", "07598241208");

select * from customers;
