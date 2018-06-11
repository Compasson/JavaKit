package ru.specialist;

import java.util.Comparator;

/*
 * 		Вложеные классы(nested):
 * 				
 * 			1 - вариант статический класс(nested), его частный случай это
 * 				(inner) внутренний(без static), его частный случай это					
 * 				локальный клас(внутри метода внешнего класса), его частный случай это 
 * 				анонимный клас(это класс без имени и созданием одного единственного обьекта)
 * 
 * 
 * 		Зачем нужны вложенные класссы(пример в проекте Invoice видео Spesialist 5_2):
 * 
 * 					Решают проблему контроля:
 * 						К примеру(накладная), если это реализовывать двумя разными классами то
 * 							различные поля накладной связаны и при изменении какогото поля должны изменяться
 * 							возникает проблема доступа к полям класса и котроля за связаными полями
 * 						
 * 						Внутренний класс легко решает эту проблему
 */
interface Increment
{
	void increment();
}

public class Outer {
	
	public static class Nested { //простой вариант статического вложеного класса
		public void increment(Outer o) {
			o.data++; // Вложенные класссы имеют доступ ко все мполям и методам внешнего класса
		}
	}
	
	public class Inner{ 			//Обьекты обладают всеми свойсвами вложенного класса, НО не являютня независимыми
		public void increment() {	//Каждый обьект Inner класса должен быть прикреплен к обьекту Внешнего класса.
								//Причем один обьект внешнего класса может прикреплять множество обьектов Inner класса
			System.out.println(Outer.this);
			data++; // Прямой доступ к полю внешнего класса, к которому прикоеплен данный обьект внутреннего класса
		}
	}
	
	
	public Comparator<Integer> getComparator(){
		// Локальный класс внутри метода. Чтобы вынести ссылку на обьект локального класса, используем интерфейс, который реализует этот локальный класс
		/*class MyComparator implements Comparator<Integer>{ //Comparator сравнивает 2 параметра , а Comparable сравнивает this с параметром
			@Override
			public int compare(Integer x, Integer y) {
				return x-y;
			}		
		}
		Comparator<Integer> mc = new MyComparator();*/
		
		// Анонимный класс (в java 8 с помощью лямда выражений можно упростить всю эту констукцию)
		Comparator<Integer> mc = new  Comparator<Integer>(){ // сразу создается обьект(на это указывают скобки) аноннимного класса и описывается класс в скобках {}. Вместо интерфейса можно написать название Класса, тогда создается наследник.
			public int compare(Integer x, Integer y) {
				return x-y;
			}		
		};
		return mc;
	}

	public boolean isGreater(int x) {	
		return getComparator().compare(data, x) > 0;
	}
	
	
	
	private int data;
	

	public Outer(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		
		Nested n;
		
		Inner i = new Inner(); //Внешний класс может создавать обьекты внутреннего класса
		i.increment();
		
		/*
		class Local implements Increment
		{
			public void increment()
			{
				data++;
			}
			
		}
		Increment l = new Local();
		*/
		Increment l = new Increment()
		{
			public void increment()
			{
				data++;
			}
			
		};
		
		
		l.increment();
		
		
		return data;
	}
	

}
