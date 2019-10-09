package _3_面向对象;

/**
 * 测试继承
 * 
 * 1.创建人类对象
 * 2.创建学生类对象，继承人类，并且包含自己的learn方法
 * 3.创建工人对象，继承人类，并且有自己的构造方法
 * 
 * 4.实例化学生、工人对象，在实例化中先启动父类构造方法【super()】，再调用自己的构造方法
 * 5.以父类人接收的实例化对象，不包含子类的独有方法(即使是new子类也不行)
 * 
 * @author dell
 *
 */
public class _6_继承 {
	public static void main(String[] args) {
		/*实例化继承的类*/
		PeopleInherit p1=new StudentInherit();//实例化学生类时，在构造器默认执行super(),即执行了父类的构造方法
		WorkerInherit p2=new WorkerInherit();//实例化工人类时，在工人的构造方法中默认先执行super()方法，再执行工人构造方法中自己的内容
		StudentInherit p3=new StudentInherit();
		
		/*调用集成的类*/
		p2.Name="工人";//工人继承父类人，即拥有父类的属性
		//p1.learn();//这样写报错，虽然实例化学生对象但以人类接收，所以p1没有learn方法，除非把p1强转为学生类
		p3.learn();//p3实例化学生对象，并以学生类接收，所以包含learn方法
	}
}

/*创建父类：人类*/
class PeopleInherit /*extends Object*/{
	String Name;
	
	public PeopleInherit(){
		super();//调用继承的父类(Object类)所有public属性和方法
		System.out.println("【人类-构造方法】创建一个人");
	}
}

/*创建学生类继承人类*/
class StudentInherit extends PeopleInherit{
	/*创建学生独有的学习方法*/
	public void learn(){
		System.out.println("【学生类-普通方法】学生学习");
	}
}

/*创建工人类继承人类*/
class WorkerInherit extends PeopleInherit{
	public WorkerInherit(){
		//super();//默认执行super()方法
		System.out.println("【工人类-构造方法】建一个工人对象");
	}
	/*创建工人独有的学工作方法*/
	public void work(){
		System.out.println("【工人类-普通方法】工人工作");
	}
}