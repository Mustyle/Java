package org.fool.pattern.factorymethod;

public class ConcreteCreator implements Creator {

	@Override
	public Product factory() {
		return new ConcreteProduct();
	}

}
