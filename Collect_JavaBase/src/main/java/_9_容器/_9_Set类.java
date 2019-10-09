package _9_容器;

import java.util.HashSet;
import java.util.Set;
/**
 * Set的常用方法
 * 		存入的值不能相同(先equals值)的集合
 * 
 * 1.添加内容
 * 2.判断值是否存在
 * 3.删除值
 * @author zheng
 *
 */
public class _9_Set类 {

	public static void main(String[] args) {
		Set set = new HashSet();
		/*1.添加内容*/
		set.add("aaa");
		set.add("bbb");
		set.add(new String("aaa"));
		System.out.println(set.size());
		/*2.判断值是否存在*/
		System.out.println(set.contains("aaa"));
		/*3.删除值*/
		set.remove("aaa");
	}
}
