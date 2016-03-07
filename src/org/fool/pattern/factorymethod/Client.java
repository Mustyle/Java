package org.fool.pattern.factorymethod;

public class Client {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product = creator.factory();
	}
}
