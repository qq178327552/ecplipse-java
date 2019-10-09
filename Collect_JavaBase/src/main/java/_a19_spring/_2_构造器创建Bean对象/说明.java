package _a19_spring._2_构造器创建Bean对象;
/**
 * 1.先创建Bean对象类,其中包含无参和带参构造器
 * 2.1) 无参构造器创建Bean对象(基本创建Bean对象)
 * 	2.1.1). 在applicationContext.xml文件配置Bean对象,将id关联到Class路径
 * 	2.1.2). 在main()函数调用Bean时,根据applicationContext.xml中的id实例化Bean对象
 * 2.2) 带参构造器创建Bean对象
 * 	2.2.1). 在applicationContext.xml文件配置Bean对象,并填充其参数子对象constructor的值(该值可为Bean类)
 * 	2.1.2). 在main()函数调用Bean时,根据applicationContext.xml中的id实例化Bean对象
 * 2.3) 工厂类创建Bean对象
 * 	2.3.1). 创建工厂类,其实例化Bean对象可以为:实例化方法或者静态方法
 * 		2.3.2.1). 在applicationContext.xml文件配置先配置工厂类,并调用其中的方法去实例化Bean
 * 		2.3.2.2). 在applicationContext.xml文件配置工厂类,用其静态方法创建对象
 * 	2.3.2). 在main()函数调用Bean时,根据applicationContext.xml中的id实例化Bean对象
 * 
 * @author zheng
 *
 */
public class 说明 {

}
