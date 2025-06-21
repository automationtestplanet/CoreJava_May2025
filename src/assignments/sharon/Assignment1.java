package assignments.sharon;

public class Assignment1 {

	// Write a reusable method to find the consonants count in a given string.
	// Ex: hello -> hll -> 3
	// java -> jv -> 2

	public static void countconsonants(String str) {

		str = str.toLowerCase();

		String onlyConsonants = str.replaceAll("[aeiou]", "");

		System.out.println("Number of consonants: " + onlyConsonants.length());
	}

	public static void main(String[] args) {

		countconsonants("java");

	}
}
