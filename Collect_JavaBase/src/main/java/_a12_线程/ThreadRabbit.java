package _a12_线程;
/**
 * 模拟龟兔赛跑
 * 1、创建多线程，继承Thread类    重写run(线程体)
 * 2、使用线程：创建子类对象+调用start()方法
 * 优点：
 * 1)、避免单继承的局限性，因为代理角色不需要自己创建
 * 2)、便于共享资源，
 * 3)、
 * 4)、
 * 5)、
 * 
 * @author zheng
 *
 */
public class ThreadRabbit extends Thread{
	@Override
	public void run() {
		//线程体
		for(int i=0;i<100;i++){
			System.out.println("兔子跑了"+i+"步");
		}
	}
}
