package ru.vasichkin.convert_grad_far;

import java.util.Scanner;

public class Programma {

	public static void main(String[] args) {
		
		// ВИМАНИЕ: работает только по отдельности либо Scanner либо BufferedReader
		int select=0;
		
		if(select==1)
		{
			GradInFarScan s = new GradInFarScan();
			System.out.printf("Test class Scan %s\n",s.convert()); 
		}
		else
		{
			GradInFarBuffer b = new GradInFarBuffer();
			System.out.printf("Test class BufferedReader %s\n",b.convert());
		}
	}

}
