package _a18_设计模式._9_装饰结构型设计模式;
/**
 * 装饰者
 * 	装饰Car普通车对象
 * @author zheng
 *
 */
public class Decorator_DecoratorCar implements Component_Icar{
	protected Component_Icar car;
	public Decorator_DecoratorCar(Component_Icar car){
		super();
		this.car = car;
	}
	@Override
	public void run() {
		car.run();
	}
}
