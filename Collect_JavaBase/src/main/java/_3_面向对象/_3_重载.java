package _3_面向对象;

/**
 * 测试重载
 * 
 * 1.创建一个学生类:
 * 	1)重写构造方法
 * 	2)重载一个参数构造方法
 * 	3)重载两参参数构造方法
 * 
 * 	4)创建learn方法
 * 	5)重载learn方法，含两参
 * 	6)重载learn方法，含两参但参数位置类型不同
 * 
 * @author zheng
 *
 */
public class _3_重载 {
	public static void main(String[] args) {
		StudentOverload s=new StudentOverload();
		s.learn();
		s.learn(0, "郑皓元");
		s.learn("郑皓元",1);
	}
}

/* 创建学生类 */
class StudentOverload{
	/**************************重载构造器*****************************/
	/*重写无参构造方法*/
	public StudentOverload(){
		System.out.println("重写无参构造器");
	}
	
	/*重载一个参数构造方法*/
	public StudentOverload(String str){
		System.out.println("重载传入字符串的构造器:"+str);
	}
	
	/*重载两个参数构造方法*/
	public StudentOverload(int i,String str){
		System.out.println("重载传入多参的构造器:"+"传入整型为->"+i+"/t传入字符串为->"+str);
	}
	
	/**************************重载方法*****************************/
	/*创建learn方法*/
	public void learn(){
		System.out.println("learn方法：学生学习");
	}
	
	/*重载learn方法，含两参*/
	public void learn(int id,String name){
		System.out.println("learn两参方法："+"id->"+id+"的学生->"+name+"在学习");
	}
	
	/*重载learn方法，含两参但参数位置类型不同*/
	public void learn(String name,int id){
		System.out.println("learn不同传入两参方法："+"id->"+id+"的学生->"+name+"在学习");
	}
}
