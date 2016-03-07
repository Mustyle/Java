package org.fool.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		
		char[] c = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		String str = String.valueOf(c);
		
		StringBuilder sb = new StringBuilder();
		
		String[] s = str.split(" ");
		
		for (String string : s) {
			System.out.println(string);
		}
	}
}
