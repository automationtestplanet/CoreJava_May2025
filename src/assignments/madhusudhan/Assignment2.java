package assignments.madhusudhan;

import java.util.Arrays;

public class Assignment2 {
	// Write a program to check two strings are anagrams/identical or not
	// ex: "listen" and "silent" are anagrams
	// "race" and "care" are anagrams
	// "act" and "cat" are anagrams
	// "bat" and "rat" are not anagrams
	static boolean areAnagrams(String s1, String s2) {
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		return Arrays.equals(s1Array, s2Array);
	}

	public static void main(String[] args) {
		String s1 = "geeks";
		String s2 = "kseeg";
		System.out.println(areAnagrams(s1, s2));
	}

}
