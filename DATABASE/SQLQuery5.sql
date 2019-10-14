USE [master]
GO
ALTER LOGIN [sa] WITH PASSWORD='7896'
GO


Create Table Patient_
(
   patientId int primary key identity (1,1),
   firstName varchar(50),
   lastName varchar(50),
   userName varchar(50) unique,
   bloodGroup varchar(50),
   sex varchar(50),
   dateOFBirth date,
   contact varchar(50),
   country varchar(50),
   division varchar(50),
   district varchar(50),
   village varchar(50),
   thana varchar(50),
   road varchar(50),
   houseNo varchar(50),
)



create table PatientLogIn_
(
	userName varchar(50) unique,
	email varchar(50) unique,
	password varchar(50),

	CONSTRAINT fk_inv_userName
	FOREIGN KEY (userName)
	REFERENCES Patient_ (userName)
	on UPDATE CASCADE
)




Create Table Doctor_
(
   doctorID int primary key identity (1,1),
   firstName varchar(50),
   lastName varchar(50),
   userName varchar(50) unique,
   speciality varchar(50),
   degree varchar(50),
   graduatedFrom varchar(50),
   currentWorkingPlace varchar(50),
   BDMCNO varchar(50),
   bloodGroup varchar(50),
   sex varchar(50),
   dateOFBirth date,
   contact varchar(50),
   country varchar(50),
   division varchar(50),
   district varchar(50),
   village varchar(50),
   thana varchar(50),
   road varchar(50),
   houseNo varchar(50),
)



Create Table DiagnosticCenter_
(
   centerId int primary key identity (1,1),
   name varchar(50),
   established date,
   contact varchar(50),
   country varchar(50),
   division varchar(50),
   district varchar(50),
   village varchar(50),
   thana varchar(50),
   road varchar(50),
   houseNo varchar(50),
)


Create Table Test
(  
   uniqueCode int primary key identity(1,1),

   patientId int not null,
   doctorId int not null,
   document text,
   date datetime,

  CONSTRAINT fk_test_paientId
	FOREIGN KEY (patientId)
   REFERENCES Patient_ (patientId)
   on DELETE CASCADE,

  CONSTRAINT fk_test_doctorId
	FOREIGN KEY (doctorId)
   REFERENCES Doctor_ (doctorId)
   on DELETE CASCADE,
)

DROP table Report_;



create table DoctorLogIn_
(
	userName varchar(50) unique,
	email varchar(50) unique,
	password varchar(50),

	CONSTRAINT fk_inv_userName1
	FOREIGN KEY (userName)
   REFERENCES Doctor_ (userName)
   on UPDATE CASCADE
)


create table DiagnosticCenterLogIn_
(
	centerId int not null,
	email varchar(50),
	password varchar(50),
	CONSTRAINT fk_inv_centerId1
	FOREIGN KEY (centerId)
   REFERENCES DiagnosticCenter_ (centerId)
   on DELETE CASCADE,
)

Create Table Test
(  
   uniqueCode int primary key identity(1,1),
   patientId int not null,
   doctorId int not null,
   document text,
   date datetime,
  CONSTRAINT fk_test_paientId
	FOREIGN KEY (patientId)
   REFERENCES Patient_ (patientId)
   on DELETE CASCADE,

  CONSTRAINT fk_test_doctorId
	FOREIGN KEY (doctorId)
   REFERENCES Doctor_ (doctorId)
   on DELETE CASCADE,
)



use HealthCareReportSystem;

SELECT * from DoctorLogIn_;
SELECT * from Doctor_; 
SELECT * from DiagnosticCenter_;
SELECT * from DiagnosticCenterLogIn_;
SELECT * from Patient_;
SELECT * from PatientLogIn_;
SELECT * from Prescription;
SELECT * from Report;
SELECT * from Test;



insert into DiagnosticCenter_
values('Padma','1990-01-02','01710123123','Bangladesh','Dhaka','Dhaka','Dhaka','Mohammadpur','New Road','85/1')
