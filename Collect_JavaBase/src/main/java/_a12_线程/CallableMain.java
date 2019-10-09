package _a12_线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用Callable创建线程
 * 优点：
 * 1、可以获取线程中的异常
 * @author zheng
 *
 */
public class CallableMain {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//借助执行调度服务ExecutorService获取Future对象
		//创建2个线程
		ExecutorService ser=Executors.newFixedThreadPool(2);
		Race tortoise=new Race();
		//获取值
		Future<Integer> result=ser.submit(tortoise);
		int num=result.get(); 
		System.out.println(num);
		//停止线程服务
		ser.shutdownNow();
	}
}
class Race implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		
		return 1000;
	}
	
}
