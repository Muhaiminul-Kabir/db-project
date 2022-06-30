USE BDInfo

CREATE TABLE Users(
	
	UserId INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	UserType VARCHAR(50) NOT NULL,
	UserName VARCHAR(255) NOT NULL,
	UserAge INT NOT NULL,
	UserMobile VARCHAR(50) UNIQUE NOT NULL,
	DivisionId INT FOREIGN KEY REFERENCES Division(DivisionId),
	DistricId INT FOREIGN KEY REFERENCES Districts(DistrictId),
	UpazilaId INT FOREIGN KEY REFERENCES Upazilas(UpazilaId),
	UserPassword VARCHAR(255) NOT NULL,
	UserGender VARCHAR(10),
	UserBg VARCHAR(5),  
	UserEmail VARCHAR(255) UNIQUE NOT NULL,
	
	  



)


select * from Users;
