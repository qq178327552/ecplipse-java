package _a12_线程;
/**
 * 静态代理设计模式
 * 1、有真实角色
 * 2、有代理模式：持有真是角色的引用
 * 3、二者实现相同的接口
 * @author zheng
 *
 */
public class StaticProxy {
	public static void main(String[] args) {
		//用接口创建真实角色
		Marry you=new You();
		//用接口创建代理角色，方便以后新增方法
		//加入真是角色的引用
		Marry company=new WeddingCompany(you);
		//执行任务
		company.marry();
	}
}
//共同接口
interface Marry{
	public abstract void marry();
}
//真实角色
class You implements Marry{
	@Override
	public void marry() {
		System.out.println("真是角色");
	}
}
//代理角色
class WeddingCompany implements Marry{
	private Marry you;
	public WeddingCompany(Marry you) {
		this.you=you;
	}
	private void before(){
		System.out.println("调用真实角色之前做的");
	}
	private void after(){
		System.out.println("调用真实角色之后做的");
	}
	@Override
	public void marry() {
		before();
		you.marry();
		after();
	}
}