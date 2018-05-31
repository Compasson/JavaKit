package ru.vasichkin.staff;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.out;

public class Person {

	public String name;
	public int age;

	public static ArrayList<Person> persons = new ArrayList<>();
	/*
	 * static { persons=new ArrayList<>(); }
	 */

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		// ������
		// list.add(this); ������� �� ������ ������� ������������������� ����� ��
		// ������������
		// ��������� ����� create
	}

	public static void showAll() {
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
		out.printf("Person Name = %s, age = %d\n", this.name, this.age);
	}
}
