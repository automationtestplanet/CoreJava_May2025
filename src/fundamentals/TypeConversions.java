package fundamentals;

public class TypeConversions {
	
	public static int division(int a,int b) {
		return a/b;
	}
	
	public static byte modDivision(int a,int b) {
		return (byte)(a/b);
	}

	public static void main(String[] args) {
		
		byte byte1 = 100;  // 1 byte
		
		short short1 = byte1;  //  2 bytes -> 1 byte of data can fit into 2 bytes // Implicit Conversion
		
//		byte1 = short1;  // 2 bytes of data can not fit into 1 byte.
		
		byte1 = (byte)short1; // Explicit Conversion
		
		short short2 = 1000;
		System.out.println("Short Value: "+ short2);
//		byte byte2 = 1000; //+127
//		byte byte2 = short2;
		byte byte2 = (byte)short2;  // -128 to +127  -> 
		System.out.println("Byte Value: "+ byte2);
		
		byte byte3 = (byte)130;
		System.out.println("Byte Value: "+ byte3);
		
		
		float float1 = 10.5f;  // 4 bytes
		System.out.println("Float Value: "+ float1);
		
//		int int1 = float1;  // 4 bytes
		
		int int1 = (int)float1; // explicit Conversion
		System.out.println("Int Value: "+ int1);
		
		float1 = int1; // no loss of data
		System.out.println("Float Value: "+ float1);
		
		
		String a = "10";
		System.out.println(a);
		
		
//		byte byte4 = a;  // can not convert non-primitive to primitive
//		int int2 = (int)a;
//		long long1 = (float)a;
		
		long long2 = 10000;
//		String b = long2; // can not convert primitive to non-primmitive
//		String b = (String)long2;
		
//		int result = division(1000,100);
		byte result = (byte)division(1000,100);
	}

}
