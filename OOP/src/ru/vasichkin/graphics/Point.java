package ru.vasichkin.graphics;

import static java.lang.System.out;

public class Point extends Shape {
//Все наследники не должны повторять поля и методы родителя
// Наследники должны переопределять методы и можно добавлять новые поля
	public int x;
	public int y;
	
	// Конструктор super класса не наследуется
	// Наследуются поля и методы
	public Point(int x,int y) {
		this(x,y,DEFAULT_COLOR);
	}
	
	public Point(int x,int y,String color) {
		//При вызове конструктора подкласса сначала вызывается не явно конструктор родителя (без параметров)
		//В данном случае Shape(). И color инициализируется DEFAULT_COLOR
		//super()
		super(color); //ВАЖНО: ПЕРВЫЙ в теле!!!
		this.x=x;
		this.y=y;
		//this.color=color;
	}
	
	// Одинаковые названия полей делать можно
	// НО, если поле через лямбда выражения ссылается на какойто метод то ставятся ::
	//int moveBy;
	public void moveBy(int dx, int dy) {
		x+=dx;
		y+=dy;
	}
	
	// ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДА ПРЕДКА
	// OWERRIDING
	@Override
	public void draw() {
		//super.draw();
		out.printf("Point (%d, %d) %s\n", x,y,color);
	}
	
	//ПЕРЕОПРЕДЕЛЕНИЕ метода toString() класса Object
	@Override
	public String toString() {
		return String.format("Point (%d, %d) %s", x,y,color);
	}
	
	// метод clone() из класса Object
	// 1) меняем protected на public. Это можжно
	// 2) тип возвращ.знач. Object меняем на Point
	// 3) throws CloneNotSupportedException для дочернего класса Exceptions можно уменьшать вплодь до нуля
	@Override
	public Point clone() {
		
		return new Point(this.x,this.y,this.color);
	}
}
