package _1_引入;

/**
 * 测试char
 * 
 * 1.char类型定义 
 * 2.char类型加减(int强行转换) 
 * 3.循环输出26个小写字母(通过char的运算)
 * 4.java里面的字符串，是定义成：String类 
 * 5.boolean类型，用于做判断
 * 
 * @author zheng
 *
 */
public class _4_char类型 {
	public static void main(String[] args) {
		separate("1.char类型定义");
		char c11 = 'a';
		char c12 = '尚'; // java为默认通用编码unicode，char表示0-65535个字符，表示世界所有的字符
		char c13 = '\n'; // 转义字符
		System.out.print("输出字母字符：" + c11);
		System.out.print("输出中文字符：" + c12);
		System.out.print("输出转义字符：" + c13);

		separate("2.char类型加减(int强行转换)");
		char c2 = 'a';
		int i2 = c2 + 2;
		char c21 = (char) i2; // 强制转型
		System.out.println("a字符加2之后输出的字符：" + c21);

		separate("3.循环输出26个小写字母(通过char的运算)");
		for (int j = 0; j < 26; j++) {
			char temp = (char) ('a' + j);
			System.out.print("输出的字符为：" + temp);
		}

		separate("4.java里面的字符串，是定义成：String类");
		String str4 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("\n" + "打印定义好的字符串为：" + str4);

		separate("5.boolean类型，用于做判断");
		boolean b5 = false; // false
		if (b5) System.out.println("boolean值定义为真：" + "true");
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}