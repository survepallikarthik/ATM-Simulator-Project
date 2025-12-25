create database bankmanagementsystem;
     
use bankmanagementsystem;

create table login(

	formno varchar(20),
 	cardnumber varchar(25) ,
 	pin varchar(10)

);

CREATE TABLE signup (
    formno VARCHAR(20),
    name VARCHAR(50),
    father_name VARCHAR(50),
    dob VARCHAR(40),
    gender VARCHAR(20),
    email VARCHAR(50),
    marital_status VARCHAR(20),
    address VARCHAR(40),
    city VARCHAR(20),
    pincode VARCHAR(20),
    state VARCHAR(20)
);

CREATE TABLE signuptwo (
    formno VARCHAR(20),
    religion VARCHAR(20),
    category VARCHAR(20),
    income VARCHAR(20),
    education VARCHAR(20),
    occupation VARCHAR(20),
    pan VARCHAR(20),
    aadhar VARCHAR(20),
    seniorcitizen VARCHAR(20),
    existingaccount VARCHAR(20)
);

CREATE TABLE signupThree (
    formno VARCHAR(20),
    accountType VARCHAR(40),
    cardnumber VARCHAR(25),
    pin VARCHAR(10),
    facility VARCHAR(100)
);

create table bank(
    pin varchar(10),
    date varchar(50),
    type varchar(20),
    amount varchar(20)
);


