package _a18_设计模式._5_适配器结构型设计模式._2_对象组合适配器;

/**
 * 对象组合适配器设计模式
 * 	对象组合适配器模式
 * 	
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		target.handleReq();
	}
}
