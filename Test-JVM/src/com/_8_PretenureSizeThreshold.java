package com;
/**
 * 设置大对象不经过新生代而直接进入老年代
 * 主要因为过大对象会出发内存回收,所以将他直接放入老年代
 * 
 * 启动设置:-XX:+PrintGCDetails -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 
 * -XX:PretenureSizeThreshold=3145728
 * 
 * 注:此设置直接把大于3M的对象放入老年代
 * @author zheng
 *
 */
public class _8_PretenureSizeThreshold {
	
	private static final int _1MB=1024*1024;
	
	public static void main(String[] args) {
		byte[] allocation;
		allocation=new byte[4*_1MB];
	}
}
