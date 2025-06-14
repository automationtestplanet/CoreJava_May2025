package fundamentals;

public class TypesOfMethods {

	static int x =11;
//	static int x =100; 
	static int y=2;
	static int z;;
	
	public static void multiplication() { // without parameters
		int x = 11;
		int y = 2;
		System.out.println("Multiplication: "+ (x*y));
	}
	
	public static void addition(int x, int y) {	  // with parameters
		int z=10;
//		int z = 100;
//		int x = 1000;
		System.out.println("Addition: "+ (x+y));
		
		int p;		
//		System.out.println(p);
		
	}
	
	public static void subtraction() {
		System.out.println("Subtraction: "+ (x-y));
		
		System.out.println(z);
	}
	
	public static int division() {
		int x = 11;
		int y = 2;
		return x/y;
	}
	
	public static boolean compareData(int a,int b) {
		return a<b;
	}
	
	public static int modDivision(int a,int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		addition(1000,2000);
		
		System.out.println(division());
		
		int a=1000;
		System.out.println(a);
		
		
		int result = modDivision(1000001, 100000);
		System.out.println(result);
	}

}
