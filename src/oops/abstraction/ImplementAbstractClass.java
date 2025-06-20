package oops.abstraction;

public class ImplementAbstractClass extends AbstractClass {

	public ImplementAbstractClass(String string1, String string2) {
//		AbstractClass(string1, string2); // not possible to call one class constructor in another class constructor directly.
		super(string1, string2);
	}
	
	public static void main(String[] args) {
		AbstractClass absCls = new ImplementAbstractClass("Hello", "Java");
		absCls.display();
	}

}
