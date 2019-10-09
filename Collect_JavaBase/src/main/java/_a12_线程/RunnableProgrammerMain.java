package _a12_线程;

public class RunnableProgrammerMain {
	public static void main(String[] args) {
		//创建真实角色
		RunnableProgrammer pro=new RunnableProgrammer();
		//创建代理角色+真实角色引用
		Thread proxy=new Thread(pro);
		//调用start() 启动线程
		proxy.start();
		for(int i=0;i<100000000;i++){
			System.out.println("线程2");
		}
	}
}
