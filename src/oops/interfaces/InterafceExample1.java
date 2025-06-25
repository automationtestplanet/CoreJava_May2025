package oops.interfaces;

public interface InterafceExample1 {
	void addition(int a, int b);

	static void subtration(int a, int b) {
		System.out.println(a - b);
	}

	default void multiplation(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
//		InterafceExample1 infEx1;
		InterafceExample1 infEx1 = (a, b) -> System.out.println(a + b);
		infEx1.addition(10, 20);
		InterafceExample1.subtration(100, 20);
//		
//		InterafceExample1.multiplation(20, 30);
		infEx1.multiplation(20, 30);
	}

}
