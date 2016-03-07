package org.fool.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest4 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", "dd");
		map.put("e", "ee");

		Set<Entry<String, String>> set = map.entrySet();

		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + ":" + value);
		}

		for (Iterator<Entry<String, String>> iter = set.iterator(); iter.hasNext();) {
			Map.Entry<String, String> entry = iter.next();

			String key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + "=" + value);
		}
	}
}
