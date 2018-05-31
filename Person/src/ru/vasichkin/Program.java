package ru.vasichkin;

import ru.vasichkin.staff.Person;

import static java.lang.Math.*;

public class Program {

	public static void main(String[] args) {
		
		double x=2;
		double y=sin(2*PI*log(x)); //Импортируем статические поля или методы ...Math.*;
		
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
