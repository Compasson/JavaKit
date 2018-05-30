package ru.vasichkin;

import ru.vasichkin.staff.Person;

public class Program {

	public static void main(String[] args) {
		/*
		 * Класс с полями name and age
		 * 
		 * колекция static aray list<Person>
		 * сразу инициализировать
		 * автоматизировать добавление обьектов в коллекции
		 * 
		 * статический метод который будет перебирать коллекцию
		 * и для каждго обьекта вызывать метод show
		 * 
		 * конструктор с двуми параметрами
		 * 
		 * метод show показывает инфу
		 * 
		 * 
		 * 
		 * 
		 */
		for(int i=0;i<20;i++) {
			Person p = Person.create("Pasha",i*10);
		}
		Person.showAll();

	}

}
