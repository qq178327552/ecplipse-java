package _a18_设计模式._a11_享元结构型设计模式;
/**
 * 外部状态
 * 	将车在哪里跑的地点,单独抽出来提供给享元类
 * @author zheng
 *
 */
public class WhereRun {
	private String address;
	
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	public WhereRun(String address) {
		super();
		this.address = address;
	}
}
