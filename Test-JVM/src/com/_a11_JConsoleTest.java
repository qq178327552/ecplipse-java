package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 观察JConsole图形界面的线程演示代码
 * 
 * 注：若要远程用JConsole连接，需要在远程启动设置:
 * -Dcom.sun.management.jmxremote=true 	开启JVM远程监控
 * -Djava.rmi.server.hostname=10.10.81.251 	远程进程所在主机的IP
 * -Dcom.sun.management.jmxremote.port=9012 	监控发送数据的端口
 * -Dcom.sun.management.jmxremote.ssl=false 	禁用ssl验证
 * -Dcom.sun.management.jmxremote.authenticate=false	不需要用户密码验证
 * @author zheng
 *
 */
public class _a11_JConsoleTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();//等待输入
		createBusyThread();//无限循环
		
	}
	/*无限循环进程*/
	public static void createBusyThread(){
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true);
			}
		},"testBusyThread");
		thread.start();
	}
}
