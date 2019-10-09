package _6_日期;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 测试时间格式化类(抽象类)，主要用于完成字符串和时间对象的转化
 * 
 * 1.将时间对象转化为设置的格式
 * 2.将字符串转为时间
 * 
 * @author zheng
 *
 */
public class _2_DateFormat类 {
	public static void main(String[] args) {
		separate("1.将时间对象转化为设置的格式");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,属于本月的第W周");//创建简单时间格式对象，传入时间格式化字符串(格式查API,主要根据替换字符串中的英文字母)
		Date d = new Date(12321314323L);
		String str = df.format(d);   //将时间对象按照格式化字符串，转化成字符串
		System.out.println(str);
		
		separate("2.将字符串转为时间");
		String str2 = "1977-7-7";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
