package _a19_spring._2_构造器创建Bean对象;

public class Bean类 {
	private int id;
	private String name;
	
	public Bean类() {
		super();
		System.out.println("------User对象创建【无参数构造器】------");
	}
	public Bean类(int id, String name) {
		System.out.println("-----User对象创建【带参数构造器】--------");
		this.id = id;
		this.name = name;
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
}
