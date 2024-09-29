use hotelNP;
show databases;
 
create table login(username varchar(25), password varchar(25));
select * from login;
insert into login values('nidhipatel','181599');

create table room(room_number varchar(20), availability varchar(20), price varchar(20), cleaning_status varchar(20), bed_type varchar(20));
select * from room;

create table employee(name varchar(20), age varchar(20), gender varchar(20), job varchar(20), salary varchar(20), phone varchar(20), sin varchar(20), email varchar(20));
SET SQL_SAFE_UPDATES = 0;
DELETE FROM employee WHERE age = 25;

create table driver(name varchar(20), age varchar(20), gender varchar(20), company varchar(20), carname varchar(20), available varchar(20), location varchar(20));
select * from driver;

create table login2(user_name varchar(20), password varchar(20));
select * from login2;
insert into login2 values ('nidhi_p', '180705');

create table department(department varchar(100), sub_division varchar(100), budget varchar(50));
select * from department;
INSERT INTO department (department, sub_division, budget) VALUES
('Rooms Division', 'Front Office', 200000),
('Rooms Division', 'Housekeeping', 300000),
('Food and Beverage', 'Restaurant', 400000),
('Food and Beverage', 'Bar', 200000),
('Food and Beverage', 'Room Service', 150000),
('Sales and Marketing', 'Sales', 100000),
('Sales and Marketing', 'Marketing', 100000),
('Engineering and Maintenance', 'Maintenance Staff', 250000),
('Human Resources', 'Recruitment', 70000),
('Human Resources', 'Training', 80000),
('Accounting and Finance', 'Accounting', 150000),
('Information Technology', 'IT Staff', 70000),
('Guest Services', 'Concierge', 60000),
('Security', 'Personnel', 100000),
('Spa and Recreation', 'Spa Staff', 100000);
	
create table guest(document varchar(30), number varchar(30), name varchar(30), gender varchar(30), country varchar(30), roomnumber varchar(30), check_in_time varchar(80), deposite varchar(30));
select * from guest;

