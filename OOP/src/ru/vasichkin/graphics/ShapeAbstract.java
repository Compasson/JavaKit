package ru.vasichkin.graphics;

import static java.lang.System.out;

import java.util.ArrayList;


// ����� ��������� ����������� ������,��
// final Shape
// ������� ������������ ������ ��������� ������
// ���������� ������ ����������� �������������� � ����������
public abstract class ShapeAbstract {
	
	public static final String DEFAULT_COLOR="black";
	
	public static ArrayList<ShapeAbstract> scene = new ArrayList<>();
	//drawscene
	
	public static void drawscene() {
		for(ShapeAbstract sh: scene) {
			sh.draw();
		}
	}
	
	public static void scaleScene(double factor) {		

		for(ShapeAbstract s : scene) {
			if(s instanceof Scaleable) {
				Scaleable c = (Scaleable)s;
				c.scale(factor);
			}
		}
		// BAD CODE!!! ����� ����� Interface
		/*for(Shape sh: scene) {
			if(sh instanceof Circle) 
			{	Circle c=(Circle)sh;
				c.scale(factor);
			}	
		}*/
	}
	
	public String color;
	
	public ShapeAbstract() {
		this(DEFAULT_COLOR);
	}
	public ShapeAbstract(String color) {
		this.color=color;
	}
	/*
	 * �������� ����������� ������ ��� ������
	 * ������� ����������� � ���������� ����� �������������� ���� �����
	 * ����� �� ���� �� ������ ����� ����������� �������� ����� abstract!!!
	 */
	public abstract void draw();
		//out.printf("Shape. Color: %s\n",this.color);
}
