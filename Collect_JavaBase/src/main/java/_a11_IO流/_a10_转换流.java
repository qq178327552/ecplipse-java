package _a11_IO流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * 转换流(字节流与字符流转换,用于处理乱码)：
 * 	输入转换流(解码):InputStreamWriter
 * 	输出转换流(编码):OutputStreamReader
 * 		编码 ：  字符  --编码字符集--> 字节
 * 		解码 ：  字节  --解码字符集--> 字符
 * 
 * 1.编码
 * 2.设定编码字符集编码
 * 3.解码
 * 4.设定解码字符集解码
 * 5.字符中缺少字节导致乱码
 * 6.输入转换流(解码)
 * 7.输出转换流(编码)
 * @author zheng
 */
public class _a10_转换流 {
	public static void main(String[] args) throws IOException {
		String str ="中国";
		/*1.编码:字符  --> 字节*/
		byte[] data =str.getBytes();
		/*2.设定编码字符集编码*/
		data =str.getBytes("utf-8");
		/*3.解码:字节  --> 字符*/
		System.out.println(new String(data));
		/*4.设定解码字符集解码*/
		str=new String(data,"utf-8");
		/*5.字符中缺少字节导致乱码*/
		System.out.println(new String(data,0,3));
		/*6.输入转换流(解码):File -> FileInputStream -> BufferedInputStream -> InputStreamReader -> BufferedReader*/
		File file = new File("E:/xp/test/Demo03.java");//文件
		FileInputStream fileIn = new FileInputStream(file);//文件字节输入流(封装文件)
		BufferedInputStream fileInBuf = new BufferedInputStream(fileIn);//文件字节输入缓冲流(封装文件字节输入流)
		InputStreamReader ir = new InputStreamReader(fileInBuf,"UTF-8");//字节解码转换流(封装文件字节输入缓冲流,并设置解码集)
		BufferedReader br =new BufferedReader(ir);//字符缓冲流(封装字节解码转换流)
		/*7.输出转换流(编码):File -> FileOutputStream -> BufferedOutputStream -> OutputStreamWriter -> BufferedWriter*/
		file = new File("E:/xp/test/Demo03.java");//文件
		FileOutputStream fileOut= new FileOutputStream(file);//文件字节输出流(封装文件)
		BufferedOutputStream fileOutBuf = new BufferedOutputStream(fileOut);//文件字节输出缓冲流(封装文件字节输出流)
		OutputStreamWriter ow = new OutputStreamWriter(fileOutBuf,"UTF-8");//字节编码转换流(封装文件字节输出缓冲流,并设置解码集)
		BufferedWriter bw = new BufferedWriter(ow);//字符缓冲流(封装字节编码转换流)
	}
}
