package org.fool.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest3 {
	public static void main(String[] args) {
		Set<Person> set = new TreeSet<>(new PersonComparator());

		set.add(new Person(10));
		set.add(new Person(20));
		set.add(new Person(30));
		set.add(new Person(40));
		set.add(new Person(50));

		for (Person person : set) {
			System.out.println(person.getScore());
		}
	}
}

class Person {
	private int score;

	public Person(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return String.valueOf(score);
	}
}

class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getScore() - o2.getScore();
	}

}