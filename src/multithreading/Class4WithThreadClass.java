package multithreading;

public class Class4WithThreadClass extends Thread{

	public void run() {
		displyText4();
	}
	
	public synchronized void displyText4() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Class4");
		}
	}

}
