package _a18_设计模式._a11_享元结构型设计模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元类工厂
 * 	引入缓冲池,从调用者角度看来是根据传入的地点获取新的汽车对象,但对于相同类型的汽车,是从享元池取出
 * 	对于汽车类型相同的对象,在缓冲池中得到对象,从享元池中直接取出返回给调用者
 * @author zheng
 *
 */
public class FlyWeightFactory_Car {
	/*享元池*/
	public static Map<String,FlyWeight_ICar> carPool =new HashMap<String,FlyWeight_ICar>();
	/*根据传入的内部状态,获取新的车对象(从享元池获取或者从新创建)*/
	public static FlyWeight_ICar getCar(String type){
		if(carPool.get(type)!=null){
			return carPool.get(type);
		}else{
			FlyWeight_ICar car = new FlyWeight_ConcreteCarImpl(type);
			carPool.put(type, car);
			return car;
		}
	}
	
}
