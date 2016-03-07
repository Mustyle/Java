package org.fool.string;

public class StringTest1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "a" + "bc";

		System.out.println(s1 == s2);	// true

		String hello = "hello";
		String hel = "hel";
		String lo = "lo";
		System.out.println(hello == "hel" + "lo");  // ture
		System.out.println(hello == "hel" + lo);	// false
		System.out.println(hello == hel + lo);	// false
	}
}
