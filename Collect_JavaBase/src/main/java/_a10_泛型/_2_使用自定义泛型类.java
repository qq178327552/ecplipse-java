package _a10_泛型;
/**
 * 自定义泛型类的使用，
 * 在声明时指定具体的类型，
 * 不能为基本类型
 * @author zheng
 *
 */
public class _2_使用自定义泛型类 {
	public static void main(String[] args) {
		/*实例化自定义的泛型类*/
		_2_自定义泛型类<Integer> stu =new _2_自定义泛型类<Integer>();
		/*给类注入值,因为定义泛型出输入类型,所以只能传实例化时定义的Integer类型*/
		stu.setJavase(80);
		/*取值时省心:自动类型转换，免去了类型检查*/
		Integer score=stu.getJavase();
		System.out.println(score);
	}
}
