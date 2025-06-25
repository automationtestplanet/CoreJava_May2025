package innerclasses;

public class OuterClass {

	class InnerInstanceClass { // inner instance class with name
		public void method1() {
			System.out.println("This is Innner Instance class Method1");
		}
	}

	static class InnerStaticClass { // inner static class with name
		public void method2() {
			System.out.println("This is Innner Static class Method2");
		}
	}

	{ // inner instance class without name // Anonymous class
//		public void method3() {
//			System.out.println("This is Innner Instance class Method1");
//		}

		int a = 100;
		int b = 200;

		System.out.println("Values from Annonymous block: a=" + a + " b=" + b);
		System.out.println("This is Annonymous class");
	}

	static { // inner static class without name // static block
		int c = 300;
		int d = 400;

		System.out.println("Values from static block: c=" + c + " d=" + d);
		System.out.println("This is Statc Block");
	}

	public static void main(String[] args) {
		OuterClass outCls = new OuterClass();
//		InnerInstanceClass insCls = new InnerInstanceClass();  // inner instance have to access by object only
//		InnerStaticClass inStatCls = new InnerStaticClass();  // inner static can directly accessed

		OuterClass.InnerStaticClass innerStatiCls = new InnerStaticClass();
		innerStatiCls.method2();

		OuterClass.InnerInstanceClass insCls = outCls.new InnerInstanceClass();

		insCls.method1();
	}

}
