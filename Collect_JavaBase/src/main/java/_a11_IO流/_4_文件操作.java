package _a11_IO流;

import java.io.File;
import java.io.IOException;
/**
 * 文件操作
 * 
 * 1.不存在则创建新文件
 * 2.删除文件
 * 3.创建临时文件
 * 4.临时文件当程序结束时删除
 * @author zheng
 *
 */
public class _4_文件操作 {
	public static void main(String[] args) throws IOException, InterruptedException {
		String path = "E:/xp/test/200.jpg";
		File src = new File(path);
		/*1.不存在则创建新文件*/
		if (!src.exists()) {
			boolean flag = src.createNewFile();
			System.out.println(flag ? "成功" : "失败");
		}
		/*2.删除文件*/
		boolean flag = src.delete();
		System.out.println(flag ? "成功" : "失败");
		/*3.创建临时文件(前缀3个字节长，后缀默认.temp,目录),不指定目录默认存在临时空间*/
		File temp = File.createTempFile("tes", ".temp", new File("e:/xp/test"));
		Thread.sleep(10000);
		/*4.临时文件当程序结束时删除*/
		temp.deleteOnExit(); // 退出即删除
	}
}
