package _a10_泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * super : 泛型的下限  >= 即父类或自身
 * 1、一般用于 下限操作
 * 2、能够添加数据上面，不能添加父对象
 * 3、规则
 *  List<Fruit> -->List<? super Apple>
 *  List<Apple> -->List<? super Apple>
 *  List<? super Fruit> -->List<?super Apple>
 *  不能存放
 *  List<? super FujiApple> -->List<?super Apple>
 *  
 * @author zheng
 */
public class _9_通配符下线super {

	public static void main(String[] args) {
		/* super定义下线定义的参数传入须大于或等于自身*/
		List<_9_Apple> list1 =new ArrayList<_9_Apple>();
		test(list1);
		List<_9_通配符继承链bean> list2 =new ArrayList<_9_通配符继承链bean>();
		test(list2);
		List<Object> list3 =new ArrayList<Object>();
		test(list3);
		
		/*下线为自身传入方法*/
		List<? super _9_Apple> list4 =new ArrayList<_9_Apple>();
		test(list4);
		/*下线为其父类传入方法*/
		List<? super _9_通配符继承链bean> list5 =new ArrayList<Object>();
		test(list5);
		
		/*不能用在通配符为子类的下线*/
		List<? super FujiApple> list6 =new ArrayList<Object>();
		/*直接用通配符不能放入方法,通配符相当于extends Object,而不是super Object*/
		List<?> list7 =new ArrayList<Object>();
	}
	
	public static void test(List<? super _9_Apple> list){
		/*不能添加 super以上的对象,可以添加super定义的该类及其子类对象*/
		list.add(new _9_Apple());
		list.add(new _9_FujiApple());
		//list.add(new Fruit());
	}
}
