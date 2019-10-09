package _a18_设计模式._a20_状态行为型设计模式;
/**
 * 状态模式
 * 	用于不同状态,对应不同行为时
 * 	用于解决复杂对象的状态转换以及不同状态下行为封装问题
 * 
 * 	Context环境类:维护一个State对象,定义了当前状态,可以根据不同状态进行切换
 * 	State抽象状态:
 * 	ConcreteState具体状态:每一个类封装一个状态对应的行为
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		Context ctx = new Context();
		ctx.setState(new State1Impl());
	}
}
/*
应用场景:
*/