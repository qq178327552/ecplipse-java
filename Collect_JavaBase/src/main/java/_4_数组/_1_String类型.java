package _4_数组;

/**
 * 测试String String：不可变字符序列
 * 
 * 1.比较两个new对象的字符串变量和值比较(在堆中创建对象) 
 * 2.比较两个常量字符串地址和值比较(在方法区中创建常量) 
 * 3.提取字符串中第2个字符
 * 4.返回字符串中输入字符的位置(不存在返回-1) 
 * 5.取字符串中从输入索引位置开始往后的字符串 
 * 6.第二个字符将取代字符串中的所有出现第一个字符
 * 7.获取字符串中以特殊符号分隔的字符串数组 
 * 8.获取字符串大小(去掉首尾空格) 
 * 9.字符串数组其他用法:比较内容、获取串索引、判断开头结尾、大小写转换
 * 10.字符串与整型拼接(String为常量不能改，拼接是创建新的字符串)
 * 
 * @author zheng
 *
 */
public class _1_String类型 {
	public static void main(String[] args) {
		separate("1.比较两个new对象的字符串变量和值比较");
		String str = new String("abcd");
		String str2 = new String("abcd");
		System.out.println("new对象相同字符串的值比较:" + str2.equals(str)); // 比较内容是否相等。
		System.out.println("new对象相同字符串的地址比较:" + (str2 == str));

		separate("2.比较两个常量字符串地址和值比较");
		String str3 = "def";
		String str4 = "def";
		System.out.println("常量同字符串的值比较:" + str3.equals(str4));
		System.out.println("常量相同字符串的地址比较:" + (str3 == str4));

		separate("3.提取字符串中第2个字符");
		System.out.println(str.charAt(2));

		separate("4.返回字符串中输入字符的位置(不存在返回-1)");
		System.out.println(str3.indexOf('y'));

		separate("5.取字符串中从输入索引位置开始往后的字符串");
		String s = str3.substring(0);
		System.out.println("从索引0开始往后的字符串组合:" + s);

		separate("6.第二个字符将取代字符串中的所有出现第一个字符");
		String str5 = str3.replace('e', '*');
		System.out.println("取代后的结果:" + str5);

		separate("7.获取字符串中以特殊符号分隔的字符串数组");
		String str6 = "abcde,rrtt,cccee";
		String[] strArray = str6.split(",");
		for (int i = 0; i < strArray.length; i++)
			System.out.println("第" + i + "部分是:" + strArray[i]);

		separate("8.获取字符串大小(去掉首尾空格)");
		String str7 = "  aa  bb  ";
		String str77 = str7.trim();
		System.out.println(str77.length());

		separate("9.字符串数组其他用法:");
		System.out.println("比较两字符串内容(忽略大小写):" + "Abc".equalsIgnoreCase("abc"));
		System.out.println("从前获取最近字符串索引:" + "Abcbd".indexOf('b'));
		System.out.println("从后获取最近字符串索引:" + "Abcbd".lastIndexOf('b'));
		System.out.println("判断是否以输入的字符串开头:" + "Abcbd".startsWith("Ab"));
		System.out.println("判断是否以输入的字符串结尾:" + "Abcbd".endsWith("bd"));
		System.out.println("将字符串转为小写:" + "Abcbd".toLowerCase());
		System.out.println("将字符串转为大写:" + "Abcbd".toUpperCase());

		separate("10.字符串与整型拼接(拼接1000次共创建1002个对象:new创建算一个，常量a又是一个)");
		String gh = new String("a");
		for (int i = 0; i < 1000; i++)
			gh = gh + i;
		System.out.println("拼接后的字符串" + gh);
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
