package ru.vasichkin;

import ru.vasichkin.staff.Person;
import ru.vasichkin.graphics.*;

import static java.lang.System.out;

public class Program
//implements Cloneable
{

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
		
		Point pt1=new Point(10,20,"green");
		Point pt2=pt1.clone();
		pt1.color="red";
		
		pt1.moveBy(1, 1);
		pt1.draw();
		pt2.draw();
		out.println(pt1.color);
		out.println(pt1.toString());
		out.println(pt1); // Метод println для обьекта вызывает метод toString переопределенный в классе point
	}

}
