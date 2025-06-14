package fundamentals;

import java.util.Iterator;

public class LoopingStatements {

	public static void printTaables(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " X " + i + " = " + (i * number));
		}
	}

	public static void main(String[] args) {

//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");
//		System.out.println("Hello Java");

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello Java");
		}

		printTaables(98);

		int a = 15;
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a--;
			}
			System.out.println("");
		}

		System.out.println("---------------------------------------------");
		int p = 1;
		while (p <= 10) {
			p++;
			if (p < 6) {
				continue;
			}
			System.out.println(p);
		}

		System.out.println("---------------------------------------------");

		int x = 11;

		do {
			System.out.println(x);
			x++;
		} while (x <= 10);
	}

}
