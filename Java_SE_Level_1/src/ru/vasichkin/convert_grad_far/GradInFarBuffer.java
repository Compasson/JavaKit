package ru.vasichkin.convert_grad_far;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BufferedReader хорошо работать со стоками
public class GradInFarBuffer {
	
	private BufferedReader reader=
			new BufferedReader(new InputStreamReader(System.in)); //Поток System.in
	
	public String convert()
	{
		double grad=0,far;
		String str;
		System.out.println("Input Grad");
		try
		{
			grad=Double.parseDouble(reader.readLine()); 
			reader.close();
		}catch(IOException ex)
		{
			System.out.println("ex");
		}
		far=grad*5/9+(double)32;
		str=String.format("T-Grad = %.3f   T-Far = %.3f", grad,far);
		return str;
	}
}
