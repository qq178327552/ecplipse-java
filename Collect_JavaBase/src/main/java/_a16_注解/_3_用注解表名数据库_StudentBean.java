package _a16_注解;
/**
 * 用注解表名数据库中的对应信息
 * @author zheng
 *
 */
@_3_设置注解("tb_student")
public class _3_用注解表名数据库_StudentBean {
	
	@_3_设置注解属性(columnName="id",type="int",length=10)
	private int id;
	@_3_设置注解属性(columnName="sname",type="varchar",length=10)
	private String studentName;
	@_3_设置注解属性(columnName="age",type="int",length=3)
	private int age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
