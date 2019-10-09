package _a18_设计模式._2_工厂创建者设计模式._2_工厂方法;

/**
 * Car2类对应的工厂
 * @author zheng
 *
 */
public class Factory_Car2Impl implements Factory_ICar{
	@Override
	public Bean_ICar createCar() {
		return new Bean_Car2Impl();
	}
}
