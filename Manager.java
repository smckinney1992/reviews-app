package inheirtance;

public class Manager extends Employee{
	String departmentName;
	int salary = 18000;
	public Manager() {
		System.out.println("Manager default cons called");
	}
	
	public Manager(String departmentName) {
		super();
		System.out.println("Manager parameterized cons called");
		this.departmentName = departmentName;
	}
	
	public Manager(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		System.out.println("Manager parameterized cons called");
	}
	
	public void displayManagerDetails() {
		System.out.println("Manager Id : "+employeeId);
		System.out.println("Manager Name : "+employeeName);
		System.out.println("Department Name : "+departmentName);
		System.out.println("Local Salary : "+salary);
		System.out.println("Manager Salary : "+this.salary);
		System.out.println("Employee Salary: "+super.salary);
	}

}
