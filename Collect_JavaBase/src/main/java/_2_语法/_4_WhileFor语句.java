package _2_语法;

/**
 * while和for循环后的练习题目
 * 
 * 1.输出奇偶数之和 
 * 2.输出1000以内被5整出的数，每输出三个换行
 * 
 * @author zheng
 *
 */
public class _4_WhileFor语句 {
	public static void main(String[] args) {
		separate("1.输出奇偶数之和");
		int oddSum = 0; // 用来保存奇数的和
		int evenSum = 0; // 用来存放偶数的和
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0)
				oddSum += i;
			else
				evenSum += i;
		}
		System.out.println("奇数的和：" + oddSum);
		System.out.println("偶数的和：" + evenSum);

		separate("2.输出1000以内被5整出的数，每输出三个换行");
		for (int j = 1; j <= 1000; j++) {
			if (j % 5 == 0)
				System.out.print(j + "\t");
			if (j % (5 * 3) == 0)
				System.out.println();
		}
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
