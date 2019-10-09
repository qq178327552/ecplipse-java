package _a18_设计模式._a14_中介者行为型设计模式;

import java.util.HashMap;
import java.util.Map;
/**
 * 中介者具体实现类
 * @author zheng
 *
 */
public class MediatorImpl implements IMediator{
	/*存放零件名称和对应的类,缓存零件信息*/
	private Map<String,IComponent> map = new HashMap<String , IComponent>();
	/*将发送的零件注册*/
	@Override
	public void register(String componentName, IComponent ComponentClass) {
		map.put(componentName, ComponentClass);
	}
	/*从零件命令发送*/
	@Override
	public void command(String componentName) {
		map.get(componentName).selfAction();
	}
}
