package _a17_映射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/**
 * 通过反射API动态的操作：构造器、方法、属性
 * 
 * 1.通过反射API调用构造方法，构造(new)对象(该类须写出无参构造方法)
 * 2.直接调用带参构造器,构造(new)对象
 * 3.通过反射API调用普通方法
 * 4.通过反射API操作所有属性
 * 
 * @author zheng
 */
public class _3_反射动态的操作类 {
	public static void main(String[] args) {
		String path = "test._8_reflection._1_UserBean";
		try {
			Class<_1_测试用户Bean类> clazz = (Class<_1_测试用户Bean类>) Class.forName(path);
			/*1.通过反射API调用构造方法，构造(new)对象(该类须写出无参构造方法)*/
			_1_测试用户Bean类 u = clazz.newInstance();//其实是调用了User的无参构造方法,该类中必须写无参构造方法
			System.out.println(u);
			/*2.直接调用带参构造器,构造(new)对象*/
			Constructor<_1_测试用户Bean类> c = clazz.getDeclaredConstructor(int.class,int.class,String.class);
			_1_测试用户Bean类 u2 = c.newInstance(1001,18,"高淇二");
			System.out.println(u2.getUname());
			/*3.通过反射API调用普通方法*/
			_1_测试用户Bean类 u3 = clazz.newInstance();
			Method method = clazz.getDeclaredMethod("setUname", String.class);
			method.invoke(u3, "高淇三");//构造u3对象,并执行其中setUname()方法  , 相当于:u3.setUname("高淇三");
			System.out.println(u3.getUname());
			/*4.通过反射API操作所有属性*/
			_1_测试用户Bean类 u4 = new _1_测试用户Bean类();
			u4.setUname("1");
//			_1_UserBean u4 = clazz.newInstance();
			Field f = clazz.getDeclaredField("uname");
			f.setAccessible(true); //私有属性先去安全后在访问设值(去安全检查也能提高效率但没有普通调用快)
//			f.set(u4, "高淇四");		//通过反射直接设置属性(先构造对象后在反射属性)
			System.out.println(u4.getUname());	//通过反射直接读属性的值
			System.out.println(f.get(u4));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}