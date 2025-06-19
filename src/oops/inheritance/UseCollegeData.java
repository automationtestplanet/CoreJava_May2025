package oops.inheritance;

public class UseCollegeData {

	public static void main(String[] args) {
		
		Faculty faculty1 = new Faculty();
		
		faculty1.fName = "Raju";
		faculty1.subject = "Automation Testing";
		
		faculty1.displayFacultyDetails();
		
		Student studetn1 = new Student();
		studetn1.sName = "Suresh";
		studetn1.sRollNo = 101;
		studetn1.sQualification = "BTech";
		
		studetn1.displayStudentDetails();
		
//		studetn1.displayFacultyDetails(); // can not access
		
		faculty1.displayStudentDetails(); // can be accessed
		
	}

}
