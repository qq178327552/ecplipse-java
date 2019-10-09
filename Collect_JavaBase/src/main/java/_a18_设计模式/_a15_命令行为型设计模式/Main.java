package _a18_设计模式._a15_命令行为型设计模式;

/**
 * 命令模式(行为模式)
 * 	将请求封装为对象,使我们可用不同的请求对客户进行参数化
 * 	对请求排队或者记录请求日志，以及支持可撤销操作
 * 	客户通过调用者对命令的调用做一些复杂处理,可以用命令模式
 * 	该设计用于对一个命令多个接收者执行,或者多个命令批处理分发各个接收者
 * 
 * 	Command:抽象命令类
 * 	ConcreteCommand:具体命令类
 * 	Invoker:调用者(请求者),请求的发送者,通过命令对象来执行请求,不需要在设计时确定其接收者,运行时将命令对象execute(),间接调用接收者的相关操作
 * 	Receiver:接收者,接收者执行与请求相关操作,具体实现对请求业务处理,抽象前实际执行操作内容对象
 * 	Client:客户类,在客户类中调用创建者对象,具体命令对象,在创建具体命令对象时指定对应的接收者，发送者和接收者没关系,都通过命令对象间接调用
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		ICommand c = new CommandImpl(receiver);
		Invoke invoke = new Invoke(c);
		invoke.call();
	}
}
/*
应用场景:
*/