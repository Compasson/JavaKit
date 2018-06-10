package ru.specialist;

import java.util.Comparator;

/*
 * 		¬ложеные классы(nested):
 * 				
 * 			1 - вариант статический класс(nested), его частный случай это
 * 				(inner) внутренний(без static), его частный случай это					
 * 				локальный клас(внутри метода внешнего класса), его частный случай это 
 * 				анонимный клас(это класс без имени и созданием одного единственного обьекта)
 * 
 * 
 * 		«ачем нужны вложенные класссы(пример в проекте Invoice видео Spesialist 5_2):
 * 
 * 					–ешают проблему контрол€:
 * 						  примеру(накладна€), если это реализовывать двум€ разными классами то
 * 							различные пол€ накладной св€заны и при изменении какогото пол€ должны измен€тьс€
 * 							возникает проблема доступа к пол€м класса и котрол€ за св€заными пол€ми
 * 						
 * 						¬нутренний класс легко решает эту проблему
 */
interface Increment
{
	void increment();
}

public class Outer {
	
	public static class Nested { //простой вариант статического вложеного класса
		public void increment(Outer o) {
			o.data++; // ¬ложенные класссы имеют доступ ко все мпол€м и методам внешнего класса
		}
	}
	
	public class Inner{ 			//ќбьекты обладают всеми свойсвами вложенного класса, Ќќ не €вл€ютн€ независимыми
		public void increment() {	// аждый обьект Inner класса должен быть прикреплен к обьекту ¬нешнего класса.
								//ѕричем один обьект внешнего класса может прикрепл€ть множество обьектов Inner класса
			System.out.println(Outer.this);
			data++; // ѕр€мой доступ к полю внешнего класса, к которому прикоеплен данный обьект внутреннего класса
		}
	}
	
	
	public Comparator<Integer> getComparator(){
		// Ћокальный класс внутри метода. „тобы вынести ссылку на обьект локального класса, используем интерфейс, который реализует этот локальный класс
		/*class MyComparator implements Comparator<Integer>{ //Comparator сравнивает 2 параметра , а Comparable сравнивает this с параметром
			@Override
			public int compare(Integer x, Integer y) {
				return x-y;
			}		
		}
		Comparator<Integer> mc = new MyComparator();*/
		
		// јнонимный класс (в java 8 с помощью л€мда выражений можно упростить всю эту констукцию)
		Comparator<Integer> mc = new  Comparator<Integer>(){ // сразу создаетс€ обьект аноннимного класса и описываетс€ класс
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
		
		
		Inner i = new Inner(); //¬нешний класс может создавать обьекты внутреннего класса
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
