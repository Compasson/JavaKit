package ru.vasichkin.countcrow;

import java.util.Scanner;

public class CountCrow {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Input numb crow: ");
		int n=sc.nextInt();
		
		String v;

		int n2=n%100;
		
		if (n2>=11 && n2<=14)
			v="ворон";
		else {
			int n1=n%10;
			switch(n) {
			case 1:
				v="ворона";
				break;
			case 2:
			case 3:
			case 4:
				v="вороны";
				break;
			default:
				v="ворон";
				break;
			}
		}
		System.out.printf("Ќа ветке сидит %d %s\n",n,v);
		
	}

}
