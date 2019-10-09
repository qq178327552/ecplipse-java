package _a18_设计模式._a14_中介者行为型设计模式;
/**
 * 车轮子具体零件
 * @author zheng
 *
 */
public class WheelImpl  implements IComponent{
	/*持有中介者(修理工)的引用*/
	private IMediator mediator;
	/*创建车架零件时,向中介者发调用册信息*/
	public WheelImpl(IMediator mediator){
		super();
		this.mediator = mediator;
		mediator.register("wheel", this);
	}
	@Override
	public void selfAction() {
		System.out.println("需要组装轮子的下一个零件");
	}

	@Override
	public void outAction() {
		System.out.println("车轮子");
	}

}
