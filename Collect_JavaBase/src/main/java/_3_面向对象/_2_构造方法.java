package _3_面向对象;

/**
 * 测试构造方法
 * 
 * 1.创建学生类，包含学生的构造方法 
 * 2.直接实例化学生类，会自动调用构造方法
 * 
 * @author zheng
 *
 */
public class _2_构造方法 {
	public static void main(String[] args) {
		StudentConstructor s = new StudentConstructor();
	}
}

/* 创建学生类 */
class StudentConstructor {
	int studentId;
	String studentName;

	public StudentConstructor() {
		System.out.println("构造方法，构造一个学生");
	}
}
