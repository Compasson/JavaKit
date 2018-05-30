package ru.vasichkin.staff;

import java.util.ArrayList;

public class Person {
	
	public String name;
	public int age;
	
	public static ArrayList<Person> persons=new ArrayList<>();
	/*static {
		persons=new ArrayList<>();
	}*/
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		// Грабли
		//list.add(this); ссылкой на обьект который недоконструировался лучше не использовать
	}
	
	public static void showAll() {
		for(Person p: persons) {
			p.show();
		}
	}
	
	public static Person create(String name,int age) {
		Person p = new Person(name,age);
		persons.add(p);
		return p;
	}
	
	public void show() {
		System.out.printf("Person Name = %s, age = %d\n",this.name,this.age);
	}

}
