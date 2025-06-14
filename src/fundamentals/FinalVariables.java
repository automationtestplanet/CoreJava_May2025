package fundamentals;

public class FinalVariables {
	
	final int a = 100;
	final static int b = 200;
	 
	
	
	public static void method1(final int d) {
//		d = 4000;
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		final int c = 300;
		
		FinalVariables finVar = new FinalVariables();
//		finVar.a = 1000;
		System.out.println(finVar.a);
//		FinalVariables.b = 2000;
		System.out.println(FinalVariables.b);
//		c = 3000;
		System.out.println(c);
		
		FinalVariables.method1(400);
		

	}

}
