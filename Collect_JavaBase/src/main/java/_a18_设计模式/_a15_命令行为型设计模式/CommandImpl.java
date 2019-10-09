package _a18_设计模式._a15_命令行为型设计模式;
/**
 * 命令具体实现类
 * @author zheng
 *
 */
public class CommandImpl implements ICommand{
	/*初始化时传入命令的接收者*/
	private Receiver receiver;
	public CommandImpl(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	/*通过命令具体实现类,调用命令接收者的具体实现方法,实现方法可对结果做处理*/
	@Override
	public void execute() {
		/*调用接收者处理命令,可以对执行完的命令做其他操作*/
		receiver.action();
	}
}
