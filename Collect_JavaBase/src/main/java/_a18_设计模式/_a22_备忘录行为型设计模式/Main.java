package _a18_设计模式._a22_备忘录行为型设计模式;
/**
 * 备忘录模式
 * 	提供保存对象内部状态的对象状态功能
 * 	对某个对象内部状态的拷贝,以便于以后将该对象恢复到原状态
 * 
 * 	源发器类(Originator):保存对象内部状态
 * 	备忘录类(Memento):存储拷贝
 * 	负责人类(CareTaker):存储备忘录
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		/*定义备忘录,并且创建源发器类*/
		CareTaker taker = new CareTaker();
		Originator emp = new Originator("张三");
		/*存储到备忘录*/
		taker.setMemento(emp.memento());
		/*改变源发器类中的值*/
		emp.setName("李四");
		/*恢复备忘录中的信息*/
		emp.recovery(taker.getMemento());
	}
}
/*
应用场景:
*/
