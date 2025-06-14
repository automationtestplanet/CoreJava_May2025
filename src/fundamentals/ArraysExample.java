package fundamentals;

public class ArraysExample {

	public static void main(String[] args) {
		int a = 100;
//		int b = 100,200,300,,400;
//	 int c = true;
//	 int d = 10.5;

//		int[] intArr = {100,200,300,400};
//		int intArr[] = {100,,300,ture}; // it accepts only homogeneous
		int intArr[] = { 100, 200, 300, 400 };
		System.out.println(intArr);

		System.out.println(intArr.length);

		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);

//		System.out.println(intArr[4]); // Error
		System.out.println("---------------------------------");
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

		System.out.println("---------------------------------");
		for (int eachVal : intArr) {
			System.out.println(eachVal);
		}

		System.out.println("---------------------------------");
		String[] strArr = { "Apple", "Banana", "Cherry", "Dragon" };

		for (String eachFruit : strArr) {
			System.out.println(eachFruit);
		}

		System.out.println("---------------------------------");
		char[] charArr = { 'A', 'B', 'C', 'D' };
		for (char eachChar : charArr) {
			System.out.println(eachChar);
		}

		System.out.println("---------------------------------");

		int x;
		x = 100;

		int[] intArr2 = new int[5];
		for (int eachVal : intArr2) {
			System.out.println(eachVal);
		}

		intArr2[0] = 10;
		intArr2[1] = 20;
		intArr2[2] = 30;
		intArr2[3] = 40;
		intArr2[4] = 50;

//		intArr2[5] = 60;

		for (int eachVal : intArr2) {
			System.out.println(eachVal);
		}

		System.out.println("----------------------------2D Array----------------");

		int[][] intArr3 = { { 10, 20, 30, 40, 50 }, { 100, 200, 300, 400, 500 }, { 1000, 2000, 3000, 4000, 5000 } };
		
		for(int i=0;i<intArr3.length;i++) {
			for(int j=0;j<intArr3[i].length;j++) {
				System.out.println(intArr3[i][j]);
			}
		}
		
		System.out.println("----------------------------2D Array with enhanced for loop----------------");
		
		for(int[] eachArr:intArr3) {
			for(int eachValue:eachArr) {
				System.out.println(eachValue);
			}
		}

	}

}
