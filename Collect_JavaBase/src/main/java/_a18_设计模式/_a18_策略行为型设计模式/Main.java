package _a18_设计模式._a18_策略行为型设计模式;

/**
 * 策略模式
 * 	解决某一问题的一个算法族,允许用户从算法族中选择一个算法解决某一问题
 * 	方便更换算法或者增加新的算法,由客户端决定调用哪个算法
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		IStrategy s1 = new Strategy_BuyCar1Impl();
		Context ctx = new Context(s1);
		
		ctx.pringPrice(998);
	}
}
/*
应用场景:
*/