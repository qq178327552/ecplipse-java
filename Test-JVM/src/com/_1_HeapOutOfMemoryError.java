package com;

import java.util.ArrayList;
import java.util.List;
/**
 * 测试java堆内存溢出情况
 * 启动时使用YoungenGC：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * 堆大小20M且不自动扩展(-Xms20M -Xmx20M),出现内存溢出时Dump出当前内存快照()
 * @author zheng
 *
 */
public class _1_HeapOutOfMemoryError {
	static class OOMObject{
		
	}
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}
}
