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

	}

}
