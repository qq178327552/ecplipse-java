package _a18_设计模式._a14_中介者行为型设计模式;
/**
 * 零件接口
 * 	车零件给修理工,然后装配到相邻的零件上
 * @author zheng
 *
 */
public interface IComponent {
	/*自己的行为*/
	void selfAction();
	/*发送给修理工行为*/
	void outAction();
}
