package ru.specialist.vorony;

import java.util.Scanner;
import static java.lang.System.out;

public class Program {

	public static void main(String[] args) {
		out.print("������� �����: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		String v;
		
		int n2 = n % 100;
		if ( n2 >= 11 && n2 <= 14)
			v = "�����";
		else
		{
			switch(n % 10)
			{
				case 1: v = "������"; break;
				case 2:
				case 3:
				case 4: v = "������"; break;
				default:v = "�����";
			
			}
		}
		String r = String.format("�� ����� %d %s", n, v);
		out.println(r);
		
		
		
		

	}

}
