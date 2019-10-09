package _a18_设计模式._a21_观察者行为型设计模式._1_自己实现观察者模式;
/**
 * 目标具体实现类
 * 	继承目标类
 * 	用于存放目标的状态,并且当目标状态改变时同时通知各个观察者
 * @author zheng
 *
 */
public class SubjectImpl extends Subject {
	/*定义目标的状态*/
	private int state;
	public int getState() {return state;}
	/*定义目标状态改变时,调用继承自父类写的更新所有观察者的方法*/
	public void setState(int state) {
		this.state = state;
		/*主题对象(目标对象)值发生了变化，请通知所有的观察者*/
		this.notifyAllObservers();
	} 
}
