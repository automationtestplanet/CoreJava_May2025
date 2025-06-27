package multithreading;

public class Class6WithRunnableInterface implements Runnable{
	
	@Override
	public void run() {
		displyText6();		
	}
	
	public synchronized void displyText6() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Class6");
		}
	}

	

}
