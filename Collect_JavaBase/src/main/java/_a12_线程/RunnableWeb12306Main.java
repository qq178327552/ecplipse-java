package _a12_线程;

public class RunnableWeb12306Main {
	public static void main(String[] args) {
		//真是角色
		RunnableWeb12306 web=new RunnableWeb12306();
		//代理角色
		Thread people1=new Thread(web,"抢票人1");
		Thread people2=new Thread(web,"抢票人2");
		Thread people3=new Thread(web,"抢票人3");
		//开始启动线程
		people1.start();
		people2.start();
		people3.start();
	}
}
