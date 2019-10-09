package _a10_泛型;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 泛型嵌套 -->由外到内拆分
 * 
 * 1.泛型嵌套
 * 2.HashMap的泛型嵌套
 * 
 * @author zheng
 */
public class _a10_泛型嵌套 {
	public static void main(String[] args) {
		_a10_嵌套的子类_Student<String> stu =new _a10_嵌套的子类_Student<String>();		
		stu.setScore("优秀");
		System.out.println(stu.getScore());
		/*1.泛型嵌套*/
		_a10_嵌套的上层类<_a10_嵌套的子类_Student<String>> bjsxt =new _a10_嵌套的上层类<_a10_嵌套的子类_Student<String>>();
		bjsxt.setStu(stu);
		/*测试:一层层拆分*/
		stu=bjsxt.getStu();
		String score =stu.getScore();
		System.out.println(score);
		/*2.HashMap的泛型嵌套 -->使用泛型嵌套*/
		Map<String,String> map =new HashMap<String,String>();
		map.put("a", "java300");
		map.put("b", "马士兵javase");
		Set<Entry<String,String>> entrySet= map.entrySet();
		/*测试*/
		for(Entry<String,String> entry:entrySet){
			String key =entry.getKey();
			String value =entry.getValue();
			System.out.println(key+"-->"+value);
		}
	}
}