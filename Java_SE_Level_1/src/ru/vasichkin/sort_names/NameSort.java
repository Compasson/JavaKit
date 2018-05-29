package ru.vasichkin.sort_names;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		ArrayList<String> names=new ArrayList<>();
		
		while(true)
		{
			System.out.print("Input Nmae: ");
			String name =sc.nextLine();
			if(name.isEmpty()) break;
			else names.add(name);
		}
		
		sc.close();
		
		Collections.sort(names);
		
		for(String name : names)
			System.out.println(name);
	}

}
