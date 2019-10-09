package _a18_设计模式._4_原型模式创建者设计模式._3_序列化深克隆;

import java.io.Serializable;
import java.util.Date;
/**
 * 序列化反序列化实现深克隆对象
 * 	调用者只需要序列化和反序列化创建新的原型对象,即可克隆出新的对象
 * 	原型对象需要继承Serializable接口,供序列化和反序列化
 * 	序列化反序列化生成的克隆对象,不会出现浅克隆缺点
 * 	
 * @author zheng
 *
 */
public class Bean_Car implements Serializable{
	/*包含对象的Map*/
	private Date carDate;
	
	public Date getCarDate() {return carDate;}
	public void setCarDate(Date carDate) {this.carDate = carDate;}
	/*构造器*/
	public Bean_Car(){}
	public Bean_Car(Date carDate) {
		super();
		this.carDate = carDate;
	}
}
