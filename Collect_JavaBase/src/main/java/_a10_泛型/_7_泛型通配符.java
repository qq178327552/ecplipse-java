package _a10_泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * ? -->通配符
		类型不确定，用于声明变量|形参上
 * 不能用在
 * 	1、创建对象
 * 	2、创建泛型类 泛型方法 泛型接口上
 * @author zheng
 */
public class _7_泛型通配符 {

	public static void main(String[] args) {
		/*用通配符声明变量,声明看左侧运行看右侧*/
		List<?> list =new ArrayList<Integer>();
		list =new ArrayList<String>();
		list =new ArrayList<Object>();		
		test(list);
	}
	/*声明在形参上面*/
	public static void test(List<?> list){}
}

