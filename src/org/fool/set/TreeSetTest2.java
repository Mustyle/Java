package org.fool.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>(new MyComparator());

		set.add("C");
		set.add("A");
		set.add("E");
		set.add("B");
		set.add("D");

		System.out.println(set);
	}
}

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o2.compareTo(o1);
	}

}
