package _a18_设计模式._a15_命令行为型设计模式;
/**
 * 抽象命令类
 * 	用于对命令的封装
 * @author zheng
 *
 */
public interface ICommand {
	/* 这个方法是一个返回结果为空的方法,实际项目中，可以根据需求设计多个不同的方法*/
	void execute();
}