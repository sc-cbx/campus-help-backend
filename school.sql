/*
 Navicat Premium Data Transfer

 Source Server         : xl
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : school

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 01/01/2020 23:53:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for colloction
-- ----------------------------
DROP TABLE IF EXISTS `colloction`;
CREATE TABLE `colloction`  (
  `cID` int(11) NOT NULL AUTO_INCREMENT,
  `gID` int(11) NULL DEFAULT NULL,
  `gName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gPrice` float NULL DEFAULT 0,
  `gImage` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cID`) USING BTREE,
  INDEX `gID`(`gID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of colloction
-- ----------------------------
INSERT INTO `colloction` VALUES (1, 1, '泡面', 5, '1121');
INSERT INTO `colloction` VALUES (4, 2, '泡面', 5, '/gImage/1577891169418暴风截图201931390709078.jpg');
INSERT INTO `colloction` VALUES (5, 2, '泡面', 5, '/gImage/1577891296620暴风截图201931390709078.jpg');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `gID` int(11) NOT NULL AUTO_INCREMENT,
  `tID` int(4) NOT NULL,
  `gName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `gPrice` float NULL DEFAULT 0,
  `gQuantity` int(4) NULL DEFAULT 0,
  `gImage` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`gID`) USING BTREE,
  INDEX `tID`(`tID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goodstype
-- ----------------------------
DROP TABLE IF EXISTS `goodstype`;
CREATE TABLE `goodstype`  (
  `tID` int(4) NOT NULL AUTO_INCREMENT,
  `tName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`tID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for help_express
-- ----------------------------
DROP TABLE IF EXISTS `help_express`;
CREATE TABLE `help_express`  (
  `heID` int(11) NOT NULL AUTO_INCREMENT,
  `uID` int(11) NULL DEFAULT NULL,
  `pickup_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `exName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `receive_site` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `telephone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `pickup_site` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `pickup_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`heID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of help_express
-- ----------------------------
INSERT INTO `help_express` VALUES (1, 2, '陈欢', '拖鞋', '3-170', '16838974567', '菜鸟二期', 'A-1355');
INSERT INTO `help_express` VALUES (6, 1, '李华', '衣服', '1-282', '12793780292', '顺丰快递', 'Y-192');
INSERT INTO `help_express` VALUES (7, 1, '李华', '鞋子', '1-282', '12793780292', '顺丰快递', 'Y-111');
INSERT INTO `help_express` VALUES (8, 1, 'May', '零食', '4-190', '13568907899', '顺丰快递', 'R-4610');
INSERT INTO `help_express` VALUES (11, 3, '李明', '零食', '2-212', '17839390861', '顺丰快递', 'T-6789');
INSERT INTO `help_express` VALUES (12, 4, '黄久', '书包', '2-322', '18799379474', '菜鸟二期', 'E-6677');
INSERT INTO `help_express` VALUES (15, 2, '陈欢', '拖鞋', '3-177', '16838974567', '菜鸟二期', 'Y-1032');
INSERT INTO `help_express` VALUES (16, 2, '陈欢', '拖鞋', '3-174', '16838974567', '菜鸟二期', 'Y-1032');
INSERT INTO `help_express` VALUES (17, 2, '陈欢', '拖鞋', '3-170', '16838974567', '菜鸟二期', 'A-1355');
INSERT INTO `help_express` VALUES (18, 2, '陈欢', '拖鞋', '3-170', '16838974567', '菜鸟二期', 'A-1355');
INSERT INTO `help_express` VALUES (19, 2, '陈欢1', '拖鞋', '3-170', '16838974567', '菜鸟二期', 'A-1355');
INSERT INTO `help_express` VALUES (20, 2, '陈欢1', '拖鞋', '3-170', '16838974567', '菜鸟二期', 'A-1355');
INSERT INTO `help_express` VALUES (21, 2, '陈欢1', '拖鞋', '3-170', '16838974567', '菜鸟二期', 'A-1355');

-- ----------------------------
-- Table structure for helpbar
-- ----------------------------
DROP TABLE IF EXISTS `helpbar`;
CREATE TABLE `helpbar`  (
  `help_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '互助贴吧编号',
  `help_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '求助事情',
  `help_content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '求助描述',
  `help_requirement` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '求助要求',
  `help_contact` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '详情联系',
  `help_replay` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '回复',
  `help_time` datetime(0) NULL DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`help_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of helpbar
-- ----------------------------
INSERT INTO `helpbar` VALUES (1, '求资源', '\r\n求十月的奇迹的简谱资源', '想要完整版的简谱，只有前奏也是可以的，价格方面可以私聊我！', 'QQ:223****051', NULL, NULL);
INSERT INTO `helpbar` VALUES (2, '求助做海报', '要求做一个团建海报', '主题是礼赞祖国，唱响希望，要有学校，系部logo', 'QQ223****051', '我会做', '2019-12-28 19:47:53');
INSERT INTO `helpbar` VALUES (8, '做海报', 'sc要求做一个团建海报', '主题是礼赞祖国，唱响希望，要有学校，系部logo', 'QQ223****051', '我会做', '2019-12-29 19:42:22');
INSERT INTO `helpbar` VALUES (9, '做海报1', 'sc要求做一个团建海报', '主题是礼赞祖国，唱响希望，要有学校，系部logo', 'QQ223****051', '我会做', '2020-01-01 19:48:01');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `oID` int(11) NOT NULL AUTO_INCREMENT,
  `uID` int(11) NOT NULL,
  `uName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `number` int(4) NULL DEFAULT 0,
  `oAllprice` float NULL DEFAULT 0,
  `site` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `telephone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`oID`) USING BTREE,
  INDEX `uID`(`uID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for secgoods
-- ----------------------------
DROP TABLE IF EXISTS `secgoods`;
CREATE TABLE `secgoods`  (
  `secgoods_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `secgoods_type` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品类别',
  `secgoods_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品名称',
  `secgoods_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品原价',
  `secgoods_num` int(1) NULL DEFAULT NULL COMMENT '商品库存',
  `secgoods_newprice` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品转价',
  `secgoods_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '联系方式',
  `secgoods_introduction` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品简介',
  `secgoods_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '宝贝介绍',
  `secgoods_comment` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '评论',
  `secgoods_poster` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '图片',
  `secgoods_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '发布时间',
  PRIMARY KEY (`secgoods_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of secgoods
-- ----------------------------
INSERT INTO `secgoods` VALUES (1, '手机', '华为', 998.00, 1, 600.00, '123****3333', '免费代写贺卡 简易曝光调整 自动出片', '相机入手了了3个月，只用过两次，平常太忙，没时间使用，低价出售，保证质量没有问题，详情可咨询。', '这个挺好看的，想买', '/D/workspace/react/compus-help/src/imgs/xq1.png', '2019-12-28 15:05:26');
INSERT INTO `secgoods` VALUES (2, '租房', '阿尔法温栖日租房', 70.00, 1, 200.00, '183****3304', '免费代写贺卡 简易曝光调整 自动出片', '相机入手了了3个月，只用过两次，平常太忙，没时间使用，低价出售，保证质量没有问题，详情可咨询。', '这个挺好看的，想买', '/D/workspace/react/compus-help/src/imgs/xq1.png', '2019-12-28 15:05:28');
INSERT INTO `secgoods` VALUES (3, '其他', '富士相机mini7C傻瓜可爱7s升级套餐含拍立得相纸男女学生款入门级', 200.00, 1, 200.00, '183****3304', '免费代写贺卡 简易曝光调整 自动出片', '相机入手了了3个月，只用过两次，平常太忙，没时间使用，低价出售，保证质量没有问题，详情可咨询。', '这个挺好看的，想买', '/D/workspace/react/compus-help/src/imgs/xq1.png', '2019-12-28 15:05:29');
INSERT INTO `secgoods` VALUES (4, '衣服', '汉尚华莲银兔汉服女真丝刺绣长袄手工钉真珍珠明制袄裙大气中国风', 666.00, 1, 200.00, '183****3304', '免费代写贺卡 简易曝光调整 自动出片', '相机入手了了3个月，只用过两次，平常太忙，没时间使用，低价出售，保证质量没有问题，详情可咨询。', '这个挺好看的，想买', '/D/workspace/react/compus-help/src/imgs/xq1.png', '2019-12-28 15:05:30');
INSERT INTO `secgoods` VALUES (5, '美妆', '日本SK2/SK-II/skii前男友面膜10片青春护肤神仙水补水保湿修护女', 540.00, 1, 200.00, '183****3304', '免费代写贺卡 简易曝光调整 自动出片', '相机入手了了3个月，只用过两次，平常太忙，没时间使用，低价出售，保证质量没有问题，详情可咨询。', '这个挺好看的，想买', '/D/workspace/react/compus-help/src/imgs/xq1.png', '2019-12-28 15:05:31');
INSERT INTO `secgoods` VALUES (7, '手机', '华为3', 200.00, 1, 220.00, '153****6657', '好', '好', '好', '', '2020-01-01 19:53:01');

-- ----------------------------
-- Table structure for shopping_cars
-- ----------------------------
DROP TABLE IF EXISTS `shopping_cars`;
CREATE TABLE `shopping_cars`  (
  `scID` int(11) NOT NULL AUTO_INCREMENT,
  `uID` int(11) NULL DEFAULT NULL,
  `gID` int(11) NULL DEFAULT NULL,
  `gName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `number` int(4) NULL DEFAULT 0,
  `oAllprice` float NULL DEFAULT 0,
  PRIMARY KEY (`scID`) USING BTREE,
  INDEX `gID`(`gID`) USING BTREE,
  INDEX `uID`(`uID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `u_id` int(99) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `confirm_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uSex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uBirth` datetime(0) NULL DEFAULT NULL,
  `uAddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uStatus` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uOther_message` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uAwatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uBank_card` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uRegTime` datetime(0) NULL DEFAULT NULL,
  `uTureName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uId_card` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uRenZhengTime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`u_id`, `name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '小明', '123456', '123456', NULL, NULL, NULL, NULL, NULL, '/posters1577619789834null', '6236540133010136240', NULL, '黄莉', '510682199902070420', '1529108331@qq.com', '2019-12-27 21:15:08');
INSERT INTO `user` VALUES (2, '小煮', '123456', '123456', '男', '1970-01-01 08:03:20', '希望学院', '学生', '爱好画画就看到傻逼滚垃圾；lfs', NULL, NULL, NULL, NULL, NULL, '1529108332@qq.com', NULL);
INSERT INTO `user` VALUES (3, '小爱', '111111', '111111', NULL, NULL, NULL, NULL, NULL, '/posters1577887010748null', '0000000000000000999', NULL, '爱琴', '510682199902070000', '1529108339@qq.com', '2020-01-01 21:53:14');
INSERT INTO `user` VALUES (33, '傻子', '000000', '000000', '猪和狗', '1970-01-01 08:03:20', '傻逼学院', '学生', '爱好画画就看到傻逼滚垃圾；lfs呵呵呵呵呵呵呵', NULL, NULL, '2020-01-01 22:14:30', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for water_purchase
-- ----------------------------
DROP TABLE IF EXISTS `water_purchase`;
CREATE TABLE `water_purchase`  (
  `wpID` int(11) NOT NULL AUTO_INCREMENT,
  `uID` int(11) NULL DEFAULT NULL,
  `wpName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `wp_num` int(1) NULL DEFAULT 0,
  `dormitory` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `telephone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`wpID`) USING BTREE,
  INDEX `uID`(`uID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of water_purchase
-- ----------------------------
INSERT INTO `water_purchase` VALUES (1, 1, '顾欢', 3, '3-170', '15780335977');
INSERT INTO `water_purchase` VALUES (3, 2, '陈欢', 2, '3-170', '12457789549');

SET FOREIGN_KEY_CHECKS = 1;
