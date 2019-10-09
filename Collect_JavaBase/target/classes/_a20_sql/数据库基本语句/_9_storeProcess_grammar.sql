/**
 * 存储过程
 * 		执行效率非常快,存储过程是在数据库的服务器端执行的
 * 		移植性很差,不同数据库的存储过程是不能移植
 * 
 * 1.创建存储过程
 * 2.执行存储过程
 * 3.输入参数IN
 * 4.带有输出参数的存储过程
 * 5.接受返回参数的值
 * 6.删除存储过程
 * 7.带有逻辑的存储过程
 * 8.使用查询的结果赋值给变量（INTO）
 *
 */
-- 1.创建存储过程
DELIMITER $       -- 声明存储过程的结束符
CREATE PROCEDURE pro_test()   --存储过程名称(参数列表)
	BEGIN             -- 开始
		-- 可以写多个sql语句;          -- sql语句+流程控制
		SELECT * FROM employee;
	END $            -- 结束 结束符

-- 2.执行存储过程
		-- 参数：
		-- IN：   表示输入参数，可以携带数据带存储过程中
		-- OUT： 表示输出参数，可以从存储过程中返回结果
		-- INOUT： 表示输入输出参数，既可以输入功能，也可以输出功能
	CALL pro_test();          -- CALL 存储过程名称(参数);
--3.输入参数IN
	DELIMITER $
	CREATE PROCEDURE pro_findById(IN eid INT)  -- IN: 输入参数
		BEGIN
		END $
	-- 调用
	CALL pro_findById(4);
--4.带有输出参数的存储过程
	DELIMITER $
	CREATE PROCEDURE pro_testOut(OUT str VARCHAR(20))  -- OUT：输出参数
	BEGIN
		SET str='helljava';		-- 给参数赋值
	END $
--5.接受返回参数的值
		--返回值类型：
		-- 全局变量（所有连接都起作用）创建和修改:set @@变量名=值
		-- 会话变量（ 只存在于当前客户端与数据库服务器端的一次连接当中）创建：set @变量=值
		-- 局部变量（在存储过程中使用的变量就叫局部变量）创建：
	--定义一个会话变量name, 2)使用name会话变量接收存储过程的返回值
	CALL pro_testOut(@NAME);
	-- 查看变量值
	SELECT @NAME;
	--带有输入输出参数的存储过程
	DELIMITER $
	CREATE PROCEDURE pro_testInOut(INOUT n INT)  -- INOUT： 输入输出参数
	BEGIN
	   -- 查看变量
	   SELECT n;
	   SET n =500;
	END $
	-- 调用
	SET @n=10;
	CALL pro_testInOut(@n);
	SELECT @n;
-- 6.删除存储过程
DROP PROCEDURE pro_testOut;
-- 7.带有逻辑的存储过程
	-- 需求：输入一个整数，如果1，则返回“星期一”,如果2，返回“星期二”,如果3，返回“星期三”。其他数字，返回“错误输入”;
	DELIMITER $
	CREATE PROCEDURE pro_testIf(IN num INT,OUT str VARCHAR(20))
	BEGIN
		IF num=1 THEN
			SET str='星期一';
		ELSEIF num=2 THEN
			SET str='星期二';
		ELSEIF num=3 THEN
			SET str='星期三';
		ELSE
			SET str='输入错误';
		END IF;
	END $
	CALL pro_testIf(4,@str);
	SELECT @str;
	-- 需求： 输入一个整数，求和。例如，输入100，统计1-100的和
	DELIMITER $
	CREATE PROCEDURE pro_testWhile(IN num INT,OUT result INT)
	BEGIN
		-- 定义一个局部变量
		DECLARE i INT DEFAULT 1;
		DECLARE vsum INT DEFAULT 0;
		WHILE i<=num DO
		      SET vsum = vsum+i;
		      SET i=i+1;
		END WHILE;
		SET result=vsum;
	END $
	DROP PROCEDURE pro_testWhile;
	CALL pro_testWhile(100,@result);
	SELECT @result;
-- 8.使用查询的结果赋值给变量（INTO）
	DELIMITER $
	CREATE PROCEDURE pro_findById2(IN eid INT,OUT vname VARCHAR(20) )
	BEGIN
		SELECT empName INTO vname FROM employee WHERE id=eid;
	END $
	CALL pro_findById2(1,@NAME);
	SELECT @NAME;

















