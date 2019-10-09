package _a16_注解;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 * 		用途:根据获得的表名、字段的信息，拼出DDL语句，然后，使用JDBC执行这个SQL，在数据库中生成相关的表
 * 
 * 1.获得类的所有有效注解
 * 2.获得类的指定的注解
 * 3.获得类的属性的注解
 * 
 * @author zheng
 */
public class _3_反射读取注解的信息 {
	
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("com.bjsxt.test.annotation.SxtStudent");
			/*1.获得类的所有有效注解*/
			Annotation[] annotations=clazz.getAnnotations();
			for (Annotation a : annotations) {
				System.out.println(a);
			}
			/*2.获得类的指定的注解*/
			_3_设置注解 st = (_3_设置注解) clazz.getAnnotation(_3_设置注解.class);
			System.out.println(st.value());
			/*3.获得类的属性的注解*/
			Field f = clazz.getDeclaredField("studentName");
			_3_设置注解属性 sxtField = f.getAnnotation(_3_设置注解属性.class);
			System.out.println(sxtField.columnName()+"--"+sxtField.type()+"--"+sxtField.length());
			//根据获得的表名、字段的信息，拼出DDL语句，然后，使用JDBC执行这个SQL，在数据库中生成相关的表
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
