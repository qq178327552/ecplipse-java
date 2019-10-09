package _a18_设计模式._1_单例创建者设计模式;

/**
 * 枚举式实现单例模式
 * 	线程安全,调用效率较高,但不能延时加载,却可以防止反射和反序列化修改
 */
public enum _5_枚举式 {
	/*这个枚举元素,本身就是单例对象*/
	INSTANCE;
	/*添加自己需要的操作*/
	public void singletonOperation(){
	}
}
