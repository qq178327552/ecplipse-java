package _a18_设计模式._a13_迭代器行为型设计模式;
/**
 * 迭代器模式(游标模式)
 * 	提供可以遍历聚合对象的方式
 * 	迭代器实现放在聚合类的内部类中，方便直接使用聚合类里面存储的数据
 * 	迭代器接口，一般专门为某一个聚合类服务
 * 
 * 	聚合对象:存储数据
 * 	迭代器:遍历数据
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		Aggregate_ConcreteAggregate cma = new Aggregate_ConcreteAggregate();
		cma.addObject("aa");
		cma.addObject("bb");
		cma.addObject("cc");
		
		Iterator_IIterator iter = cma.createIterator();
		while(iter.hasNext()){
			System.out.println(iter.getCurrentObj());
			iter.next();
		}
	}
}
/*
应用场景:
*/