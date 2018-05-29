package ru.vasichkin.example_string;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "\ta\n\"b\u054Fc\\"; // ������� ������� ������ ���������
		System.out.println(s);
		
		String hello = "Hello";
		String name = "Pasha";
		String r = hello + "  " + name + "!";
		
		System.out.println("r");
		System.out.println(r.length());
		System.out.println(r.charAt(0));
		System.out.println(r.charAt(r.length()-1));
		System.out.println(r.contains("Pasha"));
		System.out.println(r.indexOf("Pasha"));
		
		System.out.println(r.toUpperCase());
		System.out.println(r);
		
		System.out.println(r.trim()); // ������� ������� � ������ � � ����� �����
		System.out.println(r.replace("Pasha","Aleksandr"));
		
		// �������� ������ ��� ������ �� ��������
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<=100; i++)
		{
			sb.append(i).append(" ");
		}
		String q=sb.toString();
		
		System.out.println(q);
		
		// ��������� �����
		Scanner sc = new Scanner(System.in);
		String s1="Sergey";
		String s2="Sergey"; // �������� ��������� ������� ���� ��������� ������� Sergey ��� s1 � s2.  ����� �������� �� ���� ������
		System.out.println(s1==s2); // ��������� ������, � ������ ������ ��� ��� ��������� �� ���� � ��� �� ������
		System.out.println("Input: Sergey");
		s2=sc.nextLine();
		System.out.println(s1==s2); // �� ����� �����
		System.out.println(s1.equals(s2)); //��������� �������� �����
	}

}
