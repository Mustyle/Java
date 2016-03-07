package org.fool.nio;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;

/*
 * 取得Charset类的全部编码
 */
public class GetAllCharsetDemo {
	public static void main(String[] args) {
		SortedMap<String, Charset> map = Charset.availableCharsets();

		for (Iterator<Entry<String, Charset>> iter = map.entrySet().iterator(); iter.hasNext();) {
			Map.Entry<String, Charset> entry = iter.next();

			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
