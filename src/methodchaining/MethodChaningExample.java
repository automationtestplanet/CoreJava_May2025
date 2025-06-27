package methodchaining;

public class MethodChaningExample extends ParentClas{

	String firstName;
	String lastName;
	String fullName;

	public MethodChaningExample setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public MethodChaningExample setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public MethodChaningExample setFullName() {
		this.fullName = firstName + " " + lastName;
		return this;
	}

	public ParentClas displayName() {
		System.out.println(fullName);
		return this;
	}

	public static void main(String[] args) {
		
		MethodChaningExample obj = new MethodChaningExample();
		
		obj.setFirstName("T");
		obj.setLastName("Sharon");
		obj.setFullName();
		obj.displayName();
		
		obj.setFirstName("T").setLastName("Sharon").setFullName().displayName().reverse(obj.fullName);

	}

}
