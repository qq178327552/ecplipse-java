package _9_容器;

import java.util.HashMap;
import java.util.Map;

/**
 * Map的基本用法
 * 		key不可重复
 * 
 * 1.插入对象
 * 2.获取对象
 * 3.删除对象
 * 4.判断是否有值
 * 
 * @author zheng
 *
 */
public class _4_Map类 {
	public static void main(String[] args) {
		Map map = new HashMap();//HashMap效率高线程不安全，Hashtable线程安全
		/*1.插入对象*/
		map.put("高琪", new Wife("张曼玉"));
		map.put("高琪", new Wife("张小玉"));
		map.put("张三", new Wife("杨幂"));
		/*2.获取对象*/
		Wife w = (Wife) map.get("高琪");
		System.out.println(w.name);
		/*3.删除对象*/
		map.remove("高琪");
		/*4.判断是否有值*/
		map.containsKey("张三");
	}
}

class Wife {
	String name;
	public Wife(String name) {
		this.name = name;
	}
}
