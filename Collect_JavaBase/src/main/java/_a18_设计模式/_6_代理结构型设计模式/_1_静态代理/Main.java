package _a18_设计模式._6_代理结构型设计模式._1_静态代理;

public class Main {
	public static void main(String[] args) {
		IBuyCar buyCar = new BuyCar();
		IBuyCar proxy = new Proxy_BuyCar(buyCar);
		
		proxy.buyCar();
		proxy.runCar();
	}
}
