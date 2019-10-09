package _a18_设计模式._3_建造者创建者设计模式;

/**
 * 人对象,拥有车和房子
 * @author zheng
 *
 */
public class Bean_People {
	private Bean_Car car;
	private Bean_Home home;
	
	public Bean_Car getCar() {return car;}
	public void setCar(Bean_Car car) {this.car = car;}
	public Bean_Home getHome() {return home;}
	public void setHome(Bean_Home home) {this.home = home;}
}
