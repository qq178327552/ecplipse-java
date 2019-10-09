package _a20_sql.mysql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 连接MySql数据库
 * 
 * 1.旧式直接连数据库 2.用驱动管理器管理多个驱动来连接 3.用映射只执行静态代码块
 * 
 * @author zheng
 *
 */
public class _1_ConnectionMySQL {
	/* 1.旧式直接连数据库 */
	public void connectMySQL(String url, String user, String password) throws Exception {
		/* 1.创建驱动程序类对象 */
		Driver driver = new com.mysql.jdbc.Driver(); // 新版本
		// Driver driver = new org.gjt.mm.mysql.Driver(); //旧版本

		/* 设置用户名和密码 */
		Properties props = new Properties();
		props.setProperty("user", user);
		props.setProperty("password", password);

		/* 连接数据库，返回连接对象 */
		Connection conn = driver.connect(url, props);// jdbc协议:数据库子协议:主机:端口/连接的数据库
														// //

		System.out.println(conn);
	}

	/* 2.用驱动管理器管理多个驱动来连接(因为实例化驱动时已经装入驱动管理器，所以再调用驱动管理器重复注册了一次) */
	public void connectManagerMySQL(String url, String user, String password) throws SQLException {
		Driver driver = new com.mysql.jdbc.Driver();
		// Driver driver2 = new com.oracle.jdbc.Driver();
		// 1.注册驱动程序(可以注册多个驱动程序)
		DriverManager.registerDriver(driver);// 内部异new出一个driver,上面再new一个，多余
		// DriverManager.registerDriver(driver2);
		// 2.连接到具体的数据库
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
	}

	/* 3.用映射只执行静态代码块，从而注册驱动程序 */
	public void connectManagerMySQLReform(String url, String user, String password) throws Exception {
		// 通过得到字节码对象的方式加载静态代码块，从而注册驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		// 2.连接到具体的数据库
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);

	}

	/* main方法测试 */
	public static void main(String[] args) {
		_1_ConnectionMySQL operate = new _1_ConnectionMySQL();
		try {
			operate.connectMySQL("jdbc:mysql://localhost:3306/zheng", "root", "178327552");// 旧式直接连数据库
			operate.connectManagerMySQL("jdbc:mysql://localhost:3306/zheng", "root", "178327552");// 用驱动管理器管理多个驱动来连接
			operate.connectManagerMySQLReform("jdbc:mysql://localhost:3306/zheng", "root", "178327552");// 用映射只执行静态代码块
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
