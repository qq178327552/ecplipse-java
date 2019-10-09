package com;

/**
 * 设置堆大小20M(不可扩展),10M给新生代，10M给老年代,新生代中Survivor区(筛选出进入老年代的对象区域,也就是经历16次MinorGC还活着的对象所在区)与Eden区是1:8
 * 先分配4个2M空间(共8M),再来一个4M空间新生代满了,发生一次新生代内存回收(对象还在使用所以基本没回收到啥东西)
 * 因为对象还在使用,所以需要把原来的对象放到Survivor区,但Survivor区只有1M空间,所以只能提前移到老年代
 * 程序结束后,4M被分到Eden区,老年代占8M
 * 
 * 运行参数:-XX:+PrintGCDetails -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8
 * @author zheng
 *
 */
public class _7_MinorGC {
	
	private static final int _1MB=1024*1024;
	
	public static void main(String[] args) {
		byte[] allocation1,allocation2,allocation3,allocation4;
		allocation1 = new byte[2*_1MB];
		allocation2 = new byte[2*_1MB];
		allocation3 = new byte[2*_1MB];
		allocation3 = new byte[2*_1MB];
		
		allocation4 = new byte[4*_1MB];
	}
}
