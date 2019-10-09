/**
 * 修改数据
 *
 *1.修改所有数据
 *2.带条件的修改
 *3.修改多个字段
 *
 */
-- 1.修改所有数据
UPDATE student SET gender='女';
-- 2.带条件的修改
UPDATE student SET gender='男' WHERE id=1; -- 修改id为1的学生，修改性别为男
-- 3.修改多个字段,注意: SET 字段名=值,字段名=值,....
UPDATE student SET gender='男',age=30 WHERE id=2;