package multithreading;

public class Class5WithRunnableInterface implements Runnable {

	@Override
	public void run() {
		displyText5();
	}

	public synchronized void displyText5() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Class5");
		}
	}

}
