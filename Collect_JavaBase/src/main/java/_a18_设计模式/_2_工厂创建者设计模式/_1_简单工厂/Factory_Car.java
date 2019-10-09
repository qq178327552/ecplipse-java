package _a18_设计模式._2_工厂创建者设计模式._1_简单工厂;

/**
 * 简单工厂
 * 	调用者不需要自己创建车,只需要对工厂提需求
 */
public class Factory_Car {
	/*方式一:调用者向工厂提供需求方式获得不同车实例化对象*/
	public static  Bean_ICar createCar(String type){
		if("Car1".equals(type)){
			return new Bean_Car1Impl();
		}else if("Car2".equals(type)){
			return new Bean_Car2Impl();
		}else{
			return null;
		}
	}
	/*方式二：调用者根据工厂的方法获得不同车实例化对象*/
	public static  Bean_ICar createCar1(){
		return new Bean_Car1Impl();
	}
	public static  Bean_ICar createCar2(){
		return new Bean_Car2Impl();
	}
	
}
