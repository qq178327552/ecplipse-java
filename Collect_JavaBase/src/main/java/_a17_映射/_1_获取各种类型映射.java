package _a17_映射;

/**
 * 测试各种类型(class,interface,enum,annotation,primitive type,void)对应的java.lang.Class对象的获取方式
 * 
 * 1.将类名映射到Class(反射)类中
 * 		1).对象是表示或封装一些数据。  一个类被加载后，JVM会创建一个对应该类的Class对象，类的整个结构信息会放到对应的Class对象中。
 * 		2).这个Class(反射)对象就像一面镜子一样，通过这面镜子我可以看到对应类的全部信息。
 * 		3).一个类只对应一个Class(反射)对象
 * 2.通过.class获取Class(反射)类
 * 3.通过.getClass()方法获取String对象的Class类
 * 		相同数据类型Class类一样
 * @author zheng
 */
public class _1_获取各种类型映射 {
	public static void main(String[] args) {
		String path = "test._7_reflection._1_测试用户Bean类";
		try {
			/*1.将类名映射到Class(反射)类中*/
			Class<?> clazz = Class.forName(path);
			System.out.println(clazz.hashCode());
			Class<?> clazz2 = Class.forName(path);	//一个类只对应一个Class(反射)对象,所以与上面结果相同
			System.out.println(clazz2.hashCode());
			/*2.通过.class获取Class(反射)类*/
			Class strClazz = String.class;
			/*3.通过.getClass()方法获取String对象的Class类*/
			Class strClazz2 = path.getClass(); 
			System.out.println(strClazz==strClazz2);
			/*相同数据类型Class类一样*/
			int[] arr01 = new int[10];
			int[] arr03 = new int[30];
			int[][] arr02 = new int[30][3];
			double[] arr04 = new double[10];
			
			System.out.println(arr01.getClass().hashCode());
			System.out.println(arr02.getClass().hashCode());
			System.out.println(arr03.getClass().hashCode());
			System.out.println(arr04.getClass().hashCode());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
