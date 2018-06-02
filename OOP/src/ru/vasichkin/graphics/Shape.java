package ru.vasichkin.graphics;

import static java.lang.System.out;

import java.util.ArrayList;


// ����� ��������� ����������� ������,��
// final Shape
public class Shape {
	
	/*
	 *   Access	Level	Modidier	Visibility
	 *   public			public		word
	 *   private		private		this class only
	 *   package					thith package only (���� ��� ������������)
	 *   protect		protect		this package +subclass(������ �� ����� ������ ��  �����������)
	 */
	
	public static final String DEFAULT_COLOR="black";
	
	public static ArrayList<Shape> scene = new ArrayList<>();
	//drawscene
	
	public static void drawscene() {
		for(Shape sh: scene) {
			sh.draw();
		}
	}
	
	public String color;
	
	public Shape() {
		this(DEFAULT_COLOR);
	}
	public Shape(String color) {
		this.color=color;
		scene.add(this);//������ BAD
	}
	public void draw() {
		out.printf("Shape. Color: %s\n",this.color);
	}
	public static Shape create(String color) {
		Shape sh = new Shape(color);
		scene.add(sh);
		return sh;
	}
}
