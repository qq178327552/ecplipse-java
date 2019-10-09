package _a18_设计模式._2_工厂创建者设计模式._3_抽象工厂;
/**
 * 人类1工厂类,
 * 	实例化汽车1类和房子2类
 * @author zheng
 *
 */
public class Factory_People1Impl implements Factory_IPeple{
	@Override
	public Bean_ICar createCar() {
		return new Bean_Car1Impl();
	}
	@Override
	public Bean_IHome createHome() {
		return new Bean_Home2Impl();
	}
}
