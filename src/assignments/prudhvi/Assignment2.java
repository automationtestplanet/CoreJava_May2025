package assignments.prudhvi;

public class Assignment2 {
	// Write program to print occurrences of each character in a string
	// Ex: hello
	// o/p: h-1, e-1, l-2, o-1
	public static void PrintCharacterCountInString(String str) {
		String s = "hello";
		char[] ch = s.toCharArray();
		boolean[] b = new boolean[s.length()];
		for (int i = 0; i < ch.length; i++) {
			if (b[i])
				continue;
			int c = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					c++;
					b[j] = true;
				}
			}
			System.out.println(ch[i] + " : " + c);
		}
	}

	public static void main(String[] args) {
		PrintCharacterCountInString("hello");
	}
}