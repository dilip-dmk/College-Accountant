/*
MySQL Backup
Source Server Version: 5.6.15
Source Database: collegeaccountant
Date: 3/15/2014 17:59:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `library`
-- ----------------------------
DROP TABLE IF EXISTS `library`;
CREATE TABLE `library` (
  `StudentID` varchar(255) NOT NULL,
  `RegistrationFee` float DEFAULT NULL,
  `Fine` float DEFAULT NULL,
  `LibrarianID` varchar(255) DEFAULT NULL,
  `Book_Magazine_Ordered` int(11) DEFAULT NULL,
  `Vendor` varchar(255) DEFAULT NULL,
  `CostPerPrice` float DEFAULT NULL,
  `Qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `loginaccounts`
-- ----------------------------
DROP TABLE IF EXISTS `loginaccounts`;
CREATE TABLE `loginaccounts` (
  `user_name` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `account_flag` int(11) NOT NULL DEFAULT '0',
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records 
-- ----------------------------
INSERT INTO `library` VALUES ('ST01','500','50','LB01','2','Prashant kumar','600','2'), ('ST02','500','50','LB02','3','Prashant kumar','300','3'), ('ST03','600','50','LB03','4','Prashant kumar','800','5'), ('ST04','700','30','LB04','5','Prashant kumar','400','8'), ('ST05','300','20','LB05','6','Prashant kumar','300','1'), ('ST06','900','80','LB06','7','Prashant kumar','700','9');
INSERT INTO `loginaccounts` VALUES ('admin','admin','0');
