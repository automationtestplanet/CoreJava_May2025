package functionalinterfaces;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		FunctionalInterface2 funInf2 = (str)-> {System.out.println(str);};
		funInf2.display("Hello");
		
		FunctionalInterface2 funInf2_1 = str-> System.out.println(str);
		funInf2_1.display("Java");
		
		
		FunctionalInterface3 funInf3 = (a)->{return a;};
		System.out.println(funInf3.returnValue(100));
		
		FunctionalInterface3 funInf3_1 = a-> a;
		System.out.println(funInf3_1.returnValue(2000));
		
		
		FunctionalInterface4 funInf4 = (a,b)-> a*b;
		System.out.println(funInf4.multiplication(10, 5));
		
		FunctionalInterface1 funInf1 = (val1,val2)->System.out.println(val1+val2);
		funInf1.addition(1000, 500);
		
		FunctionalInterface5 funInf5 = (val1,val2)-> val1>val2;
		System.out.println(funInf5.compareNumbers(10, 20));
		System.out.println(funInf5.compareNumbers(20, 10));
	}

}
