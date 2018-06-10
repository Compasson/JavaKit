package ru.specialist;

import java.util.Comparator;

/*
 * 		�������� ������(nested):
 * 				
 * 			1 - ������� ����������� �����(nested), ��� ������� ������ ���
 * 				(inner) ����������(��� static), ��� ������� ������ ���					
 * 				��������� ����(������ ������ �������� ������), ��� ������� ������ ��� 
 * 				��������� ����(��� ����� ��� ����� � ��������� ������ ������������� �������)
 * 
 * 
 * 		����� ����� ��������� �������(������ � ������� Invoice ����� Spesialist 5_2):
 * 
 * 					������ �������� ��������:
 * 						� �������(���������), ���� ��� ������������� ����� ������� �������� ��
 * 							��������� ���� ��������� ������� � ��� ��������� �������� ���� ������ ����������
 * 							��������� �������� ������� � ����� ������ � ������� �� ��������� ������
 * 						
 * 						���������� ����� ����� ������ ��� ��������
 */
interface Increment
{
	void increment();
}

public class Outer {
	
	public static class Nested { //������� ������� ������������ ��������� ������
		public void increment(Outer o) {
			o.data++; // ��������� ������� ����� ������ �� ��� ������ � ������� �������� ������
		}
	}
	
	public class Inner{ 			//������� �������� ����� ��������� ���������� ������, �� �� �������� ������������
		public void increment() {	//������ ������ Inner ������ ������ ���� ���������� � ������� �������� ������.
								//������ ���� ������ �������� ������ ����� ����������� ��������� �������� Inner ������
			System.out.println(Outer.this);
			data++; // ������ ������ � ���� �������� ������, � �������� ���������� ������ ������ ����������� ������
		}
	}
	
	
	public Comparator<Integer> getComparator(){
		// ��������� ����� ������ ������. ����� ������� ������ �� ������ ���������� ������, ���������� ���������, ������� ��������� ���� ��������� �����
		/*class MyComparator implements Comparator<Integer>{ //Comparator ���������� 2 ��������� , � Comparable ���������� this � ����������
			@Override
			public int compare(Integer x, Integer y) {
				return x-y;
			}		
		}
		Comparator<Integer> mc = new MyComparator();*/
		
		// ��������� ����� (� java 8 � ������� ����� ��������� ����� ��������� ��� ��� ����������)
		Comparator<Integer> mc = new  Comparator<Integer>(){ // ����� ��������� ������ ����������� ������ � ����������� �����
			public int compare(Integer x, Integer y) {
				return x-y;
			}		
		};
		return mc;
	}

	public boolean isGreater(int x) {	
		return getComparator().compare(data, x) > 0;
	}
	
	
	
	private int data;
	

	public Outer(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		
		
		Inner i = new Inner(); //������� ����� ����� ��������� ������� ����������� ������
		i.increment();
		
		/*
		class Local implements Increment
		{
			public void increment()
			{
				data++;
			}
			
		}
		Increment l = new Local();
		*/
		Increment l = new Increment()
		{
			public void increment()
			{
				data++;
			}
			
		};
		
		
		l.increment();
		
		
		return data;
	}
	

}
