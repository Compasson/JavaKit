package ru.specialist.methods;

import static java.lang.System.out;


public class Program {
	
	public static int GCD(int a, int b)
	{
		int k;
		while ( (k = a % b) != 0)
		{
			a = b;
			b = k;
		}
		return b;
	}
	
	
	public static double average(int... m)
	{
		int summa = 0;
		for(int k : m)
			summa += k;
		
		return (double)summa / m.length;
		
	}
	
	public static double average(int a, int b)
	{
		double avg = (a+b) / 2d;
		return avg;
	}
	
	public static int sayHello()
	{
		//out.printf("������!\n");
		sayHello("����������");
		return 1;
	}
	public static void sayHello(String name)
	{
		out.printf("������, %s!\n", name);
	}
	
	public static void sayHello(String name, int age)
	{
		out.printf("������, %s - %d!\n", name, age);
		//return;
	}

	public static void main(String[] args) {
		//Program p = new Program();
		//p.sayHello();
		//Program.sayHello();
		sayHello("������", 39);
		sayHello("�������", 34);
		sayHello("�����");
		sayHello();
		
		
		double x = average(10, 11);
		out.println(x);
		
		//out.printf
		
		out.println( average(10, 11) );
		
		out.println( average( new int[] {10, 11, 12, 13}) );
		out.println( average( 10, 11, 12, 13, 15 ) );
		
		out.println( GCD( 1071, 462) );
		out.println( GCD( 462, 1071) );
		
		

	}

}
