package ru.specialist.vars;
//import java.lang.*;

import java.util.Date;

import static java.lang.System.out;

//import static java.lang.Math.sin;

import static java.lang.Math.*;


public class Program {
	
	public static final double PI = 3.1415;

	// const
	// goto
	

	public static int counter;
	
	String color;

	
	public static void main(String[] args) {
		{
		//java.util.Date
		//Date d;
		
		//Program.PI
		//Math.PI
		
		//sin(log( Math.PI*x ));
		
		
		{
			final int k = 100;
			System.out.println( k );
		}
		{
			String k = "abc";
			System.out.println( k );
		}
		
		for(int k = 1; k <= 10; k++) {
			System.out.println( k );
		}
		
		//System.out.println( k );
		
		
		
		
		int c;
		char ch = '\u002F';
		out.println( ch );
		String s = null;
		
		//Math.pow
		
		
		java.lang.System.out.println( counter ); // 0
		
		//String userName;
		//userName 
		String userName = "Ñåðãåé";
		int a = 20,b;
		
		b = 31;
		
		long l = 100L;
		
		
		long x = Integer.MAX_VALUE + 1L;
		System.out.println( x );
		
		
		double dx = 2d;
		dx = 2e-3;
		float f = 2.5F;
		
		x = 0x1F;
		
		System.out.println( x );
		
		int y = 100;
		long h = y;
		h = Long.MAX_VALUE;
		int z = (int)h;
		
		// 0111 7
		// 1001 -7
		// 0001 1
		// 1111 -1
		// 0110 6
		// 1010
		
		// 1000 -8
		
		
		
		// 
		// 0101 +5
		// 1011 -5
		// 0000
		
		
		System.out.println( h );
		System.out.println( z );
		
		int q = 5;
		
		System.out.println( ~q );
		
		
		
		// int a;
		// int b;
		
		
		counter = 10 + 1 + a;
		
		
		
		System.out.println( counter );
		
		//counter = counter / 2;
		counter /= 2;
		// + - * / %
		
		int r1 = 5;
		int r2 = 2; 
		
		// 1+2*3
		double u = (double)r1 / r2;
		
		System.out.println( u );
		
		
		
		
		double d = counter;
		
		
		System.out.println( counter );
		
		int Int; // bad
		}
		{
			int a;
			int b = (a = 5);
			
			
		}
		
		{
			int a = 10;
			// a = a + 1;
			//a += 1;
			int b = ++a + a++;
			//       11 + 11
			System.out.printf("a = %d\nb = %d\n", a, b);
		}
		{
			boolean a = true;
			boolean b = false;
			
			// ËÎÃÈ×ÅÑÊÎÅ È
			boolean c = a && b;
			
			// ËÎÃÈ×ÅÑÊÎÅ ÈËÈ
			c = a || b;
			
			// ËÎÃÈ×ÅÑÊÎÅ ÍÅ
			c = !a;
			
			c = !a && !b; // !(a || b)
			
			c = a || !b;
			
			
			System.out.println(c);
		}
		{
			int n = 101;
			
			boolean r = (n / 2) != (n - 5);
			// ==  !=  >  <   >=  <=
			
			
			r = (n >= 0) && (n <= 100);
			System.out.println(r);
		}
		{
			
			int a = 5; // 0101
			int b = 7; // 0111
			
			int c = a & b; //  0101 
			
			c = a | b; // 0111
			c = ~a;
			
			// XOR
			c =  a ^ b; // 0010
			// a ^ b ^ b == a 
			
			out.println(c);
			out.printf("a = %d\nb = %d\n", a,b);
			a ^= b;
			b ^= a;
			a ^= b;
			
			/*c = a;
			a = b;
			b = c;*/
			out.printf("a = %d\nb = %d\n", a,b);
			
			c = a << 2; // 011100
			out.println(c);
			a = -7;
			c = a >> 2; // 0001
			out.println(c);
			
			a = -7;
			c = a >>> 2; // 0001
			out.println(c);
			
		}
		
		
		

	}

}
