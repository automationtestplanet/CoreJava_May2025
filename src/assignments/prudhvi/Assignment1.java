package assignments.prudhvi;
//Write a reusable method to convert each character into number and make the sum of a given word.

// Ex: java -> 106 + 97 + 118 + 97 -> 418;
// ASCCI Codes of each character are ->  j->106, a-97, v-> 118, a- 97

public class Assignment1 {
	public static int getAsciiSum(String word) {
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			sum += word.charAt(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		String value = "java";
		int result = getAsciiSum(value);
		System.out.println("ASCII sum of" + value + "is" + result);
	}
}
