package _a18_设计模式._4_原型模式创建者设计模式._1_浅克隆;

import java.util.Date;

/**
 * 浅克隆设计模式
 * 	对原型Bean继承Cloneable对象,并对外抛出克隆方法,这样可以克隆出属性一样的另一个对象
 * 	浅克隆属性若包含对象,则原型对象与克隆的对象共同指向同一个属性对象,既一旦修改了属性对象,则原型和克隆的属性都会被修改
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
		
		/*浅克隆缺点:当车对象属性的对象改变时,car1和car2属性值同时改变*/
		carDate.setTime(123L);
	}
}
