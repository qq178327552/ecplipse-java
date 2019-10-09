package _a15_tcp_scocket编程;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * tcp协议(Socket创建):
 * 		客户端接收数据
 * 1.创建客户端
 * 		Socket(String host, int port)
 * 2.接收服务器发来的数据
 * 3.用DataInputStream读取数据
 * 
 * @author zheng
 */
public class Socket__客户端 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		/*1.创建客户端(指定客户端发送的服务器和服务器端口),客户端端口系统自动指定,即不能同时运行   必须指定服务器+端口    此时就在连接*/
		Socket client = new Socket("localhost",8888);
		/*2.接收服务器发来的数据*/
		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));//从Socket网络流中获取数据
		String echo =br.readLine(); //阻塞式方法逐行读取，直到独到行结束符
		System.out.println(echo);
		/*3.用DataInputStream读取数据*/
		DataInputStream dis = new DataInputStream(client.getInputStream());
		echo = dis.readUTF();
		System.out.println(echo);
	}
}
