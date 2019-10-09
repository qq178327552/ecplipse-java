/**
 * 删除数据
 *
 *1.删除所有数据
 *		不能删除表的约束，可以回滚
 *		可以删除表的约束，不可以回滚
 *2.带条件的删除
 *
 */
-- 1.删除所有数据
DELETE FROM student;--不能删除表的约束，可以回滚
truncate table student;--可以删除表的约束，不可以回滚
-- 2.带条件的删除
DELETE FROM student WHERE id=2;