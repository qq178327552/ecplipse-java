package _2_语法;

/**
 * 测试递归算法
 * 
 * 1.递归方式输出0~10的值 
 * 2.递归方式计算叠乘
 * 
 * @author zheng
 *
 */
public class _8_递归算法 {
	static int a = 0;// 定义全局变量a

	public static void main(String[] args) {
		test01();
		System.out.println(factorial(10));
	}

	/* 递归方式输出0~10的值 */
	public static void test01() {
		a++;
		System.out.println("test01:" + a);
		if (a <= 10) // 递归头，限制能跳出来
			test01();
		else // 递归体
			System.out.println("over");
	}

	/* 递归方式计算叠乘 */
	public static long factorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}
}
