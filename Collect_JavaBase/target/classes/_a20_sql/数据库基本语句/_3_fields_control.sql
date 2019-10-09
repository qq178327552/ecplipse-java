/**
 * 表数据设计
 *
 *1.创建表
 *2.删除表
 *3.添加字段
 *4.修改字段类型
 *5.修改字段名称
 *
 */
-- 1.创建表
CREATE TABLE student(
	id INT,
	name VARCHAR(20)
)
-- 2.删除表
drop table student;
-- 3.添加字段
alter table student add column sex varchar(2);
-- 4.修改字段类型
alter table student modify column id varchar(100);
-- 5.修改字段名称(先写旧名称，后写修改的名称)
alter table student change column id newid varchar(2);