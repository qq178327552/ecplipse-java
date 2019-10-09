package com;
/**
 * 内存在新生代中先存放到Eden区，当满时发生回收后存放Survivor区,默认经过15次仍存活,则被晋升到老年代区
 * 可设置经过回收的次数晋升老年区
 * 
 * 启动设置:-XX:+PrintGCDetails -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 
 * -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 * 
 * @author zheng
 *
 */
public class _9_TenuringThreshold {
	
	private static final int _1MB=1024*1024;
	
	public static void main(String[] args) {
		byte[] allocation1,allocation2,allocation3;
		allocation1 = new byte[_1MB/4];
		allocation2 = new byte[4 *_1MB];
		allocation3 = new byte[4 *_1MB];
		allocation3 = null;
		allocation3 = new byte[4 *_1MB];
	}
	
}
