package _a16_注解;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 测试内置注解用法
 * 
 * 1.重写注解
 * 2.废弃注解
 * 3.压制注解:其中参数选项可选择压制的类型
 * 
 * @author zheng
 *
 */

public class _1_内置注解用法 {
	/*1.重写注解*/
	@Override
	public String toString(){
		return "";
	}
	/*2.废弃注解*/
	@Deprecated
	public static void test001(){
		System.out.println("test001");
	}
	/*3.压制注解*/
	@SuppressWarnings("all")
	public static void test002(){
		List list = new ArrayList();
		List list2 = new ArrayList();
		
	}
	public static void main(String[] args) {
		Date d = new Date();
		test001();
	}
	
	
}



