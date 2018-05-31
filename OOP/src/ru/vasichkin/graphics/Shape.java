package ru.vasichkin.graphics;

import static java.lang.System.out;


// „тобы запретить наследников классу,то
// final Shape
public class Shape {
	
	public static final String DEFAULT_COLOR="black";
	
	public String color;
	
	public Shape() {
		this(DEFAULT_COLOR);
	}
	public Shape(String color) {
		this.color=color;
	}
	public void draw() {
		out.printf("Shape. Color: %s\n",this.color);
	}
}
