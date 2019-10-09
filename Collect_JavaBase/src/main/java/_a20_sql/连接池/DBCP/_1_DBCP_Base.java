package _a20_sql.连接池.DBCP;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * DBCP连接池基础
 * 	硬编码方式实现连接池
 * 		1.DBCP连接池核心类
 * 		2.连接池参数配置：初始化连接数、最大连接数 / 连接字符串、驱动、用户、密码
 * 		3.获取连接
 * 		4.关闭
 * @author zheng
 */
public class _1_DBCP_Base {
	/*硬编码方式实现连接池*/
	public void testDbcp() throws Exception {
		/*1.DBCP连接池核心类*/
		BasicDataSource dataSouce = new BasicDataSource();
		/*2.连接池参数配置：初始化连接数、最大连接数 / 连接字符串、驱动、用户、密码*/
		dataSouce.setUrl("jdbc:mysql:///jdbc_demo"); // 数据库连接字符串
		dataSouce.setDriverClassName("com.mysql.jdbc.Driver"); // 数据库驱动
		dataSouce.setUsername("root"); // 数据库连接用户
		dataSouce.setPassword("root"); // 数据库连接密码
		dataSouce.setInitialSize(3); // 初始化连接
		dataSouce.setMaxActive(6); // 最大连接
		dataSouce.setMaxIdle(3000); // 最大空闲时间

		/*3.获取连接*/
		Connection con = dataSouce.getConnection();
		con.prepareStatement("delete from admin where id=3").executeUpdate();
		/*4.关闭*/
		con.close();
	}
}
