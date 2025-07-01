package stringclasses;

import java.util.StringTokenizer;

public class StringClasses {

	public static void main(String[] args) throws Throwable {
		String string1 = "Hello";				// String constant(Literals) pool
		String string2 = new String("Hello");   // Heap Memory
		
		System.out.println(string1==string2);   // binary comparison ->  Memory comparison
		System.out.println(string1==string2.intern()); 
		System.out.println(string1.equals(string2));  // value comparison
		
		System.out.println("--------------------String Class---------------------------");
		
		String string3 = "Java";
		System.out.println(string3);
		System.out.println(string3.concat(" World"));   // Unreferenced object
		System.out.println(string3);  // String immutability
		
		string3 = string3.concat(" Program");  // new object is referred by string3
		System.out.println(string3);
		
		StringClasses strCls = new StringClasses();
		strCls.finalize();   // JVM always calls this method to clear the garbage (Unreferenced objects)
		
		
		System.out.println("--------------------------------String Builder Class--------------------");
		StringBuilder strBuilder = new StringBuilder("Java");
		System.out.println(strBuilder);
		System.out.println(strBuilder.append(" World"));
		System.out.println(strBuilder);
		System.out.println(strBuilder.toString().toUpperCase());   // it creates new String object
		System.out.println(strBuilder);
		System.out.println(strBuilder.reverse());
		System.out.println(strBuilder);
		
		System.out.println("--------------------------------String Buffer Class--------------------");
		StringBuffer strBuffer = new StringBuffer("Java");
		System.out.println(strBuffer);
		System.out.println(strBuffer.append(" World"));
		System.out.println(strBuffer);
		System.out.println(strBuffer.toString().toUpperCase());   // it creates new String object
		System.out.println(strBuffer);
		System.out.println(strBuffer.reverse());
		System.out.println(strBuffer);
		
		System.out.println("--------------------------------StringTokennizer--------------------");
		StringTokenizer strTokens = new StringTokenizer("Hello Java World");
		while(strTokens.hasMoreTokens()) {
			System.out.println(strTokens.nextToken());
		}
		
		while(strTokens.hasMoreElements()) {
			System.out.println(strTokens.nextElement());
		}


	}

}
