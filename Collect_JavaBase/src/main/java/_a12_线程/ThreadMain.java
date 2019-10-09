package _a12_线程;

public class ThreadMain {
	public static void main(String[] args) {
		ThreadRabbit rab=new ThreadRabbit();
		rab.start();//并不是调用run方法
		ThreadTortoise tor=new ThreadTortoise();
		tor.start();
	}
}
