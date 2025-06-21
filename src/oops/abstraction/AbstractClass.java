package oops.abstraction;

abstract public class AbstractClass {

	String string1, string2;
	
	public AbstractClass(String string1, String string2) {
		this.string1 = string1;
		this.string2 = string2;
	}

	void display() {
		System.out.println(string1);
		System.out.println(string2);
	}
	
	public static void main(String[] args) {
//		AbstractClass absCls = new AbstractClass("Hello", "Java");		
//		absCls.display();
	}
}
