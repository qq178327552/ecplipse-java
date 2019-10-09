package _8_异常;


/**
 * 自定义异常
 * 
 * @author zheng
 *
 */
/*自定义异常继承Exception类*/
public class _2_自定义Exception extends Exception {
	public _2_自定义Exception(){
	}
	public _2_自定义Exception(String message){
		super(message);
	}
}

class TestMyException{
	void test()throws _2_自定义Exception{
		/*测试类中抛出自定义异常*/
	}
	public static void main(String[] args) {
		/*主方法调用该异常*/
		try {
			new TestMyException().test();
		} catch (_2_自定义Exception e) {
			e.printStackTrace();
		}
	}
}