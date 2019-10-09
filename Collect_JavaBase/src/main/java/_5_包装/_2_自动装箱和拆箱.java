package _5_包装;

/**
 * 测试自动装箱和拆箱
 * 
 * 1.自动装箱
 * 2.自动拆箱
 * 3.自动拆箱报错
 * 4.自动装箱同样值比较
 * 5.一定范围内装箱和拆箱并不当当成对象处理
 * 
 * @author zheng
 *
 */
public class _2_自动装箱和拆箱 {
	public static void main(String[] args) {
		separate("1.自动装箱");
		Integer a = new Integer(1000);//自动装箱
		Integer a2 = 1000;  //jdk5.0之后的自动装箱改进，不用new
		
		separate("2.自动拆箱");
		int c = new Integer(1000) ;  //自动拆箱用int接收对象,编译器改进：new Integer(1000).intValue();
		System.out.println("拆箱后结果："+c); 
		
		separate("3.自动拆箱报错");
		Integer a3=null;
		//c=a3;	//空指针报错,a3指向空然后自动拆箱赋值给整型
		
		separate("4.自动装箱同样值比较");
		Integer  d = 1234;
		Integer  d2 = 1234;
		System.out.println(d==d2);
		System.out.println(d.equals(d2));
		
		separate("5.一定范围内装箱和拆箱并不当当成对象处理");
		Integer d3 = -128;    //[-128,127]之间的数，仍然当做基本数据类型来处理。
		Integer d4 = -128;
		System.out.println(d3==d4);
		System.out.println(d3.equals(d4));
	}
	
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
