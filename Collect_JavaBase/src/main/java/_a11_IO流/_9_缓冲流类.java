package _a11_IO流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 * 缓冲流类(增强功能,提供性能,在节点流之上)：
 * 		字节缓冲流:BufferedInputStream:在【文件字节输入流类】之上包装一层缓冲流
 * 				BufferedOutputStream:在【文件字节输出流类】之上包装一层缓冲流
 * 		字符缓冲流:BufferedReader:在【文件字符输入流类】之上包装一层缓冲流
 * 				BufferedReader:【文件字符输出流类】之上包装一层缓冲流
 * 
 * 	1.BufferedInputStream,在FileInputStream封装 BufferedInputStream提高性能
 * 	2.BufferedOutputStream,在FileOutputStream封装BufferedOutputStream提高性能
 * 	3.BufferedReader,在FileReader封装BufferedReader
 * 	4.BufferedReader,在FileWriter封装BufferedReader
 * 
 * @author zheng
 *
 */
public class _9_缓冲流类 {
	public static void main(String[] args) throws IOException {
		/* 1.BufferedInputStream,在FileInputStream封装 BufferedInputStream提高性能*/
		File src = new File("e:/xp/test/a.txt");
		InputStream is = null;
		InputStream fileInput = new FileInputStream(src);
		/*封装BufferedInputStream*/
		is = new BufferedInputStream(fileInput);
		
		byte[] car = new byte[1024];
		int len = 0;
		StringBuilder sb = new StringBuilder();
		while (-1 != (len = is.read(car))) {
			String info = new String(car, 0, len);
			sb.append(info);
		}
		System.out.println(sb.toString());
		if (null != is)
			is.close();

		/* 2.BufferedOutputStream,在FileOutputStream封装BufferedOutputStream提高性能 */
		File dest = new File("e:/xp/test/test.txt");
		OutputStream os = null;
		OutputStream fileOutput = new FileOutputStream(dest, true);
		/*封装BufferedOutputStream*/
		os = new BufferedOutputStream(fileOutput);
		
		String str = "bjsxt is very good \r\n";
		byte[] data = str.getBytes();
		os.write(data, 0, data.length);
		os.flush();
		if (null != os) os.close();
		
		/*3.BufferedReader,在FileReader封装BufferedReader*/
		File src1 = new File("E:/xp/test/a.txt");
		Reader reader = null;
		Reader fileReader = new FileReader(src1);
		/*封装BufferedReader*/
		reader = new BufferedReader(fileReader);
		
		char[] flush = new char[1024];
		int charlen = 0;
		while (-1 != (charlen = reader.read(flush))) {
			String charstr = new String(flush, 0, charlen);
			System.out.println(charstr);
		}
		if (null != reader) reader.close();
		
		/*4.BufferedReader,在FileWriter封装BufferedReader*/
		File dest1 = new File("e:/xp/test/char.txt");
		Writer wr = null;
		Writer fileWriter = new FileWriter(dest);
		/*封装BufferedReader*/
		wr = new BufferedWriter(fileWriter);
		
		String msg = "追加.....锄禾日当午\r\n码农真辛苦\r\n一本小破书\r\n一读一上午";
		wr.write(msg);
		wr.append("倒萨发了看电视剧 ");
		wr.flush();
		if (null != wr) wr.close();
	}
}
