package _a18_设计模式._a18_策略行为型设计模式;

/**
 * 上下文对象
 * 	负责和具体的策略类交互
 * 	这样的话，具体的算法和直接的客户端调用分离了，使得算法可以独立于客户端独立的变化。
 * @author zheng
 *
 */
public class Context {
	/*当前采用的算法对象*/
	private IStrategy strategy;
	public Context(IStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	public void pringPrice(double s){
		System.out.println("当前价格"+strategy.getPrice(s));
	}
}
