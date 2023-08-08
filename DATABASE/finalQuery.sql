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
select * from Test

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

insert into DiagnosticCenter_
values('Padma','1990-01-02','01710123123','Bangladesh','Dhaka','Dhaka','Dhaka','Mohammadpur','New Road','85/1')

Create Table Report
(  
   uniqueCode int primary key identity(1,1),
   patientId int not null,
   centerId int not null,
   document text,
   date datetime,
  CONSTRAINT fk_report_paientId
	FOREIGN KEY (patientId)
   REFERENCES Patient_ (patientId)
   on DELETE CASCADE,

  CONSTRAINT fk_report_doctorId
	FOREIGN KEY (centerId)
   REFERENCES DiagnosticCenter_ (centerId)
   on DELETE CASCADE,
)


select * from Report

Create Table Prescription
(  
   uniqueCode int primary key identity(1,1),
   patientId int not null,
   doctorId int not null,
   document text,
   date datetime,
  CONSTRAINT fk_prescription_paientId
	FOREIGN KEY (patientId)
   REFERENCES Patient_ (patientId)
   on DELETE CASCADE,

  CONSTRAINT fk_prescription_doctorId
	FOREIGN KEY (doctorId)
   REFERENCES Doctor_ (doctorId)
   on DELETE CASCADE,
)

select * from Prescription