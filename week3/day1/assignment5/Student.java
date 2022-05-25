package week3.day1.assignment5;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name is Aishwarya");
	}
	public void studentDept() {
		System.out.println("Students Department is ECE");
	}
	public void studentId() {
		System.out.println("Student Id is 1234");
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.collegeCode();
		student.studentDept();
		student.studentId();
		student.collegeName();
		
	}
}
