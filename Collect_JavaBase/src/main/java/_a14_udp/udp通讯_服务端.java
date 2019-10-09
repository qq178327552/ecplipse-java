package _a14_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/**
 * udp协议(DatagramSocket创建)：发送的数据不一定确认收到，即异步收发
 * 		服务端接收数据
 * 1.创建服务端 +端口
 * 2.准备接受容器
 * 3.把容器封装成包
 * 	DatagramPacket(byte[] buf, int length)
 * 4.接受数据
 * 5.获取并打印数据
 * 6.释放
 * 
 * @author zheng
 */
public class udp通讯_服务端 {
	public static void main(String[] args) throws IOException {
		/*1.创建服务端 +端口*/
		DatagramSocket server = new DatagramSocket(8888);
		/*2.准备接受容器*/
		byte[] container = new byte[1024];
		/*3.把容器封装成包 DatagramPacket(byte[] buf, int length)*/ 		
		DatagramPacket packet =new DatagramPacket(container, container.length) ;
		/*4.接受数据*/
		server.receive(packet);
		/*5.获取并打印数据*/
		byte[] data =packet.getData();
		int len =packet.getLength();
		System.out.println(new String(data,0,len));
		/*6.释放*/
		server.close();
	}
}
