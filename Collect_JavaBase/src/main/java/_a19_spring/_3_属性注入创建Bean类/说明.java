package _a19_spring._3_属性注入创建Bean类;
/**
 * 1.先创建Bean对象类
 * 2.1). 带参构造器给属性赋值
 * 	2.1.1). 在applicationContext.xml文件配置Bean对象,并填充其参数子对象constructor的值(该值可为Bean类)
 * 	2.1.2). 在main()函数调用Bean时,根据applicationContext.xml中的id实例化Bean对象
 * 2.2). 通过set方法注入属性
 * 	2.2.1). 在applicationContext.xml文件配置Bean对象,并填充其参数子对象property的值
 * 	2.2.2). 在main()函数调用Bean时,根据applicationContext.xml中的id实例化Bean对象
 * 2.3). 通过p方法注入属性
 * 	2.3.1). 在applicationContext.xml文件配置Bean对象,并填充其参数  p: 的值
 * 	2.3.2). 在main()函数调用Bean时,根据applicationContext.xml中的id实例化Bean对象
 * @author zheng
 *
 */
public class 说明 {

}
