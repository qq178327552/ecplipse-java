package _a18_设计模式._6_代理结构型设计模式._2_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 代理处理类
 * 	继承jdk自带的代理接口
 * 	实现代理处理结构中invoke()(调用方法),该方法主要通过反射获取调用者正在调用的,真实角色方法
 * 	调用者通过代理构造器传入代理处理类实例化和抽象角色类名,可获取代理角色实例化
 * 	可在调用真实角色方法前后添加"前置处理"和"后置处理"
 * 	
 * @author zheng
 *
 */
public class Proxy_Handler implements InvocationHandler{
	private IBuyCar buyCar;
	public Proxy_Handler(IBuyCar buyCar){
		super();
		this.buyCar = buyCar;
	}
	/*同个反射实现调用者正在被调用的真实者的方法,代理类,调用者正在调用的方法,方法的参数*/
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj = null;
		/*调用者正在调用的方法之前添加前置处理*/
		System.out.println("调用真实角色方法前添加前置处理");
		/*反射根据方法名是否调用真是角色方法*/
		if(method.getName().equals("runCar")){
			obj = method.invoke(buyCar, args);
		}
		/*调用者正在调用的方法之后添加后置处理*/
		System.out.println("调用真是角色后添加后置处理");
		/*调用正正在调用的方法若有返回值,可返回执行方法后的返回值*/
		return obj;
	}
}
