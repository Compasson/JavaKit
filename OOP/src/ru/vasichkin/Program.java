package ru.vasichkin;

import ru.vasichkin.staff.Person;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("Total person: %d\n",Person.counter);
		
		Person p1=new Person("Sergey",40);
		//p1.name="Sergey";
		//p1.age=40;
		
		p1.show();
		
		Person p2=new Person("Kostya",12);
		//p2.name="Kostya";
		//p2.age=12;
		
		p2.show();
		
		//System.out.printf("Total person: %d\n",Person.counter);
		Person.showTotal();
	}

}
