package ru.vasichkin;

import ru.vasichkin.staff.Person;

public class Program {

	public static void main(String[] args) {
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
