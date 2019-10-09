package _9_容器;

import java.util.HashMap;

/**
 * 自定义自己的HashSet
 * @author Administrator
 *
 */
public class _a10_自定义HashSet {

	HashMap map;
	private static final Object PRESENT = new Object();

	public _a10_自定义HashSet(){
		map = new HashMap();
	}
	
	public int size(){
		return map.size();
	}
	
	public void add(Object o){
		map.put(o, PRESENT);   //set的不可重复就是利用了map里面键对象的不可重复！
	}
	
	public static void main(String[] args) {
		_a10_自定义HashSet s = new _a10_自定义HashSet();
		s.add("aaa");
		s.add(new String("aaa"));
		System.out.println(s.size());
	}

}
