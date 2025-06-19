package assignments.ashok;

//Write a reusable method extract numbers from given string and calculate sum of digits

// Ex: He12L3@^$4F%5" -> 12345 -> 1+2+3+4+5 = 15
//o/P: 15

public class Assignment1 {
	public static int calculateDigitSum(String input) {
		int sum = 0;

		for (char ch : input.toCharArray()) {
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String testString1 = "Hel12L3@&4F%5";
		int result = calculateDigitSum(testString1);
		System.out.println("Sum of digits: " + result);
	}
}
