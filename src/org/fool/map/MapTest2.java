package org.fool.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("a", "zhangsan");
		map.put("b", "zhangsan");

		System.out.println(map);
	}
}
