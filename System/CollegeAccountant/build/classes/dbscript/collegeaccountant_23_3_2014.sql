/*
Navicat MySQL Data Transfer

Source Server         : College Accountant
Source Server Version : 50051
Source Host           : localhost:3306
Source Database       : collegeaccountant

Target Server Type    : MYSQL
Target Server Version : 50051
File Encoding         : 65001

Date: 2014-03-23 23:11:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bus
-- ----------------------------
DROP TABLE IF EXISTS `bus`;
CREATE TABLE `bus` (
  `StudentId` varchar(255) NOT NULL,
  `BusFee` float default NULL,
  `BusRoute` varchar(255) default NULL,
  `BusNumber` varchar(255) default NULL,
  `ServiceCost` float default NULL,
  `ServiceDate` date default NULL,
  `AccidentCost` float default NULL,
  `AccidentDate` date default NULL,
  PRIMARY KEY  (`StudentId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of bus
-- ----------------------------
INSERT INTO `bus` VALUES ('ST01', '2500', 'Mayur vihar', 'DL-9C-5666', '10000', '2014-02-12', '40000', '2013-12-25');
INSERT INTO `bus` VALUES ('ST02', '5300', 'Noida', 'DL-5B-8766', '5000', '2012-02-14', '30000', '2013-10-15');
INSERT INTO `bus` VALUES ('ST03', '5300', 'Laxmi Nagar', 'DL-5B-986', '9800', '2011-02-14', '80000', '2013-10-15');
INSERT INTO `bus` VALUES ('ST04', '9000', 'Vikaspuri', 'DL-5B-9898', '25000', '2009-02-14', '54000', '2011-10-15');

-- ----------------------------
-- Table structure for donation
-- ----------------------------
DROP TABLE IF EXISTS `donation`;
CREATE TABLE `donation` (
  `Amount` float default NULL,
  `Cheque_DD_Number` varchar(255) default NULL,
  `DonorName` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of donation
-- ----------------------------

-- ----------------------------
-- Table structure for examination
-- ----------------------------
DROP TABLE IF EXISTS `examination`;
CREATE TABLE `examination` (
  `StudentID` varchar(255) NOT NULL,
  `AttendenceFee` float default NULL,
  `AbsentFee` float default NULL,
  `NoOfSubject` int(11) default NULL,
  `Amount` float default NULL,
  `ResitFee` float default NULL,
  `RedoFee` float default NULL,
  `AttendencePercentage` decimal(10,0) default NULL,
  `InternalExamScores` decimal(10,0) default NULL,
  `ExternalExamScores` decimal(10,0) default NULL,
  `ExaminationFee` float default NULL,
  PRIMARY KEY  (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of examination
-- ----------------------------

-- ----------------------------
-- Table structure for hostel
-- ----------------------------
DROP TABLE IF EXISTS `hostel`;
CREATE TABLE `hostel` (
  `StudentID` varchar(255) NOT NULL,
  `RoomType` varchar(255) default NULL,
  `Fee` float default NULL,
  `Laundry` float default NULL,
  `Electricity` float default NULL,
  `Newspaper_Magazine` varchar(255) default NULL,
  `HouseKeeping` float default NULL,
  `Fine` float(255,0) default NULL,
  PRIMARY KEY  (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of hostel
-- ----------------------------
INSERT INTO `hostel` VALUES ('ST01', 'Normal', '25000', '1000', '500', 'Newspaper', '500', '600');
INSERT INTO `hostel` VALUES ('ST02', 'AC', '30000', '200', '300', 'Megazine', '300', '200');
INSERT INTO `hostel` VALUES ('ST03', 'Normal', '25000', '800', '300', 'Megazine', '300', '200');
INSERT INTO `hostel` VALUES ('ST04', 'AC', '30000', '800', '300', 'Newspaper/Megazine', '500', '900');

-- ----------------------------
-- Table structure for library
-- ----------------------------
DROP TABLE IF EXISTS `library`;
CREATE TABLE `library` (
  `StudentID` varchar(255) NOT NULL,
  `RegistrationFee` float default NULL,
  `Fine` float default NULL,
  `LibrarianID` varchar(255) default NULL,
  `Book_Magazine_Ordered` int(11) default NULL,
  `Vendor` varchar(255) default NULL,
  `CostPerPrice` float default NULL,
  `Qty` int(11) default NULL,
  `Date_Of_Issue` date default NULL,
  `Date_Of_Return` date default NULL,
  PRIMARY KEY  (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of library
-- ----------------------------
INSERT INTO `library` VALUES ('ST01', '500', '20', 'LB01', '2', 'Amit kumar', '600', '2', '2012-06-18', '2012-07-18');
INSERT INTO `library` VALUES ('ST02', '500', '50', 'LB02', '3', 'Rahul kumar', '300', '3', '2014-03-18', '2014-03-28');
INSERT INTO `library` VALUES ('ST03', '600', '25', 'LB03', '4', 'Jack', '800', '5', '2013-06-18', '2013-07-18');
INSERT INTO `library` VALUES ('ST04', '700', '98', 'LB04', '5', 'Dinesh', '400', '8', '2008-06-18', '2008-08-18');
INSERT INTO `library` VALUES ('ST05', '300', '87', 'LB05', '6', 'Mohit', '300', '1', '2009-02-18', '2009-04-18');
INSERT INTO `library` VALUES ('ST06', '900', '80', 'LB06', '7', 'sandy', '700', '9', '2011-05-18', '2011-06-20');

-- ----------------------------
-- Table structure for loginaccounts
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
INSERT INTO `loginaccounts` VALUES ('admin', 'admin', '0');

-- ----------------------------
-- Table structure for maintenance
-- ----------------------------
DROP TABLE IF EXISTS `maintenance`;
CREATE TABLE `maintenance` (
  `Building` float default NULL,
  `PC_Cost` float default NULL,
  `ExtraCost` float default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of maintenance
-- ----------------------------

-- ----------------------------
-- Table structure for mess
-- ----------------------------
DROP TABLE IF EXISTS `mess`;
CREATE TABLE `mess` (
  `StudentID` varchar(255) NOT NULL,
  `MessFeeDue` float default NULL,
  `StaffedMessFeeDue` float default NULL,
  `MessRent` float default NULL,
  `UtensilsCost` float default NULL,
  `MonthlyCost` float default NULL,
  `MessElectricityPayable` float default NULL,
  `MessWaterPayable` float default NULL,
  `CafeRent` float default NULL,
  `CafeElectricityPayable` float default NULL,
  `CafeWaterPayable` float default NULL,
  PRIMARY KEY  (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of mess
-- ----------------------------

-- ----------------------------
-- Table structure for payroll
-- ----------------------------
DROP TABLE IF EXISTS `payroll`;
CREATE TABLE `payroll` (
  `Staff ID` varchar(255) NOT NULL,
  `Designation` varchar(255) default NULL,
  `Basic Pay` double default NULL,
  `Working Days` int(11) default NULL,
  `Paid Leaves` int(11) default NULL,
  `Present Days` int(11) default NULL,
  `Absent Days` int(11) default NULL,
  `Salary` double default NULL,
  PRIMARY KEY  (`Staff ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of payroll
-- ----------------------------

-- ----------------------------
-- Table structure for store
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store` (
  `ProductName` varchar(255) default NULL,
  `SerialNumber` varchar(255) default NULL,
  `InvoiceNumber` varchar(255) NOT NULL,
  `Amount` float default NULL,
  `Due` float default NULL,
  `Quantity` int(11) default NULL,
  `OrderedBy_StaffId` varchar(255) default NULL,
  `Date_Of_Order` date default NULL,
  `Date_Of_Delivery` date default NULL,
  PRIMARY KEY  (`InvoiceNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of store
-- ----------------------------
INSERT INTO `store` VALUES ('PC', 'PC001', 'INV001', '20000', '300', '1', 'EMP01', '2013-10-30', '2013-11-11');
INSERT INTO `store` VALUES ('Laptop', 'LP001', 'INV002', '30000', '500', '5', 'EMP01', '2012-10-30', '2012-11-11');
INSERT INTO `store` VALUES ('Owen', 'OW001', 'INV003', '5000', '600', '5', 'EMP03', '2014-01-15', '2014-01-29');
INSERT INTO `store` VALUES ('Washing Machine', 'WM001', 'INV004', '15000', '800', '5', 'EMP04', '2013-01-15', '2013-01-29');
