package _a18_设计模式._7_桥接结构型设计模式;
/**
 * 第二纬度分类
 * 	第二纬度需要子方法间继承关系,并且父类调用第一纬度类中的方法
 * @author zheng
 *
 */
public class Type2_Energy {
	protected Type1_ICar car;
	public Type2_Energy(Type1_ICar car){this.car = car;}
	void energy(){
		car.run();
	}
}
