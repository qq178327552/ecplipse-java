package _a18_设计模式._a21_观察者行为型设计模式._1_自己实现观察者模式;
/**
 * 观察者接口
 * 	定义该观察者接收到消息后的处理方法
 * @author zheng
 *
 */
public interface IObserver {
	/*接收到目标(主题)通知后的处理方法*/
	void  update(Subject subject);
}
