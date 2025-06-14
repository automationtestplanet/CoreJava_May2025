package fundamentals;

public class ConstructorExample {

	static String a;
	static int b;

	char c;
	float d;

//	public ConstructorExample() {
//		a = "Hello";
//		b = 200;
//		c = 'A';
//		d = 10.5F;
//	}
	
	public ConstructorExample(String a, int b, char c, float d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		
//		int e= 100;
//		e=e;
	}
	
	
	public static void addition(int a, int b) {
//		static int c=10;
//		static int d=20;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public void subtraction(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
//		ConstructorExample();
		System.out.println(a);
		System.out.println(b);
		
//		System.out.println(c);
//		System.out.println(d);
		
		addition(100,200);
		
//		subtraction(100,200);
		
		int a = 1000;
		
		ConstructorExample consEx = new ConstructorExample("Hello",100, 'A',10.5F);
		// it allocates memory for instance variables and also, it initilizes global variables.
		System.out.println(consEx);
		
		System.out.println(consEx.c);
		System.out.println(consEx.d);
		consEx.subtraction(1000, 2000);
		
		ConstructorExample consEx2 = new ConstructorExample("Java",200, 'B',20.5F);
		System.out.println(ConstructorExample.a);
		System.out.println(b);
		System.out.println(consEx2.c);
		System.out.println(consEx2.d);
		
	}

}
