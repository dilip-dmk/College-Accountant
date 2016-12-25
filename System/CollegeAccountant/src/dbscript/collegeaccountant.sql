/*
Navicat MySQL Data Transfer

Source Server         : College Accountant
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : collegeaccountant

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2014-03-15 04:12:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for library
-- ----------------------------
DROP TABLE IF EXISTS `library`;
CREATE TABLE `library` (
`StudentID`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`RegistrationFee`  float NULL DEFAULT NULL ,
`Fine`  float NULL DEFAULT NULL ,
`LibrarianID`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`Book_Magazine_Ordered`  int(11) NULL DEFAULT NULL ,
`Vendor`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`CostPerPrice`  float NULL DEFAULT NULL ,
`Qty`  int(11) NULL DEFAULT NULL ,
PRIMARY KEY (`StudentID`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Records of library
-- ----------------------------
BEGIN;
INSERT INTO `library` VALUES ('ST01', '500', '50', 'LB01', '2', 'Prashant kumar', '600', '2'), ('ST02', '500', '50', 'LB02', '3', 'Prashant kumar', '300', '3'), ('ST03', '600', '50', 'LB03', '4', 'Prashant kumar', '800', '5'), ('ST04', '700', '30', 'LB04', '5', 'Prashant kumar', '400', '8'), ('ST05', '300', '20', 'LB05', '6', 'Prashant kumar', '300', '1'), ('ST06', '900', '80', 'LB06', '7', 'Prashant kumar', '700', '9');
COMMIT;

-- ----------------------------
-- Table structure for loginaccounts
-- ----------------------------
DROP TABLE IF EXISTS `loginaccounts`;
CREATE TABLE `loginaccounts` (
`user_name`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`user_password`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`account_flag`  int(11) NOT NULL DEFAULT 0 ,
UNIQUE INDEX `user_name` (`user_name`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Records of loginaccounts
-- ----------------------------
BEGIN;
INSERT INTO `loginaccounts` VALUES ('admin', 'admin', '0');
COMMIT;
