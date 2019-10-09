package _a20_sql.hibernate._1_连接基础;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
/**
 * 调用hibernate框架中的数据,保存数据
 * 	1.在程序中创建与数据库对应的对象
 * 	2.获取加载配置文件的管理类对象
 * 	3.创建session的工厂对象
 * 	4.创建session (代表一个会话，与数据库连接的会话)
 * 	5.开启事务
 * 	6.保存-数据库
 * 	7.提交事务
 * 	8.关闭
 * @author zheng
 *
 */
public class _1_hibernate_base {
	public void testHello() throws Exception {
		/*1.在程序中创建与数据库对应的对象*/
		Bean emp = new Bean();
		emp.setEmpName("班长");
		emp.setWorkDate(new Date());
		/*2.获取加载配置文件的管理类对象*/
		Configuration config = new Configuration();
		config.configure();//默认加载src/hibenrate.cfg.xml文件
		/*3.创建session的工厂对象,在hibenrate.cfg.xml中的标签*/
		SessionFactory sf = config.buildSessionFactory();
		/*4.创建session (代表一个会话，与数据库连接的会话)*/
		Session session = sf.openSession();
		/*5.开启事务*/
		Transaction tx = session.beginTransaction();
		
		/*6.操作数据库--增删改查*/
		session.save(emp);
		session.update(emp);//此时主键必须有值
		Bean employee = (Bean)session.get(Bean.class, 1);//通过主键查询
		employee = (Bean)session.load(Bean.class, 1);//通过主键查询(支持懒加载)
		session.saveOrUpdate(emp);//保存或更新
		Query q = session.createQuery("from Employee where empId=1 or empId=2");
		List<Bean> list = q.list();//HQL查询条件结果
		Criteria criteria = session.createCriteria(Bean.class);
		list = criteria.list();//Criteria查询全部
		criteria.add(Restrictions.eq("empId", 1));
		list = criteria.list();//Criteria条件查询
		SQLQuery sqlQuery = session.createSQLQuery("select * from employee").addEntity(Bean.class);
		list = sqlQuery.list();//SQL语句查询,把每一行记录封装为 指定的对象类型
		sqlQuery = session.createSQLQuery("select * from employee");//SQL语句查询,把每一行记录封装为对象数组，再添加到list集合
		
		/*7.提交事务*/
		tx.commit();
		/*8.关闭*/
		session.close();
		sf.close();//dao里一般不关闭session对象
	}
}