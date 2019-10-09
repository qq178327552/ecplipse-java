package _7_文件._1_文件操作基础;

import java.io.File;

/**
 * 测试文件结构
 * 
 * @author zheng
 *
 */
public class _2_文件结构 {
	public static void main(String[] args) {
		// 找一个自己硬盘上有用的文件夹
		File f = new File("d:/aaa");
		printFile(f, 0);
	}

	/* 创建打印文件目录结构方法且递归调用(传入文件和层次) */
	static void printFile(File file, int level) {
		for (int i = 0; i < level; i++) // 打印文件前面中的"-"
			System.out.print("-");
		System.out.println(file.getName());// 打印文件
		if (file.isDirectory()) {// 打印目录下面的孩子文件
			File[] files = file.listFiles();// 将该文件所有子文件放入数组中
			for (File temp : files) // 遍历所有file子文件对象，递归打印
				printFile(temp, level + 1);
		}
	}
}
