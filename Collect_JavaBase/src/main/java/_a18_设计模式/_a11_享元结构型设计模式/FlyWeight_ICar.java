package _a18_设计模式._a11_享元结构型设计模式;
/**
 * 享元类
 * 	为享元工厂提供获取内部状态和外部状态的接口
 * @author zheng
 *
 */
public interface FlyWeight_ICar {
	void run(WhereRun address);
	String getType();
}
