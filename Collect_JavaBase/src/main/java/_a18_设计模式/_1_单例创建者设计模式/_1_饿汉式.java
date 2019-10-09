package _a18_设计模式._1_单例创建者设计模式;

/**
 * 饿汉式单例模式
 * 	线程安全,调用效率在单例类中最高,不能延时加载
 */
public class _1_饿汉式 {
	/* 私有化构造器 */
	private _1_饿汉式() {}
	/* 类初始化时,立即加载这个对象(没有延时加载的优势).加载类时,天然的是线程安全的 */
	private static _1_饿汉式 instance = new _1_饿汉式();
	/* 方法没有同步,调用效率高 */
	public static _1_饿汉式 getInstance() {
		return instance;
	}

}
