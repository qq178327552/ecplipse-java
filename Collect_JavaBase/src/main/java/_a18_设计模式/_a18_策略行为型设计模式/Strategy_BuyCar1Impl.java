package _a18_设计模式._a18_策略行为型设计模式;
/**
 * 策略算法实现类
 * 	不打折的策略
 * @author zheng
 *
 */
public class Strategy_BuyCar1Impl implements IStrategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("不打折");
		return standardPrice;
	}

}
