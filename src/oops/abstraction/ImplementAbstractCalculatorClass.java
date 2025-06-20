package oops.abstraction;

public class ImplementAbstractCalculatorClass extends AbstractCalculatorClass{

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a-b;
	}

	@Override
	public int multipliation(int a, int b) {
		return a*b;
	}
	
	
//	@Override
	public float division(float a, float b) {
		return a / b;
	}
	
	@Override
	public int modDivison(int a, int b) {
//		return this.modDivison(a,b) * 10;
		
//		System.out.println(this.division(a, b));
		return super.modDivison(a,b) * 10;
		
		
	}
}
