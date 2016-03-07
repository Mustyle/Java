package org.fool.lambda;

public class ThreadUsingLambda {
	public static void main(String[] args) {
		Thread thread = new Thread(()-> {
			System.out.println("Lambda exp");
		});
		
		thread.start();
	}
}
