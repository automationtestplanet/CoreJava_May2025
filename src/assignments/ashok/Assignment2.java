package assignments.ashok;

public class Assignment2 {

	// Consider alphabets as numbers and print the number in the place of character
	// ABC -> 123
	// CAB -> 312
	// BCA -> 231
	// HELLO -> 85121215

	public static void alphabetToNumber(String str) {
		char ch[] = str.toCharArray();
		for (char eachChara: str.toCharArray()) {
			int number = eachChara;
			int number_integer = 64;
			if (number <= 90 & number >= 65)
				System.out.print(number - number_integer);
		}
	}

	public static void main(String[] args) {
		alphabetToNumber("HELLO");
	}
}
