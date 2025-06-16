package assignments.raju;

public class Assignment1 {

	// Write a reusable method to find out duplicate characters count from a string
	// ex:hello -> ll : 2, java -> a:2, JAva -> a:2
	public static void findDuplicateCharsCountFromString(String str) {
		String newStr = str.toLowerCase();
		while (newStr.length() > 0) {
			char ch = newStr.charAt(0);
			int count = 0;
			for (char eachChar : newStr.toCharArray()) {
				if (eachChar == ch) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(ch + " : " + count);
			}
			newStr = newStr.replaceAll(String.valueOf(ch), "");
		}
	}

	public static void main(String[] args) {
		System.out.println("---------------find duplicate characters count from a given string---------");
		findDuplicateCharsCountFromString("malayalam");
	}
}
