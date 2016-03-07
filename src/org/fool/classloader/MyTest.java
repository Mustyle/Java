package org.fool.classloader;

class Singleton {
	public static int counter1;
	public static int counter2 = 0;
	
	private static Singleton singleton = new Singleton();

	//public static int counter1;
	//public static int counter2 = 0;

	private Singleton() {
		counter1++;
		counter2++;
	}

	public static Singleton getInstance() {
		return singleton;
	}
}

public class MyTest {
	public static void main(String[] args) {
		Singleton.getInstance();
		System.out.println("counter1: " + Singleton.counter1);
		System.out.println("counter2: " + Singleton.counter2);
	}
}
