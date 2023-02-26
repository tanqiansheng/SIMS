/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : stus

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-12-30 23:01:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `academy` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '大数据与信息产业' COMMENT ' 学院名称',
  `academycode` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '110' COMMENT '学院代码',
  `schoolcode` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '1001' COMMENT '学校代码',
  `compuscode` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '1001' COMMENT '校区代码',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '大数据与信息产业', 'M001', 'AS1001', 'F1001');
INSERT INTO `department` VALUES ('2', '大数据与信息产业', 'M001', 'A001', 'F1001');
INSERT INTO `department` VALUES ('3', '大数据与信息产业', 'M001', 'A1001', 'F1001');
INSERT INTO `department` VALUES ('4', '大数据与信息产业', 'M003', 'B1001', 'F1001');
INSERT INTO `department` VALUES ('12', '人文学院', 'M112', '1004', 'D403');
INSERT INTO `department` VALUES ('7', '数学学院', 'M110', '1001', 'F1001');
INSERT INTO `department` VALUES ('8', '外国语学院', 'M110', '1001', 'F1001');
INSERT INTO `department` VALUES ('11', '数学学院', 'M110', '1001', 'F1001');
INSERT INTO `department` VALUES ('9', '外国语学院', 'M110', '1001', 'F1001');
INSERT INTO `department` VALUES ('10', '外国语学院', 'M110', '1001', 'F1001');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `school` varchar(40) COLLATE utf8_bin NOT NULL DEFAULT '城管大学' COMMENT '学校',
  `academy` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '计算机学院' COMMENT '院系',
  `uname` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '姓名',
  `sex` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '男' COMMENT '性别',
  `sid` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '学号',
  `personId` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '身份证',
  `ClassId` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT 'A18' COMMENT '年级',
  `ClassCode` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT 'C10' COMMENT '班级代码',
  `major` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '软件' COMMENT '专业',
  `lang` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '报考语种',
  PRIMARY KEY (`id`),
  UNIQUE KEY `sid` (`sid`),
  UNIQUE KEY `personId` (`personId`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', '城管大学', '计算机学院', '小明', '男', '1', '10', '21', 'A18', 'C10', '软件');
INSERT INTO `userinfo` VALUES ('2', '城管大学', '计算机学院', '小红', '男', '2', '222222', '25522', 'A18', 'C10', '哈语');
INSERT INTO `userinfo` VALUES ('5', '城管大学', '计算机学院', '小芳', '男', '15', '15', 'A18', 'C10', '软件', '汉语');
INSERT INTO `userinfo` VALUES ('6', '城管大学', '计算机学院', '谭茜升', '男', '16', '1577', 'A18', 'C10', '软件', '英语');
INSERT INTO `userinfo` VALUES ('8', '重庆城市管理职业学院', '人文学院', '谭', '男', '3', '123', 'A18', 'C10', '软件', '英语');
INSERT INTO `userinfo` VALUES ('9', '城管大学', '计算机学院', '谭茜', '男', '4', '134', 'A18', 'C12', '软件', '英语');
INSERT INTO `userinfo` VALUES ('10', '城管大学', '学前教育学院', '芳芳', '男', '5', '1234', 'A18', 'C102', '汉语', '汉语');
INSERT INTO `userinfo` VALUES ('11', '城管大学', '计算机学院', '茜升', '男', '6', '14', 'A18', '2', '软件', '英语');
INSERT INTO `userinfo` VALUES ('12', '城管大学', '计算机学院', '小明2', '女', '7', '323', 'A18', 'C10', '软件', '汉语');
INSERT INTO `userinfo` VALUES ('13', '重庆科技大学', '计算机学院', '扥哈', '女', '33', '3322', 'A18', 'C10', '软件', '汉语');
INSERT INTO `userinfo` VALUES ('14', '城管大学', '学前教育学院', '小鹏', '女', '22', '22', 'A18', 'C10', '软件', '汉语');
INSERT INTO `userinfo` VALUES ('15', '城管大学', '计算机学院', '较强', '女', '333', '313', 'A18', 'C1022', '软件', '德育');
INSERT INTO `userinfo` VALUES ('16', '城管大学', '计算机学院', '方强', '男', '3231', '33235', 'A18', 'C10', '软件', '汉语');
INSERT INTO `userinfo` VALUES ('17', '城管大学', '计算机学院', '小手术', '男', '32377', '665', 'A18', 'C1022', '软件', '汉语');
INSERT INTO `userinfo` VALUES ('18', '城管大学', '计算机学院', '小卡', '男', '233', '44', 'A17', 'C102', '软件', '英语');
INSERT INTO `userinfo` VALUES ('19', '城管大学', '房地产学院', '小下', '男', '313989', '313899', 'A18', '22', '软件', '汉语');
INSERT INTO `userinfo` VALUES ('20', '城管大学', '计算机学院', '谭升', '男', '231', '3331', 'A18', 'C10', '软件', '英语');
INSERT INTO `userinfo` VALUES ('22', '重庆大学', '电子学院', '朱元杰', '女', '2223', '55', '18级', '101', '软件技术', '德语');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uname` varchar(20) NOT NULL DEFAULT '老王' COMMENT '姓名',
  `account` varchar(20) NOT NULL COMMENT '账号',
  `passwd` varchar(20) NOT NULL DEFAULT '123' COMMENT '密码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `account` (`account`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '红红', 'a01', 'abcde');
INSERT INTO `users` VALUES ('2', '红红q', 'a0h1', 'abcdhe');
INSERT INTO `users` VALUES ('3', '1', '2', '123456');
INSERT INTO `users` VALUES ('4', '谭茜升', '0411180310', '123');
INSERT INTO `users` VALUES ('5', '123', '123', '123');
INSERT INTO `users` VALUES ('6', '123', '1234', '');
INSERT INTO `users` VALUES ('7', '12', '21', '11');
INSERT INTO `users` VALUES ('8', '12', '12', '12');
INSERT INTO `users` VALUES ('9', '12345', '12345', '12345');
INSERT INTO `users` VALUES ('10', '88', '88', '88');
INSERT INTO `users` VALUES ('11', '问问2222', '121', '23');
INSERT INTO `users` VALUES ('12', '1233123', '331212', '132132');
INSERT INTO `users` VALUES ('13', '133321', '23312', '31132');
INSERT INTO `users` VALUES ('14', '22', '33', '131');
INSERT INTO `users` VALUES ('15', '老王', '0411180311', '123456');
INSERT INTO `users` VALUES ('16', '擦徐坤', '04111831352222', '123456');
INSERT INTO `users` VALUES ('17', '擦徐坤', '0411183135', '123456');
INSERT INTO `users` VALUES ('18', '擦徐坤', '041118313566', '123456');
