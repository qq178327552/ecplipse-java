package _3_面向对象;
/**
 * 测试静态变量
 * 
 * 1.创建学生类，包含：普通方法、静态属性、静态方法、静态方法块
 * 2.创建静态方法块
 * 3.静态方法调用静态属性
 * 4.普通方法调用静态方法
 * 
 * 5.静态方法直接类名调用
 * 6.普通方法需先实例化后才能调用
 * 
 * @author zheng
 *
 */
public class _4_静态变量 {
	public static void main(String[] args) {
		/*静态方法直接类名调用*/
		StudentStatic.readBook();
		/*普通方法需先实例化后才能调用*/
		StudentStatic s=new StudentStatic();
		s.learn();
	}
}

class StudentStatic {
	static int book;// 定义静态属性
	String name;
	int id;
	
	/*定义静态方法->调用静态属性*/
	public static void readBook() {
		System.out.println("学生读书"+book);
	}
	
	/*定义普通方法->调用静态方法*/
	public void learn() {
		readBook();
		System.out.println(name + "在學習");
	}
	
	/*定义静态方法块，初始化类时只被执行一次*/
	static{
		System.out.println("静态方法块,可调用静态属性和方法："+book);
	}
}