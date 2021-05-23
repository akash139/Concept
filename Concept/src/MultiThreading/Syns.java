package MultiThreading;

class Counter {
	int counter;

	public synchronized void inc() { 	// synchronized method means only one thread will work at a time.
						// to make thread safe declare as synchronized
		counter++; 			// when you don't make your method synchronized it means your method is not
						// thread safe.
					        // Which means multiple thread can access it same time.
						// To make your method thread safe make your method as synchronized.
	}
}

public class Syns {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.inc();
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.inc();
				}
			}
		};
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("Count Value: " + c.counter);
	}

}
