#创建数据库以及相关的表
CREATE DATABASE ssm_ebook;
USE ssm_ebook;
CREATE TABLE ebook_category(
`id` INT PRIMARY KEY AUTO_INCREMENT COMMENT '分类编号',
`name` VARCHAR(50) NOT NULL COMMENT '分类名称'
) COMMENT '电子图书分类表';

CREATE TABLE ebook_entry(
`id` INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
categoryId INT NOT NULL COMMENT '分类编号',
title VARCHAR(50) NOT NULL COMMENT '图书名称',
summary VARCHAR(255) COMMENT '摘要',
uploaduser VARCHAR(20) COMMENT '上传人',
createdate DATE NOT NULL COMMENT '上传时间',
CONSTRAINT `entry_category_id` FOREIGN KEY (`categoryId`) REFERENCES `ebook_category` (`id`)
) COMMENT '电子图书条目表';

#添加测试数据
INSERT INTO ebook_category VALUES(11111,"小说"),(11112,"科普"),(11113,"教材");
INSERT INTO ebook_entry(id,categoryId,title,createdate) 
VALUES(10000,11111,"红楼梦",2000-1-1),(10001,11111,"童年",1999-3-2),
(10002,11112,"时间简史",2005-8-9),(10003,11112,"大设计",2005-12-1),
(10004,11113,"小学数学五年级上册",2003-8-9),(10005,11113,"高等数学",2015-10-1);


