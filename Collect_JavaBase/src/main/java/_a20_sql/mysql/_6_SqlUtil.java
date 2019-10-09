package _a20_sql.mysql;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/**
 * jdbc工具类
 * 
 * 1.静态代码块中读配置文件并注册驱动（只加载一次）
 * 2.获取连接对象的方法
 * 3.释放资源的方法*
 * 
 * @author zheng
 *
 */
public class _6_SqlUtil {
	private static String url = null;
	private static String user = null;
	private static String password = null;
	private static String driverClass = null;
	/*1.静态代码块中读配置文件并注册驱动（只加载一次）*/
	static{
		try {
			Properties props = new Properties();//创建db.properties文件对象
			InputStream in = _6_SqlUtil.class.getResourceAsStream("/db.properties");//用类路径读取配置文件
			props.load(in);//加载文件
			/*读取配置文件中的信息*/
			url = props.getProperty("url");
			user = props.getProperty("user");
			password = props.getProperty("password");
			driverClass = props.getProperty("driverClass");
			Class.forName(driverClass);//注册驱动程序
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("驱程程序注册出错");
		}
	}
	
	/*2.获取连接对象的方法*/
	public static Connection getConnection(){
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/*3.释放资源的方法*/
	public static void close(Connection conn,Statement stmt){//释放Connection对象和Statement对象
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
	public static void close(Connection conn,Statement stmt,ResultSet rs){//释放Connection对象、Statement对象和ResultSet对象
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
				throw new RuntimeException(e1);
			}
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
}
/**
 * java寻找路径问题:
 * 		. 代表java命令运行的目录
 * 		在java项目下，. java命令的运行目录从项目的根目录开始
 * 		在web项目下，  . java命令的而运行目录从tomcat/bin目录开始
 * java类路径读取
 * 		/ : 斜杠表示classpath的根目录
 * 		在java项目下，classpath的根目录从bin目录开始
 * 		在web项目下，classpath的根目录从WEB-INF/classes目录开始
 * 		类路径读取方式：1).读取文件的InputStream流:[类名].class.getResourceAsStream(路径)
 */
