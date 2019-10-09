package _a18_设计模式._a21_观察者行为型设计模式._1_自己实现观察者模式;

import java.util.ArrayList;
import java.util.List;
/**
 * 目标类(主题类)
 * 	定义一个可被继承的主题类
 * 	用于存放观察者
 * 	用于实现向各个观察者发通知的方法
 * @author zheng
 *
 */
public class Subject {
	/*定义存放各观察者的List集合,并添加增删操作*/
	protected List<IObserver> list = new ArrayList<IObserver>();
	public void addObserver(IObserver obs){list.add(obs);}
	public void removeObserver(IObserver obs){list.add(obs);}
	/*通知所有的观察者更新状态*/
	public void notifyAllObservers(){
		for (IObserver obs : list) {
			obs.update(this);
		}
	}
}