package org.fool.thread;

public class Sample {
	private int number;

	// private Object object = new Object();

	public synchronized void increase() {
		// synchronized (object) {
		while (0 != number) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		number++;

		System.out.println(number);

		notify();
		// }
	}

	public synchronized void decrease() {
		// synchronized (object) {
		while (0 == number) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		number--;

		System.out.println(number);

		notify();
		// }
	}

	public static void main(String[] args) {
		Sample sample = new Sample();

		Thread t1 = new Thread(new IncreaseThread(sample));
		Thread t2 = new Thread(new DecreaseThread(sample));
		
		Thread t3 = new Thread(new IncreaseThread(sample));
		Thread t4 = new Thread(new DecreaseThread(sample));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}