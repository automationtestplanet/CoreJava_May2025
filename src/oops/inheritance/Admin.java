package oops.inheritance;

public class Admin extends Faculty {
	String adminName;

	public void displayAdminDetails() {
		displayCollegeDetails();
		System.out.println("Admin Name: " + adminName);
	}
}
