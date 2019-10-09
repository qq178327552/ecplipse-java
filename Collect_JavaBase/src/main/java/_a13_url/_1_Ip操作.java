package _a13_url;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * InetAddress：封装ip或DNS
 * InetSocketAddress(封装端口):在InetAddress基础上+端口
 * 
 * 1.创建InetAddress对象并解析
 * 		创建本地InetAddress对象
 * 		根据域名得到InetAddress对象,无法解析会报错
 * 		根据ip得到InetAddress对象,无法解析时不报错
 * 2.创建InetSocketAddress对象并解析
 * 
 * @author zheng
 *
 */
public class _1_Ip操作 {
	public static void main(String[] args) throws UnknownHostException {
		_1_Ip操作 test = new _1_Ip操作();
	}

	/* 1.创建InetAddress对象并解析 */
	public void operateInetAddress() throws UnknownHostException {
		/*创建本地InetAddress对象 */
		InetAddress addr = InetAddress.getLocalHost();//创建本地的InetAddress对象
		System.out.println(addr.getHostAddress()); //获取InetAddress对象中的IP地址
		System.out.println(addr.getHostName()); //获取InetAddress对象中的计算机名
		/*根据域名得到InetAddress对象*/
		addr = InetAddress.getByName("www.163.com");
		System.out.println(addr.getHostAddress()); // 返回 163服务器的ip:61.135.253.15
		System.out.println(addr.getHostName()); // 输出：www.163.com，输出域名时当无法解析域名则报错
		/*根据ip得到InetAddress对象*/
		addr = InetAddress.getByName("61.135.253.15");
		System.out.println(addr.getHostAddress()); // 返回 163服务器的ip:61.135.253.15
		System.out.println(addr.getHostName()); // 输出ip而不是域名,不报错。如果这个IP地址不存在或DNS服务器不允许进行IP地址和域名的映射，getHostName方法就直接返回这个IP地址。
	}
	
	/*2.创建InetSocketAddress对象并解析*/
	public void operateInetSocketAddress() throws UnknownHostException{
		InetSocketAddress  address = new InetSocketAddress("127.0.0.1",9999);//将本地ip和9999端口号封装
		address = new InetSocketAddress(InetAddress.getByName("127.0.0.1"),9999);//将本地ip和9999端口号封装
		System.out.println(address.getHostName());//InetSocketAddress获取主机名
		System.out.println(address.getPort());//InetSocketAddress获取端口号
		InetAddress addr =address.getAddress();//InetSocketAddress获取InetAddress封装对象
	}
}
