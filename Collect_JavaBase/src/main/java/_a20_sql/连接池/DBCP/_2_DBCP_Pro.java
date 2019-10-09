package _a20_sql.连接池.DBCP;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
/**
 * 用配置文件传入参数的连接池
 * 	配置方式实现连接池 , 便于维护
 * 		1.加载prop配置文件
 * 		2.获取文件流
 * 		3.加载属性配置文件
 * 		4.根据prop配置，直接创建数据源对象
 * 		5.获取连接
 * 		6.关闭
 * @author zheng
 */
public class _2_DBCP_Pro {
	/*配置方式实现连接池 , 便于维护*/
	public void testProp() throws Exception {
		/*1.加载prop配置文件*/
		Properties prop = new Properties();
		/*2.获取文件流*/
		InputStream inStream = _2_DBCP_Pro.class.getResourceAsStream("_2_db.properties");
		/*3.加载属性配置文件*/
		prop.load(inStream);
		/*4.根据prop配置，直接创建数据源对象*/
		DataSource dataSouce = BasicDataSourceFactory.createDataSource(prop);

		/*5.获取连接*/
		Connection con = dataSouce.getConnection();
		con.prepareStatement("delete from admin where id=4").executeUpdate();
		/*6.关闭*/
		con.close();
	}
}
