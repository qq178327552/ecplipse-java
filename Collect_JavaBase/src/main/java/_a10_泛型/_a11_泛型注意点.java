package _a10_泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * 1、泛型没有多态
 * 2、泛型没有数组
 * 3. jdk1.7泛型简化
 * @author zheng
 *
 */
public class _a11_泛型注意点 {

	public static void main(String[] args) {
		/*1.泛型没有多态*/
		
		/*2.泛型没有数组*/
		//Fruit<String>[] arr =new Fruit<String>[10];
		
		/*3. jdk1.7泛型简化*/
		List<_8_通配符继承链bean> list2 =new ArrayList<_8_通配符继承链bean>();
	}

}
