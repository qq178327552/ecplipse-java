package _a18_设计模式._a19_模板方法行为型设计模式;
/**
 * 模版方法
 * 	先定义好模版,其中不确定的部分定义为抽象类
 * @author zheng
 *
 */
public abstract class Template {
	/*具体实现类*/
	public void shop(){
		System.out.println("去商店");
	}
	/*钩子方法,具体需要选择买的车类型*/
	public abstract void chooseCar();
	public void pay(){
		System.out.println("付钱");
	}
	/*实现的过程,因为模版中实现步骤不能被子类改变,所以用final*/
	public final void process(){
		this.shop();
		this.chooseCar();
		this.pay();
	}
}
