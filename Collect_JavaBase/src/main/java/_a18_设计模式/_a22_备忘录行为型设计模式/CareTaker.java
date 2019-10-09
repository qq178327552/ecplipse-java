package _a18_设计模式._a22_备忘录行为型设计模式;

/**
 * 璐熻矗浜虹被
 * 璐熻矗绠＄悊澶囧繕褰曞璞?
 * @author Administrator
 *
 */
/**
 * 负责人类
 * 	负责管理备忘录对象
 * @author zheng
 *
 */
public class CareTaker {
	/*用于存放备忘录对象,也可为list列表存放*/
	private Memento memento;
	public Memento getMemento() {return memento;}
	public void setMemento(Memento memento) {this.memento = memento;}
}
