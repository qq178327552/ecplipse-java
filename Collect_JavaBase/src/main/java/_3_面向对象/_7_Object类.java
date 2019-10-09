package _3_面向对象;
/**
 * 测试Object
 * 
 * 1.Object类，并打印
 * 2.再创建一个Object类，分别比较两者变量和值
 * 
 * @author zheng
 *
 */
public class _7_Object类 {
	public static void main(String[] args) {
		/*实例化Objet类，并打印*/
		Object obj = new Object();
		System.out.println("打印Object类："+obj.toString());
		
		/*再创建一个Object类，分别比较两者变量和值*/
		Object obj2 = new Object();
		System.out.println("比较两次创建后的结果:"+(obj==obj2));
		System.out.println("比较两次创建后的值:"+obj.equals(obj2));
	}
}