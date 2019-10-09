package _a18_设计模式._a21_观察者行为型设计模式._1_自己实现观察者模式;

public class Client {
	public static void main(String[] args) {
		//目标对象
		SubjectImpl subject = new SubjectImpl();
		
		//创建多个观察者
		ObserverImpl  obs1 = new ObserverImpl();
		ObserverImpl  obs2 = new ObserverImpl();
		ObserverImpl  obs3 = new ObserverImpl();
		
		//将这三个观察者添加到subject对象的观察者队伍中
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		
		
		//改变subject的状态
		subject.setState(3000);
		System.out.println("########################");
		//我们看看，观察者的状态是不是也发生了变化
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		//改变subject的状态
		subject.setState(30);
		System.out.println("########################");
		//我们看看，观察者的状态是不是也发生了变化
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		
	}
}
