package fundamentals;

public class Operators {

	public static void main(String[] args) {
		System.out.println("------------------Assignment Operator--------------"); // value
		int a;
		a = 100;  // it is an operation called assignment
		
		
		System.out.println("------------------Arithematic Operators--------------"); //value
		int x = 11;
		int y = 2;
		
		System.out.println("Addition: "+ (x+y));
		System.out.println("Subtraction: "+ (x-y));
		System.out.println("Multiplication: "+ (x*y));
		System.out.println("Division Quotient: "+ (x/y));
		System.out.println("ModDivison Remainder: "+ (x%y));
		
		System.out.println("------------------Incremental/Decremental Operators--------------"); // value
		
		int p=10;
		System.out.println(++p); //11
		System.out.println(--p); // 10
		
		p+=5;
		System.out.println(p);
		p-=5;
		System.out.println(p);
		p*=5;
		System.out.println(p);
		
		p/=5;
		System.out.println(p);
		p%=3;
		System.out.println(p);
		
		System.out.println(++p); // pre-increment
		System.out.println(p++); // post-increment
		System.out.println(p);
		
		
		System.out.println(--p); // pre-decement
		System.out.println(p--); // post-decrement
		System.out.println(p);
		
		System.out.println("------------------Comparision Operators--------------"); //true/false
		a=10;
		int b = 20;
		
		System.out.println(a==b); //false
		System.out.println(a<b); //true
		System.out.println(a>b); //false
		System.out.println(a<=b); //any one condition is true it becomes true // true
		System.out.println(a>=b); //any one condition is true it becomes true // false
		System.out.println(a!=b); //true
		
		System.out.println("------------------Logical Operators--------------"); //true/false
		a = 100;
		b = 200;
		
		System.out.println(a<b && a==b && a>b); // In case &&, if all conditions True , it become true
												// T && F && F -> false
		
		System.out.println(a<b || a==b || a>b); // In case ||&, if any one conditions True , it become true
												// T || F || F -> true
		
		System.out.println(!(a<b || a==b || a>b)); // to make result in a opposite way // False
		System.out.println(!(a<b && a==b && a>b));
		
		System.out.println("------------------Ternary Operators--------------"); // any value
		
		a = 1000;
		b = 2000;
		
		System.out.println((a<b)?true:false);
		System.out.println((a>b)?true:false);	
		
		System.out.println((a<b)?a:b);
		System.out.println((a>b)?a:b);	
		
		System.out.println((a<b)?"A is greater tha B":"B is greater than A");
		System.out.println((a>b)?"A is greater tha B":"B is greater than A");
		
		
	}

}
