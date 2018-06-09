package ru.specialist;

public class Program {

	public static void main(String[] args) {
		Outer o = new Outer(10);
		Outer.Nested n = new Outer.Nested(); //Создание ссылки и обьекта влоенного класса
		n.increment(o); //вызов метода статического вложенного класса
		
		System.out.println(o.getData());
		
		Outer.Inner  i = o.new Inner(); // o.new Inner() прикрепление нового обьекта к обькету внешнего класса
		i.increment();
		
		System.out.println(o.getData());
		

	}

}
