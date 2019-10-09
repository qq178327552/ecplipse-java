package _a18_设计模式._1_单例创建者设计模式;

import java.lang.reflect.Constructor;

/**
 * 懒汉式单例模式(如何防止反射漏洞)
 */
public class _6_单例漏洞_反射{
	/*私有化构造器时*/
	private _6_单例漏洞_反射(){
		if(instance!=null)
			throw new RuntimeException();
	}
	private static _6_单例漏洞_反射 instance;  
	public static  synchronized _6_单例漏洞_反射  getInstance(){
		if(instance==null){
			instance = new _6_单例漏洞_反射();
		}
		return instance;
	}
	
	public static void main(String[] args) throws Exception {
		Class<_6_单例漏洞_反射> clazz = (Class<_6_单例漏洞_反射>) Class.forName("_a18_设计模式._1_单例._6_单例漏洞_反射");
		Constructor<_6_单例漏洞_反射> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
		/*反射调获取的两个对象不同(构造器不抛出异常情况下)*/
		_6_单例漏洞_反射 s1 = c.newInstance();
		_6_单例漏洞_反射 s2 = c.newInstance();
	}
}
