package _a11_IO流;

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
 * IO流分类：
 * 		流向：输入流与输出流
 * 		数据：
 * 			字节流:二进制,可以处理一切文件
 * 			字符流:文本文件,只能处理文本
 * 		功能:
 * 			节点:包裹源头
 * 			处理:增强功能,提供性能
 * 	文件->文件字节流->字节缓冲处理流->转换流->字符缓冲处理流
 * 	文件->文件字符流->字符缓冲处理流->转换流->
 * 字节流接口：
 * 		输入流接口:InputStream:read(byte[])、read(byte[],int,int)、close()
 * 		输出流接口:OutputStream:write(byte[])、write(byte[],int,int)、close()
 * 字符流接口:
 * 		输入流接口:Reader:read(char[])、read(char[],int,int)、close()
 * 		输出流接口:Writer:write(char[])、write(char[],int,ing)、flush()、close()
 * 
 * 文件字节流类：
 * 		输入流类:FileInputStream
 * 		输出流类:FileOutputStream
 * 文件字符流类
 * 		输入流类:FileReader
 * 		输出流类:FileWriter
 * 
 * 处理流类(增强功能,提供性能,在节点流之上)：
 * 		字节缓冲流:BufferedInputStream:在【文件字节输入流类】之上包装一层缓冲流
 * 				BufferedOutputStream:在【文件字节输出流类】之上包装一层缓冲流
 * 		字符缓冲流:BufferedReader:在【文件字符输入流类】之上包装一层缓冲流
 * 				BufferedReader:【文件字符输出流类】之上包装一层缓冲流
 * 
 * 转换流(字节流与字符流转换,用于处理乱码)：
 * 		输入转换流(解码):InputStreamWriter
 * 		输出转换流(编码):OutputStreamReader
 * 
 * @author zheng
 *
 */
public class _6_IO流总结 {
	public static void main(String[] args) throws IOException {
		
		
		
	}
}
