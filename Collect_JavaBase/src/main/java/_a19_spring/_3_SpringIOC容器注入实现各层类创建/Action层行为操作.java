package _a19_spring._3_SpringIOC容器注入实现各层类创建;

public class Action层行为操作 {

	// Service: springIOC容器注入
	private Service层处理操作 userService;
	public void setUserService(Service层处理操作 userService) {
		this.userService = userService;
	}
	

	public String execute() {
		userService.save();
		return null;
	}
}








