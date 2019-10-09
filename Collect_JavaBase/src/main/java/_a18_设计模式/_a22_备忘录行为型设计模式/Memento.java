package _a18_设计模式._a22_备忘录行为型设计模式;

/**
 * 备忘录类
 * 	用于存储需要存储的对象属性
 * @author zheng
 *
 */
public class Memento {
	public Memento(Originator o) {this.name = o.getName();}
	/*存储源发器类中的名称*/
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}
