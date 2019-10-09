package _a18_设计模式._7_桥接结构型设计模式;

public class Type1_BusCarImpl implements Type1_ICar{
	@Override
	public void run() {
		System.out.println("公交车在跑");
	}
}
