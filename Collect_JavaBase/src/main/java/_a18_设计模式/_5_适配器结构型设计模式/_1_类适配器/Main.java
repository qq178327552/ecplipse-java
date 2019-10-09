package _a18_设计模式._5_适配器结构型设计模式._1_类适配器;

/**
 * 类适配器设计模式
 * 	类适配器模式是适配器通过继承需要类而实现目标接口的方法,java中为单继承所以不够灵活,即一个适配器唯一对应一个需要类
 * @author zheng
 */
public class Main {
	public static void main(String[] args) {
		/*调用者创建目标接口,通过目标接口实现需要的适配器类中的方法*/
		Target target = new Adapter();
		target.handleReq();
	}
}
