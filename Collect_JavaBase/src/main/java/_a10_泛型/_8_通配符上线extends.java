package _a10_泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符extends : 泛型的上限  <= 即子类或自身
 * 1、一般用于 限制操作
 * 2、不能使用在 添加数据上面，一般都是读取操作
 * 3、规则
 *  List<Fruit> -->List<? extends Fruit>
 *  List<Apple> -->List<? extends Fruit>
 *  List<? extends Apple> -->List<? extends Fruit>
 *  不能存放
 *  List<?>
 *  List<? extends Object>
 * @author zheng
 */
public class _8_通配符上线extends {

	public static void main(String[] args) {
		/*实例化Test类，其有上线限制所以只能传入Father或其子类*/
		TestClass<_8_通配符继承链bean> t1 =new TestClass<_8_通配符继承链bean>();
		TestClass<Apple> t2 =new TestClass<Apple>();
		TestClass<Pear> t3 =new TestClass<Pear>();
		
		/*将通配符上线的Father类传入方法*/
		List<? extends _8_通配符继承链bean> list1 =new ArrayList<_8_通配符继承链bean>();
		testMethod(list1);
		/*Father类传入方法*/
		List<_8_通配符继承链bean> list2 =new ArrayList<_8_通配符继承链bean>();
		testMethod(list2);
		/*子类传入方法*/
		List<Apple> list3 =new ArrayList<Apple>();
		testMethod(list3);
		/*上线为子类传入方法*/
		List<? extends Apple> list4 =new ArrayList<FujiApple>();
		testMethod(list4);
		
		/*直接用通配符不能放入方法,因为通配符相当于上线为Object,上限值大于Father类*/
		List<?> list5=new ArrayList<Object>();
		List<? extends Object> list6=new ArrayList<Object>();
	}
	/*定义通配符的上线为Father类*/
	public static void testMethod(List<? extends _8_通配符继承链bean> list){
		/*通配符定义的形参,不能用于添加数据，但可以添加null*/
		list.add(null);
	}

	/*定义泛型类,且上线为Father(即实例化时泛型只能为Father类或其子类)*/
	static class TestClass<T extends _8_通配符继承链bean>{
		
	}
}
