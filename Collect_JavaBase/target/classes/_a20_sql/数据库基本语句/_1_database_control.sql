/**
 * 对数据库的操作
 *
 *1.查询所有数据库
 *2.创建数据库
 *3.查看数据库的默认字符集
 *4.删除数据库
 *5.修改数据库字符集(utf-8字符在cmd里为utf8)
 *6.进入数据库操作
 *7.全局变量操作
 *8.服务器编码
 *9.用户权限
 *
 */
-- 1.查询所有数据库
show databases;
-- 2.创建数据库,并指定默认字符集
create database studentDB default character set utf8;
-- 3.查看数据库的默认字符集
show create database studentDB;
-- 4.删除数据库
drop database studentDB;
-- 5.修改数据库字符集(utf-8字符在cmd里为utf8)
alter database studentDB default character set utf8;
-- 6.进入数据库操作
use studentDB;
-- 7.全局变量操作
	-- 查看所有全局变量： 
	show variables
    -- 查看某个全局变量： 
    select @@变量名
-- 8.服务器编码
	-- mysql服务器的接收数据的编码
	character_set_client: 
    -- mysql服务器输出数据的编码
    character_set_results：
-- 9.用户权限
	--查看所有用户信息
	USE mysql;
	SELECT * FROM USER;
	-- 修改密码
	UPDATE USER SET PASSWORD=PASSWORD('123456') WHERE USER='root';
	-- 分配权限账户
	GRANT SELECT ON day16.employee TO 'eric'@'localhost' IDENTIFIED BY '123456';












