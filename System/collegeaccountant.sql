/*
Navicat MySQL Data Transfer

Source Server         : localdb
Source Server Version : 50027
Source Host           : localhost:3306
Source Database       : collegeaccountant

Target Server Type    : MYSQL
Target Server Version : 50027
File Encoding         : 65001

Date: 2014-05-03 13:06:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `billpayment`
-- ----------------------------
DROP TABLE IF EXISTS `billpayment`;
CREATE TABLE `billpayment` (
  `BillNo` varchar(255) NOT NULL default '',
  `StudentID` varchar(255) NOT NULL,
  `BillDate` date NOT NULL,
  `DueDate` date NOT NULL,
  `PaidDate` date NOT NULL,
  `PaymentType` varchar(255) NOT NULL,
  `Amount` double NOT NULL,
  `Scan` longblob NOT NULL,
  PRIMARY KEY  (`BillNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of billpayment
-- ----------------------------
INSERT INTO `billpayment` VALUES ('inv001', 'ST01', '2013-06-29', '2013-07-05', '2014-03-04', 'Cash', '2000', '');

-- ----------------------------
-- Table structure for `bus`
-- ----------------------------
DROP TABLE IF EXISTS `bus`;
CREATE TABLE `bus` (
  `StudentId` varchar(255) NOT NULL,
  `BusFee` double default NULL,
  `BusRoute` varchar(255) default NULL,
  `BusNumber` varchar(255) default NULL,
  `ServiceCost` double default NULL,
  `ServiceDate` date default NULL,
  `AccidentCost` double default NULL,
  `AccidentDate` date default NULL,
  PRIMARY KEY  (`StudentId`),
  CONSTRAINT `FK_bus_hostel_StudentID` FOREIGN KEY (`StudentId`) REFERENCES `hostel` (`StudentID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of bus
-- ----------------------------
INSERT INTO `bus` VALUES ('ST01', '2500', 'Mayur vihar', 'DL-9C-5666', '410000', '2014-02-12', '5000', '2013-12-25');
INSERT INTO `bus` VALUES ('ST02', '5300', 'Noida', 'DL-5B-8766', '5000', '2012-02-14', '2000', '2013-10-15');
INSERT INTO `bus` VALUES ('ST03', '8000', 'Noida', 'DL-5B-9869', '2300', '2011-02-25', '2000', '2013-10-25');
INSERT INTO `bus` VALUES ('ST04', '9000', 'Vikaspuri', 'DL-5B-9898', '2000', '2009-02-14', '200', '2011-10-15');

-- ----------------------------
-- Table structure for `donation`
-- ----------------------------
DROP TABLE IF EXISTS `donation`;
CREATE TABLE `donation` (
  `Amount` double default NULL,
  `Cheque_DD_Number` varchar(255) default NULL,
  `DonorName` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of donation
-- ----------------------------
INSERT INTO `donation` VALUES ('50000', '123456', 'Rahul');
INSERT INTO `donation` VALUES ('15000', '689456', 'Ankur');
INSERT INTO `donation` VALUES ('200000', '986852', 'Ajay Sharma');
INSERT INTO `donation` VALUES ('25000', '457874', 'Rajesh');
INSERT INTO `donation` VALUES ('90000', '8768687', 'Rohit');
INSERT INTO `donation` VALUES ('60000', '987457', 'Ritu');

-- ----------------------------
-- Table structure for `examination`
-- ----------------------------
DROP TABLE IF EXISTS `examination`;
CREATE TABLE `examination` (
  `StudentID` varchar(255) NOT NULL,
  `AttendenceFee` double default NULL,
  `AbsentFee` double default NULL,
  `NoOfSubject` int(11) default NULL,
  `Amount` double default NULL,
  `ResitFee` double default NULL,
  `RedoFee` double default NULL,
  `AttendencePercentage` double(10,0) default NULL,
  `InternalExamScores` double(10,0) default NULL,
  `ExternalExamScores` double(10,0) default NULL,
  `ExaminationFee` double default NULL,
  PRIMARY KEY  (`StudentID`),
  CONSTRAINT `FK_examination_student_StudentID` FOREIGN KEY (`StudentID`) REFERENCES `student` (`StudentID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of examination
-- ----------------------------
INSERT INTO `examination` VALUES ('ST01', '300', '120', '12', '234', '100', '100', '65', '25', '48', '2000');

-- ----------------------------
-- Table structure for `hostel`
-- ----------------------------
DROP TABLE IF EXISTS `hostel`;
CREATE TABLE `hostel` (
  `StudentID` varchar(255) NOT NULL,
  `RoomType` varchar(255) default NULL,
  `Fee` double default NULL,
  `Laundry` double default NULL,
  `Electricity` double default NULL,
  `Newspaper_Magazine` varchar(255) default NULL,
  `HouseKeeping` double default NULL,
  `Fine` double(255,0) default NULL,
  PRIMARY KEY  (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of hostel
-- ----------------------------
INSERT INTO `hostel` VALUES ('ST01', 'AC', '300', '7500', '600', 'Newspaper', '200', '1500');
INSERT INTO `hostel` VALUES ('ST02', 'AC', '30000', '200', '300', 'Megazine', '300', '200');
INSERT INTO `hostel` VALUES ('ST03', 'Normal', '25000', '800', '300', 'Megazine', '300', '200');
INSERT INTO `hostel` VALUES ('ST04', 'AC', '200', '300', '300', 'Newspaper', '200', '100');

-- ----------------------------
-- Table structure for `library`
-- ----------------------------
DROP TABLE IF EXISTS `library`;
CREATE TABLE `library` (
  `StudentID` varchar(255) NOT NULL,
  `RegistrationFee` int(11) default NULL,
  `Fine` int(11) default NULL,
  `LibrarianID` varchar(255) default NULL,
  `Vendor` varchar(255) default NULL,
  `BookMagazineOrdered` int(11) default NULL,
  `CostPerPrice` double default NULL,
  `BookMagazineCost` double default NULL,
  `Quantity` int(11) default NULL,
  `DateOfIssue` date default NULL,
  `DateOfReturn` date default NULL,
  PRIMARY KEY  (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of library
-- ----------------------------
INSERT INTO `library` VALUES ('ST01', '500', '25', 'LB01', 'Amit kumar', '2', '600', '1200', '2', '2012-06-09', '2012-07-07');
INSERT INTO `library` VALUES ('ST02', '500', '30', 'LB02', 'Rahul kumar', '3', '300', '900', '3', '2012-03-18', '2014-04-15');
INSERT INTO `library` VALUES ('ST03', '600', '40', 'LB03', 'Jack', '4', '800', '3200', '4', '2013-06-12', '2013-07-12');
INSERT INTO `library` VALUES ('ST04', '700', '90', 'LB04', 'Dinesh', '5', '400', '2000', '5', '2008-06-18', '2008-08-03');
INSERT INTO `library` VALUES ('ST05', '300', '87', 'LB05', 'Mohit', '6', '300', '1800', '6', '2009-02-18', '2009-04-18');
INSERT INTO `library` VALUES ('ST06', '900', '55', 'LB06', 'sandy', '7', '700', '4900', '7', '2013-05-19', '2011-06-23');

-- ----------------------------
-- Table structure for `loginaccounts`
-- ----------------------------
DROP TABLE IF EXISTS `loginaccounts`;
CREATE TABLE `loginaccounts` (
  `user_name` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `account_flag` int(11) NOT NULL default '0',
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loginaccounts
-- ----------------------------
INSERT INTO `loginaccounts` VALUES ('acct', '1234', '0');
INSERT INTO `loginaccounts` VALUES ('admin', 'admin', '0');

-- ----------------------------
-- Table structure for `maintenance`
-- ----------------------------
DROP TABLE IF EXISTS `maintenance`;
CREATE TABLE `maintenance` (
  `Building` varchar(255) default NULL,
  `PC_Cost` double default NULL,
  `ExtraCost` double default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of maintenance
-- ----------------------------
INSERT INTO `maintenance` VALUES ('Enggineering', '50000', '500');
INSERT INTO `maintenance` VALUES ('Science', '657657', '500');
INSERT INTO `maintenance` VALUES ('Admin', '234234', '200');
INSERT INTO `maintenance` VALUES ('RND', '345345', '500');
INSERT INTO `maintenance` VALUES ('RVH', '3453453', '500');

-- ----------------------------
-- Table structure for `mess`
-- ----------------------------
DROP TABLE IF EXISTS `mess`;
CREATE TABLE `mess` (
  `StudentID` varchar(255) NOT NULL,
  `MessFeeDue` double default NULL,
  `StaffedMessFeeDue` double default NULL,
  `MessRent` double default NULL,
  `UtensilsCost` double default NULL,
  `MonthlyCost` double default NULL,
  `MessElectricityPayable` double default NULL,
  `MessWaterPayable` double default NULL,
  `CafeRent` double default NULL,
  `CafeElectricityPayable` double default NULL,
  `CafeWaterPayable` double default NULL,
  PRIMARY KEY  (`StudentID`),
  CONSTRAINT `FK_mess_hostel_StudentID` FOREIGN KEY (`StudentID`) REFERENCES `hostel` (`StudentID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of mess
-- ----------------------------
INSERT INTO `mess` VALUES ('ST01', '200', '300', '430', '50', '90', '100', '50', '20', '400', '300');
INSERT INTO `mess` VALUES ('ST02', '23242', '2323', '3434', '23423', '454', '24323', '90', '234', '66', '23223');

-- ----------------------------
-- Table structure for `payroll`
-- ----------------------------
DROP TABLE IF EXISTS `payroll`;
CREATE TABLE `payroll` (
  `StaffID` varchar(255) NOT NULL,
  `Designation` varchar(255) default NULL,
  `BasicPay` double default NULL,
  `HRA` double default NULL,
  `DA` double default NULL,
  `TA` double NOT NULL,
  `MedicalAllowance` double NOT NULL,
  `ChildEducationAllowance` double NOT NULL,
  `WorkingDays` int(11) default NULL,
  `AbsentDays` int(11) default NULL,
  `PaidLeaves` int(11) default NULL,
  `NetSalary` double default NULL,
  PRIMARY KEY  (`StaffID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of payroll
-- ----------------------------
INSERT INTO `payroll` VALUES ('ST01', 'MGR', '16000', '8000', '3000', '0', '0', '0', '26', '5', '2', '18183');
INSERT INTO `payroll` VALUES ('ST012', 'DEP GM', '2342342', '234', '234234', '0', '0', '0', '24', '2', '3', '1911108');
INSERT INTO `payroll` VALUES ('ST02', 'MGR', '6000', '3000', '1000', '1201', '200', '0', '26', '2', '2', '8489');
INSERT INTO `payroll` VALUES ('ST03', 'Executive', '8000', '4000', '2000', '0', '0', '0', '26', '2', '2', '11438');
INSERT INTO `payroll` VALUES ('ST04', 'Test', '15000', '8000', '2000', '100', '100', '100', '26', '2', '2', '18342');
INSERT INTO `payroll` VALUES ('ST05', 'DM', '700', '234', '2000', '100', '200', '1000', '22', '4', '2', '3481');
INSERT INTO `payroll` VALUES ('ST06', 'HR', '16000', '8000', '2000', '0', '0', '0', '27', '2', '2', '21541');
INSERT INTO `payroll` VALUES ('ST07', 'Acct', '1400', '700', '2000', '1000', '100', '100', '25', '2', '2', '4316');
INSERT INTO `payroll` VALUES ('ST08', 'HU', '54000', '12000', '2000', '0', '0', '0', '25', '2', '3', '53361');
INSERT INTO `payroll` VALUES ('ST09', 'IT Associate', '14000', '7000', '1000', '0', '0', '0', '23', '2', '2', '16548');
INSERT INTO `payroll` VALUES ('ST10', 'Peon ', '5000', '3000', '1000', '0', '0', '0', '24', '2', '2', '7083');
INSERT INTO `payroll` VALUES ('ST11', 'Jr. Acct', '16000', '8000', '2000', '0', '0', '0', '23', '2', '2', '19683');
INSERT INTO `payroll` VALUES ('ST12', 'Tester', '5000', '3000', '2000', '0', '0', '0', '21', '2', '4', '7838');

-- ----------------------------
-- Table structure for `store`
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store` (
  `InvoiceNumber` varchar(255) NOT NULL,
  `ProductName` varchar(255) NOT NULL,
  `SerialNumber` varchar(255) NOT NULL,
  `Amount` int(11) NOT NULL,
  `Due` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `OrderedBy_StaffId` varchar(255) NOT NULL,
  `Date_Of_Order` date NOT NULL,
  `Date_Of_Delivery` date NOT NULL,
  `OrderFile` text,
  PRIMARY KEY  (`InvoiceNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of store
-- ----------------------------
INSERT INTO `store` VALUES ('INV001', 'NON PC', 'PC078', '200', '3234', '3', 'EMP03', '2013-10-31', '2013-11-28', '');
INSERT INTO `store` VALUES ('INV002', 'Laptop', 'LP001', '300', '500', '5', 'EMP01', '2012-10-30', '2012-11-11', 'sdaf');
INSERT INTO `store` VALUES ('INV003', 'Owen', 'OW001', '500', '600', '5', 'EMP03', '2014-01-15', '2014-01-29', 'C:UsersDilip PcDesktopSEM 8DP_Tutorial_Solution.docx');
INSERT INTO `store` VALUES ('INV004', 'Washing Machine', 'WM001', '150', '800', '5', 'EMP04', '2013-01-15', '2013-01-29', 'D:jarPurchaseFormSample.doc');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `StudentID` varchar(255) NOT NULL,
  `StudentName` varchar(255) NOT NULL,
  `Semester` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Mobile` varchar(255) NOT NULL,
  `TotalDues` double NOT NULL,
  PRIMARY KEY  (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('ST01', 'Dilip', 'Eigth', 'dilip_dmk@yahoo.com', '9992957232', '200');
INSERT INTO `student` VALUES ('ST02', 'Pawar', 'Eight', 'rpawar994@gmail.com', '9034608854', '230');
INSERT INTO `student` VALUES ('ST03', 'dinesh', 'Fourth', 'dinesh@gmail.com', '0', '240');
INSERT INTO `student` VALUES ('ST04', 'Steve', 'Third', 'steve@gmail.com', '0', '0');
INSERT INTO `student` VALUES ('ST05', ' Neha', 'Third', 'neha@gmail.com', '0', '0');
INSERT INTO `student` VALUES ('ST06', 'Mohan', 'Third', 'mohan@gmail.com', '0', '0');
INSERT INTO `student` VALUES ('ST07', 'Sonia', 'Second', 'soniaKapoor@gmail.com', '0', '0');
INSERT INTO `student` VALUES ('ST08', 'Deepti', 'Fifth', 'deepti@gmail.com', '0', '0');
INSERT INTO `student` VALUES ('ST09', 'Komal', 'Seventh', 'komal@gmail.com', '0', '0');
