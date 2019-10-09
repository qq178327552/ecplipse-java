package _a19_spring._2_构造器创建Bean对象;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用不同构造器创建对象
 * 	1.通过无参构造器创建对象
 * 	2.通过带参构造器创建对象
 * 	3.通过工厂创建对象
 * 		3.1.工厂普通方法创建对象
 * 		3.2.工厂静态方法创建对象
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/_2_createBean_constructor/applicationContext.xml");
		separate("无参构造函数创建Bean");
		Bean类 NoParaUser = (Bean类)ac.getBean("NoParaUser");
		separate("带参构造函数创建Bean");
		Bean类 ContainParaUser1 = (Bean类)ac.getBean("ContainParaUser1");
		Bean类 ContainParaUser2 = (Bean类)ac.getBean("ContainParaUser2");
		Bean类 ContainParaUser3 = (Bean类)ac.getBean("ContainParaUser3");
		separate("工厂普通方法创建对象");
		Bean类 factory_NoParaUser = (Bean类)ac.getBean("factory_NoParaUser");
		separate("工厂静态方法创建对象");
		Bean类 factoryStatic_NoParaUser = (Bean类)ac.getBean("factoryStatic_NoParaUser");
	}
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
