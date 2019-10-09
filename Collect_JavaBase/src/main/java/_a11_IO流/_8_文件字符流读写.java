package _a11_IO流;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 文件字符流读写
 * 	字符流接口:
 * 		输入流接口:Reader:read(char[])、read(char[],int,int)、close()
 * 		输出流接口:Writer:write(char[])、write(char[],int,ing)、flush()、close()
 * 	文件字符流实现类
 * 		输入流类:FileReader
 * 		输出流类:FileWriter
 * 
 * 1.FileReader 纯文本(字符可见)文件读取
 * 	1).建立联系 File对象
 * 	2).选择流
 * 	3).操作 不断读取 缓冲数组,即每次读取1024个字符
 * 	4).循环读取.当下一轮设置的char读不到数据,接收 实际读取大小数值则为-1
 * 	5).输出 字节数组转成字符串
 * 	6).释放资源
 * 2.FileWriter 纯文本(字符可见)文件写入
 * 	1).建立联系 File对象 写入文件
 * 	2).选择流
 * 	3).以追加形式 写出文件 必须为true 否则为覆盖
 * 	4).直接将字符串写入
 * 	5).强制刷新出去,防止数据在流中未写入到文件
 * 	6).释放资源 :关闭
 * 
 * @author zheng
 *
 */
public class _8_文件字符流读写 {
	public static void main(String[] args) throws IOException {
		/*1.FileReader 纯文本(字符可见)文件读取*/
		/*1).建立联系 File对象*/
		File src = new File("E:/xp/test/a.txt");
		/*2).选择流*/
		Reader reader = null;
		reader = new FileReader(src);
		/*3).操作 不断读取 缓冲数组,即每次读取1024个字符*/
		char[] flush = new char[1024];
		int charlen = 0;//接收 实际读取字符大小
		/*4).循环读取.当下一轮设置的char读不到数据,接收 实际读取大小数值则为-1*/
		while (-1 != (charlen = reader.read(flush))) {
			/*5).输出 字节数组转成字符串*/
			String charstr = new String(flush, 0, charlen);
			System.out.println(charstr);
		}
		/*6).释放资源*/
		if (null != reader) reader.close();
		
		/*2.FileWriter 纯文本(字符可见)文件写入*/
		/*1).建立联系 File对象 写入文件*/
		File dest = new File("e:/xp/test/char.txt");
		/* 2).选择流 */
		Writer wr = null;
		/* 3).以追加形式 写出文件 必须为true 否则为覆盖 */
		wr = new FileWriter(dest);
		/* 4).直接将字符串写入 */
		String msg = "追加.....锄禾日当午\r\n码农真辛苦\r\n一本小破书\r\n一读一上午";
		wr.write(msg);
		wr.append("倒萨发了看电视剧 ");
		/* 5).强制刷新出去,防止数据在流中未写入到文件 */
		wr.flush();
		/* 6).释放资源 :关闭 */
		if (null != wr) wr.close();
	}
}
