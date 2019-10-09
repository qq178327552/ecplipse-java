package _a18_设计模式._2_工厂创建者设计模式._2_工厂方法;

/**
 * 工厂方法
 * 	每个实例化对象对应一个工厂,
 * 	调用者根据不同的工厂获取实例化对象
 * 	工厂方法完全满足设计模式的要求,但维护麻烦
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		Bean_ICar c1 = new Factory_Car1Impl().createCar();
		Bean_ICar c2 = new Factory_Car2Impl().createCar();
		
		c1.run();
		c2.run();
	}
}
