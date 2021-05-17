create table Students(
StudentID int primary key auto_increment not null,
First_name varchar(50) not null,
Last_name varchar(50) not null,
Age smallint not null);
create table Classes(
ClassID int primary key auto_increment not null,
Subject varchar(50) not null,
Description varchar(50) not null,
Level smallint not null);
create table Enrollment(
EnrollmentID int primary key auto_increment not null,
StudentID int,
classID int,
foreign key (StudentID) REFERENCES Students(StudentID),
foreign key (ClassID) REFERENCES Classes(ClassID))
;