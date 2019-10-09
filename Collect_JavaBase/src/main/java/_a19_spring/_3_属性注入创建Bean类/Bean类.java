package _a19_spring._3_属性注入创建Bean类;

public class Bean类 {
	private int id;
	public String name;
	public Bean类(){}
	public Bean类(int id) {
		this.id=id;
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
