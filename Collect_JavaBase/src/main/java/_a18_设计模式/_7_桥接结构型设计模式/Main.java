package _a18_设计模式._7_桥接结构型设计模式;
/**
 * 桥接模式
 * 	用于多层次继承结构
 * 	实例化的对象需要有两种以上的类型描述唯一确定
 * 	用多个纬度类型去实例化一个对象
 * 	所有纬度中只能至多出现一个接口,其他纬度实现通过继承实现,并在继承父类的构造器传入其他纬度的信息
 * 	调用者实例化时,实例化对象是非接口的纬度对象
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		/*实例化对象,获得的实例化纬度是非接口的纬度*/
		Type2_Energy car = new Type2_DieselImpl(new Type1_BusCarImpl());
	}
}
/*
应用场景:
*/