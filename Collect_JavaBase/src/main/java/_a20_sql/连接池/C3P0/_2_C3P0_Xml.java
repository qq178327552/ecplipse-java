package _a20_sql.连接池.C3P0;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * XML配置方式，使用C3P0连接池管理连接
 * 	1.创建c3p0连接池核心工具类
 *	2.获取连接 
 *	3.关闭
 * @author zheng
 */
public class _2_C3P0_Xml {
	/*XML配置方式，使用C3P0连接池管理连接*/
	public void testXML() throws Exception {
		/*1.创建c3p0连接池核心工具类*/
		// 自动加载src下c3p0的配置文件【c3p0-config.xml】
		ComboPooledDataSource dataSource = new ComboPooledDataSource();// 使用默认的配置,可输入配置文件中的name属性值获取配置id
		PreparedStatement pstmt = null;

		/*2.获取连接*/
		Connection con = dataSource.getConnection();
		for (int i = 1; i < 11; i++) {
			String sql = "insert into employee(empName,dept_id) values(?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "Rose" + i);
			pstmt.setInt(2, 1);
			pstmt.executeUpdate();
		}
		pstmt.close();
		/*3.关闭*/
		con.close();
	}
}
