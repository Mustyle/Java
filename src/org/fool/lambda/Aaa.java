package org.fool.lambda;

import java.util.Arrays;
import java.util.List;

public class Aaa {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		for (Integer i : list) {
			System.out.println(i);
		}
		
		list.forEach(p -> System.out.println(p));
	}
}
