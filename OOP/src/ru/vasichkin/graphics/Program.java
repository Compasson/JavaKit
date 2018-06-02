package ru.vasichkin.graphics;


public class Program {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Circle circ = new Circle(10,20,56.8,"yellow");
		circ.draw();
		
		Circle c1;
		c1=circ.clone();
		c1.scale(98.65f);
		Scaleable sc = c1; // ������ ���� ���������
		sc.scale(2f);
		Circle c2=(Circle)sc;
		
		//Shape s2 =new Shape();
		//s2=c1;
		
		System.out.println(c1.toString());
		
		Shape.drawscene();
		
		/*//�����: �������������� ������ , �� ������ �������� �������� ������ ���� � ������ ��������, �� �� ��������� ������
		//Shape s1 =new Shape();
		//s1=c1;
		System.out.printf("���� ������� �� ������ �1 = %s\n", s1.color);
		// ��� ������: s1.x ��� s1.radius
		
		// �������� �������������� .����� �������������� ��� ������ s1 � ������������ ��������;
		if(s1 instanceof Circle) {
			Circle c3=(Circle)s1;
			System.out.println(c3.toString());
		}
		
		Object o = s1;
		*/
		Object o1 = c1;
		int k=10;
		o1=k;//boxing ������� �������������� ����� �������
		int k2=(int)o1;//unboxing
		
		// ���������� ������������ ��� ������ ������ drawscene ���������� ������������� ����� ��� ������ ������ circle ��� point
		Point pt1=new Point(10,20,"green");
		Point pt2=pt1.clone();
		pt1.color="red";
		
		Shape.drawscene();
		System.out.printf("����������� ����� = %d",Shape.scene.size());
		
		/*
		 * ����� ������, ������������ ����������� ������, ����� ��-������ ����������� �� ����� ����� ����� ��������*.
		 * 
		 * 
		 */
		c1.setRadius(78.32f);

	}

}
