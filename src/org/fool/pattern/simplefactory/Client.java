package org.fool.pattern.simplefactory;

public class Client {
	public static void main(String[] args) {
		Api api = Factory.createApi(1);

		api.operation("����ʹ�ü򵥹���");

		api = Factory.createApi(2);

		api.operation("����ʹ�ü򵥹���");
	}
}
