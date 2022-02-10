package inheirtance;

public class Employee {
	int employeeId;
	String employeeName;
	int salary=9000;
	public void submitDocuments(){
		System.out.println("Submitting documents");
	}
	public Employee() {
		System.out.println("Employee default cons called");
	}
	
	public Employee(int employeeId, String employeeName) {
		System.out.println("Employee parametrized cons callled");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}

}
