package _a18_设计模式._2_工厂创建者设计模式._1_简单工厂;
/**
 * 简单工厂
 * 	把各个实例化对象的创建放在工厂类中
 * 	调用者只需向工厂类提需求,可获得实例化对象
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		Bean_ICar c1 =Factory_Car.createCar("Car1");
		Bean_ICar c2 = Factory_Car.createCar("Car2");
		
		c1.run();
		c2.run();
	}
}
