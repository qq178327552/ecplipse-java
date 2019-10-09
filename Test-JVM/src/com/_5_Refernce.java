package com;
/**
 * 测试引用计数算法的缺点
 * 若项目采用引用技术算法，则objA和objB应该不会被GC回收
 * 
 * 启动时使用(将垃圾回收日志打印到单独的一个文件中):-Xloggc:E:<FileUrl>  
 * 
 * 引用算法：给对象添加一个引用计数器,每当引用时计数器增益一,引用失效时减一,任何时刻计数器为零时对象不可再被使用
 * 
 * 注：主流的GC判断存活算法为:跟搜索算法
 * 
 * @author zheng
 *
 */
public class _5_Refernce {
	public Object instance = null;
	private static final int _1MB=1024*1024;
	
	private byte[] bigSize = new byte[2*_1MB];
	
	
	public static void main(String[] args) {
		_5_Refernce objA = new _5_Refernce();
		_5_Refernce objB = new _5_Refernce();
		
		objA.instance = objB;
		objB.instance = objA;
		objA = null;
		objB = null;
		//假设这行发生了GC,那么objA和objB实际回收了。按照引用计数算法,相互之间引用应该不回收。
		System.gc();
	}
}
