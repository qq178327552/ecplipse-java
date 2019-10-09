package _1_引入;

/**
 * 运算符 
 * 
 * 1.取余运算 
 * 2.自增运算 
 * 3.除数为0 
 * 4.与运算第一个条件不满足时不会运行后面除数为0的错误 
 * 5.位运算 
 * 6.位移运算 
 * 7.布尔类型的位运算
 * 8.扩展运算符 
 * 9.字符串相连 
 * 10.三目运算符
 * 
 * @author zheng
 *
 */

public class _8_运算符 {
	public static void main(String[] args) {
		separate("1.取余运算");
		double d1 = 10.2 % 3;
		System.out.println("10.2对3取余的结果：" + d1);

		separate("2.自增运算");
		int i2 = 3;
		int i21 = i2++; // 执行完后,b=3。先给b赋值，再自增。
		int i22 = ++i2; // 执行完后,c=5。先自增,再给b赋值
		System.out.println("先赋值后自增的b运算：" + i21);
		System.out.println("先自增后赋值的运算：" + i22);

		separate("3.除数为0");
		// int c1 = 3/0; //除数为零编译时会报错

		separate("4.与运算第一个条件不满足时不会运行后面除数为0的错误");
		boolean b4 = 1 > 2 && 2 > (3 / 0); // 与孙算第一个错误，不会执行后面的布尔判断
		System.out.println("除数为零时编译正常：" + b4);

		separate("5.位运算");
		int i51 = 8;
		int i52 = 4;
		System.out.println("4位与8的结果：" + (i51 & i52));
		System.out.println("4位或8的结果：" + (i51 | i52));
		System.out.println("8取非的结果：" + (~i51));
		System.out.println("4位异或8的结果：" + (i51 ^ i52));

		separate("6.位移运算");
		int i61 = 3 << 2; // 相当于：3*2*2;
		int i62 = 3 >> 2;
		System.out.println("左移2与两次乘2比较结果：" + (i61 == (3 * 2 * 2)));
		System.out.println("右移2与两次除2比较结果" + (i62 == 3 / 2 / 2));

		separate("7.布尔类型的位运算");
		boolean b7 = true & false;
		System.out.println("真与假位与结果：" + b7);

		separate("8.扩展运算符");
		int i8 = 3;
		i8 += 5; // 相当于：i8=i8+5;

		separate("9.字符串相连");
		System.out.println("字符串连接后结果：" + 4 + "5");// 字符串相连：加号两边只要有一个为字符串，则变为字符串连接符，整个结果为字符串。

		separate("10.三目运算符");
		String str10 = "";
		str10 = (3 < 6) ? "a<b" : "a>=b";// 三目运算符
		System.out.println("输出的三目运算符3<6结果：" + str10);

	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}