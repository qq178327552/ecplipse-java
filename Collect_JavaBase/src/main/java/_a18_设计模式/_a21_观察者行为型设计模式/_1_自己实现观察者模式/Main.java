package _a18_设计模式._a21_观察者行为型设计模式._1_自己实现观察者模式;

public class Main {
	public static void main(String[] args) {
		/*创建主题类(目标类)对象*/
		SubjectImpl subject = new SubjectImpl();
		/*创建观察者对象*/
		ObserverImpl obs1 = new ObserverImpl();
		ObserverImpl obs2 = new ObserverImpl();
		/*向主题类(目标类)添加观察者*/
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		/*改变主题类的状态,会自动同步各个观察者状态*/
		subject.setState(3000);
		System.out.println("########################");
		/*打印各个观察者状态*/
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
	}
}