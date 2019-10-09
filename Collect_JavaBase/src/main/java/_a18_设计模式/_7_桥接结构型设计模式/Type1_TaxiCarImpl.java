package _a18_设计模式._7_桥接结构型设计模式;

public class Type1_TaxiCarImpl implements Type1_ICar{
	@Override
	public void run() {
		System.out.println("出租车在跑");
	}
}
