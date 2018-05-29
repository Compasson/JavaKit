package ru.vasichkin.massiv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection; //Это интрерфейс
import java.util.Collections;//Это класс


public class massiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Различие переменной и переменной ссылочного типа:
		int k=10;
		int l=k;
		k++;
		System.out.printf("%d %d\n", k,l); // Равны
		
		int[] r= {10};
		int[] t=r; // В переменную ссылочного типа копируется ссылка r
		int[] v=r.clone();
		r[0]++;
		System.out.printf("%d %d clone=%d\n",r[0],t[0],v[0]); // НЕ РАВНО
		
		// int[] nums = new int[3]; инициализируется нулями
		int[] nums = {10,20,0};
		
		String[] s = new String[10]; // Не инициализированный массив, только ссылки
		
		String[] names =
			{"Sergey","Natali","Sasha","Kostya"};
		
		// Сортировка массива
		Arrays.sort(names);
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]);
		
		int[][] matrix = {
				{1,4,7},
				{4,9},
				{90,2,123,5}
		};
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
				System.out.printf("%5d",matrix[i][j]);
			System.out.println();
		}
		
		//Generics это класс(ArrayList) который можно типизировать
		// Generics можно типизировать ТОЛЬКО ссылочными типами
		ArrayList<String> person = new ArrayList<>();
		System.out.println(person.size());
		person.add("Olga");
		person.add("Alek");
		person.add("July");
		person.add("Bob");
		
		person.remove(2);
		person.set(1, "Sonya");
		
		
		Collections.sort(person);
		// Итераторов может быть несколько считывающих и один записывающий
		/*Iterator<String> iter = person.iterator();
		while(iter.hasNext())
		{
			String p=iter.next();
			System.out.println(p);
		}*/
		for(String p:person) // Это цикл while с итератором
			System.out.println(p);
		

		//for(int i=0;i<person.size();i++)
			//System.out.println(person.get(i));
		
		
		//ДЗ Пользователь вводит имена до тех пор пока не введет пустую
		// строку. Отсортировать и вывести.
	}

}
