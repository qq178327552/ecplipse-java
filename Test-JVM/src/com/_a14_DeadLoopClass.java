package com;
/**
 * 虚拟机类加载经过:加载 -> 验证-> 准备-> 解析-> 初始化
 * 
 * 初始化阶段多线程同时去初始化一个类,虚拟机会保证只有一个线程执行,其他线程阻塞等待
 * @author zheng
 *
 */
public class _a14_DeadLoopClass {
	/*多线程初始化该类,同一时间保证只有一个线程在执行,其他线程阻塞等待*/
	static{
		if(true){//不加if语句,下面有循环会编译不通过
			System.out.println(Thread.currentThread()+"init class");
			while(true);
		}
	}
	public static void main(String[] args) {
		Runnable script = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread()+"start");
				_a14_DeadLoopClass dlc = new _a14_DeadLoopClass();
				System.out.println(Thread.currentThread()+"run over");
			}
		};
		Thread thread1 = new Thread(script);
		Thread thread2 = new Thread(script);
		thread1.start();
		thread2.start();
	}
}
