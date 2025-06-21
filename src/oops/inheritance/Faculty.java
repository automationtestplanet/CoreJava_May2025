package oops.inheritance;

public class Faculty extends Student {
	String fName;
	String subject;
	
	public void displayFacultyDetails() {
		displayCollegeDetails();
		System.out.println("Fculty Name: "+ fName);
		System.out.println("Subject: "+ subject);
	}

}
