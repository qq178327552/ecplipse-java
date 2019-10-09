package _3_面向对象;

/**
 * 测试this用法
 * 
 * 1.创建学生类 
 * 2.学生类中重载三个构造方法，包含this
 * 
 * @author zheng
 *
 */
public class _5_this用法 {
	public static void main(String[] args) {
		StudentThis s = new StudentThis();
	}
}

/* 创建学生类 */
class StudentThis {
	int id;
	String name;

	/* 重写无参构造方法 */
	public StudentThis() {
		System.out.println("构造一个对象");
	}

	/* 创建含name的构造方法，参数传入该类的name属性 */
	public StudentThis(String name) {
		this.name = name;
	}

	/* 创建含id和name的构造方法，并且在第一句调用其他构造方法执行 */
	public StudentThis(String name, int id) {
		this(name); // 通过this调用其他构造方法，必须位于第一句！
		this.name = name;
		this.id = id;
	}

	/* 设置对name的set方法 */
	public void setName(String name) {
		this.name = name;
	}

	/* 创建学生的learn方法 */
	public void learn() {
		this.name = "张三";
		System.out.println(name + "在學習");
	}
}