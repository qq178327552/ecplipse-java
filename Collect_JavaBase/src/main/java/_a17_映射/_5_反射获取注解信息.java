package _a17_映射;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 通过反射获取注解信息
 * 
 * 1.获得类的所有有效注解
 * 2.获得类的指定的注解
 * 3.获得类的属性的注解
 * 
 * @author 尚学堂高淇
 */
public class _5_反射获取注解信息 {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("test._7_reflection._5_AnnotationStudent");
			/*1.获得类的所有有效注解*/
			Annotation[] annotations=clazz.getAnnotations();
			for (Annotation a : annotations) {
				System.out.println(a);
			}
			/*2.获得类的指定的注解*/
			_5_设置注解 st = (_5_设置注解) clazz.getAnnotation(_5_设置注解.class);
			System.out.println(st.value());
			/*3.获得类的属性的注解*/
			Field f = clazz.getDeclaredField("studentName");
			_5_设置注解属性 sxtField = f.getAnnotation(_5_设置注解属性.class);
			System.out.println(sxtField.columnName()+"--"+sxtField.type()+"--"+sxtField.length());
			//根据获得的表名、字段的信息，拼出DDL语句，然后，使用JDBC执行这个SQL，在数据库中生成相关的表
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}