package fundamentals;

public class StringClassMethods {

	public static void main(String[] args) {

		String str = "Hello Java";

		System.out.println(str); // Hello Java
		System.out.println(str.toUpperCase()); // HELLO JAVA
		System.out.println(str); // Hello Java

		str = str.toUpperCase();
		System.out.println(str); // HELLO JAVA

		System.out.println(str.toLowerCase());

		System.out.println(str.equals("Hello Java")); // false
		System.out.println(str.equalsIgnoreCase("Hello Java")); // true

		System.out.println(str.contains("HELLO"));
		System.out.println(str.contains("JAVA"));
		System.out.println(str.contains("WORLD"));

		System.out.println(str.concat(" WORLD"));
		System.out.println(str);

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));

		System.out.println(str.charAt(9));

		System.out.println(str.length());
		System.out.println(str.length() - 1);

		System.out.println(str.indexOf("A"));
		System.out.println(str.lastIndexOf("A"));

		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(6, 10));
		System.out.println(str.substring(6));

		System.out.println(str);

		System.out.println(str.replace("A", "O"));
		System.out.println(str.replaceFirst("A", "O"));

		System.out.println(str.replaceAll("A", "B"));

		String str2 = "abcDEF123#%$^&";
		System.out.println(str2.replaceAll("[^a-z]", ""));
		System.out.println(str2.replaceAll("[^a-zA-Z]", ""));
		System.out.println(str2.replaceAll("[a-zA-Z]", ""));
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str2.replaceAll("[a-zA-Z0-9]", ""));
		System.out.println(str2.replaceAll("[^0-9]", ""));

		String string1 = "Hello";
		String string2 = "Hello";
		String string3 = new String("Hello");
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);

		System.out.println(string1 == string2); // true
		System.out.println(string1 == string3); // false // binary comparison (memory binary code)
		System.out.println(string1.equals(string3)); // true // value comparison

		System.out.println(str);

		String[] strArr = str.split(" ");
		for (String eachStr : str.split(" ")) {
			System.out.println(eachStr);
		}

		char[] charArr = str.toCharArray();

		for (char eachChar : str.toCharArray()) {
			System.out.println(eachChar);
		}
	}

}
