/**
 * 对数据库的操作
 *		当操作了某张表时，希望同时触发一些动作/行为
 *
 * 1.创建触发器
 * 2.创建触发器
 * 3.创建触发器
 *
 */
-- 1.创建触发器(添加)
	-- 需求： 当向员工表插入一条记录时，希望mysql自动同时往日志表插入数据
	CREATE TRIGGER tri_empAdd AFTER INSERT ON employee FOR EACH ROW    -- 当往员工表插入一条记录时
     INSERT INTO test_log(content) VALUES('员工表插入了一条记录');
-- 2.创建触发器(修改)
     CREATE TRIGGER tri_empUpd AFTER UPDATE ON employee FOR EACH ROW    -- 当往员工表修改一条记录时
     INSERT INTO test_log(content) VALUES('员工表修改了一条记录');
-- 3.创建触发器(删除)
CREATE TRIGGER tri_empDel AFTER DELETE ON employee FOR EACH ROW    -- 当往员工表删除一条记录时
     INSERT INTO test_log(content) VALUES('员工表删除了一条记录');
