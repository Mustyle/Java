package org.fool.pattern.simplefactory;

public class ImplA implements Api {
	public void operation(String s) {
		System.out.println("Invoked By ImplA " + s);
	}
}
