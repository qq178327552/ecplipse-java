package _a17_映射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 应用反射的API，获取类的信息(类的名字、属性、方法、构造器等)
 * 
 * 1.获取类的名字
 * 2.获取属性信息
 * 3.获取方法信息
 * 4.获得构造器信息
 * 
 * @author zheng
 */
public class _2_反射的获取类的信息 {
	public static void main(String[] args) {
		String path = "test._8_reflection._1_UserBean";
		try {
			Class clazz = Class.forName(path);
			/*1.获取类的名字*/
			System.out.println(clazz.getName());//获得类全路径：包名+类名
			System.out.println(clazz.getSimpleName());//获的类名
			/*2.获取属性信息*/
			Field[] fieldsPublic = clazz.getFields(); //只能获得public的属性信息
			Field[] fieldsAll = clazz.getDeclaredFields();//获得所有的属性信息
			Field f = clazz.getDeclaredField("uname");//通过属性名称获取该属性信息
			System.out.println(fieldsAll.length);
			System.out.println(f+"");
			for(Field temp:fieldsAll){
				System.out.println("属性："+temp);
			}
			/*3.获取方法信息*/
			Method[] methods = clazz.getDeclaredMethods();//获取所有方法信息
			Method m01 = clazz.getDeclaredMethod("getUname", null);//通过方法名称和参数获取该方法信息
			Method m02 = clazz.getDeclaredMethod("setUname", String.class);//第二个以后的参数传入形参类型的Class类
			for(Method m:methods){
				System.out.println("方法："+m);
			}
			/*4.获得构造器信息*/
			Constructor[] constructors = clazz.getDeclaredConstructors();//获取所有的构造器
			Constructor c = clazz.getDeclaredConstructor(int.class,int.class,String.class);//通过传入形参获取构造器
			System.out.println("获得构造器："+c);
			for(Constructor temp:constructors){
				System.out.println("构造器："+temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
