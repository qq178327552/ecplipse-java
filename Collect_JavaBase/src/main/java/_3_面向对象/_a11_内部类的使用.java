package _3_面向对象;

/**
 * 测试内部类的使用
 * 
 * 1.内部类：构建、初始化 、调用
 * 2.静态内部类：构建、初始化
 * 
 * @author zheng
 *
 */
public class _a11_内部类的使用 {
	public static void main(String[] args) {
		Classroom c = new Classroom();
		Classroom.Student s = c.new Student();// 实例化内部类
		s.learn(); // 初始化内部类后才能调用

		Classroom.Desk d = new Classroom.Desk();// 初始化静态内部类
		d.use();
	}
}

class Classroom {
	int classId;
	String className = "班级1";

	/* 构建内部类 */
	class Student {
		int studentId;

		void learn() {
			System.out.println("所在班级：" + className);// 内部类调用所在类属性
			System.out.println("所在班级编号：" + Classroom.this.classId);// 这样调用明确指出
		}
	}

	/* 构建静态内部类 */
	static class Desk {
		void use() {
			System.out.println("桌子被使用");
		}
	}
}