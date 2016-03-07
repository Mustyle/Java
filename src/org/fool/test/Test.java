package org.fool.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Stuff {
}

interface Ore extends Stuff {
}

interface Weapon extends Stuff {
}

interface Rubbish extends Stuff {
}

class Gold implements Ore {
	@Override
	public String toString() {
		return "Gold";
	}
}

class Copper implements Ore {
	@Override
	public String toString() {
		return "Copper";
	}
}

class Gun implements Weapon {
	@Override
	public String toString() {
		return "Gun";
	}
}

class Grenade implements Weapon {
	@Override
	public String toString() {
		return "Grenade";
	}
}

class Stone implements Rubbish {
	@Override
	public String toString() {
		return "Stone";
	}
}

public class Test {
	public static List<Stuff> collectStuff(Stuff[] s) {
		List<Stuff> list = new ArrayList<>();

		for (int i = 0; i < s.length; i++) {
			if (!(s[i] instanceof Rubbish)) {
				list.add(s[i]);
			}
		}

		return list;
	}

	public static void main(String[] args) {
//		Stuff[] s = { new Gold(), new Copper(), new Gun(), new Grenade(), new Stone() };
//
//		List<Stuff> sList = collectStuff(s);
//
//		for (Stuff stuff : sList) {
//			System.out.println(stuff);
//		}
		
		String str1 = "Hello";
//		String str2 = str1.substring(0, 2);
//		
		System.out.println(str1 == str1.substring(0, 2));
		
		Map<String, String> map = new HashMap<>();
		
		map.put("a", "a");
		map.put("a", "b");
		map.put("a", "c");
		
		System.out.println(map.get("a"));
		
	}
}
