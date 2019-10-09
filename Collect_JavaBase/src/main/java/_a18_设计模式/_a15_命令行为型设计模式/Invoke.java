package _a18_设计模式._a15_命令行为型设计模式;

/**
 * 命令调用者、发起者
 * @author zheng
 *
 */
public class Invoke {
	/*通过容器对命令存储,进行批处理操作,此处就存放一个命令*/
	private ICommand command;
	public Invoke(ICommand command) {
		super();
		this.command = command;
	} 
	/*用于调用命令类的方法*/
	public void call(){
		command.execute();
	}
	
	
}
