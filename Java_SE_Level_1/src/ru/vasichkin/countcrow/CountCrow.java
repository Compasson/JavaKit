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
			v="�����";
		else {
			int n1=n%10;
			switch(n) {
			case 1:
				v="������";
				break;
			case 2:
			case 3:
			case 4:
				v="������";
				break;
			default:
				v="�����";
				break;
			}
		}
		System.out.printf("�� ����� ����� %d %s\n",n,v);
		
	}

}
