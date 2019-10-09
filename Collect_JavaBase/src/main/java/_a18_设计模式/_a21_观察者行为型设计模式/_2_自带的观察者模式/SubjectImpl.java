package _a18_设计模式._a21_观察者行为型设计模式._2_自带的观察者模式;

import java.util.Observable;

/**
 * 目标(主题)具体实现类
 * @author zheng
 *
 */
public class SubjectImpl extends Observable {
	/*主题类的状态*/
	private int state; 
	public int getState() {return state;}
	public void setState(int state) {this.state = state;}
	/*定义状态改变方法时,调用自带Observable类中的方法通知观察者*/
	public void set(int s){
		state = s;
		/*继承自父类的方法,表示目标对象已经做了更改*/
		setChanged();
		/*继承自父类的方法,通知所有的观察者*/
		notifyObservers(state);
	}
}
