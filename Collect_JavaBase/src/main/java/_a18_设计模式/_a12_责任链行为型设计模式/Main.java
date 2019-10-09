package _a18_设计模式._a12_责任链行为型设计模式;
/**
 * 责任链模式
 * 	将处理同一类请求的对象连接成一条链
 * 
 * 	抽象处理者(Handler):
 * 	具体处理者(ConcreteHandler):
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		/*创建处理部门*/
		Handler_BuyCar department1= new ConcreteHandler_Department1("接收工单");
		Handler_BuyCar department2= new ConcreteHandler_Department2("完成工单");
		/*组织责任链对象的关系*/
		department1.setNextHandler(department2);
		/*开始操作流程*/
		Bean_RequestApply apply = new Bean_RequestApply("工单");
		department1.handleRequest(apply);
	}
}
/*
应用场景:
*/