package _2_语法;

/**
 * 测试方法
 * 
 * 设计方法的原则：方法的本意是功能块，就是实现某个功能的语句块的集合。
 * 我们设计方法的时候，最好保持方法的原子性，就是一个方法只完成1个功能，这样利于我们后期的扩展。
 * 
 * 1.输出奇偶数之和方法 
 * 2.输出传入的a中，能被b整除和(b*c)整除的数 
 * 3.输出a与b之和，且a不为3
 * 
 * @author zheng
 * 
 */
public class _7_方法 {
	public static void main(String[] args) {
		test01(1000);
		test02(100, 6, 3);

		System.out.println("###########");
		int s = add(3, 5);
		System.out.println(s);
	}

	/* 输出奇偶数之和方法 */
	public static void test01(int a) {
		int oddSum = 0; // 用来保存奇数的和
		int evenSum = 0; // 用来存放偶数的和
		for (int i = 0; i <= a; i++) {
			if (i % 2 != 0)
				oddSum += i;
			else
				evenSum += i;
		}
		System.out.println("奇数的和：" + oddSum);
		System.out.println("偶数的和：" + evenSum);
	}

	/* 输出传入的a中，能被b整除和(b*c)整除的数 */
	public static void test02(int a, int b, int c) {
		for (int j = 1; j <= a; j++) {
			if (j % b == 0)
				System.out.print(j + "\t");
			if (j % (b * c) == 0)
				System.out.println();
		}
	}

	/* 输出a与b之和，且a不为3 */
	public static int add(int a, int b) {
		int sum = a + b;
		if (a == 3)
			return 0; // return 两个作用：结束方法的运行、返回值。
		System.out.println("输出");
		return sum;
	}
}
