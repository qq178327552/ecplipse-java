package _a20_sql.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 执行存储过程SQL语句(CallableStatement接收SQL语句)
 * 
 * 1.没有输出参数的执行过程SQL语句
 * 	1).连接Mysql
 * 	2).准备sql
 * 	3).预编译
 * 	4).设置输入参数
 * 	5).发送参数
 * 	6).遍历结果
 * 2.含有输出参数的执行过程SQL语句,并接收输出参数
 * 	1).连接Mysql
 * 	2).准备sql
 * 	3).预编译
 * 	4).设置输入参数
 * 	5).设置输出参数(注册输出参数) ：参数位置和存储过程中的输出参数的jdbc类型
 * 	6).发送参数，执行
 * 	7).得到输出参数的值：预编译sql中的输出参数的位置
 * 
 * @author zheng
 *
 */
public class _5_StoreProcess {
	/*1.没有输出参数的执行过程SQL语句*/
	public void noOutParameter(Connection conn) throws SQLException{
		/*2).准备sql*/
		String sql = "CALL pro_findById(?)"; //可以执行预编译的sql
		/*3).预编译*/
		CallableStatement stmt = conn.prepareCall(sql);
		/*4).设置输入参数*/
		stmt.setInt(1, 6);
		/*5).发送参数*/
		ResultSet rs = stmt.executeQuery(); //注意： 所有调用存储过程的sql语句都是使用executeQuery方法执行！！！
		/*6).遍历结果*/
		while(rs.next()){
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			System.out.println(id+","+name+","+gender);
		}
	}
	
	/*2.含有输出参数的执行过程SQL语句,并接收输出参数*/
	public void OutParameter(Connection conn) throws SQLException{
		/*2).准备sql*/
		String sql = "CALL pro_findById2(?,?)"; //第一个？是输入参数，第二个？是输出参数
		/*3).预编译*/
		CallableStatement stmt = conn.prepareCall(sql);
		/*4).设置输入参数*/
		stmt.setInt(1, 6);
		/*5).设置输出参数(注册输出参数) ：参数位置和存储过程中的输出参数的jdbc类型*/
		stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
		/*6).发送参数，执行*/
		stmt.executeQuery(); //结果不是返回到结果集中，而是返回到输出参数中
		/*7).得到输出参数的值：预编译sql中的输出参数的位置*/
		String result = stmt.getString(2); //getXX方法专门用于获取存储过程中的输出参数
		System.out.println(result);
	}
	
	/*1).连接Mysql*/
	private Connection conn(String url,String user,String password) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	/*main方法测试*/
	public static void main(String[] args) {
		_5_StoreProcess operate = new _5_StoreProcess();
		try {
			Connection conn = operate.conn("jdbc:mysql://localhost:3306/zheng","root","178327552");
			operate.noOutParameter(conn);//没有输出参数的执行过程SQL语句
			operate.OutParameter(conn);//含有输出参数的执行过程SQL语句,并接收输出参数
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
