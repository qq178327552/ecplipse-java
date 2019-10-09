package _2_语法;

import java.util.Scanner;

/**
 * 测试Scanner类的使用，如何接收键盘的输入。
 * 
 * 1.键盘输入值并打印输入的值 
 * 2.键盘输入两个值，求和
 * 
 * @author zheng
 *
 */
public class _9_键盘输入 {
	public static void main(String[] args) {
		test02();
	}

	/* 键盘输入值并打印输入的值 */
	public static void test01() {
		Scanner s = new Scanner(System.in);// 从键盘上输入的值,以回车为结束
		String str = s.next(); // 程序运行到next会阻塞，等待键盘的输入！
		System.out.println("刚才键盘输入：" + str);
	}

	/* 键盘输入两个值，求和 */
	public static void test02() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个加数：");
		int a = s.nextInt();
		System.out.println("请输入被加数：");
		int b = s.nextInt();
		int sum = a + b;
		System.out.println("计算结果，和为：" + sum);
	}
}
