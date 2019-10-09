package _8_异常;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * java中的异常(Exception的处理异常)
 * 		Error异常程序员没法处理，两个异常父类都是Thrpwable类
 * 
 * 1.Checked Exception:需要捕获处理的异常
 * 2.UnChecked Exception:不需要捕获的异常,继承RuntimeException
 * 		1)NullPointerException:空指针异常，没有初始化对象直接用其中的方法或属性
 * 		2)ClassCastException:类型转换异常
 * 		3)ArrayIndexOutOfBoundsException:数组下标越界异常
 * 		4)NumberFormatException:数字格式异常
 * 3.用try...catch...捕获异常
 * 4.throws抛出异常
 * 5.手动抛出异常:throw
 * @author zheng
 *
 */
public class _1_Exception类 {
	public static void main(String[] args) {
		/*1.Checked Exception*/
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
		}finally {
		}
		/*2.UnChecked Exception*/
		int i=1/0;
		File f=new File("c:/a.txt");
		if(!f.exists()){
			try{
				/*5.手动抛出异常(抛出FileNotFoundException异常对象)*/
				throw new FileNotFoundException("文件不存在");
			}catch(FileNotFoundException e){
			}
		}
				
	}

}
