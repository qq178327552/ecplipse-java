package _a18_设计模式._1_单例创建者设计模式;

/**
 * 懒汉式单例模式
 * 	线程安全,调用效率不高,但可以延时加载
 */
public class _2_懒汉式 {
	/* 私有化构造器 */
	private _2_懒汉式() {}
	/* 类初始化时,不初始化这个对象(延时加载,真正用的时候再创建) */
	private static _2_懒汉式 instance;
	/* 方法同步,调用效率低 */
	public static synchronized _2_懒汉式 getInstance() {
		if (instance == null)
			instance = new _2_懒汉式();
		return instance;
	}
}
