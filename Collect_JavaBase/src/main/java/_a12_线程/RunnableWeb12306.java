package _a12_线程;
/**
 * 方便共享资源测试
 * @author zheng
 *
 */
public class RunnableWeb12306 implements Runnable{
	private int num=50;
	@Override
	public void run() {
		while(true){
			if(num<=0){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
		}
	}
	
	
}
