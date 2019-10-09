package com;

/**
 * 虚拟机类加载经过:加载 -> 验证-> 准备-> 解析-> 初始化
 * 本例在解析阶段,解析阶段一个实现class类时,所继承的父类和接口不能同一个变量
 * 
 * @author zheng
 *
 */
public class _a12_FieldResolution {
	interface Interface0{
		int A=0;
	}
	interface Interface1 extends Interface0{
		int A=1;
	}
	interface Interface2{
		int A=2;
	}
	
	static class Parent implements Interface1{
		public static int A = 3;
	}
	/*初始化该方法时先找接口,后找父类,但同一个变量不能同时在接口和父类上*/
	static class Sub extends Parent implements Interface2{
		/**
		 * 若注掉下面这句,则调用Sub.A 时编译就会报错,
		 * */
//		public static int A = 4;
	}
	
	public static void main(String[] args) {
//		System.out.println(Sub.A);
	}
}
