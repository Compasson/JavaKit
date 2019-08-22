
package ru.vasichkin.events;

import java.util.ArrayList;
import java.util.List;

import ru.vasichkin.streamout.Person;

/*
 * Как кнопке вызвать медот о котором она ничеко не знает?
 * До java 8 не было типа данных указатель на функцию (а в С есть)
 * 		Можно реализовать интерфейс ElectricityConsumer. 
 * 		Выключатель не будет знать ничего о лампе до того как программа не будет запужена runTime
 * 		В главном методе происходит подписка на событие, когда полю класса-выключатель присваивается обьект лампа.
 * 		
 * 		Добавить подписчика можно с помощью анонимного класса.
 * 		У него нет имени, потому что этот обьект этого класса нужен всего один.
 * 		Вместо имени интерфейс . И реализуем у обьекта метод.
 * 
 *  	Лямда выражением можно упростить анонимный класс.
 *  	Название интерфейса можно не указывать, он уже описан как параметр медодов нашего выключателя.
 *  	Название метода тоже можно не указывать, так как интерфейс функциональный(иемеет всего один метод);
 *  
 *  Также с помощью лямда выражений удобно выводить коллекции.
 */

public class Program {
	
	public static void fire(Object sender) {
		System.out.println("FIRE!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switcher sw = new Switcher();
		Lamp lp = new Lamp();
		Lamp lp2 = new Lamp();

		Radio r = new Radio();
		
		//event subscribe
		sw.addElectrisityListener(lp);
		sw.addElectrisityListener(lp2);
		sw.addElectrisityListener(r);
		
		sw.switchOn();
		
		sw.removeElectricityListener(lp);
		
		sw.switchOn();
		
		//Реализация анонимным классом.	  
		 sw.addElectrisityListener(
				new ElectricityConsumer() {
					
					@Override
					public void electrisityOn(Object sender) {
						
						System.out.println("Пожар 1");
					}
				});
		
		sw.switchOn();
		
		// Замена анонимного класса лямбда выражением
		sw.addElectrisityListener(
				(Object sender) -> {		// В круглых скобках подставляются параметры, если они есть у интерфейса			
							System.out.println("Пожар 2");
						}
		);
			
		sw.switchOn();
		
		//Если оператор в фигурных скобках один, то упрощаем выражение
		sw.addElectrisityListener((Object sender) -> System.out.println("Пожар 3"));	
		sw.switchOn();
		
		//Если параметр в методе интерфейса ровно один то круглые скобки опускаем и пишем только имя параметра
		sw.addElectrisityListener(s -> System.out.println("Пожар 3"));	
		sw.switchOn();
		
		//Или
		sw.addElectrisityListener(s -> Program.fire(s));
		sw.switchOn();	
		
		// Если параметр функционального интерфейса такой же какой испольхзуется оператором после лямда символа,то упрощаем запись
		sw.addElectrisityListener(Program :: fire);
		sw.switchOn();	
		
		//Передавать переменную в лямда выражение можно, но только final
		String str = "ПОЖАР!!"; //final можно не писать, НО изменить эту переменную все равно нельзя!
		sw.addElectrisityListener(s -> System.out.println(str));	
		sw.switchOn();
		
		//---------------------------------------------------------------------------------------------
		//Вывод через stream
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Сергей", 38));
		persons.add(new Person("Даша", 7));
		persons.add(new Person("Глаша", 3));
		persons.add(new Person("Саша", 6));
		persons.add(new Person("Анна", 18));
		
		//Вывод всей коллекции
		persons.stream().forEach(System.out::println);
		
		//Вывод с фильтром по возрасту
		persons.stream().filter(p -> p.getAge() >= 18).
		forEach(System.out::println);
		
		//Вывод с сортировкой с помощью компаратора
		persons.stream().
		sorted((p1,p2)-> p1.getName().compareTo(p2.getName())).
		forEach(System.out::println);
		
		//Вывод с преобразование коллекции
		persons.stream().
		map(p -> p.getName()). // На входе коллекция персон, а на выходе коллеция строк.
		forEach(System.out::println);
		
		
		
	}

}

