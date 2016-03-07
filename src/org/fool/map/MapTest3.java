package org.fool.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest3 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", "dd");
		map.put("e", "ee");

		Set<String> set = map.keySet();

		for (String key : set) {
			String value = map.get(key);

			System.out.println(key + ":" + value);
		}

		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String key = iterator.next();

			String value = map.get(key);

			System.out.println(key + "=" + value);
		}
	}
}
