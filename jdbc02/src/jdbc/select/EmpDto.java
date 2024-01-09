package jdbc.select;
//getter setter 만들고 
//우리가 했던 입력이랑 비슷하네
// 쉽게 말하면 그릇
public class EmpDto {
	private int empNo;
	private String empName;
	private String empDept;
	private String empDate;
	private int empSal;
	
	public EmpDto() {
		super();
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpDate() {
		return empDate;
	}
	public void setEmpDate(String empDate) {
		this.empDate = empDate;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	
	
}
