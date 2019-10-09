package _a18_设计模式._6_代理结构型设计模式._1_静态代理;
/**
 * 抽象角色
 * 	定义事务发展的整个流程接口
 * @author zheng
 *
 */
public interface IBuyCar {
	/*抽象角色用于控制统一的处理流程*/
	void buyCar();
	void runCar();
}
