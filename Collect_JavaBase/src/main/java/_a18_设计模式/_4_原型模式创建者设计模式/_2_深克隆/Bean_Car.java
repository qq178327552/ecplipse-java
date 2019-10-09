package _a18_设计模式._4_原型模式创建者设计模式._2_深克隆;

import java.util.Date;
/**
 * 深克隆对象
 * 	需要在clone()克隆方法中克隆出一个新的属性对象
 * 	
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
		Object obj = super.clone();
		/*重新克隆属性对象*/
		Bean_Car newCarDate = (Bean_Car) obj;
		newCarDate.carDate = (Date) this.carDate.clone();
		
		return obj;
	}
}
