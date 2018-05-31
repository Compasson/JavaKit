package ru.vasichkin.graphics;

import static java.lang.System.out;

public class Point extends Shape {
//��� ���������� �� ������ ��������� ���� � ������ ��������
// ���������� ������ �������������� ������ � ����� ��������� ����� ����
	public int x;
	public int y;
	
	// ����������� super ������ �� �����������
	// ����������� ���� � ������
	public Point(int x,int y) {
		this(x,y,DEFAULT_COLOR);
	}
	
	public Point(int x,int y,String color) {
		//��� ������ ������������ ��������� ������� ���������� �� ���� ����������� �������� (��� ����������)
		//� ������ ������ Shape(). � color ���������������� DEFAULT_COLOR
		//super()
		super(color); //�����: ������ � ����!!!
		this.x=x;
		this.y=y;
		//this.color=color;
	}
	
	// ���������� �������� ����� ������ �����
	// ��, ���� ���� ����� ������ ��������� ��������� �� ������� ����� �� �������� ::
	//int moveBy;
	public void moveBy(int dx, int dy) {
		x+=dx;
		y+=dy;
	}
	
	// ��������������� ������ ������
	// OWERRIDING
	@Override
	public void draw() {
		//super.draw();
		out.printf("Point (%d, %d) %s\n", x,y,color);
	}
	
	//��������������� ������ toString() ������ Object
	@Override
	public String toString() {
		return String.format("Point (%d, %d) %s", x,y,color);
	}
	
	// ����� clone() �� ������ Object
	// 1) ������ protected �� public. ��� ������
	// 2) ��� �������.����. Object ������ �� Point
	// 3) throws CloneNotSupportedException ��� ��������� ������ Exceptions ����� ��������� ������ �� ����
	@Override
	public Point clone() {
		
		return new Point(this.x,this.y,this.color);
	}
}
