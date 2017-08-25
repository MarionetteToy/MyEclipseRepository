/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50715
Source Host           : 127.0.0.1:3306
Source Database       : blogdb

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-08-25 15:24:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) NOT NULL,
  `title` varchar(50) DEFAULT NULL,
  `content` text,
  `username` varchar(50) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `hasread` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', '第一篇', '<p>&nbsp;我是yexiaodong<img src=\"http://localhost:8080/BlogTest/user/fckeditor/editor/images/smiley/qq/001.gif\" alt=\"\" /></p>', 'yexiaodong', '2017-08-22 11:01:37', '3');
INSERT INTO `article` VALUES ('2', '第二篇', '<p>&nbsp;你知道什么<img src=\"http://localhost:8080/BlogTest/user/fckeditor/editor/images/smiley/qq/007.gif\" alt=\"\" /></p>', 'yexiaodong', '2017-08-22 12:41:48', '2');
INSERT INTO `article` VALUES ('3', '第三篇', '<p>&nbsp;适当放松的开发松岛枫i鸡丝豆腐<img src=\"http://localhost:8080/BlogTest/user/fckeditor/editor/images/smiley/qq/009.jpg\" alt=\"\" /></p>', 'yexiaodong', '2017-08-22 12:46:01', '1');
INSERT INTO `article` VALUES ('4', '第四篇', '<p>&nbsp;层vxcvxcvxcv 电风扇电风扇</p>', 'yexiaodong', '2017-08-22 12:48:37', '0');
INSERT INTO `article` VALUES ('5', '第五篇', '<p>&nbsp;就斤斤计较斤斤计较快快快快快快</p>', 'yexiaodong', '2017-08-22 16:40:17', '1');
INSERT INTO `article` VALUES ('6', '第六篇', '<p>&nbsp;你知不知到<img src=\"http://localhost:8080/BlogTest/user/fckeditor/editor/images/smiley/qq/015.gif\" alt=\"\" /></p>', 'yexiaodong', '2017-08-22 16:40:51', '2');
INSERT INTO `article` VALUES ('7', '第一篇', '<p>&nbsp;我是yexiaodong<img src=\"http://localhost:8080/BlogTest/user/fckeditor/editor/images/smiley/qq/001.gif\" alt=\"\" /></p>', 'yexiaodong', '2017-08-22 11:01:37', '1');
INSERT INTO `article` VALUES ('8', '第五篇', '<p>&nbsp;就斤斤计较斤斤计较快快快快快快</p>', 'yexiaodong', '2017-08-22 16:40:17', '1');
INSERT INTO `article` VALUES ('9', '第三篇', '<p>&nbsp;适当放松的开发松岛枫i鸡丝豆腐<img src=\"http://localhost:8080/BlogTest/user/fckeditor/editor/images/smiley/qq/009.jpg\" alt=\"\" /></p>', 'yexiaodong', '2017-08-22 12:46:01', '1');

-- ----------------------------
-- Table structure for bloginfo
-- ----------------------------
DROP TABLE IF EXISTS `bloginfo`;
CREATE TABLE `bloginfo` (
  `username` varchar(20) NOT NULL,
  `blogtitle` varchar(50) DEFAULT NULL,
  `idiograph` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of bloginfo
-- ----------------------------
INSERT INTO `bloginfo` VALUES ('yexiaodong', '我就是神', '孤独~');

-- ----------------------------
-- Table structure for critique
-- ----------------------------
DROP TABLE IF EXISTS `critique`;
CREATE TABLE `critique` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `AId` int(11) DEFAULT NULL,
  `content` text,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of critique
-- ----------------------------
INSERT INTO `critique` VALUES ('1', '6', '<p>&nbsp;不知道</p>', '匿名');
INSERT INTO `critique` VALUES ('2', '1', '<p>你真帅</p>', 'yexiaodong');
INSERT INTO `critique` VALUES ('3', '1', '<p>&nbsp;方法</p>', 'yexiaodong');
INSERT INTO `critique` VALUES ('4', '6', '<p>&nbsp;看看行不行</p>', '匿名');
INSERT INTO `critique` VALUES ('5', '5', '<p>&nbsp;你好吗</p>', '匿名');
INSERT INTO `critique` VALUES ('6', '6', '<p>&nbsp;韩国法国恢复<img src=\"http://localhost:8080/BlogTest/user/fckeditor/editor/images/smiley/qq/003.gif\" alt=\"\" /></p>', '匿名');
INSERT INTO `critique` VALUES ('7', '1', '<p>&nbsp;斯蒂芬森</p>', 'yexiaodong');
INSERT INTO `critique` VALUES ('8', '1', '<p>&nbsp;说的分手快乐的方式</p>', 'yexiaodong');
INSERT INTO `critique` VALUES ('9', '1', '<p>&nbsp;说的分手的</p>', 'yexiaodong');
INSERT INTO `critique` VALUES ('10', '1', '<p>&nbsp;说的分手的</p>', 'yexiaodong');
INSERT INTO `critique` VALUES ('11', '6', '<p>&nbsp;撒旦撒</p>', 'yexiaodong');

-- ----------------------------
-- Table structure for dianjiliang
-- ----------------------------
DROP TABLE IF EXISTS `dianjiliang`;
CREATE TABLE `dianjiliang` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `AId` int(11) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of dianjiliang
-- ----------------------------
INSERT INTO `dianjiliang` VALUES ('1', '6', '127.0.0.1', '2017-08-22 00:00:00');
INSERT INTO `dianjiliang` VALUES ('2', '1', '127.0.0.1', '2017-08-22 00:00:00');
INSERT INTO `dianjiliang` VALUES ('3', '2', '127.0.0.1', '2017-08-22 00:00:00');
INSERT INTO `dianjiliang` VALUES ('4', '5', '127.0.0.1', '2017-08-22 00:00:00');
INSERT INTO `dianjiliang` VALUES ('5', '1', '127.0.0.1', '2017-08-23 00:00:00');
INSERT INTO `dianjiliang` VALUES ('6', '6', '127.0.0.1', '2017-08-23 00:00:00');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `nickname` varchar(20) DEFAULT NULL,
  `question` varchar(50) DEFAULT NULL,
  `answer` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1072988987@qq.com', 'Ye1Xiao2Dong3', '提线木偶', '你的生日', '12月27日');
INSERT INTO `user` VALUES ('haizeiwang', '1008611', '移动服务', '你最喜欢的食物', '火锅');
INSERT INTO `user` VALUES ('superman', '12345678', '超人之子', '你的生日', '5.12');
INSERT INTO `user` VALUES ('yexiaodong', '123456', '程序员', '你的家乡', '湖北洪湖');
