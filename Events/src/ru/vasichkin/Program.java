package ru.vasichkin;

/*
 * 		Шаблон проектирования обзорвер
 */

// Для того чтобы создать какое нибудь событие Например - ПОЖАР! Нужно создавать целый класс.
// Поэтому этот класс лучше сделать анонимным
/*class Abc implements ElectricityListener {
	@Override
	public void electricity() {
		System.out.println("ПОЖАР");
	}
}*/

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switcher sw = new Switcher();
		
		Lamp lamp = new Lamp();
		TvSet tv = new TvSet();
		AirCondition ac = new AirCondition(); // Внимание AirCondition не реализует интерфейс Electricitylistener
		
		sw.addElecricityListener(lamp);
		sw.addElecricityListener(tv);
		/*sw.addElecricityListener(new ElectricityListener() {
			@Override
			public void electricity(Object sender) {				
				System.out.println("Пожар");
			}
		});*/
		
		final String message = "Пожар"; // ЗАМЫКАНИЕ - эта переменная участвует в замыкании, т.е. используется анонимным классом в текужем методе. 
		// Эту переменную лучше сразу финализировать, так как она участвует в замыкании , ее менять НЕЛЬЗЯ!
		//Всю конструкцию ананимного класса можно сократить с помощью функционального интерфейса(это интерфейс имеющий один абстрактный метод и все)
		sw.addElecricityListener(
			 s -> System.out.println(message) // s это параметр , так как он один скобки можно опустить, тип параметра не указывается.
		); // Пример ипользования лямбда в классе Person
		
		//sw.addElecricityListener(s->ac.on(s)); можно упростить в случае одинаковых сигнатур
		sw.addElecricityListener(ac::on); // Метод on без скобочек, так как он вызывается не в данный момент, а потом в теле метода switchON
		
		sw.switchOn();
		sw.removeElecricityListener(tv);
		sw.switchOn();
	}

}


