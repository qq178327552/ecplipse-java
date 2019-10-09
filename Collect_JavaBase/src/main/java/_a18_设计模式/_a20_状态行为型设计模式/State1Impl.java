package _a18_设计模式._a20_状态行为型设计模式;

public class State1Impl implements IState{
	@Override
	public void handle() {
		System.out.println("红灯应该停");
	}
}
