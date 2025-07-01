package collections;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQuestions3 {

	public static void main(String[] args) {
		String str = "hello this is java";

		System.out.println("-----------------------With Loops---------------");

		while (str.length() > 0) {
			char firstChar = str.charAt(0);
			int count = 0;

			for (char eachChar : str.toCharArray()) {
				if (eachChar == firstChar)
					count++;
			}

			System.out.print(firstChar + " : " + count + "|");
			str = str.replaceAll(String.valueOf(firstChar), "");
//			System.out.println(str);
		}
		System.out.println("");

		String str2 = "hello this is java";
		System.out.println("-----------------------With Collections---------------");

		Map<Character, Integer> charsMap = new LinkedHashMap<>();

		for (char eachChar : str2.toCharArray()) {
			if (charsMap.containsKey(eachChar)) {
				charsMap.put(eachChar, charsMap.get(eachChar) + 1);
			} else {
				charsMap.put(eachChar, 1);
			}
		}

		System.out.println(charsMap);

		System.out.println("-----------------------With Streams---------------");
		String str3 = "hello this is java";
		var charsMap2 = str3.chars().mapToObj(eachChar -> (char) eachChar)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charsMap2);
		
		var charsMap3 = str3.chars().mapToObj(eachChar -> (char) eachChar)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(charsMap3);

	}

}
