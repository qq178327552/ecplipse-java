package _6_日期;

import java.util.Date;

/**
 * 测试Date类的用法
 * 
 * 1.默认创建时间，返回当前long类型时间(相对于默认时间)
 * 2.设置创建时间,在默认时间上怎加毫秒数
 * 3.重新给时间设值
 * 4.时间的比较
 * 
 * @author zheng
 *
 */
public class _1_Date类 {
	public static void main(String[] args) {
		separate("1.默认创建时间，返回当前long类型时间(相对于默认时间)");
		Date d = new Date();//Date以毫秒表示时刻,没传参数表示返回当前时刻
		long t = System.currentTimeMillis();//获取当前时间(相对于初始时间1970.1.1的毫秒)，返回long类型
		System.out.println(t);
		
		separate("2.设置创建时间,在默认时间上怎加毫秒数");
		Date d2 = new Date(1000);//在默认时间上增加一秒
		System.out.println(d2.toGMTString());   //toGMTString将本地时间转为标准时间,因为过时所以不建议使用
		
		separate("3.重新给时间设值");
		d2.setTime(24324324);
		System.out.println(d2.getTime());//获取相对默认时间设置的毫秒数
		
		separate("4.时间的比较");
		System.out.println(d.getTime()<d2.getTime());
		System.out.println(d.before(d2));
		System.out.println(d.equals(d2));
	}
	
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
