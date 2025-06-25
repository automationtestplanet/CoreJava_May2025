package innerclasses;

public class AnnonymousClass {

	public static void main(String[] args) {
		
		AbstractClass absCls = new AbstractClass() {			
			@Override
			public void addition(int a, int b) {
				System.out.println(a+b);
			}
		};		
		absCls.addition(1000, 2000);
		
		
		Interface1 inf1 = new Interface1() {			
			@Override
			public void multiplication(int a, int b) {
				System.out.println(a*b);
			}
			
			@Override
			public void division(int a, int b) {
				System.out.println(a/b);
			}
		};
		
		inf1.multiplication(50, 50);
		
	}

}
