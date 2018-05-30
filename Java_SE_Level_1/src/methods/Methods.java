package methods;

import static java.lang.System.out; //Упрощает вывод


public class Methods {
	
	// Наибольший общий делитель
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
		//out.printf("Привет!\n");
		sayHello("Незнакомец");
		return 1;
	}
	public static void sayHello(String name)
	{
		out.printf("Привет, %s!\n", name);
	}
	
	public static void sayHello(String name, int age)
	{
		out.printf("Привет, %s - %d!\n", name, age);
		//return;
	}
	
	// Инкрементируется копия так как тип данных явный
	public static void test1(int a) {
		a++;
		out.printf("test 1 a = %d\n",a);
	}
	
	// Инкрементируется значение передаваемой ссылки
	public static void test2(int[] a) {
		a[0]++;
		out.printf("test 2 a[0]= %d\n", a[0]);
	}
	
	// В случае строки: Изменяется копия передаваемой ссылки
	public static void test3(String a) {
		a+="!";
		out.printf("test 3 a = %s\n", a);
	}
	
	// Для изменения строк используем StringBuilder
	public static void test4(StringBuilder a) {
		a.append("!");
		out.printf("test 4 a = %s\n", a);
	}
	
	public static void main(String[] args) {
		
		{	// test OK
			int[] a= {10};
			test2(a);
			out.printf("main 2 a[0] = %d\n", a[0]);
		}
		{	// test falure
			int a =10;
			test1(a);
			out.printf("main 1 a= %d\n",a);
		}
		{	// test falure
			String a ="Masha";
			test3(a);
			out.printf("main 3 a= %s\n", a);
		}
		{	// test OK
			StringBuilder a = new StringBuilder("Pasha");
			test4(a);
			out.printf("main 4 a = %s\n", a);
		}
		
		//Program p = new Program();
		//p.sayHello();
		//Program.sayHello();
		sayHello("Сергей", 39);
		sayHello("Наталия", 34);
		sayHello("Костя");
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
