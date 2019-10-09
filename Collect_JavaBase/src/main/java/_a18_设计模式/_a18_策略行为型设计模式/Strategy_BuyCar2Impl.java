package _a18_设计模式._a18_策略行为型设计模式;
/**
 * 策略算法实现类
 * 	打九折的策略
 * @author zheng
 *
 */
public class Strategy_BuyCar2Impl implements IStrategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打九折");
		return standardPrice*0.9;
	}

}
