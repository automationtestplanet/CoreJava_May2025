package innerclasses;

public class UseAbstractClassWithSingleMethod {

	public static void main(String[] args) {
		
		AbstractClassWithSingleMethod  asbCls = new AbstractClassWithSingleMethod() {
			@Override
			public void addition(int a,int b) {
				System.out.println(a+b);
			}
		};
		asbCls.addition(10,200);		
	}

}
