package _7_文件._4_txt操作;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
/**
 * 控制txt文件
 * 	1.关于路径问题：
 * 		. 代表java命令运行的目录
 * 		在java项目下，. java命令的运行目录从项目的根目录开始
 * 		在web项目下，  . java命令的而运行目录从tomcat/bin目录开始
 * 	2.关于类路径问题(使用类路径的读取方式)：
 * 		/ : 斜杠表示classpath的根目录
 * 		在java项目下，classpath的根目录从bin目录开始
 * 		在web项目下，classpath的根目录从WEB-INF/classes目录开始
 * 		类路径读取方式：1).读取文件的InputStream流:[类名].class.getResourceAsStream(路径)
 * 
 * @author zheng
 *
 */
public class All_TxtOperate {
	/* FileInputStream:用builder读取txt文件,返回字符串 */
	public static String readTxt(String url) throws IOException {
		File file = new File(url);
		FileInputStream fileInputStream = new FileInputStream(file);//输入文件字节流
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");// 创建以utf-8读取文件，并创建字节输入流
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);// 从字符输入流中读取到缓冲字符流中，缓冲各个字符

		StringBuilder builder = new StringBuilder();// 创建一个存储字符串类
		String lineString = null;
		while ((lineString = bufferedReader.readLine()) != null) {// 循环判断缓冲字符流中知道最近的换行符是否为空，并且指针下移
			builder.append(lineString);
		}
		bufferedReader.close();// 关闭缓冲池
		return builder.toString();
	}
	
	/* Scanner:读取文件，仅占用150M左右内存，读一行处理一行 */
	public static void readLongTxt(String url) throws IOException{
		FileInputStream inputStream = new FileInputStream(url);
		Scanner sc = new Scanner(inputStream, "UTF-8");//将文件字节流存入Scanner容器中
		while (sc.hasNextLine()){//判断Scanner容器指针的后面是否还有字节
			System.out.println(sc.nextLine());//读取Scanner容器接收到的字节，直到一个换行符
		}
		if (sc.ioException() != null) throw sc.ioException();
		if (inputStream != null) inputStream.close();
		if (sc != null) sc.close();
	}
	
	/* FileOutputStream:将传入的字符串写入到传入的url中 ,可控制是否追加存入*/
	public static void writeTxt1(String url, String conent) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(url, true);//创建文件字节流输出,第二个参数控制true为追加存入
		OutputStreamWriter outputStreamWriter =new OutputStreamWriter(fileOutputStream);//将文件的字节流转换为字符流
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);//将文件字符流转换为带缓冲的缓冲字符流
		bufferedWriter.write(conent);//将文本写入缓冲字符流中
		if (bufferedWriter != null)
			bufferedWriter.close();
	}

	/* FileWriter:将传入的字符串写入到传入的url中，url不存在则创建*/
	public static void writeTxt2(String url, String content) throws IOException {
		StringBuilder builder = new StringBuilder();// 内容更新
		builder.append(content);

		File file = new File(url);
		if (file.exists()) {
			System.out.print("文件存在");
		} else {
			System.out.print("文件不存在");
			file.createNewFile();// 不存在则创建
		}
		FileWriter fileWriter = new FileWriter(file,true);//按字符流写入文件类,第二个参数控制true为追加存入
		//fileWriter.write(builder.toString());//没加入缓冲，每写一个数据,硬盘就有一个写动作,性能差
		BufferedWriter output = new BufferedWriter(fileWriter);//加入缓冲字符流，缓冲写满后在将数据写入硬盘，提高了性能
		output.write(builder.toString());
		output.close();
	}
	
}
