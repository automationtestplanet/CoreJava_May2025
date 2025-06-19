package oops.inheritance;

public class Student extends College {

	String sName;
	int sRollNo;
	String sQualification;

	public void displayStudentDetails() {
		displayCollegeDetails();
		System.out.println("Student Name: " + sName);
		System.out.println("Student Rol Number: " + sRollNo);
		System.out.println("Student Qualification: " + sQualification);

	}

}
