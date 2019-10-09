package com;
/**
 * 局部变量表中最小单位是slot,slot可以被复用
 * 启动设置:-verbose:gc
 * @author zheng
 *
 */
public class _a16_SlotReuse {
	public static void main1(String[] args) {
		byte[] placeholder = new byte[64 * 1024 *1924];
		System.gc();//第一次回收时没回收placeholder占用的内存,因为placeholder还在作用域内
	}
	public static void main2(String[] args) {
		{
			byte[] placeholder2 = new byte[64 * 1024 *1924];
		}
		System.gc();//第二次placeholder2没在作用域内,但还是没有被回收,因为在之后没有任何局部变量表操作,没被复用情况下作为GC Root一部分的局部变量表仍保持关联
	}
	public static void main3(String[] args) {
		{
			byte[] placeholder3 = new byte[64 * 1024 *1924];
		}
		int a = 0;
		System.gc();//第三次局部变量表被复用,所以回收了
	}
}
