package _a10_泛型;

/**
 * 自定义泛型类 
 * 1、<> -->单个大写字母，尽可能见名知意 
 * 2、 	T Type 
 * 		K V Key Value 
 * 		E Element
 * 3、注意点: 
 * 泛型不能使用在静态属性上,字母用于声明一般属性上
 * 指定的类型不能为基本类型
 * @author zheng
 */
public class _2_自定义泛型类<T> {
	private T javase;
	public _2_自定义泛型类() {
	}

	public _2_自定义泛型类(T javase) {
		this.javase = javase;
	}

	public T getJavase() {
		return javase;
	}

	public void setJavase(T javase) {
		this.javase = javase;
	}
}
