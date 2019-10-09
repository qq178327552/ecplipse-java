/**
 * 查询数据
 *
 *1.查询所有列
 *2.查询指定列
 *3.查询时添加常量列
 *4.查询时合并列
 *5.查询时去除重复记录
 *6.逻辑条件
 *7.比较条件
 *8.判空条件
 *9.模糊条件
 *10.聚合查询
 *11.分页查询
 *12.查询排序
 *13.多个排序条件
 *14.分组查询
 *15.分组查询后筛选
 *16.案例
 *
 */
-- 1.查询所有列
SELECT * FROM student;
-- 2.查询指定列
SELECT id,name FROM student;
-- 3.查询时添加常量列
	-- 需求： 在查询student表时添加一个班级列，内容为“a班”
	SELECT id,NAME,'a班' AS '年级'  FROM student;
-- 5.查询时合并列
		-- 注意：合并列只能合并数值类型的字段
	-- 需求： 查询每个学生的Mat和Eng的总成绩
	SELECT id,name,(Mat+Eng) AS '总成绩' FROM student;
-- 6.查询时去除重复记录
	-- 需求： 查询学生的性别类型(男 女)
	SELECT DISTINCT gender FROM student;
	SELECT DISTINCT(gender) FROM student;
-- 7.逻辑条件： and(与)、or(或)
	-- 需求： 查询id为2，且姓名为李四的学生
	SELECT * FROM student WHERE id=2 AND NAME='李四'; -- 交集
	-- 需求： 查询id为2，或姓名为张三的学生
	SELECT * FROM student WHERE id=2 OR NAME='张三'; -- 并集
-- 8.比较条件： ‘>’、‘<’、‘>=’、‘<=’、‘=’、‘<>’(不等于)、'between and'(等价于>= 且 <=)
	-- 需求： 查询Mat成绩大于70分的学生
	SELECT * FROM student WHERE Mat>70;
	-- 需求： 查询Mat成绩大于等于75，且小于等于90分的学生
	SELECT * FROM student WHERE Mat>=75 AND Mat<=90;
	SELECT * FROM student WHERE jsp BETWEEN 75 AND 90;
	-- 需求： 查询女的学生
	SELECT * FROM student WHERE gender<>'男';
-- 9.判空条件(null 空字符串)：is null 和 is not null 和 ='' 和 <>''
		-- null：表示没有值
		-- 空字符串：有值的
	-- 需求： 查询地址为空的学生（包括null和空字符串）
	SELECT * FROM student WHERE address IS NULL OR address='';
	-- 需求： 查询有地址的学生(不包括null和空字符串)
	SELECT * FROM student WHERE address IS NOT NULL AND address<>'';
-- 10.模糊条件(like)： 
		-- % : 表示任意个字符
		-- _ : 表示一个字符
	-- 需求： 查询姓‘张’的学生
	SELECT * FROM student WHERE NAME LIKE '张%';
	-- 需求： 查询姓‘李’，且姓名只有两个字的学生
	SELECT * FROM student WHERE NAME LIKE '李_';
-- 11.聚合查询(使用聚合函数的查询)
		-- 常用的聚合函数： sum()  avg()  max()  min()  count()
		-- 使用count统计表的记录数默认把null值忽略
	-- 需求：查询学生的Mat的总成绩 (sum() :求和函数)
	SELECT SUM(Mat) AS '数学的总成绩' FROM student;
	-- 需求： 查询学生的Mat的平均分
	SELECT AVG(Mat) AS '数学的平均分' FROM student;
	-- 需求: 查询当前Mat最高分
	SELECT MAX(Mat) AS '数学最高分' FROM student;
	-- 需求： 查询最Mat低分
	SELECT MIN(Mat) AS '数学最低分' FROM student;
	-- 需求： 统计当前有多少学生(count(字段))，注意：count（）函数统计的数量不包含null的数据
	SELECT COUNT(*) FROM student;
	SELECT COUNT(id) FROM student;
-- 12.分页查询（limit 起始行,查询几行）
		-- 起始行从0开始，
		-- 分页：当前页  每页显示多少条
		-- 分页查询当前页的数据的sql: SELECT * FROM student LIMIT (当前页-1)*每页显示多少条,每页显示多少条;
	-- 需求： 查询第1,2条记录（第1页的数据）
	SELECT * FROM student LIMIT 0,2;
	-- 查询第3,4条记录（第2页的数据）
	SELECT * FROM student LIMIT 2,2;
	-- 查询第7,8条记录 (没有记录不显示)
	SELECT * FROM student LIMIT 6,2;
-- 13.查询排序(order by 字段 asc/desc)
		-- asc: 顺序，正序。数值：递增，字母：自然顺序（a-z）
		-- desc: 倒序，反序。数值：递减，字母：自然反序(z-a)
		-- 默认情况下，按照正序排序
		-- 不加order情况下，按照插入记录顺序排序
	-- 需求： 按照id顺序排序
	SELECT * FROM student ORDER BY id ASC;
	SELECT * FROM student ORDER BY id; -- 默认正序
	SELECT * FROM student ORDER BY id DESC;-- 反序
-- 14.多个排序条件
	-- 需求： 按照Mat正序，按照Eng的倒序
	SELECT * FROM student ORDER BY Mat ASC,Eng DESC;
-- 15.分组查询(group by)
	-- 需求： 查询男女的人数
	SELECT gender,COUNT(*) FROM student GROUP BY gender;
-- 16.分组查询后筛选
		-- 分组之前条件使用where关键字，分组之前条件使用having关键字
	-- 需求： 查询总人数大于2的性别
	SELECT gender,COUNT(*) FROM student WHERE GROUP BY gender HAVING COUNT(*)>2;
