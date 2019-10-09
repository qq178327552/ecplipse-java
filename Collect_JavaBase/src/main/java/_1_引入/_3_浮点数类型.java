package _1_引入;

import java.math.BigDecimal;

/**
 * 测试浮点数
 * 
 * 1.double赋值方法 
 * 2.同值产生舍入误差 
 * 3.精确大数字计算
 * 
 * @author zheng
 *
 */
public class _3_浮点数类型 {
	public static void main(String[] args) {
		separate("1.double赋值方法");
		double d11 = 3.14; // 浮点数常量默认类型是double。
		// float f = 6.28F;
		double d12 = 314e-2; // 采用科学计数法的写法
		System.out.println("打印的科学计数法至：" + d12);

		separate("2.同值产生舍入误差");
		float f2 = 0.1f; // 默认浮点型，加入f表float类型
		double d2 = 1.0 / 10;
		boolean b2 = (f2 == d2);
		if (f2 == d2)
			System.out.println("没产生误差");
		else
			System.out.println("产生误差"); // false，因为产生误差

		separate("3.精确大数字计算");
		BigDecimal b3 = new BigDecimal(128763.7);// BigDecimal用于需要进行不产生舍入误差的精确数字计算
		System.out.println("BigDecimal定义的类型：" + b3);

	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}