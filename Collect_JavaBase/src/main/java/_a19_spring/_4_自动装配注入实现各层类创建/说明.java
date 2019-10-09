package _a19_spring._4_自动装配注入实现各层类创建;
/**
 * 1.创建Dao层类,对数据操作
 * 2.创建service层类,对Dao层类处理调用
 * 3.创建Action层类,对service层类操作
 * 4.1).根据配置名称与类名相同的自动注入
 * 	4.1.1). 在applicationContext.xml中创建Dao层类对象
 * 	4.1.2). 在applicationContext.xml中创建Service层类对象,并配置自动装配为名称
 * 	4.1.3). 在applicationContext.xml中创建Action层类对象,并配置自动装配为名称
 * 	4.1.4). 在main()函数调用Bean时,根据applicationContext.xml中的id实例化Service层的Bean对象
 * 4.2).根据配置类型自动注入
 * 	4.1.1). 在applicationContext.xml中创建Dao层类对象
 * 	4.1.2). 在applicationContext.xml中创建Service层类对象,并配置自动装配为类型
 * 	4.1.3). 在applicationContext.xml中创建Action层类对象,并配置自动装配为类型
 * 	4.1.4). 在main()函数调用Bean时,根据applicationContext.xml中的id实例化Service层的Bean对象
 * @author zheng
 *
 */
public class 说明 {

}
