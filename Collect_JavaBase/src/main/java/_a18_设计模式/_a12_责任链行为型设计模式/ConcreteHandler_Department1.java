package _a18_设计模式._a12_责任链行为型设计模式;

public class ConcreteHandler_Department1 extends Handler_BuyCar{
	public ConcreteHandler_Department1(String department) {
		super(department);
	}

	@Override
	public void handleRequest(Bean_RequestApply request) {
		System.out.println("收到提交工单");
		this.nextHandler.handleRequest(request);
	}
}
