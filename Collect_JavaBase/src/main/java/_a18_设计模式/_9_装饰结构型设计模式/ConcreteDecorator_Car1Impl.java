package _a18_设计模式._9_装饰结构型设计模式;

/**
 * 具体装饰角色
 * 	通过装饰者角色装饰后新生成的对象
 * @author zheng
 *
 */
public class ConcreteDecorator_Car1Impl extends Decorator_DecoratorCar{
	/*初始化具体装饰角色时传入装饰者生成的新对象或者具体构件对象,拥有他们的方法*/
	public ConcreteDecorator_Car1Impl(Component_Icar car) {
		super(car);
	}
	/*具体装饰者扩充的方法*/
	public void swim(){
		System.out.println("水上汽车");
	}
	
	/*实现原有方法前,先调用传入的对象方法*/
	@Override
	public void run() {
		super.run();
		swim();
	}
}
