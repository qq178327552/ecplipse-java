package _a18_设计模式._7_桥接结构型设计模式;
/**
 * 第二纬度继承类
 * @author zheng
 *
 */
public class Type2_DieselImpl extends Type2_Energy{
	public Type2_DieselImpl(Type1_ICar car) {
		super(car);
	}
	@Override
	public void energy() {
		super.energy();
		System.out.println("使用柴油");
	}
}
