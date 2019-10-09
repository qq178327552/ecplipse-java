package _a18_设计模式._5_适配器结构型设计模式._1_类适配器;

/**
 * 适配器 (类适配器方式)
 * 	通过继承需要类,调用父类(需要类)中的方法,实现目标接口
 * 	从而将需要接口中的方法,转换为目标接口的方法实现
 * 	该做法是类适配器,但继承是单继承,不够灵活
 */
public class Adapter extends Adaptee implements Target {
	@Override
	public void handleReq() {
		super.request();
	}
	
}
