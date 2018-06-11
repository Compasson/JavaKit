package ru.specialist.names;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.out;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		
		while(true)
		{
			out.print("Èìÿ: ");
			String name = sc.nextLine();
			if (name.isEmpty())
				break;
			else
				names.add(name);
		}
		sc.close();
		
		Collections.sort(names);
		
		for(String name : names)
			out.println(name);

	}

}
