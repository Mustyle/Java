package org.fool.pattern.strategy;

public class MultiplyStrategy implements Strategy {

	@Override
	public int calculate(int a, int b) {
		return a * b;
	}

}
