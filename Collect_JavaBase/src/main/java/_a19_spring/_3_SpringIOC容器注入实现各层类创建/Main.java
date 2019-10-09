package _a19_spring._3_SpringIOC容器注入实现各层类创建;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 依赖注入开发-对象的创建
 * 	1.通过连接最终创建action对象
 * 	2.内部bean 方法创建userAction对象
 * 	3.p 名称空间通过set方法给对象的属性注入值(3.0以上版本才支持)
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/_3_assignBean_2_setClass/applicationContext.xml");
		
		separate("1.通过连接最终创建action对象");
		Action层行为操作 refUserAction = (Action层行为操作)ac.getBean("refUserAction");
		
		separate("2.内部bean 方法创建userAction对象");
		Action层行为操作 includeUserAction = (Action层行为操作)ac.getBean("includeUserAction");
		
		separate("3.p 名称空间通过set方法给对象的属性注入值(3.0以上版本才支持)");
//		UserAction p_UserAction = (UserAction)ac.getBean("p_UserAction");
	}
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
