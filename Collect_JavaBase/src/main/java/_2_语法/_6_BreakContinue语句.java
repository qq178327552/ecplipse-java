package _2_语法;

/**
 * 测试break和continue
 * 
 * 1.测试break退出所有循环 
 * 2.测试continue退出当前循环
 * 
 * @author zheng
 * 
 */
public class _6_BreakContinue语句 {
	public static void main(String[] args) {
		separate("1.测试break退出所有循环");
		int total = 0;
		while (true) {
			total++;
			int i = (int) Math.round(100 * Math.random());
			if (i == 88)
				break;
		}
		System.out.println("Game over, used " + total + " times.");

		separate("2.测试continue退出当前循环");
		for (int i = 100; i < 150; i++) {
			if (i % 3 == 0)
				continue;
			System.out.println("被3整出的数：" + i);
		}
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
