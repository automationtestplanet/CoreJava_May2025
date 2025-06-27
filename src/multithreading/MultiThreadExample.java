package multithreading;

public class MultiThreadExample {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Class3WithThreadClass());
		Thread thread2 = new Thread(new Class4WithThreadClass());
		Thread thread3 = new Thread(new Class5WithRunnableInterface());
		Thread thread4 = new Thread(new Class6WithRunnableInterface());
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
