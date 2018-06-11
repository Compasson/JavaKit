package ru.specialist;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		/*int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;*/
		//int[] nums = new int[]{ 100, 200, 0};
		int[] nums = { 100, 200, 0};
		
		out.println(nums.length);
		
		for(int i=0; i < nums.length; i++)
			out.println(nums[i]);
		
		//out.println(nums[0]); // 100
		//out.println(nums[1]); // 200
		//out.println(nums[2]); // 0
		
		String s = "abc";
		//s.isEmpty()
		
		String[] names = new String[] 
				{ "Сергей", "Наталия", "Костя", "Саша"};
		
		for(int i=0; i < names.length; i++)
			out.println(names[i]);
		
		Arrays.sort(names);

		//for(int i=0; i < names.length; i++)
		//	out.println(names[i]);
		for(String n : names)
			out.println(n);
		
		int[][] matrix = new int[][]
		{
			new int[] {1,2,3},
			new int[] {4,6}	
		};
		
		out.println(matrix.length);
		for(int i=0; i < matrix.length; i++)
		{
			for(int j=0; j < matrix[i].length; j++)
				out.printf("%-3d", matrix[i][j]);
			
			out.println();
			
		}
		
		ArrayList<String> person = new ArrayList<String>();
		//Collection<String> person = new ArrayList<String>();
		
		int k = 5;
		Integer k1 = k;
		Integer k3 = k;
		Integer k4 = k1 + k3;
		
		int k2 = k1;
		
		out.println( person.size() );
		person.add( "Сергей" );
		person.add( "Наталия" );
		person.add( "Даша" );
		person.add( "Глаша" );
		
		//person.set(2, "Костя");
		person.remove("Глаша");
		
		//person.clear();
		//person.isEmpty()
		//person.contains("Сергей")
		//person.toArray()
		//Arrays.asList(nums)
		
		// names = (String[])person.toArray();
		
		out.println( person.size() );
		
		
		/*Iterator<String> iter = person.iterator();
		while (iter.hasNext())
		{
			String p = iter.next();
			out.println(p);
		}*/
		
		
		
		//ArrayList<String> person = new ArrayList<String>();
		Collections.sort(person);
		
		for(String p : person)
			out.println(p);
		//for(int i=0; i < person.size(); i++)
		//	out.println( person.get(i) );
	}

}
