package org.fool.pattern.simplefactory;

public class ImplB implements Api {
	public void operation(String s) {
		System.out.println("Invoked By ImplB " + s);
	}
}
