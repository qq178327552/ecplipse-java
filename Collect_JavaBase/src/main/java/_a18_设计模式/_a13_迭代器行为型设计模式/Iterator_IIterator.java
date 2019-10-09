package _a18_设计模式._a13_迭代器行为型设计模式;
/**
 * 自定义的迭代器接口
 * @author zheng
 */
public interface Iterator_IIterator {
	void first();	//将游标指向第一个元素
	void next();	//将游标指向下一个元素
	boolean hasNext();//判断是否存在下一个元素
	boolean isFirst();
	boolean isLast();
	Object getCurrentObj();  //获取当前游标指向的对象
}
