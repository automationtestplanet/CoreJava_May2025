package multithreading;

public class SequentialProcess {

	public static void main(String[] args) {
		
		Class1 cls1 = new Class1();
		Class2 cls2 = new Class2();
		
		cls1.displyText1();
		cls2.displyText2();
	}

}
