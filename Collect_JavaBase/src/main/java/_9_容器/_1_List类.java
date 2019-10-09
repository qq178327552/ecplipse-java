package _9_容器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * List中的基本方法
 * 		ArrayList:底层实现时数组,线程不安全，效率高。所以，查询快。修改、插入、删除慢。
 * 		LinkedList:底层实现是链表,线程不安全，效率高。所以，查询慢。修改、插入、删除快。
 * 		Vector:线程安全的，效率低。
 * 
 * 1.List对象可装入Object的任意对象
 * 2.插入到List集合
 * 3.获取List中对象
 * 4.删除对象
 * 
 * @author zheng
 *
 */
public class _1_List类 {
	public static void main(String[] args) {
		List list = new ArrayList();//创建数组列表
		/*1.List对象可装入Object的任意对象*/
		list.add("aaa");
		list.add("aaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);  //包装类的：自动装箱！
		/*2.插入到List集合*/
		list.set(0, "aaa");
		/*3.获取List中对象*/
		String str = (String)list.get(0);//获取第1个对象,为"aaa"
		System.out.println(str);
		/*4.删除对象*/
		list.remove(0);//删除第0个索引
		list.remove("aaa");//删除其中"aaa"的对象
		list.remove(new Dog());//无法删除Dog对象，因为new出来的对象hashcode不同
		list.remove(new String("aaa"));//无法删除"aaa"对象，因为new出的对象hashcode不同,底层用的equals判断
 	}
}
class Dog {}