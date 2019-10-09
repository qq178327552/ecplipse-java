package _a19_spring._2_构造器创建Bean对象;

// 工厂，创建对象
public class 创建Bean工厂类 {

	// 实例方法创建对象
	public Bean类 getInstance() {
		return new Bean类();
	}
	
	// 静态方法创建对象
	public static Bean类 getStaticInstance() {
		return new Bean类();
	}
}
