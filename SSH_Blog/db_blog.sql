/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : db_blog

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-04-24 12:39:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `content` text,
  `username` varchar(50) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `hasread` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=gb2312 COMMENT='文章表';

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', 'SSH整合方案（一）', '<p>这段时间准备写一下SSH的整合方法<img alt=\"\" src=\"http://localhost:8080/JavaPrj_4/user/fckeditor/editor/images/smiley/qq/017.jpg\" /></p>', 'xiaoxiao', '2009-12-27 10:58:50', '2');
INSERT INTO `article` VALUES ('2', 'SSH整合方案（二）', '<p>让我们一起感受SSH整合的魅力吧！！！！！</p>', 'xiaoxiao', '2009-12-27 10:59:41', '1');
INSERT INTO `article` VALUES ('3', '今天好冷啊！', '<p>外面下雪了，今年的冬天来得太早了。<img alt=\"\" src=\"http://localhost:8080/JavaPrj_4/user/fckeditor/editor/images/smiley/qq/005.gif\" /></p>', 'xiaoxiao', '2009-12-27 11:00:22', '2');
INSERT INTO `article` VALUES ('4', '继续更新我的SSH整合方案！', '', 'xiaoxiao', '2009-12-27 11:08:43', '3');
INSERT INTO `article` VALUES ('5', '测试日志！！', '<p>测试日志！！<img alt=\"\" src=\"http://localhost:8080/JavaPrj_4/user/fckeditor/editor/images/smiley/qq/004.gif\" /></p>', 'xiaoxiao', '2010-01-27 18:05:06', '2');
INSERT INTO `article` VALUES ('6', '你妹', '<p>&nbsp;vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv</p>', 'aaaaaa', '2017-02-28 21:18:58', '0');
INSERT INTO `article` VALUES ('7', 'nihao', 'bdddddddddddddddddddddddddddddddddaaaaaaaaaaaaaaaaaaatttttttttttttttttttttttttttttttttt', 'zzzzzz', '2017-03-06 09:05:00', '1');
INSERT INTO `article` VALUES ('8', '你好，北京', '坎坎坷坷扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩', 'zzzzzz', '2017-03-06 09:07:30', '1');
INSERT INTO `article` VALUES ('9', '你好，北京', '坎坎坷坷扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩扩', 'zzzzzz', '2017-03-06 09:09:06', '1');
INSERT INTO `article` VALUES ('10', '你好，纽约', '噢噢噢噢哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦', 'zzzzzz', '2017-03-06 09:10:52', '1');
INSERT INTO `article` VALUES ('11', '你好，上海', '惺惺惜惺惺想寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻', 'zzzzzz', '2017-03-06 09:13:40', '1');
INSERT INTO `article` VALUES ('14', 'hello world', '<p>短发女地方GV大V领颠肺流离凌兆新村V领控制相聚离开自己&lt;a&gt;&lt;/a&gt;sdlihso速递局哥斯达黎加</p>\r\n', 'zzzzzz', '2017-03-06 12:42:07', '1');
INSERT INTO `article` VALUES ('15', '你好，月亮', '<p>嫦娥奔月</p>\r\n', 'zzzzzz', '2017-03-07 10:48:22', '1');

-- ----------------------------
-- Table structure for bloginfo
-- ----------------------------
DROP TABLE IF EXISTS `bloginfo`;
CREATE TABLE `bloginfo` (
  `username` varchar(20) NOT NULL DEFAULT '',
  `blogtitle` varchar(50) DEFAULT NULL,
  `idiograph` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='个性设置表';

-- ----------------------------
-- Records of bloginfo
-- ----------------------------
INSERT INTO `bloginfo` VALUES ('xiaoxiao', 'dddww', 'qqwww');
INSERT INTO `bloginfo` VALUES ('zzzzzz', '一个程序员的孤独', '随风而逝，春暖花开');

-- ----------------------------
-- Table structure for critique
-- ----------------------------
DROP TABLE IF EXISTS `critique`;
CREATE TABLE `critique` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `AId` int(11) DEFAULT NULL,
  `content` text,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `AId` (`AId`),
  CONSTRAINT `critique_ibfk_1` FOREIGN KEY (`AId`) REFERENCES `article` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=gb2312 COMMENT='评论表';

-- ----------------------------
-- Records of critique
-- ----------------------------
INSERT INTO `critique` VALUES ('1', '3', '<p>是啊，太冷了，我还好！！！</p>', 'xiaoxiao');
INSERT INTO `critique` VALUES ('2', '3', '<p>我们公司的暖气坏了，好冷啊！！</p>', 'xiaoxiao');
INSERT INTO `critique` VALUES ('3', '2', '<p>测试一下！</p>', 'xiaoxiao');
INSERT INTO `critique` VALUES ('4', '5', '<p>评论！！</p>', 'xiaoxiao');
INSERT INTO `critique` VALUES ('5', '1', '<p>测试一下！！</p>', 'xiaoxiao');
INSERT INTO `critique` VALUES ('6', '5', '<p><a href=\"http://localhost:8080/JavaPrj_4/\">http://localhost:8080/JavaPrj_4/</a></p>', '匿名');
INSERT INTO `critique` VALUES ('7', '5', '<p>你妹</p>', 'xiaoxiao');
INSERT INTO `critique` VALUES ('8', '5', '<p>你妹</p>', 'xiaoxiao');
INSERT INTO `critique` VALUES ('9', '5', '<p>你妹</p>', 'xiaoxiao');
INSERT INTO `critique` VALUES ('10', '5', '<p>你妹</p>', 'xiaoxiao');
INSERT INTO `critique` VALUES ('11', '5', '<p>你妹</p>', 'xiaoxiao');

-- ----------------------------
-- Table structure for dianjiliang
-- ----------------------------
DROP TABLE IF EXISTS `dianjiliang`;
CREATE TABLE `dianjiliang` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `AId` int(11) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `time` date DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `AId` (`AId`),
  CONSTRAINT `dianjiliang_ibfk_1` FOREIGN KEY (`AId`) REFERENCES `article` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=gb2312 COMMENT='点击量表';

-- ----------------------------
-- Records of dianjiliang
-- ----------------------------
INSERT INTO `dianjiliang` VALUES ('1', '1', '0:0:0:0:0:0:0:1', '2009-12-27');
INSERT INTO `dianjiliang` VALUES ('2', '3', '0:0:0:0:0:0:0:1', '2009-12-27');
INSERT INTO `dianjiliang` VALUES ('3', '1', '0:0:0:0:0:0:0:1', '2010-01-27');
INSERT INTO `dianjiliang` VALUES ('4', '2', '0:0:0:0:0:0:0:1', '2010-01-27');
INSERT INTO `dianjiliang` VALUES ('5', '5', '0:0:0:0:0:0:0:1', '2010-01-27');
INSERT INTO `dianjiliang` VALUES ('6', '4', '0:0:0:0:0:0:0:1', '2010-01-27');
INSERT INTO `dianjiliang` VALUES ('7', '4', '0:0:0:0:0:0:0:1', '2016-01-12');
INSERT INTO `dianjiliang` VALUES ('8', '3', '0:0:0:0:0:0:0:1', '2016-01-12');
INSERT INTO `dianjiliang` VALUES ('9', '5', '127.0.0.1', '2017-02-28');
INSERT INTO `dianjiliang` VALUES ('10', '4', '127.0.0.1', '2017-02-28');

-- ----------------------------
-- Table structure for img
-- ----------------------------
DROP TABLE IF EXISTS `img`;
CREATE TABLE `img` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `picUrl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of img
-- ----------------------------
INSERT INTO `img` VALUES ('10', 'zzzzzz', '\\SSH_Blog\\userImg\\2.jpg');
INSERT INTO `img` VALUES ('11', 'zzzzzz', '\\SSH_Blog\\userImg\\1.jpg');
INSERT INTO `img` VALUES ('12', 'zzzzzz', '\\SSH_Blog\\userImg\\7.jpg');
INSERT INTO `img` VALUES ('13', 'zzzzzz', '\\SSH_Blog\\userImg\\6.jpg');
INSERT INTO `img` VALUES ('14', 'zzzzzz', '\\SSH_Blog\\userImg\\5.jpg');
INSERT INTO `img` VALUES ('15', 'zzzzzz', '\\SSH_Blog\\userImg\\4.jpg');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(20) NOT NULL DEFAULT '',
  `password` varchar(20) DEFAULT NULL,
  `nickname` varchar(20) DEFAULT NULL,
  `question` varchar(50) DEFAULT NULL,
  `answer` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('aaaaaa', '132456', '凄凄切切群群群群', '你的家乡是哪里', '湖北省洪湖市小港农场');
INSERT INTO `user` VALUES ('mmmmmm', '123456', '小贼猫', '你最长坚持多长时间', '1不是正确答案');
INSERT INTO `user` VALUES ('mmmmmmmmmm', '111111', 'ttttttt', '你的家乡是哪里', '湖北省洪湖市小港农场');
INSERT INTO `user` VALUES ('ppppppp', '123456', '啪啪啪', '你最长坚持多长时间', '你的问题是不是有病');
INSERT INTO `user` VALUES ('qwertyyu', '123456', '大世界', '你最喜欢的动画是', '海贼王');
INSERT INTO `user` VALUES ('xiaoxiao', 'xiaoxiao', '厉风行', '你的家乡', '湖南益阳市');
INSERT INTO `user` VALUES ('zzzzzz', '123456', '123456798', '你最长坚持多长时间', '你的问题是不是有病');
