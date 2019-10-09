package _a18_设计模式._a12_责任链行为型设计模式;

public class ConcreteHandler_Department2 extends Handler_BuyCar{
	public ConcreteHandler_Department2(String department) {
		super(department);
	}

	@Override
	public void handleRequest(Bean_RequestApply request) {
		System.out.println("完成提交工单");
	}
}
