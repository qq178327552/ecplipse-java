package _a11_IO流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 节点流
 * 	字节数组节点流(数组长度有限,数据量不大)
 * 		输入字符数组节点流:ByteArrayInputStream
 * 		输出字符数组节点流:ByteArrayOutputStream
 * 
 * 	1.ByteArrayInputStream 输入字符数组节点流读取字符数组
 * 		1).建立字节数组数据源
 * 		2).选择流
 * 		3).操作 不断读取 缓冲数组,即每次读取1024个字节
 * 		4).循环读取.当下一轮设置的byte读不到数据,接收 实际读取大小数值则为-1
 * 		5).输出 字节数组转成字符串
 * 		6).释放资源(可以不用释放)
 * 	2.ByteArrayOutputStream 写入到一个字符数组中
 * 		1).建立联系 写入的字符数组
 * 		2).选择流
 * 		3).字符串转字节数组
 * 		4).字节数组写入字节流中
 * 		5).另一个字符数组获取流中数据
 * 		6).释放资源(可以不用释放)
 * 
 * @author zheng
 *
 */
public class _a11_节点流 {
	public static void main(String[] args) throws IOException {
		/*1.ByteArrayInputStream 输入字符数组节点流读取字符数组*/
		/*1).建立字节数组数据源*/
		byte[] src = "提供字节数组读取".getBytes();
		/*2).选择流*/
		ByteArrayInputStream is = new ByteArrayInputStream(src);
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
		/*6).释放资源(可以不用释放)*/
		if (null != is) is.close();
		
		/* 2.ByteArrayOutputStream 写入到一个字符数组中 */
		/* 1).建立联系 写入的字符数组 */
		byte[] dest;
		/* 2).选择流 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		/* 3).字符串转字节数组 */
		byte[] info = "提供字节数组读取".getBytes();
		/* 4).字节数组写入字节流中 */
		bos.write(info, 0, info.length);
		/*5).另一个字符数组获取流中数据*/
		dest = bos.toByteArray();
		/*6).释放资源(可以不用释放)*/
		bos.close();
	}
}
