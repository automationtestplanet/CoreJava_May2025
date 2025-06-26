package innerclasses;

public class ImplementsAbstractClass extends AbstractClass {

	@Override
	public void addition(int a, int b) {
		System.out.println(a+b);		
	}
	
	public static void main(String[] args) {
		AbstractClass absCls = new ImplementsAbstractClass();
		absCls.addition(100, 200);
	}

}
