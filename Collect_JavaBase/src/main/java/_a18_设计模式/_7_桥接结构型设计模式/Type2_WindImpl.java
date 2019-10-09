package _a18_设计模式._7_桥接结构型设计模式;
/**
 * 第二纬度继承类
 * @author zheng
 *
 */
public class Type2_WindImpl extends Type2_Energy{
	public Type2_WindImpl(Type1_ICar car) {
		super(car);
	}
	@Override
	public void energy() {
		super.energy();
		System.out.println("使用风能");
	}
}
