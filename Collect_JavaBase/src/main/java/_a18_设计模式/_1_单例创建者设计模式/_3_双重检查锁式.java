package _a18_设计模式._1_单例创建者设计模式;

/**
 * 双重检查锁实现单例模式
 * 	优化了懒汉式的效率,但由于JVM底层内部模型,偶尔会出现问题
 */
public class _3_双重检查锁式 {
	/*私有化构造器*/
	private _3_双重检查锁式() {}
	/*懒汉式延时加载*/
	private static _3_双重检查锁式 instance = null;
	/*比懒汉式提高了效率,不必每次都同步*/
	public static _3_双重检查锁式 getInstance() {
		if (instance == null) {
			_3_双重检查锁式 sc;
			synchronized (_3_双重检查锁式.class) {
				sc = instance;
				if (sc == null) {
					synchronized (_3_双重检查锁式.class) {
						if (sc == null)
							sc = new _3_双重检查锁式();
					}
					instance = sc;
				}
			}
		}
		return instance;
	}
}
