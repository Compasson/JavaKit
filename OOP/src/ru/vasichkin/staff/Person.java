package ru.vasichkin.staff;

// � ����� ����� ����� ���� ������ ���� ��������� ����� � ����� �� ��������� ��� � �����

public class Person {
	
	public String name;
	public int age;
	
	// ����������� ���� ���� ��� ���� �������� ������
	// ����������� ���� �������� �������� ����� �������� NameClass.class
	public static int counter=0;
	
	//����������� ���� �������������.
	// ����������� ���� ���!
	static {
		counter=0;
		//....
	}
	
	// ����������� ����� - ��� ������� ��� ������.
	// � ������������ ������ ���: this , name, age
	// �� ���� ������ � counter
	public static void showTotal() {
		System.out.printf("Total person: %d\n",Person.counter);
	}
	
	public Person() {
		this("Unknown");
	}

	public Person(String name) {
		this(name,20); //����� ������������ ������ ���� � ������
		// some code
		//System.out.println("....");
	}
	// ����� ������ ����������: new
	public Person(String name, int age) {
		//this ��� ������ �� ��� ������ ��� ����� ������
		//this ����� ������ ������!!!
		this.name=name;
		this.age=age;
		this.show();
		//��� ������ show();
		//Person.counter++;
		counter++;
	}
	
	public void show(){
		System.out.printf("%s - %d\n",this.name,this.age);
	}
}