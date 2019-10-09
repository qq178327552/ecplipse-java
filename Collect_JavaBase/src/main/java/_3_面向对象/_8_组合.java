package _3_面向对象;

/**
 * 测试组合
 * 
 * 1.创建人类，包含构造方法和人类方法
 * 2.创建学生类，其中在学生方法中：实例化人类，并调用人类的方法
 * 3.实例化学生类，调用学生类的方法
 * 
 * @author zheng
 *
 */
public class _8_组合 {
	public static void main(String[] args) {
		StudentCombination s=new StudentCombination();
		s.learn();
	}
}

/*创建人类*/
class PeopleCombination{
	String Name;
	
	public PeopleCombination(){
		System.out.println("【人类构造方法】创建一个人");
	}
	
	public void peopleCombination(){
		System.out.println("【人类方法】");
	}
}

/*创建学生类，内包含实例化人类*/
class StudentCombination{
	PeopleCombination p1=new PeopleCombination();
	public void learn(){
		System.out.println("【学生类】组合人类，调用人类中的方法:");
		p1.peopleCombination();
	}
}