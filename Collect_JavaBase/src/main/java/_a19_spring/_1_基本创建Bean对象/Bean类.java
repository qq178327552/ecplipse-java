package _a19_spring._1_基本创建Bean对象;

public class Bean类 {
	private int id;
	private String name;
	public Bean类() {
		super();
		System.out.println("------Bean对象创建------");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void init_user() {
		System.out.println("创建对象之后，初始化");
	}
	public void destroy_user() {
		System.out.println("IOC容器销毁，user对象回收!");
	}
}
