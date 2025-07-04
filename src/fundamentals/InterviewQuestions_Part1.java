package fundamentals;

public class InterviewQuestions_Part1 {

	// swap two values using third variable
	public static void swapValuesUsing3rdVariable() {
		System.out.println("----------------swap values using third variable-----------------");
		int a = 100;
		int b = 200;

		System.out.println("Before Swaping A value: " + a);
		System.out.println("Before Swaping B value: " + b);

		int c = a;
		a = b;
		b = c;
		System.out.println("After Swaping A value: " + a);
		System.out.println("After Swaping B value: " + b);
	}

	// swap two values without using third variable
	public static void swapValuesWithoutUsing3rdVariable() {
		System.out.println("-----------------swap values without using third variable--------------");
		int a = 100;
		int b = 200;

		System.out.println("Before Swaping A value: " + a);
		System.out.println("Before Swaping B value: " + b);

		a = a + b; // 100+200 = 300
		b = a - b; // 300-200 = 100
		a = a - b; // 300 -100 = 200
		System.out.println("After Swaping A value: " + a);
		System.out.println("After Swaping B value: " + b);
	}

	// swap two String values without using third variable
	public static void swapStringValuesWithoutUsing3rdVariable() {
		System.out.println("-----------------Swap two String values without using third variable--------------");
		String string1 = "Hello";
		String string2 = "Java";

		System.out.println("Before Swaping String1 value: " + string1);
		System.out.println("Before Swaping String2 value: " + string2);

		string1 = string1 + string2; // HelloJava
		string2 = string1.replace(string2, ""); // Hello
		string1 = string1.replace(string2, ""); // Java

		System.out.println("After Swaping String1 value: " + string1);
		System.out.println("After Swaping String2 value: " + string2);
	}

	// print odd number between given numbers
	public static void printOddNumbers(int startingValue, int endingValue) {
		System.out.println("-----------------print odd numbers between given numbers--------------");

		for (int i = startingValue; i <= endingValue; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

//  print even number between given numbers
	public static void printEvenNumbers(int startingValue, int endingValue) {
		System.out.println("-----------------print Even numbers between given numbers--------------");

		for (int i = startingValue; i <= endingValue; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// write a program to check the given number is prime or not
	public static void checkPrimeNumber(int givenNumber) {
		System.out.println("-----------------------check the given number is prime or not------------------");
		int count = 0;
		for (int i = 1; i <= givenNumber; i++) {
			if (givenNumber % i == 0) {
				count++;
			}
		}

		if (count <= 2) {
			System.out.println(givenNumber + " is a Prime Number");
		} else {
			System.out.println(givenNumber + " is not a Prime Number");
		}
	}

	// write a program to print prime numbers between the given range
	public static void printPrimeNumberBetweenGivenRange(int startingValue, int endingValue) {
		System.out.println("-----------------------print prime numbers between given range------------------");

		System.out.println("Prime Number between " + startingValue + " and " + endingValue + " are: ");
		for (int i = startingValue; i <= endingValue; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count <= 2) {

				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}

	// write a program to reverse a number
	public static void reverseNumber(int number) {
		System.out.println("-----------------------reverse a number------------------");
//		int number =123;
		int revNum = 0;

		while (number > 0) {
			int remainder = number % 10; // 3 , 2, 1
			revNum = (revNum * 10) + remainder; // 0+3 =3, 30+2= 32, 320+1 = 321
			number = number / 10; // 12 , 1 , 0
		}

		System.out.println(revNum);
	}

	// write a program to reverse a number
	public static void reverseNumber2(int number) {
		System.out.println("-----------------------reverse a number------------------");
		String numStr = String.valueOf(number);
		String revNumbStr = "";

		for (char eachChar : numStr.toCharArray()) {
			revNumbStr = eachChar + revNumbStr; // 1, 21, 321
		}

		System.out.println(revNumbStr);
	}

	// write a program to reverse a String
	public static void reverseString(String str) {
		System.out.println("-----------------------reverse a String------------------");

		String revStr = "";

		for (char eachChar : str.toCharArray()) {
			revStr = eachChar + revStr;
		}

		System.out.println(revStr);
	}

	// Write a program to check the given number palindrome or not
	// 123 -> 321 : not Palindrome
	// 121-> 121 : Palindrome
	public static void checkNumberPalindrome(int num) {
		System.out.println("-----------------------Check number Palindrome------------------");
//		int number =123;
		int tempNum = num;
		int revNum = 0;

		while (tempNum > 0) {
			int remainder = tempNum % 10; // 3 , 2, 1
			revNum = (revNum * 10) + remainder; // 0+3 =3, 30+2= 32, 320+1 = 321
			tempNum = tempNum / 10; // 12 , 1 , 0
		}

		if (num == revNum) {
			System.out.println(num + " is a Palindrome");
		} else {
			System.out.println(num + " is not a Palindrome");
		}
	}

	// Write a program to check the given String palindrome or not
	// hello -> olleh : not Palindrome
	// malayalam-> malayalam : Palindrome
	public static void checkStringPalindrome(String str) {
		System.out.println("-----------------------Check  String Palindrome------------------");

		String revStr = "";

		for (char eachChar : str.toCharArray()) {
			revStr = eachChar + revStr;
		}

		if (str.equals(revStr)) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome");
		}

	}

	// write a program to check whether the number is Armstrong number or not.
	// 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
	public static void checkArmstrongNumber(int number) {

		int tempNum = number;
		int sum = 0;

		while (tempNum > 0) {
			int remainder = tempNum % 10;
			sum = sum + (remainder * remainder * remainder); // 27, 27 + 125 = 152, 1 + 152 = 153
			tempNum = tempNum / 10;
		}

		if (sum == number) {
			System.out.println(number + " Number is an Armstrong Number");
		} else {
			System.out.println(number + " Number is not an Armstrong Number");
		}

	}

	// write a program to sort the Array
	// Ex: {11,5,8,2,6} -> {2,5,6,8,11)
	// -> {11,8,6,5,2}
	public static void sortIntArray(int[] intArr) {

//		1st -> 0 -> 5 11 8 2 6 -> 2 11 8 5 6
//		2nd -> 1->  2 8 11 5 6 -> 2 5 11 8 6 
//		3rd -> 2 -> 2 5 11 8 6 -> 2 5 8 11 6 -> 2 5 6 11 8
//		4th -> 3 -> 2 5 6 11 8 -> 2 5 6 8 11

		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] < intArr[j]) { // Ascending Order
//				if (intArr[i] < intArr[j]) {  // Descending order
					int tempNum = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = tempNum;
				}
			}
		}

		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println("");
	}

	// Write a reusable method to print a word in a ascending order/ alphabetical
	// order
	// java -> aajv
	// hello -> ehllo
	public static void sortString(String str) {

		char ch = 'A';
		int int1 = ch;
		ch = (char) int1;

		char[] charArr = str.toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			for (int j = i + 1; j < charArr.length; j++) {
				if (charArr[i] > charArr[j]) { // Ascending Order
//				if (charArr[i] > charArr[j]) {  // Descending order
					char tempChar = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = tempChar;
				}
			}
		}

		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i] + " ");
		}
		System.out.println("");
	}

	// Write a program to reverse a string without changing the words position
	// Hello Java World -> olleH avaJ dlroW
	public static void reverseStringWithoutChaingWordsPostion(String str) {
		String[] strArr = str.split(" ");
		String revStr = "";

		for (String eachWord : strArr) {
			String tempRevStr = "";
			for (char eachChar : eachWord.toCharArray()) {
				tempRevStr = eachChar + tempRevStr;
			}

			revStr = revStr + tempRevStr + " ";
		}
		System.out.println(revStr);
	}

	// Write a program to print right half triangle
	public static void printRightHalfTaingle() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}

	// Write a program to print right half triangle
	public static void printRightHalfTaingleInReverse() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}

	// Write a program to print right half triangle
	public static void printLeftHalfTaingle() {

		for (int i = 5; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	// Write a program to print right half triangle
	public static void printLeftHalfTaingleInReverse() {

		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

//		swapValuesUsing3rdVariable();
//
//		swapValuesWithoutUsing3rdVariable();

//		swapStringValuesWithoutUsing3rdVariable();

//		printOddNumbers(1,20);
//		
//		printEvenNumbers(1,20);

//		checkPrimeNumber(164790);

//		printPrimeNumberBetweenGivenRange(1,100);

//		reverseNumber(123);
//		reverseNumber2(100);

//		reverseString("Hello");

//		checkNumberPalindrome(121);

//		checkStringPalindrome("malayalam");

//		checkArmstrongNumber(153);

//		int[] intArr = { 11, 5, 8, 2, 6 };
//		sortIntArray(intArr);

//		sortString("java");
//		sortString("hello");

//		reverseString("Hello Java World");
//		reverseStringWithoutChaingWordsPostion("Hello Java World");

//		printRightHalfTaingle();
//
//		System.out.println(" ");
//
//		printRightHalfTaingleInReverse();
//
//		System.out.println(" ");
//
//		printLeftHalfTaingle();
//
//		System.out.println(" ");
//
//		printLeftHalfTaingleInReverse();
		
		String str = "hello java";
		System.out.println(str.replace('l','$'));
		System.out.println(str.replaceAll("l","\\$"));

	}

}
