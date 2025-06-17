package assignments.raju;

public class Assignment2 {

	// Write a reusable method to print unique Characters from the string
	public static void printUniqueCharactersFromString(String str) {
		while (str.length() > 0) {
			char ch = str.charAt(0);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println(ch);
			}
			str = str.replaceAll(String.valueOf(ch), "");
		}
	}

	public static void main(String[] args) {
		System.out.println("-------------print unique Characters from the string------------");
		printUniqueCharactersFromString("malayalam");
	}
}
