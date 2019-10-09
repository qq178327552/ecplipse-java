package _a18_设计模式._1_单例创建者设计模式;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉式单例模式(如何防止反序列化漏洞)
 */
public class _7_单例漏洞_反序列化 implements Serializable {
	/*私有化构造器*/
	private _7_单例漏洞_反序列化(){
		if(instance!=null)
			throw new RuntimeException();
	}
	private static _7_单例漏洞_反序列化 instance;  
	public static  synchronized _7_单例漏洞_反序列化  getInstance(){
		if(instance==null)
			instance = new _7_单例漏洞_反序列化();
		return instance;
	}
	/*反序列化时,如果定义了readResolve()则直接返回此方法指定的对象.而不需要单独再创建新对象*/
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
	
	public static void main(String[] args) throws Exception {
		_7_单例漏洞_反序列化 s1 = _7_单例漏洞_反序列化.getInstance();
		/*通过序列化把si存入文件中*/
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		/*反序列化从文件获取时创建的s2与s1对象不同(未定义反序列化的readResolve()方法情况下)*/
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
		_7_单例漏洞_反序列化 s2 =  (_7_单例漏洞_反序列化) ois.readObject();
	}
}
