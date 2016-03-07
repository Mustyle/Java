package org.fool.pattern.builder;

public class ConcreteBuilder implements Builder {

	private Product resultProduct;

	public Product getResult() {
		return resultProduct;
	}

	@Override
	public void buildPart() {
		System.out.println("build part...");
	}

}
