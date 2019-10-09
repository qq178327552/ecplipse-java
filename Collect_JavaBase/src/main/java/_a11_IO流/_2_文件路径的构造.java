package _a11_IO流;

import java.io.File;

/**
 * 相对路径与绝对路径构造 File对象
 * 
 * 1.绝对路径
 * 2.相对路径
 * 		1).构建时由:路径+文件名构建
 * 		2).没有盘符相对路径: 以 【当前项目】目录下构建
 * 3.路径的操作
 * @author zheng
 */
public class _2_文件路径的构造 {
	public static void main(String[] args) {
		String parentPath = "E:/xp/test";
		String name = "2.jpg";
		separate("1.绝对路径构造File");
		File src = new File("E:/xp/test/2.jpg");
		/*测试*/
		System.out.println(src.getName());
		System.out.println(src.getPath());
		
		separate("2.相对路径构造File");
		separate("1).构建时由:路径+文件名构建");
		separate("1.绝对路径构造File");
		src = new File(parentPath, name);
		src = new File(new File(parentPath), name);
		/*测试*/
		System.out.println(src.getName());
		System.out.println(src.getPath());
		
		separate("2).没有盘符相对路径: 以 user.dir构建");
		src = new File("test.txt");
		System.out.println(src.getName());
		System.out.println(src.getPath());//获得以当前项目下的路径
		System.out.println(src.getAbsolutePath());//获得其绝对路径
		
		separate("3.路径的操作");
		src =new File("3.txt");
		System.out.println("返回名称:"+src.getName()); //返回名称
		System.out.println("返回定义时的路径:"+src.getPath()); //如果是绝对路径，返回完整路径，否则相对路径
		System.out.println("返回绝对路径:"+src.getAbsolutePath());//返回绝对路径
		System.out.println("返回上一级目录:"+src.getParent());//返回上一级目录，如果是相对，返回null
	}
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
