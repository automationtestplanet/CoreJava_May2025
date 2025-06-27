package multithreading;

public class ParallelProcess {

	public static void main(String[] args) {

//		Class3WithThreadClass cls3 = new Class3WithThreadClass();
//		Class4WithThreadClass cls4 = new Class4WithThreadClass();
//
//		Thread thread1 = new Thread(cls3);
//		Thread thread2 = new Thread(cls4);

//		thread1.start();
//		thread2.start();
		
		 new Thread(new Class3WithThreadClass()).start();
		 new Thread(new Class4WithThreadClass()).start();

	}

}
