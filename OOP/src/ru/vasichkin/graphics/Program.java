package ru.vasichkin.graphics;


public class Program {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Circle circ = new Circle(10,20,56.8,"yellow");
		circ.draw();
		
		Circle c1;
		c1=circ.clone();
		c1.scale(98.65f);
		Scaleable sc = c1; // ссылка типа интерфейс
		sc.scale(2f);
		Circle c2=(Circle)sc;
		
		//Shape s2 =new Shape();
		//s2=c1;
		
		System.out.println(c1.toString());
		
		Shape.drawscene();
		
		/*//ВАЖНО: Преобразование ссылки , по ссылке родителя доступны только поля и методы родителя, но не дочернего класса
		//Shape s1 =new Shape();
		//s1=c1;
		System.out.printf("Цвет обьекта по ссылке с1 = %s\n", s1.color);
		// Так НЕЛЬЗЯ: s1.x или s1.radius
		
		// Обратное преопразование .Ножно контролировать тип ссылки s1 и использовать проверку;
		if(s1 instanceof Circle) {
			Circle c3=(Circle)s1;
			System.out.println(c3.toString());
		}
		
		Object o = s1;
		*/
		Object o1 = c1;
		int k=10;
		o1=k;//boxing двойное преобразование через обертку
		int k2=(int)o1;//unboxing
		
		// Проявление полиморфизма при вызове метода drawscene вызывается перегруженный метод для каждой фигуры circle или point
		Point pt1=new Point(10,20,"green");
		Point pt2=pt1.clone();
		pt1.color="red";
		
		Shape.drawscene();
		System.out.printf("Колличество фигуг = %d",Shape.scene.size());
		
		/*
		 * любой объект, обозначаемый полиморфным именем, может по-своему реагировать на некий общий набор операций*.
		 * 
		 * 
		 */
		c1.setRadius(78.32f);

	}

}
