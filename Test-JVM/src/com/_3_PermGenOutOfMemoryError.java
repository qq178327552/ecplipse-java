package com;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com._1_HeapOutOfMemoryError.OOMObject;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class _3_PermGenOutOfMemoryError {
	
	/**
	 * 常量池内存溢出
	 * 启动时使用:-XX:PermSize=10M -XX:MaxPermSize=10M
	 *
	 */
	public static void main1(String[] args) {
		List<String> list = new ArrayList<String>();
		int i =0;
		while(true){
			list.add(String.valueOf(i++).intern());
		}
	}
	
	/**
	 * 方法区内存溢出
	 * 启动时使用:-XX:PermSize=10M -XX:MaxPermSize=10M
	 * 通过借助CGLib直接操作字节码运行(引入cglib-nodep-2.1_3.jar),产生大量的动态类
	 */
	public static void main(String[] args) {
		while(true){
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(OOMObject.class);
			enhancer.setUseCache(false);
			enhancer.setCallback(new MethodInterceptor() {
				@Override
				public Object intercept(Object obj, Method arg1, Object[] args, MethodProxy proxy) throws Throwable {
					return proxy.invokeSuper(obj, args);
				}
			});
			enhancer.create();
		}
	}
}

