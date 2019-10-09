package _a11_IO流;

import java.io.File;

/**
 * 两个常量
 * 1、路径分隔符  ;
 * 2、名称分隔符 /(windows)  /(linux 等)
 * 
 * @author Administrator
 */
public class _1_文件路径 {
	public static void main(String[] args) {
		/*1.路径分隔符*/
		System.out.println(File.pathSeparator);
		/*2、名称分隔符*/
		System.out.println(File.separator);
		/*3.路径表示形式*/
		String path ="E:\\xp\\test\\2.jpg";
		path="E:"+File.separator+"xp"+File.separator+"test"+File.separator+"2.jpg";
		/*推荐方式*/
		path="E:/xp/test/2.jpg";
	}
}
