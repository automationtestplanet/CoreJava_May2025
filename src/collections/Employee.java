package collections;

public class Employee {
	private String empName;
	private long empId;
	private String empDept;
	private long empSalary;

	public Employee(String empName, long empId, String empDept, long empSalary) {
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
}
