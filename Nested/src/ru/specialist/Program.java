package ru.specialist;

public class Program {

	public static void main(String[] args) {
		Outer o = new Outer(10);
		Outer.Nested n = new Outer.Nested(); //�������� ������ � ������� ��������� ������
		n.increment(o); //����� ������ ������������ ���������� ������
		
		System.out.println(o.getData());
		
		Outer.Inner  i = o.new Inner(); // o.new Inner() ������������ ������ ������� � ������� �������� ������
		i.increment();
		
		System.out.println(o.getData());
		

	}

}
