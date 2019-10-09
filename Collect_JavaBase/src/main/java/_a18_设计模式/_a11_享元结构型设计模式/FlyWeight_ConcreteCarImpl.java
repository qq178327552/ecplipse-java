package _a18_设计模式._a11_享元结构型设计模式;
/**
 * 享元实现类
 * 	其中包含了内部状态
 * 	继承了享元类的接口,实现了对外部状态的引用(不存储外部状态)
 * @author zheng
 *
 */
public class FlyWeight_ConcreteCarImpl implements FlyWeight_ICar{
	/*内部状态,根据汽车类型创建汽车对象,该类型的汽车创建后汽车不会改变,所跑的地点会变化*/
	private String type;
	public FlyWeight_ConcreteCarImpl(String type) {
		super();
		this.type = type;
	}

	@Override
	public void run(WhereRun address) {
		System.out.println("汽车品牌:"+type+"\t跑的地点:"+address.getAddress());
	}

	@Override
	public String getType() {
		return type;
	}
}
