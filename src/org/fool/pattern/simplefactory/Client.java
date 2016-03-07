package org.fool.pattern.simplefactory;

public class Client {
	public static void main(String[] args) {
		Api api = Factory.createApi(1);

		api.operation("正在使用简单工厂");

		api = Factory.createApi(2);

		api.operation("正在使用简单工厂");
	}
}
