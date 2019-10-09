package _a18_设计模式._6_代理结构型设计模式._2_动态代理;
/**
 * 真实角色
 * 	定义真实角色业务应该处理的流程
 * @author zheng
 *
 */
public class BuyCar implements IBuyCar{
	@Override
	public void buyCar() {
		System.out.println("真实角色买车");
	}
	@Override
	public void runCar() {
		System.out.println("真是角色开车");
	}
}
