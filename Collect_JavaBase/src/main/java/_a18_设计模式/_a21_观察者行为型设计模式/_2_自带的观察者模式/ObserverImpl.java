package _a18_设计模式._a21_观察者行为型设计模式._2_自带的观察者模式;

import java.util.Observable;
import java.util.Observer;
/**
 * 观察者具体实现
 * 	定义观察者自己的状态,接收到目标消息后同步自己的状态
 * @author zheng
 *
 */
public class ObserverImpl implements Observer {
	/*观察者自己的状态*/
	private int myState;
	public int getMyState() {return myState;}
	public void setMyState(int myState) {this.myState = myState;}
	/*接收到目标消息后,更新操作*/
	@Override
	public void update(Observable o, Object arg) {
		myState = ((SubjectImpl)o).getState();
	}
}
