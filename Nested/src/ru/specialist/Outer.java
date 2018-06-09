package ru.specialist;
/*
 * 		�������� ������(nested):
 * 				
 * 			1 - ������� ����������� �����(nested), ��� ������� ������ ���
 * 				(inner) ����������(��� static), ��� ������� ������ ���					
 * 				��������� ����, ��� ������� ������ ��� 
 * 				��������� ����
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
