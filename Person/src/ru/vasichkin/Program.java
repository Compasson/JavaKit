package ru.vasichkin;

import ru.vasichkin.staff.Person;

import static java.lang.Math.*;

public class Program {

	public static void main(String[] args) {
		
		double x=2;
		double y=sin(2*PI*log(x)); //����������� ����������� ���� ��� ������ ...Math.*;
		
		/*
		 * ����� � ������ name and age
		 * 
		 * �������� static aray list<Person>
		 * ����� ����������������
		 * ���������������� ���������� �������� � ���������
		 * 
		 * ����������� ����� ������� ����� ���������� ���������
		 * � ��� ������ ������� �������� ����� show
		 * 
		 * ����������� � ����� �����������
		 * 
		 * ����� show ���������� ����
		 * 
		 * 
		 * 
		 * 
		 */
		for(int i=0;i<20;i++) {
			Person p = Person.create("Pasha",i*10);
		}
		Person.showAll();
		
		Singleton s1= Singleton.getIntance();
		Singleton s2= Singleton.getIntance();
		System.out.println(s1.toString());
		System.out.println(s2.toString()); //���������� ������ � ����� ��������� ��� ������ ���� � ��� ��
		

	}

}
