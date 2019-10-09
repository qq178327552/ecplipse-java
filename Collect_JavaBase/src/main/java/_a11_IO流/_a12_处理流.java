package _a11_IO流;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 处理流
 * 	用于保存本类型和数据(包括String),提供机器解析阅读
 * 		输入处理流:DataInputStream
 * 		输出处理流:DataOutputStream
 * 	用于保存对象和数据(包括String),提供机器解析阅读(待序列化对象需继承java.io.Serializable作为标识,不需要序列化的属性加关键字transient)
 * 		反序列化输入流(从文件中拿出对象及数据):ObjectInputStream
 * 		序列化输出流(对象及数据存入文件):ObjectOutputStream
 * 	
 * 
 * 
 * 	1.将数据+基本类型保存到文件中(保存的内容供机器阅读,显示乱码)
 * 		1).建立不同类型数据的数据源
 * 		2).创建需要写入的File对象
 * 		3).将数据类型和数据写入到文件中
 * 		4).释放资源
 * 	2.将保存后的文件读取
 * 		1).建立读取的文件数据源
 * 		2).选择DataInputStream对象将文件写入到输入处理流中
 * 		3).读取文件中的数据+数据类型(读取的顺序和写入一致)
 * 		4).释放资源
 * 	3.对象序列化:将数据+对象类型保存到文件中(保存的内容供机器阅读,显示乱码)
 * 		1).实例化对象作为数据源
 * 	4.反序列化成对象:将保存后的文件读取
 * 
 * @author zheng
 *
 */
public class _a12_处理流 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*1.将数据+类型保存到文件中(保存的内容供机器阅读,显示乱码)*/
		/*1).建立不同类型数据的数据源*/
		double point = 2.5;
		String str = "123";
		/*2).创建需要写入的File对象*/
		File src = new File("e:/xp/test/a.txt");
		/*2).选择DataOutputStream对象准备将数据源写入File中*/
		FileOutputStream fileOutput = new FileOutputStream(src);
		DataOutputStream dos = new DataOutputStream(fileOutput);
		/*3).将数据类型和数据写入到文件中*/
		dos.writeDouble(point);
		dos.writeUTF(str);
		/*4).释放资源*/
		dos.close();
		
		/*2.将保存后的文件读取*/
		/*1).建立读取的文件数据源*/
		File file = new File("e:/xp/test/a.txt");
		/*2).选择DataInputStream对象将文件写入到输入处理流中*/
		FileInputStream fileInput = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fileInput);
		/*3).读取文件中的数据+数据类型(读取的顺序和写入一致)*/
		double num1 = dis.readDouble();
		String num2 = dis.readUTF();
		/*4).释放资源*/
		dis.close();
		
		/*3.对象序列化:将数据+对象类型保存到文件中(保存的内容供机器阅读,显示乱码)*/
		/*1).实例化对象作为数据源*/
		Employee emp = new Employee("123",12);
		/*2).创建需要写入的File对象*/
		File srcObj = new File("e:/xp/test/a.txt");
		/*3).选择DataOutputStream对象准备将数据源写入File中*/
		FileOutputStream fileOutputObj = new FileOutputStream(srcObj);
		ObjectOutputStream dosObj = new ObjectOutputStream(fileOutputObj);
		/*4).将数据对象和数据写入到文件中*/
		dosObj.writeObject(emp);
		/*5).释放资源*/
		dosObj.close();
		
		/*4.反序列化成对象:将保存后的文件读取*/
		/*1).建立读取的文件数据源*/
		File fileObj = new File("e:/xp/test/a.txt");
		/*2).选择ObjectInputStream对象将文件写入到输入处理流中*/
		FileInputStream fileInputObj = new FileInputStream(fileObj);
		ObjectInputStream disObj = new ObjectInputStream(fileInputObj);
		/*3).读取文件中的数据+数据类型(读取的顺序和写入一致)*/
		Employee empRead = (Employee)disObj.readObject();
		/*4).释放资源*/
		disObj.close();
	}
}
class Employee implements java.io.Serializable{
	private transient String name;
	private double salary;
	public Employee(String name,double salary){
		super();
		this.name = name;
		this.salary = salary;
	}
}
