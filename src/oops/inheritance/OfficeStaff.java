package oops.inheritance;

public class OfficeStaff extends Faculty {

	String officeStaffName;
	String department;

	public void displayOffceStaffDetails() {
		displayCollegeDetails();
		System.out.println("Office Staff Name: " + officeStaffName);
		System.out.println("Depatment: " + department);
	}
}
