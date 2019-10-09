package _a20_sql.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 带有返回数据查询结果的SQL语句(Statement接收SQL语句)
 * 
 * 1.查询一条返回数据 1).连接Mysql 2).创建Statement 3).准备sql 4).执行sql 5).移动光标
 * 
 * 2.查询所有返回结果的SQL语句(遍历取数据) 1).连接Mysql 2).创建Statement 3).准备sql 4).执行sql 5).遍历结果
 * 
 * @author zheng
 *
 */
public class _3_ReturnDataSql {
	/* 1.查询一条返回数据 */
	public void parameterSqlOne(Connection conn) throws SQLException {
		/* 2).创建Statement */
		Statement stmt = conn.createStatement();
		/* 3).准备sql */
		String sql = "SELECT * FROM student";
		/* 4).执行sql */
		ResultSet rs = stmt.executeQuery(sql);
		/* 5).移动光标 */
		boolean flag = rs.next();
		if (flag) {
			int id = rs.getInt(1);// 索引1取出列值
			String name = rs.getString(2);// 索引2取出列值
			String gender = rs.getString(3);// 索引3取出列值
			System.out.println(id + "," + name + "," + gender);
			id = rs.getInt("id");// 列名称id取出列值
			name = rs.getString("name");// 列名称name取出列值
			gender = rs.getString("gender");// 列名称gender取出列值
			System.out.println(id + "," + name + "," + gender);
		}
	}

	/* 2.查询所有返回结果的SQL语句(遍历取数据) */
	public void parameterSlq(Connection conn) throws SQLException {
		/* 2).创建Statement */
		Statement stmt = conn.createStatement();
		/* 3).准备sql */
		String sql = "SELECT * FROM student";
		/* 4).执行sql */
		ResultSet rs = stmt.executeQuery(sql);
		/* 5).遍历结果 */
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			System.out.println(id + "," + name + "," + gender);
		}
	}

	/* 1).连接Mysql */
	private Connection conn(String url, String user, String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	/* main方法测试 */
	public static void main(String[] args) {
		_3_ReturnDataSql operate = new _3_ReturnDataSql();
		try {
			Connection conn = operate.conn("jdbc:mysql://localhost:3306/zheng", "root", "178327552");
			operate.parameterSqlOne(conn);// 查询一条返回数据
			operate.parameterSlq(conn);// 查询所有返回结果的SQL语句(遍历取数据)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
