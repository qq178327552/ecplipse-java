package _7_文件._1_文件操作基础;

import java.io.File;
import java.io.IOException;

/**
 * File文件操作
 * 
 * 1.创建文件对象 
 * 2.判断是否是文件或目录
 * 
 * @author zheng
 *
 */
public class _1_File类 {
	public static void main(String[] args) throws IOException {
		/*1.创建文件对象 */
		File f = new File("d:/src3/TestObject.java");// 建立file对象，通过该对象操作文件
		File f2 = new File("d:/src3");// 路径
		File f3 = new File(f2, "TestThis.java");// 路径+文件
		File f4 = new File(f2, "TestFile666.java");
		File f5 = new File("d:/src3/aa/bb/cc/ee/ddd");
		f5.mkdirs();
		f4.createNewFile();// 在硬盘中创建该文件
		f4.delete();// 在硬盘中删除该文件
		
		/*2.判断是否是文件或目录*/
		if (f.isFile()) // 判断是否是一个文件
			System.out.println("是一个文件");
		if (f2.isDirectory())
			System.out.println("是一个目录");

	}
}
