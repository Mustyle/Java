package org.fool.pattern.strategy;

public class Client {
	public static void main(String[] args) {
		Strategy addStrategy = new AddStrategy();

		Environment environment = new Environment(addStrategy);
		System.out.println(environment.calculate(3, 2));

		Strategy substractStrategy = new SubtractStrategy();
		environment.setStrategy(substractStrategy);
		System.out.println(environment.calculate(3, 2));

		Strategy multiplyStrategy = new MultiplyStrategy();
		environment.setStrategy(multiplyStrategy);
		System.out.println(environment.calculate(3, 2));

		Strategy devideStrategy = new DivideStrategy();
		environment.setStrategy(devideStrategy);
		System.out.println(environment.calculate(3, 2));
	}
}
