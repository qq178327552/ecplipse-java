package com;

import java.io.InputStream;

/**
 * 不同类加载器对instanceof关键字运算结果的影响
 * 
 * 不同的类加载器加载同一个类,其类属于不同
 * @author zheng
 *
 */
public class _a15_ClassLoaderTest {
	public static void main(String[] args) throws Exception {
		/*重写一个自己的类加载器*/
		ClassLoader myClassLoader = new ClassLoader() {
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				try {
					String fileName = name.substring(name.lastIndexOf(".")+1)+".class";
					InputStream is = getClass().getResourceAsStream(fileName);
					if(is == null){
						return super.loadClass(name);
					}
					byte[] b = new byte[is.available()];
					is.read(b);
					return defineClass(name, b, 0, b.length);
				} catch (Exception e) {
					throw new ClassNotFoundException(name);
				}
			}
		};
		/*用自己重写创建的类加载器加载当前类*/
		Object obj = myClassLoader.loadClass("com._a15_ClassLoaderTest").newInstance();
		/*显示这个对象确实是实例化的对象*/
		System.out.println(obj.getClass());
		/*当前类(默认当前系统(启动类)的类加载器加载,由C++实现)与自己重写的类加载器加载,并不是一样的类型*/
		System.out.println(obj instanceof com._a15_ClassLoaderTest);
	}
}
