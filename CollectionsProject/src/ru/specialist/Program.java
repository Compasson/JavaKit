package ru.specialist;

import java.util.*;
import java.io.*;

class Test
{
	private String data;

	public Test(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}
	@Override
	public String toString() {
		return data;
	}
	
	@Override
	public boolean equals(Object obj) {
		return data.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return data.hashCode();
		//return 1; // BAD
	}

}

public class Program
{

	public static void savePersons(Map<String, Integer> p) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("person.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
	}
	
	public static Map<String, Integer> loadPersons()  throws IOException, 
		ClassNotFoundException
	{
		
		FileInputStream fis = new FileInputStream("person.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Map<String, Integer> p = (Map<String, Integer>)ois.readObject();
		
		ois.close();
		
		return p;
	}
	
	public static boolean testString(String s)
	{
		System.out.printf("%s : ",s);
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (ch == '(' || ch=='[')
				st.push(ch);
			if (ch == ')' || ch==']')
			{
				char p = st.pop();
				if ( !((p=='(' && ch==')') || (p=='[' && ch==']')) )
					return false;
			}
		}
		
		return st.size() == 0;
		
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		//System.out.println(testString("([sdaf])adsfjk(sd)[()as()](sdf)"));
		
		
		
		
		Map<String, Integer> persons = 
				new Hashtable<String, Integer>();
		
		persons.put("Сергей", 35);
		persons.put("Наталия", 30);
		persons.put("Костя", 6);
		persons.put("Саша", 3);
		
		String name = "Костя";
		if (persons.containsKey(name))
		{
			int age = persons.get(name);
			System.out.printf("%s - %d\n", name, age);
		}
		
		Set<Test> set = new HashSet<Test>();
		set.add(new Test("one"));
		set.add(new Test("two"));
		
		Map<Test, String> test = new Hashtable<>();
		Test t1 = new Test("one");
		Test t2 = new Test("two");
		
		test.put(t1, "один");
		test.put(t2, "два");
		
		System.out.println(test.get(t2));
		
		
		//System.out.println(set.size());
		
		
		
		
		
		
		/*
		savePersons(persons);
		persons = null;
		
		persons = loadPersons();
		
		for(Map.Entry<String, Integer> p : persons.entrySet())
			System.out.printf("%s - %d\n", p.getKey(), p.getValue());
		*/

	}

}
