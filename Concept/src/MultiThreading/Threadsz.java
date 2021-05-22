package MultiThreading;

//Thread using Interface
public class Threadsz {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hey!" + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				;
			}
		}, "1st Thread");
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello!");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				;
			}
		}, "2nd Thread");
		// Thread t2 = new Thread(b, "Sample Thread: ");

		System.out.println(t1.getName()); // t1.getName is used to get the name of thread.
		System.out.println(t2.getName());

		t1.setName("Hi Thread: "); // t1.setName is used to set the name of thread.
		t2.setName("Hello Thread: ");
		System.out.println(t1.getName()); // t1.getName is used to get the name of thread.
		System.out.println(t2.getName());

		System.out.println(t1.getPriority()); // By default the priority is 5. Range of priority is from 1 to 10. 1
												// means least priority.
												// 10 means highest priority, 5 is normal priority.
		System.out.println(t2.getPriority());

		t1.setPriority(1); // Setting priority of thread
		t2.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.start();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		;
		t2.start();

		System.out.println(t1.isAlive()); // isAlive is a method used to check whether thread is running or not.
		t1.join();
		t2.join();
		System.out.println(t1.isAlive()); // is Thread running or not

		System.out.println("Byee");
	}
}