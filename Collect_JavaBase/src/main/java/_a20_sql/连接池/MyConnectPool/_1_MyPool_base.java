package _a20_sql.连接池.MyConnectPool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
/**
 * 自定义连接池, 管理连接 代码实现： 
 *	1.构造函数中，初始化连接放入连接池
 *	2.创建一个新的连接的方法
 *	3.获取连接
 *		1).判断连接池中是否有连接, 如果有连接，就直接从连接池取出
 *		2). 连接池中没有连接： 判断，如果没有达到最大连接数，创建；
 *		3). 如果当前已经达到最大连接数，抛出异常
 *	4.释放连接
 *		1).判断： 池的数目如果小于初始化连接，就放入池中
 *		2).否则直接关闭
 */
public class _1_MyPool_base {
	/**
	 * 自定义连接池, 管理连接 代码实现： 
	 *	1.构造函数中，初始化连接放入连接池
	 *	2.创建一个新的连接的方法
	 *	3.获取连接
	 *		1).判断连接池中是否有连接, 如果有连接，就直接从连接池取出
	 *		2). 连接池中没有连接： 判断，如果没有达到最大连接数，创建；
	 *		3). 如果当前已经达到最大连接数，抛出异常
	 *	4.释放连接
	 *		1).判断： 池的数目如果小于初始化连接，就放入池中
	 *		2).否则直接关闭
	 */
}
