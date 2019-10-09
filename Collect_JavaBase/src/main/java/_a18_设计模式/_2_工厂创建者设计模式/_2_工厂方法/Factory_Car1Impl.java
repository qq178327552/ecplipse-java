package _a18_设计模式._2_工厂创建者设计模式._2_工厂方法;

/**
 * Car1类对应的工厂
 * @author zheng
 *
 */
public class Factory_Car1Impl implements Factory_ICar{
	@Override
	public Bean_ICar createCar() {
		return new Bean_Car1Impl();
	}
}
