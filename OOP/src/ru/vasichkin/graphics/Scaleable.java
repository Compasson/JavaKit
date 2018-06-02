package ru.vasichkin.graphics;

/*
 * ДЗ
 * 	сделать интерфейс move by
 * 		метод moveby
 * 		
 * В Shape static method tranferscen
 * 			перебирает	все обьеты в сене
 * 			проверяет реализует ли обьект интерфейс moveby	
 *  		если да то смешает методом moveby
 */

public interface Scaleable {
	
	//Интерфейс это особый тип данных 
	
	//Полей НЕТ
	//Константу можно
	static final double pi=Math.PI;
	
	static final double DEFAULT_FACTOR=2;
	
	//Методы автоматом public abstract
	void scale(double factor);
	
	// В Java 8 появилась default реализация в методе интерфейса
	/**
	 * @since Java 1.8
	 */
	default void scale() {
		scale(DEFAULT_FACTOR);
	}
	
	/**
	 * @since Jva 1.9
	 */
	// private методы помогают разбить большие default методы
	/*private void scaleInner() {
		scale(DEFAULT_FACTOR);
		//...
		//...
	}*/
}

//Интерфейсы могут наследоваться друг от друга
interface Scaleable3D extends Scaleable{
	void scale3D(double fx, double fy, double fz);
}