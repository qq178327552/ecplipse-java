package com;
/**
 * 在新生代存活不一定达到预设值,提前也能进入老年代:
 * 在Survivor区若相同年龄所有对象总和大于Survivor区的一半,则大于或等于改年龄段的直接送到老年代
 * 
 * 启动设置:-XX:+PrintGCDetails -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 
 * -XX:MaxTenuringThreshold=15 -XX:+PrintTenuringDistribution
 * 
 * @author zheng
 *
 */
public class _a10_BeforeTenuringThreshold {
	
	private static final int _1MB=1024*1024;
	
	public static void main(String[] args) {
		byte[] allocation1,allocation2,allocation3,allocation4;
		allocation1 = new byte[_1MB/4];
		allocation2 = new byte[_1MB/4];
		//allocation1+allocation2已大于Survivor区的一半
		allocation3 = new byte[4 *_1MB];
		allocation4 = new byte[4 *_1MB];
		allocation4 = null;
		allocation4 = new byte[4 *_1MB];
	}

}
