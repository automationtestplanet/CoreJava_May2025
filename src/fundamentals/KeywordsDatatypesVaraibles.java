package fundamentals;

public class KeywordsDatatypesVaraibles {

	public static void main(String[] args) {
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		byte byte1 = 127;
		byte byte2 = -128;
//		byte byte2 = 128; // out of memory
		System.out.println(byte1);
		
		byte1 = 100;
		System.out.println(byte1);
		
		
		short short1 = 32767;
//		short short2 = 32768; // out of memory
		
		int int1 = 36365764;
//		int int2 = 3636576498; // out of memory		
//		int int3 = 10.5; // not a valid format for integer
		
		long long1 = 3636576498L;
		long long2 = 3636576498l;
		
		float float1 = 10.5F;
		float float2 = 10.5f;
		
		double double1 = 100.1636E234D;
		double double2 = 100.1636E234d;
		
		char char1 = 'A';
		char char2 = 'a';
		char char3 = '$';
		char char4 = '4';
		
//		char char5 = 'aa'; //cannot store, only single character 
		
		String string1 = "aa";
		String string2 = "Hello";
		String string3 = "Hello Java";
		String string4 = "Hello123";
		String string5 = "Hello123%$^#";
		
		Object obj1 = true;
		Object obj2 = 10;
		Object obj3 = 32767;
		Object obj4 = 36365764;
		Object obj5 = 3636576498L;
		Object obj6 = 10.5F;
		Object obj7 = 100.1636E234D;
		Object obj8 = 'A';
		Object obj9 = "Hello";
		
		
		var var1 = true;
		var var2 = 10;
		var var3 = 32767;
		var var4 = 36365764;
		var var5 = 3636576498L;
		var var6 = 10.5F;
		var var7 = 100.1636E234D;
		var var8 = 'A';
		var var9 = "Hello";
		
		
		int a;
		a = 100;  // it is an operation called assignment
		
		
		
	}

}
