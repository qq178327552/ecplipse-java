package _9_容器;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试Map和List存值的比较
 * 
 * 		1.List可以存入对象值相同的元素
 * 		2.Map在存值时先equals(键)，数值相等则覆盖
 * @author zheng
 *
 */
public class _8_Map与List {

	public static void main(String[] args) {
		List list = new ArrayList();
		String s1 = new String("234");
		String s2 = "234";
		System.out.println("s1的hashCode值："+s1.hashCode());//49683
		System.out.println("s2的hashCode值："+s2.hashCode());//49683
		System.out.println("判读String是否相等："+s2.equals("234"));//true
		System.out.println("判读new出来的String是否相等："+s1.equals("234"));//true
		System.out.println("判断new出来和String是否相等(地址的比较)："+(s1==s2));//false
		list.add(s1);
		list.add(s2);
		System.out.println(list.size());
		
		Map map = new HashMap();
		//键不能重复
		map.put(s1, "AAAA");
		map.put(s2, "BBBBBB");
		System.out.println(map.get(243));
	}

}
