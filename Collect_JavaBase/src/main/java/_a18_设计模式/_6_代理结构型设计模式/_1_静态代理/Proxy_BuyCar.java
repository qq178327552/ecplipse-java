package _a18_设计模式._6_代理结构型设计模式._1_静态代理;
/**
 * 代理者对象
 * 	代理者直接提供调用者访问
 * 	部分统一处理流程的,代理者可以实现
 * 	需要真实者处理的,代理者调用真实者处理
 * @author zheng
 *
 */
public class Proxy_BuyCar implements IBuyCar{
	/*实例化代理者时先创建真实者*/
	private IBuyCar buyCar;
	public Proxy_BuyCar(IBuyCar buyCar){
		super();
		this.buyCar = buyCar;
	}
	@Override
	public void buyCar() {
		System.out.println("代理角色负责买车");
	}
	@Override
	public void runCar() {
		/*代理角色调用真实角色负责让真是角色开车*/
		buyCar.buyCar();
	}
}
