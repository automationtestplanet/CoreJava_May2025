package fundamentals;

public class WrapperClasses {

	public static void main(String[] args) {

		byte b1 = 100; // primitive

//		String str1 = b1; // implicit conversion   // primitive to non-primitive
//		String str2 = (String) b1; // explicit conversion // primitive to non-primitive

		String str = "100";

//		byte b2 = str; // implicit conversion   //  non-primitive to primitive
//		byte b2 = (byte)str; // explicit conversion // non-primitive to primitive

		Boolean bool1 = false;
		Byte byte1 = 100;
		Short short1 = 100;
		Integer int1 = 100;
		Float float1 = 10.5F;
		Long long1 = 1000L;
		Double double1 = 10.5001D;
		Character char1 = 'A';

		byte b2 = byte1; // non-primitve to primitive with wrapper class
		Byte byte2 = b1; // primitive to non-primitive with the wrapper class

		byte b3 = 100; // primitive

		String str1 = String.valueOf(b1); // primitive to String

		String str3 = "100";

		byte b4 = Byte.parseByte(str3); // String to primitive
		short s2 = Short.parseShort(str3); // String to primitive
		int b4i1 = Integer.parseInt(str3); // String to primitive
		float f1 = Float.parseFloat(str3); // String to primitive
		long l2 = Long.parseLong(str3); // String to primitive
		double d1 = Double.parseDouble(str3); // String to primitive
		
		String str4 = "true";
		boolean bool2 = Boolean.parseBoolean(str4);
		System.out.println(bool2);
		
		
		String str5 = "Hello";
		
//		byte b5 = Byte.parseByte(str5); // Error
		
		boolean bool3 = Boolean.parseBoolean(str5);
		System.out.println(bool3); // false
		
		String str6 = "A";
		char ch = str6.charAt(0);
		System.out.println(ch);
		
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		

	}

}
