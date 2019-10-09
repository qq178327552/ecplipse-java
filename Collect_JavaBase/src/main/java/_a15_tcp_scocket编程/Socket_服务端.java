package _a15_tcp_scocket编程;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * tcp协议(Socket创建):
 * 		服务器发送数据(必须先启动服务器 后连接)
 * 
 * 1.创建服务器
 * 		ServerSocket(int port)
 * 2.阻塞式接收客户端连接
 * 3.发送给客户端数据数据
 * 
 * @author zheng
 */
public class Socket_服务端 {
	public static void main(String[] args) throws IOException {
		/*1.创建服务器  指定端口   ServerSocket(int port)*/ 
		ServerSocket server = new ServerSocket(8888);
		/*2.阻塞式接收客户端连接   阻塞式(只有接收到客户端请求才会往下执行,否则一直停留在Socket对象中)*/
		Socket socket =server.accept();
		System.out.println("一个客户端建立连接");
		/*3.发送给客户端数据数据*/
		String msg ="欢迎使用";
		//输出流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write(msg);
		bw.newLine();//发送一个行行结束符
		bw.flush();
		//3、用DataOutputStream发送给客户端数据数据
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
		
	}

}
