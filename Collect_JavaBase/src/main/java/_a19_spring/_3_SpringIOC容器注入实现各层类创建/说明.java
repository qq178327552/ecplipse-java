package _a19_spring._3_SpringIOC容器注入实现各层类创建;
/**
 * SpringIOC容器注入实现
 * 		action|service|dao  各层创建   dao -> service -> action
 * 
 * 1.创建Dao层类,对数据操作
 * 2.创建service层类,对Dao层类处理调用
 * 3.创建Action层类,对service层类操作
 * 4.1).通过连接最终创建action层对象
 * 	4.1.1). 在applicationContext.xml中创建Dao层的Bean对象
 * 	4.1.2). 在applicationContext.xml中创建Service层的Bean对象,并在其子属性property配置Dao层对象id
 * 	4.1.3). 在applicationContext.xml中创建Action层的Bean对象,并在其子属性property配置Service层对象id
 * 	4.1.4). 在main()函数调用Bean时,根据applicationContext.xml中的id实例化Service层的Bean对象
 * 4.2).内部bean创建action层对象
 * 	4.2.1). 在applicationContext.xml中创建Action层的Bean对象,并在其子属性property配置Service层对象Bean
 * 	4.2.2). 在applicationContext.xml中Service层对象Bean中,也在其子属性property配置Dao层对象Bean
 * 	4.2.3). 在main()函数调用Bean时,根据applicationContext.xml中的id实例化Service层的Bean对象
 * 4.3).p名称空间通过注入创建action层对象(3.0以上版本才支持)
 * 	4.3.1). 在applicationContext.xml中创建Dao层的Bean对象
 * 	4.3.2). 在applicationContext.xml中创建Service层的Bean对象,并填充其参数  p: 的调用方法值
 * 	4.3.3). 在applicationContext.xml中创建Action层的Bean对象,并填充其参数  p: 的调用方法值
 * 	4.3.4). 在main()函数调用Bean时,根据applicationContext.xml中的id实例化Service层的Bean对象
 * @author zheng
 *
 */
public class 说明 {

}
