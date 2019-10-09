package _a18_设计模式._a12_责任链行为型设计模式;
/**
 * 请求申请对象
 * 	用于存放请求信息
 * @author zheng
 *
 */
public class Bean_RequestApply {
	private String name;

	public Bean_RequestApply(String name) {
		super();
		this.name = name;
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}
