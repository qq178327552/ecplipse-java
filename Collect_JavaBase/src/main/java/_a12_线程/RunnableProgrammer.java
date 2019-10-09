package _a12_线程;


/**
 * 使用Runnable创建线程
 * 1、类实现Runnable接口+从写run()方法      -->真实角色类
 * 2、s使用静态代理  启动多线程
 * 	1)、创建真实角色
 * 	2)、创建代理角色+真实角色引用
 * 	3)、调用start() 启动线程
 * @author zheng
 *
 */
public class RunnableProgrammer implements Runnable{	
	@Override
	public void run() {
		for(int i=0;i<100000000;i++){
			System.out.println("线程1");
		}
	}
}