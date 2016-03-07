package org.fool.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("C");
		set.add("A");
		set.add("E");
		set.add("B");
		set.add("D");
		
		System.out.println(set);
	}
}
