package day27;

// Thread access using implementing Runnable interface
class one implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hii");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class two implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class ThreadDemo2 {
	public static void main(String[] args) {
		Runnable obj1 = new one();
		Runnable obj2 = new two();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();

//		obj1.show();
//		obj2.show();
	}
}
