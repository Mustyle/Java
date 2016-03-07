package org.fool.test;

/**
 * 饿汉式单例实现
 */
public class Singleton {

	private static Singleton s = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return s;
	}
}

