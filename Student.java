package studentmanagement;

public class Student {
	int studentId;
	String studentName;
	int marks;
	int grade;
	
	public Student() {
		studentId=-1;
		studentName="James";
		marks=-1;
		grade=-1;
	}
	
	public Student(int studentId, String studentName, int marks, int grade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.grade = grade;	
	}
	
	public Student(int studentId, String studentName) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void printStudentDetails() {
		System.out.println("Student Id : " +studentId);
		System.out.println("Student Name : " +studentName);
		System.out.println("Marks : " +marks);
		System.out.println("Grade : " +grade);
	}
	
	/*public void takeExam() {
		int marksScored = 0;
		if(marks>50) {
			marksScored=0;
		}
		System.out.println(marksScored);
		
		}*/

	public static void main(String[] args) {
		//int counter = 0;
		Student student1 = new Student(28,"John",95,94);
		System.out.println("Printing the details about student1");
		student1.printStudentDetails();
		
		Student student2 = new Student(77,"Jones");
		System.out.println("Printing the details about student2");
		student2.printStudentDetails();
		
		Student student3 = new Student();
		System.out.println("Printing the details about student3");
		student3.printStudentDetails();
		//s.takeExam();
	}

}
