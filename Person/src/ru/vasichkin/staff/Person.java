package ru.vasichkin.staff;

import java.util.ArrayList;
import java.util.Collections;

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
		// Грабли
		// list.add(this); ссылкой на обьект который недоконструировался лучше не
		// использовать
		// Исользуем метод create
	}

	public static void showAll() {
		Collections.sort(persons);
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
