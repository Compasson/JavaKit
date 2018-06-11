package ru.specialist.vorony;

import java.util.Scanner;
import static java.lang.System.out;

public class Program {

	public static void main(String[] args) {
		out.print("Сколько ворон: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		String v;
		
		int n2 = n % 100;
		if ( n2 >= 11 && n2 <= 14)
			v = "ворон";
		else
		{
			switch(n % 10)
			{
				case 1: v = "ворона"; break;
				case 2:
				case 3:
				case 4: v = "вороны"; break;
				default:v = "ворон";
			
			}
		}
		String r = String.format("На ветке %d %s", n, v);
		out.println(r);
		
		
		
		

	}

}
