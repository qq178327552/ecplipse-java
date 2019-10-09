package _a19_spring._1_基本创建Bean对象;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
/**
 * 用Spring创建对象
 * 		对象的创建时间：单例情况下,创建完IOC之后
 * 				        多例情况下,第一次调用对象时
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		separate("传统方法创建对象");
		/* 1.传统方法创建对象 */
		Bean类 user = new Bean类();
		
		separate("2.通过工厂类得到IOC容器创建的对象");
		/* 2.通过工厂类得到IOC容器创建的对象 */
		/* 用spring的IOC容器创建对象,把对象的创建交给IOC容器 */
		/*创建资源文件管理*/
		Resource resource = new ClassPathResource("test/_1_createBean/applicationContext.xml");// 加载资源文件
		/* 创建容器IOC对象(Bean的工厂), IOC容器组成： 工厂类 + applicationContext.xml */
		BeanFactory factory = new XmlBeanFactory(resource);
		/* 得到容器创建的对象 */
		Bean类 userSpring = (Bean类) factory.getBean("Bean_User");
		/* 测试获取spring创建的默认的id */
		System.out.println(userSpring.getId());
		
		separate("3.直接得到IOC容器对象");
		/* 3.直接得到IOC容器对象 */
		/*得到IOC容器对象,创建容器并加载资源文件路径*/
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/_1_createBean/applicationContext.xml");
		/*从容器中获取bean*/
		Bean类 userGetBean = (Bean类)ac.getBean("Bean_User");
		System.out.println(userGetBean);
		
		separate("调用容器中销毁方法");
		/*调用容器中销毁方法*/
		userGetBean.destroy_user();
	}
	
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
