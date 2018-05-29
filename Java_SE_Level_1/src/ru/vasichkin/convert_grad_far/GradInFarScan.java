package ru.vasichkin.convert_grad_far;

import java.io.IOException;	
import java.util.Scanner;

// Scanner хорошо работает с числами
public class GradInFarScan {
		
	//private Scanner sc = new Scanner(System.in); c
	// ѕочему сканер не работает
	public String convert() throws NumberFormatException
	{
		double grad=0,far=0;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input temp in grad: ");

		grad=sc.nextDouble(); // ¬вод числа через зап€тую
		sc.close();

		far=grad*5/9+(double)32;
		str=String.format("T-Grad = %.3f   T-Far = %.3f", grad,far);
		return str;
	}
}
