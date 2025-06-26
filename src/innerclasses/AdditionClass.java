package innerclasses;

public class AdditionClass {
	
	void addition(int a, int b) {
		System.out.println("AdditionClass Class Addition method: "+(a+b));
	}

	public static void main(String[] args) {
		
		AdditionClass additionCls = new AdditionClass() {
			@Override
			void addition(int a, int b) {
				System.out.println("Annnonymous Class Addition method: "+(a*b));
			}
		};
		
		additionCls.addition(10, 20);
	}

}
