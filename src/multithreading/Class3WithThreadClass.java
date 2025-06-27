package multithreading;

public class Class3WithThreadClass extends Thread{

	public void run() {
		displyText3();
	}
	
	public synchronized void displyText3() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Class3");
		}
	}

}
