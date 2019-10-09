/**
 * SQL表的操作
 *
 *1.创建表
 *2.查看所有表
 *3.查看所有表结构
 *4.删除表
 *5.修改表名称
 *
 */
-- 1.创建表	
CREATE TABLE student(
	id INT PRIMARY KEY,-- 主键,用于标记表中的每条记录的唯一性
	id1 INT AUTO_INCREMENT, -- 自增长，从0开始(自增长字段可以不赋值)
	id2 INT(4) ZEROFILL, -- 当设置数值大小时，不足的前面补0
	name VARCHAR(20)，
	address VARCHAR(20) DEFAULT '广州天河',  -- 默认值,默认值的字段允许为null
	gender VARCHAR(2) NOT NULL, -- 非空限制，非空字段必须赋值且不能赋null
	sex INT UNIQUE, -- 唯一，唯一字段可以插入多个nul
)
-- 2.查看所有表
SHOW TABLES;
-- 3.查看表结构
desc student;
-- 4.删除表
drop table student;
-- 5.修改表名称
alter table student rename to newstudent;