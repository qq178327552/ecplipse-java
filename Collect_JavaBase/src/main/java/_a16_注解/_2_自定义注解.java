package _a16_注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 自定义注解
 * 		以@interface标注
 * 		添加源注解，对注解做进一步解释
 * 
 * 1.Target注解
 * 2.Retention注解
 * 3.强行在注解参数中定义值
 * 
 * @author zheng
 */
/*1.Target(value={}):描述注解适用范围,即包,类,方法,类型等等*/
/*2.Retention(value={}):表示需要在什么级别保存该注释信息(为runtime是表示可以被反射读取)*/
@Target(value={ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface _2_自定义注解 {
	/*3.强行在注解参数中定义值(加上默认值可以不定义默认)*/
	String studentName() default "";
	int age() default 0;
	int id() default -1;   //String indexOf("abc")  -1
	String[] schools() default {"清华大学","北京上学堂"};
}
