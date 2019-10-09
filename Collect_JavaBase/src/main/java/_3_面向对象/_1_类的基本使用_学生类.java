package _3_面向对象;

/**
 * 类的基本使用
 * 	类与类之间的关系
 * 		1.依赖:形参|局部变量
 * 		2.关联:属性
 * 			聚合:属性 整体与部分 不一致的生命周期 人与手
 * 			组合:属性 整体与部分 一致的生命周期  人与大脑
 * 		3.继承:父子类关系
 * 		4.实现: 接口与实现类关系
 * 
 * 1.创建学生类、书类
 * 2.学生类中一个属性为书类
 * 3.实例化1个学生，并创建书类赋值给学生
 * 4.通过初始化的学生调用书中的属性
 * 
 * @author zheng
 *
 */
public class _1_类的基本使用_学生类 {
	public static void main(String[] args) {
		/* 创建学生类 */
		StudentOOP s1 = new StudentOOP();
		s1.studentId = 18;
		s1.studentName = "郑皓元";

		/* 创建书类 */
		Book c = new Book();
		c.paper = "一共50页";

		/* 将创建的书类赋值给学生类中的属性 */
		s1.book = c;

		/* 打印学生类中书的属性中的纸属性 */
		System.out.println(s1.book.paper);
	}
}

/* 创建学生类 */
class StudentOOP {
	/* 静态的数据 */
	int studentId;
	String studentName;
	Book book; // 创建其他类为数据类型

	/* 动态的行为study()*/
	public void study() {
		System.out.println(studentName + "在學習");
	}
}

/*创建书类 */
class Book {
	String paper;

	void look() {
		System.out.println("用来看");
	}
}
