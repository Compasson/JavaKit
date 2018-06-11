package ru.specialist.temperature;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;


public class Program {

	public static void main(String[] args) throws IOException {
		//new Locale("RU", "RU")
		Locale.setDefault( Locale.US);
		//Locale.setDefault( new Locale("RU", "RU") );
		
		// ВВОД ДАННЫХ
		out.print("Температура (C): ");
		/*
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		double tc = Double.parseDouble(reader.readLine());
		*/
		Scanner sc = new Scanner(System.in);
		double tc = sc.nextDouble();
		
		
		// ОБРАБОТКА ДАННЫХ
		double tf = tc*9/5+32;
		
		// ВЫВОД ДАННЫХ
		out.printf("Температура (F): %.2f\n", tf);

	}

}
