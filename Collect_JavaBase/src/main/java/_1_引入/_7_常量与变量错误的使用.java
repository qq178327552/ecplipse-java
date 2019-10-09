package _1_引入;

/**
 * 常量与变量错误的使用
 * 
 * 1.未赋值直接运算报错 
 * 2.常量值无法改变
 * 
 * @author zheng
 *
 */
public class _7_常量与变量错误的使用 {
	int t; // 实例变量，成员变量，属性

	public static void main(String[] args) {
		separate("1.未赋值直接运算报错");
		int i1;
		// int i11 = i1+3; //报错，a需要赋初值

		separate("2.常量值无法改变");
		final int i2 = 34;
		// i2 = 35; //报错，C的值不能改变
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}