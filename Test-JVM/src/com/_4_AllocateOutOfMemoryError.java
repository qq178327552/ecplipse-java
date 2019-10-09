package com;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * 本机直接内存溢出
 * 启动时使用:-Xmx20M -XX:MaxDirectMemorySize=10M
 * @author zheng
 *
 */
public class _4_AllocateOutOfMemoryError {
	private static final int _1MB =1024*1024;
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Field unsafeField = Unsafe.class.getDeclaredFields()[0];
		unsafeField.setAccessible(true);
		Unsafe unsafe = (Unsafe)unsafeField.get(null);
		while(true){
			unsafe.allocateMemory(_1MB);
		}
		
	}
}
