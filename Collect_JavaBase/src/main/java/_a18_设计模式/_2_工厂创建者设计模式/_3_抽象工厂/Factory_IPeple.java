package _a18_设计模式._2_工厂创建者设计模式._3_抽象工厂;

/**
 * 创建人类工厂,可以同时具有汽车和房屋中的方法
 * @author zheng
 *
 */
public interface Factory_IPeple {
	Bean_ICar createCar();
	Bean_IHome createHome();
}
