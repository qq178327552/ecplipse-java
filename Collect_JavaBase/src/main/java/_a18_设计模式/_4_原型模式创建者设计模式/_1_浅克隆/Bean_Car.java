package _a18_设计模式._4_原型模式创建者设计模式._1_浅克隆;

import java.util.Date;
/**
 * Car对象中,继承Cloneable接口,抛出可以克隆的方法
 * @author zheng
 *
 */
public class Bean_Car implements Cloneable{
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
	/*实现克隆方法*/
	@Override
	protected Object clone() throws CloneNotSupportedException {
		/*直接调用object对象的clone()方法*/
		Object obj = super.clone();
		return obj;
	}
}
