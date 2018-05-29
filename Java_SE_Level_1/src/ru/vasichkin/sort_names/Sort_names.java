package ru.vasichkin.sort_names;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Sort_names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<String> names = new LinkedList<>();
		String s="0"; // Вынужденная мера
		while(!s.equals("1"))
		{	System.out.println("Input Name: ");
			sc.nextLine();
			names.add(s);
		}
		sc.close();
		Collections.sort(names);
		for(String n: names)
			System.out.println(n);
		
		/* Другой вариант
		 do
		{	System.out.println("Input Name: ");
		    s=sc.nextLine();
			names.add(s);
		} while(s!="");
		sc.close();
		Collections.sort(names);
		for(String n: names)
			System.out.println(n);
		 */
	}

}
