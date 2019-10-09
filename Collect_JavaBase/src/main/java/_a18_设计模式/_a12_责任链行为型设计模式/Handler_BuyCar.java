package _a18_设计模式._a12_责任链行为型设计模式;

/**
 * 抽象处理者
 * 	创建买车需要的审批对象的抽象对象
 * @author zheng
 *
 */
public abstract class Handler_BuyCar {
	protected String department;
	/*指明责任链上的后继对象(也可以存放在总链表容器中,初始化时可以映射进去)*/
	protected Handler_BuyCar nextHandler; //责任链上的后继对象
	public Handler_BuyCar(String department) {
		super();
		this.department = department;
	}
	/*组织责任链对象的关系*/
	public void setNextHandler(Handler_BuyCar nextHandler) {
		this.nextHandler = nextHandler;
	}

	/*处理请求的核心的业务方法*/
	public abstract void handleRequest(Bean_RequestApply request);
}
