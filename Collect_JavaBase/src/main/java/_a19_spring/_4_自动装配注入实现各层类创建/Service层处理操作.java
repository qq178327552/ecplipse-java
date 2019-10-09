package _a19_spring._4_自动装配注入实现各层类创建;

public class Service层处理操作 {
	
	private Dao层数据操作 userDao; // = new UserDao();
	// IOC：对象的创建交给spring的外部容器完成
	public void setUserDao(Dao层数据操作 userDao) {
		this.userDao = userDao;
	}

	public void save() {
		userDao.save();
	}
}
