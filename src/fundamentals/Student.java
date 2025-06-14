package fundamentals;

public class Student {

	static String collegeName;
	String sName;
	int rollNo;
	static String qualification;

	public Student(String collegeName, String sName, int rollNo, String qualification) {
		this.collegeName = collegeName;
		this.sName = sName;
		this.rollNo = rollNo;
		this.qualification = qualification;
	}

	public void displayStudentDetails() {
		System.out.println("CollegeName: " + collegeName);
		System.out.println("StudentName: " + sName);
		System.out.println("Roll Number: " + rollNo);
		System.out.println("QUalification: " + qualification);
	}

	public static void main(String[] args) {
		Student s1 = new Student("MVR", "RAM", 1001, "Btech"); // Object
		System.out.println("----------------------------Student1 Details--------------------------");
		s1.displayStudentDetails();

		Student s2 = new Student("MVR", "KRISH", 1002, "BTech"); // Object
		System.out.println("----------------------------Student2 Details--------------------------");
		s2.displayStudentDetails();
		System.out.println("----------------------------Modifedd Student2 Name--------------------------");
		s2.sName = "KRISHNA";
		s2.displayStudentDetails();
		System.out.println("----------------------------Student1 Details--------------------------");
		s1.displayStudentDetails();

		s1.collegeName = "BVR";
		System.out.println("----------------------------Student1 Details--------------------------");
		s1.displayStudentDetails();

		System.out.println("----------------------------Student2 Details--------------------------");
		s2.displayStudentDetails();
	}

}
