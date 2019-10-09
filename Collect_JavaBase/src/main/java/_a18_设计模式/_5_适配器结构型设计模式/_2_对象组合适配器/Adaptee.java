package _a18_设计模式._5_适配器结构型设计模式._2_对象组合适配器;

/**
 * 需要类
 * 	调用者需要的调用的类
 */
public class Adaptee {
	
	public void request(){
		System.out.println("可以完成调用者请求的需要的功能");
	}
}