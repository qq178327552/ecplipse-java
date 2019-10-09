package _1_引入;

/**
 * 测试自动转型和强制转型
 * 
 * 1.整型自动转型，需要不超范围 
 * 2.char赋值并转为int型 
 * 3.long向float转型 
 * 4.测试不在范围的强制转型 
 * 5.运算中的类型提升问题
 * 6.基本类型转化的错误
 * 
 * @author zheng
 *
 */
public class _5_自动转型和强制转型 {

	public static void main(String[] args) {
		separate("1.整型自动转型，需要不超范围");
		byte b1 = 123;// 整型赋值给byte,没超范围就行
		// byte b2 = 300;//byte在-125~126之间，所以超过范围，编译时报错
		// char c = -3;//char在0~65535之间，负数报错

		separate("2.char赋值并转为int型");
		char c2 = 'a';
		int i2 = c2;

		separate("3.long向float转型");
		long g3 = 123213;
		float f3 = g3;// long八字节，float四字节，但float表述范围比long长所以能转型，但可能丢精度

		separate("4.测试不在范围的强制转型");
		int i4 = -100;
		char c4 = (char) i4; // -100超过char的表数范围，所以转换成完全不同的值，无意义的值！
		System.out.println("强转为无意义的值：" + c4);

		separate("5.运算中的类型提升问题");
		int i5 = 3;
		long g5 = 4;
		double d5 = 5.3;
		int r5 = (int) (i5 + g5); // 做所有的二元运算符(+-/*%)，都会有类型提升的问题,要正常编译需要把提升到long类型的r5强转为int型
		float f = (float) (i5 + d5);// 运算完后提升到double类型，所以需要强制向float类型转化

		separate("6.基本类型转化的错误");
		int money = 1000000000;
		int years = 20;
		long total = (long) (money * years); // 返回结果的是负数，因为计算后结果超出int范围，将超出int范围的结果强壮为long仍是超范围的数
		System.out.println("即使转成long结果仍超出范围：" + total);
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}