/* 创建数据库 */
SET GLOBAL read_only = 0;


SET GLOBAL optimizer_switch = 'derived_merge=off';

CREATE DATABASE happylife DEFAULT CHARSET 'utf8mb4' COLLATE 'utf8mb4_unicode_ci';

/* 创建数据库表 */
SET SESSION FOREIGN_KEY_CHECKS = 0;

-- 用户表
CREATE TABLE USER (
	id BIGINT NOT NULL DEFAULT 0 COMMENT '编号',
	user_name VARCHAR (100) NOT NULL DEFAULT '' COMMENT '用户名',
	password VARCHAR (100) NOT NULL DEFAULT '' COMMENT '登录密码',
	phone VARCHAR (100) NOT NULL DEFAULT '' COMMENT '手机号码',
	sex INT NOT NULL DEFAULT 0 COMMENT '用户性别',
	user_type INT NOT NULL DEFAULT 0 COMMENT '用户类型',
	create_user VARCHAR (64) NOT NULL DEFAULT '' COMMENT '创建者',
	create_time datetime NOT NULL DEFAULT now() COMMENT '创建时间',
	PRIMARY KEY (id)
) COMMENT = '用户表';
