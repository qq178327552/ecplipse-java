package _a14_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
/**
 * udp协议(DatagramSocket创建)：发送的数据不一定确认收到，即异步收发
 * 		客户端发送数据
 * 1.创建客户端 +端口
 * 2.准备数据
 * 3.打包（发送的地点 及端口）
 * 	DatagramPacket(byte[] buf, int length, InetAddress address, int port)
 * 4.发送
 * 5.释放
 * 
 * @author zheng
 *
 */
public class udp通讯_客户端 {
	public static void main(String[] args) throws IOException {
		/*1.创建客户端 +端口*/
		DatagramSocket client = new DatagramSocket(6666);
		/*2.准备数据*/
		String msg ="udp编程";
		byte[] data =msg.getBytes();
		/*3.打包（发送的地点 及端口） DatagramPacket(byte[] buf, int length, InetAddress address, int port)*/
		DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost",8888));
		/*4.发送资源*/
		client.send(packet);
		/*5.释放资源*/
		client.close();
	}
}
