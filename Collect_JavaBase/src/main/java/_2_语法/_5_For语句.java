package _2_语法;

/**
 * 测试循环语句
 * 
 * 1.while循环语句 
 * 2.for循环语句
 * 
 * @author zheng
 *
 */
public class _5_For语句 {
	public static void main(String[] args) {
		separate("1.while循环语句");
		int a = 1; // 初始化
		while (a <= 100) { // 条件判断
			System.out.println(a); // 循环体
			a += 2; // 迭代
		}
		System.out.println("while循环结束！");

		separate("2.for循环语句");
		for (int i = 1; i <= 100; i++) // 初始化//条件判断 //迭代
			System.out.println(i); // 循环体
		System.out.println("for循环结束！");
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
