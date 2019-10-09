package _a20_sql.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 无数据查询结果的SQL语句(Statement接收SQL语句)
 * 
 * 1.无查询结果的SQL语句
 * 	1).连接Mysql
 * 	2).创建Statement
 * 	3).准备sql
 * 	4).发送sql语句，执行sql语句,得到返回结果
 * 	5).输出
 * 	
 * @author zheng
 *
 */
public class _2_NoReturnDataSql {
	/*1.无查询结果的SQL语句*/
	public void noParameterSlq(Connection conn) throws SQLException{
		/*2).创建Statement*/
		Statement stmt = conn.createStatement();
		/*3).准备sql*/
		String sql = "CREATE TABLE student(id INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(20),gender VARCHAR(2))";
		/*4).发送sql语句，执行sql语句,得到返回结果*/
		int count = stmt.executeUpdate(sql);
		/*5).输出*/
		System.out.println("影响了"+count+"行！");
	}
	
	/*1).连接Mysql*/
	private Connection conn(String url,String user,String password) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	/*main方法测试*/
	public static void main(String[] args) {
		_2_NoReturnDataSql operate = new _2_NoReturnDataSql();
		try {
			Connection conn = operate.conn("jdbc:mysql://localhost:3306/zheng","root","178327552");
			operate.noParameterSlq(conn);//无查询结果的SQL语句
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
