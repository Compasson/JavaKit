package ru.specialist.operators;

import static java.lang.System.out;

public class Program {

	public static void main(String[] args) {
		int n = -10;
		
		if ( n > 0 ) 
		{
			out.println("n ������ ����");
			out.println("n > 0");
		}
		else 
		{
			if (n > -100)
				out.println("n > -100");
			else
			{
				out.println("n �� ������ ����");
				out.println("n <= 0");
			}
		}
		
		
		n = 0;
		/*
		String s;
		if (n == 0)
			s = "����";
		else
			s = "�� ����";
		*/
		
		String s = (n == 0) ? "����" : ( n > 0 ? "+" : "-"); 
		
		n = 0;
		final int a = 1;
		
		switch (n)
		{
			case 0: 
			case a:
				out.println("����");
				break; // return
			case a+1:
				out.println("���");
				break;
			case 3:
				out.println("���");
				break;
			default:
				out.println("�����");
		}
		
		// �� ����� 5 �����
		
		
		
		
		
		
		
		
		
		
		
			
		

	}

}
