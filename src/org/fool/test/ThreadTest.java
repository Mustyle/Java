package org.fool.test;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread(new Thread2());
		
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class Thread2 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
