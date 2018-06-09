package ru.specialist;
/*
 * 		¬ложеные классы(nested):
 * 				
 * 			1 - вариант статический класс(nested), его частный случай это
 * 				(inner) внутренний(без static), его частный случай это					
 * 				локальный клас, его частный случай это 
 * 				анонимный клас
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
