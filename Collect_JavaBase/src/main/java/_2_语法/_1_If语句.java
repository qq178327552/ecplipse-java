package _2_语法;

/**
 * 测试if语句
 * 
 * 1.测试if语句 
 * 2.测试多选择结构
 * 
 * @author zheng
 *
 */
public class _1_If语句 {
	public static void main(String[] args) {
		double d = Math.random();
		int e = 1 + (int) (d * 6); // 产生0~6的随机数
		System.out.println(e);

		separate("1.测试if语句");
		if (e > 3) {
			System.out.println("大数！");
			System.out.println("大数！!!!");
		} else
			System.out.println("小数！");

		separate("2.测试多选择结构");
		if (e == 6)
			System.out.println("运气非常好！");
		else if (e >= 4)
			System.out.println("运气不错！");
		else if (e >= 2)
			System.out.println("运气一般吧");
		else
			System.out.println("运气不好！");
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}