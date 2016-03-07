package org.fool.pattern.simplefactory;

public class Factory {

	public static Api createApi(int type) {

		Api api = null;

		if (type == 1) {
			api = new ImplA();
		} else if (type == 2) {
			api = new ImplB();
		}

		return api;
	}
}