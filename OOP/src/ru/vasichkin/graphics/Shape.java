package ru.vasichkin.graphics;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;


// ����� ��������� ����������� ������,��
// final Shape
public  abstract class Shape {
	
	/*
	 *   Access	Level	Modidier	Visibility
	 *   public			public		word
	 *   private		private		this class only
	 *   package					thith package only (���� ��� ������������)
	 *   protect		protect		this package +subclass(������ �� ����� ������ ��  �����������)
	 */
	
	public static final String DEFAULT_COLOR="black";
	
	// ����� ������� List -��������� ��� �� ����� ����� ����������� �������� ��� ���������.
	//public static List<Shape> scene = new LinkedList<>();
	public static List<Shape> scene = new ArrayList<>();
	//drawscene
	
	public static void drawscene() {
		for(Shape sh: scene) {
			sh.draw();
		}
	}
	
	public static void transferScene(int dx, int dy) {
		for(Shape s: scene){
			if(s instanceof Moveable) {
				Moveable m =(Moveable)s;
				m.moveBy(dx, dy);
			}
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
	/*public static Shape create(String color) {
		Shape sh = new Shape(color);
		scene.add(sh);
		return sh;
	}*/
}
