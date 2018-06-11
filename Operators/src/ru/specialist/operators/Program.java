package ru.specialist.operators;

import static java.lang.System.out;

public class Program {

	public static void main(String[] args) {
		int n = -10;
		
		if ( n > 0 ) 
		{
			out.println("n больше нуля");
			out.println("n > 0");
		}
		else 
		{
			if (n > -100)
				out.println("n > -100");
			else
			{
				out.println("n НЕ больше нуля");
				out.println("n <= 0");
			}
		}
		
		
		n = 0;
		/*
		String s;
		if (n == 0)
			s = "ноль";
		else
			s = "не ноль";
		*/
		
		String s = (n == 0) ? "ноль" : ( n > 0 ? "+" : "-"); 
		
		n = 0;
		final int a = 1;
		
		switch (n)
		{
			case 0: 
			case a:
				out.println("один");
				break; // return
			case a+1:
				out.println("два");
				break;
			case 3:
				out.println("три");
				break;
			default:
				out.println("много");
		}
		
		// На ветке 5 ворон
		
		
		
		
		
		
		
		
		
		
		
			
		

	}

}
