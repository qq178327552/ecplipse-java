package _a20_sql.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * SQL语句带有变量情况(PreparedStatement接收SQL语句)
 * 
 * 1.无返回数据结果的SQL带有变量
 * 	1).连接Mysql
 * 	2).准备预编译的sql
 * 	3).执行预编译sql语句(检查语法)
 * 	4).设置参数值
 * 	5).发送参数，执行sql
 * 
 * 2.有返回数据结果的SQL带有变量
 * 	1).连接Mysql
 * 	2).准备预编译的sql
 * 	3).预编译
 * 	4).执行sql
 * 	5).遍历结果
 * 
 * @author zheng
 *
 */
public class _4_Sql_var {
	/*1.执行无参的SQL语句*/
	public void onParameterSlq(Connection conn) throws SQLException{
		/*2).准备预编译的sql*/
		String sql = "INSERT INTO student(NAME,gender) VALUES(?,?)"; //?表示一个参数的占位符
		/*3).执行预编译sql语句(检查语法)*/
		PreparedStatement stmt = conn.prepareStatement(sql);
		/*4).设置参数值*/
		stmt.setString(1, "李四");//参数一： 参数位置  从1开始
		stmt.setString(2, "男");
		/*5).发送参数，执行sql*/
		int count = stmt.executeUpdate();
		System.out.println("影响了"+count+"行");

	}
	
	/*2.执行带参的SQL语句(遍历取数据)*/
	public void ParameterSlq(Connection conn) throws SQLException{
		/*2).准备预编译的sql*/
		String sql = "SELECT * FROM student"; 
		/*3).预编译*/
		PreparedStatement stmt = conn.prepareStatement(sql);
		/*4).执行sql*/
		ResultSet rs = stmt.executeQuery();
		/*5).遍历结果*/
		while(rs.next()){
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			System.out.println(id+","+name+","+gender);
		}
	}
	
	/*1).连接Mysql*/
	private Connection conn(String url,String user,String password) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	/*main方法测试*/
	public static void main(String[] args) {
		_4_Sql_var operate = new _4_Sql_var();
		try {
			Connection conn = operate.conn("jdbc:mysql://localhost:3306/zheng","root","178327552");
			operate.onParameterSlq(conn);//执行无参的SQL语句
			operate.ParameterSlq(conn);//执行带参的SQL语句(遍历取数据)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
