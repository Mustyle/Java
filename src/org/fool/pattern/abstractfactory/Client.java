package org.fool.pattern.abstractfactory;

public class Client {

	public static void main(String[] args) {
		// �������󹤳�����
		AbstractFactory factory = new ConcreteFactory1();
		// ͨ�����󹤳�����ȡһϵ�еĶ������ƷA�Ͳ�ƷB
		factory.createProductA();
		factory.createProductB();
		
		factory = new ConcreteFactory2();
		factory.createProductA();
		factory.createProductB();
	}
}
