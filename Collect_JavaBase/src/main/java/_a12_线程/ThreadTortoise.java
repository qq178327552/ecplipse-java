package _a12_线程;

public class ThreadTortoise extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println("乌龟跑了"+i+"步");
		}
	}
	
}
