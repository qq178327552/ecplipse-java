package _1_引入;

/**
 * 测试整数类型：byte,short,int,long。以及进制之间的转换问题
 * 
 * 1.各进制定义与赋值 
 * 2.十进制的进制转换 
 * 3.数据类型定义 
 * 4.long类型变量声明
 * 
 * @author zheng
 *
 */
public class _2_整数类型 {
	public static void main(String[] args) {
		separate("1.进制定义赋值");
		int i11 = 10;
		int i12 = 010;// 八进制
		int i13 = 0xf;// 十六进制
		// byte b = 200; //超过byte范围，无法赋值
		System.out.println("十进制数定义的数：" + i11);
		System.out.println("八进制定义的数：" + i12);
		System.out.println("十六进制定义的数：" + i13);

		separate("2.进制转换");
		System.out.println("十进制转二进制：" + Integer.toBinaryString(10));//// 转为二进制
		System.out.println("十进制转八进制：" + Integer.toOctalString(10));// 转为八进制
		System.out.println("十进制转十六进制：" + Integer.toHexString(10));// 转为十六进制

		separate("3.数据类型");
		int i3 = 10;
		long g3 = 200;
		byte b3 = 100; // 如果数据的大小没有超过byte/short/char的表述范围，则可以自动转型。-128~127
		short s3 = 100; // -32768~32767

		separate("4.long类型变量声明");
		long g4 = 11123213232L;
		long g41 = 3;
		long g42 = g4 + 3; // L问题
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}