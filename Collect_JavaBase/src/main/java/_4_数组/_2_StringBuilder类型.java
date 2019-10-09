package _4_数组;

/**
 * 测试可变字符序列。StringBuilder(线程不安全，效率高),StringBuffer(线程安全，效率低) String：不可变字符序列
 * 
 * 1.初始化StringBuilder方法 
 * 2.StringBuilder常用方法 
 * 		1)append添加方法 
 * 		2)delete区间删除方法
 * 		3)reverse整体删除方法
 * 
 * @author zheng
 *
 */
public class _2_StringBuilder类型 {
	public static void main(String[] args) {
		StringBuilderUse sb = new StringBuilderUse();
	}
}

class StringBuilderUse {
	/* 初始化StringBuilder方法 */
	public void statementStringBuilder() {
		StringBuilder sb = new StringBuilder(); // 字符数组长度初始为16
		StringBuilder sb1 = new StringBuilder(32); // 字符数组长度初始为32
		StringBuilder sb2 = new StringBuilder("abcd"); // 字符数组长度初始为32,
														// value[]={'a','b','c','d',\u0000,\u0000...}
	}

	/* StringBuilder常用方法 */
	public void stringBuilderUse() {
		StringBuilder sb = new StringBuilder();

		/* append添加方法 */
		sb.append("efg");
		sb.append(true).append(321).append("随便"); // 通过return this实现方法链
		for (int i = 0; i < 1000; i++)
			sb.append(i);

		/* delete区间删除方法 */
		sb.delete(3, 5).delete(3, 5);// 第一次删除3到5之间的数，第二次在新的字符串中继续删除3到5之间的数

		/* reverse整体删除方法 */
		sb.reverse();
	}
}
