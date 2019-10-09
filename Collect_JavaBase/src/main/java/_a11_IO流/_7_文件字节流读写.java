package _a11_IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件字节流读写：
 * 	字节流接口：
 * 		输入流接口:InputStream:read(byte[])、read(byte[],int,int)、close()
 * 		输出流接口:OutputStream:write(byte[])、write(byte[],int,int)、close()
 * 	文件字节流实现类类：
 * 		输入流类:FileInputStream
 * 		输出流类:FileOutputStream
 * 
 * 1.FileInputStream 文件字节流类读取文件
 * 	1).建立联系 File对象
 * 	2).选择流
 * 	3).操作 不断读取 缓冲数组
 * 	4).循环读取.当下一轮设置的byte读不到数据,接收 实际读取大小数值则为-1
 * 	5).输出 字节数组转成字符串
 * 	6).释放资源
 * 2.FileOutputStream 文件字节流类写入文件
 * 	1).建立联系 File对象 写入文件
 * 	2).选择流
 * 	3).以追加形式 写出文件 必须为true 否则为覆盖
 * 	4).字符串转字节数组
 * 	5).字节数组写入字节流中传到文件
 * 	6).强制刷新出去,防止数据在流中未写入到文件
 * 	7).释放资源 :关闭
 * @author zheng
 *
 */
public class _7_文件字节流读写 {
	public static void main(String[] args) throws IOException {
		/*1.FileInputStream 文件字节流类读取文件*/
		/*1).建立联系 File对象*/
		File src = new File("e:/xp/test/a.txt");
		/*2).选择流*/
		InputStream is = null;
		is = new FileInputStream(src);
		/*3).操作 不断读取 缓冲数组,即每次读取1024个字节*/
		byte[] car = new byte[1024];
		int len = 0; //接收 实际读取大小
		/*4).循环读取.当下一轮设置的byte读不到数据,接收 实际读取大小数值则为-1*/
		StringBuilder sb = new StringBuilder();
		while (-1 != (len = is.read(car))) {
			/*5).输出 字节数组转成字符串*/
			String info = new String(car, 0, len);
			sb.append(info);
		}
		System.out.println(sb.toString());
		/*6).释放资源*/
		if (null != is) is.close();
	
	
		/* 2.FileOutputStream 文件字节流类写入文件 */
		/* 1).建立联系 File对象 写入文件 */
		File dest = new File("e:/xp/test/test.txt");
		/* 2).选择流 */
		OutputStream os = null;
		/* 3).以追加形式 写出文件 必须为true 否则为覆盖 */
		os = new FileOutputStream(dest, true);
		/* 4).字符串转字节数组 */
		String str = "bjsxt is very good \r\n";
		byte[] data = str.getBytes();
		/* 5).字节数组写入字节流中传到文件 */
		os.write(data, 0, data.length);
		/* 6).强制刷新出去,防止数据在流中未写入到文件 */
		os.flush();
		/* 7).释放资源 :关闭 */
		if (null != os) os.close();
	}
}
