package _a18_设计模式._9_装饰结构型设计模式;
/**
 * 装饰模式
 * 	动态为一个对象添加新的功能
 * 	相比继承将原有类添加功能,装饰器模式更加灵活,同事避免类型体系的快速膨胀
 * 	将三级继承耦合多个二级继承
 * 
 * 	抽象构件角色(Component):
 * 	具体构件角色(ConcreteComponent):
 * 	装饰角色(Decorator):
 * 	具体装饰角色(ConcreteDecorator):
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		/*先实例化具体构件角色*/
		Component_Icar car = new ConcreteComponent_CarImpl();
		car.run();
		/*实例化具体装饰角色,传入car对象,调用run()方法时会调用传入者的方法*/
		Component_Icar car1 =new ConcreteDecorator_Car1Impl(car);
		car1.run();
		Component_Icar car2 = new ConcreteDecorator_Car2Impl(car1);
		car2.run();
	}
}
/*
应用场景:
*/