package _a18_设计模式._1_单例创建者设计模式;

/**
 * 静态内部类实现单例模式
 * 	这种方式：线程安全，调用效率在懒汉式中最高，并且实现了延时加载
 */
public class _4_静态内部类式 {
	/*私有化构造器*/
	private _4_静态内部类式(){}
	/*创建静态内部类,调用时自动加载*/
	private static class SingletonClassInstance {
		private static final _4_静态内部类式 instance = new _4_静态内部类式();
	}
	/*方法没有同步,调用效率高*/
	public static _4_静态内部类式  getInstance(){
		return SingletonClassInstance.instance;
	}
	
}
