package _a18_设计模式._a19_模板方法行为型设计模式;

/**
 * 模版方法模式
 * 	定义了一个操作算法的骨架,将其中的某些步骤延迟到子类中实现
 * 	子类可以在不改变算法结构前提下重新定义该算法的某些特性步骤
 * 	用于处理流程中某个节点代码暂时不能确定,将不能确定部分转交给子类完成
 * 
 * 	钩子方法,将不确定的节点定义为抽象方法供子类实现,这样的方法称为钩子方法
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		/*采用匿名内部类改变钩子方法*/
		Template template1 = new Template() {
			@Override
			public void chooseCar() {
				System.out.println("奔驰车");
			}
		};
		template1.process();
		/*调用子类改变钩子方法*/
		Template template2 = new Car1Impl();
		template2.process();
	}
}
class Car1Impl extends Template {
	@Override
	public void chooseCar() {
		System.out.println("奔驰车");
	}
}
/*
应用场景:
*/