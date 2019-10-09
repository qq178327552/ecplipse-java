package _5_包装;

/**
 * 测试包装类的基本用法
 * 
 * 1.包装类定义
 * 2.包装类将字符串转为包装类整型
 * 
 * @author dell
 *
 */
public class _1_包装类的基本用法 {
	public static void main(String[] args) {
		separate("1.包装类定义");
		Integer  i = new Integer(1000);
		System.out.println("输出包装类最大值:"+Integer.MAX_VALUE);
		System.out.println("将包装类以科学技术法输出:"+Integer.toHexString(i));
		
		separate("2.包装类将字符串转为包装类整型");
		Integer i2 = Integer.parseInt("234");
		System.out.println(i2.intValue());
	}
	
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
