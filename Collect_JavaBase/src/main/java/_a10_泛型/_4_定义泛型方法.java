package _a10_泛型;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * 非泛型类中 定义泛型方法
 * 定义: 在返回类型前面 <字母>
 * 		1.定义泛型方法
 * 		2.定义泛型类型并限定
 * 		3.用可变参数释放资源
 * @author zheng
 */
public class _4_定义泛型方法 {
	/*1.定义泛型方法*/
	public static <T> void test(T t){
		System.out.println(t);
	}
	/*2.定义泛型类型——泛型只能用List或List的子类*/
	public static <T extends List> void test(T t){
		System.out.println(t);
		t.add("aaa");
	}
	
	/*3.用可变参数释放资源,定义泛型只能用于Closeable中(...代表可变数组)*/
	public static <T extends Closeable> void test(T... a){
		for(T temp:a){
			try {
			   if(null!=temp){  
				   temp.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
