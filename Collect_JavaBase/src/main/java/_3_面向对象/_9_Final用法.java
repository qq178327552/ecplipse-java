package _3_面向对象;

/**
 * 测试Final
 * 
 * 1.创建final类，该类不能被继承
 * 2.创建final属性，该属性为常量不能被更改
 * 3.创建final方法，该方法不能被重写
 * 
 * @author zheng
 *
 */
public class _9_Final用法 {
	public static void main(String[] args) {
		PeopleFinal p=new PeopleFinal();
	}
}

/* 创建People的final类,这个类不能被继承 */
final class PeopleFinal {
	/* 创建final修饰的属性，该属性为常量不能被修改 */
	final int MAX_VALUE = 200;

	/* 创建方法用final修饰，意味着该方法不能被子类重写 */
	public final void people() {
		System.out.println("人");
	}
}