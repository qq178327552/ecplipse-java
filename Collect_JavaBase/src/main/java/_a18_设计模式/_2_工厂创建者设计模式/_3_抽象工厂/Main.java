package _a18_设计模式._2_工厂创建者设计模式._3_抽象工厂;
/**
 * 抽象工厂
 * 	用来生成不同产品族的全部产品
 * 	用于多个业务品种,业务分类的情况
 * 	调用者希望得到一个人的实例化,并且人创建了车和房子对象
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		/*通过人1类工厂创建,可实例化车1类和房屋2类*/
		Factory_IPeple factory = new Factory_People1Impl();
		Bean_ICar peopleCar = factory.createCar();
		Bean_IHome peopleHome = factory.createHome();
		
		peopleCar.run();
		peopleHome.live();
	}
}
