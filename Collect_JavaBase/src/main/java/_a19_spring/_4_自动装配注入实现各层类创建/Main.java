package _a19_spring._4_自动装配注入实现各层类创建;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/_4_auto/applicationContext.xml");
		
		separate("1.根据名称自动装配");
		Action层行为操作 refUserAction = (Action层行为操作)ac.getBean("userAction");

	}
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
