package _a10_泛型;
/**
 * 泛型父类，子类为富二代 
 * 		1.保留父类泛型 -->子类为泛型
 * 			a).全部保留
 * 			b).部分保留
 * 		2.不保留父类泛型 -->子类按需实现
 * 			c).具体类型
 * 			d).没有类型(类似于Object,但不等于Object:当指定为Object类型时就不能传入其子类)
 * 方法:
 * 		1.子类重写方法的类型 -->随父类而定(与位置有关)
 * 		2.子类新增方法的类型 -->随子类而定
 * 属性:
 * 		1.子类中使用父类的属性 -->随父类而定(与位置有关)
 * 		2.子类中使用自己的属性 -->随子类而定
 * @author zheng
 */
public abstract class _5_泛型父类的继承<T1,T2> {
	T1 age;
	public abstract void test(T2 name);

}

/*保留  -->泛型子类*/
/*1.全部保留(将T1和T2完全保留)*/
class C1<T1,T2,A,B> extends _5_泛型父类的继承<T1,T2>{	
	A Sex;
	/*子类方法的类型只能为T2*/
	@Override
	public void test(T2 name) {}
	public void test2(A a){}
}
/*2.部分保留(即保留T2,须在类后写T2)*/
class C2<T2> extends _5_泛型父类的继承<Integer,T2>{
	@Override
	public void test(T2 name) {}
}
/*不保留  -->按需实现*/
/*3.具体类型*/
class C3<A,B> extends _5_泛型父类的继承<Integer,String>{
	/*子类方法的类型只能为第二个具体的类型*/
	@Override
	public void test(String name) {}
}
/*4.没有类型 擦除 (相当于Object)*/
class C4 extends _5_泛型父类的继承{
	/*子类方法的类型为Object*/
	@Override
	public void test(Object name) {}
}


