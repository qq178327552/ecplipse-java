package _a18_设计模式._a14_中介者行为型设计模式;

/**
 * 中介者接口
 * 	充当修理工对象,把拿到的零件注册和装配
 * @author zheng
 *
 */
public interface IMediator {
	/*注册零件,*/
	void register(String componentName,IComponent ComponentClass);
	/*发送零件到相邻的零件组装*/
	void command(String componentName);
}
