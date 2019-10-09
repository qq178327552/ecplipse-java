package _3_面向对象;

/**
 * 判别实例化对象类型
 * 
 * 1.创建人类，包含job方法 2.创建学生类继承人类，重写job方法，并包含自己的learn方法
 * 3.创建工人类继承人类，重写job方法，并包含自己的work方法
 * 
 * 4.主程序中创建jobPrint方法，传入父类人类对象，判断传入的是否为实例化学生类，是则强转为学生类并调用学生类独有方法
 * 
 * @author zheng
 *
 */
public class _a10_实例化对象类型 {
	public static void main(String[] args) {
		StudentPolymorphism s = new StudentPolymorphism();
		jobPrint(s);
	}

	public static void jobPrint(PeoplePolymorphism p) {
		p.job();
		if (p instanceof StudentPolymorphism) // 判断被实例化的是否为学生类
			((StudentPolymorphism) p).learn();// 判断人类p为学生类实例化时，可强转为学生类
	}

}

/* 创建父类：人类 */
class PeoplePolymorphism {
	public void job() {
		System.out.println("【人类-job】人");
	}
}

/* 创建学生类继承人类 */
class StudentPolymorphism extends PeoplePolymorphism {
	public void job() {// 重写父类job方法
		System.out.println("【学生类-job】学生");
	}

	public void learn() {
		System.out.println("【学生类-学生独有learn】学生学习");
	}
}

/* 创建工人类继承人类 */
class WorkerPolymorphism extends PeoplePolymorphism {
	public void job() {// 重写父类job方法
		System.out.println("【工人类-job】工人");
	}

	public void work() {
		System.out.println("【工人类-工人独有work】工人工作");
	}
}