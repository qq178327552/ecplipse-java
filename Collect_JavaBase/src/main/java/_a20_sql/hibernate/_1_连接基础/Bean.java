package _a20_sql.hibernate._1_连接基础;

import java.util.Date;

/**
 * 数据库中对应的员工对象
 * @author zheng
 *
 */
public class Bean {
	private int empId;
	private String empName;
	private Date workDate;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getWorkDate() {
		return workDate;
	}
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", workDate=" + workDate + "]";
	}
}