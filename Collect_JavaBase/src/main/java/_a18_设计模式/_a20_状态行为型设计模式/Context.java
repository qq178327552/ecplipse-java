package _a18_设计模式._a20_状态行为型设计模式;


/**
 * 上下文对象
 * 	用于维护一个状态,可以切换不同的状态
 * @author Administrator
 *
 */
public class Context {
	private IState state;
	/*切换不同状态*/
	public void setState(IState s){
		System.out.println("修改状态");
		state = s;
		state.handle();
	}
}
