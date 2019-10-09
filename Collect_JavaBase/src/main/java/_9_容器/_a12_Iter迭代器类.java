package _9_容器;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/**
 * iter迭代器
 * 		1.List迭代器
 * 		2.Set迭代器
 * 
 * @author zheng
 *
 */
public class _a12_Iter迭代器类 {
	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		separate("1.List迭代器");
		/*1.通过迭代器遍历List*/
		for(Iterator iter = list.iterator();iter.hasNext();){//先判断是否有下一个元素
			String str = (String) iter.next();//先返回指针当前数值，然后下移一位
			System.out.println(str);
			iter.remove();//删除当前游标上一个的元素(不能连续调两次)
		}
		
		Set<String> set = new HashSet<String>();
		set.add("高1");
		set.add("高2");
		set.add("高3");
		separate("2.Set迭代器");
		/*通过迭代器遍历Set*/
		for(Iterator iter = set.iterator();iter.hasNext();){
			String str = (String) iter.next();
			System.out.println(str);
			iter.remove();
		}
	}
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}

}
