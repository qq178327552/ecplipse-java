package _a18_设计模式._5_适配器结构型设计模式._2_对象组合适配器;

/**
 * 对象组合适配器
 * 	对使用了组合的方式跟被适配对象整合
 */
public class Adapter implements Target {
	/*在适配器创建时,传入需要类实例化对象,从而可以实现多个需要类的方法*/
	private Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	@Override
	public void handleReq() {
		adaptee.request();
	}
}
