package _6_日期;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期类,提供世家大部分国家标准日历系统
 * 
 * 1.日期设置,未设置的部分默认当前时刻
 * 2.获取时间对象的各个属性
 * 3.日期计算
 * 
 * @author zheng
 *
 */
public class _3_Calendar类 {
	public static void main(String[] args) {
		Calendar  c = new GregorianCalendar();//调用构造器创建日期类对象
		separate("1.日期设置,未设置的部分默认当前时刻");
		c.set(2001, Calendar.FEBRUARY, 10, 12, 23, 34);//给日期对象设值：年月日时分秒
		c.set(Calendar.YEAR, 2001);
		c.set(Calendar.MONTH, 1);   //二月
		c.set(Calendar.DATE, 10);
		c.setTime(new Date());
		
		separate("2.获取时间对象的各个属性");
		Date d = c.getTime();//将设置的值转化为Date
		System.out.println(d);
		System.out.println(c.get(Calendar.YEAR));//获得时间对象的年份
		
		separate("3.日期计算");
		c.add(Calendar.MONTH, -30);//增加月数
		System.out.println(c);
	}
	
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
