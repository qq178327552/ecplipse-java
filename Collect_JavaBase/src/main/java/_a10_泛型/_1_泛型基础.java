package _a10_泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的入门 <>
 * 		标签 ，泛化类型
 * 		作用: 省心  安全:会先做类型检查，并且输出不用类型转化
 * @author zheng
 *
 */
public class _1_泛型基础 {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		/*安全*/
		list.add("so easy");//定义泛型为string,所以只能放String.类型检查
		/*省心*/
		String ele =list.get(0);//拿出来时默认为字符串，不需要转化
	}
}
