package _a11_IO流;

import java.io.File;

/**
 * 获取文件信息
 * 
 * 1.是否存在
 * 2.是否可读 写
 * 3.判断文件类型:文件或目录
 * 4.文件大小(字节)
 * 
 * @author zheng
 */
public class _3_获取文件信息 {
	public static void main(String[] args) {
		String path = "E:/xp/test/200.jpg";
		File src = new File(path);
		separate("1.是否存在");
		System.out.println("文件是否存在:" + src.exists());
		
		separate("2.是否可读 写");
		System.out.println("文件是否可写" + src.canWrite());
		System.out.println("文件是否可读" + src.canRead());
		
		separate("3.判断文件类型:文件或目录");
		if (src.isFile()) {
			System.out.println("文件");
		} else if (src.isDirectory()) {
			System.out.println("文件夹");
		} else {
			System.out.println("文件不存在");
		}
		separate("4.文件大小(字节)");
		System.out.println("长度为:" + src.length());
	}
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
