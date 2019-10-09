package _a20_sql.连接池.C3P0;

import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * C3P0连接池基础 硬编码方式实现连接池 
 * 	1.创建连接池核心工具类
 * 	2.设置连接参数：url、驱动、用户密码、初始连接数、最大连接数
 * 	3.从连接池对象中，获取连接对象
 * 	4.关闭
 * @author zheng
 */
public class _1_C3P0_Base {
	/*硬编码方式，使用C3P0连接池管理连接*/
	public void testCode() throws Exception {
		/*1.创建连接池核心工具类*/
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		/*2.设置连接参数：url、驱动、用户密码、初始连接数、最大连接数*/
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/jdbc_demo");
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setUser("root");
		dataSource.setPassword("root");
		dataSource.setInitialPoolSize(3);
		dataSource.setMaxPoolSize(6);
		dataSource.setMaxIdleTime(1000);

		/*3.从连接池对象中，获取连接对象*/
		Connection con = dataSource.getConnection();
		con.prepareStatement("delete from admin where id=7").executeUpdate();
		/*4.关闭*/
		con.close();
	}
}
