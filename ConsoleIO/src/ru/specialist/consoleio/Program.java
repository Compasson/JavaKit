package ru.specialist.consoleio;

import java.util.Date;

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
*/
import java.util.Scanner;



public class Program {

	public static void main(String[] args)
		//throws IOException
	{
		//System.out.print("������");
		//System.out.println("������");
		// Stream
		/*
		System.out.print("���: ");
		BufferedReader reader = 
				new BufferedReader ( new InputStreamReader(System.in) );
		
		String name = reader.readLine();
		
		System.out.print("�������: ");
		String s = reader.readLine();
		
		int age = Integer.parseInt(s);
		// Double.parseDouble(s)
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���: ");
		String name = sc.nextLine();
		System.out.print("�������: ");
		int age = sc.nextInt();
		
		sc.close();
		
		// tc*9/5+32
		
		// ������, ������ - 39!
		
		
		String r = String.format("������, %2$-20s - 0x%1$x!\n", age, name);
		System.out.print(r);
		
		
		//System.out.printf("������, %s - %d!\n", name, age);
		
		System.out.printf("PI = %20.2f\n", Math.PI);
		
		Date now = new Date();
		
		System.out.printf("������: %1$tY-%1$tm-%1$td\n", now);
		System.out.printf("������: %tY-%<tm-%<td\n", now);
		
		
		
		
		
		
		

	}

}
