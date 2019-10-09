package _a18_设计模式._a20_状态行为型设计模式;

public class State2Impl implements IState{
	@Override
	public void handle() {
		System.out.println("绿灯应该前进");
	}
}
