package _a18_设计模式._4_原型模式创建者设计模式._2_深克隆;

import java.util.Date;

/**
 * 深克隆
 * 	相比较浅克隆,深克隆不会把原型对象和克隆出的对象属性,都指向同一个对象
 * 	深克隆会把原型对象中属性包含的对象也重新创建一份(与原型对象中属性对象值相同)
 * 	在克隆原型对象是,把原型对象中属性包含的对象一并克隆
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date carDate = new Date();
		/*实例化一个car1*/
		Bean_Car car1 = new Bean_Car(carDate);
		/*克隆出另一个与car1属性相同的car2对象*/
		Bean_Car car2 =(Bean_Car) car1.clone();
		
		/*深克隆:当车对象属性的对象改变时,只有car1改变,car2的时间对象保持不变*/
		carDate.setTime(123L);
	}
}
