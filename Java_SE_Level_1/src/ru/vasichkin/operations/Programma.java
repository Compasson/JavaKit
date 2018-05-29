package ru.vasichkin.operations;

public class Programma {

	public static void main(String[] args) {
		
		
		//“≈Ќј–Ќџ… опер. ?: -замен€ет if
		int n=0;
		/*
		 * String s;
		 * if(n==0)
		 * 		s="ноль";
		 * else
		 * 		s="не ноль";
		 */
		String s = (n==0)?"ноль":"не ноль";
		
		//Switch (с 7 версии работает со строками)
		int x=2;
		final int y =1;
		switch(x) {
			case -1:  // и -1 и 1 сработают и выведут "один"
			case 1:
				System.out.println("один");
				break;
			case y+1: // y - final (значение вычеслено на этапе компил€ции)
				System.out.println("два");
				break;
			case 3:
				System.out.println("три");
				break;
			default:
				System.out.println("по умалчанию");			
		}
		
		//1) ¬ведите количество ворон на ветке
		
		
			
	}

}
