package com;
/**
 * 虚拟机类加载经过:加载 -> 验证-> 准备-> 解析-> 初始化
 * 
 * 初始化阶段先执行变量赋值,后执行静态代码快中内容
 * 所有类(包括接口)只要有静态代码语句,都需要执行<clinit>()方法
 * 接口与类不同的是：接口不需要先执行父接口的<clinit>()方法,只有当父接口中定义的变量被使用时才会被初始化
 * @author zheng
 *
 */
public class _a13_ClinitOrder extends _a13_Parent{
	public static int B =A;
	public static void main(String[] args) {
		/**B是由A赋值得到,A先被初始化成1,之后执行静态代码块被赋值为2,所以此处输出为2*/
		System.out.println(_a13_ClinitOrder.B);
	}
}