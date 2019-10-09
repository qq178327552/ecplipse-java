package _1_引入;

/**
 * 二进制赋值
 * 
 * 1.二进制赋值到int型变量 
 * 2.数字分隔符
 * 
 * @author zheng
 *
 */
public class _6_二进制赋值 {
	public static void main(String[] args) {
		separate("1.二进制赋值到int型变量");
		int i1 = 0b0000_0000_0000_0000_0000_0000_0000_0011;// 用二进制表示int型(4字节八位)，每4位用数字分隔符分隔
		System.out.println("用二进制赋值给int型后结果为：" + i1);

		separate("2.数字分隔符赋值");
		int i2 = 1_2312_3131;// 数字分隔符
		System.out.println("数字分隔符赋值后结果为：" + i2);
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}