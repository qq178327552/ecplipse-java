package _a18_设计模式._2_工厂创建者设计模式;
/**
 * 工厂模式
 * 	为调用者方便调用,把实例化的对象在工厂中完成
 * 	调用者只需向通常提供需求,然后工厂返回实例化的对象
 * @author zheng
 *
 */
public class Main {
}
/*
应用场景:
	JDK中的Calendar的getInstance()方法
	JDBC中的Connection对象获取
	Hibernate中的SessionFactory创建Session
	spring中IOC容器管理创建bean对象
	XML解析时的DocumentBuilderFactory创建解析器对象
	反射中Class对象的newInstance()
*/