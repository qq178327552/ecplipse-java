package _a11_IO流;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * 操作目录
 * 
 * @author zheng
 *
 */
public class _5_文件目录操作 {
	public static void main(String[] args) {
		String path ="E:/xp/test/parent/p/test";
		File src =new File(path);
		/*1.创建目录,必须保证父目录存在*/
		src.mkdir();//必须保证父目录存在创建目录
		src.mkdirs();//连同父目录一起创建
		if (src.isDirectory()) {
			/*2.获取目录下所有子文件名称*/
			String[] subNames = src.list();
			/*3.获取子文件的File对象*/
			File[] subFiles = src.listFiles();
			/*4.文件过滤器: 命令设计模式*/
			subFiles = src.listFiles(new FilenameFilter() {
				/*dir 代表传入文件的目录*/
				public boolean accept(File dir, String name) {
					return new File(dir, name).isFile() && name.endsWith(".java");//过滤筛选文件是文件且为.java文件
				}
			});
		}
		
		/*6.获取电脑中所有跟路径*/
		File[] roots =File.listRoots();
		System.out.println(Arrays.toString(roots));
	}

	/* 5.递归输出子文件名称 */
	public static void printName(File src) {
		if (null == src || !src.exists())
			return;
		System.out.println(src.getAbsolutePath());
		if (src.isDirectory()) { // 文件夹
			for (File sub : src.listFiles()) {
				printName(sub);
			}
		}
	}
}
