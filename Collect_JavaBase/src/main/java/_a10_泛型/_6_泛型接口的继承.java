package _a10_泛型;
/**
 * 泛型接口  与 泛型类  同理
 * @author zheng
 *
 */
public interface _6_泛型接口的继承<T> {
	//全局常量
	public static final int MAX_VALUE=100;
	//公共抽象方法
	public abstract void test(T t);
}
class InterC3<T,A> implements _6_泛型接口的继承<T>{
	@Override
	public void test(T t) {}
}
class InterC2<A> implements _6_泛型接口的继承<Integer>{
	@Override
	public void test(Integer t) {}
}
class InterC1<A> implements _6_泛型接口的继承{
	@Override
	public void test(Object t) {}
}