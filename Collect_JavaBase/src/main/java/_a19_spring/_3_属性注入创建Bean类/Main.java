package _a19_spring._3_属性注入创建Bean类;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用Spring创建对象
 * 		1.通过构造函数给对象赋值
 * 		2.通过set方法注入属性,spring识别的是set后的字符,且小写
 * 		3.p 方法通过set注入值
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/_3_assignBean_1_setProp/applicationContext.xml");
		separate("1.通过构造函数给对象赋值");
		Bean类 constructorUser = (Bean类)ac.getBean("constructorUser");
		
		
		
		separate("2.通过set方法注入属性");
		Bean类 setUser = (Bean类)ac.getBean("setUser");
		System.out.println(setUser);
		separate("3.p 方法通过set注入值");
		Bean类 p_setUser = (Bean类)ac.getBean("p_setUser");
		
	}
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
