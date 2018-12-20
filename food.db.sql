BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS `totalPrice` (
	`totalPrice`	REAL
);
CREATE TABLE IF NOT EXISTS `menu` (
	`name`	TEXT,
	`price`	INTEGER,
	`type`	TEXT
);
INSERT INTO `menu` VALUES ('ไก่ทอด',120,'ทอด');
INSERT INTO `menu` VALUES ('ผัดกะเพรา',100,'ผัด');
INSERT INTO `menu` VALUES ('ข้าวผัด',100,'ผัด');
INSERT INTO `menu` VALUES ('ต้มยำกุ้ง',150,'ต้ม');
INSERT INTO `menu` VALUES ('ต้มจืดหมู',150,'ต้ม');
INSERT INTO `menu` VALUES ('ไข่ทอด',50,'ทอด');
INSERT INTO `menu` VALUES ('สปาเก๊ตตี๋หมู',100,'ผัด');
INSERT INTO `menu` VALUES ('หมูคั่วเค็ม',100,'ทอด');
INSERT INTO `menu` VALUES ('หมูทอด',100,'ทอด');
CREATE TABLE IF NOT EXISTS `list` (
	`name`	TEXT,
	`price`	INTEGER
);
COMMIT;
