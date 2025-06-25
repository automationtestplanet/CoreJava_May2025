package innerclasses;

import functionalinterfaces.FunctionalInterface1;

public class UseFunctionalInterafce1 {

	public static void main(String[] args) {
//		FunctionalInterface1 funInf1 = new FunctionalInterface1() {			
//			@Override
//			public void addition(int a, int b) {
//				System.out.println(a+b);
//			}
//		};
//		funInf1.addition(10, 20);
		
		FunctionalInterface1 funInf2 = (a,b)-> {System.out.println(a+b);};  // lambda expression
		funInf2.addition(100, 200);
		
		FunctionalInterface1 funInf3 = (a,b)-> System.out.println(a+b);  //lambda expression
		funInf3.addition(1000, 2000);
	}

}
