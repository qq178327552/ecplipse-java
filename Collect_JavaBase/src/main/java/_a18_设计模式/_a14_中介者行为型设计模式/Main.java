package _a18_设计模式._a14_中介者行为型设计模式;

/**
 * 中介者模式
 * 	当一个系统对象间的关系呈现网状结构,对象间存在大量多对多关系,导致关系复杂,称为"同事对象"
 * 	对于"同事对象"问题,可以引入一个中介者对象,使各个同事对象只跟中介者对象打交道,把网络结构化简为星型结构
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		IMediator mediator = new MediatorImpl();
		CarImpl car =new CarImpl(mediator);
		WheelImpl wheel = new WheelImpl(mediator);
		
		car.outAction();
	}
}
/*
应用场景:
*/