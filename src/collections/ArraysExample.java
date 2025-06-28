package collections;

public class ArraysExample {
	
//	public void display(int value) {
//		System.out.println(value);
//	}
	
	public void display(Object value) {
		System.out.println(value);
	}
	
	public Object getValue(Object value) {
		return value;
	}

	public static void main(String[] args) {
		int[] intArr1 = { 10, 20, 30, 40 };
//		int[] intArr2 = {"String",20,30, 40};  // accepts only homo-genious elements
//		int[] intArr2 = {10.5,20,30, 40}; // accepts only homo-genious elements
//		int[] intArr2 = {true,20,30, 40}; // accepts only homo-genious elements

//		intArr1[4] = 50; // error due to size is fixed
		
		//Object class is the parent class for all primitive and  non-primitive datatypes, we can store any type of value in Object type
		
		Object obj1 = true;  // Implicit Conversion
		Object obj2 = 10;
		Object obj3 = 32767;
		Object obj4 = 36365764;
		Object obj5 = 3636576498L;
		Object obj6 = 10.5F;
		Object obj7 = 100.1636E234D;
		Object obj8 = 'A';
		Object obj9 = "Hello";
		Object obj10 = new ArraysExample();  // Up-castng
		
		Object[] objArr = {"Hello", true, 10.5, 100,'A', new ArraysExample()};   // Object Array -> size is fixed
		
		
		
		ArraysExample arrEx = new ArraysExample();
		
//		arrEx.display(100);
//		arrEx.display("Hello");
//		arrEx.display(true);
//		arrEx.display(10.5);
		
		arrEx.display(100);
		arrEx.display("Hello");
		arrEx.display(true);
		arrEx.display(10.5);
		
		
		int int1 = (int)arrEx.getValue(100); // Explicit conversion
		
		ArraysExample arrExample = (ArraysExample)arrEx.getValue(new ArraysExample());  // downcast it
		
		String str = (String)arrEx.getValue("String"); // downcast it
		
		
		// In the below lines we will get the runtime exception (ClassCastException), we should not allow this type of conversion
		int int2 = (int)arrEx.getValue("String");  // Explicit Conversion
		String str2 = (String)arrEx.getValue(new ArraysExample());  // DownCasting
		
		// 'var' means variant and it is just a keyword, we can not use it as datatype, 
		// By default it converts the variable into assigned the data type
		
		var var1 = true;
		var var2 = 10;
		var var3 = 32767;
		var var4 = 36365764;
		var var5 = 3636576498L;
		var var6 = 10.5F;
		var var7 = 100.1636E234D;
		var var8 = 'A';
		var var9 = "Hello";
		
//		var var3;
//		var3 = 1000;
		
		var1 = false;
//		var1 = 100; // can't assign int value
	}

}
