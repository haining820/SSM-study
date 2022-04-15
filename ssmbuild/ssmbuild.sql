/*
 Navicat Premium Data Transfer

 Source Server         : MySQL5.7
 Source Server Type    : MySQL
 Source Server Version : 50733
 Source Host           : localhost:3307
 Source Schema         : ssmbuild

 Target Server Type    : MySQL
 Target Server Version : 50733
 File Encoding         : 65001

 Date: 30/05/2021 21:59:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `bookId` int(10) NOT NULL AUTO_INCREMENT COMMENT '书id',
  `bookName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '书名',
  `bookCount` int(11) NOT NULL COMMENT '数量',
  `detail` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '描述',
  INDEX `bookId`(`bookId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, 'Java', 172, '从入门到放弃');
INSERT INTO `book` VALUES (2, 'MySQL', 10, '从删库到跑路');
INSERT INTO `book` VALUES (3, 'Linux', 5, '从进门到进牢');
INSERT INTO `book` VALUES (7, '哈利波特与魔法石', 6, '哈利波特系列第一部');
INSERT INTO `book` VALUES (8, '哈利波特与阿兹卡班的囚徒', 36, '哈利波特系列第三部');

SET FOREIGN_KEY_CHECKS = 1;
