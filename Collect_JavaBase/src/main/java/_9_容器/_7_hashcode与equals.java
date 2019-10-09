package _9_容器;

import java.util.Date;
/**
 * 重写hashcode和equals方法
 * 		equals:值的比较
 * 		hashcode：散列存储
 * 			equals相等，则hashcode一定相等
 * @author zheng
 *
 */
public class _7_hashcode与equals  extends Object{
	private Integer id;
	private String name;
	private Date birthday;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_7_hashcode与equals other = (_7_hashcode与equals) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
