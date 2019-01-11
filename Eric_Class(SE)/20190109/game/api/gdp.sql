/*
 Navicat Premium Data Transfer

 Source Server         : GDP
 Source Server Type    : MySQL
 Source Server Version : 50610
 Source Host           : gdp.cluster-ctl3cvytcvbx.ap-northeast-1.rds.amazonaws.com
 Source Database       : gdp

 Target Server Type    : MySQL
 Target Server Version : 50610
 File Encoding         : utf-8

 Date: 09/10/2018 15:08:47 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `fb_member`
-- ----------------------------
DROP TABLE IF EXISTS `fb_member`;
CREATE TABLE `fb_member` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `fb_id` varchar(32) DEFAULT NULL COMMENT 'fb唯一id',
  `nickname` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `add_time` datetime NOT NULL,
  `point` int(8) NOT NULL COMMENT 'é»žæ•¸',
  `update_time` datetime NOT NULL COMMENT 'æœ€è¿‘ç™»å…¥æ™‚é–“',
  `gender` varchar(12) NOT NULL COMMENT 'male男 Female女',
  `birthday` date NOT NULL COMMENT '生日',
  `job` varchar(32) NOT NULL COMMENT '職業',
  `share_time` date NOT NULL COMMENT '分享貼文日期',
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `fb_id` (`fb_id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `fb_member`
-- ----------------------------
BEGIN;
INSERT INTO `fb_member` VALUES ('1', '1475625275872297', 'Zoug Yan', 'lover082763@yahoo.com.tw', '2018-09-04 19:26:47', '16', '2018-09-10 10:54:46', 'male', '1995-01-30', 'IT', '2018-09-09'), ('38', '454579948384248', 'Paul Lan', 'paullan0521@gmail.com', '2018-09-05 19:08:46', '22', '2018-09-10 08:58:30', 'male', '1995-01-30', 'IT', '2018-09-10'), ('39', '295495094577496', 'Zong Otto', 'ottozong082763@gmail.com', '2018-09-05 19:10:38', '27', '2018-09-08 14:11:56', 'male', '2018-09-04', 'test', '0000-00-00'), ('41', '1799250470194508', '鄒昀宸', 'gn1221498@yahoo.com', '2018-09-05 19:30:33', '35', '2018-09-09 22:51:35', '', '0000-00-00', '', '2018-09-09'), ('42', '10155872547784389', 'Amos Huang', 'amoswish@gmail.com', '2018-09-05 19:30:48', '2', '2018-09-07 14:41:22', '', '0000-00-00', '', '0000-00-00'), ('43', '10218596898259962', 'Boky Chen', 'wonderoow@gmail.com', '2018-09-05 19:37:50', '10', '2018-09-06 17:16:48', '', '0000-00-00', '', '0000-00-00'), ('44', '2388643074486886', '郭丞哲', 'doppler.kuo@gmail.com', '2018-09-05 23:59:31', '1', '2018-09-06 11:45:23', '', '0000-00-00', '', '0000-00-00'), ('45', '926251704242793', 'Wendy  Yang', 's11108151@stu.edu.tw', '2018-09-06 11:22:15', '13', '2018-09-06 15:01:33', '', '0000-00-00', '', '0000-00-00'), ('46', '10212759079352632', 'Mavis Lin', 'iamboyish@gmail.com', '2018-09-07 14:41:03', '1', '2018-09-09 22:24:10', '', '0000-00-00', '', '0000-00-00');
COMMIT;

-- ----------------------------
--  Table structure for `member`
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `account` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `reg_time` datetime NOT NULL COMMENT '註冊時間',
  `login_time` datetime NOT NULL COMMENT '登入時間',
  `status` int(1) NOT NULL COMMENT '狀態 0:正常 1:鎖定',
  `point` int(10) DEFAULT NULL COMMENT '點數',
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `status` (`status`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `member`
-- ----------------------------
BEGIN;
INSERT INTO `member` VALUES ('1', '123', '81dc9bdb52d04dc20036dbd8313ed055', '2018-09-05 22:18:46', '2018-09-10 14:46:09', '0', null), ('2', '12345', '81dc9bdb52d04dc20036dbd8313ed055', '2018-09-10 14:39:02', '2018-09-10 14:48:46', '0', null);
COMMIT;

-- ----------------------------
--  Table structure for `top_board`
-- ----------------------------
DROP TABLE IF EXISTS `top_board`;
CREATE TABLE `top_board` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `fb_id` int(10) DEFAULT NULL,
  `point` int(10) NOT NULL COMMENT '點數',
  `play_date` date NOT NULL COMMENT '當天日期',
  PRIMARY KEY (`id`),
  KEY `fb_id` (`fb_id`),
  KEY `play_date` (`play_date`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `top_board`
-- ----------------------------
BEGIN;
INSERT INTO `top_board` VALUES ('4', '38', '6', '2018-09-06'), ('5', '38', '10', '2018-09-05'), ('6', '42', '5', '2018-09-05'), ('7', '45', '8', '2018-09-06'), ('8', '44', '10', '2018-09-06'), ('9', '43', '1', '2018-09-06'), ('10', '1', '38', '2018-09-06'), ('11', '1', '16', '2018-09-07'), ('12', '38', '22', '2018-09-07'), ('13', '46', '6', '2018-09-07'), ('14', '42', '14', '2018-09-07'), ('15', '38', '12', '2018-09-08'), ('16', '38', '62', '2018-09-09'), ('17', '1', '49', '2018-09-09'), ('18', '46', '20', '2018-09-09'), ('19', '38', '7', '2018-09-10'), ('20', '1', '3', '2018-09-10');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
