package ru.vasichkin.formstring;

import java.util.Date;

public class FormatStringIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test"); // java.lang; out - ссылка для потока на обькт класса PrintString

		// Форматированнный вывод
		String name = "Сергей";
		int age = 40;
		System.out.printf("Привет %s, %d", name, age);

		// Класс Format
		String result = String.format("Привет, %s - %d\n", name, age);

		System.out.println(result);

		System.out.printf("pi = %10.4f\n", Math.PI);

		System.out.printf("%20sEND\n", name);
		System.out.println();
		System.out.printf("%-20sEND\n", name);

		Date now = new Date();
		System.out.printf("%tm\n", now);
		System.out.printf("%tN\n", now);
		System.out.printf("%tY-%tm-%tc\n", now, now, now);

		System.out.printf("%td\n", now);// день 1-31
		System.out.printf("%te\n", now);// день 01-31

		System.out.printf("%1$te-%1$-10tm-%1$tY\n", now); // %1 1-указывает на первый елемент (now)
		System.out.printf("%tA-%<te-%<tB-%<20tY-END\n", now);

		System.out.printf("%tF\n", now);
	}
}
