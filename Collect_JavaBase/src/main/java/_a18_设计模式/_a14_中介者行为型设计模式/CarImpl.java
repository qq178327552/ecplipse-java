package _a18_设计模式._a14_中介者行为型设计模式;
/**
 * 定义车框架零件
 * 	
 * @author zheng
 *
 */
public class CarImpl implements IComponent{
	/*持有中介者(修理工)的引用*/
	private IMediator mediator;
	/*创建车架零件时,向中介者发调用册信息*/
	public CarImpl(IMediator mediator){
		super();
		this.mediator = mediator;
		mediator.register("car", this);
	}
	@Override
	public void selfAction() {
		System.out.println("需要组装车框架的下一个零件");
		
	}
	/*实现向外发的命令*/
	@Override
	public void outAction() {
		System.out.println("车框架");
		mediator.command("wheel");
	}

}
