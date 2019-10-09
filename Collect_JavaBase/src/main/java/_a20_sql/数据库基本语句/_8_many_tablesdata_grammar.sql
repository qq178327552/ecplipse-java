/**
 * 查询数据
 *
 *1.创建表
 *2.外键
 *3.级联操作
 *4.交叉连接查询
 *5.内连接查询
 *6.外连接查询
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
-- 2.外键
		--约束两种表的数据,用于解决数据冗余高问题： 独立出一张表
		
		--被约束的表称为副表，约束别人的表称为主表，外键设置在副表上的
		--主表的参考字段通用为主键
		--添加数据： 先添加主表，再添加副表
		--修改数据： 先修改副表，再修改主表
		--删除数据： 先删除副表，再删除主表
	-- 部门表（主表）
	CREATE TABLE dept(
		id INT PRIMARY KEY,
		deptName VARCHAR(20)
	)
	-- 创建员工表（副表/从表）
	CREATE TABLE employee(
		id INT PRIMARY KEY,
		deptId INT,
		-- 声明一个外键约束
		CONSTRAINT emlyee_dept_fk FOREIGN KEY(deptId) REFERENCES dept(id);
		--           外键名称                 	 			外键               			参考表(参考字段)
	)
-- 3.级联操作,用于可以直接修改或删除主表数据，从而影响副表数据
		--级联修改： ON UPDATE CASCADE
		--级联删除： ON DELETE CASCADE
	-- 创建员工表（副表/从表）
	CREATE TABLE employee(
		id INT PRIMARY KEY,
		deptId INT,
		-- 声明一个外键约束,且级联修改、级联删除
		CONSTRAINT emlyee_dept_fk FOREIGN KEY(deptId) REFERENCES dept(id) ON UPDATE CASCADE ON DELETE CASCADE;
	)
-- 4.交叉连接查询（会产生笛卡尔乘积现象：4 * 4=16，有些是重复记录）
SELECT empName,deptName FROM employee,dept;
-- 5.内连接查询：只有满足条件的结果才会显示
		--步骤：1）确定查询哪些表   2）确定哪些哪些字段   3）表与表之间连接条件 (规律：连接条件数量是表数量-1)
	-- 需求：查询员工及其所在部门(显示员工姓名，部门名称)
	SELECT empName,deptName       -- 2）确定哪些哪些字段
		FROM employee,dept    -- 1）确定查询哪些表
		WHERE employee.deptId=dept.id;  -- 3）表与表之间连接条件
	SELECT empName,deptName		--另一种语法
		FROM employee
		INNER JOIN dept			--员工表(副表)连接部门表(主表)
		ON employee.deptId=dept.id;--条件关键字变为on
	SELECT e.empName,deptName		--可使用别名更加明确，其中as [别名]中的as可以省略
		FROM employee e				--其中as [别名]中的as可以省略
		INNER JOIN dept as d
		ON e.deptId=d.id;
-- 6.外连接查询：分为左外连接、右外连接，(查询不到的也能显示)
		--左[外]连接查询： 使用左边表的数据去匹配右边表的数据，如果符合连接条件的结果则显示，如果不符合连接条件则显示null,即左表全部显示，用右表去匹配
	-- 需求： 查询每个部门的员工，某个部门没有员工显示null
	SELECT d.deptName,e.empName
		FROM dept d
		LEFT OUTER JOIN employee e
		ON d.id=e.deptId;
-- 7.自连接查询
	-- 需求：查询员工及其上司
	SELECT e.empName,b.empName
		FROM employee e 
		LEFT OUTER JOIN employee b
		ON e.bossId=b.id;

	

	

