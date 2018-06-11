package ru.vasichkin.staff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.System.out;
import java.util.Date;

public class Person implements Comparable<Person> {

	public String name;
	//private int age;
	private int birthYear;

	public int getAge() {
		return new Date().getYear()+1900-birthYear;
	}

	private void setAge(int age) {
		this.birthYear = new Date().getYear()+1900-age;
	}

	public static ArrayList<Person> persons = new ArrayList<>();
	/*
	 * static { persons=new ArrayList<>(); }
	 */

	protected Person(String name, int age) {
		this.name = name;
		this.birthYear = age;
		// √рабли
		// list.add(this); ссылкой на обьект который недоконструировалс€ лучше не
		// использовать
		// »сользуем метод create
	}

	public final static Comparator<Person> byAge =
			(p1,p2)->p1.getAge()-p2.getAge();
	
	public static void showAll() {
		// Collections.sort(persons); сортировка по умалчанию
		// —ортировка по разным пол€м с ипользованием л€мбда выражений
		Collections.sort(persons,
				(p1,p2)->p1.name.compareTo(p2.name)
		);
		
		// —ортировка по имени использу€ константу выше
		Collections.sort(persons, byAge);
		
		for (Person p : persons) {
			p.show();
		}
	}

	public static Person create(String name, int age) {
		Person p = new Person(name, age);
		persons.add(p);
		return p;
	}

	public void show() {
		out.printf("Person Name = %s, age = %d\n", this.name, this.birthYear);
	}
	
	@Override
	public int compareTo(Person p) {
		//return this.name.compareTo(p.name); // sort by name
		return this.getAge()-p.getAge();
	}
}
