/*
Navicat MySQL Data Transfer

Source Server         : 115.159.216.56
Source Server Version : 50626
Source Host           : 115.159.216.56:3306
Source Database       : tale

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2017-12-28 19:45:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `userid` varchar(254) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'root', 'root');
INSERT INTO `admin` VALUES ('2', 'admin', 'admin');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sno` varchar(254) NOT NULL,
  `sname` varchar(255) NOT NULL,
  `ssex` char(1) DEFAULT NULL,
  `sdate` date DEFAULT NULL,
  `smajor` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`sno`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('c84517b8714111a9b1243600ba8973e0', '孙悟空', '男', '2017-12-01', '信息安全');
INSERT INTO `student` VALUES ('2', '周芷若', '女', '2017-06-14', '软件工程');
INSERT INTO `student` VALUES ('3', '令狐冲', '男', '2014-06-09', '软件工程');
INSERT INTO `student` VALUES ('4', '郭靖', '男', '2010-04-29', '计算机科学');
INSERT INTO `student` VALUES ('554ce3d57b1af0da33e45ed4179c3a8d', '赵敏', '女', '2017-12-16', '电子商务');
INSERT INTO `student` VALUES ('60d1c16c23a976e846f4b20afb54d79c', '姚明', '男', '2017-12-08', '计算机科学');
INSERT INTO `student` VALUES ('c4725df70ea9d5c840042680d2151582', '猪八戒', '男', '2016-12-06', '工程管理');
