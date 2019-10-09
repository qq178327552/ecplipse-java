package _a11_IO流;

import java.io.Closeable;

public class _a13_关闭流工具类 {
	/*1.直接关闭所有流*/
	public static void close(Closeable ... io){
		for(Closeable temp : io){
			try{
				if(temp!=null) temp.close();
			}catch(Exception e){
			}
		}
	}
	
	/*2.使用泛型关闭所有流*/
	public static <T extends Closeable> void closeAll(T ... io){
		for(Closeable temp : io){
			try{
				if(temp!=null) temp.close();
			}catch(Exception e){
			}
		}
	}
	/*3.JDK1.7方法关闭流try{定义}{执行}关闭*/
}
