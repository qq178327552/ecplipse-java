package _a18_设计模式._a22_备忘录行为型设计模式;

/**
 * 源发器类
 * @author zheng
 *
 */
public class Originator {
	public Originator(String name) {this.name = name;}
	/*源发器存储name值*/
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	/*进行备忘操作，并返回备忘录对象*/
	public Memento  memento(){
		return new Memento(this);
	}
	/*进行数据恢复，恢复成制定备忘录对象的值*/
	public void recovery(Memento mmt){
		this.name = mmt.getName();
	}
}
