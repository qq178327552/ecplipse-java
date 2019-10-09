package _a11_IO流;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 打印流
 * 	1.打印流打印字符串
 * 	2.打印流输出到文件
 * 	3.打印流三个常量
 * 	4.处理键盘输入流
 * 	5.设置重定向打印流打印到文件
 * 
 * @author zheng
 *
 */
public class _a14_打印流 {
	public static void main(String[] args) throws FileNotFoundException {
		/*1.打印流打印字符串*/
		PrintStream ps = System.out;
		ps.println("123");
		/*2.打印流输出到文件*/
		File file = new File("e:/xp/test/a.txt");
		FileOutputStream fileOut = new FileOutputStream(file);
		PrintStream ps1 = new PrintStream(fileOut);
		ps.println("123");
		ps.close();
		/*3.打印流三个常量*/
		System.out.println("out");//输出流
		System.err.println("err");//打印颜色是红色
		InputStream is = System.in;//键盘输入流
		/*4.处理键盘输入流*/
		Scanner sc = new Scanner(is);//Scanner处理流,处理输入流
		/*5.设置重定向打印流打印到文件*/
		File file1 = new File("e:/xp/test/a.txt");
		FileOutputStream fileOut1 = new FileOutputStream(file1);
		PrintStream ps2 = new PrintStream(fileOut1,true);//创建重定向的PrintStream,设置自动刷新
		System.setOut(ps2);
		System.out.println("123");//经过设置,会自动打印到文件中
		/*设置还原回输出到控制台*/
		FileOutputStream fileOut2 = new FileOutputStream(FileDescriptor.out);
		PrintStream ps3 = new PrintStream(fileOut2,true);
		System.setOut(ps3);
	}
}
