package _a18_设计模式._9_装饰结构型设计模式;
/**
 * 具体构件角色
 * 	直接隶属于抽象构建者实现类
 * 	装饰者根据该具体构建者,装饰出各种扩充的新对象
 * @author zheng
 *
 */
public class ConcreteComponent_CarImpl implements Component_Icar{
	@Override
	public void run() {
		System.out.println("普通汽车跑");
	}
}
