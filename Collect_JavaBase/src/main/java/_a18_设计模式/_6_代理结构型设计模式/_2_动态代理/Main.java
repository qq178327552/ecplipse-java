package _a18_设计模式._6_代理结构型设计模式._2_动态代理;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 	动态生成代理类,不需要自己定义代理类
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		IBuyCar buyCar = new BuyCar();
		Proxy_Handler handler = new Proxy_Handler(buyCar);
		/*获取代理对象(默认类加载器,抽象角色接口,代理处理类)*/
		IBuyCar proxy = (IBuyCar) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
				new Class[]{IBuyCar.class}, handler);
		proxy.buyCar();
		proxy.runCar();
	}
}
