package ru.vasichkin.staff;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.out;
import java.util.Date;

public class Person {

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
		out.printf("Person Name = %s, age = %d\n", this.name, this.birthYear);
	}
}
