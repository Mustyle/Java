package org.fool.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("a", "zhangsan");
		map.put("b", "lisi");
		map.put("c", "wangwu");
		map.put("a", "zhuwu");
		
		System.out.println(map);
		
		String value1 = map.get("a");
		System.out.println(value1); // zhuwu
		
		String value2 = map.get("d");
		System.out.println(value2);	// null
	}
}
