package _a18_设计模式._4_原型模式创建者设计模式._3_序列化深克隆;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 序列化和反序列化实现深克隆
 * 	调用者通过序列化反序列化生成的克隆对象,不会出现浅克隆缺点
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Date carDate = new Date();
		Bean_Car car1 = new Bean_Car(carDate);
		/*序列化car1对象*/
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream    oos = new ObjectOutputStream(bos);
		oos.writeObject(car1);
		byte[] bytes = bos.toByteArray();
		/*反序列化克隆得到car2对象*/
		ByteArrayInputStream  bis = new ByteArrayInputStream(bytes);
		ObjectInputStream	  ois = new ObjectInputStream(bis);
		Bean_Car s2 = (Bean_Car) ois.readObject();
	}
}
