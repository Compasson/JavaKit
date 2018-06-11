package ru.specialist.iterations;

import static java.lang.System.out;

import java.util.Random;


public class Program {

	public static void main(String[] args) {
		
		Random r = new Random();
		int x = r.nextInt(100)+1;
		out.println(x);
		
		
		for(int i=1; i <= 10; i++) {
			if (i == 3) continue;
			if (i == 8) break;
			
			out.println(i);
		}
		
		// 1 2 3 4 ... 10
		// 2 4 6 8 ....20
		metka:
		for(int i=1; i <=10; i++)
		{
			for(int j=1; j <=10; j++)
			{
				if (j == 5) 
					break metka;
						
				out.printf("%-4d", i*j);
			}
			
			out.println();
			
		}
		
		out.println("продолжение");
		
		
		int a = 2000;
		while ( a < 1000 )
		{
			out.println(a);
			a *= 2; // a = a*2
		}
		
		a = 2;
		do
		{
			out.println(a);
			//a *= 2; // a = a*2
		}
		while ( (a*=2) < 1000);
		
		// 0 1 1 2 3 5 8 13
		
		int n1 = 0;
		int n2 = 1;
		
		out.println(n1);
		out.println(n2);
		int counter = 2;
		int n;
		
		//for( ;(n = n1 + n2) < 1000; )
		while ( (n = n1 + n2) < 1000 )
		{
			out.println(n);
			counter++;
			n1 = n2;
			n2 = n;
		}
		
		out.printf("Всего чисел < 1000: %d\n", counter);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
