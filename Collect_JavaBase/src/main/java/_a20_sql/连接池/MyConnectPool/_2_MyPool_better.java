package _a20_sql.连接池.MyConnectPool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
/**
 * 自定义连接池, 管理连接 代码实现的改进： 
 * 		解决 ：当主程序调用close()时，需要的并不是关闭连接而是把连接放回连接池
 * 		当调用Connection接口的close方法时候，希望触发pool.addLast(con);把连接放入连接池
 *			1：实现Connection接口，重写close方法 (须重写close方法，比较麻烦)
 *			2：动态代理
 *  
 *	1.构造函数中，初始化连接放入连接池
 *	2.创建一个新的连接的方法
 *		con动态代理
 *			1).创建当前使用的类加载器
 *			2).创建目标对象接口
 *			3).创建事件处理器,当直线上面目标对象接口中的方法时,会自动触发处理器内代码
 *				a).先获取当前执行的方法的方法名
 *				b).判断当执行了close方法的时候，把连接放入连接池
 *				c).当调用Connection类(目标对象)中的方法时,让其去执行原本的方法
 *	3.获取连接
 *	4.释放连接
 */
public class _2_MyPool_better {
	private int init_count = 3; //初始化连接数目
	private int max_count = 6; //最大连接数
	private int current_count = 0; //记录当前使用连接数
	// 连接池 （存放所有的初始化连接）
	private LinkedList<Connection> pool = new LinkedList<Connection>();
	/*1.构造函数中，初始化连接放入连接池*/
	public _2_MyPool_better() {
		for (int i = 0; i < init_count; i++) {
			current_count++;//记录当前连接数目
			Connection con = createConnection();//创建原始的连接对象
			pool.addLast(con);//把连接加入连接池
		}
	}

	/*2.创建一个新的连接的方法*/
	private Connection createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final Connection con = DriverManager.getConnection(""
					+ "jdbc:mysql:///jdbc_demo", "root", "root");// 原始的目标对象
			/*****************con动态代理**********************/
			Connection proxy = (Connection) Proxy.newProxyInstance(
					/*1).创建当前使用的类加载器*/
					con.getClass().getClassLoader(), //输入Connection的类加载器
					/*2).创建目标对象接口*/
					// con.getClass().getInterfaces(),//当目标对象是类时,需要获取该对象类的所有实现的接口
					new Class[] { Connection.class },//当目标对象是接口时,则需要这种写法获取该对象类的所有实现的接口(Connection是一个接口)
					/*3).创建事件处理器,当直线上面目标对象接口中的方法时,会自动触发处理器内代码*/
					new InvocationHandler() {
						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							Object result = null;// 方法返回值
							/*a).先获取当前执行的方法的方法名*/
							String methodName = method.getName();
							/*b).判断当执行了close方法的时候，把连接放入连接池*/
							if ("close".equals(methodName)) {
								pool.addLast(con);//连接放入连接池,并不需要执行close()原本的方法
							} else {
								/*c).当调用Connection类(目标对象)中的方法时,让其去执行原本的方法*/
								result = method.invoke(con, args);
							}
							return result;
						}
					});
			
			return proxy;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/*3.获取连接*/
	public Connection getConnection() {
		/*1).判断连接池中是否有连接, 如果有连接，就直接从连接池取出*/
		if (pool.size() > 0) {
			return pool.removeFirst();
		}
		/*2). 连接池中没有连接： 判断，如果没有达到最大连接数，创建；*/
		if (current_count < max_count) {
			current_count++;//记录当前使用的连接数
			return createConnection();//创建连接
		}
		/*3). 如果当前已经达到最大连接数，抛出异常*/
		throw new RuntimeException("当前连接已经达到最大连接数目 ！");
	}

	/*4.释放连接*/
	public void realeaseConnection(Connection con) {
		/*1).判断： 池的数目如果小于初始化连接，就放入池中*/
		if (pool.size() < init_count) {
			pool.addLast(con);
		} else {
			try {
				/*2).关闭*/
				current_count--;
				con.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String[] args) throws SQLException {
		_2_MyPool_better pool = new _2_MyPool_better();
		System.out.println("当前连接: " + pool.current_count); // 3

		// 使用连接
		pool.getConnection();
		pool.getConnection();
		Connection con4 = pool.getConnection();
		Connection con3 = pool.getConnection();
		Connection con2 = pool.getConnection();
		Connection con1 = pool.getConnection();

		// 释放连接, 连接放回连接池
		// pool.realeaseConnection(con1);
		/*
		 * 希望：当关闭连接的时候，要把连接放入连接池！【当调用Connection接口的close方法时候，希望触发pool.addLast(con
		 * );操作】 把连接放入连接池 解决1：实现Connection接口，重写close方法 解决2：动态代理
		 */
		con1.close();

		// 再获取
		pool.getConnection();

		System.out.println("连接池：" + pool.pool.size()); // 0
		System.out.println("当前连接: " + pool.current_count); // 3
	}
}
